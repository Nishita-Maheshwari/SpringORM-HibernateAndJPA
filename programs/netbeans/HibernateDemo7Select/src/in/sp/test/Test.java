
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
        
        try
        {
            //Student std = (Student) session.load(Student.class, 102);
            //Student std = (Student) session.load("in.sp.beans.Student", 102);
            
            //Student std = (Student) session.get(Student.class, 101);
            Student std = (Student) session.get("in.sp.beans.Student", 101);
            
            System.out.println("Name : "+std.getName());
            System.out.println("Email : "+std.getEmail());
            System.out.println("Gender : "+std.getGender());
            System.out.println("City : "+std.getCity());
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("fail");
        }
        finally
        {
            session.close();
            sessionFactory.close();
        }
    }
}
