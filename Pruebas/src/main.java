import java.text.ParseException;
import java.text.SimpleDateFormat;

public class main {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date yourDate = sdf.parse("1992-07-26");
		Show show = new Show(5, yourDate, 24);
		System.out.println(show);

	}

}
