
package in.sp.services;

import in.sp.beans.Student;

public interface StudentService
{
    public void addStudent(Student std);
    public void updateStudent(int id);
    public void deleteStudent(int id);
    public void searchStudent(int id);
    public void getAllStudents();
}
