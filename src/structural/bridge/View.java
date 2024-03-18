package structural.bridge;


// ***(Left side of the Bridge)***

// Abstraction
public abstract class View {
    protected IResource resource;

    protected  View(IResource resource){
        this.resource = resource;
    }
    public abstract void show();
}

// Concrete Abstraction
class LongView extends View {
    public LongView(IResource resource) {
        super(resource);
    }
    public void show() {
        resource.snippet();
    }
}
