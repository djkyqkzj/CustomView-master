package com.wjn.myview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ListView;

import com.wjn.myview.R;
import com.wjn.myview.adapter.ListViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class DragSortLIstViewNewActivity extends AppCompatActivity {

    private List<String> strList;
    private ListView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_sortlistview);
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
        gridView = (ListView)findViewById(R.id.activity_dragsortlistview_listview);
        ListViewAdapter adapter = new ListViewAdapter(this, strList);
        gridView.setAdapter(adapter);
    }
}
