package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(customerRepository.count() == 1) {

            Customer customer1 = new Customer();
            customer1.setFirstName("Ricardo");
            customer1.setLastName("Howze");
            customer1.setAddress("2624 Jewell Road");
            customer1.setPostal_code("55404");
            customer1.setPhone("612-718-1639");
            customer1.setDivision(divisionRepository.findAll().get(22));
            customerRepository.save(customer1);

            Customer customer2 = new Customer();
            customer2.setFirstName("Elizabeth");
            customer2.setLastName("Lawson");
            customer2.setAddress("4689 Payne Street");
            customer2.setPostal_code("24382");
            customer2.setPhone("276-779-8595");
            customer2.setDivision(divisionRepository.findAll().get(45));
            customerRepository.save(customer2);

            Customer customer3 = new Customer();
            customer3.setFirstName("Cecil");
            customer3.setLastName("Patterson");
            customer3.setAddress("53 Haven Lane");
            customer3.setPostal_code("48820");
            customer3.setPhone("517-668-9215");
            customer3.setDivision(divisionRepository.findAll().get(21));
            customerRepository.save(customer3);

            Customer customer4 = new Customer();
            customer4.setFirstName("Blake");
            customer4.setLastName("Gomez");
            customer4.setAddress("2176 Reserve St");
            customer4.setPostal_code("K0L 1B0");
            customer4.setPhone("705-939-1394");
            customer4.setDivision(divisionRepository.findAll().get(11));
            customerRepository.save(customer4);

            Customer customer5 = new Customer();
            customer5.setFirstName("Leigh");
            customer5.setLastName("Eldridge");
            customer5.setAddress("58 Moulton Road");
            customer5.setPostal_code("LL18 6PQ");
            customer5.setPhone("078-8540-9453");
            customer5.setDivision(divisionRepository.findAll().get(32));
            customerRepository.save(customer5);

            System.out.println("Sample customers created");
        }
    }
}
