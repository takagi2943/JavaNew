public class App {
    public static void main(String[] args) throws Exception {
       // メタ文字について
       // 分割する元データ
       String str = "りんご バナナ ミカン" ;
       System.out.println("果物の名前(分割前): " + str);

       // 半角スペースで分割する
       String[] newStr = str.split("\\s+");

       // 繰り返し処理
       for(int i = 0; i < newStr.length; i++) {
        System.out.println("果物の名前(分割後): " + newStr[i]);
       }
    }
}
