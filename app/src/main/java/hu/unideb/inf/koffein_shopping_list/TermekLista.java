package hu.unideb.inf.koffein_shopping_list;

import android.content.Context;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TermekLista {
    CSVHandler csvHandler;
    Context context;
    ListView listView;
    List<Termek> termekList = new ArrayList<Termek>();
    public TermekLista(){
        // Csak tesztelésre, ezt kódból ne hívjátok
    }
    public TermekLista(Context context, String filename, ListView listView){
        this.context = context;
        this.listView = listView;
        csvHandler = new CSVHandler(context, filename);
        readFromFile();
        showList(listView);
    }
    public void add(String termek){
        /*
        Erre kössétek rá a hozzáadás gombot "terméknév,mennyiség,mértékegység" formátumú stringet vár
         */
        termekList.add(new Termek(termek));
        if(csvHandler!=null){
            writeToFile();
            showList(listView);
        }
    }
    public void remove(Termek t){
        /*
        Erre kössétek rá a törlés funkciót, egy termék objektumot kell neki átadni
         */
        termekList.remove(t);
        if(csvHandler!=null){
            writeToFile();
            showList(listView);
        }
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
    public void showList(ListView listView){
        listView.setAdapter(new TermekAdapter(context, this));
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
