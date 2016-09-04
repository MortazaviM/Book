package ir.persianfa.book;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by HAMAN on 2016/09/01.
 */
public class Group_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.group_listview_frsgment,container,false);


        ListView lv = (ListView) rootView.findViewById(R.id.group_listview);
        Adapter da =new Adapter(getContext(),R.layout.group_item_list_view);
        lv.setAdapter(da);

        return rootView;
    }
}
