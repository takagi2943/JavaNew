import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        // フォーマットを指定
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        // Calendarクラスで日付データを出力
        Calendar date01 = Calendar.getInstance();
        System.out.println("元のデータ(現在日時)  : " + sdf.format(date01.getTime()));

        // addメソッドで加算したデータを出力(現在日時から1か月後)
        Calendar date02 = Calendar.getInstance();
        System.out.println("元のデータ(1か月後)  : " + sdf.format(date02.getTime()));

        // addメソッドで減算したデータを出力(現在日時から1か月前)
        Calendar date03 = Calendar.getInstance();
        date03.add(Calendar.MONTH, -1);
        System.out.println("元のデータ(1か月後)  : " + sdf.format(date03.getTime()));

        // setメソッドで加算したデータを出力(2020年を指定) 
        Calendar date04 = Calendar.getInstance();
        date04.set(Calendar.YEAR, 2020);
        System.out.println("指定したデータ(2020年)  : " + sdf.format(date04.getTime()));


    }
}
