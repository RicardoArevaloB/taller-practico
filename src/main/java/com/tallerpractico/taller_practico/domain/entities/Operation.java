package com.tallerpractico.taller_practico.domain.entities;

import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "operation")
@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "permit_all", nullable = false)
    private Boolean permitAll;

    @Column(name = "http_method", length = 50, nullable = false)
    private String httpMethod;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "path", length = 50, nullable = false)
    private String path;

    @ManyToOne
    @JoinColumn(name = "id_module")
    @JsonBackReference
    private Module module;

    @OneToMany(mappedBy = "operation")
    private Set<Permission> permissions = new HashSet<>();
}