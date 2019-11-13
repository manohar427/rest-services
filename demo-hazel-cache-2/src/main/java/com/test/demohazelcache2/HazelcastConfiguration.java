package com.test.demohazelcache2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;

@Configuration
public class HazelcastConfiguration {

	@Bean
	public Config hazelCastConfig() {
		Config config = new Config();

		config.setInstanceName("hazelcast-instance")
				.addMapConfig(new MapConfig().setName("xyz")
						.setMaxSizeConfig(new MaxSizeConfig(5, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
						.setEvictionPolicy(EvictionPolicy.LRU).setTimeToLiveSeconds(10));

		return config;

	}
}
