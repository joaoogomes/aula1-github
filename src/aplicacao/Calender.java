package aplicacao;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calender {

	public static void main(String[] args) {

		Date d = Date.from(Instant.parse("2019-03-27T13:00:07Z"));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		System.out.println(d);
		System.out.println(cal.toString());

	}

}
