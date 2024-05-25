package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    private boolean findByKey(String key, String... strings) {
        boolean isInclude = false;
        for (String string : strings) {
            if (key.contains(string)) {
                isInclude = true;
                break;
            }
        }
        return isInclude;
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (key.contains(person.getName()) || key.contains(person.getSurname())
                    || key.contains(person.getPhone()) || key.contains(person.getAddress())) {
                result.add(person);
            }
        }
        return result;
    }
}