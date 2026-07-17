class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
            System.out.println(operand1 + operation + operand2);
            System.out.println("calculating succeeded");
        } catch (IllegalArgumentException e) {
            System.out.println("Operation cannot be null");
        } catch (IllegalArgumentException) {
            System.out.println("Operation cannot be empty");
        } catch (IllegalOperationException e) {
            System.out.println("Operation '{operation}'");
        } finally {
            System.out.println("Operation '-' does not exist");
        }
    }
}
