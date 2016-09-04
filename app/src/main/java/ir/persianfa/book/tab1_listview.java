package ir.persianfa.book;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by HAMAN on 2016/08/26.
 */
public class tab1_listview extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.tab1_listview_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.tab1_listview);
        Adapter adapter=new Adapter(getActivity(),R.layout.tab1_item_list_view);
        lv.setAdapter(adapter);

        return rootView;
    }
}
