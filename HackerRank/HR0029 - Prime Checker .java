import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.math.BigInteger;

class Prime{
    
    boolean isPrime(int n){
        BigInteger bi = BigInteger.valueOf(n);
        return bi.isProbablePrime(20);
    }
    
    void checkPrime(int...nums){

        for(int i : nums){
            if(isPrime(i))System.out.print(i+" ");
        }
        System.out.println();
    }
}

public class Solution {

    public static void main(String[] args) {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int n3=Integer.parseInt(br.readLine());
        int n4=Integer.parseInt(br.readLine());
        int n5=Integer.parseInt(br.readLine());
        Prime ob=new Prime();
        ob.checkPrime(n1);
        ob.checkPrime(n1,n2);
        ob.checkPrime(n1,n2,n3);
        ob.checkPrime(n1,n2,n3,n4,n5);    
        Method[] methods=Prime.class.getDeclaredMethods();
        Set<String> set=new HashSet<>();
        boolean overload=false;
        for(int i=0;i<methods.length;i++)
        {
            if(set.contains(methods[i].getName()))
            {
                overload=true;
                break;
            }
            set.add(methods[i].getName());
            
        }
        if(overload)
        {
            throw new Exception("Overloading not allowed");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
