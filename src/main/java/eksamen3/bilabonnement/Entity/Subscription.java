package eksamen3.bilabonnement.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "damage_id", nullable = false)
    private Damage damage;

    @ManyToOne
    @JoinColumn(name = "customer_username", nullable = false)
    private Customer customer;

    @Column(name = "date_purchased", length = 50, nullable = false)
    private String datePurchased;

    @Column(name = "start_subscription_date", length = 50, nullable = false)
    private String startSubscriptionDate;

    @Column(name = "end_subscription_date", length = 50, nullable = false)
    private String endSubscriptionDate;

    @Column(name = "delivery_date", length = 50, nullable = false)
    private String deliveryDate;

    @Column(name = "driven_km_subscription_start", length = 50, nullable = false)
    private int kmDrivenSubscriptionStart;

    @Column(name = "subscription_driven_km", length = 50, nullable = false)
    private int subscriptionDrivenKm;

    @Column(name = "agreed_km_subscription", length = 50, nullable = false)
    private int agreedKmSubscription;

    @Column(name = "subscription_periode", length = 50, nullable = false)
    private int subscriptionPeriode;

    @Column(name = "subscription_price_each_month", length = 50, nullable = false)
    private int subscriptionPriceEachMonth;

    @Column(name = "pickup_car_place", length = 50, nullable = false)
    private String pickupCarPlace;

    @Column(name = "return_car_place", length = 50, nullable = false)
    private String returnCarPlace;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime lastEdited;

    public Subscription(String datePurchased, String startSubscriptionDate, String endSubscriptionDate, String deliveryDate,
                        int kmDrivenSubscriptionStart, int subscriptionDrivenKm, int agreedKmSubscription, int subscriptionPeriode,
                        int subscriptionPriceEachMonth, String pickupCarPlace, String returnCarPlace, Car car, Damage damage, Customer customer) {
        this.datePurchased = datePurchased;
        this.startSubscriptionDate = startSubscriptionDate;
        this.endSubscriptionDate = endSubscriptionDate;
        this.deliveryDate = deliveryDate;
        this.kmDrivenSubscriptionStart = kmDrivenSubscriptionStart;
        this.subscriptionDrivenKm = subscriptionDrivenKm;
        this.agreedKmSubscription = agreedKmSubscription;
        this.subscriptionPeriode = subscriptionPeriode;
        this.subscriptionPriceEachMonth = subscriptionPriceEachMonth;
        this.pickupCarPlace = pickupCarPlace;
        this.returnCarPlace = returnCarPlace;
        this.car = car;
        this.damage = damage;
        this.customer = customer;
    }


    public Subscription () {

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

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(String datePurchased) {
        this.datePurchased = datePurchased;
    }

    public String getStartSubscriptionDate() {
        return startSubscriptionDate;
    }

    public void setStartSubscriptionDate(String startSubscriptionDate) {
        this.startSubscriptionDate = startSubscriptionDate;
    }

    public String getEndSubscriptionDate() {
        return endSubscriptionDate;
    }

    public void setEndSubscriptionDate(String endSubscriptionDate) {
        this.endSubscriptionDate = endSubscriptionDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getKmDrivenSubscriptionStart() {
        return kmDrivenSubscriptionStart;
    }

    public void setKmDrivenSubscriptionStart(int kmDrivenSubscriptionStart) {
        this.kmDrivenSubscriptionStart = kmDrivenSubscriptionStart;
    }

    public int getSubscriptionDrivenKm() {
        return subscriptionDrivenKm;
    }

    public void setSubscriptionDrivenKm(int subscriptionDrivenKm) {
        this.subscriptionDrivenKm = subscriptionDrivenKm;
    }

    public int getAgreedKmSubscription() {
        return agreedKmSubscription;
    }

    public void setAgreedKmSubscription(int agreedKmSubscription) {
        this.agreedKmSubscription = agreedKmSubscription;
    }

    public int getSubscriptionPeriode() {
        return subscriptionPeriode;
    }

    public void setSubscriptionPeriode(int subscriptionPeriode) {
        this.subscriptionPeriode = subscriptionPeriode;
    }

    public int getSubscriptionPriceEachMonth() {
        return subscriptionPriceEachMonth;
    }

    public void setSubscriptionPriceEachMonth(int subscriptionPriceEachMonth) {
        this.subscriptionPriceEachMonth = subscriptionPriceEachMonth;
    }

    public String getPickupCarPlace() {
        return pickupCarPlace;
    }

    public void setPickupCarPlace(String pickupCarPlace) {
        this.pickupCarPlace = pickupCarPlace;
    }

    public String getReturnCarPlace() {
        return returnCarPlace;
    }

    public void setReturnCarPlace(String returnCarPlace) {
        this.returnCarPlace = returnCarPlace;
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
        return "Subscription{" +
                "id=" + id +
                ", datePurchased='" + datePurchased + '\'' +
                ", startSubscriptionDate='" + startSubscriptionDate + '\'' +
                ", endSubscriptionDate='" + endSubscriptionDate + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", kmDrivenSubscriptionStart=" + kmDrivenSubscriptionStart +
                ", subscriptionDrivenKm=" + subscriptionDrivenKm +
                ", agreedKmSubscription=" + agreedKmSubscription +
                ", subscriptionPeriode=" + subscriptionPeriode +
                ", subscriptionPriceEachMonth=" + subscriptionPriceEachMonth +
                ", pickupCarPlace='" + pickupCarPlace + '\'' +
                ", returnCarPlace='" + returnCarPlace + '\'' +
                ", created=" + created +
                ", lastEdited=" + lastEdited +
                '}';
    }
}
