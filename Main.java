package com;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void welcome() throws IOException {
		 System.out.println("WELCOME!");
		 System.out.println("Prototype for Virtual key repository");
		 display();
	 }
	 void display() throws IOException {
		 while(true) {
		 System.out.println("\nChoose the operation from the options!");
		 System.out.println("1. Sort file names");
		 System.out.println("2. Operations");
		 System.out.println("3. Exit");
		 Scanner sc = new Scanner(System.in);
		 try {
		 int a = sc.nextInt();
		 if(a==1 || a==2 || a==3) {
		 switch (a) {
		 case 1:{
			 sortfunc();
			 //display();
			 break;
		 }
		 case 2:{
			 display1();
			 break;
		 }
		 case 3:{
			 System.out.println("Exitting program");
			 System.exit(0);
		 }
		 }
		 }
		 else {
			 System.out.println("Please enter 1 or 2 or 3!");
			 display();
		 }
	 }catch(Exception e){
	 }
	 }
	 }

	void display1() throws IOException {
		while(true) {
		 System.out.println("\nChoose the operation from the options!");
		 System.out.println("1. Add a file");
		 System.out.println("2. Delete a file");
		 System.out.println("3. Search a file");
		 System.out.println("4. Back to Main");
		 Scanner sc = new Scanner(System.in);
		 try {
		 int b = sc.nextInt();
		 if(b==1||b==2||b==3||b==4) {
		 switch (b) {
		 case 1: {
			createfunc();
			display1();
			break;
			 
		 }
		 case 2:{
			 deletefunc();
			 break;
		 }
		 case 3: {
			 searchfunc();
			 break;
		 }
		 case 4:{
			 display();
			 break;
		 }
		 }
		 }
		 else {
			 System.out.println("Please enter 1, 2, 3 or 4!");
		 }
	 }catch(Exception e){
	 }
		}
	}
	void sortfunc() {

		File f = new File("C:\\Users\\suren\\Downloads\\Project");
		String listOfFiles[]=f.list();
		 System.out.println("Sorted order of files");
		 Arrays.sort(listOfFiles);
		 for(String files:listOfFiles) {
			 System.out.println(""+files);
		 }
		}
		
	 void searchfunc() throws IOException {
		 File ff=new File("C:\\Users\\suren\\Downloads\\Project\\abc.txt");
			File ff1=new File("C:\\Users\\suren\\Downloads\\Project");
			File ff2=new File("C:\\Users\\suren\\Downloads\\Project\\demo.txt");
			ff.createNewFile();
			ff2.createNewFile();

		 Scanner sc1=new Scanner (System.in);
			System.out.println("Enter the file name you want to search");
			String s1=sc1.next();
			File file1=new File("C:\\Users\\suren\\Downloads\\Project\\"+s1+".txt");
			String listOfFiles1[] =ff1.list();
			 if (listOfFiles1 == null) {
		            System.out.println("File does not exists.");
		        }else {
		                System.out.println(" File exists");
		        }
		            }
	 void deletefunc() {
		 Scanner sc=new Scanner (System.in);
			System.out.println("Enter the file name you want to delete");
			String s=sc.next();
			File file=new File("C:\\Users\\suren\\Downloads\\Project\\"+s+".txt");
			if(file.delete()) {
				System.out.println("File deleted successfully");
			}else {
				System.out.println("File not found");
			}
			
	}
	void createfunc() throws IOException {
		File ff=new File("C:\\Users\\suren\\Downloads\\Project\\abc.txt");
		File ff1=new File("C:\\Users\\suren\\Downloads\\Project");
		File ff2=new File("C:\\Users\\suren\\Downloads\\Project\\demo.txt");
		ff.createNewFile();
		ff2.createNewFile();

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter filename to add: ");
		 String str = sc.nextLine();
		 
		 File file = new File("C:\\Users\\suren\\Downloads\\Project"+str+".txt");
		  
	     //Create the file
	     if (file.createNewFile()){
	       System.out.println("File is created!");
	     }else{
	       System.out.println("File already exists.");
	     }
	}

	public static void main(String[] args)throws IOException {
		
		Main m = new Main();
		 m.welcome();
	}

}
