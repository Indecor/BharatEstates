package com.example.test;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter 
{
	
	private Context context;
	private ArrayList<String> list;

	public CustomAdapter(Context context , ArrayList<String> list)
	{
		this.context= context;
		this.list=list;
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		// TODO Auto-generated method stub
		View view = LayoutInflater.from(context).inflate(R.layout.custom_row_search, null);
		
		String a = (String)list.get(position);
		
		ViewHolder holder = new ViewHolder();
		
		holder.type= (TextView) view.findViewById(R.id.textView1);
		holder.type.setText(a);
		
		return view;
	}
	
}

class ViewHolder
{
	TextView type;
}
