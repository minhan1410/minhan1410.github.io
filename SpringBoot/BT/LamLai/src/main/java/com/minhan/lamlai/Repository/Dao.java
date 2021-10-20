package com.minhan.lamlai.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Dao<T> {
    protected List<T> list = new ArrayList<T>();

    public abstract Optional<T> getById(int id);

    public abstract List<T> getAll();

    public abstract void add(T film);

    public abstract void update(T film);

    public abstract void deleteById(int id);

    public abstract List<T> searchByKeyword(String keyword);
}
