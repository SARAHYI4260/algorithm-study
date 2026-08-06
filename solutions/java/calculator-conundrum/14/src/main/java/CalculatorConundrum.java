class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        // 1. null 체크 -> 올바른 예외 클래스로 변경
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        // 2. 빈 문자열 체크 -> 공백 제거 및 올바른 예외 클래스로 변경
        if ("".equals(operation)) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        switch (operation) {
            case "+":
                return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
            case "*":
                return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
            case "/":
                // 3. try-catch 블록이 case "/" 안으로 들어와야 합니다.
                try {
                    int quotient = operand1 / operand2;
                    return operand1 + " / " + operand2 + " = " + quotient;
                } catch (ArithmeticException e) {
                    // 4. 잡아낸 e를 인자로 함께 던져줍니다.
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            default:
                // 5. +, *, / 모두 아닐 때 예외 던지기
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        } // switch 문이 여기서 끝나야 합니다.
    }
}
