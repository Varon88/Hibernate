package Extraction;

import org.example.addToDatabase.student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Extraction {
    public static void main(String[] args){


        student stu = new student();
        Configuration configuration = new Configuration().configure().addAnnotatedClass(student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        for(int i = 0; i <= 4; i++) {
            stu = session.get(student.class, i);
            System.out.println(stu);
        }

        transaction.commit();

    }
}
