import java.io.*;
import java.util.ArrayList;

public class FileOperator {
	
	private ArrayList studentsList;
	private String fileName;
	
	public FileOperator(ArrayList studentsList, String fileName) {
		this.studentsList = studentsList;
		this.fileName = fileName;
	}
	
	public void writeFile() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			for (int i = 0; i < studentsList.size(); i++) {
				writer.write(""+studentsList.get(i)+'\r'+'\n');
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readFile() {
		 try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	@Override
	public String toString() {
		return "FileOperator{" +
				"studentsList=" + studentsList +
				", fileName='" + fileName + '\'' +
				'}';
	}
}