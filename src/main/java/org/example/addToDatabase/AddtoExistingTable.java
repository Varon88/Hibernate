package org.example.addToDatabase;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AddtoExistingTable {
    public static void main(String[] args) {

        student apple = new student();
        apple.setId(4);
        apple.setName("imac");


        Configuration configuration = new Configuration().configure().addAnnotatedClass(student.class); //.configure sources the hibernate.cfg.xml file by default if no object isn
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction(); //A transaction is a unit of work that guarantees all changes are made to the database atomically

        session.save(apple);

        transaction.commit();
    }
}