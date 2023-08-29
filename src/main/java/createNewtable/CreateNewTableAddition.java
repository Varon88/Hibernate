package createNewtable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Version;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class CreateNewTableAddition {
    public static void main(String[] args){

        teacher samsung = new teacher();
        samsung.setId(0);
        samsung.setTeacherName("asus");

        Configuration configuration = new Configuration().configure().addAnnotatedClass(teacher.class);
        StandardServiceRegistryBuilder =
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(samsung);

        transaction.commit();

//        String version = Version.getVersionString();
//        System.out.println(version);
    }

}
