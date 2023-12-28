// Q. 35. How to create duplicate object?
// but the duplicate object should not change the data after changing the data of clone object

// Using marker interface - 1. Cloneable, 2. Serializable, 3. Remote
class Student implements Cloneable {

    int rollno;
    String name;

    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString(){
        return rollno + " " + name;
    }

}

class Program_8 {

    public static void main(String[] args){
        try {
            Student s1 = new Student(1, "Bikash");
            System.out.println(s1);
            Object s2 = s1.clone();
            System.out.println(s2);
        } catch (CloneNotSupportedException ce) {
            System.out.println("No Duplicate Object is Allowed.");
        }
        
    }

}
