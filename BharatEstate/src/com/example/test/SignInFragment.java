package com.example.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class SignInFragment extends Fragment 
{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = LayoutInflater.from(getActivity()).inflate(R.layout.sign_in_layout, null);
		ImageButton buttonSignUp = (ImageButton) view.findViewById(R.id.button3);
		
		buttonSignUp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				 FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
				    SignUpFragment enFragment = new SignUpFragment();
				  
				    ft.replace(R.id.signInContainer, enFragment);
				  
				    ft.commit();
				
			}
		});
		
		return view;
	}

}
