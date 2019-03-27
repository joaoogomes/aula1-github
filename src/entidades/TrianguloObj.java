package entidades;

public class TrianguloObj {
	public double ladoa;
	public double ladob;
	public double ladoc;

	public TrianguloObj(double ladoa, double ladob, double ladoc) {
		super();
		this.ladoa = ladoa;
		this.ladob = ladob;
		this.ladoc = ladoc;
	}

	public double CalculaArea() {
		double area = 0;
		double p = (this.ladoa + this.ladob + this.ladoc) / 2;
		area = Math.sqrt(p * (p - this.ladoa) * (p - this.ladob) * (p - this.ladoc));
		return area;
	}
}
