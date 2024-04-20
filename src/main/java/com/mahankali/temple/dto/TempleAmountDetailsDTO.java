package com.mahankali.temple.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class TempleAmountDetailsDTO {

    @Id
    private int id;
    private String name;
    private int amount;
}
