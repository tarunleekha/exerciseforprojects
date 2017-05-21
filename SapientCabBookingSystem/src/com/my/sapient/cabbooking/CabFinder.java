package com.my.sapient.cabbooking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CabFinder {
	
	
	
	private List<CabInfo> cabs = new ArrayList<CabInfo>();
	
	public void initializeCabs(){
			final CabInfo cab1 = new CabInfo();
			cab1.setCabNo("DL01HB001");
			cab1.setInitialLocation("100020");
			final CabInfo cab2 = new CabInfo();
			cab2.setCabNo("DL01HB002");
			cab2.setInitialLocation("100040");
			final CabInfo cab3 = new CabInfo();
			cab3.setCabNo("DL01HB003");
			cab3.setInitialLocation("100060");
			final CabInfo cab4 = new CabInfo();
			cab4.setCabNo("DL01HB004");
			cab4.setInitialLocation("100080");
			cabs.add(cab1);
			cabs.add(cab2);
			cabs.add(cab3);
			cabs.add(cab4);
	}
	
	/*For getting profitable cab in case of multiple cabs*/
	public CabInfo getProfitableCab(final List<CabInfo> multipleCabs){
		final List<Integer> cabTimeList = new ArrayList<Integer>();
		for(final CabInfo cab : multipleCabs){
			cabTimeList.add(cab.getEstimatedTime());
		}
		Collections.sort(cabTimeList);
		for(final CabInfo cab : multipleCabs){
			if(cabTimeList.get(0)== cab.getEstimatedTime()){
				return cab;
			}
		}
		return null;
		
	}
	
	public CabInfo getSuitableCab(final BookingRequest bookingRequest){
		final List<CabInfo> multipleCabs = new ArrayList<CabInfo>();
		for(final CabInfo cab : cabs){
			final CabFindingRules rules = new CabFindingRules();
			if(rules.checkTimeRestictions(bookingRequest, cab)){
				multipleCabs.add(cab);
			}
			
		}
		
		return getProfitableCab(multipleCabs);
		
	}

}
