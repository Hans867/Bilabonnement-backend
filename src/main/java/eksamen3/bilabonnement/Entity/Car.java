package eksamen3.bilabonnement.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "car_brand", length = 50, nullable = false)
    private String brand;

    @Column(name = "car_purchase_price")
    private int purchasePrice;

    @Column(name = "car_fuel", length = 50,nullable = false)
    private String carFuel;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime lastEdited;

    public Car(String brand, int purchasePrice, String carFuel ) {
        this.brand = brand;
        this.purchasePrice = purchasePrice;
        this.carFuel = carFuel;
    }

    public Car () {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getCarFuel() {
        return carFuel;
    }

    public void setCarFuel(String carFuel) {
        this.carFuel = carFuel;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(LocalDateTime lastEdited) {
        this.lastEdited = lastEdited;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", carFuel='" + carFuel + '\'' +
                ", created=" + created +
                ", lastEdited=" + lastEdited +
                '}';
    }
}