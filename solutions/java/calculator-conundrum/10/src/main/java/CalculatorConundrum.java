class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalOperationException("Operation cannot be null");
        }if (" ".equals(operation)) {
            throw new IllegalOperationException("Operation cannot be empty");
        }
        switch (operation) {
            case "+":
                int sum = operand1 + operand2;
                return operand1 + "+" + operation + "=" + sum;
            case "*":
                int multiple = operand1 * operand2;
                return operand1 + "*" + operation + "=" + multiple;
            case "/":
        }
            try {
                int quotient = operand1 / operand2;
                return operand1 + "/" + operation + "=" + quotient;
            }catch (ArithmeticException e) {

                throw new IllegalOperationException("Division by zero is not allowed");
            }

        }
    }
}