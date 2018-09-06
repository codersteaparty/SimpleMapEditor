package gui;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;

public abstract class AbstractButton {
//х,у - положение кнопок на экране.Width,Heigth - размеры кнопки.
float Width;
float Height;
float x;
float y;
Image image;
Rectangle HitBox;
	public AbstractButton(int x,int y,int Width,int Height,Image image ) {
		this.x=x;
		this.y=y;
		this.Width=Width;
		this.Height=Height;	
		HitBox= new Rectangle(x,y,Width,Height);
		this.image=image;
		
	}
	public AbstractButton(Rectangle r,Image image) {
		this.x=r.getX();
		this.y=r.getY(); 
		this.Width
		=r.getWidth();
		this.Height=r.getHeight();	
		r= new Rectangle(x,y,Width,Height);
		this.image=image;
	}
	public void draw(Graphics g) {
		g.setColor(Color.red);
		image.draw(x,y);
		g.draw(HitBox);
	}
	
	public void Chek(int MousX,int MousY) {
		if(HitBox.contains(MousX,MousY)) {
			metod();
		}
	}
public abstract void metod();
}
