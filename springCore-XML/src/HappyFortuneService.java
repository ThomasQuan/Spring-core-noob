
public class HappyFortuneService implements FortuneService {
	@Override
	public String getDailyFortune(int randomNumber) {
		return "Happiness will come soon at : " + randomNumber;
	}
}