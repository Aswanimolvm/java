import java.util.Scanner;
class Str
{

String st1,st2,st3;
void string(String str1)
{
st1=str1;
st2="@@@";
st3="**";
}
void strman()
{
int l=st1.length();
System.out.println("The length of the string:" +l);
System.out.println("The character at 3rd position:" +st1.charAt(3));
System.out.println("The substring:" +st1.substring(5));
System.out.println("The position of a:" +st1.indexOf("a"));
System.out.println("concatenation using + : " +st1+st2);
System.out.println("Concatenation using method:" +st1.concat(st3));
System.out.println("Uppercase of string:" +st1.toUpperCase());
System.out.println("Lowercase of string:" +st1.toLowerCase());

}}

class Main
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
Str s1=new Str();
System.out.println("Enter the string:");
String s=input.next();
s1.string(s);
s1.strman();
}}