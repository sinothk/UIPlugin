package com.sinothk.ui.demo.sideBar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sinothk.ui.demo.R;
import com.sinothk.ui.sideBar.WaveSideBar;

import java.util.ArrayList;

public class SideBarDemoMainActivity extends AppCompatActivity {
    private RecyclerView rvContacts;
    private WaveSideBar sideBar;

    private ArrayList<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();
        initView();
    }

    private void initView() {
        setContentView(R.layout.side_bar_activity_main);
        rvContacts = (RecyclerView) findViewById(R.id.rv_contacts);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
        rvContacts.setAdapter(new ContactsAdapter(contacts, R.layout.side_bar_item_contacts));

        sideBar = (WaveSideBar) findViewById(R.id.side_bar);
        sideBar.setIndexItems("A", "B", "D", "F", "H", "#");
        sideBar.setPosition(WaveSideBar.POSITION_RIGHT);
        sideBar.setOnSelectIndexItemListener(new WaveSideBar.OnSelectIndexItemListener() {
            @Override
            public void onSelectIndexItem(String index) {
                for (int i = 0; i < contacts.size(); i++) {
                    if (contacts.get(i).getIndex().equals(index)) {
                        ((LinearLayoutManager) rvContacts.getLayoutManager()).scrollToPositionWithOffset(i, 0);
                        return;
                    }else{
                    }
                }
            }
        });
    }

    private void initData() {
        contacts.addAll(Contact.getChineseContacts());
    }
}
