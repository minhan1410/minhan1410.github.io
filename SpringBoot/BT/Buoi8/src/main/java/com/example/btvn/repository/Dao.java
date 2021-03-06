package com.example.btvn.repository;

import com.example.btvn.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Dao<T> {
    protected List<Employee> list = new ArrayList<Employee>();

    public abstract List<Employee> getAll();

    public abstract Optional<T> get(int id);

    public abstract void add(Employee employee);

    public abstract void update(Employee employee);

    public abstract void delete(Employee employee);

    public abstract void deleteById(int id);

    public abstract List<T> searchByKeyword(String keyword);
}
