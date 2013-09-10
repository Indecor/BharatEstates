package com.example.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class SetAlertFragment extends Fragment 
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		// TODO Auto-generated method stub
		

		View view = LayoutInflater.from(getActivity()).inflate(R.layout.set_alert_layout, null);
		ImageButton buttonBack = (ImageButton) view.findViewById(R.id.imageButton1);

		buttonBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) 
			{
				FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
				test enFragment = new test();
				ft.replace(R.id.setAlertContainer, enFragment);
				ft.commit();

			}
		});
		
		return view;
	}

}
