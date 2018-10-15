package fhbasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FH2 {
	
public static void main(String[] args) throws IOException {
		
		File f= new File ("D:/VK.txt");
		FileReader fr= new FileReader(f);
		//int i=fr.read();
				BufferedReader br=new BufferedReader(fr);
				
				File f2= new File ("D:/VK2.txt");
				FileReader fr2= new FileReader(f2);
				BufferedReader br2= new BufferedReader(fr2);
				
				
		File f1= new File ("D:/VK1.txt");
		FileWriter fw=new FileWriter(f1,true);
		BufferedWriter bw=new BufferedWriter(fw);
		//bw.write("hello India");
		
		String s=br.readLine();
		String s2= br2.readLine();
		while(s!=null)
			{
				bw.newLine();
				bw.write(s);
				
				s=br.readLine();
				
			}
		while(s2!=null)
		{
			bw.newLine();
			bw.write(s2);
			s2=br2.readLine();
		}
		bw.flush();
		bw.close();
		
		
		
		
		
		
		
		
		
		
		//FileReader fr= new FileReader(f);
		//int i=fr.read();
		//BufferedReader br=new BufferedReader(fr);
		//String s=br.readLine();
		
		//
		}
	}





