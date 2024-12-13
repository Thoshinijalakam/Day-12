import java.util.*;
public class Modifyingvaluekey {
    public static void main(String args[]){
        HashMap<String,String>a=new HashMap<>();
        a.put("SNo","01");
        a.put("SName","Thoshii");
        a.put("City","Tirupati");
        System.out.println(a);
        //modifying value for a key
        a.put("SNo","90");
        System.out.println(a);
        
    }
    
}
/* {SNo=01, SName=Thoshii, City=Tirupati}
{SNo=90, SName=Thoshii, City=Tirupati} */
