package inflearn_java01.c02.ex2;

public class OrthoLine {
	public MyPoint2 u;
	public MyPoint2 v;

	public OrthoLine(MyPoint2 p, MyPoint2 q) {
		u = p;
		v = q;
		if (p.x > q.x || p.x == q.x && p.y > q.y)
			swap();
	}
	
	public void swap() {
		MyPoint2 tmp = u;
		u = v;
		v = tmp;	
	}

	public OrthoLine(int x1, int y1, int x2, int y2) {
		u = new MyPoint2(x1, y1);
		v = new MyPoint2(x2, y2);
	}

	public boolean isVertical() {
		return u.x == u.y;
	}

	public boolean intersects(OrthoLine other) {
		if (isVertical() && other.isVertical()) {
			
			
			
		} else if (!isVertical() && other.isVertical()) {

			
			
		} else
			return false;
	}

}
