package modules;

import data.Entry;

import java.util.ArrayList;
import java.util.Collections;

public class ModuleC {
	
	ModuleF f;
	
	public ModuleC(ModuleF f){
		this.f = f;
	}

	
	public ArrayList<Entry> sortData(ArrayList<Entry> data) {
		Collections.sort(data);
		f.displayData(data);
		return data;
	}
	
	
	public void setF(ModuleF f){
		this.f = f;
	}

}
