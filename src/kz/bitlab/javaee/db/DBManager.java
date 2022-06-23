package kz.bitlab.javaee.db;

import kz.bitlab.javaee.models.Item;
import kz.bitlab.javaee.models.Person;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static List<Person> personList = new ArrayList<>();
    private static List<Item> itemList = new ArrayList<>();
    private static Long itemId = 1L;

    public void addPerson(Person person) {
        personList.add(person);
    }

    public List<Person> getAllPersons() {
        return personList;
    }

    public void addItem(Item item) {
        item.setId(itemId);
        itemList.add(item);
        itemId++;
    }

    public List<Item> getAllItems() {
        return itemList;
    }
}
