package com.mahankali.temple.service.impl;

import com.mahankali.temple.dto.DonatorsDTO;
import com.mahankali.temple.dto.Estimations;
import com.mahankali.temple.repo.DonatorsRepo;
import com.mahankali.temple.repo.EstimationsRepo;
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


}
