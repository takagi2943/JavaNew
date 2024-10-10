import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        // Dataクラス
        Date date01 = new Date();

        // Calendarクラス
        Calendar date02 = Calendar.getInstance();

        // SimpleDateFormatクラスでフォーマットを指定
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss E");

        // Dataクラスの日付をそのまま出力
        System.out.println("Dateクラス(フォーマットなし)  : " + date01);
        
        // Dateクラスの日付をSimpleDateFormatクラスで指定したフォーマットで出力
        System.out.println("Dateクラス(フォーマットあり)  : " + sdf.format(date01));

        // Calendarクラスの日付をそのまま出力
        System.out.println("Dateクラス(フォーマットなし)  : " + date02.getTime());

        // Calendarクラスの日付をSimpleDateFormatクラスで指定したフォーマットで出力
        System.out.println("Dateクラス(フォーマットあり)  : " + sdf.format(date02.getTime()));
    }
}
