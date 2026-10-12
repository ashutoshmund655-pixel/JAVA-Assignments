class Person {
    String FirstName;
    String LastName;

    String getFirstName() {
        return FirstName;
    }

    String getLastName() {
        return LastName;
    }
}

class Employee extends Person {
    String jobTitle;
    String empId;

    String getEmployeeId() {
        return empId;
    }

    String getLastName() {
        return LastName + "(" + jobTitle + ")";
    }

    String getEmployeeInfo() {
        return FirstName + " " + getLastName() + " " + getEmployeeId();
    }
  }
    
    public static void main(String args[]) {
        Employee e = new Employee();

        e.empId = "Emp101";
        e.FirstName = "Piyush";
        e.LastName = "Pradhan";
        e.jobTitle = "Software Architect";

        System.out.println(e.getEmployeeInfo());
    }
}