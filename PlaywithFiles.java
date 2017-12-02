/**
 * @author Ashlyn Thomas
 * 
 * @date 11/9/17
 * 
 * @version 1.0
 */
package lab11;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PlaywithFiles {

	public static void main(String[] args) {
		Path p1 = Paths.get("C:\\Backup\\SPEED\\SPEED_20171102_1of10.txt");

		Path p2 = Paths.get("C:\\Backup");
		
		System.out.format("getFileName:%s%n", p1.getFileName());
		System.out.format("getRoot: %s%n", p2.getRoot());
		
		if(Files.isReadable(p1) & Files.isExecutable(p1) & Files.isRegularFile(p1))
			System.out.println("good!");
		
		else
			System.out.println("Not a valid file path");
		
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:{SPEED_20171102_}-[1-10].txt");
		
		Path filename = p2.getFileName();
		if(matcher.matches(filename))
			System.out.println(filename);
		else
			System.out.println("no match");
	}

}
