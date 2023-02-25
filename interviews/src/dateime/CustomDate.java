package dateime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CustomDate {

	public static void main(String args[]) {

		Period diff = Period.between(LocalDate.parse("2016-08-31"), LocalDate.parse("2016-11-30"));

		System.out.println(diff);

		long daysBetween = ChronoUnit.MONTHS.between(LocalDate.parse("2016-08-10"), LocalDate.parse("2016-11-30"));

		System.out.println(daysBetween);

	}

}
