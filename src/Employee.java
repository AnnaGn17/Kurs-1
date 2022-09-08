public class Employee {
    String fullName;
    int section;
    int salary;
    static int counter  = 1;
    int id = counter++;

    public Employee(String fullName, int section, int salary) {
        this.fullName = fullName;
        this.section = section;
        this.salary = salary;
        this.id = id;

    }


    public String getFullName() {
        return fullName;
    }

    public int getSection() {
        return section;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return this.id;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString (){
       return "ФИО: " + fullName + ", отдел: " + section + ", зарплата: " + salary + ", ID: " + id;
    }
}

