package C06.DefiningClasses.Exercise.P02_CompanyRoster;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Department {
    private String name;
    private List<Employee> employeeList;

    public Department() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return Collections.unmodifiableList(this.employeeList);
    }

    public double getAverageSalary() {
        double average = 0.0;
        for (Employee employee : employeeList) {
            average += employee.getSalary();
        }
        return average / employeeList.size();
    }
}
