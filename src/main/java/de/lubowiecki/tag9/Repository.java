package de.lubowiecki.tag9;

import java.util.List;

public interface Repository<T> {

    public List<T> getAll();

    public void add(T produkt);

    public void sort();

}
