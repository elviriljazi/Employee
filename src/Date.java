import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    GregorianCalendar calendar = new GregorianCalendar();
    int date;
    int month;
    int year;
    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public Date() {
        this(1, 1, 1900);
    }

    public Date(int date, int month, int year) {
        if (year >= 1990&& year<=calendar.get(Calendar.YEAR)) {
            this.year = year;
            if(calendar.get(Calendar.YEAR)%4==0)
                months[1]=29;
            if (month <= 12 && month > 0) {
                this.month = month;
                if (date <= months[month - 1] && date > 0)
                    this.date = date;
                else
                    System.out.println("Invalid Date");
            } else
                System.out.println("Invalid Date");
        } else
            System.out.println("Invalid Date");
    }

    public String printDate() {
        return date + "/" + month + "/" + year;
    }
}
