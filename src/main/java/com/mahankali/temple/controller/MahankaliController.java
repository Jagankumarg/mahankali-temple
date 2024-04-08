package com.mahankali.temple.controller;

import com.mahankali.temple.dto.DonatorsDTO;
import com.mahankali.temple.dto.Estimations;
import com.mahankali.temple.dto.TotalResponseObject;
import com.mahankali.temple.service.MahankaliTempleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class MahankaliController {

    @Autowired
    MahankaliTempleService mahankaliTempleService;
    TotalResponseObject responseObject = new TotalResponseObject();
    @GetMapping("/chandaDonatorsList")
    public ResponseEntity<List<DonatorsDTO>> donatorsList() {
        List<DonatorsDTO> list = mahankaliTempleService.fetchDonatorsList();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping("/totalDonations")
    public ResponseEntity<TotalResponseObject> totalDonations() {
        Integer list = mahankaliTempleService.totalDonations();
        responseObject.setResponse(list);
        return ResponseEntity.ok().body(responseObject);

    }

    @GetMapping("/estimations")
    public ResponseEntity<List<Estimations>> expensesList() {
        List<Estimations> list = mahankaliTempleService.fetchExpensesList();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping("/estimationsTotal")
    public ResponseEntity<TotalResponseObject> totalEstimations() {



        Integer list = mahankaliTempleService.totalEstimations();
        responseObject.setResponse(list);
        return ResponseEntity.ok().body(responseObject);

    }


}