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
        samsung.setId(1);
        //samsung.setTeacherName("acer");

        Configuration configuration = new Configuration().configure().addAnnotatedClass(teacher.class);
//        StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
//        serviceRegistryBuilder.addProperties();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(samsung);

        transaction.commit();

//        <property name="hbm2ddl.auto">create</property> --> This property is used within the hibernate.cfg.xml file to specify the function that should be carried out within the database
//                           --> in the above case since a table named teacher does not exist the table is created.
//        property name="show_sql">true</property> --> used to show the sql script in the compiler, ex - Hibernate: insert into teacher (teacherName,id) values (?,?)
    }

}
