public class Main {
    public static void main(String[] args) {
        //reference type
        CustomerManager customerManager;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Update();
        customerManager.Remove();

        //value tyoe
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2); //answer: 10

        int [] numbers1 = new int[] {1,2,3};
        int [] numbers2 = new int[] {4,5,6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]); //answer: 10

        // Value Types      : “int”, “long”, “float”, “double”, “decimal”, “char”, “bool”, “byte”, “short”, “struct”, “enum”
        // Reference Types  : “string”, “object”, “class”, “interface”, “array”, “delegate”, “pointer”

    }
}
