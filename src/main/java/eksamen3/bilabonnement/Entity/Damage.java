package eksamen3.bilabonnement.Entity;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Damage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "subscription_id", nullable = false)
    private Subscription subscription;

    @Column (name = "car_damage", length = 50, nullable = false)
    private String carDamage;

    @Column (name = "reparation_cost", length = 50, nullable = false)
    private int reparationCost;

    @Column (name = "cleaning_cost", length = 50, nullable = false)
    private int cleaningCost;

    @Column (name = "late_return_cost", length = 50, nullable = false)
    private int lateReturnCost;


    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime lastEdited;

    public Damage(String carDamage, int reparationCost, int cleaningCost, int lateReturnCost, Car car, Subscription subscription) {
        this.carDamage = carDamage;
        this.reparationCost = reparationCost;
        this.cleaningCost = cleaningCost;
        this.lateReturnCost = lateReturnCost;
        this.car = car;
        this.subscription = subscription;
    }

    public Damage () {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public String getCarDamage() {
        return carDamage;
    }

    public void setCarDamage(String carDamage) {
        this.carDamage = carDamage;
    }

    public int getReparationCost() {
        return reparationCost;
    }

    public void setReparationCost(int reparationCost) {
        this.reparationCost = reparationCost;
    }

    public int getCleaningCost() {
        return cleaningCost;
    }

    public void setCleaningCost(int cleaningCost) {
        this.cleaningCost = cleaningCost;
    }

    public int getLateReturnCost() {
        return lateReturnCost;
    }

    public void setLateReturnCost(int lateReturnCost) {
        this.lateReturnCost = lateReturnCost;
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
        return "Damage{" +
                "id=" + id +
                ", carDamage='" + carDamage + '\'' +
                ", reparationCost=" + reparationCost +
                ", cleaningCost=" + cleaningCost +
                ", lateReturnCost=" + lateReturnCost +
                ", created=" + created +
                ", lastEdited=" + lastEdited +
                '}';
    }
}
