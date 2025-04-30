package com.tallerpractico.taller_practico.domain.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "countries")
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "country_name", length = 50, nullable = false)
    private String countryName;

    @OneToMany(mappedBy = "countries", fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<States> states = new HashSet<>();
}