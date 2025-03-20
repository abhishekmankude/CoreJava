package com.xworkz;





import java.util.Arrays;
import java.util.Scanner;

public class upper_inc {
    public static int minSteps(int P, int Q, int R) {
        int[] arr = {P, Q, R};
        Arrays.sort(arr);

        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            return 0;
        }

        int steps = 0;
        while (true) {
            arr[0]++;
            arr[1]++;
            arr[2]--;
            steps++;
            Arrays.sort(arr);

            if (arr[0] == arr[1] && arr[1] == arr[2]) {
                return steps;
            }

            if ((arr[0] == arr[1] && arr[1] + 1 == arr[2]) ||
                    (arr[1] == arr[2] && arr[0] + 1 == arr[1])) {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        int R = scanner.nextInt();
        scanner.close();

        int result = minSteps(P, Q, R);
        System.out.println("Minimum steps: " + result);
    }
}

