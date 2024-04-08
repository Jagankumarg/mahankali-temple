package com.mahankali.temple.repo;

import com.mahankali.temple.dto.DonatorsDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonatorsRepo extends JpaRepository<DonatorsDTO,String> {

}
