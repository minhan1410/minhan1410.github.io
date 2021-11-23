package com.minhan.bt_jpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Name name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "salary")
    private Long salary;

    @Column(name = "birth_day")
    @Temporal(TemporalType.DATE)
    //https://stackoverflow.com/questions/25333711/what-is-the-use-of-the-temporal-annotation-in-hibernate
    private Date bDay;

    @Transient //https://helpex.vn/question/tai-sao-jpa-co-chu-thich-transient-5cb7df0cae03f646703ca975
    private int age;

    public int getAge() {
        Date safeDate = new Date(bDay.getTime());
        LocalDate birthDayInLocalDate = safeDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        return Period.between(birthDayInLocalDate, LocalDate.now()).getYears();
    }
}
