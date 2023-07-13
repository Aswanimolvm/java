import java.util.Scanner;
class ValidationException extends Exception
{
        ValidationException(String str)
        {
                super(str);
        }
}

class User
{
        void check(String un,String pw) throws ValidationException
        {
               if (un.equals("anu") && pw.equals("anu123"))
               {
                        System.out.println("Value acceptable");
               }
               else
               {
                        throw new ValidationException("No match with the given value");
                      
               }
        }
}

public class Main
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                try
                {
                        User us=new User();
                        System.out.println("Enter the username:");
                        String u=sc.next();
                        System.out.println("Enter the password:");
                        String p=sc.next();
                        us.check(u,p);
                        System.out.println("LOGIN SUCCESSFUL");
                        
                }
                catch(ValidationException e)
                {
                        System.out.println("Cannot find symbols-  " +e);
                }
               
        }
}