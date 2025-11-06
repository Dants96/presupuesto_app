package com.presupuesto_app.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;


@Data
@EqualsAndHashCode(callSuper = true)
@Table(schema ="app_data", name = "budgets")
public class Budget extends AuditableEntity {

    @Id
    private Long id;

    @Column("user_id")
    private Long userId;

    @Column("budget_date")
    private String budgetDate;

    @Column("actual_expense")
    private BigDecimal actualExpense;

    @Column("expected_expense")
    private BigDecimal expectedExpense;

    @Column("name")
    private String name;

    @Column("description")
    private String description;

}
