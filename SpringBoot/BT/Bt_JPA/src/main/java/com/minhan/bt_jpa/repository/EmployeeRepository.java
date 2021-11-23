package com.minhan.bt_jpa.repository;

import com.minhan.bt_jpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByEmail(String email);

    @Query(value = "select * from employee e where CONCAT_WS(' ',e.first_name,e.last_name) like %:keyName%",nativeQuery = true)
    List<Employee> findByName(@Param("keyName") String name);

    @Query(value = "SELECT * FROM employee e WHERE CONCAT_WS(' ', e.first_name, e.last_name) LIKE %:keyName% AND DATEDIFF(YEAR, e.BIRTH_DAY, CURRENT_DATE) = :keyAge", nativeQuery = true)
    List<Employee> findByNameAndAge(@Param("keyName") String name, @Param("keyAge") int age);

    @Query(value = "SELECT * FROM employee e WHERE DATEDIFF(YEAR, e.BIRTH_DAY, CURRENT_DATE) >= :startDate and DATEDIFF(YEAR, e.BIRTH_DAY, CURRENT_DATE) <= :endDate", nativeQuery = true)
    List<Employee> findByAgeAbout(@Param("startDate") int startDate,@Param("endDate") int endDate);
}
