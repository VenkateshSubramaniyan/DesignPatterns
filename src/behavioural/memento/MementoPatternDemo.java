package behavioural.memento;

/**
 * The memo pattern provides flexibility to restore an object to its previous state (undo) (Previous checkpoint)
 * or store the object's history to understand how it mutated over several operations and restore to a specific state when required.
 *
 * Originator: This object is responsible for creating a memo that can store and restore its internal state
 *                  and decide which internal state memento object stores according to required needs.
 *                  (i.e) if we are editing then that document is the originator
 * Memento:    This object is used to store the internal state/Snapshot of the Originator
 *                  and can prevent objects (other than Originator) from accessing this object.
 * Caretaker: This object store snapshot  or return the requested snapshot
 *
 */
public class MementoPatternDemo {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}