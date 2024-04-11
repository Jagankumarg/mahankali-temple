package com.mahankali.temple.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class MembershipDTO {

    @Id
    private int id;

    private String name;
    private String address;
    private int amount;
    private String status;
    private String comments;
    private String phoneNumber;

}
