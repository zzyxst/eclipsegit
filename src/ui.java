import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

import javax.swing.*;




public class ui extends JPanel {
	
	int x = ca.getrow();
    int  y = ca.getcol();
    CellArray temp ;
	private static CellArray ca = new CellArray(10, 10);
	//private static active act;
	private static Actt actt;
	//private static Active1 AR;
	
	
	public void InitUI() {
		
		
		
//		ca.setcell(0, 1, 1);
//		ca.setcell(0, 2, 1);
//		ca.setcell(1, 0, 1);
//		ca.setcell(2, 1, 1);
//		ca.setcell(2, 2, 1);
		
	    ca.setcell(0, 1, 1);
        ca.setcell(1, 0, 1);//第二行 第三个
        ca.setcell(2, 1, 1);
        ca.setcell(1, 2, 1);
        ca.setcell(6, 3, 1);
        ca.setcell(4, 6, 1);
        ca.setcell(3,3,1);
        ca.setcell(8, 2, 1);
        ca.setcell(4,3,1);
        ca.setcell(6, 8, 1);
        ca.setcell(5, 9, 1);
        ca.setcell(7, 9, 1);
   //     act=new active(ca);
        actt=new Actt(ca);
       // System.out.println(act.cea.cellarray[0][1]);
       
        //AR =new Active1(ca);
       // System.out.println(ca.cellarray[1][2]);
		
		JFrame frame = new JFrame();
		//添加下一代的按钮
		
		
		frame.setTitle("按下空格即可开始");
		frame.setSize(1000, 1000);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.add(new ui());
		frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
               
                if(e.getKeyCode() == KeyEvent.VK_SPACE){
                	
                	System.out.println("开始");
                	
                    temp  =	actt.nextworld();
                
                    frame.repaint();
                     
                     ca=temp;
                     
                     actt=new Actt(ca);
                	
//                	for(int i=0;i<ca.row;i++) {
//            			for(int j=0;j<ca.col;j++) {
//            				if(ca.cellarray[i][j]==1) {
//            					System.out.println("i is " +i+"  j is "+j);
//            				}
//            			}
//            		}
//                	
//                	for(int i=0;i<x;i++) {
//                		
//               		      for(int j=0;j<y;j++) {
//              			
//               			    act.henxin(i,j);//此时得到了新的newcea，要将newcea 赋值给cea
//                			
//                		    temp= act.rua(i, j);
//                		   
//                			
//                			}   
//               		      }
//                
//                	
//                	ca=temp;
//                	
                	
//                	CellArray temp =AR.run();
//                	
//                	ca=temp;
//                	System.out.println("what???");
                	
                	
                }
            }
        });
		
		frame.setVisible(true);
		
	}
	 public void paint(Graphics g) {
		 super.paint(g);
		 
		 int width=1000/x;//宽
		 int height=1000/y;//高
		 for(int i=0;i<10;i++) {//列
			 for(int j=0;j<10;j++) {//行
				 g.setColor(Color.BLACK);
				 
				
				 if(ca.cellarray[i][j]==0) {//死亡
					
				 g.drawRect(j*height,i*width , width, height);
				 }
				 else {
					
				g.fillRect(j*height,i*width , width, height);
				 }
			 }
		 }
	       
	    }
	 
	 //该算法 问题很大 要针对 边界讨论
	 
	 /*	 
	 public void active (CellArray ccc) {
		 for(int i=0 ;i<ccc.row;i++) {
			 for(int j =0;j<ccc.col;j++) {
				 //	1 找到 一个 活的的细胞 
				 int size=0;
				 if(i>=1&&j>=1&&i<8&&j<8) {
				 if(ccc.cellarray[i-1][j-1]==1) {
					 size++;
				 }
				 if(ccc.cellarray[i-1][j]==1) {
					 size++;
				 }
				 if(ccc.cellarray[i-1][j+1]==1) {
					 size++;
				 }
				 if(ccc.cellarray[i][j-1]==1) {
					 size++;
				 }
				 if(ccc.cellarray[i][j+1]==1) {
					 size++;
				 }
				 if(ccc.cellarray[i+1][j-1]==1) {
					 size++;
				 }
				 if(ccc.cellarray[i+1][j]==1) {
					 size++;
				 }
				 if(ccc.cellarray[i-1][j-1]==1) {
					 size++;
				 }
				 if(ccc.cellarray[i+1][j+1]==1) {
					 size++;
				 }
				 }
				
				  if(ccc.cellarray[i][j]==1) {
					
					 if(size!=3&&size!=2) {
						 ccc.cellarray[i][j]=0;
					 }
					 else {
						 
					 }
					
				 }
				  if (ccc.cellarray[i][j]==0) {
					  if(size==3) {
						  ccc.cellarray[i][j]=1;
					  }
				  }
			 }
		 }
	 
	 
	 }
	 */}



