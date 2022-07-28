package com;
import java.io.*;
import java.util.Scanner;

class read{
	void readfunc(){
	try {
        File Obj = new File("abc.txt");
        Scanner Reader = new Scanner(Obj);
        while (Reader.hasNextLine()) {
            String data = Reader.nextLine();
            System.out.println(data);
            System.out.println("Read successfully");
        }
        Reader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error has occurred.");
        e.printStackTrace();
    }
}
}
class write{
	void writefunc() {
	try {
        FileWriter Writer = new FileWriter("abc.txt");
        Writer.write("Hello World!");
        Writer.close();
        System.out.println("Successfully written.");
    }
    catch (IOException e) {
        System.out.println("An error has occurred.");
        e.printStackTrace();
    }
}
}
class append{
	void appendfunc() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt", true));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to append!");
		String str = sc.nextLine();
        bw.write(str);
        System.out.println("Text is appended successfully");
        bw.close();
	}
}
public class FileHandex {

	public static void main(String[] args) throws IOException {
		File Obj = new File("abc.txt");
        if (Obj.createNewFile()) {
            System.out.println("File created: "+ Obj.getName());
        }
        else {
            System.out.println("File already exists.");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to read or 2 to add text!");
        System.out.println("Enter 3 to append and 4 to exit");
        
        while(true) {
        	int a = sc.nextInt();
        	if(a==1) {
        		read r = new read();
            	r.readfunc();
            	
        	}
        	else if(a==2) {
        		write w = new write();
        		w.writefunc();
        		
        	}
        	else if(a==3) {
        		append app = new append();
        		app.appendfunc();
        	}
        	else if(a==4) {
        		System.out.println("File exits");
        		break;
        	}
        	
        }
        

	}

}
