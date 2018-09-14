package system;

import java.util.ArrayList;

import javax.xml.soap.Node;

import org.newdawn.slick.Graphics;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/** ��������� ���� */
public class Layer {
	
	//��� ����, ���������� ��� ���������
	public String name;
	//������ ��������� ����
	private ArrayList<SimpleMapElement> elements = new ArrayList<>();
	
	public Layer(String name) {
		this.name = name;
	}
	
	//���� ����� �������� �������� ��������� ���� �����������, ����������� ����
	public void draw(Graphics g) {
		for(SimpleMapElement element: elements) element.draw(g);
	}
	
	/**
	 * ���� ����� ������� ����� <b>layer</b>, ��������� � ���� ��� �������� <b>element</b>,
	 * � ������� ������� � ������ ����
	 * */
	public void createXML(Document map, Element parent) {
		Element XMLElements = map.createElement("layer");
		XMLElements.setAttribute("name", name);
		for (int i = 0; i < elements.size(); i++)elements.get(i).toXML(map, XMLElements);
		parent.appendChild(XMLElements);
	}
	
	
	
	
	/* -- ������ �������, ������������ ������� � ArrayList -- */
	
	public SimpleMapElement getElement(int index) {
		return elements.get(index);
	}
	
	public int getIndex(SimpleMapElement element) {
		return elements.indexOf(element);
	}
	
	public void removeElement(int index) {
		elements.remove(index);
	}

	public void removeElement(Object obj) {
		elements.remove(obj);
	}

}
