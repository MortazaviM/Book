package ir.persianfa.book;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by HAMAN on 2016/08/22.
 */
public class Adapter extends BaseAdapter {
    Context context;
    int layout;
    public Adapter(Context context,int layout){
        this.layout=layout;
        this.context=context;
    }
    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("Runed","the getview is run");
        View rootView= LayoutInflater.from(context).inflate(layout,null);
        return rootView;
    }
}
