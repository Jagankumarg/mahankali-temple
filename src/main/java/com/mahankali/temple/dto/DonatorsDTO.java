package com.mahankali.temple.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonatorsDTO {

    private String name;
    private String address;
    private String amount;
    private String status;
    private String comments;
}
