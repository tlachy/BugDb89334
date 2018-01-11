package com.erabanq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;


@Entity
@Data
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
public class Currency {

    public Currency() {
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 30, unique = true, nullable = false)
    private String code;

    @Column(length = 70, unique = true, nullable = false)
    private String name;
}
