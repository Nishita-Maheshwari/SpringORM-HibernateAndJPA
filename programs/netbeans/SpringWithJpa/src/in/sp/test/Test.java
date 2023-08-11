
package in.sp.test;

import in.sp.dao.StudentDao;
import in.sp.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args)
    {
        Student std = new Student();
        std.setId(102);
        std.setName("bbb");
        std.setEmail("bbb@gmail.com");
        std.setMarks(73.33f);
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
        
        StudentDao studentDao = (StudentDao) context.getBean("studentDaoImpl");
        //studentDao.insertStudent(std);
        //studentDao.updateStudent(102, 83.55f);
        //studentDao.searchStudent(102);
        studentDao.deleteStudent(102);
    }
}
