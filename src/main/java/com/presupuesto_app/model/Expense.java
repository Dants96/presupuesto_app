package com.presupuesto_app.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;


@Data
@EqualsAndHashCode(callSuper = true)
@Table(schema = "app_date", name = "expenses")
public class Expense extends AuditableEntity {

    @Id
    private Long id;

    @Column("budget_id")
    private Long budgetId;

    @Column("type_id")
    private String typeId;

    @Column("description")
    private String description;

    @Column("cost")
    private BigDecimal cost;

    @Column("within_budget")
    private Boolean withinBudget;

}
