package com.erabanq.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Transfer {

    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private long id;

    @ManyToOne
    @NotNull
    private Account from;

    @ManyToOne
    @NotNull
    private Account to;


    private BigDecimal ammount;

    private String type;


    public Transfer(@NotNull Account from, @NotNull Account to, BigDecimal ammount) {
        this.from = from;
        this.to = to;
        this.ammount = ammount;
    }
}
