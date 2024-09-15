import java.util.HashMap;
import java.util.Map;

class Employee{
    private int id;
    private String name;
    private int salary;

    private String position;

    public Employee(int id,String name, int salary, String position){
        this.id=id;
        this.name = name;
        this.salary = salary;
        this.position  = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return  "id=" + id + " name=" + name  + " salary=" + salary + " position=" + position;
    }
}


public class EmployeeWithHashMap {
    Map<Integer,Employee> list = new HashMap<>();

    public static void main(String[] args){
       int id=1,salary =242999;
       String name ="Roshan",department = "Developement";
       Employee employee = new Employee(id,name,salary,department);
        EmployeeWithHashMap employeeWithHashMap = new EmployeeWithHashMap();

        //add employee
        employeeWithHashMap.addEmployee(employee);

        // retrieve employee
        employeeWithHashMap.retrieveEmployee(1);


}
public void addEmployee(Employee employee){
        Employee employeeIs = new Employee(employee.getId(),employee.getName(),employee.getSalary(),employee.getPosition());
        list.put(employee.getId(),employeeIs);
        System.out.println("Employee added successfully: "+employeeIs);
}

public void retrieveEmployee(int id){
        for(Employee employee: list.values()){
            if(employee.getId()==id){
                System.out.println("Employee Details: ");
                System.out.println(employee.toString());
            }

        }
}


}
