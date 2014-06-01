package net.guslong.fragtest.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by anguslong on 01/06/14.
 */
public class Frag1 extends ListFragment {

    String[] colors = new String[] {
            "Blue",
            "Green",
            "Red"
    };
    // inflate the left_frag
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        /** Creating an array adapter to store the list of colors **/
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1,colors);

        /** Setting the list adapter for the ListFragment */
        setListAdapter(adapter);

        return inflater.inflate(R.layout.colors_list, container, false);
    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        Fragment frag = null;
        FragmentManager fm = getFragmentManager();

        // depending on the position, switch the fragment
        switch(position) {
            case 0:
                frag = new Blue();
                break;
            case 1:
                frag = new Green();
                break;
            case 2:
                frag = new Red();
                break;
        }

        if (frag != null) {
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.right_frame, frag);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
