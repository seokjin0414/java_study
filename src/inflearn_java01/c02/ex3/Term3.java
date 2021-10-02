package inflearn_java01.c02.ex3;

public class Term3 {
	private int coef;
	private int expo;

	public Term3(int c, int e) {
		coef = c;
		expo = e;
	}
	
	public int getExpo() { // getter method
		return expo;
	}
	
	public int calcTerm(int x) {
		return (int) (coef * Math.pow(x, expo));
	}
	
	public void printTerm() {
		System.out.print(coef + "x^" + expo); // -x^2  ==> +-1x^2
	}
	
	public int getCoef() { // getter, accessor
		return coef;
	}
	
	public void setCoef(int coef) { // setter, mutator
		this.coef = coef;
	}
	
}
