package com.mahankali.temple.repo;

import com.mahankali.temple.dto.AmountReceivedDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmountReceivedRepo extends JpaRepository<AmountReceivedDTO, Integer> {
}
