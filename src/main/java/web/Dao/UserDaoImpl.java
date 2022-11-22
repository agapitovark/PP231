package web.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import web.config.DBConfig;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    EntityManager em;
    private List<User> users;



    public List<User> getAllUsers() {
        return em.createQuery("FROM User", User.class).getResultList();
    }
    public User getUserByID(int id){
        return em.find(User.class, id);
    }

    public void saveUser(String name, String lastName, byte age) {
        em.joinTransaction();
        em.persist(new User(name, lastName, age));
    }

    public void removeUser(int id) {
        String HQL = "DELETE User us where id = :id";
        Query query = em.createQuery(HQL);
        query.setParameter("id", id);
    }
    public User changeUser (int id, String name, String lastName, byte age){
        User user =em.find(User.class, id);
        user.setAge(age);
        user.setName(name);
        user.setLastName(lastName);
        return user;
    }
}