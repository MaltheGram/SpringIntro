package com.example.springintro.Services;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class IsItFriday {


    public static String fridayCalculator() {
        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        String plainPrint = "It's not friday. It's "  + dayCalculator(currentDay);

        String htmlPrint = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>IT'S FRIDAY</title>\n" +
                "</head>\n" +
                "\n" +
                "<body style=\"background-color: steelblue\">\n" +
                "\n" +
                "<h1 style=\"color: red\\\">IT'S FRIDAY</h1>" +
                "</body>\n" +
                "</html>";


        int q = LocalDate.now().getDayOfMonth();
        int m = LocalDate.now().getMonthValue();
        int j = LocalDate.now().getYear() / 100;
        int k = LocalDate.now().getYear() % 100;

        int h = (q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) - 2 * j) % 7;

        int d = ((h + 5) % 7) + 1;

        // Ternary operator: Expression ? trueCase : elseCase
        String print = d == 5 ? htmlPrint : plainPrint;

        return print;

    }
 
    public static Serializable dayCalculator(DayOfWeek day){

        switch (day){
            case MONDAY:
                return "monday";

            case TUESDAY:
                return "tuesday";

            case WEDNESDAY:
                return "wednesday";

            case THURSDAY:
                return "thursday";

            case FRIDAY:
                return "friday";

            case SATURDAY:
                return "saturday";

            case SUNDAY:
                return "sunday";

        }

        return day;

    }
}
