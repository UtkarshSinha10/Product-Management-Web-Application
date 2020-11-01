package com.example.jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.sql.DataSourceDefinition;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderResponse {

    private String name;
    private String productName;
}
