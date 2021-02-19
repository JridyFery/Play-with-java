package threads.company;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class GetTime20 extends Thread {
    public void run(){
        Date rightNow;
        Locale currentLocale;
        DateFormat timeFormatter;
        DateFormat dateFormatter;
        String timeOutput;
        String dateOutput;

        for(int i=1;i<=20;i++){
            rightNow = new Date();
            currentLocale = new Locale("fr");
            timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT,currentLocale);
            dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT,currentLocale);

            timeOutput = timeFormatter.format(rightNow);
            dateOutput = dateFormatter.format(rightNow);
            System.out.println(timeOutput);
            System.out.println(dateOutput);
            System.out.println();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread getTime=new GetTime20();
        getTime.start();
    }
}
