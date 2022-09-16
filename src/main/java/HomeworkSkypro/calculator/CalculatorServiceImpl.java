package HomeworkSkypro.calculator;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service

public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public boolean notNull(Integer num1,Integer num2){
        return !Objects.isNull(num1) && !Objects.isNull(num2);
    }

    public Integer plus(Integer num1, Integer num2) {
        if(!notNull(num1,num2)){
            throw new NotWrittenNumber("Не ввели оба числа!");
        }
        return num1+num2;
    }

    public Integer minus(Integer num1, Integer num2) {

        if(!notNull(num1,num2)){
            throw new NotWrittenNumber("Не ввели оба числа!");
        }return num1-num2;
    }

    public Integer multiply(Integer num1, Integer num2) {

        if(!notNull(num1,num2)){
            throw new NotWrittenNumber("Не ввели оба числа!");
        }return num1*num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new NotWrittenNumber("Попытка деления на 0!");
        }
        return num1/num2;
    }
}
