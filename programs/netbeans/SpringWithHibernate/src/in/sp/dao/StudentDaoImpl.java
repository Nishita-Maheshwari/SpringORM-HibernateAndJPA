
package in.sp.dao;

import in.sp.beans.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class StudentDaoImpl implements StudentDao
{
    private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
    @Transactional
    @Override
    public void addStudent(Student std)
    {
        try
        {
            hibernateTemplate.save(std);
            System.out.println("insertion success");
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("insertion failed");
        }
    }

    @Transactional
    @Override
    public void updateStudent(Student std)
    {
        try
        {
            hibernateTemplate.update(std);
            System.out.println("updation success");
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("updation failed");
        }
    }
    
    @Transactional
    @Override
    public void deleteStudent(Student std)
    {
        try
        {
            hibernateTemplate.delete(std);
            System.out.println("deletion success");
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("deletion failed");
        }
    }
    
    @Transactional
    @Override
    public void searchStudent(int id)
    {
        try
        {
            Student std = (Student) hibernateTemplate.get(Student.class, id);
            System.out.println("Name : "+std.getName());
            System.out.println("Email : "+std.getEmail());
            System.out.println("Gender : "+std.getGender());
            System.out.println("City : "+std.getCity());
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("search failed");
        }
    }
}
