package program3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringtoDate {
	public static void main (String[] args) throws ParseException {
		String d ="22/04/2018";
		Date dd = new SimpleDateFormat("dd/MM/yyyy").parse(d);
		System.out.println("date is "+dd);
	}
}