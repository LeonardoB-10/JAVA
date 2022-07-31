package pa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class prueba {
	
	public static void main(String[] args) throws ParseException {
//		LocalDate today = LocalDate.now();
//		LocalDate fecha = LocalDate.of(2000,04,06);
//		int years = Period.between(fecha, today).getYears();
//		System.out.println(years);
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		int years = simpleDateFormat.parse("2018-09-09").getYear();
		System.out.println( years );
	}

}
