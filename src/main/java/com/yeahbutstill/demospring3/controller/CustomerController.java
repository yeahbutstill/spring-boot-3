package com.yeahbutstill.demospring3.controller;

import com.yeahbutstill.demospring3.dao.CustomerDao;
import com.yeahbutstill.demospring3.dto.CustomerRequest;
import com.yeahbutstill.demospring3.entity.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerDao customerRepo;

    @PostMapping("/add")
    public void addCustomer(@RequestBody CustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());
        customerRepo.save(customer);
    }

    @GetMapping("/list")
    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    @PutMapping("/update/{customerId}")
    public ResponseEntity<Customer> updateCustomer(@Valid @PathVariable("customerId") Integer id, @RequestBody Customer customerDetails) {
        Customer updtCustomer = customerRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not exist with id: " + id));

        updtCustomer.setName(customerDetails.getName());
        updtCustomer.setEmail(customerDetails.getEmail());
        updtCustomer.setAge(customerDetails.getAge());

        customerRepo.save(updtCustomer);

        return ResponseEntity.ok(updtCustomer);
    }

    @DeleteMapping("/delete/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id) {
        customerRepo.deleteById(id);
    }

}
