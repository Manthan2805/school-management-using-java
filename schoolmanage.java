import java.util.*;
import java.util.stream.IntStream;
import java.io.*;

public class schoolmanage {
Scanner input = new Scanner(System.in);	
String fname,lname,gender,dept,course,phone,roll,yoe;


public void studentstore() {
System.out.println("Enter First name of student");
fname=input.next();
System.out.println("Enter last name of student");
lname=input.next();
System.out.println("Enter Gender of student");
gender=input.next();
System.out.println("Enter Roll_no. of student");
roll=input.next();
System.out.println("Enter Department of student");
dept=input.next();
System.out.println("Enter Phone_no. of student");
phone=input.next();
	try {
		FileWriter fw = new FileWriter("//home//manthan//Desktop//s.txt",true);
		fw.write("\t");
		fw.write(fname);
		fw.write("\t");
		fw.write(lname);
		fw.write("\t");
		fw.write(gender);
		fw.write("\t\t");
		fw.write(roll);
		fw.write("\t\t");
		fw.write(dept);
		fw.write("\t\t");
		fw.write(phone);
		fw.write("\n");
		fw.write("\n");
		fw.close();		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void read()
{
	File f=new File("//home//manthan//Desktop//s.txt");
	try {
	Scanner read = new Scanner(f);
	while(read.hasNextLine()) {
		String data=read.nextLine();
		System.out.println(data);
	}
	read.close();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
}
public void teacherstore() {
System.out.println("Enter First name of Teacher");
fname=input.next();
System.out.println("Enter Last name of Teacher");
lname=input.next();
System.out.println("Enter Year of Experience of Teacher");
yoe=input.next();
System.out.println("Enter Department of Teacher");
dept=input.next();
System.out.println("Enter Phone_no. of Teacher");
phone=input.next();
System.out.println("Enter Course of Teacher");
course=input.next();
	try {
		FileWriter fw = new FileWriter("//home//manthan//Desktop//t.txt",true);
		fw.write("\t");
		fw.write(fname);
		fw.write("\t");
		fw.write(lname);
		fw.write("\t\t");
		fw.write(gender);
		fw.write("\t\t");
		fw.write(yoe);
		fw.write("\t\t");
		fw.write(dept);
		fw.write("\t");
		fw.write(phone);
		fw.write("\t");
		fw.write(course);
		fw.write("\n");
		fw.write("\n");
		fw.close();		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void teacherread()
{
	File f=new File("//home//manthan//Desktop//t.txt");
	try {
	Scanner read = new Scanner(f);
	while(read.hasNextLine()) {
		String data=read.nextLine();
		System.out.println(data);
	}
	read.close();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
}

public static void main(String[] args) {
	int expression=0,l=0;
	Scanner sc=new Scanner(System.in);
        
	System.out.println("      Welcome ");
	System.out.println("********************* ");
 	System.out.println("1.Student Store Data");
	System.out.println("2.Student Read Data");
	System.out.println("3.Teacher Store Data");
	System.out.println("4.Teacher Read Data");
	schoolmanage kb = new schoolmanage();
	
do{

System.out.println("enter choice ");
expression=sc.nextInt();

	switch(expression){    
        case 1:
	kb.studentstore();    
	break;
	    
	case 2: 
	kb.read();   
	break;       
    
	case 3:    
	kb.teacherstore();  
	break;      
    
	case 4:    
	kb.teacherread();
	break;        
    

	default:     
   
}
	System.out.println("press 9 to exit ");	
	l=sc.nextInt();

}while(l!=9);	
	
}

}
