package logging;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

import console.Error;
import gui.GuiOutput;

public class LogWriter {
	
	public LogWriter(){
		
	}
	
	public LogWriter(String file){
		this.file = file;
	}
	
	public void setFile(String file){
		this.file = file;
	}
	
	private String file;
	
	@SuppressWarnings("unused")
	private void delLog(){
		try{
			File file = new File(this.file);
			if(file.exists()){
				file.delete();
			}
		}
		catch(Exception e){
		}
	}
	
	public void writeLog(String msg){
		try{
			Vector<String> logs = new Vector<>();
			File file = new File(this.file);
			if(file.exists()){
				BufferedReader br = new BufferedReader(new FileReader(file));
				String zeile = br.readLine();
				while(zeile != null){
					logs.add(zeile);
					zeile = br.readLine();
				}
				br.close();
			}
			logs.add(msg);
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for(int i=0;i<logs.size();i++){
				bw.write(logs.get(i));
				bw.newLine();
			}
			bw.flush();
			bw.close();			
		}
		catch(Exception e){
			Error.error(e.toString());
			GuiOutput.errorOutput("Fatal Error", e.toString());
		}
	}

}
