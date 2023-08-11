
package in.sp.dao;

import in.sp.entity.Student;

public interface StudentDao 
{
    public void insertStudent(Student std);
    public void searchStudent(int id);
    public void deleteStudent(int id);
    public void updateStudent(int id, float marks);
}
