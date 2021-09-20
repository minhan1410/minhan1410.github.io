package vn.techmaster.demothymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //Mặc định constructor được sinh ra là public access modifiers.
public class Person {
  private String name;
  private String nationality;
  private String birthdate;
  private String gender;
}
