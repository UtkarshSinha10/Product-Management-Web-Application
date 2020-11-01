package com.example.jpa.repository;

import com.example.jpa.dto.OrderResponse;
import com.example.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("Select new com.example.jpa.dto.OrderResponse(c.name,p.productName) from Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();

}
