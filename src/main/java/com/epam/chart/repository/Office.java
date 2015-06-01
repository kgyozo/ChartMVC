package com.epam.chart.repository;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.mongodb.core.mapping.Field;

@XmlRootElement (name = "officehour")
@XmlAccessorType(XmlAccessType.NONE)
public class Office implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Field("Date")
	@XmlElement
	private String date;
	
	@Field("In Office")
	@XmlElement
	private String inOffice;
	
	@Field("Out of Office")
	@XmlElement
	private String outOfOffice;
	
	@Field("Day Start")
	@XmlElement
	private String dayStart;
	
	@Field("Day End")
	@XmlElement
	private String dayEnd;
	
	@Field("Kind")
	@XmlElement
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
