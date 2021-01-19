package com.thanhquan.annotationSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		EyeDoctor myDoctor = context.getBean("EyeDoctor",EyeDoctor.class);
		System.out.println(myDoctor.GetPrescription());
		System.out.println(myDoctor.GetHappyFortune());
		System.out.println(myDoctor.GetBadFortune());
		System.out.println(myDoctor.GetRandomFortune());
		System.out.println(myDoctor.GetEmail());
		System.out.println(myDoctor.GetEyeResult());

		context.close();
		
	}

}
