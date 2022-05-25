import java.io.File;

public class Main {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Kaise\\Desktop\\Test\\Test1\\Test2");
		FileTree ft = new FileTree(new DirPrinter());
		ft.traverse(f);
	}

}
