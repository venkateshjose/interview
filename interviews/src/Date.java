import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Date {

	public static void main(String args[]) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String sdate = "2022-08-03";

		String edate = "2022-09-03";

		// convert String to LocalDate
		LocalDate startDate = LocalDate.parse(sdate, formatter);

		LocalDate endDate = LocalDate.parse(edate, formatter);

		List<String> date = getDatesBetweenUsingJava8(startDate, endDate);

		System.out.println("datedate" + date);

		List<String> month = getMonthsBetweenUsingJava8(startDate, endDate);

		System.out.println("monthmonth" + month);

	}

	static List<String> getDatesBetweenUsingJava8(LocalDate startDate, LocalDate endDate) {

		long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		return IntStream.iterate(0, i -> i + 1).limit(numOfDaysBetween + 1)
				.mapToObj(i -> startDate.plusDays(i).toString()).collect(Collectors.toList());
	}

	static List<String> getMonthsBetweenUsingJava8(LocalDate startDate, LocalDate endDate) {

		long numOfDaysBetween = ChronoUnit.MONTHS.between(startDate, endDate);

		numOfDaysBetween = numOfDaysBetween + 1;

		return IntStream.iterate(0, i -> i + 1).limit(numOfDaysBetween)
				.mapToObj(i -> startDate.plusMonths(i).toString()).collect(Collectors.toList());
	}

}
