import java.util.*;
public class Acceptinghashset {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashSet<String>a=new HashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String S=sc.next();
            a.add(S);
        }
        System.out.println(a);
    }
    
}
/* 5
23
45
789
123
4556
[23, 45, 123, 789, 4556] */
