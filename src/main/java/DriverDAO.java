import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DriverDAO {

    private static final EntityManagerFactory em = Persistence.createEntityManagerFactory("car_driver");

    public void saveDriver(Driver driver) {
        EntityManager entityManager = em.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(driver);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void updateDriver(Driver driver) {
        EntityManager entityManager = em.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(driver);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
