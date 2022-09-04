package com.javatechie.s3.service;

import com.javatechie.s3.Entity.Customer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CustomerDetailService {
    ObjectMapper mapper = new ObjectMapper();

    public List<Customer> getCustomerDetail(){
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://localhost:8080/";

        List<Customer> response
                = restTemplate.getForObject(fooResourceUrl + "/getCustomer", List.class);
/*Customer customer1 = new Customer();
customer1.setCustomerId(123);
customer1.setCustomerName("Bokraaat");
customer1.setCustomerMail("b@gmail.com");
customer1.setAccountBalance(123445);

        Customer customer2 = new Customer();
        customer2.setCustomerId(124);
        customer2.setCustomerName("Bokraaat2");
        customer2.setCustomerMail("b@gmail.com");
        customer2.setAccountBalance(123445);*/
        List<Customer> pojos = mapper.convertValue(
                response,
                new TypeReference<List<Customer>>() { });

       // return List.of(customer1,customer2);
        return pojos;
    }

    public List<Customer> getCustomerDetailHardcoded(){
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://localhost:8080/";

        List<Customer> response
                = restTemplate.getForObject(fooResourceUrl + "/getCustomer", List.class);
Customer customer1 = new Customer();
customer1.setCustomerId(123);
customer1.setCustomerName("Bokraaat");
customer1.setCustomerMail("b@gmail.com");
customer1.setAccountBalance(123445);

        Customer customer2 = new Customer();
        customer2.setCustomerId(124);
        customer2.setCustomerName("Bokraaat2");
        customer2.setCustomerMail("b@gmail.com");
        customer2.setAccountBalance(123445);
       /* List<Customer> pojos = mapper.convertValue(
                response,
                new TypeReference<List<Customer>>() { });*/

         return List.of(customer1,customer2);
        //return pojos;
    }

}
