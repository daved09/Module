package file;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;
/**
 * 
 * @author David
 *
 */

import logging.LogWriter;

public class Files {
	private boolean error,log;
	private String msg;
	
	public boolean isError() {
		return error;
	}


	public void setError(boolean error) {
		this.error = error;
	}


	public boolean isLog() {
		return log;
	}


	public void setLog(boolean log) {
		this.log = log;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}



	public void write(Vector<?> data,String name){
		try{
			String zeile;
			FileWriter fw = new FileWriter(name);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<data.size();i++){
				zeile = data.get(i).toString();
				bw.write(zeile);
				bw.newLine();
			}
			bw.flush();
			bw.close();
			fw.close();
		}
		catch(Exception e){
			msg = "Error beim Schreiben der Daten.\n "
					+ "Error: "+e.getMessage();
			error = true;
		}
	}
	
	@SuppressWarnings("resource")
	public Vector<String> read(String name){
		Vector<String> daten = new Vector<String>();
		try{
			FileReader fr = new FileReader(name);
			BufferedReader br = new BufferedReader(fr);
			String zeile = br.readLine();
			while(zeile != null){
				daten.add(zeile);
				zeile = br.readLine();
			}
			return daten;
		}
		catch(Exception e){
			msg = "Error beim Lesen der Daten.\n "
					+ "Error: "+e.getMessage();
			error = true;
		}
		return daten;
	}
	
	public static File[] getFiles(String path)
	{
		File[] files = new File(path).listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				if(file.isDirectory())
					return false;
				else return true;
			}
		});
		return files;
	}
	
	public static File[] getDirectories(String path)
	{
		File[] files = new File(path).listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				if(file.isDirectory())
					return true;
				else return false;
			}
		});
		return files;
	}

}
