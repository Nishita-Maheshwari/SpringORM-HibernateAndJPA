
package in.sp.test;

import in.sp.entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
public class Test
{
    public static void main(String[] args) 
    {
        Student std = new Student();
        std.setId(101);
        std.setName("aaa");
        std.setEmail("aaa@gmail.com");
        std.setMarks(92.78f);
        
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("std");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        entityTransaction.begin();
        entityManager.persist(std);
        entityTransaction.commit();
        
        System.out.println("success");
        
        entityManager.close();
        entityManagerFactory.close();
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
        std.setMarks(87.45f);
        
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("std");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        try
        {
            entityTransaction.begin();
            entityManager.persist(std);
            entityTransaction.commit();
            
            System.out.println("insertion success");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
            entityTransaction.rollback();
            System.out.println("insertion failed");
        }
        finally
        {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}