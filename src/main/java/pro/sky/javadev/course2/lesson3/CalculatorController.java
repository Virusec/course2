package pro.sky.javadev.course2.lesson3;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl){
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping
    public String hello() {
        return calculatorServiceImpl.hello();
    }

    @GetMapping("/plus")
    public String sum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " + " + num2 + " = " + calculatorServiceImpl.sum(num1, num2);
    }

    @GetMapping("/minus")
    public String subtract(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " - " + num2 + " = " + calculatorServiceImpl.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + calculatorServiceImpl.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            return "<h1> Деление на 0 невозможно </h1>";
        }
        return num1 + " / " + num2 + " = " + calculatorServiceImpl.divide(num1, num2);
    }
}
