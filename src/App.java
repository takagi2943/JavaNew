public class App {
    public static void main(String[] args) throws Exception {
        int num01 = 6;
        int num02 = 2;
        int result;

        result = num01 + num02;
        System.out.println("加算: " + result);

        result = num01 - num02;
        System.out.println("減算: " + result);

        result = num01 * num02;
        System.out.println("乗算: " + result);

        result = num01 / num02;
        System.out.println("除算: " + result);

        result = num01 % num02;
        System.out.println("剰算: " + result);
    }
}
