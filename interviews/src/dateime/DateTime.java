package dateime;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DateTime {

	public static final BigDecimal ONE_HUNDRED = new BigDecimal(100);

	public static void main(String args[]) {

		BigDecimal agentTds = new BigDecimal("0.00");

		agentTds = BigDecimal.valueOf(0.004);

		BigDecimal rounded = agentTds.round(new MathContext(2, RoundingMode.HALF_UP));

		BigDecimal roundedval = rounded.setScale(2, BigDecimal.ROUND_HALF_UP);

		System.out.println("roundedval" + roundedval);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String date = sdf.format(new Date());

		System.out.println("datedate" + date);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		LocalDate startDate1 = LocalDate.parse("2022-01-11 10:10:10", formatter);

		LocalDate endDate2 = LocalDate.parse("2022-01-11 10:10:10", formatter);

		LocalDate startDate = LocalDate.parse("2022-01-10", formatter);

		LocalDate endDate = LocalDate.parse("2022-01-25", formatter);

		List<String> date1 = getDatesBetweenUsingJava8(startDate1, endDate2);

		System.out.println("date1  === " + date1);

		List<String> date2 = getDatesBetweenUsingJava8(startDate, endDate);

		System.out.println("date2  === " + date2);

		List<String> differences = date1.stream().filter(element -> date2.contains(element))
				.collect(Collectors.toList());

		/*
		 * List<String> a = empList2.stream().filter(emp2 ->
		 * empList.stream().anyMatch(emp.getSalary().equals("Accounts") && emp ->
		 * emp.getSalary().equals(emp2.getSalary()))).collect(Collectors.toList());
		 */

		System.out.println("differences  === " + differences);

	}

	public static List<String> getDatesBetweenUsingJava8(LocalDate startDate, LocalDate endDate) {

		long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		return IntStream.iterate(0, i -> i + 1).limit(numOfDaysBetween + 1)
				.mapToObj(i -> startDate.plusDays(i).toString()).collect(Collectors.toList());

	}

}
