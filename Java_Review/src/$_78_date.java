import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class $_78_date {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        DateFormat date1=new SimpleDateFormat("dd/MM/yyyy");
        String d=date1.format(date);
        System.out.println(d);

    }
}
