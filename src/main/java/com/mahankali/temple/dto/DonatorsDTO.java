package com.mahankali.temple.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DonatorsDTO {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private String amount;
    private String status;
    private String comments;
    private String phoneNumber;
    private String date;
}
