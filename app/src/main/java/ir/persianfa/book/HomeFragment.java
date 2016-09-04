package ir.persianfa.book;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by HAMAN on 2016/09/03.
 */
public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_listview_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.home_listview);
        Adapter da = new Adapter(getActivity(),R.layout.home_item_list_view);
        lv.setAdapter(da);



        return rootView;
    }
}
