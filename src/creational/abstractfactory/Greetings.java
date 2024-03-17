package creational.abstractfactory;

public interface Greetings {

	String goodMorning();
	
	String goodAfternoon();
	
}

class GreetingsEs implements Greetings {

	@Override
	public String goodMorning() {
		return "buenos días";
	}

	@Override
	public String goodAfternoon() {
		return "buenas tardes";
	}

}



class GreetingsEn implements Greetings {

	@Override
	public String goodMorning() { return "good morning";
	}

	@Override
	public String goodAfternoon() { return "good afternoon";
	}

}


