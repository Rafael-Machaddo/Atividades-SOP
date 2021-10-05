package nru;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends Thread{
	//teste
	static JFrame frame = new JFrame("NRU");
	static JTextField textField = new JTextField(40);
	static JTextArea instructions = new JTextArea(5, 60);
	static Memory memory = new Memory(32);
	static PageTable pageTable = new PageTable(64);
	
	public static void main(String[] args){		
		frame.setVisible(true);
		frame.setSize(600, 150);
		frame.getContentPane().add(instructions,"Norte");
		frame.getContentPane().add(textField,"Centro");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		instructions.setBackground(Color.LIGHT_GRAY);
        instructions.append("Instruções:\n");
        instructions.append(" Referenciar página n : 'r' + espaço + n\n");
        instructions.append(" Modificar página n : 'm' + espaço + n\n");
        instructions.append(" Sair: 'e'\n");
        instructions.setEditable(false);
		textField.setEditable(true);
		textField.setVisible(true);
		textField.addActionListener(new ActionListener() {            
            public void actionPerformed(ActionEvent e) {
            	String input = textField.getText();
            	switch(input.charAt(0)){
            		case 'r':{
            			String[] strs = input.split(" ");
            			if(strs.length>1){
            				int id = Integer.parseInt(strs[1]);
	                        if(id>=0) {    		    		
	                            
	                        }
            			}
                        break;
            		}
            		case 'm':{
            			String[] strs = input.split(" ");
            			if(strs.length>1){
	            			int id = Integer.parseInt(strs[1]);
	                        if(id>=0) {    		    		
	                            
	                        }
            			}
                        break;
            		}
            		case 'e':{
            			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            			break;
            		}
            		default:{
            			
            		}            		
            	}
            	textField.setText("");            	
            }
        });
		
		for(int i=0;i<32;i++){
			memory.addMAddress(i, new MemoryAddress(i,(byte)0));
		}		
		for(int i=0;i<64;i++){
			pageTable.addPage(i, new Page(i, (byte)0, (byte)0,(byte) 0, -1, (byte)1));
		}
		
	}
	
	public void run() {
		
	}
}
