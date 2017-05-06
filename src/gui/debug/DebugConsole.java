package gui.debug;

import console.Error;
import console.Output;
import gui.Window;

import javax.swing.*;
import java.awt.*;

/**
 * Created by David on 21.12.2016.
 */
public class DebugConsole extends Window {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ErrorLevel err;
    public DebugConsole()
    {
        debugConsole("Init Debugconsole");
        debugConsole("Set Consolesize to 300x300");
        newWindow(300,300,"Debugconsole",HIDE_ON_CLOSE);
        debugConsole("Initalize GUI");
        initGui();
        debugConsole("GUI initalized");
        debugConsole("Init Thread");
        thread();
    }

    private JTextArea txtDebug;

    private void initGui()
    {
        JScrollPane sc = new JScrollPane();
        txtDebug = new JTextArea();
        sc.setViewportView(txtDebug);
        txtDebug.setLineWrap(true);
        txtDebug.setWrapStyleWord(true);
        txtDebug.setEditable(false);
        JPanel panelTxt = new JPanel();
        panelTxt.setLayout(new BoxLayout(panelTxt, BoxLayout.Y_AXIS));
        panelTxt.add(txtDebug);
        add(panelTxt);
    }

    private void debugConsole(String text)
    {
        Output.outLine(text);
    }

    public void log(String text, ErrorLevel err)
    {
        txtDebug.append(getWordByLevel(err)+text+"\n");
        this.err = err;
    }

    private String getWordByLevel(ErrorLevel err)
    {
        switch (err)
        {
            case DEBUG:return "debug: ";
            case WARING:return "warning: ";
            case ERROR:return "error: ";
            case EXCEPTION:return "exception: ";
            default:Error.error("Fehler beim festlegen des Errorlevels.");
        }
        return "";
    }

    private void thread()
    {
        new Thread(new Runnable() {
        	public void run(){
            try
            {
                while (true)
                {
                    if((err == ErrorLevel.ERROR)||(err == ErrorLevel.EXCEPTION))
                    {
                        txtDebug.setForeground(Color.RED);
                        showWindow();
                    }
                    Thread.sleep(100);
                }
            }
            catch (Exception e)
            {
                Error.exception(e);
            }
        }
        }).start();
    }

}
