import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class App {
    public static void main(String[] args) {
        try {
            // Fileクラスで読み込むファイルを指定
            File file = new File("秘蔵");

            // BufferedReaderクラストFileReaderクラスでファイルを読み込む
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;

            // readLineメソッドでファイルの内容を1行ずつ読み込む。ファイルの内容がnullじゃなければ出力
            while((str = br.readLine()) != null) {
                System.out.println(str);
            }

            // ファイルを閉じる
            br.close();

            // ファイルが存在しない場合 or 処理に失敗した場合はメッセージを表示 
            } catch(FileNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
}
