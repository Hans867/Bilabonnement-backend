package eksamen3.bilabonnement.Api;

import eksamen3.bilabonnement.Entity.Damage;
import eksamen3.bilabonnement.Repositories.DamageRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/damages")
public class DamageController {

    private final DamageRepository damageRepository;

    public DamageController (DamageRepository damageRepository) {
        this.damageRepository = damageRepository;
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<Damage>> getAllDamages() {
        List<Damage> damages = damageRepository.findAll();
        return ResponseEntity.ok(damages);
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Damage>> getDamageById(@PathVariable long id) {
        Optional<Damage> damage = damageRepository.findById(id);
        if (damage.isPresent()) {
            return ResponseEntity.ok(damage);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Create
    @PostMapping
    public ResponseEntity<Damage> createDamage(@RequestBody Damage damage) {
        Damage savedDamage = damageRepository.save(damage);
        return ResponseEntity.ok(savedDamage);
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Damage> updateDamage(@PathVariable long id, @RequestBody Damage damage) {
        if (damageRepository.existsById(id)) {
            Damage updatedDamage = damageRepository.save(damage);
            return ResponseEntity.ok(updatedDamage);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDamage(@PathVariable long id) {
        if (damageRepository.existsById(id)) {
            damageRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


