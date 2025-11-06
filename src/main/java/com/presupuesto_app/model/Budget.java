package com.presupuesto_app.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Table(schema ="app_data", name = "budgets")
public class Budget {

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

    @Column("created_at")
    private LocalDateTime createdAt;

    @Column("updated_at")
    private LocalDateTime updatedAt;

}
