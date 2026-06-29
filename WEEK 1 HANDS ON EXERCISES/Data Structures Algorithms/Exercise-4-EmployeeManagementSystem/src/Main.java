public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement();

        management.addEmployee(new Employee(101, "Nikisha", "Developer", 60000));
        management.addEmployee(new Employee(102, "Rahul", "Tester", 50000));
        management.addEmployee(new Employee(103, "Priya", "Manager", 80000));

        System.out.println("\nEmployees:");

        management.displayEmployees();

        System.out.println("\nSearching Employee 102:");

        Employee employee = management.searchEmployee(102);

        if (employee != null) {
            System.out.println(employee);
        }

        System.out.println("\nDeleting Employee 101:");

        management.deleteEmployee(101);

        System.out.println("\nEmployees After Deletion:");

        management.displayEmployees();
    }
}