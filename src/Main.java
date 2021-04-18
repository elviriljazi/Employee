public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee();
        employees[1] = new Employee();
        employees[0].print();
        employees[1].print();
        employees[0].add("Ivana","Ivanova","00011",1,1,1990);
        employees[1].setName("Petar");
        employees[1].setSurname("Petrov");
        employees[1].setUMCN("01010");
        employees[1].setDate(-1,-1,-1);
        Employee new1 = new Employee("Stavre","Stavrov","0101010",1,-1,1000);
        employees[0].print();
        employees[1].print();
        new1.print();
        new1.print();
        new1.print();
        new1.print();



    }

}
