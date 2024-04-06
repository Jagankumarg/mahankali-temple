package com.mahankali.temple.service.impl;

import com.mahankali.temple.dto.DonatorsDTO;
import com.mahankali.temple.service.DonatorsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DonatorsServiceImpl implements DonatorsService {


    @Override
    public List<DonatorsDTO> fetchDonatorsList() {
        return donatorsList();
    }

    private List<DonatorsDTO> donatorsList() {

        List<DonatorsDTO> donatorsDTOList = new ArrayList<>();

        donatorsDTOList.add(new DonatorsDTO("Anantula Raji Reddy","Nagole","50000","Pending",""));
        donatorsDTOList.add(new DonatorsDTO("Krishna Mohan Goud Ragiri","Nuvvulabanda","150000","Pending","Mahankali Statue"));


        return donatorsDTOList;

    }
}
