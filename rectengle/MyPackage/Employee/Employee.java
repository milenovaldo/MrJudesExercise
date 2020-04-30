public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getId(){
        return this.id;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getName(){
        return this.getFirstname()+this.getLastname();
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int RaiseSalary(int percent){
        return this.salary * ((percent + 100)/100);
    }

    @Override
    public String toString() {
        return "Employee [id = " + this.id + " name = " +" "+ this.getName() + " salary = " + this.salary;
    }
}