package program3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatetoString {
	  public static void main(String args[]){  
		 Date d =Calendar.getInstance().getTime();
		 DateFormat  dd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		 String str = dd.format(d);
		 System.out.println("String is "+str);
		  
		  
	  }

}
