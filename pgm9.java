/* 9. We need our class time tables to be prepared and displayed. Given Day, time and Subjects of the classes in a flat files (filename.txt file), a Java program needs to be constructed for displaying the time table for a section. (hint: use SWING CONTROLS, FILE OPERATION)
a. The elements in the flat files are separated by commas. 
b. Modify the program to support elements in the file separated using single space separator.
c. Display the data from flat file in the table control. */

package lab_programs;

import java.awt.*;
import javax.swing.*;
import java.io.*;

public class pgm9 {
	public static String rows[][]=new String [6][3];
	public static void initUI() {
		try {
				readFile();				
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		String columns[]= {"Day","Time","Subject"};
		JFrame jf=new JFrame();
		jf.setLayout(new BorderLayout());
		JTable jt=new JTable(rows,columns);
		jf.add(new JScrollPane(jt));
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		initUI();
	}
	public static void readFile() throws IOException {
		String readline;
		int i=0;
		File file=new File("details.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		while((readline=br.readLine())!=null) {
			String splitString[]=readline.split(";");
			for(int j=0;j<3;j++)
				rows[i][j]=splitString[j];
				i++;
		}
	}
}
