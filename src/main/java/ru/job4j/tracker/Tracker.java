package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>(100);
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        size++;
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        int sizeByName = 0;
        List<Item> itemsByName = new ArrayList<>(size);
        for (Item item : items) {
            if (key.equals(item.getName())) {
                itemsByName.add(item);
            }
        }
        return itemsByName;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        boolean isReplace = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.add(index, item);
            isReplace = true;
        }
        return isReplace;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
            size--;
        }
    }
}