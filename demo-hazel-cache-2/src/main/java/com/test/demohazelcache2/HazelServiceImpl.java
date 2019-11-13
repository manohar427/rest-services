package com.test.demohazelcache2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames={"xyz"})
public class HazelServiceImpl implements HazelService {

	List list;

	public HazelServiceImpl() {
		list = new ArrayList();
	}
	@Cacheable()
	public List reamData(String key) {
		System.out.println("Service Impl Read Execution >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		return list;
	}


	public String writeData(String key, String value) {

		list.add("One" + new Date());
		return "Write is Done";
	}
}
