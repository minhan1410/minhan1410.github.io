package com.example.btvn.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @JsonIgnore  //Bỏ qua id khi nạp từ CSV
    private int id;
    private String firstName, lastName, emailId, passwordNumber;

    public boolean matchWithKeyword(String keyword) {
        String keywordLowerCase = keyword.toLowerCase();
        return ((firstName+lastName).toLowerCase().contains(keywordLowerCase) ||
                emailId.toLowerCase().contains(keywordLowerCase));
    }
}