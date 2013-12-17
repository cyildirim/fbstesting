import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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
		JLabel fbsHeader = new JLabel("FBS testing");
		seleniumIDEButton(pane,c);
		seleiumTestButton(pane, c);
		runBackendTestButton(pane, c);
		runStressTestButton(pane, c);
	}
	
	private static void seleniumIDEButton(Container pane,GridBagConstraints c){
		c.ipady=10;
		c.gridwidth =1;
		c.weightx = 0.0;
		JButton button = new JButton("Selenium IDE");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 6;
		pane.add(button, c);
		button.addActionListener(executeSeleniumIDEAction());
	}
	
	private static void seleiumTestButton(Container pane,GridBagConstraints c){
		c.weightx = 0.5;
		c.gridwidth =1;
		JButton button = new JButton("Java Selenium Testi Koş");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		pane.add(button, c);
	}
	private static void runBackendTestButton(Container pane, GridBagConstraints c){
		c.weightx = 0.5;
		c.gridwidth =1;
		JButton button = new JButton("Backend Testi Koş");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		pane.add(button, c);
	}
	private static void runStressTestButton(Container pane,GridBagConstraints c){
		c.weightx = 0.5;
		c.gridwidth =1;
		JButton button = new JButton("Stress Testi Koş");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		pane.add(button, c);
	}
	public static ActionListener executeSeleniumIDEAction(){
		return new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				try {
					String command = "/Applications/Firefox.app/Contents/MacOS/firefox-bin --chrome 'chrome://selenium-ide/content/'";
					System.out.println(command);
//					Process a = Runtime.getRuntime().exec("/Applications/Firefox.app/Contents/MacOS/firefox");
					Process p = Runtime.getRuntime().exec(command);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		};
	}

}
