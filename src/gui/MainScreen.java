package gui;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import gui.MainScreen;

public class MainScreen extends BasicGame {
	
	public MainScreen(String title) {
		super(title);
	}
	
	
	Image Background;
	AbstractButton Brush1;
	AbstractButton Eraser1;
	AbstractButton DownloadMaps1;
	AbstractButton SaveMaps1;
	AbstractButton SaveElement1;
	AbstractButton DownloadElement1;
	AbstractButton AddElement1;
	
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		
		g.drawImage(Background, 0, 0);
		Brush1.draw(g);
		Eraser1.draw(g);
		DownloadMaps1.draw(g);
		SaveMaps1.draw(g);
		SaveElement1.draw(g);
		DownloadElement1.draw(g);
		AddElement1.draw(g);
	}
	

	@Override
	public void init(GameContainer container) throws SlickException {
		
		
		
		
		Image Brush;
		Image Eraser;
		Image DownloadMaps;
		Image SaveMaps;
		Image SaveElement;
		Image DownloadElement;
		Image AddElement;
		
		
		
		
		
		Background = new Image("textures/Background.png");
		Brush = new Image("textures/Brush.png");
		Eraser = new Image("textures/Eraser.png");
		DownloadMaps = new Image("textures/DownloadMaps.png");
		SaveMaps = new Image("textures/SaveMaps.png");
		SaveElement = new Image("textures/SaveElement.png");
		DownloadElement = new Image("textures/DownloadElement.png");		
		AddElement = new Image("textures/AddElement.png");		

	
	
		Brush1 = new AbstractButton(2,60,47,42,Brush){
			@Override
			public void metod(){
			//и тут, то, что ты от него хочешь
				System.out.println("Brush");
			}
			};
			

			
		Eraser1 = new AbstractButton(2,105,47,44,Eraser){
			@Override
			public void metod(){
			//и тут, то, что ты от него хочешь
				System.out.println("Eraser1");
			}
			};

			
			
		DownloadMaps1 = new AbstractButton(2,152,47,45,DownloadMaps){
			@Override
			public void metod(){
			//и тут, то, что ты от него хочешь
				System.out.println("DownloadMaps1");
			}
			};
	
			
		SaveMaps1 = new AbstractButton(2,200,47,45,SaveMaps){
			@Override
			public void metod(){
			//и тут, то, что ты от него хочешь
				System.out.println("SaveMaps1");
			}
			};	
			
			
		SaveElement1 = new AbstractButton(2,2,53,53,SaveElement){
			@Override
			public void metod(){
			//и тут, то, что ты от него хочешь
				System.out.println("SaveElement1");
				
			}
			};	
			
			
		DownloadElement1 = new AbstractButton(59,2,60,53,DownloadElement){
			@Override
			public void metod(){
			//и тут, то, что ты от него хочешь
				System.out.println("DownloadElement1");
			}
			};	
			
			
		AddElement1 =  new AbstractButton(735,2,63,56,AddElement){
			@Override
			public void metod(){
			//и тут, то, что ты от него хочешь
				System.out.println("AddElement1");
			}
			};	
			
	}
	
	
	
	@Override
	public void mouseClicked(int button, int x, int y, int clickCount) {
		super.mouseClicked(button, x, y, clickCount);
		Brush1.Chek(x, y);
		Eraser1.Chek(x, y);
		DownloadMaps1.Chek(x, y);
		SaveMaps1.Chek(x, y);
		SaveElement1.Chek(x, y); 
		DownloadElement1.Chek(x,y);
		AddElement1.Chek(x,y);
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		// TODO Auto-generated method stub
	}

	
	public static void main(String[] args)  throws SlickException {
		// TODO Auto-generated method stub
		AppGameContainer game = new AppGameContainer(new MainScreen ("Map Editor"));
		game.setDisplayMode(800, 600, false);
		game.setTargetFrameRate(60);
		game.start();
	}

}
