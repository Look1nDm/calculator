package HomeworkSkypro.calculator;

import org.springframework.web.bind.annotation.*;

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
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1+" + "+ num2+" = "+calculatorService.plus(num1,num2);
    }

    @GetMapping (path = "/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1+" - "+ num2+" = "+calculatorService.minus(num1, num2);
    }

    @GetMapping (path = "/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1+" * "+ num2+" = "+calculatorService.multiply(num1,num2);
    }

    @GetMapping (path = "/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1+" / "+ num2+" = "+calculatorService.divide(num1,num2);
    }
}
