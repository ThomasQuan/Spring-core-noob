package com.thanhquan.annotationSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.thanhquan.annotationSpring")
@PropertySource("foo.properties")
public class Config {

//	Define Dependency
	@Bean
	public FortuneService HappyFortune() {
		return new HappyFortune();
	}
	
	
	
//	Define Bean
	@Bean
//	@Scope("prototype")
	public Doctor EyeDoctor() {
		return new EyeDoctor(HappyFortune());
	}
	

}
