package collection.file.io;
//Reading file from a folder and .txt files in that folder
import java.io.File;

public class ListOfFileNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Student\\eclipse-workspace\\Week13Review");
		String[] fileList=file.list();
		//gives the list of folders 
		for(String name:fileList) {
			System.out.println(name);
		}
		//searches for the file that end with .txt 
		for(String s:fileList) {
			if(s.toLowerCase().endsWith(".txt")) {
				System.out.println(s);
			}
		}
	}

}
