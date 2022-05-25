import java.io.File;
import java.io.FileFilter;

public class PdfFilter implements FileFilter {
	@Override
	public boolean accept(File f) {
		String d = f.getName().toLowerCase();
		if(d.endsWith(".pdf")) {
			return true;
		}
		return false;
	}
}
