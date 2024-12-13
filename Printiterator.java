import java.util.*;
public class Printiterator {
    public static void main(String args[]){
        LinkedHashSet<String>a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Rajesh");
        a.add("Students");
        Iterator itr=a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
    
}
/* Hello 
Students 
Rajesh */