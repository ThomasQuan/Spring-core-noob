
public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	private int randomNumber;
	private String literalInjection;
	private String fileInjection;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneServiceArg, int randomNum) {
		fortuneService = fortuneServiceArg;
		this.randomNumber = randomNum;
		System.out.println("Constructor Injection : " + fortuneService.getDailyFortune(randomNum));
	}

	public void setFortuneService(FortuneService fortuneServiceArg) {
		this.fortuneService = fortuneServiceArg;
	}

	public void setLiteralInjection(String li) {
		this.literalInjection = li;
	}

	public void setFileInjection(String fileInjection) {
		this.fileInjection = fileInjection;
	}

	

	@Override
	public String GetDailyWorkout() {
		return "Run 20 lap " ;
	}

	@Override
	public String GetLiteralInjection() {
		return "Literal Injection : " + literalInjection;
	}

	@Override
	public String GetFileInjection() {
		return "File Injection : " + this.fileInjection;
	}

	@Override
	public String GetFortuneService() {
		return ("Setter Injection : " + fortuneService.getDailyFortune(randomNumber));
	}

}
