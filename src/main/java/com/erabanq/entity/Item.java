package com.erabanq.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Entity
@Data
@RequiredArgsConstructor
public class Item {

    private @Id @GeneratedValue Long id;
    private final String description;

    @ManyToOne
    private Employee employee;


    public Item() {
        this.description = null;
    }
}
