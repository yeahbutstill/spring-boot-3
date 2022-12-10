package com.yeahbutstill.demospring3.dao;

import com.yeahbutstill.demospring3.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
