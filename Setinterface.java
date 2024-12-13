import java.util.*;
public class Setinterface {
    public static void main(String args[]){
    LinkedHashSet<String>a=new LinkedHashSet<>();
    a.add("Hello");
    a.add("Hello");
    a.add("Students");
    a.add("Rajesh");
    a.add("students");
    System.out.println(a);
    a.remove("Rajesh");
    System.out.println(a);
    a.clear();
    System.out.println(a);    
}
}
/* [Hello, Students, Rajesh, students]
[Hello, Students, students]
[] */