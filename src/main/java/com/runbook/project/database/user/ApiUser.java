package com.runbook.project.database.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApiUser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
