package HomeworkSkypro.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public double plus(double num1, double num2) {
        double summ = num1+num2;
        return summ;
    }

    public double minus(double num1, double num2) {
        double result = num1-num2;
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1*num2;
        return result;
    }

    public double divide(double num1, double num2) {
        double result = num1/num2;
        return result;
    }
}
