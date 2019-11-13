package com.test.demohazelcache1;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hazelcast.core.HazelcastInstance;

@RestController
@RequestMapping("/abc")
public class HazelCastController {

	@Autowired
	private HazelcastInstance haIns;

	@GetMapping("wr")
	public String writeData(@RequestParam String key, @RequestParam String value) {
		Map<String, String> map = haIns.getMap("customer");
		System.out.println(haIns);
		map.put(key, value);
		return "OK-HAZ";
	}

	@GetMapping("read")
	public String reamData(@RequestParam String key) {
		Map<String, String> map = haIns.getMap("customer");
		return map.get(key);
	}
}
