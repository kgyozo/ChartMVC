package com.epam.chart.repository;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Field;

public class Office {

	@Field("Date")
	private String date;
	
	@Field("In Office")
	private String inOffice;
	
	@Field("Out of Office")
	private String outOfOffice;
	
	@Field("Day Start")
	private String dayStart;
	
	@Field("Day End")
	private String dayEnd;
	
	@Field("Kind")
	private String kind;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getInOffice() {
		return inOffice;
	}

	public void setInOffice(String inOffice) {
		this.inOffice = inOffice;
	}

	public String getOutOfOffice() {
		return outOfOffice;
	}

	public void setOutOfOffice(String outOfOffice) {
		this.outOfOffice = outOfOffice;
	}

	public String getDayStart() {
		return dayStart;
	}

	public void setDayStart(String dayStart) {
		this.dayStart = dayStart;
	}

	public String getDayEnd() {
		return dayEnd;
	}

	public void setDayEnd(String dayEnd) {
		this.dayEnd = dayEnd;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	
}
