package application;

import application.persistence.entity.*;
import application.persistence.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by Johnik on 31.1.2017.
 */
//@EnableJpaRepositories(basePackages="application.persistence.repository")
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository customerRepository, AddressRepository addressRepository) {
        return (args) -> {
            Address a1 = new Address("Ad", 1, "a", "a", "a");
            addressRepository.save(a1);
            customerRepository.save(new Customer("Jack", "Bauer", a1));

//            customerRepository.save(new application.persistence.entity.Customer("Chloe", "O'Brian", a1));
//            customerRepository.save(new application.persistence.entity.Customer("Kim", "Bauer", a1));
//            customerRepository.save(new application.persistence.entity.Customer("David", "Palmer", a1));
//            customerRepository.save(new application.persistence.entity.Customer("Michelle", "Dessler", a1));

//            // fetch all customers
//            log.info("Customers found with findAll():");
//            log.info("-------------------------------");
//            for (application.persistence.entity.Customer customer : customerRepository.findAll()) {
//                log.info(customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            application.persistence.entity.Customer customer = customerRepository.findOne(1L);
//            log.info("Customer found with findOne(1L):");
//            log.info("--------------------------------");
//            log.info(customer.toString());
//            log.info("");
//
//            // fetch customers by last name
//            log.info("Customer found with findByLastName('Bauer'):");
//            log.info("--------------------------------------------");
//            for (application.persistence.entity.Customer bauer : customerRepository.findByLastName("Bauer")) {
//                log.info(bauer.toString());
//            }
//            log.info("");
        };
    }

}
