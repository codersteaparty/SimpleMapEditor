package system;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.newdawn.slick.Graphics;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/** система слоёв */
public class Map {

	private ArrayList<Layer> layers = new ArrayList<>();
	
	public void draw(Graphics g) {
		for(Layer layer: layers) layer.draw(g);
	}
	
	public void createXML() throws ParserConfigurationException {
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document map = docBuilder.newDocument();
		Element root = map.createElement("map");
		map.appendChild(root);
		
		for(Layer layer: layers) layer.createXML(map, root);
	}
	
	
	
	
	/* -- методы доступа, делегирующие запросы к ArrayList -- */
	
	public Layer getLayer(int index) {
		return layers.get(index);
	}
	
	public int getIndex(SimpleMapElement layer) {
		return layers.indexOf(layer);
	}
	
	public void removeLayer(int index) {
		layers.remove(index);
	}

	public void removeElement(Object obj) {
		layers.remove(obj);
	}

}
