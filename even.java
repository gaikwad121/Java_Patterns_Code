import java.util.Scanner;
public class even{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
for(int i=1;i<=num;i++){
if(i%2==0){
continue;
}
System.out.println(i);
}}
}
