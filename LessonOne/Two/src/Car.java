public class Car {
    public String number;
    public String color;
    public boolean isTaix;
    public int year = 0;
    public static String company = "Taiwan";

    public Car(String number, String color, boolean isTaix, int year) {
        this.number = number;
        this.color = color;
        this.isTaix = isTaix;
        this.year = year;
    }

    public void showCarInfo() {
        System.out.println("Car Number:" + number + " color is " + this.color);
        System.out.println("Car Number:" + number + " isTaix is " + this.isTaix);
        System.out.println("Car Number:" + number + " year is " + this.year);
    }

    public static void showCompanyWithStatic() {
        System.out.println("Car's company is " + company);
    }

}
