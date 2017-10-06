package com.thanhtam.popupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnShow,btnShowCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShow = (Button)findViewById(R.id.buttonShow);
        btnShowCode = (Button)findViewById(R.id.buttonmenuCode);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowPopupMenu();
            }
        });
        btnShowCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenuByCode();
            }
        });


    }
    private void ShowPopupMenu(){
        PopupMenu popupMenu = new PopupMenu(this,btnShow);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menuSua : btnShow.setText(item.getTitle().toString());
                        break;
                    case R.id.menuThem : btnShow.setText(item.getTitle().toString());
                        break;
                    case R.id.menuXoa : btnShow.setText(item.getTitle().toString());
                        break;
                }
                return false;
            }
        });


    }
    private void ShowMenuByCode(){
        PopupMenu popupMenu = new PopupMenu(this, btnShowCode);

        popupMenu.getMenu().add(1,111,1,"Them");
        popupMenu.getMenu().add(1,222,2,"Xoa");
        popupMenu.getMenu().add(1,333,3,"Sua");
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case 111 : btnShowCode.setText(item.getTitle().toString());
                        break;
                    case 222 : btnShowCode.setText(item.getTitle().toString());
                        break;
                    case 333 : btnShowCode.setText(item.getTitle().toString());
                        break;



                }

                return false;
            }
        });


    }
}
