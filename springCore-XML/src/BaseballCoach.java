
public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	private int randomNumber;
	public BaseballCoach() {
		
	}
	public BaseballCoach(FortuneService fortuneServiceArg, int randomNum) {
		fortuneService = fortuneServiceArg;
		this.randomNumber = randomNum;

		System.out.println("Constructor Injection : " + fortuneService.getDailyFortune(randomNum));
	}
	
	@Override
	public String GetDailyWorkout() { 
		return "Dribble 20 lap";
	}
	
	public void setFortuneService(FortuneService fortuneServiceArg) {
		this.fortuneService = fortuneServiceArg;
	}
	@Override
	public String GetFortuneService() {
		return ("Setter Injection : " + fortuneService.getDailyFortune(randomNumber));
	}
	@Override
	public String GetLiteralInjection() {return null;}
	
	@Override
	public String GetFileInjection() {return null;}
	
	public void initMethod() {
		System.out.println("Init method invoked for Baseball Coach");
	}
	
	public void destroyMethod() {
		System.out.println("Destroy method invoked");
	}
	
	
}
