public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String testString = test();
        System.out.println("Hello, world " + testString);
        abc();
        int twoNumSum = sum(3, 5);
        System.out.printf("Two numbers sum is: %d", twoNumSum);
        System.out.println("");
        System.out.println("");
        int startEndNumTotal = total(1, 10);
        System.out.printf("The sum of numbers from start number to end number is: %d", startEndNumTotal);
        System.out.println("");
        System.out.println("");
    }
    // 測試
    public static String test() {
        System.out.println("Hello, test!");
        return "123";
    }
    private static void abc() {
        return;
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int total(int num1, int num2) {
        int total = 0;
        for (int index = num1; index <= num2; index++) {
            total += index;
        }
        return total;
    }
}
