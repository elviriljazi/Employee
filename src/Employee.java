public class Employee {
    String name;
    String surname;
    String UMCN;
    Date date;

    public Employee(String name, String surname, String UMCN, int date,int month,int year) {
        this.name = name;
        this.surname = surname;
        this.UMCN = UMCN;
        this.date = new Date(date,month,year);
    }
    public Employee(){
        this("","","000000",1,1,1990);
    }
    void print(){
        System.out.println("Emri:"+name+"\nMbiemri:"+surname+"\nNVAQ:"+UMCN+"\nDate: "+date.printDate());
    }

    public void add(String name, String surname, String UMCN, int date,int month,int year){
        new Employee(name,surname,UMCN,date,month,year);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUMCN(String UMCN) {
        this.UMCN = UMCN;
    }

    public void setDate(int date,int month,int year) {
        this.date = new Date(date,month,year);
    }
}
