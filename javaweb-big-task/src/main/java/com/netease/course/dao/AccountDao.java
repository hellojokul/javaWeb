package com.netease.course.dao;

import java.util.List;
import java.util.Map;

import com.netease.course.meta.Account;


public interface AccountDao {
	
	public boolean addRecord(Map<String,List<Account>> map);
}
