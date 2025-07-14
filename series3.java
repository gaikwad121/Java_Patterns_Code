import java.util.Scanner;
public class series3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
//for(int i=num-1;i<=num;i++){
// following is for finding a highest factor than itself
int h=1;
for(int i=1;i<num;i++){

if(num%i==0){
 h=i;
}}
System.out.println("The highest factor rather  than it's self"+" "+h);
}}