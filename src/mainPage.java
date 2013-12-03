import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.ObjectInputStream.GetField;

import javax.swing.*;


public class mainPage {
	  final static boolean shouldFill = true;
	  final static boolean shouldWeightX = true;
	  final static boolean RIGHT_TO_LEFT = false;
	  
	public static void main(String[] args) {
		showFrame();
	}
	
	public static void showFrame(){
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(650,650);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add component
		addComponentsToPane(mainFrame.getContentPane());
		mainFrame.setVisible(true);
	}
	
	public static void addComponentsToPane(Container pane){
		
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		//MainPage Buttons
		seleniumIDEButton(pane,c);
		seleiumTestButton(pane, c);
		runBackendTestButton(pane, c);
		runStressTestButton(pane, c);
	}
	
	private static void seleniumIDEButton(Container pane,GridBagConstraints c){
		c.ipady=30;
		c.gridwidth =3;
		c.weightx = 0.0;
		
		setButtonGridAndText(pane,c,"Selenium IDE",0,0);
	}
	
	private static void seleiumTestButton(Container pane,GridBagConstraints c){
		c.weightx = 0.5;
		c.gridwidth =1;
		setButtonGridAndText(pane,c,"Java Selenium Testi Koş",0,1);
	}
	private static void runBackendTestButton(Container pane, GridBagConstraints c){
		c.weightx = 0.5;
		c.gridwidth =1;
		setButtonGridAndText(pane,c,"Backend Testi Koş",1,1);
	}
	private static void runStressTestButton(Container pane,GridBagConstraints c){
		c.weightx = 0.5;
		c.gridwidth =1;
		setButtonGridAndText(pane,c,"Stress Testi Koş",2,1);
	}
	private static void setButtonGridAndText(Container pane,GridBagConstraints c,String buttonText,int gridX,int gridY){
		JButton button = new JButton(buttonText);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = gridX;
		c.gridy = gridY;
		pane.add(button, c);
	}

}
