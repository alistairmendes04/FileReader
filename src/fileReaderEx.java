import java.io.BufferedReader;
import java.io.FileReader;

public class fileReaderEx {
    public static void main(String[] args) {

        //File file=new File(text.txt);

        FileReader fileReader=new FileReader(text.txt);
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String line;
        while((line= fileReader.toString())!= null){
            System.out.println(line);
        }
    }
}
