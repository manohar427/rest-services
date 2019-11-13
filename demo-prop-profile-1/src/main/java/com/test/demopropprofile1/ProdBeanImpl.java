package com.test.demopropprofile1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdBeanImpl implements MyInterface {

	public String getprofile() {
		return "PROD";
	}
}
