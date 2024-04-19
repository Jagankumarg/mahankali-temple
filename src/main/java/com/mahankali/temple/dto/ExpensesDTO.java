package com.mahankali.temple.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ExpensesDTO {
    @Id
    private int id;
    private String date;
    private String purpose;
    private int amount;
    private String comments;
    private String givenBy;
    private String takenBy;
    private String witness;


}
