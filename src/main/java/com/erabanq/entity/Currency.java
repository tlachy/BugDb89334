package com.erabanq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
public class Currency {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 30, unique = true, nullable = false)
    private String code;

    @Column(length = 30, unique = true, nullable = false)
    private String name;
    
}
