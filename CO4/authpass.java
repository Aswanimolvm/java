import java.util.Scanner;


class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}

class Auth {
    public void validate(String username, String password) throws UserException {
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Authentication successful");
        } else {
            throw new UserException("Authentication failed");
        }
    }
}


class AuthPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auth auth = new Auth();
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();
        try {
            auth.validate(username, password);
        } catch (UserException e) {
            System.out.println(e);
        }
        sc.close();
    }
}