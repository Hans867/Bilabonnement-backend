package eksamen3.bilabonnement.Api;

import eksamen3.bilabonnement.Entity.Car;
import eksamen3.bilabonnement.Repositories.CarRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> cars = carRepository.findAll();
        return ResponseEntity.ok(cars);
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Car>> getCarById(@PathVariable long id) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            return ResponseEntity.ok(car);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Create
    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        Car savedCar = carRepository.save(car);
        return ResponseEntity.ok(savedCar);
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable long id, @RequestBody Car car) {
        if (carRepository.existsById(id)) {
            car.setId(id); // Set the ID to ensure an update
            Car updatedCar = carRepository.save(car);
            return ResponseEntity.ok(updatedCar);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
