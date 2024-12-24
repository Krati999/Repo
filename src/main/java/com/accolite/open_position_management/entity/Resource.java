package com.accolite.open_position_management.entity;

import jakarta.persistence.*;



@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resourceId;
    private Long recruiterId;
    private Long experience;
    private Long resourceRequirement;
    private Long techId;
}

