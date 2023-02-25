package dateime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SevenDay {

	public static void main(String arg[]) {

		LocalDate weekBeforeToday = LocalDate.now().minusDays(7);

		List<LocalDate> dater = new ArrayList<LocalDate>();

		dater = IntStream.rangeClosed(1, 7).mapToObj(weekBeforeToday::plusDays).collect(Collectors.toList());

		System.out.println(dater.get(0));

		System.out.println(dater.get(dater.size() - 1));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String date = sdf.format(new Date());

		String endOfMonth = YearMonth // Represent the year and month, without a date and without a time zone.
				.from( // Extract the year and month from a `LocalDate` (a year-month-day).
						LocalDate // Represent a date without a time-of-day and without a time zone.
								.parse( // Get a date from an input string.
										date, // Poor choice of format for a date. Educate the source of your
												// data about the standard ISO 8601 formats to be used when
												// exchanging date-time values as text.
										DateTimeFormatter // Specify a formatting pattern by which to parse the input
															// string.
												.ofPattern("yyyy-MM-dd") // Match the pattern of your input.
								) // Returns a `LocalDate` object.
				) // Returns a `YearMonth` object.
				.atEndOfMonth() // Determines the last day of the month for that particular year-month, and
								// returns a `LocalDate` object.
				.toString();

		System.out.println("<====datedate===>" + date);

		System.out.println("<==endOfMonth1==>" + endOfMonth);

		String endOfMonths = YearMonth.from(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")))
				.atEndOfMonth().toString();

		String endOfMonths1 = YearMonth.from(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"))).atDay(1)
				.toString();

		System.out.println("<==endOfMonth222222222222222222222222==>" + endOfMonths1);
		if (date.contains(endOfMonths)) {
			System.out.println("<==endOfMonth111111111111==>");
		}

		LocalDate datep = LocalDate.parse(date);

		LocalDate returnvalue = datep.minusDays(17);

		System.out.println("<==endOfMonth00000000==>" + returnvalue);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String sdate = "2022-08-20";

		String edate = "2022-11-19";

		// convert String to LocalDate
		LocalDate startDate = LocalDate.parse(sdate, formatter);

		LocalDate endDate = LocalDate.parse(edate, formatter);

		List<String> newMonth = getMonthsBetweenUsingJava8(startDate, endDate);

		System.out.println("<<<<<<<===========================" + newMonth);

		String startOfMonth = startDate(newMonth.get(0));

		if (!startOfMonth.equalsIgnoreCase(sdate)) {

			LocalDate ssDate = LocalDate.from(startDate).minusDays(1);

			System.out.println("<<<<<<<" + ssDate);

		}

		if (!newMonth.get(newMonth.size() - 1).equalsIgnoreCase(edate)) {

		}

	}

	public static String endDate(String date) {
		String end = YearMonth.from(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"))).atEndOfMonth()
				.toString();

		return end;
	}

	public static String startDate(String date) {
		String end = YearMonth.from(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"))).atDay(1)
				.toString();

		return end;
	}

	public static List<String> getMonthsBetweenUsingJava8(LocalDate startDate, LocalDate endDate) {

		long numOfDaysBetween = ChronoUnit.MONTHS.between(startDate, endDate);

		numOfDaysBetween = numOfDaysBetween + 1;
		System.out.println("=======********"+numOfDaysBetween);

		return IntStream.iterate(0, i -> i + 1).limit(numOfDaysBetween)
				.mapToObj(i -> startDate.plusMonths(i).toString()).map(i -> endDate(i)).collect(Collectors.toList());
	}

}
