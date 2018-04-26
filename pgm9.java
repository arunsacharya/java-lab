package lab;

import java.awt.*;
import javax.swing.*;
import java.io.*;

public class pgm9a {
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
