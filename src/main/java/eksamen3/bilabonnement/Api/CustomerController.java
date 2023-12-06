package eksamen3.bilabonnement.Api;

import eksamen3.bilabonnement.Entity.Customer;
import eksamen3.bilabonnement.Repositories.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return ResponseEntity.ok(customers);
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable String id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Create
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(savedCustomer);
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
        if (customerRepository.existsById(id)) {
            Customer updatedCustomer = customerRepository.save(customer);
            return ResponseEntity.ok(updatedCustomer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

