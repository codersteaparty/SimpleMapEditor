package system;

import java.util.ArrayList;

import org.newdawn.slick.Graphics;

public class Map {
	
	private ArrayList<Elements> elements = new ArrayList<>();
	
	public Map() {
		
	}
	
	public void draw(Graphics g) {
		for(Elements element: elements) element.draw(g);
	}
	
	
	
	/* -- методы доступа, делегирующие запросы к ArrayList -- */
	
	public Elements getElement(int index) {
		return elements.get(index);
	}
	
	public int getIndex(Elements element) {
		return elements.indexOf(element);
	}
	
	public void removeElement(int index) {
		elements.remove(index);
	}

	public void removeElement(Object obj) {
		elements.remove(obj);
	}

}
