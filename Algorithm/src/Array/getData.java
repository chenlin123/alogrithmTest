package Array;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class getData {
	public static long getTimeStemp(String str) throws ParseException{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(str);
		long timeStemp = date.getTime();
		return timeStemp;
	}
	
	public static void main(String[] args) throws ParseException{
		String str1 = "2011-02-12";
		String str2 = "2011-03-22";
		System.out.println(getData.getTimeStemp(str1)/(1000*60*60*24));
		System.out.println(getData.getTimeStemp(str2)/(1000*60*60*24));
		
	}
}