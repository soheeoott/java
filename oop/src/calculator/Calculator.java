package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Calculator {

    // 배열에 피연산자, 연산자 저장
    public static String[] arrayPut(String[] operand) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0;
        while (st.hasMoreTokens()) {
            operand[i] = st.nextToken();
            i++;
        }
        br.close();
        return operand;
    }

    public static void main(String[]args) throws IOException, IllegalArgumentException {

        String[] operand = new String[30];

        // 배열에 피연산자, 연산자 저장
        operand = arrayPut(operand);
        System.out.println(Arrays.toString(operand));

        // 연산자 인덱스
        int result = 0;
        int plus = Arrays.asList(operand).indexOf("+"); // 배열 indexOf
        int minus = Arrays.asList(operand).indexOf("-");
        int mul = Arrays.asList(operand).indexOf("*");
        int div = Arrays.asList(operand).indexOf("/");

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(mul);
        System.out.println(div);

        for (int j = 0; j < operand.length; j++) {

            // 덧셈
            if(plus != -1) {
                int operand1 = Integer.parseInt(operand[plus-1]);
                int operand2 = Integer.parseInt(operand[plus+1]);
                result += Addition.addition(operand1, operand2);
                break;
            }

            // 뺄셈
            if(minus != -1) {
                int operand1 = Integer.parseInt(operand[minus-1]);
                int operand2 = Integer.parseInt(operand[minus+1]);
                result += Subtraction.subtraction(operand1, operand2);
                break;
            }

            // 곱셈
            if(mul != -1) {
                int operand1 = Integer.parseInt(operand[mul-1]);
                int operand2 = Integer.parseInt(operand[mul+1]);
                result += Multiplication.multiplication(operand1, operand2);
                break;
            }

            // 나눗셈
            if(div != -1) {
                int operand1 = Integer.parseInt(operand[div-1]);
                int operand2 = Integer.parseInt(operand[div+1]);
                result += Division.division(operand1, operand2);
                break;
            }
        }
        System.out.println("연산결과 = " + result);
    }
}