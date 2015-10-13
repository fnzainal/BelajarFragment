package dev.vobia.belajarfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zainal on 13/10/15.
 */
public class TabFragment1 extends Fragment{

    public TabFragment1(){


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanstate){
        return inflater.inflate(R.layout.tab1, viewGroup, false);
    }
}
