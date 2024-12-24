package com.accolite.open_position_management.entity;

import jakarta.persistence.*;

@Entity
public class PotentialResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long potentialEmpId;

    private Long resourceId;
    private String email;
    private String phone;
    private Long stageId;
    private Long recruiterId;
}

