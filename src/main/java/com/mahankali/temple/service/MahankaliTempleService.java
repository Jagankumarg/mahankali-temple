package com.mahankali.temple.service;

import com.mahankali.temple.dto.DonatorsDTO;
import com.mahankali.temple.dto.Estimations;

import java.util.List;

public interface MahankaliTempleService {

    public List<DonatorsDTO> fetchDonatorsList();

    List<Estimations> fetchExpensesList();

    Integer totalDonations();

    Integer totalEstimations();
}
