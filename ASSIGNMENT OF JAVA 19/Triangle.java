package AssignmentDay2;
public class Triangle {
	private double b;
	private double h;
	private double hy;
	public Triangle(double b, double h, double hy) {
		this.b = b;
		this.h = h;
		this.hy= hy;
	}
	public double getBase() {
		return b;
	}
	public void setBase(double base, double b) {
		this.b = b;
	}
	public double getHeight() {
		return h;
	}
	public void setHeight(double height, double h) {
		this.h = h;
	}
	public double getHypo() {
		return hy;
	}
	public void setHypo(double hypo, double hy) {
		this.hy = hy;
	}
	 public double calcTriangleArea(){
		 return (this.b * this.h) / 2;
	 }
	 public double calcTrianglePerimeter(){
		 return this.b + this.h + this.hy;
	 }
	}




