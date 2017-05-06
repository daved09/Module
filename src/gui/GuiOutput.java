package gui;

import javax.swing.JOptionPane;

import logging.ErrorLog;

public class GuiOutput {
	
	public static void output(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static void infoOutput(String title,String msg){
		JOptionPane.showMessageDialog(null, msg, title,JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void warningOutput(String title,String msg){
		JOptionPane.showMessageDialog(null, msg, title,JOptionPane.WARNING_MESSAGE);
	}
	
	public static void errorOutput(String title,String msg){
		ErrorLog err = new ErrorLog("Error.txt");
		err.writeLog(msg);
		JOptionPane.showMessageDialog(null, msg, title,JOptionPane.ERROR_MESSAGE);
	}
	
	public static void errorOutput(String title,Exception e){
		ErrorLog err = new ErrorLog("Error.txt");
		err.writeLog(e);
		JOptionPane.showMessageDialog(null, e.getMessage(), title,JOptionPane.ERROR_MESSAGE);
	}
	
	public static void excetionOutput(String msg){
		ErrorLog err = new ErrorLog("Exception.txt");
		err.writeLog(msg);
		JOptionPane.showMessageDialog(null, msg, "Exception", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
	}
	
	public static void excetionOutput(Exception e){
		ErrorLog err = new ErrorLog("Exception.txt");
		err.writeLog(e);
		JOptionPane.showMessageDialog(null, e.toString(), "Exception", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
	}
	
	public static Object Input(String title,String msg){
		Object value;
		value = JOptionPane.showInputDialog(null, msg, title);
		return value;
	}

	public static boolean confirmOutput(String text)
	{
		int e = JOptionPane.showConfirmDialog(null,text);
		if(e == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
