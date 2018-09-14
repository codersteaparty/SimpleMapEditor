package system;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class SimpleMapElement {
	String Type;
	float Width;
	float Height;
	float x;
	float y;
	Image image;
	Rectangle HitBox;

	public SimpleMapElement(String Type, int x, int y, int Width, int Height, Image image) {
		this.Type = Type;
		this.x = x;
		this.y = y;
		this.Width = Width;
		this.Height = Height;
		HitBox = new Rectangle(x, y, Width, Height);
		this.image = image;
	}

	public void draw(Graphics g) {
		g.setColor(Color.red);
		image.draw(x, y);
		g.draw(HitBox);
	}
	
	public void toXML(Document map, Element parent) {
		//TODO: написать XML-представление элемента
	}
}
