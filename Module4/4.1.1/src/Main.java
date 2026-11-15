public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(12);
        calculator.add(7);
        calculator.add(3);

        System.out.println("Sum: " + calculator.getValue());
    }
}
