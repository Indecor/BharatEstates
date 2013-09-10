package com.example.test;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class FirstActivity extends FragmentActivity 
{

	private FragmentTabHost mTabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_screen_tab);
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

		
		View tabIndicator = LayoutInflater.from(this).inflate(R.layout.tab_indicator, null);
		ImageView icon = (ImageView) tabIndicator.findViewById(R.id.icon);
		icon.setImageResource(R.drawable.img_tab_home);
		
		
		
		View tabIndicator1 = LayoutInflater.from(this).inflate(R.layout.tab_indicator, null);
		ImageView icon1 = (ImageView) tabIndicator1.findViewById(R.id.icon);
		icon1.setImageResource(R.drawable.img_tab_signin);
		
		
		Bundle b = new Bundle();
		b.putString("key", "Simple");
	
		mTabHost.addTab(mTabHost.newTabSpec("simple").setIndicator(tabIndicator),
				test.class, b);
		
		b = new Bundle();
		b.putString("key", "Contacts");
		mTabHost.addTab(mTabHost.newTabSpec("contacts")
				.setIndicator(tabIndicator1), SignInFragment.class, b);
		b = new Bundle();
		b.putString("key", "Custom");
		
		
		View tabIndicator2 = LayoutInflater.from(this).inflate(R.layout.tab_indicator, null);
		ImageView icon2 = (ImageView) tabIndicator2.findViewById(R.id.icon);
		icon2.setImageResource(R.drawable.img_tab_myaccount);
		
		
		
		mTabHost.addTab(mTabHost.newTabSpec("custom").setIndicator(tabIndicator2),
				MyAccountFragment.class, b);
	}

}
