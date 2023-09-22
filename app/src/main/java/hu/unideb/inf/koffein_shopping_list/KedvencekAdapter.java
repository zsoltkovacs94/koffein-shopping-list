package hu.unideb.inf.koffein_shopping_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class KedvencekAdapter extends BaseAdapter {

    Context context;

    KedvencekLista kedvencekList;

    LayoutInflater layoutInflater;

    public KedvencekAdapter(Context context, KedvencekLista kedvencekList) {
        this.context = context;
        this.kedvencekList = kedvencekList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return kedvencekList.size();
    }

    @Override
    public Object getItem(int position) {
        return kedvencekList.at(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.activity_fave_item, null);
        TextView termekNevTV = (TextView) convertView.findViewById(R.id.termekNevTextView);
        termekNevTV.setText(kedvencekList.at(position));
        return convertView;
    }


}
