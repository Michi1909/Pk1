import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
	public static void copy(File from, File to) {
		try {
		RandomAccessFile from1 = new RandomAccessFile(from,"r");
		RandomAccessFile to1 = new RandomAccessFile(to,"rw");
		for(int i=0;i<from1.length();i++) {
			from1.seek(i);
			to1.seek(i);
			to1.write(from1.read());
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void cat(File f) {
		try {
			RandomAccessFile file = new RandomAccessFile(f,"r");
			for(int i=0;i<file.length();i++) {
				file.seek(i);
				System.out.print((char)file.read());
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args)throws IOException{
		File from = new File("C:\\Users\\Kaise\\Desktop\\Japan\\Cherryblossom.jpeg");
		File to = new File("C:\\Users\\Kaise\\Desktop\\Wichtig\\copy");
		File file = new File("C:\\Users\\Kaise\\Desktop\\Test\\Test1\\Test2\\test.txt");
		copy(from,to);
		cat(file);
	}
}
