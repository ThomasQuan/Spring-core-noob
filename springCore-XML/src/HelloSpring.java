import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
//		LOAD SPRING CONTAINER WITH CONFIG FILE
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
//		USE BEAN FROM CONFIG FILE
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println("IOC calling : " + theCoach.GetDailyWorkout());
		System.out.println("Setter Injection : " + theCoach.GetFortuneService());
		System.out.println(theCoach.GetLiteralInjection());
		System.out.println(theCoach.GetFileInjection());
		BaseballCoach baseballCoach = context.getBean("lifecycleBean", BaseballCoach.class);
		System.out.println(baseballCoach.GetDailyWorkout());
		context.close();
	}

}
