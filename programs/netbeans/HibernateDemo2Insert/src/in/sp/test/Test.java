
package in.sp.test;

import in.sp.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
public class Test
{
    public static void main(String[] args)
    {
        Student std = new Student();
        std.setId(101);
        std.setName("aaa");
        std.setEmail("aaa@gmail.com");
        std.setGender("male");
        std.setCity("chandigarh");
        
        
        System.out.println("------- Application Started --------");
        
        Configuration cfg = new Configuration();
        cfg.configure("/in/sp/resources/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        session.save(std);
        transaction.commit();
        System.out.println("Student details inserted successfully");
        
        session.close();
        sessionFactory.close();
    }
}
*/

public class Test
{
    public static void main(String[] args)
    {
        Student std = new Student();
        std.setId(102);
        std.setName("bbb");
        std.setEmail("bbb@gmail.com");
        std.setGender("female");
        std.setCity("chandigarh");
        
        
        System.out.println("------- Application Started --------");
        
        Configuration cfg = new Configuration();
        cfg.configure("/in/sp/resources/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try
        {
            session.save(std);
            transaction.commit();
            System.out.println("Student details inserted successfully");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            //System.out.println(e);
            transaction.rollback();
            System.out.println("student details not inserted due to some error");
        }
        finally
        {
            session.close();
            sessionFactory.close();
        }
    }
}