package demo;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) {

		/*
		 * /Folder creation File file = new
		 * File("C:\\Users\\Administrator\\Desktop\\Document\\New\\Content");
		 * 
		 * 
		 * boolean present = file.exists(); System.out.println("Folder Present:"+
		 * present); if(present==false) file.mkdirs(); present = file.exists();
		 * System.out.println("Folder Present:"+ present);
		 */

		/*
		 * File file = new
		 * File("C:\\Users\\Administrator\\Desktop\\Document\\test.txt"); boolean
		 * present = file.exists(); if (present == false) try { boolean created =
		 * file.createNewFile(); System.out.println("File created :" + created); } catch
		 * (IOException e) {
		 * 
		 * e.printStackTrace(); }
		 */

		/*
		 * File file = new
		 * File("C:\\Users\\Administrator\\Desktop\\Document\\test.txt"); file.delete();
		 * boolean present = file.exists(); System.out.println("File present: "+
		 * present);
		 */

		/*
		 * File file = new
		 * File("C:\\Users\\Administrator\\Desktop\\Document\\test.txt"); try {
		 * file.createNewFile(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 * 
		 * File newName = new
		 * File("C:\\Users\\Administrator\\Desktop\\Document\\demo.txt"); boolean
		 * renameSuccess = file.renameTo(newName);
		 * System.out.println("renameSuccess :"+renameSuccess);
		 * 
		 * System.out.println("File Name "+newName.getName());
		 * System.out.println(file.canExecute()); System.out.println(file.canRead());
		 * System.out.println(file.canWrite()); }
		 */

		/*
		 * File file = new File("C:\\Users\\Administrator\\Desktop"); String[]
		 * listofFilesFolders = file.list(); //for (int i = 0; i <
		 * listofFilesFolders.length; i++) //System.out.println(listofFilesFolders[i]);
		 * 
		 * for(String s:listofFilesFolders) System.out.println(s);
		 */
		
		/*
		 * File file = new File("C:\\Users\\Administrator\\Desktop"); File []
		 * fileFolderList = file.listFiles(); for(File f :fileFolderList)
		 * //if(f.isFile()) if(f.isDirectory()) System.out.println(f);
		 */
		 
		
		  File file = new File("C:\\Users\\Administrator\\Desktop"); File []
		  fileFolderArray = file.listFiles(); 
		  for(File f: fileFolderArray) {
		  if(f.isFile()) { 
		  String fileName = f.getName(); 
		  int lastDot = fileName.lastIndexOf("."); 
		  String extension = fileName.substring(lastDot+1);
		  
		  //if(extension.equals("txt")) if(f.length()>500) System.out.println(fileName + "Size:" + f.length());
		  //System.out.println(extension);
		  
		  } 
		  } //System.out.println(f);
		 		
		
		
		
	}
}
