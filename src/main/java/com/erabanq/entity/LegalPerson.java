package com.erabanq.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LegalPerson {

    @Id
    @GeneratedValue
    private Long id;

    private UUID uuid;

    //separeted by space
    private String titles;

    private String firstName;

    //separeted by space
    private String middleNames;

    private String lastName;

    private LocalDate birthDate;

    private Country country;




}
