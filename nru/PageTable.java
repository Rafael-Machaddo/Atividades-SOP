package nru;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PageTable {

	Page[] pages;
	int counter;
	JFrame frame = new JFrame("Tabela de página");
	String[] columnNames = {"id","Referenced","Modified","Present","Page Frame","Protection"};
	Object[][] data;
	JTable table;
	JScrollPane scrollPane;
	
	public PageTable(int size){
		pages = new Page[size];
		counter = 0;
		frame.setVisible(true);
		frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		data = new Object[size][6];
		table = new JTable(data, columnNames);
		table.setFillsViewportHeight(true);		
		table.setEnabled(false);
		scrollPane = new JScrollPane(table);        
        frame.add(scrollPane);
        frame.repaint();
	}
	
	public void addPage(int index,Page p){
		pages[index] = p;
		data[index][0] = p.id;
		data[index][1] = p.referenced;
		data[index][2] = p.modified;
		data[index][3] = p.present;
		data[index][4] = p.pageFrame;
		data[index][5] = p.protection;
		frame.repaint();
	}
}
