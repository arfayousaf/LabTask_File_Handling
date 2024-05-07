import java.io.*;
public class FileHandle {
    public static String readFromFile(File file){
        String text="";
        try {
            String temp="";
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            while((temp=bufferedReader.readLine()) != null){
                text+=temp+"\n";
            }


        }
        catch (FileNotFoundException e){

        }
        catch (IOException e)   {

        }
        return text;
    }
}
