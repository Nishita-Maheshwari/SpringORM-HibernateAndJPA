
package in.sp.test;

import in.sp.beans.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("deepak");
        emp.setEmail("deepak@gmail.com");
        
        
        Configuration cfg = new Configuration();
        cfg.configure("/in/sp/resources/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        int i = (Integer) session.save(emp);
        System.out.println("i : "+i);
        if(i == emp.getId())
        {
            System.out.println("employee inserted successfully");
            transaction.commit();
        }
        else
        {
            System.out.println("employee inseetion failed");
            transaction.rollback();
        }
        
        session.close();
        sessionFactory.close();
    }
}
