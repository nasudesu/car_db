import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int experience;

    @OneToOne(mappedBy = "driver")
    private Car car;

    public Driver() {}

    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}