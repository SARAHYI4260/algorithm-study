class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
            System.out.println(operand1 + operation + operand2);
            System.out.println("calculating succeeded");
        } catch (IllegalArgumentException e) {
            System.out.println("Operation cannot be null");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        } catch (IllegalOperationException e) {
            System.out.println("Operation '{operation}'");
        } finally {
            System.out.println("Operation '-' does not exist");
        }
        return operand1 + operation + operand2;
    }
}
