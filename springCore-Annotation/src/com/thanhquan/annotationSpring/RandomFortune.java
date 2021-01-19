package com.thanhquan.annotationSpring;

import org.springframework.stereotype.Component;

@Component("RandomFortune")
public class RandomFortune implements FortuneService {

	@Override
	public String GetFortune() {
		// TODO Auto-generated method stub
		return "You might get this or that depending on your kindness";
	}

}
