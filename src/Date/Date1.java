package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date1 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date.toString());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        calendar.set(Calendar.MONTH, 11);

        Date d = calendar.getTime();
        System.out.println(d);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS" );
        System.out.println(simpleDateFormat.format(d));
        System.out.println(d);

//        ném lỗi
        Date d2 = simpleDateFormat.parse("2019/01/22 00:00:00");
        System.out.println(d2);
    }
}
