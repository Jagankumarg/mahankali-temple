package com.mahankali.temple.service;

import com.mahankali.temple.dto.DonatorsDTO;
import com.mahankali.temple.dto.Estimations;
import com.mahankali.temple.dto.MembershipDTO;
import com.mahankali.temple.dto.VillageDonationsDTO;

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
}
