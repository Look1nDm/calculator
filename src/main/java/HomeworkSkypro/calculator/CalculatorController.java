package HomeworkSkypro.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public String plus(@RequestParam double num1, @RequestParam double num2) {
        double sum = calculatorService.plus(num1,num2);
        return num1+" + "+ num2+" = "+sum;
    }

    @GetMapping (path = "/minus")
    public String minus(@RequestParam double num1,@RequestParam double num2) {
        double result = calculatorService.minus(num1, num2);
        return num1+" - "+ num2+" = "+result;
    }

    @GetMapping (path = "/multiply")
    public String multiply(@RequestParam double num1,@RequestParam double num2) {
        double result = calculatorService.multiply(num1,num2);
        return num1+" * "+ num2+" = "+result;
    }

    @GetMapping (path = "/divide")
    public String divide(@RequestParam double num1,@RequestParam double num2) {
        if (num2 == 0){
            return "На 0 делить нельзя!";
        }
        double result = calculatorService.divide(num1,num2);
        return num1+" / "+ num2+" = "+result;
    }
}
