package structural.bridge;

// ***(Right side of the Bridge)***

// Implementor
interface IResource {
    public void snippet();
}

// Concrete Implementor 1
class Artist implements IResource {
    @Override
    public void snippet() {
        System.out.println("Artist's Snippet is here !!!");
    }
}

// Concrete Implementor 2
class Album implements IResource {
    @Override
    public void snippet() {
        System.out.println("Hola !!!, This is my Album Description ...");
    }
}

