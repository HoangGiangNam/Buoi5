package BTBuoi5.Bai2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        LocalDate toDay = LocalDate.of(1009, 3, 2);
        LocalDate birtDay = LocalDate.of(2000, 2, 2);


        try {
            Period period = Period.between(birtDay, toDay);
            int years = period.getYears();

            System.out.println("Tuoi cua ban la:" + period.getYears());

        } catch (AgeException fa) {
            fa.getMessage();

        }


    }
}

