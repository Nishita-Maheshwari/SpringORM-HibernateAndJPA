
package in.sp.test;

import in.sp.beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test
{
    public static void main(String[] args)
    {
        Student std = new Student();
        std.setId(103);
        std.setName("ccc");
        std.setEmail("ccc@gmail.com");
        std.setGender("male");
        std.setCity("pune");
        
        
        System.out.println("------- Application Started --------");
        
        Configuration cfg = new Configuration();
        cfg.configure("/in/sp/resources/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try
        {
            session.saveOrUpdate(std);
            transaction.commit();
            System.out.println("success");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            //System.out.println(e);
            transaction.rollback();
            System.out.println("fail");
        }
        finally
        {
            session.close();
            sessionFactory.close();
        }
    }
}