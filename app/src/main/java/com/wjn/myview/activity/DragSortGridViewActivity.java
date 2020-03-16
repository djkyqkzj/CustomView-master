package com.wjn.myview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.wjn.myview.R;
import com.wjn.myview.adapter.DragSortAdapter;
import com.wjn.myview.bean.MyJaveBean;
import com.wjn.myview.view.DragSortListView;

import java.util.ArrayList;
import java.util.List;

public class DragSortGridViewActivity extends AppCompatActivity {

    private List<String> strList;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);
        initData();
        initView();
    }

    public void initData(){
        strList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            strList.add("Channel " + i);
        }
    }

    private void initView() {
        gridView = (GridView)findViewById(R.id.drag_grid_view);
        GridViewAdapter adapter = new GridViewAdapter(this, strList);
        gridView.setAdapter(adapter);
    }
}
