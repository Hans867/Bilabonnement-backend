package eksamen3.bilabonnement.Repositories;

import eksamen3.bilabonnement.Entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
