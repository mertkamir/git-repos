public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.sum(2,3);
        System.out.println(result);

        int result2 = calculator.sum(2,3,4);
        System.out.println(result2);

    }
}
