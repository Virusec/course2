package pro.sky.javadev.course2.lesson3;

import org.springframework.stereotype.Service;
import pro.sky.javadev.course2.lesson3.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}

