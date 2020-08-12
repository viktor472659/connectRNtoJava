package com.prodjwithjava;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ListView;
import android.widget.TextView;

import android.widget.ArrayAdapter;
import java.util.LinkedList;
import java.util.List;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;



public class RCTWheelPickerManager extends SimpleViewManager<ListView> {

	public static final String REACT_CLASS = "RCTWheelPicker";


	@Override
	public String getName() {
		return REACT_CLASS;
	}

	@Override
    protected ListView createViewInstance(ThemedReactContext reactContext) {
        final ListView listView = new ListView(reactContext);
        List<String> testList = new LinkedList<>();

        testList.add("Akanza 1");
        testList.add("Akanza 2");
        testList.add("Akanza 3");

//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, testList);
//
//        listView.setAdapter(arrayAdapter);

        return listView;
    }
}