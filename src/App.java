public class App {
    public static void main(String[] args) throws Exception {
        // 繰り返し実行したい処理
        // String colour[] = {"赤","青","黄色","緑","ピンク"};
        // // 　for文を使ったコード
        // for (String all: colour) {
        //     System.out.println(all);
        // }

        // // 拡張for文を使ったコード
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(colour[i]);
        // }

        // 回数を決めずに処理を繰り返す
        // int num = 0;
        // // intの値が5になるまで、処理を繰り返す
        // while(num <= 5) {
        //     System.out.println("numの値: " + num);

        //     // メッセージを出力する毎に、numの値を1ずつ増やす
        //     num++;
        // }

        // 繰り返し実行したい処理を少なくとも1回は必ず実行する
        int num = 0;
        do {
            System.out.println("numの値: " + num);
            num++;

            //numの値が5になるまで、処理を繰り返す
        } while(num <= 5);
    }
}
