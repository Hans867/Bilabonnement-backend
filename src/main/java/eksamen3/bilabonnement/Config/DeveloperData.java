package eksamen3.bilabonnement.Config;

import eksamen3.bilabonnement.Entity.Car;
import eksamen3.bilabonnement.Entity.Customer;
import eksamen3.bilabonnement.Entity.Damage;
import eksamen3.bilabonnement.Entity.Subscription;
import eksamen3.bilabonnement.Repositories.CarRepository;
import eksamen3.bilabonnement.Repositories.CustomerRepository;
import eksamen3.bilabonnement.Repositories.DamageRepository;
import eksamen3.bilabonnement.Repositories.SubscriptionRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Component
public class DeveloperData implements ApplicationRunner {

    private final CarRepository carRepository;
    private final CustomerRepository customerRepository;
    private final SubscriptionRepository subscriptionRepository;
    private final DamageRepository damageRepository;

    public DeveloperData (CarRepository carRepository, CustomerRepository customerRepository,
                          SubscriptionRepository subscriptionRepository, DamageRepository damageRepository) {
        this.carRepository = carRepository;
        this.customerRepository = customerRepository;
        this.subscriptionRepository = subscriptionRepository;
        this.damageRepository = damageRepository;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("I was called");

        // Insert sample cars
        Car car1 = new Car("Toyota", 25000, "Gasoline");
        Car car2 = new Car("Honda", 22000, "Hybrid");
        carRepository.saveAll(Arrays.asList(car1, car2));

        // Insert sample customers
        Customer customer1 = new Customer("john_doe", "password123", "john@example.com", "John", "Doe");
        Customer customer2 = new Customer("jane_smith", "securePass", "jane@example.com", "Jane", "Smith");
        customerRepository.saveAll(Arrays.asList(customer1, customer2));

        // Insert sample damages
        Damage damage1 = new Damage("Scratch on the front bumper", 200, 50, 30, car1, null);
        Damage damage2 = new Damage("Dent on the driver's side door", 300, 60, 40, car2, null);
        damageRepository.saveAll(Arrays.asList(damage1, damage2));

        // Insert sample subscriptions
        Subscription subscription1 = new Subscription(
                "2023-01-01", "2023-01-10", "2023-02-10", "2023-01-10",
                0, 500, 1000, 30, 300, "Location A", "Location B", car1, customer1
        );

        Subscription subscription2 = new Subscription(
                "2023-02-15", "2023-02-20", "2023-03-20", "2023-02-20",
                0, 450, 800, 28, 280, "Location C", "Location D", car2, customer2
        );

        subscriptionRepository.saveAll(Arrays.asList(subscription1, subscription2));

    }
}

