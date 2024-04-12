package com.mahankali.temple.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VillageDonationsDTO {
    @Id
    private int id;

    private String name;
    private String address;
    private int amount;
    private String status;
    private String comments;
    private String phoneNumber;
}
