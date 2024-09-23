import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CarDAO {

private static final EntityManagerFactory em = Persistence.createEntityManagerFactory("car_driver");

    public void saveCar(Car car) {
        EntityManager entityManager = em.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(car);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void updateCar(Car car) {
        EntityManager entityManager = em.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(car);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
