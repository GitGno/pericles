import Jama.Matrix;


public class BPAPoint {
	int id;
	Matrix coord;
	Matrix normal;
	int status;
	

	static final int NOT_USED=-1;
	static final int USED=1;
	
	BPAPoint(int id,double[] coord,double[] normal){
		new BPAPoint(id,new Matrix(coord,3),new Matrix(normal,3));
	}
	
	BPAPoint(int id,double[] coord){
		new BPAPoint(id,new Matrix(coord,3));
	}
	
	BPAPoint(double[] coord){
		new BPAPoint(new Matrix(coord,3));
	}
	
	BPAPoint(Matrix coord){
		this.id=-1;
		this.coord=coord;
		this.normal=null;
		this.status = NOT_USED;
	}
	
	BPAPoint(int id,Matrix coord){
		this.id=id;
		this.coord=coord;
		this.normal=null;
		this.status = NOT_USED;
	}
	
	BPAPoint(int id,Matrix coord,Matrix normal){
		this.id=id;
		this.coord=coord;
		this.normal=normal;
		this.status = NOT_USED;
	}
}
