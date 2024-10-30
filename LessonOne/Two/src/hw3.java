public class hw3 {
    public hw3() {
    }

    public static void main(String[] var0) throws Exception {
        hw3(5);
        circle Moon1 = new circle();
        System.out.println(Moon1.show_area(11));
        circle Moon2 = new circle();
        Moon2.setPi(3.0f);
        System.out.println(Moon2.show_area(11));
    }


    private void hw3(int n) {
        int cacu = 1;
        String res = "1";
        String space = "";
        for (int i = 0; i < 2*n; i++)
        {
            space+=" ";
        }
        for (int i = 0; i < n; i++) {
            System.out.println(space + res);
            cacu++;
            res = cacu + res + cacu;
            space = space.substring(0, space.length() - 2);
        }
    }
}
