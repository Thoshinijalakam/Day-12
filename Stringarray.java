import java.util.*;
public class Stringarray {
    public static void main(String args[]){
        String arr1[]={"Hello","Thoshini","jalakam"};
        String arr2[]={"jalakam","Hello","hai","enola"};
        Set<String>a=new HashSet<>();
        Set<String>b=new HashSet<>();
        for(String s:arr1)
        a.add(s);
        for(String s1:arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<String>u=new HashSet<>(a);
        u.addAll(b);
        System.out.println(u);
    }
    
}
/* [jalakam, Hello, Thoshini]
[jalakam, hai, Hello, enola]
[jalakam, hai, Hello, enola, Thoshini] */