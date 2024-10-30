public class Person {
    public String personName;
    public static String personNiceName = "Ed";
    public static int count=0;

    // 建構子
    public Person(String name) {
        personName = name;
        count++;
    }

    public void showName() {
        System.out.println("preson name is " + personName);
    }


    public static void callNuckNameWithStatic() {
        System.out.println("static.callNuckNameWithStatic.personNiceName = " + personNiceName);
    }

    public static void showCount() {
        System.out.printf("創建人數為：%d \n", count);
        // System.out.println("");
    }
}
