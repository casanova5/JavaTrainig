package fileMethodsQ1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileIOStream {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try (FileInputStream fr = new FileInputStream("C:\\Users\\pvijayvargiy\\Documents\\Training\\Assignment3\\MC.png");){			
			
			FileOutputStream fw = new FileOutputStream("C:\\Users\\pvijayvargiy\\Documents\\Training\\Assignment3\\MC1.png");
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("file is written");
		long end = System.currentTimeMillis();
		System.out.println("total time "+ (end - start) );
		
//		file is written
//		total time 26621
		
	}
}
