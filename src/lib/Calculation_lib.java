package lib;

public class Calculation_lib { 
	private double m, n;

	public Calculation_lib(double m, double n) {
		this.m = m; //thisがつくとフィールド、ないとローカル変数
		this.n = n;
	}
	

	public double getPlus() {
		return this.m + this.n;
	}
	
	public double getMinus() {
		return this.m - this.n;
	}

	public double getTime() {
		return this.m * this.n;
	}
	
	public double getDivide() {
		return this.m / this.n;
	}

	public double getMod() {
		return this.m % this.n;
	}


}
