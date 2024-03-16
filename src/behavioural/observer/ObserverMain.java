package behavioural.observer;

import behavioural.observer.observer.EmailService;
import behavioural.observer.observer.MessengerService;

public class ObserverMain {
    public static void main(String[] args) {

        EnrolmentService enrolment = new EnrolmentService();

        enrolment.register(new MessengerService());
        enrolment.register(new EmailService());

        enrolment.enrol(new Enrolment("Venkatesh","Computer Science"));
        enrolment.enrol(new Enrolment("Karthik","Computer Science"));

    }
}
