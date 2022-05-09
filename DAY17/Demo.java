class Student{
  
    int id;
    String name;
    Student(int a, String b){
 

 
    name

    } 
  
    @

    publi c  St ring toString()
    {

        return" ("+id+" ,"+name+")";



    } 
@Override  
p  
  
    int code; 
    code=name.hashCode()+id;  
    return code;    
    
}@Override

    boolean f=fals e ;
    Student st=(Student)o b j;


    f=true;
}
return f;

}
public class Demo {
    public static void main(String[] args){
        HashSet<Student>hs;
        hs=new Hashcode<>();
        Student st1=new Student(1,"A");
        Student st2=new Student(1,"A");

        hs.add(st1);
        hs.add(st2);
        System.out.println(hs);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }
}