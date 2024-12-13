import java.util.*;
public class Removingvaluekey {
    public static void main(String args[]){
        HashMap<String,String>a=new HashMap<>();
        a.put("SNo","01");
        a.put("SName","Thoshii");
        a.put("City","Tirupati");
        System.out.println(a);
        //Removing value for a key
        a.remove("SName");
        System.out.println(a);
        a.clear();
        System.out.println(a);
        
    }
    
}
/* {SNo=01, SName=Thoshii, City=Tirupati}
{SNo=01, City=Tirupati}
{} */