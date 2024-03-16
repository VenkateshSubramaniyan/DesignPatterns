package behavioural.observer.observer;

import behavioural.observer.Enrolment;

public class MessengerService implements EnrolmentObserver {
    @Override
    public void newEnrolment(Enrolment enrolment) {
        System.out.printf("new SMS: congratulations %s! You have enroled in the %s course \n",
                enrolment.getStudent(), enrolment.getCourse());
    }
}


