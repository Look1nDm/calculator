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

    @RequestMapping
    public String hello() {
        return calculatorService.hello();
    }

    @RequestMapping (path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.plus(num1, num2);
    }

    @RequestMapping (path = "/minus")
    public String minus(@RequestParam int num1,@RequestParam int num2) {
        return calculatorService.minus(num1, num2);
    }

    @RequestMapping (path = "/multiply")
    public String multiply(@RequestParam int num1,@RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @RequestMapping (path = "/divide")
    public String divide(@RequestParam int num1,@RequestParam int num2) {
        return calculatorService.divide(num1, num2);
    }
}
