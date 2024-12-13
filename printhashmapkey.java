import java.util.*;
public class printhashmapkey {
    public static void main(String args[]){
        HashMap<String,String>a=new HashMap<>();
        a.put("SNo","01");
        a.put("SName","Thoshii");
        System.out.println(a);
        if(a.containsKey("SName")){
            String d=a.get("S Name");
            System.out.println(d);
        }
    }
    
}
/* {SNo=01, SName=Thoshii}
null */