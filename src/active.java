
public class active {

	public CellArray cea;
	public CellArray newcea;

	public active(CellArray ca) {
		this.cea = ca;
		newcea = new CellArray(10, 10);
		

	}

	int size;

	public void henxin(int x, int y) {

		size = 0;
		

		if (x == 0 && y != 0 && y != 9) {// 1.0 �ڵ�һ�� ���ǲ�������ֻ������3��

			if (cea.cellarray[x][y - 1] == 1) {
				System.out.println("size");
				size = size + 1;
               
			}

			if (cea.cellarray[x][y + 1] == 1) {

				size++;

			}
			if (cea.cellarray[x + 1][y - 1] == 1) {// ��һ
				size++;
				
			}
			if (cea.cellarray[x + 1][y] == 1) {// ��2
				size++;
			
			}
			if (cea.cellarray[x + 1][y + 1] == 1) {// ��3
				size++;
			
			}

		} 
		
		
		else if (y > 0 && y < 9 && x > 0 && x < 9) {// ���м� �˸�

		
			
			if (cea.cellarray[x - 1][y-1] == 1) {// ��2
				size++;

			}
			if (cea.cellarray[x - 1][y+1] == 1) {// ��2
				size++;

			}
			
			if (cea.cellarray[x - 1][y] == 1) {// ��2
				size++;

			}
			if (cea.cellarray[x ][y-1] == 1) {// ��2
				size++;

			}
			if (cea.cellarray[x ][y+1] == 1) {// ��2
				size++;

			}
			if (cea.cellarray[x+1 ][y-1] == 1) {// ��2
				size++;

			}
			if (cea.cellarray[x+1 ][y+1] == 1) {// ��2
				size++;

			}
			if (cea.cellarray[x+1 ][y] == 1) {// ��2
				size++;

			}
			
			
			
			
			
			
  
			

		}
		else if (x == 9 && y != 0 && y != 9) {// ��������
			if (cea.cellarray[x - 1][y + 1] == 1) {// ��һ
				size++;

			}
			if (cea.cellarray[x - 1][y] == 1) {// ��2
				size++;

			}
			if (cea.cellarray[x - 1][y + 1] == 1) {// ��3
				size++;

			}
			if (cea.cellarray[x][y + 1] == 1) {// ��3
				size++;

			}
			if (cea.cellarray[x][y - 1] == 1) {// ��3
				size++;

			}
			// System.out.println("����"+size+" ");
		}

		else if (y == 0 && x != 0 && x != 9) {// ����࣬�޽���
			
			if (cea.cellarray[x - 1][y] == 1) {// ��2
				size++;
				
			}
			if (cea.cellarray[x - 1][y + 1] == 1) {// ��3
				size++;
				
			}
			if (cea.cellarray[x + 1][y] == 1) {// ��һ
				size++;
				
			}

			if (cea.cellarray[x + 1][y + 1] == 1) {// ��3
				size++;
			
			}

			if (cea.cellarray[x][y + 1] == 1) {// ��3
				size++;
			
			}

			// System.out.println("���"+size+" ");
		} else if (y == 9 && x != 0 && x != 9) {// �Ҳ�

			if (cea.cellarray[x + 1][y] == 1) {// ��һ
				size++;

			}

			if (cea.cellarray[x + 1][y - 1] == 1) {// ��3
				size++;

			}

			if (cea.cellarray[x - 1][y] == 1) {// ��2
				size++;

			}
			if (cea.cellarray[x - 1][y - 1] == 1) {// ��3
				size++;

			}
			if (cea.cellarray[x][y - 1] == 1) {// ��3
				size++;

			}
			// System.out.println("�Ҳ�"+size+" ");
		} else {
			if (x == 0 && y == 0) {
				if (cea.cellarray[x][y + 1] == 1) {// ��һ
					size++;

				}
				if (cea.cellarray[x + 1][y] == 1) {// ��2
					size++;

				}
				if (cea.cellarray[x + 1][y + 1] == 1) {// ��3
					size++;

				}
				// System.out.println("����"+size+" ");
			}

			if (x == 9 && y == 0) {
				if (cea.cellarray[x][y + 1] == 1) {// ��һ
					size++;

				}
				if (cea.cellarray[x - 1][y] == 1) {// ��2
					size++;

				}
				if (cea.cellarray[x - 1][y + 1] == 1) {// ��3
					size++;

				}
				// System.out.println("�����"+size+" ");
			}

			if (x == 9 && y == 9) {
				if (cea.cellarray[x][y - 1] == 1) {// ��һ
					size++;

				}
				if (cea.cellarray[x - 1][y] == 1) {// ��2
					size++;

				}
				if (cea.cellarray[x - 1][y - 1] == 1) {// ��3
					size++;

				}
				// System.out.println("���²�"+size+" ");
			}

			if (x == 0 && y == 9) {
				if (cea.cellarray[x][y - 1] == 1) {// ��һ
					size++;

				}
				if (cea.cellarray[x + 1][y] == 1) {// ��2
					size++;

				}
				if (cea.cellarray[x + 1][y - 1] == 1) {// ��3
					size++;

				}
				// System.out.println("���ϲ�"+size+" ");
			}
		}

	}

	public CellArray rua(int x, int y) {
		
	
		if (size == 3) {// ��
			newcea.cellarray[x][y] = 1;
			
		} else if (size == 2) {
			newcea.cellarray[x][y] = cea.cellarray[x][y];
		} else {

			newcea.cellarray[x][y] = 0;
		}
		return newcea;
	}

}
