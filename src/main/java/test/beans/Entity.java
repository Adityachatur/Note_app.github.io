package test.beans;

import java.util.*;

public class Entity {

	
	private String title;
	private String note;
	private Date date;
	public Entity(String title, String note, Date date) {
		super();
		this.title = title;
		this.note = note;
		this.date = date;
	}
	
	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Entity [title=" + title + ", note=" + note + ", date=" + date + "]";
	}
	
}
