package org.example;

import java.util.ArrayList;
import java.util.List;

public class DataStore<T> {
    private List<T> items;

    public DataStore() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return new ArrayList<>(items);
    }

    public String getById(String id) {
        return items.stream().filter(item -> id.equals(((Student) item).getId())).findFirst().orElse(null).toString();
    }

    public List<T> getByGender(String gender) {
        return items.stream().filter(item -> gender.equals(((Student) item).getGender())).toList();
    }

    public int size() {
        return items.size();
    }
}
