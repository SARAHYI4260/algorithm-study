class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
        } catch (IllegalArgumentException e) {
            if(operation == null) {
                System.out.println("Operation cannot be null");
            }else if(operation == "") {
                System.out.println("Operation cannot be empty");
            }else if(operation == "-") {
                System.out.println("Operation '{operation}' does not exist");
            }
        } finally {
            return operand1 + operation + operand2;
        }
    }
}
