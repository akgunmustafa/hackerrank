import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if(N%2 !=0){
            System.out.print("Weird");
        }
        else if(2<=N&&N<=5){
            System.out.print("Not Weird");

        }
        else if(6<=N&&N<=20){
            System.out.print("Weird");

        }
        else if(N>20){
            System.out.print("Not Weird");

        }

    }
}
