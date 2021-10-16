package com.example.btvn.Repository;

import com.example.btvn.Model.Employee;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class EmployeeDao extends Dao<Employee> {
    public EmployeeDao(String csvFile) {
        this.readCSV(csvFile);
    }

    @Override
    public void readCSV(String csvFile) {
        try {
            File file = ResourceUtils.getFile("classpath:static/" + csvFile);
            CsvMapper mapper = new CsvMapper(); // Dùng để ánh xạ cột trong CSV với từng trường trong POJO
            CsvSchema schema = CsvSchema.emptySchema().withHeader().withColumnSeparator('|'); // Dòng đầu tiên sử dụng làm Header
            ObjectReader oReader = mapper.readerFor(Employee.class).with(schema); // Cấu hình bộ đọc CSV phù hợp với kiểu
            Reader reader = new FileReader(file);
            MappingIterator<Employee> mi = oReader.readValues(reader); // Iterator đọc từng dòng trong file
            while (mi.hasNext()) {
                Employee employee = mi.next();
                add(employee);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Employee> getAll() {
        return list;
    }

    @Override
    public Optional<Employee> get(int id) {
        return list.stream().filter(i -> i.getId() == id).findFirst();
    }

    @Override
    public void add(Employee employee) {
        int id;
        if (list.isEmpty()) {
            id = 1;
        } else {
            id = list.get(list.size() - 1).getId() + 1;
        }
        employee.setId(id);
        list.add(employee);
    }

    @Override
    public void update(Employee employee) {
        get(employee.getId()).ifPresent(i -> {
            i.setFirstName(employee.getFirstName());
            i.setLastName(employee.getLastName());
            i.setEmailId(employee.getEmailId());
            i.setPasswordNumber(employee.getPasswordNumber());
        });
    }

    @Override
    public void delete(Employee employee) {
        deleteById(employee.getId());
    }

    @Override
    public void deleteById(int id) {
        get(id).ifPresent(i -> list.remove(i));
    }

    @Override
    public List<Employee> searchByKeyword(String keyword) {
        return list.stream().filter(i -> i.matchWithKeyword(keyword)).collect(Collectors.toList());
    }
}
