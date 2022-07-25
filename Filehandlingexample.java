package com;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Filehandlingexample {

	public static void main(String[] args) throws Exception{


		 DataInputStream dis=new DataInputStream(System.in);
		 FileOutputStream fos=new FileOutputStream("abc.txt");
		 int ch;
		 System.out.println("Enter the data");
		 while((ch=dis.read())!='@') {
			fos.write(ch);
		}
	fos.close();
 System.out.println("Data Stored successfully");
	}
}


