package ArrayListCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysListSort {

	private ArrayList<String> arrayList;

	public ArraysListSort(ArrayList<String> arrayList) {
		super();
		this.arrayList = arrayList;
	}

	public ArrayList<String> sortAscending() {         
		Collections.sort(this.arrayList);         
		return this.arrayList;     
	}       
	public ArrayList<String> sortDescending() {         
		Collections.sort(this.arrayList, Collections.reverseOrder());         
		return this.arrayList;     
	}

	public ArrayList<String> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<String> arrayList) {
		this.arrayList = arrayList;
	}
}
