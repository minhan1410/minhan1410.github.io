package com.minhan.bt_jpa;

import com.minhan.bt_jpa.model.Employee;
import com.minhan.bt_jpa.model.Name;
import com.minhan.bt_jpa.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@Sql({"/employee.sql"})
@Slf4j
public class EmployeeTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void createNewEmployeeTest() {
        Employee employee = Employee.builder()
                .name(new Name("Phú", "Lê"))
                .gender("Male")
                .address("Việt Nam")
                .email("levanphu5555@gmail.com")
                .salary(5000L)
                .bDay(new GregorianCalendar(1999, 02, 20).getTime())
                .build();
        employeeRepository.save(employee);
        employeeRepository.findAll().forEach(System.out::println);
        Assertions.assertThat(employee.getId()).isGreaterThan(0);
    }

    @Test
    public void updateEmployeeTest() {
        Employee employee = employeeRepository.findById(2L).get();
        System.out.println(employee);
        employee.setSalary(10000L);
        employeeRepository.save(employee);
        System.out.println(employee);
        Assertions.assertThat(employee.getSalary()).isEqualTo(10000L);
    }

    @Test
    public void deleteEmployeeTest() {
        employeeRepository.findAll().forEach(System.out::println);
        Employee employee = employeeRepository.findById(2L).get();
        employeeRepository.delete(employee);
        employeeRepository.findAll().forEach(System.out::println);
        Assertions.assertThat(employeeRepository.findById(2L)).isEmpty();
    }

    @Test
    public void getAll() {
        employeeRepository.findAll().forEach(System.out::println);
        Assertions.assertThat(20).isEqualTo(employeeRepository.findAll().size());
    }

//    Lưu ý: Với các case tìm kiếm, ngoài case tìm với id, hãy test thêm các case tìm với name (full name),
//    tìm với tên và tuổi, tìm với email, tìm với tuổi trong khoảng (khoảng tuổi tự cho vào, ví dụ 23-30)

    @Test
    public void getByIdTest() {
        Employee employee = employeeRepository.findById(2L).get();
        System.out.println(employee);
        Assertions.assertThat(employee.getId()).isEqualTo(2);
    }

    @Test
    public void getByNameTest() {
        List<Employee> employees = employeeRepository.findByName("se Ram");
        System.out.println("Hello    "+employees);
        Assertions.assertThat(employees.size()).isGreaterThan(0);
    }

    @Test
    public void getByEmailTest(){
        List<Employee> employee = employeeRepository.findByEmail("aramsier0@wsj.com");
        System.out.println(employee);
    }

    @Test
    public void getByNameAndAgeTest(){
        List<Employee> employee = employeeRepository.findByNameAndAge("se Ram", 23);
        System.out.println(employee);
    }

    @Test
    public void getByAgeAbout(){
        List<Employee> employee = employeeRepository.findByAgeAbout(23, 30);
        System.out.println(employee);
    }
}
