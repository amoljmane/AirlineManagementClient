package sjsu.cmpe273.project.beans;

import java.io.Serializable;

public class MonthsBean implements Serializable {
	String monthNumber;
	String month;

	public MonthsBean(String monthNumber, String month) {
		this.monthNumber = monthNumber;
		this.month = month;
	}

	public String getMonthNumber() {
		return monthNumber;
	}

	public void setMonthNumber(String monthNumber) {
		this.monthNumber = monthNumber;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

}
