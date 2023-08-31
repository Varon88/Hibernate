package EmbeddedFunctionality;

import createNewtable.teacher;
import createNewtable.teacherName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedFunctions {
    public static void main(String[] args) {

        teacherName teacherName = new teacherName();
        teacherName.setfName("apple");
        teacherName.setlName("MacBook Pro 13");

        teacher teacher = new teacher();
        teacher.setTeacherName(teacherName);
        teacher.setId(0);

        Configuration configuration = new Configuration().configure().addAnnotatedClass(teacher.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(teacher);

        transaction.commit();
    }
}
