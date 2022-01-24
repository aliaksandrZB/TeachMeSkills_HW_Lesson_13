package task_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        System.out.println("Enter the date in the format \"day.month.year\":");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.y");
        Date myDate = null;
        try {
             myDate = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(new SimpleDateFormat("EEEE").format(myDate));

    }

}
