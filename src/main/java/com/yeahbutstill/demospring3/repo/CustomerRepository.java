package com.yeahbutstill.demospring3.repo;

import com.yeahbutstill.demospring3.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
