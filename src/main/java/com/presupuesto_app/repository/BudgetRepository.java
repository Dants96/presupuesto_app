package com.presupuesto_app.repository;

import com.presupuesto_app.model.Budget;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends ReactiveCrudRepository<Budget, Long> {

}
