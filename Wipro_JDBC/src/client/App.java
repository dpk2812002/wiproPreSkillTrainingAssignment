package client;
import java.util.List;
import java.util.Scanner;
import exception.DeptError;
import model.department;
import service.DeptService;

public class App {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeptService service = new DeptService();

        while (true) {
            System.out.println("\n1. Add Department");
            System.out.println("2. Get Department by ID");
            System.out.println("3. Get All Departments");
            System.out.println("4. Update Department");
            System.out.println("5. Delete Department");
            System.out.println("6. Exit");
            
            System.out.print("Enter choice: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Location: ");
                    String loc = sc.nextLine();
                    service.addDepartment(new department(id, name, loc));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int finBydId = sc.nextInt();
                    try {
                        department dept = service.getDepartmentById(finBydId);
                        System.out.println(dept);
                    } catch (DeptError e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    List<department> list = service.getAllDepartments();
                    for (department d : list) {
                        System.out.println(d);
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to Update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Location: ");
                    String newLoc = sc.nextLine();
                    try {
                        service.updateDepartment(new department(uid, newName, newLoc));
                    } catch (DeptError e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to Delete: ");
                    int did = sc.nextInt();
                    try {
                        service.deleteDepartment(did);
                    } catch (DeptError e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}
