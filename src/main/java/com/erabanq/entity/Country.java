package com.erabanq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Locale;


//TODO isn't it enough to have java.util.Locale.getISOCountries() has all what we need: try Locale.getDefault().get...
@Entity
@Data
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 40, unique = true, nullable = false)
    private String code;

    @Column(length = 40, unique = true, nullable = false)
    private String name;
}
