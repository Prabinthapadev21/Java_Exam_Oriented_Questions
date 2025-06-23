package Final_Examination.set_1;
//Create a class Employee with fields id, name, salary.
// Create an array of 5 objects and display the employee with the highest salary.
class Employee
{
    int id;
    String name;
    int salary;
    public Employee(int id,String name,int salary)
    {
        this.id=id;
        this.name = name;
        this.salary=salary;
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e[] = new Employee[5];
        e[0] = new Employee(1, "Alice", 50000);
        e[1] = new Employee(2, "Bob", 60000);
        e[2] = new Employee(3, "Charlie", 70000);
        e[3] = new Employee(4, "David", 80000);
        e[4] = new Employee(5, "Eve", 90000);
        Employee highestSalaryEmployee = e[0];
        for (int i = 1; i < e.length; i++) {
            if (e[i].salary > highestSalaryEmployee.salary) {
                highestSalaryEmployee = e[i];
            }
        }
        System.out.println("Employee with highest salary:");
        System.out.println("ID: " + highestSalaryEmployee.id);
        System.out.println("Name: " + highestSalaryEmployee.name);
        System.out.println("Salary: " + highestSalaryEmployee.salary);
    }
}
