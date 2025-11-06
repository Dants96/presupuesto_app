package com.presupuesto_app.repository;

import com.presupuesto_app.model.ExpenseType;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ExpenseTypeRepository extends ReactiveCrudRepository<ExpenseType, String> {}
