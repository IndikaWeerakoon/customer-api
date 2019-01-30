package mvc.project.bootstrap;

import mvc.project.domain.Customer;
import mvc.project.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Customer c1 = new Customer();
        c1.setFirstname("Hasitha");
        c1.setLastname("Weerakoon");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Indika");
        c2.setLastname("Weerakoon");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstname("Anusha");
        c3.setLastname("Weerakoon");
        customerRepository.save(c3);

        System.out.println("File Saved");
    }
}
