package DatabaseRelationships;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Relationships {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setId(1);
        laptop.setName("MacBook Pro 13");

        Laptop laptop1 = new Laptop();
        laptop1.setId(2);
        laptop1.setName("Dell Latitude E6520");

        Person person = new Person();
        person.setName("Varon Rasiah");
        person.setId(8);
        person.getLaptop().add(laptop);
        person.getLaptop().add(laptop1);

        laptop.getPerson().add(person);
        laptop1.getPerson().add(person);

        Person person1 = new Person();
        person1.setName("Reshan Samarakone");
        person1.setId(1);
        person1.getLaptop().add(laptop);

        laptop.getPerson().add(person1);


        Configuration config = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(laptop);
        session.save(laptop1);
        session.save(person);
        session.save(person1);

        transaction.commit();

    }

}
