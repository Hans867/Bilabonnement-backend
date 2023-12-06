package eksamen3.bilabonnement.Repositories;

import eksamen3.bilabonnement.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
