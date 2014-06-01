package net.guslong.fragtest.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by anguslong on 01/06/14.
 */
public class Blue extends Fragment {

    // inflate the right fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.blue, container, false);
    }
}
