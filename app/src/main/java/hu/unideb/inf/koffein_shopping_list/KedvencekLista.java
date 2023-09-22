package hu.unideb.inf.koffein_shopping_list;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class KedvencekLista {

    CSVHandler csvHandler;

    List<String> kedvencekList = new ArrayList<String>();

    public KedvencekLista() {

    }

    public KedvencekLista(Context context, String filename) {
        csvHandler = new CSVHandler(context, filename);
        readFromFile();
    }

    public void add(String termek) {
        kedvencekList.add(termek);
        if(csvHandler != null) {
            writeToFile();
        }
    }

    public void remove(String t) {
        kedvencekList.remove(t);
        if(csvHandler != null) {
            writeToFile();
        }
    }

    public int size() {
        return kedvencekList.size();
    }

    public String at(int index) {
        return kedvencekList.get(index);
    }

    private void readFromFile() {
        List<String> lines = csvHandler.read();
        kedvencekList = new ArrayList<String>();
        for (String line : lines) {
            if(line != null) {
                kedvencekList.add(line);
            }
        }
    }

    private void writeToFile() {
        csvHandler.write(this.toString());
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (String termek:kedvencekList) {
            stringBuilder.append(termek).append("\n");
        }
        return stringBuilder.toString();
    }

}
