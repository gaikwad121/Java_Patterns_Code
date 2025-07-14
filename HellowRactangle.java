import java.util.Scanner;
public class HellowRactangle{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
for(int i=1;i<=num;i++){
for(int j=1;j<=num;j++){
if(i==num || j==num || i==1|| j==1){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}}
}