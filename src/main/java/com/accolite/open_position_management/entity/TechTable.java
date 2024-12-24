package com.accolite.open_position_management.entity;
import jakarta.persistence.*;


@Entity
public class TechTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long techId;

    private String techName;
}
