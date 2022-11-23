package web.Dao;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;



@Component
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;
    private List<User> users;


    public List<User> getAllUsers() {
        return em.createQuery("FROM User", User.class).getResultList();
    }

    public User getUserByID(int id) {
        return em.find(User.class, id);
    }
    @Transactional
    public void saveUser(User user) {

        em.persist(user);

    }

    public void removeUser(int id) {
        String HQL = "DELETE User us where id = :id";
        Query query = em.createQuery(HQL);
        query.setParameter("id", id);
    }

    public void changeUser(int id, User updateUser) {
        User usertobeupdated = getUserByID(id);
        usertobeupdated.setName(updateUser.getName());
        usertobeupdated.setLastName(updateUser.getLastName());
        usertobeupdated.setAge(updateUser.getAge());



    }
}