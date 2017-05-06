package logging;

public class ErrorLog extends LogWriter{
	
	public ErrorLog(){
		
	}
	
	public ErrorLog(String file){
		super(file);
	}
	
	
	
	public void writeLog(Exception e){
		super.writeLog("Error: "+e.toString());
	}
	
	public void writeLog(String msg){
		super.writeLog("Error: "+msg);
	}

}
