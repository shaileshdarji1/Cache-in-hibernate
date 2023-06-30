package com.hibernate.cache.config;


import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.spi.CachingProvider;









@Configuration
@EnableCaching
public class CacheConfig {

    @Bean
    public CacheManager cacheManager() {
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        cacheConfiguration.setName("entities");
        cacheConfiguration.setEternal(false);
        cacheConfiguration.setMaxEntriesLocalHeap(1000);
        cacheConfiguration.setTimeToLiveSeconds(3600);
        cacheConfiguration.setStatistics(true);

        Configuration ehcacheConfig = ConfigurationFactory.parseConfiguration();
        ehcacheConfig.addCache(cacheConfiguration);

        CacheManager cacheManager = CacheManager.create(ehcacheConfig);
        return new EhCacheCacheManager(cacheManager);
    }

}



