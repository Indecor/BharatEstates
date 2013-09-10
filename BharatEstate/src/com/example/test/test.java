package com.example.test;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;

public class test extends Fragment 
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = LayoutInflater.from(getActivity()).inflate(R.layout.test,
				null);
		
		ListView list = (ListView) v.findViewById(R.id.listView1);
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Properties");
		arrList.add("Projects");
		arrList.add("Builders");
		arrList.add("Plots/Lands");
		arrList.add("Blog");
		arrList.add("Property Prices");
		arrList.add("Set Alerts");
		
		
		CustomAdapter adpater = new CustomAdapter(getActivity(),arrList );
		list.setAdapter(adpater);
		
		list.setOnItemClickListener(new OnItemClickListener()
		{
		  @Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id)
		  {
			switch (position) {
			case 0:
				
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
				SetAlertFragment enFragment = new SetAlertFragment();
				ft.replace(R.id.homeContainer, enFragment);
				ft.commit();
				
				break;
				
			default:
				break;
			}
			
		}	
		});

		return v;
	}
}
