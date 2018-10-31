
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
		

		if (x == 0 && y != 0 && y != 9) {// 1.0 ÔÚµÚÒ»ÅÅ µ«ÊÇ²»ÔÚÁ½±ßÖ»ÓÐÏÂÃæ3¸ö

			if (cea.cellarray[x][y - 1] == 1) {
				System.out.println("size");
				size = size + 1;
               
			}

			if (cea.cellarray[x][y + 1] == 1) {

				size++;

			}
			if (cea.cellarray[x + 1][y - 1] == 1) {// ×óÒ»
				size++;
				
			}
			if (cea.cellarray[x + 1][y] == 1) {// ×ó2
				size++;
			
			}
			if (cea.cellarray[x + 1][y + 1] == 1) {// ×ó3
				size++;
			
			}

		} 
		
		
		else if (y > 0 && y < 9 && x > 0 && x < 9) {// ÔÚÖÐ¼ä °Ë¸ö

		
			
			if (cea.cellarray[x - 1][y-1] == 1) {// ×ó2
				size++;

			}
			if (cea.cellarray[x - 1][y+1] == 1) {// ×ó2
				size++;

			}
			
			if (cea.cellarray[x - 1][y] == 1) {// ×ó2
				size++;

			}
			if (cea.cellarray[x ][y-1] == 1) {// ×ó2
				size++;

			}
			if (cea.cellarray[x ][y+1] == 1) {// ×ó2
				size++;

			}
			if (cea.cellarray[x+1 ][y-1] == 1) {// ×ó2
				size++;

			}
			if (cea.cellarray[x+1 ][y+1] == 1) {// ×ó2
				size++;

			}
			if (cea.cellarray[x+1 ][y] == 1) {// ×ó2
				size++;

			}
			
			
			
			
			
			
  
			

		}
		else if (x == 9 && y != 0 && y != 9) {// ÔÚ×îÏÂÃæ
			if (cea.cellarray[x - 1][y + 1] == 1) {// ×óÒ»
				size++;

			}
			if (cea.cellarray[x - 1][y] == 1) {// ×ó2
				size++;

			}
			if (cea.cellarray[x - 1][y + 1] == 1) {// ×ó3
				size++;

			}
			if (cea.cellarray[x][y + 1] == 1) {// ×ó3
				size++;

			}
			if (cea.cellarray[x][y - 1] == 1) {// ×ó3
				size++;

			}
			// System.out.println("ÏÂÃæ"+size+" ");
		}

		else if (y == 0 && x != 0 && x != 9) {// ÔÚ×ó²à£¬ÎÞ½ÇÂä
			
			if (cea.cellarray[x - 1][y] == 1) {// ×ó2
				size++;
				
			}
			if (cea.cellarray[x - 1][y + 1] == 1) {// ×ó3
				size++;
				
			}
			if (cea.cellarray[x + 1][y] == 1) {// ×óÒ»
				size++;
				
			}

			if (cea.cellarray[x + 1][y + 1] == 1) {// ×ó3
				size++;
			
			}

			if (cea.cellarray[x][y + 1] == 1) {// ×ó3
				size++;
			
			}

			// System.out.println("×ó²à"+size+" ");
		} else if (y == 9 && x != 0 && x != 9) {// ÓÒ²à

			if (cea.cellarray[x + 1][y] == 1) {// ×óÒ»
				size++;

			}

			if (cea.cellarray[x + 1][y - 1] == 1) {// ×ó3
				size++;

			}

			if (cea.cellarray[x - 1][y] == 1) {// ×ó2
				size++;

			}
			if (cea.cellarray[x - 1][y - 1] == 1) {// ×ó3
				size++;

			}
			if (cea.cellarray[x][y - 1] == 1) {// ×ó3
				size++;

			}
			// System.out.println("ÓÒ²à"+size+" ");
		} else {
			if (x == 0 && y == 0) {
				if (cea.cellarray[x][y + 1] == 1) {// ×óÒ»
					size++;

				}
				if (cea.cellarray[x + 1][y] == 1) {// ×ó2
					size++;

				}
				if (cea.cellarray[x + 1][y + 1] == 1) {// ×ó3
					size++;

				}
				// System.out.println("ÉÏ×ó"+size+" ");
			}

			if (x == 9 && y == 0) {
				if (cea.cellarray[x][y + 1] == 1) {// ×óÒ»
					size++;

				}
				if (cea.cellarray[x - 1][y] == 1) {// ×ó2
					size++;

				}
				if (cea.cellarray[x - 1][y + 1] == 1) {// ×ó3
					size++;

				}
				// System.out.println("ÏÂ×ó²à"+size+" ");
			}

			if (x == 9 && y == 9) {
				if (cea.cellarray[x][y - 1] == 1) {// ×óÒ»
					size++;

				}
				if (cea.cellarray[x - 1][y] == 1) {// ×ó2
					size++;

				}
				if (cea.cellarray[x - 1][y - 1] == 1) {// ×ó3
					size++;

				}
				// System.out.println("ÓÒÏÂ²à"+size+" ");
			}

			if (x == 0 && y == 9) {
				if (cea.cellarray[x][y - 1] == 1) {// ×óÒ»
					size++;

				}
				if (cea.cellarray[x + 1][y] == 1) {// ×ó2
					size++;

				}
				if (cea.cellarray[x + 1][y - 1] == 1) {// ×ó3
					size++;

				}
				// System.out.println("ÓÒÉÏ²à"+size+" ");
			}
		}

	}

	public CellArray rua(int x, int y) {
		
	
		if (size == 3) {// »î
			newcea.cellarray[x][y] = 1;
			
		} else if (size == 2) {
			newcea.cellarray[x][y] = cea.cellarray[x][y];
		} else {

			newcea.cellarray[x][y] = 0;
		}
		return newcea;
	}

}
