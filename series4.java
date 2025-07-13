import java.util.Scanner;
public class series4{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
int h=1;
for(int i=num-1;i>=1;i--){
if(num%i==0){
h=i;
break;
}}
System.out.println(h);
}}
