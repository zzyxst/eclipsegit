
//定义 1为生 0为死
public class CellArray {
	int[][] cellarray;
	int row;
	int col;


	public CellArray(int row, int col) {
		this.row = row;
		this.col = col;
		//此处注意初始化数组 	
		this.cellarray = new int[row][col];
	}
	public int getrow() {
		return row;
		
	}
	public int getcol() {
		return col;
		
	}
	
	public int getcell(int r,int c) {
		if(!(r>=0&&r<row&&c>=0&&c<col)) {
			return 0;
		}
		else {
		return cellarray[r][c];
		}
	}
	public void setcell(int r,int c,int islive ) {
		if(!(r>=0&&r<row&&c>=0&&c<col)) {
			return;
		}
		else {
			cellarray[r][c]=islive;
		}
	}
	public void clear() {
		for(int i=0 ;i<row;i++) {
			for(int j=0;j<col;j++) {
				cellarray[i][j]=0;
			}
		}
	}

}
