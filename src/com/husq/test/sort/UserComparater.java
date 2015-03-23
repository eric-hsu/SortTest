package com.husq.test.sort;

import java.util.Comparator;

public class UserComparater implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		User user1 = (User) o1;
		User user2 = (User) o2;
		
		int flag = user1.getAge().compareTo(user2.getAge());
		if(flag>0){
			return -1;
		}else if(flag<0){
			return 1;
		}else{
			return 0;
		}
	}


}
