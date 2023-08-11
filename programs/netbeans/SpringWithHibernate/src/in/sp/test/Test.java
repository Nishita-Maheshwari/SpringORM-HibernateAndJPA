
package in.sp.test;

import in.sp.beans.Student;
import in.sp.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main(String[] args) 
    {
        Student std = new Student();
        std.setId(103);
        std.setName("ccc");
        std.setEmail("ccc@gmail.com");
        std.setGender("female");
        std.setCity("banglore");
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
        
        StudentDao studentDao = (StudentDao) context.getBean("studentDaoImpl");
        //studentDao.addStudent(std);
        //studentDao.updateStudent(std);
        //studentDao.deleteStudent(std);
        studentDao.searchStudent(102);
    }
}
