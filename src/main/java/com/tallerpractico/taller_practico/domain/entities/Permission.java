package com.tallerpractico.taller_practico.domain.entities;

import com.tallerpractico.taller_practico.domain.fkclass.Permissionid;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "permission")
@Entity
public class Permission {
    @EmbeddedId
    private Permissionid id;

    @ManyToOne
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "operation_id", insertable = false, updatable = false)
    private Operation operation;
}