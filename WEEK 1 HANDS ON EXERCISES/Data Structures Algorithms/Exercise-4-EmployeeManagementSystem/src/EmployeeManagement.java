public class EmployeeManagement {

    Employee[] employees = new Employee[10];
    int count = 0;

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Employee added successfully.");
        }
    }

    // Search Employee
    public Employee searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }

        return null;
    }

    // Traverse Employees
    public void displayEmployees() {

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee deleted successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}