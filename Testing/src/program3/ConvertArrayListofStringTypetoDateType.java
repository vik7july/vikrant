package program3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConvertArrayListofStringTypetoDateType {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		List<String> dd = new ArrayList<String>();
		dd.add("2015-11-09");
		dd.add("2015-11-08");
		dd.add("2015-11-07");
		dd.add("2015-11-06");
		dd.add("2015-11-10");
	
	
	List<Date> dates = new ArrayList<Date>();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

//loop over all String values
	for(String d:dd)
	{
		// sdf.parse(dateString) - convert the String into a Date accoring the pattern
		// dates.add(...) - add the Date to the list
		dates.add(sdf.parse(d));
		System.out.println(dates);
	}
	
}}