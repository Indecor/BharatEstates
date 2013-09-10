package com.example.test;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ListView;

public class ViewFavourite extends Fragment 
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = LayoutInflater.from(getActivity()).inflate(R.layout.list_result, null);

		ImageButton buttonBack = (ImageButton) view.findViewById(R.id.imageButton1);
		ListView list = (ListView) view.findViewById(R.id.listView1);
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("q");
		arrList.add("b");
		arrList.add("c");
		
		CustomAdapterDetail a = new CustomAdapterDetail(getActivity(), arrList);
		list.setAdapter(a);
		
		
		
		buttonBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) 
			{
				FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
				MyAccountFragment enFragment = new MyAccountFragment();
				ft.replace(R.id.listContainer, enFragment);
				ft.commit();

			}
		});
		return view;
	}


}
