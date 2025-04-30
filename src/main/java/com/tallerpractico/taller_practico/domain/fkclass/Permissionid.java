package com.tallerpractico.taller_practico.domain.fkclass;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
public class Permissionid implements Serializable {
    @Column(name = "role_id")
    private int roleId;
    
    @Column(name = "operation_id")
    private int operationId;
}