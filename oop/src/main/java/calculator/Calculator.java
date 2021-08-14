package calculator;

import java.io.*;

public class Calculator {

    public static int calculation(String[] arr, int result) {

        for (int i = 1; i < arr.length; i += 2) {
            int num = Integer.parseInt(arr[i + 1]);

            switch (arr[i]) {
                case "+":
                    result = Addition.plus(result, num);
                    break;
                case "-":
                    result = Subtraction.minus(result, num);
                    break;
                case "/":
                    result = Division.div(result, num);
                    break;
                case "*":
                    result = Multiplication.mul(result, num);
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] numArr = br.readLine().split(" ");

        int result = Integer.parseInt(numArr[0]);
        result = calculation(numArr, result);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}