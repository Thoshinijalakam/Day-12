import java.util.*;
public  class Arraymap{
    public static void main(String args[]){
        int arr[]={77,8,9,5,6,77,8,9,9,8};
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int a1:arr)
        {
            if(a.containsKey(a1)){
                a.put(a1,a.get(a1)+1);
            }else{
                a.put(a1,1);
            }
        }
        System.out.println(a);
    }
}
/* {5=1, 6=1, 8=3, 9=3, 77=2} */