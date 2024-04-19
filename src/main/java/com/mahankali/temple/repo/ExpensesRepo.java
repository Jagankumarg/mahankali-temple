package com.mahankali.temple.repo;

import com.mahankali.temple.dto.ExpensesDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepo extends JpaRepository<ExpensesDTO,Integer> {
}
