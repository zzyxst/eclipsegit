
public class Active1 {
	public CellArray clist;//��������
	public CellArray NewClist;//��¼�ı���ϸ������
	int row;
	int col;
	int num;
	
	
	public Active1(CellArray ca) {
		//��ʼ��
		clist=new CellArray(10,10);
		NewClist =new CellArray(10,10);
		clist =ca;//��һ�� ��ֵ
		this.row =ca.row;
		this.col=ca.col;
		
	}
	
	
	public CellArray run() {
		 num=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				//1.���ϱ߿�  5���ھ�
				if (i == 0 && j != 0 && j != 9) {// 1.0 �ڵ�һ�� ���ǲ�������ֻ������3��

					if (clist.cellarray[i][j - 1] == 1) {
						
						num = num + 1;

					}

					if (clist.cellarray[i][j+1] == 1) {

						num=num+1;

					}
					if (clist.cellarray[i + 1][j - 1] == 1) {// ��һ
						
						num=num+1;
					
					}
					if (clist.cellarray[i + 1][j] == 1) {// ��2
						
						num=num+1;
						
					}
					if (clist.cellarray[i+1][j+ 1] == 1) {// ��3
						num=num+1;
						
					}

				}
				
				//2. �����ڱ߽�
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
				
				//3. �����±߽� 5���ھ�
				
				else if(i == 9 && j != 0 && j != 9) {
					if (clist.cellarray[i - 1][j -1] == 1) {// ��һ
						num=num+1;

					}
					if (clist.cellarray[i - 1][j] == 1) {// ��2
						num=num+1;

					}
					if (clist.cellarray[i - 1][j + 1] == 1) {// ��3
						num=num+1;

					}
					if (clist.cellarray[i][j+ 1] == 1) {// ��3
						num=num+1;

					}
					if (clist.cellarray[i][j - 1] == 1) {// ��3
						num=num+1;

					}
					
				}
					
				
				//4.��߽� 5���ھ� 
				else if(j == 0 && i!= 0 && i!= 9) {
					if (clist.cellarray[i-1][j] == 1) {// ��2
						num=num+1;
					}
					if (clist.cellarray[i - 1][j + 1] == 1) {// ��3
						num=num+1;
					}
					if (clist.cellarray[i ][j+1] == 1) {// ��һ
						num=num+1;
						
					}

					if (clist.cellarray[i+1][j] == 1) {// ��3
						num=num+1;
					}

					if (clist.cellarray[i+1][j + 1] == 1) {// ��3
						num=num+1;
					}

				
		
				}
				
				
				//5. �ұ�  5���ھ�
				else if(j == 9 && i!= 0 && i!= 9) {
					if (clist.cellarray[i-1][j] == 1) {// ��2
						num=num+1;
					}
					if (clist.cellarray[i - 1][j - 1] == 1) {// ��3
						num=num+1;
					}
					if (clist.cellarray[i ][j-1] == 1) {// ��һ
						num=num+1;
						
					}

					if (clist.cellarray[i+1][j] == 1) {// ��3
						num=num+1;
					}

					if (clist.cellarray[i+1][j -1] == 1) {// ��3
						num=num+1;
					}

				
		
				}
				
				//6.���Ͻ�
				
				else if (i==0&&j==0) {
					if (clist.cellarray[i ][j+1] == 1) {// ��һ
						num=num+1;
						
					}

					if (clist.cellarray[i+1][j] == 1) {// ��3
						num=num+1;
					}

					if (clist.cellarray[i+1][j +1] == 1) {// ��3
						num=num+1;
					}
				}
				
				
				//7. ���Ͻ�
				
				else if (i==0&&j==9) {
					if (clist.cellarray[i ][j-1] == 1) {// ��һ
						num=num+1;
						
					}

					if (clist.cellarray[i+1][j] == 1) {// ��3
						num=num+1;
					}

					if (clist.cellarray[i+1][j -1] == 1) {// ��3
						num=num+1;
					}
				}
				
				
				//8.���½�
				
				else if (i==9&&j==0) {
					if (clist.cellarray[i ][j+1] == 1) {// ��һ
						num=num+1;
						
					}

					if (clist.cellarray[i-1][j] == 1) {// ��3
						num=num+1;
					}

					if (clist.cellarray[i-1][j +1] == 1) {// ��3
						num=num+1;
					}
				}
				
				
				//9.���½�
				
				else if (i==9&&j==9) {
					if (clist.cellarray[i ][j-1] == 1) {// ��һ
						num=num+1;
						
					}

					if (clist.cellarray[i-1][j] == 1) {// ��3
						num=num+1;
					}

					if (clist.cellarray[i-1][j -1] == 1) {// ��3
						num=num+1;
					}
				}
				
				
				
				getchange(i,j);//ִ��ѭ�������� ���ɵõ��µ� newcLIST
				
			}
		}
		return NewClist;
		
	}
	
	
	
	//�õ� ��һ��������
	public void getchange(int x,int y) {
		
		
		if (num == 3) {// ��
			NewClist.cellarray[x][y] = 1;
			
		} else if (num == 2) {
			System.out.println("no");
			NewClist.cellarray[x][y] = clist.cellarray[x][y];
		} else {

			NewClist.cellarray[x][y] = 0;
		}
	}
	
	
	
	

}
