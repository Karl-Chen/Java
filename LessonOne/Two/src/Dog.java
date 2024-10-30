import java.sql.Date;

public class Dog {
    private String name;
    private String color;
    private String size;
    private String isShort;
    private static String sound = "汪";

    public Dog(String name, String color, int size, boolean isShort) {
        this.name = name;
        this.color = color;
        if (size > 58)
            this.size = "大型犬";
        else if (size > 38)
            this.size = "中型犬";
        else
            this.size = "小型犬";

        if (isShort)
            this.isShort = "短毛";
        else
            this.isShort = "長毛";

    }

    public void showTheDogInfo() {
        System.out.println("這隻" + name + "狗狗的毛色是" + color + "色");
        System.out.println("這隻" + name + "狗狗的大小是 " + size);
        System.out.println("這隻" + name + "狗狗是 " + isShort);
    }

    public static void showDogSound() {
        System.out.println("狗狗都是" + sound + "叫");
    }
}
