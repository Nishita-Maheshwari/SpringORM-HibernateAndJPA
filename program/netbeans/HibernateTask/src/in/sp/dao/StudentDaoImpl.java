
package in.sp.dao;

import in.sp.beans.Student;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDaoImpl implements StudentDao
{
    static Session session;
    static Transaction transaction;
    
    //-----------configuration and return SessionFactory instance ----------
    private static SessionFactory getSessionFactory()
    {
        Configuration cfg = new Configuration();
        cfg.configure("/in/sp/resources/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        return sessionFactory;
    }
    
    //----------open session and transaction----------------
    private static Session openSessionWithTransaction()
    {
        if(session == null || !session.isOpen())
        {
            session = getSessionFactory().openSession();
            transaction = session.beginTransaction();
        }
        else
        {
            transaction = session.beginTransaction();
        }
        return session;
    }
    
    //-----------open session without transaction-----------
    private static Session openSession()
    {
        session = getSessionFactory().openSession();
        return session;
    }
    private static void closeSession()
    {
        session.close();
    }
    
    
    @Override
    public void add(Student std)
    {
        try
        {
            openSessionWithTransaction().save(std);
            transaction.commit();
            System.out.println("======== student added successfully =======");
        }
        catch(Exception e)
        {
            System.out.println(e);
            transaction.rollback();
            System.out.println("======== student not added due to some error =======");
        }
        finally
        {
            closeSession();
        }
    }

    @Override
    public void update(int id)
    {
        try
        {
            Student std1 = (Student)openSession().load(Student.class, id);
            std1.setCity("new york");
            openSessionWithTransaction().update(std1);
            transaction.commit();
            System.out.println("======== student updated successfully =======");
        }
        catch(Exception e)
        {
            System.out.println(e);
            transaction.rollback();
            System.out.println("======== student not updated due to some error =======");
        }
        finally
        {
            closeSession();
        }
    }

    @Override
    public void delete(int id) 
    {
        try
        {
            Session session1 = openSessionWithTransaction();
            Student std = new Student();
            std.setId(id);
            session1.delete(std);
            transaction.commit();
            System.out.println("======== student deleted successfully =======");
        }
        catch(Exception e)
        {
            System.out.println(e);
            transaction.rollback();
            System.out.println("======== student not deleted due to some error =======");
        }
        finally
        {
            closeSession();
        }
    }

    @Override
    public void search(int id)
    {
        try
        {
            Student std1 = (Student)openSessionWithTransaction().load(Student.class, id);
            System.out.println("======== Student Details =======");
            System.out.println("Name : "+std1.getName());
            System.out.println("Email : "+std1.getEmail());
            System.out.println("Gender : "+std1.getGender());
            System.out.println("City : "+std1.getCity());
            System.out.println("==================================");
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("======== student details not retrieved due to some error =======");
        }
        finally
        {
            closeSession();
        }
    }

    @Override
    public void getAllStudents()
    {
        try
        {
            List<Student> list = openSessionWithTransaction().createCriteria(Student.class).list();
            System.out.println("======== Student List =======\n");
            for(Student std : list)
            {
                System.out.println("Name : "+std.getName());
                System.out.println("Email : "+std.getEmail());
                System.out.println("Gender : "+std.getGender());
                System.out.println("City : "+std.getCity());
                System.out.println("-----------------------------------------");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("======== student details not retrieved due to some error =======");
        }
        finally
        {
            closeSession();
        }
    }
}
