package com.test.demopropprofile1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevBeanImpl implements MyInterface {

	public String getprofile() {
		return "DEV";
	}
}
