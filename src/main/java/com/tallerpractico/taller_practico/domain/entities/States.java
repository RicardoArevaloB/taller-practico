package com.tallerpractico.taller_practico.domain.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "states")
@Entity
public class States {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "abbreviation", length = 50, nullable = false)
    private String abbreviation;

    @ManyToOne
    @JoinColumn(name = "id_country")
    @JsonBackReference
    private Countries countries;

    @OneToMany(mappedBy = "states", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Cities> cities = new HashSet<>();
}