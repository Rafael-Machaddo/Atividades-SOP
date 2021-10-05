package nru;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Memory {

	MemoryAddress[] addresses;
	JFrame frame = new JFrame("MEMORIA");
	String[] columnNames = {"id","USADO"};
	Object[][] data;
	JTable table;
	JScrollPane scrollPane;
	
	public Memory(int size){
		addresses = new MemoryAddress[size];
		frame.setVisible(true);
		frame.setSize(400, 450);       
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		data = new Object[size][2];
		table = new JTable(data, columnNames);
		table.setFillsViewportHeight(true);
		table.setEnabled(false);
		scrollPane = new JScrollPane(table);
		frame.add(scrollPane);
		frame.repaint();
	}
	
	public void addMAddress(int index, MemoryAddress a){
		addresses[index] = a;
		data[index][0] = a.index;
		data[index][1] = a.used;
		System.out.println(index);
		frame.repaint();
	}
}
