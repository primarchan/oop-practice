package org.example.calculator.calculate;

public interface NewArithmeticOperator {

    boolean supports(String operator);

    int calculate(PositiveNumber operand1, PositiveNumber operand2);

}
