import java.io.File;

public class Main {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Kaise\\Desktop\\Comunication and Computer Network\\Aufgaben\\Lab\\Lab1");
		FileTree ft = new FileTree(new DirPrinter());
		ft.traverse(f);
	}

}
