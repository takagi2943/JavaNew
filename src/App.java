import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class App {
    public static void main(String[] args) {
        try {
            // FileWriterクラス
            FileWriter fw = new FileWriter("秘蔵", true);

            // PrintWriterクラス
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

            // ファイルに記述する
            pw.println("氏名        ：日本太郎");
            pw.println("生年月日    ：1999年10月20日");
            pw.println("採用年月    ：2022年04月01日");
            pw.println("部署        ：経理部");

            // ファイルを閉じる
            pw.close();

            System.out.println("ファイルを出力しました。");

            // 処理に失敗した場合はメッセージを表示 
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
}
