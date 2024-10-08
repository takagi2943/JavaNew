public class App {
    public static void main(String[] args) throws Exception {
        // // 【isEmpty は値が空であるかを調べてくれるメソッド】
        // // 値がnull
        // String name = null;
        
        // // 比較演算子でnullか判定
        // if(name == null || name.isEmpty()) {
        //     System.out.println("必須項目が未入力です");
        // }


        // // 【equals は文字列の比較をしてくれるメソッド】
        
        // //1回目に入力したパスワード
        // String pass01 = "test1234";

        // //2回目に入力したパスワード
        // String pass02 = "test1234";

        // // equalsメソッドで同じかどうか判定
        // if(pass01.equals(pass02)) {
        //     System.out.println("入力したパスワードは同じです");
        // } else {
        //     System.out.println("入力したパスワードは異なります");
        // }


        // 【length は文字列の数を判定してくれるメソッド】
        // 入力したパスワード
        String pass01 = "";

        // lengthメソッドで桁数を取得、パスワードが8桁かどうか判定
        if(pass01.length() == 0) {
            System.out.println("桁数: " + pass01.length() + "「パスワードが未入力です」");
        }
        else if(pass01.length() == 8) {
            System.out.println("桁数: " + pass01.length() + "「OK！」");
        }
        else{
            System.out.println("桁数: " + pass01.length() + "「パスワードは8桁で入力してください」");
        }
    }
}
