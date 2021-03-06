/*****************************************************
 * SNIPPET
 * something like a timestamp. It has a start time, and
 * and end time for an individual clip
 ******************************************************/

package snipstitch;

public class Snippet {
	
	private String description;
	private int startHour;
	private int startMinute;
	private int startSecond;
	private int endHour;
	private int endMinute;
	private int endSecond;
	
	public Snippet() {
		
	}
	 
	public Snippet(String newDesc, int newStSec, int newStMin, int newStHr, int newEndSec, int newEndMin, int newEndHr) {
		description = newDesc;
		startSecond = newStSec;
		startMinute = newStMin;
		startHour = newStHr;
		endSecond = newEndSec;
		endMinute = newEndMin;
		endHour = newEndHr;
	}
	
	//gets the times and converts into compatible string
	public String getStartTime() {
		String returnString = startHour + ":" + startMinute + ":" + startSecond; 
		return returnString;
	}
	
	public String getEndTime() {
		String returnString = endHour + ":" + endMinute + ":" + endSecond;
		return returnString;
	}
	
	//getters
	public String getDescription() {
		return description;
	}
	
	public int getStartHour() {
		return startHour;
	}
	
	public int getStartMinute() {
		return startMinute;
	}
	
	public int getStartSecond() {
		return startSecond;
	}
	
	public int getEndHour() {
		return endHour;
	}
	
	public int getEndMinute() {
		return endMinute;
	}
	
	public int getEndSecond() {
		return endSecond;
	}
	
	//setters
	public void setStartHour(int newStartHour) {
		startHour = newStartHour;
	}
	
	public void setStartMinute(int newStartMinute) {
		startMinute = newStartMinute;
	}
	
	public void setStartSecond(int newStartSecond) {
		startSecond = newStartSecond;
	}
	
	public void setEndHour(int newEndHour) {
		endHour = newEndHour;
	}
	
	public void setEndMinute(int newEndMinute) {
		endMinute = newEndMinute;
	}
	
	public void setEndSecond(int newEndSecond) {
		endSecond = newEndSecond;
	}
	
}
