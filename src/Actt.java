
public class Actt {
	public CellArray clist;
	public CellArray newclist;
	Actt(CellArray ca){
		clist =ca;
		newclist =new CellArray(10,10);
	}
	//统计邻居数目
	public int neighbors(int row, int col) {//判断邻居数目
	    int count = 0, c, r;
	    for(r = row-1; r <= row+1; r++)
	        for(c = col-1; c <= col+1; c++) {
	            if(r < 0 || r >= 10 || c < 0 || c >= 10)
	                continue;
	            if(clist.cellarray[r][c] == 1)
	                count++;
	        }
	    
	    if(clist.cellarray[row][col] == 1)//判断时包含了被判断的坐标，所以如果为ALIVE要减1
	    	count--;
	    return count;
	}
	
   public CellArray nextworld() {
	   for(int i=0;i<10;i++) {
		   for (int j=0;j<10;j++) {
			   switch (neighbors(i,j)) {
			   case 0:
			   case 1:
			   case 4:
			   case 5:
			   case 6:
			   case 7:
			   case 8:
				   newclist.cellarray[i][j]=0;
				   break;
			   case 2:
				   newclist.cellarray[i][j]=clist.cellarray[i][j];
				   break;
			   case 3:
				   newclist.cellarray[i][j]=1;
				   break;
			   
			   
			   }
		   }
	   }
	   return newclist;
   }
	
}
