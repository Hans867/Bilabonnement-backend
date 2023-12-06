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



    }
}

