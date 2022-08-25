package HomeworkSkypro.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        try {
            int div = num1 / num2;
        } catch (ArithmeticException e){
            return "Делить на 0 нельзя!";
        }
            return num1 + " / " + num2 + " = " + (num1 / num2);

    }
}
