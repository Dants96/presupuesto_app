package com.presupuesto_app.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Data
public abstract class AuditableEntity {
    @Column("created_at")
    private LocalDateTime createdAt;
    @Column("updated_at")
    private LocalDateTime updatedAt;
}
