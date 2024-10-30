public class Demo {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("Edward");
        Person person2 = new Person("David");
        System.out.println(person1.personName);
        System.out.println(person2.personName);
        // 設定物件的屬性
        person1.personName = "Edward";
        person2.personName = "David";
        person1.showName();
        person2.showName();
        // 取出物件的屬性
        System.out.println(person1.personName);
        Person.personNiceName = "Ed1";
        //靜態屬性呼叫
        System.out.println(Person.personNiceName);
        person1.personNiceName = "Ed2";
        System.out.println(person1.personNiceName);
        person2.personNiceName = "DD1";
        System.out.println(person1.personNiceName);
        System.out.println(person2.personNiceName);
        person1.callNuckNameWithStatic();
        Person.showCount();


        //--------------------------------------------------

        Car car1 = new Car("001", "blue", false, 10);
        Car car2 = new Car("002", "yellow", true, 20);
        Car car3 = new Car("003", "red", false, 15);
        Car car4 = new Car("004", "black", false, 30);

        car1.showCarInfo();
        car2.showCarInfo();
        car3.showCarInfo();
        car4.showCarInfo();

        Car.showCompanyWithStatic();



        Dog dog1 = new Dog("阿柴", "黃", 35, false);
        Dog dog2 = new Dog("拉不", "白", 85, false);
        Dog dog3 = new Dog("阿貴", "黑", 25, true);
        Dog dog4 = new Dog("小白", "白", 30, true);

        dog1.showTheDogInfo();
        dog2.showTheDogInfo();
        dog3.showTheDogInfo();
        dog4.showTheDogInfo();

        Dog.showDogSound();
    }
}
