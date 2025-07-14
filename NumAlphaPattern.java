import java.util.Scanner;
public class NumAlphaPattern{
public static void main(String[]args){
for(int i=1;i<=5;i++){
for(int j=5;j>=i;j--){
if(i%2==1){
System.out.print((char)(64+i));
}else{
System.out.print(i);
}}
System.out.println();
}}
}