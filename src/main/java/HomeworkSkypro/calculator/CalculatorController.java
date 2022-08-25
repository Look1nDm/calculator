package HomeworkSkypro.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    public final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam Double num1, @RequestParam Double num2) {
        if (Objects.isNull(num1)||Objects.isNull(num2)){
            return "Введите оба числа";
        }
        double sum = calculatorService.plus(num1,num2);
        return num1+" + "+ num2+" = "+sum;
    }

    @GetMapping (path = "/minus")
    public String minus(@RequestParam Double num1, @RequestParam Double num2) {
        if (Objects.isNull(num1)||Objects.isNull(num2)){
            return "Введите оба числа";
        }
        double result = calculatorService.minus(num1, num2);
        return num1+" - "+ num2+" = "+result;
    }

    @GetMapping (path = "/multiply")
    public String multiply(@RequestParam Double num1, @RequestParam Double num2) {
        if (Objects.isNull(num1)||Objects.isNull(num2)){
            return "Введите оба числа";
        }
        double result = calculatorService.multiply(num1,num2);
        return num1+" * "+ num2+" = "+result;
    }

    @GetMapping (path = "/divide")
    public String divide(@RequestParam Double num1, @RequestParam Double num2) {
        if (Objects.isNull(num1)||Objects.isNull(num2)){
            return "Введите оба числа";
        }
        if (num2 == 0){
            return "На 0 делить нельзя!";
        }
        double result = calculatorService.divide(num1,num2);
        return num1+" / "+ num2+" = "+result;
    }
}
