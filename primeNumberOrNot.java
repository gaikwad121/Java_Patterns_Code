import java.util.Scanner;
public class primeNumberOrNot{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int n=sc.nextInt();
boolean flag=false;// prime number

for(int i=2;i<n;i++){
 if(n%i==0){
flag=true;
break;
}
}
if(n==1){
System.out.println("The number is neither composite number or prime number");
}

else if(flag==false){
System.out.println("The number is prime");
}
else{
System.out.println("The number is compositeNumber");
}}

}