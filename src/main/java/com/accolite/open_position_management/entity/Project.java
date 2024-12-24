package com.accolite.open_position_management.entity;

import jakarta.persistence.*;



import java.time.LocalDate;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projId;

    private String projName;


    private Client clientId;

    private String projectCoordinator;

//    private LocalDate startDate;
//    private LocalDate endDate;
}

