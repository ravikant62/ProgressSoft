package com.prgsft.task.service.summaryreport;

import java.util.Arrays;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
@ComponentScan("com.prgsft.task.service.summaryreport")
public class SummaryReportCaching {
	
	@Bean
    public CacheManager cacheManager() {
    	ConcurrentMapCacheManager cacheManager	=	new ConcurrentMapCacheManager();
    	cacheManager.setCacheNames(Arrays.asList("searchfilename"));
        return cacheManager;
    }

}
