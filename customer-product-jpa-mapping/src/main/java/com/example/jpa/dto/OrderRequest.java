package com.example.jpa.dto;

import com.example.jpa.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

}
