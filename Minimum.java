import java.io.*;
import java.util.*;
import java.lang.Math;
class Minimum{
public static void main(String...aaa){
Scanner s=new Scanner(System.in);
System.out.println("enter size of array");
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.println("enter array elements");
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.println("enter value to be subtracted:");
int c=s.nextInt(),k=0;
for(int i=0;i<n;i++)
b[i]=Math.abs(a[i]-c);
for(int i=0;i<n;i++)
k=k+b[i];
System.out.println("minimum absolute sum "+k);
}}