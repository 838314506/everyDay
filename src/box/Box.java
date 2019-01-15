package box;

public class Box {
	
	private double width;
	private double height;
	private double depth;
	
	public Box(Box ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	public Box(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	
	public Box(){
		width = -1;
		height = -1;
		depth = -1;
	}
	
	public Box(double len){
		width = height = depth = len;
	}
	
	public double volume() {
		return width * height * depth ;
	}

}

class BoxWeight extends Box{
	double weight;
	
	public BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}
	
	public BoxWeight(double w,double h,double d,double weight) {
		super(w, h, d);
		this.weight = weight;
	}
	
	public BoxWeight() {
		super();
		weight = -1;
	}
	
	public BoxWeight(double len ,double m) {
		super(len);
		weight = m;
	}
}
