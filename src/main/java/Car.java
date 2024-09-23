import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    @OneToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    public Car() {}

    public Car(String model) {
        this.model = model;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}