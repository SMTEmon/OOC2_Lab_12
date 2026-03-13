package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    public java.util.Optional<T> findFirst(Predicate<T> criteria) {
        return items.stream().filter(criteria).findFirst();
    }

    public int size() {
        return items.size();
    }
}
