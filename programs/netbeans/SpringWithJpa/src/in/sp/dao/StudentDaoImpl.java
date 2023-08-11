
package in.sp.dao;

import in.sp.entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao
{
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional
    @Override
    public void insertStudent(Student std)
    {
        entityManager.persist(std);
        System.out.println("inserted successfully");
    }
    
    @Transactional
    @Override
    public void searchStudent(int id)
    {
        Student std = (Student) entityManager.find(Student.class, id);
        System.out.println("---------------------------------------");
        System.out.println("Name : "+std.getName());
        System.out.println("Email : "+std.getEmail());
        System.out.println("Marks : "+std.getMarks());
        System.out.println("---------------------------------------");
    }
    
    @Transactional
    @Override
    public void deleteStudent(int id)
    {
        Student std = (Student) entityManager.find(Student.class, id);
        entityManager.remove(std);
        System.out.println("deleted successfully");
    }
    
    @Transactional
    @Override
    public void updateStudent(int id, float marks)
    {
        Student std = (Student) entityManager.find(Student.class, id);
        std.setMarks(marks);
        System.out.println("updated successfully");
    }
}