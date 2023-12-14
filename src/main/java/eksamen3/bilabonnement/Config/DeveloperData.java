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

    public DeveloperData(CarRepository carRepository, CustomerRepository customerRepository,
                         SubscriptionRepository subscriptionRepository, DamageRepository damageRepository) {
        this.carRepository = carRepository;
        this.customerRepository = customerRepository;
        this.subscriptionRepository = subscriptionRepository;
        this.damageRepository = damageRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("I was called");

        // Insert sample customers
        Customer[] customerInstances = {new Customer("john_doe", "password123", "john@example.com", "John", "Doe"),
                new Customer("jane_smith", "securePass", "jane@example.com", "Jane", "Smith"),
                new Customer("alice_green", "pass123", "alice@example.com", "Alice", "Green"),
                new Customer("bob_jones", "bobpass", "bob@example.com", "Bob", "Jones"),
                new Customer("emma_jackson", "emma_pass", "emma@example.com", "Emma", "Jackson"),
                new Customer("mike_anderson", "mike123", "mike@example.com", "Mike", "Anderson"),
                new Customer("sara_smith", "sara_pass", "sara@example.com", "Sara", "Smith"),
                new Customer("david_wilson", "davidpass", "david@example.com", "David", "Wilson"),
                new Customer("olivia_jones", "olivia_pass", "olivia@example.com", "Olivia", "Jones"),
                new Customer("ryan_miller", "ryan123", "ryan@example.com", "Ryan", "Miller")};

        customerRepository.saveAll(Arrays.asList(customerInstances));

        System.out.println("I was called 1");

        // Insert sample cars
        Car[] carInstances = {new Car("Toyota", 25000, "Gasoline", "https://images.unsplash.com/photo-1556890800-47ea175c6fbb?q=80&w=3164&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
                new Car("Honda", 22000, "Hybrid", "https://images.unsplash.com/photo-1614152204567-04903fff36b0?q=80&w=3165&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
                new Car("Ford", 28000, "Diesel", "https://images.unsplash.com/photo-1568315698760-1d71a37e3478?q=80&w=3165&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
                new Car("Porsche", 310000, "Hybrid", "https://images.unsplash.com/photo-1593353798398-6024b7444bb6?q=80&w=3164&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
                new Car("Mercedes", 350000, "Hybrid", "https://images.unsplash.com/photo-1599912027765-a69c78bfa3aa?q=80&w=3164&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
                new Car("Alpha Romeo", 300000, "Gasoline", "https://images.unsplash.com/photo-1577494998472-199727fdc041?q=80&w=3174&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
                new Car("Kia", 30000, "Gasoline", "https://images.unsplash.com/photo-1651041940745-9f04e2f72a1a?q=80&w=2971&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
                new Car("Citroën", 35000, "Diesel", "https://images.unsplash.com/photo-1609030429269-ca5b7a409310?q=80&w=3174&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
                new Car("BMW", 80000, "Gasoline", "https://images.unsplash.com/photo-1607853554439-0069ec0f29b6?q=80&w=3027&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
                new Car("Audi", 130000, "Gasoline", "https://images.unsplash.com/photo-1628277302802-a0bd1de97ae0?q=80&w=2970&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")};

        carRepository.saveAll(Arrays.asList(carInstances));

        System.out.println("I was called 2");

        // Insert sample subscriptions
        Subscription[] subscriptionInstances = {new Subscription(
                "2023-01-01", "2023-01-10", "2023-02-10", "2023-01-10",
                0, 500, 1000, 30, 300, "Location A", "Location B", carInstances[0], customerInstances[0]
        ),
                new Subscription(
                        "2023-02-15", "2023-02-20", "2023-03-20", "2023-02-20",
                        0, 450, 800, 28, 280, "Location C", "Location D", carInstances[1], customerInstances[1]
                ),
                new Subscription(
                        "2023-03-01", "2023-03-10", "2023-04-10", "2023-03-10",
                        0, 550, 900, 25, 250, "Location E", "Location F", carInstances[2], customerInstances[2]
                ),
                new Subscription(
                        "2023-04-15", "2023-04-20", "2023-05-20", "2023-04-20",
                        0, 480, 750, 27, 270, "Location G", "Location H", carInstances[3], customerInstances[3]
                ),
                new Subscription(
                        "2023-05-01", "2023-05-10", "2023-06-10", "2023-05-10",
                        0, 600, 1000, 30, 300, "Location I", "Location J", carInstances[4], customerInstances[4]
                ),
                new Subscription(
                        "2023-06-15", "2023-06-20", "2023-07-20", "2023-06-20",
                        0, 520, 850, 28, 280, "Location K", "Location L", carInstances[5], customerInstances[5]
                ),
                new Subscription(
                        "2023-07-01", "2023-07-10", "2023-08-10", "2023-07-10",
                        0, 580, 950, 26, 260, "Location M", "Location N", carInstances[6], customerInstances[6]
                ),
                new Subscription(
                        "2023-08-15", "2023-08-20", "2023-09-20", "2023-08-20",
                        0, 510, 800, 30, 300, "Location O", "Location P", carInstances[7], customerInstances[7]
                )};

        subscriptionRepository.saveAll(Arrays.asList(subscriptionInstances));

        System.out.println("I was called 6");

        // Insert sample damages
        Damage[] damageInstances = {new Damage("Scratch on the front bumper", 200, 50, 30, carInstances[0], subscriptionInstances[0]),
                new Damage("Dent on the driver's side door", 300, 60, 40, carInstances[1], subscriptionInstances[1]),
                new Damage("Broken taillight", 150, 40, 20, carInstances[2], subscriptionInstances[2]),
                new Damage("Chipped windshield", 200, 30, 25, carInstances[3], subscriptionInstances[3]),
                new Damage("Scratch on the side door", 180, 45, 35, carInstances[4], subscriptionInstances[4]),
                new Damage("Dent on the rear bumper", 250, 55, 40, carInstances[5], subscriptionInstances[5]),
                new Damage("Broken side mirror", 120, 35, 30, carInstances[6], subscriptionInstances[6]),
                new Damage("Cracked windshield", 220, 50, 45, carInstances[7], subscriptionInstances[7])};

        damageRepository.saveAll(Arrays.asList(damageInstances));

        System.out.println("I was called 8");
    }
}
