/*
    This is my solution to the Kattis challenge "Another Candies".
    The challenge can be found at: https://open.kattis.com/problems/anothercandies
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t;// number of test cases
        int n;// number of children
        BigInteger totalCandy = BigInteger.ZERO;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        System.out.println(" ");

        for(int i = 0; i < t; i++){// new input for each test case
            int counter = 0;
            n = sc.nextInt();
            while(counter != n){
                totalCandy = totalCandy.add(sc.nextBigInteger());
                counter++;
            }
            if(totalCandy.mod(BigInteger.valueOf(n)).equals(BigInteger.ZERO)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            totalCandy = BigInteger.ZERO;
            System.out.println(" ");
        }
    }
}