import java.util.Scanner;
public class countNumberOfDigit{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
int count=0;
if(num==0)
count++;
while(num!=0){
count++;
num/=10;
}
System.out.println(count);

}}