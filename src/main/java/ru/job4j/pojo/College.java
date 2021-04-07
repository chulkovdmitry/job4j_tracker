package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
      Student  student = new Student();
      student.setName("Сидоров Иван Иванович");
      student.setGroup("4603");
      student.setEntered();
      System.out.println("Зачислен студент: " + student.getName() + " в группу: " + student.getGroup() + " c "
              + student.getEntered());
    }
}
