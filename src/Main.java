import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee());
        employees.add(new Employee());
        employees.get(0).print();
        employees.get(1).print();
        employees.get(0).add("Ivana","Ivanova","00011",1,1,1990);
        employees.get(1).setName("Petar");
        employees.get(1).setSurname("Petrov");
        employees.get(1).setUMCN("01010");
        employees.get(1).setDate(-1,-1,-1);
        Employee new1 = new Employee("Stavre","Stavrov","0101010",1,-1,1000);
        employees.get(10).print();
        employees.get(1).print();
        new1.print();
        new1.print();


    }

}
