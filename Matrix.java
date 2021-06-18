
public class Matrix {
	
	public int no_of_rows;
	public int no_of_cols;
	public double[][] matrix;
	
	Matrix(int no_of_rows, int no_of_cols){
		this.no_of_rows = no_of_rows;
		this.no_of_cols = no_of_cols;
		this.matrix = new double[no_of_rows][no_of_cols];
		this.reset();
	}
	
	public void reset() {
		for(int i = 0; i < this.no_of_rows; i++) {
			for(int j = 0; j < this.no_of_cols; j++) {
				this.matrix[i][j] = 0.0;
			}
		}
	}
	
	
	//add functionality code start
	public static Matrix add(Matrix ob, int n) {
		Matrix ans = new Matrix(ob.no_of_rows, ob.no_of_cols);
		for(int i = 0; i < ob.no_of_rows; i++) {
			for(int j = 0; j < ob.no_of_cols; j++) {
				ans.matrix[i][j] = ob.matrix[i][j] + n;
			}
		}
		return ans;
	}
	
	public static Matrix add(Matrix ob, float n) {
		Matrix ans = new Matrix(ob.no_of_rows, ob.no_of_cols);
		for(int i = 0; i < ob.no_of_rows; i++) {
			for(int j = 0; j < ob.no_of_cols; j++) {
				ans.matrix[i][j] = ob.matrix[i][j] + n;
			}
		}
		return ans;
	}
	
	public static Matrix add(Matrix ob, double n) {
		Matrix ans = new Matrix(ob.no_of_rows, ob.no_of_cols);
		for(int i = 0; i < ob.no_of_rows; i++) {
			for(int j = 0; j < ob.no_of_cols; j++) {
				ans.matrix[i][j] = ob.matrix[i][j] + n;
			}
		}
		return ans;
	}
	
	public static Matrix add(Matrix ob1, Matrix ob2) {
		Matrix ans = null;
		if((ob1.no_of_rows == ob2.no_of_rows) && (ob1.no_of_cols == ob2.no_of_cols)) {
			ans = new Matrix(ob1.no_of_rows, ob1.no_of_cols);
			for(int i = 0; i <ans.no_of_rows; i++) {
				for(int j = 0; j < ans.no_of_cols; j++) {
					ans.matrix[i][j] = ob1.matrix[i][j] + ob2.matrix[i][j];
				}
			}
		}
		return ans;
	}
	//add functionality code end
	
	//subtract functionality code start
	public static Matrix sub(Matrix ob, int n) {
		Matrix ans = new Matrix(ob.no_of_rows, ob.no_of_cols);
		for(int i = 0; i < ob.no_of_rows; i++) {
			for(int j = 0; j < ob.no_of_cols; j++) {
				ans.matrix[i][j] = ob.matrix[i][j] - n;
			}
		}
		return ans;
	}
	
	public static Matrix sub(Matrix ob, float n) {
		Matrix ans = new Matrix(ob.no_of_rows, ob.no_of_cols);
		for(int i = 0; i < ob.no_of_rows; i++) {
			for(int j = 0; j < ob.no_of_cols; j++) {
				ans.matrix[i][j] = ob.matrix[i][j] - n;
			}
		}
		return ans;
	}
	
	public static Matrix sub(Matrix ob, double n) {
		Matrix ans = new Matrix(ob.no_of_rows, ob.no_of_cols);
		for(int i = 0; i < ob.no_of_rows; i++) {
			for(int j = 0; j < ob.no_of_cols; j++) {
				ans.matrix[i][j] = ob.matrix[i][j] - n;
			}
		}
		return ans;
	}
	
	public static Matrix sub(Matrix ob1, Matrix ob2) {
		Matrix ans = null;
		if((ob1.no_of_rows == ob2.no_of_rows) && (ob1.no_of_cols == ob2.no_of_cols)) {
			ans = new Matrix(ob1.no_of_rows, ob1.no_of_cols);
			for(int i = 0; i <ans.no_of_rows; i++) {
				for(int j = 0; j < ans.no_of_cols; j++) {
					ans.matrix[i][j] = ob1.matrix[i][j] - ob2.matrix[i][j];
				}
			}
		}
		return ans;
	}
	//subtract functionality code end
	
	//multiplication functionality code start
	public static Matrix mul(Matrix ob, int n) {
		Matrix ans = new Matrix(ob.no_of_rows, ob.no_of_cols);
		for(int i = 0; i < ob.no_of_rows; i++) {
			for(int j = 0; j < ob.no_of_cols; j++) {
				ans.matrix[i][j] = ob.matrix[i][j] * n;
			}
		}
		return ans;
	}
	
	public static Matrix mul(Matrix ob, float n) {
		Matrix ans = new Matrix(ob.no_of_rows, ob.no_of_cols);
		for(int i = 0; i < ob.no_of_rows; i++) {
			for(int j = 0; j < ob.no_of_cols; j++) {
				ans.matrix[i][j] = ob.matrix[i][j] * n;
			}
		}
		return ans;
	}
	
	public static Matrix mul(Matrix ob, double n) {
		Matrix ans = new Matrix(ob.no_of_rows, ob.no_of_cols);
		for(int i = 0; i < ob.no_of_rows; i++) {
			for(int j = 0; j < ob.no_of_cols; j++) {
				ans.matrix[i][j] = ob.matrix[i][j] * n;
			}
		}
		return ans;
	}
	
	public static Matrix mul(Matrix ob1, Matrix ob2) {
		Matrix ans = null;
		if(ob1.no_of_cols == ob1.no_of_rows) {
			ans = new Matrix(ob1.no_of_rows, ob2.no_of_cols);
			for(int i = 0; i < ob1.no_of_rows; i++) {
				for(int j = 0; j < ob2.no_of_cols; j++) {
					for(int k = 0; k < ob1.no_of_cols; k++) {
						ans.matrix[i][j] += ob1.matrix[i][k] * ob2.matrix[k][j];
					}
				}
			}
		}
		return ans;
	}
	//Multiplication functionality end
}