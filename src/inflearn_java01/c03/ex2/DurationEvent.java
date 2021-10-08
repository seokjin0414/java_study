package inflearn_java01.c03.ex2;

public class DurationEvent extends Event {
	public MyDate begin;
	public MyDate end;

	public DurationEvent(String title, MyDate b, MyDate e) {
		super(title);
		begin = b;
		end = e;
	}

	public String toString() {
		return title + ", " + begin.toString() + "~" + end.toString();
	}

}
