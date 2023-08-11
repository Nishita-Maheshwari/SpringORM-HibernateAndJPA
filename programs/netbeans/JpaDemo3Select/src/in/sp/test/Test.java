
package in.sp.test;

import in.sp.entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test
{
    public static void main(String[] args) 
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("std");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        try
        {
            Student std = (Student) entityManager.find(Student.class, 101);
            System.out.println("Name : "+std.getName());
            System.out.println("Email : "+std.getEmail());
            System.out.println("Marks : "+std.getMarks());
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
        finally
        {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}