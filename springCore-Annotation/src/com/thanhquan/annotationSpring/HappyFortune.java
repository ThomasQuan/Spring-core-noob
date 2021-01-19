package com.thanhquan.annotationSpring;

import org.springframework.stereotype.Component;

@Component("HappyFortune")
public class HappyFortune implements FortuneService {

	@Override
	public String GetFortune() {
		return "Happy Happy arrive ";
	}

}
