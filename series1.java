import java.util.Scanner;
public class series1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
for(int i=1;i<=num;i+=3){
System.out.println(i);
}}}