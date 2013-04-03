import Jama.Matrix;


public class BPATriangle {
	BPAEdge[] edge;
	Matrix normal;
	
	BPATriangle(BPAEdge[] edge,double[] normal){
		new BPATriangle(edge,new Matrix(normal,3));
	}
	
	BPATriangle(BPAEdge[] edge,Matrix normal){
		this.edge=edge;
		this.normal=normal;
	}
	
}
