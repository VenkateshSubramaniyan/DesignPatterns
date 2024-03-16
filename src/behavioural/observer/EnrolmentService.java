package behavioural.observer;

import behavioural.observer.observer.EnrolmentObserver;

import java.util.LinkedHashSet;
import java.util.Set;

public class EnrolmentService {

    private Set<EnrolmentObserver> observers = new LinkedHashSet<>();

    public void register(EnrolmentObserver observer) {
        observers.add(observer);
    }

    public void enrol(Enrolment enrolment) {
        System.out.printf("creating %s's new enrolment for %s course \n",
                                enrolment.getStudent(), enrolment.getCourse());

        for (EnrolmentObserver observer : observers) {
            observer.newEnrolment(enrolment);
        }
    }
}
