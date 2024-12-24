package com.accolite.open_position_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recruiter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long recruiterId;
   private String recruiterName;
   private String recruiterEmail;
   private Long recruiterContactNo;

}
