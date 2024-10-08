public class App {
    public static void main(String[] args) throws Exception {
        // 基本データ型
        // int num = 1;

        // // 基本データ型からラッパークラスのオブジェクトに変換する(オートボクシング)
        // Integer a = num;

        // System.out.println(a);

        // ラッパークラス
        // Integer a = 1;

        // // ラッパークラスから基本データ型に変換する(アンボクシング)
        // int num = a;

        // System.out.println(num);

        // 【ラッパークラスのメソッド】
        // int num = 1;

        // // 基本データ型からラッパークラスのオブジェクトに変換する(valusOfメソッド)
        // Integer a = Integer.valueOf(num);

        // System.out.println(a);

        // valueメソッドを使ってラッパークラスから基本データ型に変換
        Integer a = 1;

        // ラッパークラスから基本データ型に変換
        int num = a.intValue();
        System.out.println(a);
    }
}
