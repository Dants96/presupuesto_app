package com.presupuesto_app.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(schema = "app_data", name = "expense_types")
public class ExpenseType extends AuditableEntity {
    @Id
    private String id;
    private String description;
}
