package dev.vobia.belajarfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zainal on 13/10/15.
 */
public class TabFragment2 extends Fragment {

    public TabFragment2(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanstate){
        return inflater.inflate(R.layout.tab2, viewGroup, false);
    }
}
