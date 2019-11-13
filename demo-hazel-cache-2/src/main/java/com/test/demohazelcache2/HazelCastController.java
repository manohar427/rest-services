package com.test.demohazelcache2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class HazelCastController {

	@Autowired
	private HazelService ser;

	@GetMapping("wr")
	public String writeData(@RequestParam String key, @RequestParam String value) {

		return ser.writeData(null, null);
	}

	@GetMapping("read")
	public List reamData(@RequestParam String key) {
		System.out.println("Calling Service from Controller-1:\n"+ser.reamData(null));
		System.out.println("Calling Service from Controller-2:\n"+ser.reamData(null));
		System.out.println("Calling Service from Controller-3:\n"+ser.reamData(null));
		return null;
	}
}
