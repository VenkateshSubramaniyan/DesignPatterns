package creational.abstractfactory;

/**
 * Factory for greetings and questions in different languages
 */
public interface MessagesAbstractFactory {
	
	Greetings getGreetings();
	
	Questions getQuestions();

}
