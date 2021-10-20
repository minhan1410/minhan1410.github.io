package com.minhan.lamlai.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    int id;
    String name, title, link, photo;
    int year;

    public boolean matchWithKeyword(String keyword) {
        return name.contains(keyword) || title.contains(keyword) || String.valueOf(year).contains(keyword);
    }
}
