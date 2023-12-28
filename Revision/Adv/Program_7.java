// Q.34 How to create duplicate object?

class Student {

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

class Question_34 {

    public static void main(String[] args){

        Student s1 = new Student(1, "Bikash");
        System.out.println(s1);

        object s2 = s1;
        System.out.println(s2);

        System.out.println("---------------");
        s1.rollno = 4;
        System.out.println(s1);
        System.out.println(s2);
    }
}
