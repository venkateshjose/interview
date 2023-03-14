package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ministatment {

	public static void main(String arg[]) {

		String sample = "10/03 429391800        C    7500.00\r\n10/03 428734400        D   10000.00\r\n31/12 951198291        C     108.00\r\n02/12 34705263         C   22000.00\r\n01/12 807948442        D     800.00\r\n21/11 478836300        D    5000.00\r\n30/09 951146143        C      65.00\r\n29/09 20206239         C     636.00\r\n29/09 16937880         C     901.00\r\n                  Balance:+24765.00\r\n";
		try {

			if (sample.contains("\r") || sample.contains("\n")) {
				List<String> listMinistatement = Stream.of(sample).map(newMini -> newMini.split("\\R\\R"))
						.flatMap(Arrays::stream).collect(Collectors.toList());
				listMinistatement.forEach((mini) -> System.out.println(mini));
			} else {

				System.out.println("Excpetion");
			}
		} catch (Exception e) {

			System.out.println("Excpetion");
		}

	}

}
