package sjsu.cmpe273.client.util;

public class DateFormatConverter {
	public static String convertToMySqlDate(String time, boolean isEdit) {
		String[] date = new String[3];

		
		if(time == null || time == ""){
			return "";
		}
		String month = "";
		String day = "";
		String year = "";

		if (isEdit) {
			date = time.split("-");
			year = date[0];
			month = date[1];
			day = date[2];
		}else{
			date = time.split("/");
			month = date[0];
			day = date[1];
			year = date[2];
		}
		
		System.out.println("date 1--------------" + date[0]);
		System.out.println("date 2--------------" + date[1]);
		System.out.println("date 3--------------" + date[2]);
		try {
			int m = Integer.parseInt(month);
			int d = Integer.parseInt(day);
			int y = Integer.parseInt(year);
			if (m > 12 || m < 0 || d > 31 || d < 0 || y > 2014 || y < 1500) {
				return "dateError";
			}
		} catch (Exception e) {
			System.out.println("error in parsing day, month , year !");
			return "dateError";
		}
		return year + "-" + month + "-" + day;
	}
	// public String convertToMySqlDate(String time){
	//
	// }
}
