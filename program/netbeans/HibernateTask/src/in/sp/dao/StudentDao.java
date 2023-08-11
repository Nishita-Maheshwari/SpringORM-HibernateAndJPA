
package in.sp.dao;

import in.sp.beans.Student;

public interface StudentDao 
{
    public void add(Student std);
    public void update(int id);
    public void delete(int id);
    public void search(int id);
    public void getAllStudents();
}
