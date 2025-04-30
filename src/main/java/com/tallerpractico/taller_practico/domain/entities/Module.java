package com.tallerpractico.taller_practico.domain.entities;

import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "module")
@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "base_path", length = 50, nullable = false)
    private String basePath;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @OneToMany(mappedBy = "module", fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Operation> operations = new HashSet<>();
}