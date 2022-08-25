package HomeworkSkypro.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    public final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping (path = "/calculator")
    public String hello() {
        return calculatorService.hello();
    }

    @RequestMapping (path = "/calculator/plus")
    public String plus(@RequestParam double num1, @RequestParam double num2) {
        double sum = calculatorService.plus(num1,num2);
        return num1+" + "+ num2+" = "+sum;
    }

    @RequestMapping (path = "/calculator/minus")
    public String minus(@RequestParam double num1,@RequestParam double num2) {
        double result = calculatorService.minus(num1, num2);
        return num1+" - "+ num2+" = "+result;
    }

    @RequestMapping (path = "/calculator/multiply")
    public String multiply(@RequestParam double num1,@RequestParam double num2) {
        double result = calculatorService.multiply(num1,num2);
        return num1+" * "+ num2+" = "+result;
    }

    @RequestMapping (path = "/calculator/divide")
    public String divide(@RequestParam double num1,@RequestParam double num2) {
        if (num2 == 0){
            return "На 0 делить нельзя!";
        }
        double result = calculatorService.divide(num1,num2);
        return num1+" / "+ num2+" = "+result;
    }
}
