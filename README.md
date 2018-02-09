# UIPlugin
UIPlugin 4 Android
#1. SwitchButton：
  <com.sinothk.ui.switchButton.SwitchButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        app:sb_checked="true"
        app:sb_show_indicator="false" />

    <com.sinothk.ui.switchButton.SwitchButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp" />

    <com.sinothk.ui.switchButton.SwitchButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        app:sb_checked="true"
        app:sb_checked_color="#fdc951" />

    <com.sinothk.ui.switchButton.SwitchButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        app:sb_background="#FFF"
        app:sb_button_color="#db99c7"
        app:sb_checked_color="#A36F95"
        app:sb_checkline_color="#a5dc88"
        app:sb_shadow_color="#A36F95"
        app:sb_uncheckcircle_color="#A36F95" />

    <com.sinothk.ui.switchButton.SwitchButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        app:sb_enable_effect="false" />

    <View
        android:layout_width="match_parent"
        android:layout_height="2dp"
        android:layout_marginTop="10dp"
        android:background="@color/colorAccent" />


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="42dp"
        android:layout_marginTop="10dp"
        android:background="@color/colorAccent"
        android:gravity="center">

        <com.sinothk.ui.switchButton.SwitchButton
            android:id="@+id/switch_button"
            android:layout_width="42dp"
            android:layout_height="28dp"
            app:sb_checked="true"
            app:sb_checked_color="#fdc951"
            app:sb_show_indicator="false" />
    </LinearLayout>
    
    ##java：
    
      SwitchButton switchButton = (SwitchButton) findViewById(R.id.switch_button);
//        switchButton.setChecked(true);
//        switchButton.isChecked();
//        switchButton.toggle();     //switch state
//        switchButton.toggle(false);//switch without animation
//        switchButton.setShadowEffect(true);//disable shadow effect
//        switchButton.setEnabled(false);//disable button
//        switchButton.setEnableEffect(false);//disable the switch animation
        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                //TODO do your job
                OToastUtil.show("isChecked = " + isChecked);
            }
        });
        
 # SwitchMultiButton：
 
  <com.sinothk.ui.switchMultiButton.SwitchMultiButton
        android:id="@+id/switchmultibutton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:padding="8dp"
        app:smb_selectedColor="#077000"
        app:smb_selectedTab="0"
        app:smb_strokeRadius="5dp"
        app:smb_strokeWidth="1dp"
        app:smb_switchTabs="@array/switch_tabs"
        app:smb_textSize="14sp"
        app:smb_typeface="DeVinneTxtBT.ttf" />

    <com.sinothk.ui.switchMultiButton.SwitchMultiButton
        android:id="@+id/switchmultibutton2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:padding="8dp"
        app:smb_selectedColor="#F77000"
        app:smb_selectedTab="0"
        app:smb_strokeRadius="5dp"
        app:smb_strokeWidth="1dp"
        app:smb_switchTabs="@array/switch_tabs"
        app:smb_textSize="14sp"
        app:smb_typeface="DeVinneTxtBT.ttf" />
        
    ## java:
    
        //set switch tabs with ***app:switchTabs*** in xml
        SwitchMultiButton switchmultibutton = (SwitchMultiButton) findViewById(R.id.switchmultibutton);
        switchmultibutton.setOnSwitchListener(new SwitchMultiButton.OnSwitchListener() {
            @Override
            public void onSwitch(int position, String tabText) {
                Toast.makeText(SwitchMultiButtonMainActivity.this, tabText, Toast.LENGTH_SHORT).show();
            }
        });

        //or set switch tabs in java code
        SwitchMultiButton mSwitchMultiButton2 = (SwitchMultiButton) findViewById(R.id.switchmultibutton2);
        mSwitchMultiButton2.setText("点个Star", "狠心拒绝").setOnSwitchListener(new SwitchMultiButton.OnSwitchListener() {
            @Override
            public void onSwitch(int position, String tabText) {
                Toast.makeText(SwitchMultiButtonMainActivity.this, tabText, Toast.LENGTH_SHORT).show();
            }
        });
        
 
