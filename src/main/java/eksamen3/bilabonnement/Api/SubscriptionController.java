package eksamen3.bilabonnement.Api;

import eksamen3.bilabonnement.Entity.Car;
import eksamen3.bilabonnement.Entity.Subscription;
import eksamen3.bilabonnement.Repositories.SubscriptionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    private final SubscriptionRepository subscriptionRepository;

    SubscriptionController (SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<Subscription>> getAllSubscriptions() {
        List<Subscription> subscriptions = subscriptionRepository.findAll();
        return ResponseEntity.ok(subscriptions);
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Subscription>> getSubscriptionById(@PathVariable long id) {
        Optional<Subscription> subscription = subscriptionRepository.findById(id);
        if (subscription.isPresent()) {
            return ResponseEntity.ok(subscription);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Create
    @PostMapping
    public ResponseEntity<Subscription> createCar(@RequestBody Subscription subscription) {
        Subscription savedSubscription = subscriptionRepository.save(subscription);
        return ResponseEntity.ok(savedSubscription);
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Subscription> updateSubscription(@PathVariable long id, @RequestBody Subscription subscription) {
        if (subscriptionRepository.existsById(id)) {
            subscription.setId(id); // Set the ID to ensure an update
            Subscription updatedSubscription = subscriptionRepository.save(subscription);
            return ResponseEntity.ok(updatedSubscription);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubscription(@PathVariable long id) {
        if (subscriptionRepository.existsById(id)) {
            subscriptionRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
