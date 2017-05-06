package gui;

import javax.swing.JFileChooser;

public class FileWindow {
	

	public static String fileSave(){
		try{
			JFileChooser fc = new JFileChooser();
			String file;
			int choose = fc.showSaveDialog(null);
			if(choose == JFileChooser.APPROVE_OPTION){
				file = fc.getSelectedFile().getAbsolutePath();
				return file;
			}
			else{
				GuiOutput.infoOutput("File", "No File choosen.");
			}
			
		}
		catch(Exception e){
			GuiOutput.errorOutput("Filesaveerror", e);
		}
		return null;
	}
	
	public static String fileOpen(){
		try{
			JFileChooser fc = new JFileChooser();
			String file;
			int choose = fc.showOpenDialog(null);
			if(choose == JFileChooser.APPROVE_OPTION){
				file = fc.getSelectedFile().getAbsolutePath();
				return file;
			}
			else{
				GuiOutput.infoOutput("File", "No File choosen.");
			}
			
		}
		catch(Exception e){
			GuiOutput.errorOutput("Fileloaderror", e);
		}
		return null;
	}
	
	public static String filePath(String title){
		try{
			JFileChooser fc = new JFileChooser();
			String file;
			int choose = fc.showDialog(null, title);
			if(choose == JFileChooser.APPROVE_OPTION){
				file = fc.getSelectedFile().getAbsolutePath();
				return file;
			}
			else{
				GuiOutput.infoOutput("File", "No File choosen.");
			}
			
		}
		catch(Exception e){
			GuiOutput.errorOutput("Filechooseerror", e);
		}
		return null;
	}

}
