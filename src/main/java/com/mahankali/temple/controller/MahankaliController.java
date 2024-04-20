package com.mahankali.temple.controller;

import com.mahankali.temple.dto.*;
import com.mahankali.temple.service.MahankaliTempleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://nuvvulabanda-mahanakali-temple-830bea7efb82.herokuapp.com/")
//@CrossOrigin(origins = "http://localhost:3000/")
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

    @GetMapping("/memberShips")
    public ResponseEntity<List<MembershipDTO>> totalMembership() {
        List<MembershipDTO> list = mahankaliTempleService.totalMemberships();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping("/membershipsTotal")
    public ResponseEntity<TotalResponseObject> totalMembershipsEstimations() {


        Integer list = mahankaliTempleService.membershipTotal();
        responseObject.setResponse(list);
        return ResponseEntity.ok().body(responseObject);

    }

    @GetMapping("/villageDonations")
    public ResponseEntity<List<VillageDonationsDTO>> villageDonations() {
        List<VillageDonationsDTO> list = mahankaliTempleService.villageDonationsList();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping("/villageDonationsTotal")
    public ResponseEntity<TotalResponseObject> villageDonationsTotal() {


        Integer list = mahankaliTempleService.vilageDonationsTotal();
        responseObject.setResponse(list);
        return ResponseEntity.ok().body(responseObject);

    }

    @GetMapping("/expenses")
    public ResponseEntity<List<ExpensesDTO>> expenses() {
        List<ExpensesDTO> list = mahankaliTempleService.expenses();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping("/expensesTotal")
    public ResponseEntity<TotalResponseObject> expensesTotal() {


        Integer list = mahankaliTempleService.expensesTotal();
        responseObject.setResponse(list);
        return ResponseEntity.ok().body(responseObject);

    }

    @GetMapping("/amountDetails")
    public ResponseEntity<List<AmountReceivedDTO>> amountDetails() {
        List<AmountReceivedDTO> list = mahankaliTempleService.amountDetails();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping("/amountDetailsTotal")
    public ResponseEntity<TotalResponseObject> amountDetailsTotal() {


        Integer list = mahankaliTempleService.amountDetailsTotal();
        responseObject.setResponse(list);
        return ResponseEntity.ok().body(responseObject);

    }

    @GetMapping("/templeAmountDetails")
    public ResponseEntity<List<TempleAmountDetailsDTO>> templeAmountDetails() {
        List<TempleAmountDetailsDTO> list = mahankaliTempleService.templeAmountDetails();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping("/templeAmountDetailsTotal")
    public ResponseEntity<TotalResponseObject> templeAmountDetailsTotal() {


        Integer list = mahankaliTempleService.templeAmountDetailsTotal();
        responseObject.setResponse(list);
        return ResponseEntity.ok().body(responseObject);

    }





}
