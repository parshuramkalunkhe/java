import java.util.ArrayList;
import java.util.Collections;

class EMP implements Comparable<EMP>{
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

    public int compareTo(EMP emp) {
        if (this.sal > emp.sal){
            return 1;
        } else if(this.sal < emp.sal){
            return -1;
        } else {
            return 0;
        }
    }
}

class Program_12 {
    public static void main(String[] args){
        ArrayList<EMP> emp = new ArrayList<EMP>();

        emp.add(new EMP(1, "SaiKiran", 25000, 22));
        emp.add(new EMP(2, "SaiTeja", 24000, 23));
        emp.add(new EMP(3, "Parshuram", 22000, 21));

        System.out.println("EMP Collections : " + emp);
        System.out.println();

        Collections.sort(emp);

        System.out.println("Sorting through sal.");
        for (EMP empO : emp) {
            System.out.println(empO);
        }
   }
}
