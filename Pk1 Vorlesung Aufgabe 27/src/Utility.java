import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Utility {
	public static void copy(File from, File to) {
		try (FileInputStream in = new FileInputStream(from);
				BufferedInputStream bufferIn = new BufferedInputStream(in);
				FileOutputStream out = new FileOutputStream(to);
				BufferedOutputStream bufferOut = new BufferedOutputStream(out);) {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Ausnahmebehandlung
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Ausnahmebehandlung
			e.printStackTrace();
		}
	}
	public static void main(String[]args ) {
		File from = new File("C:\\Users\\Kaise\\Desktop\\Japan\\Cherryblossom.jpeg");
		File to = new File("C:\\Users\\Kaise\\Desktop\\Wichtig\\copy");
		copy(from,to);
		
	}
}