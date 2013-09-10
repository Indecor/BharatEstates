package com.example.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class MyAccountFragment extends Fragment 
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View view = LayoutInflater.from(getActivity()).inflate(R.layout.my_account_after_sign_in, null);

		ImageButton buttonViewFav = (ImageButton) view.findViewById(R.id.textView1);
		ImageButton buttonEditPassword = (ImageButton) view.findViewById(R.id.imageButton4);

		buttonEditPassword.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
				EditPasswordFragment enFragment = new EditPasswordFragment();
				ft.replace(R.id.myAccountContainer, enFragment);
				ft.commit();
			}
		});

		ImageButton buttonBack = (ImageButton) view.findViewById(R.id.imageButton1);
		buttonBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			}
		});

		buttonViewFav.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
				ViewFavourite enFragment = new ViewFavourite();
				ft.replace(R.id.myAccountContainer, enFragment);
				ft.commit();

			}
		});


		return view;

	}

}
