package com.mahankali.temple.repo;

import com.mahankali.temple.dto.VillageDonationsDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VillageDonationsRepo extends JpaRepository<VillageDonationsDTO,Integer> {
}
