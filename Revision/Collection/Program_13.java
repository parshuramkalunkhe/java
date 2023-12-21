import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EMP{
    int empId;
    String name;
    double sal;
    int age;

    public EMP(int empId, String name, double sal, int age){
        this.empId = empId;
        this.name = name;
        this.sal = sal;
        this.age = age;
    }

    @Override
    public String toString(){
        return empId +  " " + name + " " + sal + " " + age;
    }
}

class SalComparator implements Comparator<EMP> {
    public int compare(EMP emp1, EMP emp2){
        if (emp1.sal > emp2.sal){
            return 1;
        } else if (emp1.sal < emp2.sal){
            return -1;
        } else {
            return 0;
        }
    }
}

class AgeComparator implements Comparator <EMP>{
     public int compare(EMP emp1, EMP emp2){
        if (emp1.age > emp2.age){
            return 1;
        } else if (emp1.age < emp2.age){
            return -1;
        } else {
            return 0;
        }
    }
}

class Program_13 {
    public static void main(String[] args){
        ArrayList<EMP> emp = new ArrayList<EMP>();

        emp.add(new EMP(1, "SaiKiran", 25000, 22));
        emp.add(new EMP(2, "SaiTeja", 24000, 23));
        emp.add(new EMP(3, "Parshuram", 22000, 21));

        System.out.println("EMP Collections : " + emp);
        System.out.println();

        System.out.println("Sorting Through Sal.");

        Collections.sort(emp, new SalComparator());

        for (EMP empObj : emp){
            System.out.println(empObj);
        }

        System.out.println();

        System.out.println("Sorting Through Age.");

        Collections.sort(emp, new AgeComparator());

        for (EMP empObj : emp){
            System.out.println(empObj);
        }

        System.out.println();
   }
}
