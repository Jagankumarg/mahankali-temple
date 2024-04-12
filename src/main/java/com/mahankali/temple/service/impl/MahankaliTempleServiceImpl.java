package com.mahankali.temple.service.impl;

import com.mahankali.temple.dto.DonatorsDTO;
import com.mahankali.temple.dto.Estimations;
import com.mahankali.temple.dto.MembershipDTO;
import com.mahankali.temple.dto.VillageDonationsDTO;
import com.mahankali.temple.repo.DonatorsRepo;
import com.mahankali.temple.repo.EstimationsRepo;
import com.mahankali.temple.repo.MembershipsRepo;
import com.mahankali.temple.repo.VillageDonationsRepo;
import com.mahankali.temple.service.MahankaliTempleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MahankaliTempleServiceImpl implements MahankaliTempleService {

    @Autowired
    private DonatorsRepo donatorsRepo;
    @Autowired
    private EstimationsRepo estimationsRepo;

    @Autowired
    private MembershipsRepo membershipsRepo;

    @Autowired
    private VillageDonationsRepo villageDonationsRepo;


    private static Integer getSum(List<String> amountStringList) {
        List<Integer> intList = amountStringList.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        return intList.stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public List<DonatorsDTO> fetchDonatorsList() {

        return donatorsRepo.findAll();
    }

    @Override
    public List<Estimations> fetchExpensesList() {
        return estimationsRepo.findAll();
    }

    @Override
    public Integer totalDonations() {
        List<DonatorsDTO> strList = donatorsRepo.findAll();


        List<String> amountStringList = new ArrayList<>();

        for (DonatorsDTO li : strList) {
            amountStringList.add(li.getAmount());
        }


        return getSum(amountStringList);
    }

    @Override
    public Integer totalEstimations() {
        List<Estimations> strList = estimationsRepo.findAll();
        List<String> amountStringList = new ArrayList<>();

        for (Estimations li : strList) {
            amountStringList.add(li.getAmount());
        }


        return getSum(amountStringList);

    }

    @Override
    public List<MembershipDTO> totalMemberships() {
        return membershipsRepo.findAll();
    }

    @Override
    public Integer membershipTotal() {
        List<MembershipDTO> memberShipAmountList = membershipsRepo.findAll();
        return memberShipAmountList.stream().mapToInt(MembershipDTO::getAmount).sum();
    }

    @Override
    public List<VillageDonationsDTO> villageDonationsList() {
        return villageDonationsRepo.findAll();
    }

    @Override
    public Integer vilageDonationsTotal() {
        List<VillageDonationsDTO> memberShipAmountList = villageDonationsRepo.findAll();
        return memberShipAmountList.stream().mapToInt(VillageDonationsDTO::getAmount).sum();
    }



}
