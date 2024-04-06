package com.mahankali.temple.controller;

import com.mahankali.temple.dto.DonatorsDTO;
import com.mahankali.temple.service.DonatorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000/")
public class MahankaliController {

    @Autowired
    DonatorsService donatorsService;

    @GetMapping("/chandaDonatorsList")
    ResponseEntity<List<DonatorsDTO>> donatorsList(){
        List<DonatorsDTO> list=donatorsService.fetchDonatorsList();

        return ResponseEntity.ok().body(list);

    }


}
