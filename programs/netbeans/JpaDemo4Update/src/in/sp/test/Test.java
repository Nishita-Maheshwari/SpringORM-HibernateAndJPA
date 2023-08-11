
package in.sp.test;

import in.sp.entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test
{
    public static void main(String[] args) 
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("std");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        try
        {
            entityTransaction.begin();
            
            Student std = (Student) entityManager.find(Student.class, 101);
            std.setMarks(79.25f);
            
            entityTransaction.commit();
            
            System.out.println("updation success");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
            entityTransaction.rollback();
            System.out.println("updation failed");
        }
        finally
        {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}