package hu.unideb.inf.koffein_shopping_list;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class TermekLista {
    CSVHandler csvHandler;
    List<Termek> termekList = new ArrayList<Termek>();
    public TermekLista(){

    }
    public TermekLista(Context context, String filename){
        csvHandler = new CSVHandler(context, filename);
        readFromFile();
    }
    public void add(String termek){
        termekList.add(new Termek(termek));
        if(csvHandler!=null)
            writeToFile();
    }
    public void remove(Termek t){
        termekList.remove(t);
        if(csvHandler!=null)
            writeToFile();
    }
    public int size(){
        return termekList.size();
    }
    public Termek at(int index){
        return termekList.get(index);
    }
    public void readFromFile(){
        List<String> lines = csvHandler.read();
        termekList=new ArrayList<Termek>();
        for (String line:lines) {
            if(line!=null)
                termekList.add(new Termek(line));
        }
    }
    public void writeToFile(){
        csvHandler.write(this.toString());
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Termek termek:termekList) {
            stringBuilder.append(termek).append("\n");
        }
        return stringBuilder.toString();
    }
}
