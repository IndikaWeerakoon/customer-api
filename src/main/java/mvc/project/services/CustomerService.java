package mvc.project.services;

import mvc.project.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(long id);
    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
