package ru.job4j.bank;

import ru.job4j.collection.Order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского счета.
 *
 * @author NN
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение объектов User и Account осуществляется в карте HashMap.
     * У одного User может быть несколько Account.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает объект user, добавляет объект в карту если его там нет.
     * @param user пользователь которого добавляют.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает данные паспорта и account, добавляет account, если user с таким паспортом существует
     * и если account не найден в коллекции List.
     * @param passport данные паспорта по которым производится поиск user.
     * @param account account который создается.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод принимает данные паспорта и производит поиск user.
     * @param passport данные паспорта по которым производится поиск пользователя.
     * @return возвращает найденного пользователя или null если пользоваель c таим паспортом не существует.
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод принимает данные паспорта и номера счета и производит поиск пользователя по этим данным.
     * @param passport данные паспорта по которым производится поиск user.
     * @param requisite реквизиты счета по которым производится поиск.
     * @return возвращает найденный account или null если user с таким паспортом не найден
     * или если account с такимим реквизитами не существует.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        //Account account = null;
        if (user != null) {
            return users.get(user)
                    .stream().
                            filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод принимает данные паспорта и реквизитов отправителя и получателя, сумму перевода,
     * и производит перевод денежных средств.
     * @param srcPassport данные паспорта отправителя.
     * @param srcRequisite данные реквизитов отправителя.
     * @param destPassport данные паспорта получателя.
     * @param destRequisite данные реквизитов получателя.
     * @param amount сумма которую нужно перевести.
     * @return возвращает true если перевод выполнен или null, если
     * пользователь или счет не найден, возвращает null если у отправителя недостаточно средств.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && (srcAccount.getBalance() - amount) >= 0) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}