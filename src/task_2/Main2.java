package task_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        System.out.println("Enter the date in the format \"day.month.year\":");
        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate myDate = LocalDate.parse(dateString, formatter);

        DayOfWeek dayOfWeek = myDate.getDayOfWeek();
        int numDayOfWeek = DayOfWeek.TUESDAY.getValue();
        int myNumDayOfWeek = dayOfWeek.getValue();
        int plus = ((numDayOfWeek - myNumDayOfWeek + 7) % 7);
        if (plus == 0) {
            plus += 7;
        }
        LocalDate tuesdayDate = myDate.plusDays(plus);

        System.out.println("Next tuesday date: \n" + formatter.format(tuesdayDate));

    }

}
