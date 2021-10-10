package inflearn_java01.c03.ex4;

public class DurationEvent extends Event {
	public MyDate begin;
	public MyDate end;

	public DurationEvent(String title, MyDate b, MyDate e) {
		super(title);
		begin = b;
		end = e;
	}
	
	public boolean isRelevant(MyDate date) { // begin <= date <= end
		return begin.compareTo(date) <= 0 && end.compareTo(date) >= 0;
	}

	public String toString() {
		return title + ", " + begin.toString() + "~" + end.toString();
	}
	
	public MyDate getRepresentativeDate() {
		return begin;
	}
	
}
