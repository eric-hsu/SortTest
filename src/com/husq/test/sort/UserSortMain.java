package com.husq.test.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserSortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  List<User> userlist=new ArrayList<User>();
		  userlist.add(new User("dd","4"));
		  userlist.add(new User("aa","1"));
		  userlist.add(new User("ee","5"));
		  userlist.add(new User("bb","2"));  
		  userlist.add(new User("ff","5"));
		  userlist.add(new User("cc","3"));
		  userlist.add(new User("gg","6"));
		  
		  
		  //1 使用Comparator排序
		  UserComparater userComparater = new UserComparater();
		  Collections.sort(userlist,userComparater);
		  
		  for(int i=0;i<userlist.size();i++){
			  User user = (User)userlist.get(i);
			  System.out.println("姓名："+user.getName()+",年龄："+user.getAge());
		  }
		  
		  
	}

}
