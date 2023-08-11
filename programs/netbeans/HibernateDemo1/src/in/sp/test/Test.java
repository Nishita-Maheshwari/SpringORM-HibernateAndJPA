
package in.sp.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test 
{
    public static void main(String[] args) 
    {
        System.out.println("--------- Application Started ---------");
        
        try
        {
            Configuration cfg = new Configuration();
            cfg.configure("/in/sp/resources/hibernate.cfg.xml");
            
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            System.out.println(sessionFactory);
            
            System.out.println("Is connection opened : "+sessionFactory.isOpen());
            System.out.println("Is connection closed : "+sessionFactory.isClosed());
            
            sessionFactory.close();
            System.out.println("\n");
            
            System.out.println("Is connection opened : "+sessionFactory.isOpen());
            System.out.println("Is connection closed : "+sessionFactory.isClosed());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
