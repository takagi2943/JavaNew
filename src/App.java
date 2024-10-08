public class App {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = a;
        a = 1;

        System.out.println("変数 a: " + a);
        System.out.println("変数 b: " + b);

        int[] c = new int[1];
        c[0] = 0;
        int[] d = c;
        c[0] =1;

        System.out.println("配列 c: " + c[0]);
        System.out.println("配列 d: " + d[0]);

    }
}
