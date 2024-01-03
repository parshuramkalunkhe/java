public class Program_4 {
    public static void main(String[] args){
        Employee e = new Employee("ABC123");
        String s = e.getPanNumber();
        System.out.println("Pan NUmber : " + s);
    }
}

public final class Employee {
    final String panNumber;
    public Employee(String panNumber){
        this.panNumber = panNumber;
    }
    public String getPanNumber(){
        return panNumber;
    }
}

