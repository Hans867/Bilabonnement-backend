package eksamen3.bilabonnement.Repositories;

import eksamen3.bilabonnement.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
