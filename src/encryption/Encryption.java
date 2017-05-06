package encryption;

public class Encryption {
	
	public String encrypt(String text,int wert){
		String entext="";
		int zeichen;
		for(int i=0;i<text.length();i++){
			zeichen = (int) text.charAt(i)+wert;
			entext = entext + (char) zeichen;
		}
		return entext;
	}
	
	public String decrypt(String entext,int wert){
		String text="";
		int zeichen;
		for(int i=0;i<entext.length();i++){
			zeichen = (int) entext.charAt(i)-wert;
			text = text + (char) zeichen;
		}
		return text;
	}
	
}
