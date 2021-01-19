package com.thanhquan.annotationSpring;

import org.springframework.stereotype.Component;

@Component("BadFortune")
public class BadFortune implements FortuneService {

	@Override
	public String GetFortune() {
		return "Cancer is rising so work out now !";
	}

}
