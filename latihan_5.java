public class latihan_5 {
    public static void main(String[] args) {
        int y1 = 4;
        int y2 = 1;
        int x1, x2;
        boolean evaluasi1, evaluasi2, evaluasi3;

        x1 = (y1 + y2) * (y1 + y2);
        x2 = (y1 % 4) * y2;

        evaluasi1 = x1 >= x2;
        evaluasi2 = x2 >= x1;
        evaluasi3 = (x1 % 4) == (++x2 % 5);

        System.out.println(x1 % 4);
        System.out.println(++x2 % 5);

        System.out.println("X1 besar sama dengan X2   ===> " + evaluasi1);
        System.out.println("X2 besar sama dengan X1  ===> " + evaluasi2);
        System.out.println("X1 mod 4 == ++X2 mod 5   ===> " + evaluasi3);
    }
}
