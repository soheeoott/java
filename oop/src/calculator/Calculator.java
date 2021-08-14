package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Calculator {

    public static void main(String[]args) throws IOException, IllegalArgumentException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] operand = new String[30];

        // 배열에 피연산자, 연산자 저장
        int i = 0;
        while (st.hasMoreTokens()) {
            operand[i] = st.nextToken();
            i++;
        }

        System.out.println(Arrays.toString(operand));

        int result = 0;

        for (int j = 0; j < operand.length; j++) {
            // 연산자 인덱스
            int plus = Arrays.asList(operand).indexOf("+"); // 배열 indexOf
            int minus = Arrays.asList(operand).indexOf("-");
            int mul = Arrays.asList(operand).indexOf("*");
            int div = Arrays.asList(operand).indexOf("/");

            // 덧셈
            if(plus != -1) {
                result += Addition.addition(plus-1, plus+1);
            }

            // 뺄셈
            if(minus != -1) {
                result += Subtraction.subtraction(minus-1, minus+1);
            }

            // 곱셈
            if(mul != -1) {
                result += Multiplication.multiplication(mul-1, mul+1);
            }

            // 나눗셈
            if(div != -1) {
                result += Division.division(div-1, div+1);
            }
        }

        System.out.println("연산결과 = " + result);
        br.close();
    }
}