// Q. 36. Explain working of duplicate object?

class CustomException extends Exception {
    String message = "Custom Exception";

    CustomException(String message) {
        this.message = message;
    }
}

interface CloneInterface {}

class Student implements CloneInterface {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollno + " " + name;
    }
}

class Program_9 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Bikash");
        System.out.println(s1);

        if (s1 instanceof CloneInterface) {
            // This check won't pass because s1 is not being cloned, it's just being assigned to s2
            Object s2 = s1;
            System.out.println(s2);
        } else {
            try {
                throw new CustomException("Duplicate Object is Not Allowed.");
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }
    }
}
