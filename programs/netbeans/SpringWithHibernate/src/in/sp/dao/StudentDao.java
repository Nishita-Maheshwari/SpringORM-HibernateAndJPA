
package in.sp.dao;

import in.sp.beans.Student;

public interface StudentDao
{
    public void addStudent(Student std);
    public void updateStudent(Student std);
    public void deleteStudent(Student std);
    public void searchStudent(int id);
}
