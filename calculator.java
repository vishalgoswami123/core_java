public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

   public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add(int, int): " + calc.add(5, 10));                
        System.out.println("Add(int, int, int): " + calc.add(1, 2, 3));         
    }
}
