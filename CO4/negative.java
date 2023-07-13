import java.util.Scanner;

class NegativeException extends Exception {
    public NegativeException(String message) {
        super(message);
    }
}

class Positive {
    public void average(int[] arr) throws NegativeException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                throw new NegativeException("Negative numbers are not allowed");
            } else {
                sum += arr[i];
            }
        }
        System.out.println("Average: " + sum / arr.length);
    }
}


class Negative {
    public static void main(String[] args) {
        Positive positive = new Positive();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        try {
            positive.average(arr);
        } catch (NegativeException e) {
            System.out.println(e);
        }
        sc.close();
    }
    
}