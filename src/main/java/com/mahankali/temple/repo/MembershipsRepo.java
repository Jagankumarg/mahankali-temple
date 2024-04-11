package com.mahankali.temple.repo;

import com.mahankali.temple.dto.MembershipDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipsRepo extends JpaRepository<MembershipDTO, Integer> {
}
