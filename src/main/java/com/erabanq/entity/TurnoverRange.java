package com.erabanq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
public class  TurnoverRange {

    @Id
    @GeneratedValue
    private Long id;
    
    @Column(length = 30, unique = true, nullable = false)
    private String code;

    @Column(length = 30, unique = true, nullable = false)
    private String name;
    
    @Column(nullable = false)
    private int fromAmount;
    
    @Column(nullable = false)
    private int toAmount;

}
