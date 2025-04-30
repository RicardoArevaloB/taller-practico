package com.tallerpractico.taller_practico.domain.entities;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "cities")
@Entity
public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    
    @Column(name = "state_abbreviation", length = 6)
    private String stateAbbreviation;

    @Column(name = "city_name", length = 50, nullable = false)
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "id_state")
    @JsonBackReference
    private States states;
}