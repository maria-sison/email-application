import java.util.ArrayList;

class Employee {
    String firstName, lastName, emailAddress, phoneNumber;
    int employeeID;
    Status status;

    public Employee(String firstName, String lastName, String emailAddress, String phoneNumber, Status status, ArrayList<Employee> EmployeeList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.employeeID = EmployeeList.size();
    }

    enum Status {
        VERIFIED, TRAINING
    }

    @Override
    public String toString() {
        String fullName = firstName + " " + lastName;
        return "Employee:\n" +
                "Full name: " + fullName + "\n" +
                "Email address: " + emailAddress + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Status: " + status + "\n" +
                "Employee ID: " + employeeID + "\n" +
                "----------\n";
    }
}

class Schedule {
    Days days;
    Shifts shifts;

    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    enum Shifts {
        OPEN, CLOSE
    }

    public Schedule(Days d, Shifts sh) {
        this.days = d;
        this.shifts = sh;
    }

    @Override
    public String toString() {
        return "Schedule: \n" +
                "Day: " + days + "\n" +
                "Shift: " + shifts + "\n";
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> EmployeeList = new ArrayList<Employee>();

        Employee e = new Employee("John", "Smith", "john@smith.com", "780-000-0000", Employee.Status.VERIFIED, EmployeeList);
        EmployeeList.add(e);
        System.out.println(e);

        Employee f = new Employee("Mary", "Jane", "mary@jane.com", "780-111-1111", Employee.Status.TRAINING, EmployeeList);
        EmployeeList.add(f);
        System.out.println(f);

        Schedule s = new Schedule(Schedule.Days.SUNDAY, Schedule.Shifts.OPEN);
        System.out.println(s);
    }
}