package com.mahankali.temple.service;

import com.mahankali.temple.dto.*;

import java.util.List;

public interface MahankaliTempleService {

    public List<DonatorsDTO> fetchDonatorsList();

    List<Estimations> fetchExpensesList();

    Integer totalDonations();

    Integer totalEstimations();

    List<MembershipDTO> totalMemberships();

    Integer membershipTotal();

    List<VillageDonationsDTO> villageDonationsList();

    Integer vilageDonationsTotal();

    List<ExpensesDTO> expenses();

    Integer expensesTotal();
}
