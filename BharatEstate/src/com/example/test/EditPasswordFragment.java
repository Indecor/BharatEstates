package com.example.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class EditPasswordFragment extends Fragment 
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = LayoutInflater.from(getActivity()).inflate(R.layout.edit_passowrd_screen, null);

		ImageButton buttonBack =(ImageButton) view.findViewById(R.id.imageButton1);


		buttonBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
				MyAccountFragment enFragment = new MyAccountFragment();
				ft.replace(R.id.editPassowrdContainer, enFragment);
				ft.commit();

			}
		});

		return view;
	}
}
