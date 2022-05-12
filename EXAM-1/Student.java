
class Student {

    String name;
    int classYear;
    public int classyear;
}

class Test {

    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();

        st1.name = "vijay dhone";
        st2.name = "Jay pawar";
        st3.classYear = 12;
        st4.classyear = 11;

        System.out.println("Student 1 Name: " + st1.name + " " + st3.classYear);
        System.out.println("Student 2 Name: " + st2.name + " " + st4.classyear);
    }
}