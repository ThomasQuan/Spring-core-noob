package com.thanhquan.annotationSpring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("EyeDoctor")
//@Scope("prototype")
public class EyeDoctor implements Doctor {
//	Field Injection
	@Value("8")
	private String RightEyeResult;
	@Value("10")
	private String LeftEyeResult;
//	File Injection
	@Value("${foo.email}") 
	private String email;
	private FortuneService happyFortune;
	private FortuneService badFortune;
	@Autowired
	@Qualifier("RandomFortune")
	private FortuneService randomFortune;

//	Constructor DI with Annotation
	@Autowired
	public EyeDoctor(FortuneService fService) {
		this.happyFortune = fService;
	}

	@Override
	public String GetPrescription() {
		return "Sleep for 8 hours and eat healthy vitamin A food ";
	}

//	Setter Injection or Method Injection with Annotation
//	This method doesn't have to be setter method. It can be any method 
	@Autowired
//	Qualifier is use to distinct different object
	@Qualifier("BadFortune")
	public void setBadFortune(FortuneService fService) {
		this.badFortune = fService;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post Construct method called");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre Destroy method called");
	}
	
	public String GetEyeResult() {
		return "Left : " + LeftEyeResult + " Right : " + RightEyeResult;
	}

	public String GetEmail() {
		return "Email : " + this.email;
	}
	
	public String GetHappyFortune() {
		return "Happy Fortune : " + happyFortune.GetFortune();
	}
	
	public String GetBadFortune() {
		return "Bad Fortune : " + badFortune.GetFortune();
	}
	
	public String GetRandomFortune() {
		return "Bad Fortune : " + randomFortune.GetFortune();
	}

}
