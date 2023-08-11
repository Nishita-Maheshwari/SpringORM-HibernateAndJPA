
package in.sp.test;

import in.sp.beans.Student;
import in.sp.services.StudentServiceImpl;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Student std = new Student();
        
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
        
        int status=1;
        while(status==1)
        {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter your choice :\n1. insert\n2. update\n3. delete\n4. search\n5. Get All Students\n6. Exit");
            int choice = scanner.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter id :");
                    int id = scanner.nextInt();
                    
                    System.out.println("Enter name :");
                    String name = scanner.next();
                    
                    System.out.println("Enter email :");
                    String email=scanner.next();
                    
                    System.out.println("Enter gender :");
                    String gender = scanner.next();
                    
                    System.out.println("Enter city :");
                    String city = scanner.next();
                    
                    std.setId(id);
                    std.setName(name);
                    std.setEmail(email);
                    std.setGender(gender);
                    std.setCity(city);
                    
                    studentServiceImpl.addStudent(std);
                    break;
                case 2:
                    System.out.println("Enter id you want to update");
                    int id1 = scanner.nextInt();
                    studentServiceImpl.updateStudent(id1);
                    break;
                case 3:
                    System.out.println("Enter id you want to delete");
                    int id2 = scanner.nextInt();
                    studentServiceImpl.deleteStudent(id2);
                    break;
                case 4:
                    System.out.println("Enter id you want to search");
                    int id3 = scanner.nextInt();
                    studentServiceImpl.searchStudent(id3);
                    break;
                case 5:
                    studentServiceImpl.getAllStudents();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice, please enter again");
            }
            
            System.out.println("Do you want to continue (Press 1 for yes or 2 for no)");
            status = scanner.nextInt();
        }
        System.exit(0);
    }
}
