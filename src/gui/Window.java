package gui;

import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * 
 * @author David
 *
 */

public class Window extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Window()
	{
		standartFenster();
	}

	public Window(int breite,int hoehe,String titel,int schliesoperation){
		newWindow(breite, hoehe, titel, schliesoperation);
	}

	
	private void standartFenster(){
		this.newWindow(500,500,"Standartfenster",EXIT_ON_CLOSE);
	}
	
	public void newWindow(int breite,int hoehe,String titel,int schliesoperation){
		this.setSize(breite, hoehe);
		this.setTitle(titel);
		this.setDefaultCloseOperation(schliesoperation);
	}
	
	public void showWindow(){
		setVisible(true);
	}
	
	public void hideWindow(){
		setVisible(false);
	}
	
	public JPanel panel(){
		JPanel panel = new JPanel();
		return panel;
	}

	public void setMousePos()
	{
		this.setLocation(MouseInfo.getPointerInfo().getLocation());
	}
	
	public JPanel boxPanel(){
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		return panel;
	}
	
	public JPanel gridPanel(int rows,int cols){
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(rows,cols));
		return panel;
	}
	
	public JPanel gridPanel(){
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout());
		return panel;
	}
	
	
	public JButton button(String text,ActionListener listener){
		JButton btn = new JButton();
		btn.addActionListener(listener);
		btn.setText(text);
		return btn;
	}
	
	public JLabel label(String text){
		JLabel label = new JLabel();
		label.setText(text);
		return label;
	}
	
	public JCheckBox checkBox(String text){
		JCheckBox box = new JCheckBox();
		box.setText(text);
		return box;
	}

	public JCheckBox checkBox(String name,String text){
		JCheckBox box = new JCheckBox();
		box.setName(name);
		box.setText(text);
		return box;
	}
	
	public JTextArea textArea(boolean editable,boolean lineWrap){
		JTextArea textArea = new JTextArea();
		textArea.setEditable(editable);
		textArea.setLineWrap(lineWrap);
		textArea.setWrapStyleWord(lineWrap);
		return textArea;
	}
	
	public JTextField textField(){
		JTextField textfeld = new JTextField();
		return textfeld;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JList<?> liste(ListModel model){
		JList<?> liste = new JList();
		liste.setModel(model);
		return liste;
	}
	
	@SuppressWarnings("rawtypes")
	public DefaultListModel<?> listModel(){
		DefaultListModel<?> model = new DefaultListModel();
		return (DefaultListModel<?>) model;
	}
	
	public JScrollPane scrollPane(){
		JScrollPane scrollPane = new JScrollPane();
		return scrollPane;
	}
	
	public JScrollPane scrollText(JTextArea textArea){
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(textArea);
		return scrollPane;
	}
	
	public JScrollPane scrollText(JTable table){
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		return scrollPane;
	}
	
	public JScrollPane scrollText(JList<?> list){
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(list);
		return scrollPane;
	}

	
	public JMenuItem menuItem(String name,String text,ActionListener listener){
		JMenuItem menuitem = new JMenuItem();
		menuitem.addActionListener(listener);
		menuitem.setName(name);
		menuitem.setText(text);
		return menuitem;
	}
	
	public JTable tabelle(AbstractTableModel tablemodel){
		JTable table = new JTable();
		table.setModel(tablemodel);
		return table;
	}
	
	public JTable tabelle(AbstractTableModel tablemodel,DefaultTableCellRenderer renderer){
		JTable table = new JTable();
		table.setModel(tablemodel);
		table.setDefaultRenderer(Object.class, renderer);
		return table;
	}

	public JComboBox<String> comboBoxStrings(String[] objects){
		JComboBox<String> box = new JComboBox<>();
		for(int i=0;i<objects.length;i++){
			box.addItem(objects[i]);
		}
		return box;
	}

	public JComboBox<Integer> comboBoxNumbers(int amount){
		JComboBox<Integer> box = new JComboBox<>();
		for(int i=0;i<amount;i++){
			box.addItem(amount);
		}
		return box;
	}

	public JComboBox<Object> comboBoxObjects(Object[] objects){
		JComboBox<Object> box = new JComboBox<>();
		for(int i=0;i<objects.length;i++){
			box.addItem(objects[i]);
		}
		return box;
	}
	
}
