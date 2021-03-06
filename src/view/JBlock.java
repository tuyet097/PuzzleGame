package view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Images;

public class JBlock extends JButton{
	private Images imgs;
	private String state;
	private int number;
	private int level;
	
	public JBlock(String s, int n, int l) {
		state = s;
		number = n;
		imgs = new Images();
		level = l;
		if(level == 1)
			setPreferredSize(new Dimension(120,121));
		else if(level == 2)
			setPreferredSize(new Dimension(80,81));
		else
			setPreferredSize(new Dimension(60,61));
			
	}
	
	public void paint(Graphics g) {
		switch (state) {
		case "cell_true":
			g.drawImage(imgs.getList_imgs().get("red_cell"), 0, 0, getPreferredSize().width, getPreferredSize().height, null);
			if(level==1) {
				if(number<10) {
					g.drawImage(imgs.getList_imgs().get("r"+String.valueOf(number)),  40, 40, 40, 40, null);				
				}else {
					g.drawImage(imgs.getList_imgs().get("r"+String.valueOf(number/10)),  20, 40, 40, 40, null);				
					g.drawImage(imgs.getList_imgs().get("r"+String.valueOf(number%10)),  60, 40, 40, 40, null);		
				}		
			}else if(level==2) {
				if(number<10) {
					g.drawImage(imgs.getList_imgs().get("r"+String.valueOf(number)),  28, 28, 28, 28, null);									
				}else {
					g.drawImage(imgs.getList_imgs().get("r"+String.valueOf(number/10)),  15, 26, 26, 26, null);				
					g.drawImage(imgs.getList_imgs().get("r"+String.valueOf(number%10)),  40, 26, 26, 26, null);	
				}
			}else {	
				if(number<10) {
					g.drawImage(imgs.getList_imgs().get("r"+String.valueOf(number)), 20, 20, 20, 20, null);		
				}
				else {
					g.drawImage(imgs.getList_imgs().get("r"+String.valueOf(number/10)), 10, 20, 20, 20,null);		
					g.drawImage(imgs.getList_imgs().get("r"+String.valueOf(number%10)), 30, 20, 20, 20, null);		
				}
			}
			break;
		case "cell_false":
			g.drawImage(imgs.getList_imgs().get("blue_cell"), 0, 0, getPreferredSize().width, getPreferredSize().height, null);
			if(level==1) {
				if(number<10) {
					g.drawImage(imgs.getList_imgs().get("b"+String.valueOf(number)),  40, 40, 40, 40, null);				
				}else {
					g.drawImage(imgs.getList_imgs().get("b"+String.valueOf(number/10)),  20, 40, 40, 40, null);				
					g.drawImage(imgs.getList_imgs().get("b"+String.valueOf(number%10)),  60, 40, 40, 40, null);		
				}		
			}else if(level==2) {
				if(number<10) {
					g.drawImage(imgs.getList_imgs().get("b"+String.valueOf(number)),  28, 28, 28, 28, null);									
				}else {
					g.drawImage(imgs.getList_imgs().get("b"+String.valueOf(number/10)),  15, 26, 26, 26, null);				
					g.drawImage(imgs.getList_imgs().get("b"+String.valueOf(number%10)),  40, 26, 26, 26, null);	
				}
			}else {
				if(number<10) {
					g.drawImage(imgs.getList_imgs().get("b"+String.valueOf(number)), 20, 20, 20, 20, null);
				}
				else {
					g.drawImage(imgs.getList_imgs().get("b"+String.valueOf(number/10)), 10, 20, 20, 20,null);		
					g.drawImage(imgs.getList_imgs().get("b"+String.valueOf(number%10)), 30, 20, 20, 20, null);		
				}
			}
				break;
				
		case "cell_null":
			g.drawImage(imgs.getList_imgs().get("null_cell"), 0, 0, getPreferredSize().width, getPreferredSize().height, null);
			break;
		default:
			g.drawImage(imgs.getList_imgs().get("null_cell"), 0, 0, getPreferredSize().width, getPreferredSize().height, null);
			break;
		}
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
