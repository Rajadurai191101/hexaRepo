package com.hexaware.model;

public class Salary {
	
	private int Basic;
	private double hra;
	private double pf;
	private double gross;
	private double net;
	
//	public Salary(int basic, double hra, double pf, double gross, double net) {
//		super();
//		Basic = basic;
//		this.hra = hra;
//		this.pf = pf;
//		this.gross = gross;
//		this.net = net;
//	}

	public Salary() {
		// TODO Auto-generated constructor stub
	}

	public int getBasic() {
		return Basic;
	}

	public void setBasic(int basic) {
		Basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra() {
		this.hra = this.Basic * 0.1;
	}

	public double getPf() {
		return pf;
	}

	public void setPf() {
		this.pf = this.Basic * 0.05;
	}

	public double getGross() {
		return gross;
	}

	public void setGross() {
		this.gross = this.getBasic() + this.getHra() +this.getPf();
	}

	public double getNet() {
		return net;
	}

	public void setNet() {
		this.net = this.getGross() - this.getPf();
	}

	@Override
	public String toString() {
		return "Salary [Basic=" + Basic + ", hra=" + hra + ", pf=" + pf + ", gross=" + gross + ", net=" + net + "]";
	}
	
	
	
	
}
