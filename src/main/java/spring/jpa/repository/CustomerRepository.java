package spring.jpa.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import spring.jpa.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
