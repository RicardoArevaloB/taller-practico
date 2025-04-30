package com.tallerpractico.taller_practico.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "users")
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_user", length = 50, nullable = false)
    private String name;

    @Column(name = "email_user", length = 50, nullable = false, unique = true)
    private String email;

    @Column(name = "password_user", length = 50, nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_role")
    @JsonBackReference
    private Role role;
}