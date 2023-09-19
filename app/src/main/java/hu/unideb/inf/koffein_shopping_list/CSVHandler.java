package hu.unideb.inf.koffein_shopping_list;

import android.content.Context;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    String filename;
    Context context;
    public CSVHandler(Context context, String filename){
        File file = new File(filename);
        try {
            if(!file.exists()){
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
        } catch (Exception e){

        }
        this.filename=filename;
        this.context=context;
    }
    public List<String> read(){
        List<String> lines = new ArrayList<String>();
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = context.openFileInput(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                lines.add(line);
            }
        } catch (Exception e){
        } finally {
            if(fileInputStream!=null){
                try{
                    fileInputStream.close();
                } catch (Exception e){
                }
            }
            return lines;
        }
    }
    public void write(String content){
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = context.openFileOutput(filename, context.MODE_PRIVATE);
            fileOutputStream.write(content.getBytes());
        } catch (Exception e){
        }
        finally {
            try {
                fileOutputStream.close();
            }catch (Exception e){

            }
        }
    }
}
