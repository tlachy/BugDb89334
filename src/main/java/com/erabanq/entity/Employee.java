package com.erabanq.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

    private @Id @GeneratedValue Long id;
    private final String firstName, lastName, title;

    @OneToMany
    private List<Item> items = new ArrayList<>();

    public Employee() {
        this.firstName = null;
        this.lastName = null;
        this.title = null;
    }
}