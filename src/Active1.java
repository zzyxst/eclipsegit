
public class Active1 {
	public CellArray clist;//初代列阵
	public CellArray NewClist;//记录改变后的细胞列阵
	int row;
	int col;
	int num;
	
	
	public Active1(CellArray ca) {
		//初始化
		clist=new CellArray(10,10);
		NewClist =new CellArray(10,10);
		clist =ca;//第一代 赋值
		this.row =ca.row;
		this.col=ca.col;
		
	}
	
	
	public CellArray run() {
		 num=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				//1.在上边框  5个邻居
				if (i == 0 && j != 0 && j != 9) {// 1.0 在第一排 但是不在两边只有下面3个

					if (clist.cellarray[i][j - 1] == 1) {
						
						num = num + 1;

					}

					if (clist.cellarray[i][j+1] == 1) {

						num=num+1;

					}
					if (clist.cellarray[i + 1][j - 1] == 1) {// 左一
						
						num=num+1;
					
					}
					if (clist.cellarray[i + 1][j] == 1) {// 左2
						
						num=num+1;
						
					}
					if (clist.cellarray[i+1][j+ 1] == 1) {// 左3
						num=num+1;
						
					}

				}
				
				//2. 不处于边界
				else if(i > 0 && i< 9 && j > 0 && j < 9) {
					 if(clist.cellarray[i][j]==1) {
				    	 num--;
				     }
					for(int x=i-1;x<i+1;x++) {
						for(int y=j-1;y<j+1;j++) {
							if(clist.cellarray[x][y]==1) {
								num++;
							}
						}
					}
				    
					
					
				}
				
				//3. 处于下边界 5个邻居
				
				else if(i == 9 && j != 0 && j != 9) {
					if (clist.cellarray[i - 1][j -1] == 1) {// 左一
						num=num+1;

					}
					if (clist.cellarray[i - 1][j] == 1) {// 左2
						num=num+1;

					}
					if (clist.cellarray[i - 1][j + 1] == 1) {// 左3
						num=num+1;

					}
					if (clist.cellarray[i][j+ 1] == 1) {// 左3
						num=num+1;

					}
					if (clist.cellarray[i][j - 1] == 1) {// 左3
						num=num+1;

					}
					
				}
					
				
				//4.左边界 5个邻居 
				else if(j == 0 && i!= 0 && i!= 9) {
					if (clist.cellarray[i-1][j] == 1) {// 左2
						num=num+1;
					}
					if (clist.cellarray[i - 1][j + 1] == 1) {// 左3
						num=num+1;
					}
					if (clist.cellarray[i ][j+1] == 1) {// 左一
						num=num+1;
						
					}

					if (clist.cellarray[i+1][j] == 1) {// 左3
						num=num+1;
					}

					if (clist.cellarray[i+1][j + 1] == 1) {// 左3
						num=num+1;
					}

				
		
				}
				
				
				//5. 右边  5个邻居
				else if(j == 9 && i!= 0 && i!= 9) {
					if (clist.cellarray[i-1][j] == 1) {// 左2
						num=num+1;
					}
					if (clist.cellarray[i - 1][j - 1] == 1) {// 左3
						num=num+1;
					}
					if (clist.cellarray[i ][j-1] == 1) {// 左一
						num=num+1;
						
					}

					if (clist.cellarray[i+1][j] == 1) {// 左3
						num=num+1;
					}

					if (clist.cellarray[i+1][j -1] == 1) {// 左3
						num=num+1;
					}

				
		
				}
				
				//6.左上角
				
				else if (i==0&&j==0) {
					if (clist.cellarray[i ][j+1] == 1) {// 左一
						num=num+1;
						
					}

					if (clist.cellarray[i+1][j] == 1) {// 左3
						num=num+1;
					}

					if (clist.cellarray[i+1][j +1] == 1) {// 左3
						num=num+1;
					}
				}
				
				
				//7. 右上角
				
				else if (i==0&&j==9) {
					if (clist.cellarray[i ][j-1] == 1) {// 左一
						num=num+1;
						
					}

					if (clist.cellarray[i+1][j] == 1) {// 左3
						num=num+1;
					}

					if (clist.cellarray[i+1][j -1] == 1) {// 左3
						num=num+1;
					}
				}
				
				
				//8.左下角
				
				else if (i==9&&j==0) {
					if (clist.cellarray[i ][j+1] == 1) {// 左一
						num=num+1;
						
					}

					if (clist.cellarray[i-1][j] == 1) {// 左3
						num=num+1;
					}

					if (clist.cellarray[i-1][j +1] == 1) {// 左3
						num=num+1;
					}
				}
				
				
				//9.右下角
				
				else if (i==9&&j==9) {
					if (clist.cellarray[i ][j-1] == 1) {// 左一
						num=num+1;
						
					}

					if (clist.cellarray[i-1][j] == 1) {// 左3
						num=num+1;
					}

					if (clist.cellarray[i-1][j -1] == 1) {// 左3
						num=num+1;
					}
				}
				
				
				
				getchange(i,j);//执行循环跳出后 即可得到新的 newcLIST
				
			}
		}
		return NewClist;
		
	}
	
	
	
	//得到 下一带的数组
	public void getchange(int x,int y) {
		
		
		if (num == 3) {// 活
			NewClist.cellarray[x][y] = 1;
			
		} else if (num == 2) {
			System.out.println("no");
			NewClist.cellarray[x][y] = clist.cellarray[x][y];
		} else {

			NewClist.cellarray[x][y] = 0;
		}
	}
	
	
	
	

}
