package com.presupuesto_app.repository;

import com.presupuesto_app.model.Expense;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ExpenseRepository extends ReactiveCrudRepository<Expense, Long> {}
