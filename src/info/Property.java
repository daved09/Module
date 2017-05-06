package info;

import java.util.Calendar;

public class Property {
	public static String getUser(){
		return System.getProperty("user.name");
	}
	
	public static String getOs(){
		return System.getProperty("os.name");
	}

	public static String getHomeDir(){
		String dir;
		if(getOs().contains("Windows")){
			dir = "C:/Users/"+getUser()+"/";
		}
		else{
			dir = "/home/"+getUser()+"/";
		}
		return dir;
	}

	public static String getCurrentDate(){
		Calendar cal = Calendar.getInstance();
		String date = cal.get(Calendar.DAY_OF_MONTH)+"."+cal.get(Calendar.MONTH)+"."+cal.get(Calendar.YEAR);
		return date;
	}

	public static String getCurrentTime(){
		Calendar cal = Calendar.getInstance();
		String time = cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
		return time;
	}

	public static int getCurrentHour(){
		Calendar cal = Calendar.getInstance();
		int time = cal.get(Calendar.HOUR_OF_DAY);
		return time;
	}
	public static int getCurrentMinute(){
		Calendar cal = Calendar.getInstance();
		int time = cal.get(Calendar.MINUTE);
		return time;
	}
	public static int getCurrentSecond(){
		Calendar cal = Calendar.getInstance();
		int time = cal.get(Calendar.SECOND);
		return time;
	}
	
}
