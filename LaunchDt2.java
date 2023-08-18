import java.time.*;
public class LaunchDt2 {
    public static void main(String[] args) {
       LocalDate date =LocalDate.now();
        System.out.println(date);

        LocalTime time =LocalTime.now();
        System.out.println(time);

        int day=date.getDayOfMonth();
        System.out.println(day);

        int year=date.getYear();
        System.out.println(year);
        int month=date.getMonthValue();
        System.out.println(month);

        int hour = time.getHour();
        int min= time.getMinute();
        int sec= time.getSecond();
        int nano= time.getNano();
        System.out.println(hour + ":" + min +":"+sec+":" + nano);


    }
}
