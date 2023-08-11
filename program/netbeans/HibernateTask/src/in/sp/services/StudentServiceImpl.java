
package in.sp.services;

import in.sp.beans.Student;
import in.sp.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService
{
    StudentDaoImpl studentDaoImpl;
    
    public StudentServiceImpl()
    {
        studentDaoImpl = new StudentDaoImpl();
    }
    
    @Override
    public void addStudent(Student std) 
    {
        studentDaoImpl.add(std);
    }

    @Override
    public void updateStudent(int id)
    {
        studentDaoImpl.update(id);
    }

    @Override
    public void deleteStudent(int id)
    {
        studentDaoImpl.delete(id);
    }

    @Override
    public void searchStudent(int id) 
    {
        studentDaoImpl.search(id);
    }

    @Override
    public void getAllStudents()
    {
        studentDaoImpl.getAllStudents();
    }
}
