
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
        System.out.println("------ application started ------");
        
        Configuration cfg = new Configuration();
        cfg.configure("/in/sp/resources/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try
        {
            Student std = new Student();
            std.setId(102);
            
            session.delete(std);
            transaction.commit();
            System.out.println("success");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("fail");
            transaction.rollback();
        }
        finally
        {
            session.close();
            sessionFactory.close();
        }
    }
}
