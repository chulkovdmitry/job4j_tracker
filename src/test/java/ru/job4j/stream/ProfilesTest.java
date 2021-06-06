package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void testCollect() {
        Address adress1 = new Address("Magadan", "Dekabristov", 161, 6);
        Address adress2 = new Address("Moscow", "Red Square", 1, 1);
        List<Address> expected = Arrays.asList(adress1, adress2);
        List<Profile> profileList = Arrays.asList(new Profile(adress1), new Profile(adress2));
        List<Address> actual = new Profiles().collect(profileList);
        assertThat(actual, is(expected));
    }
}