package structural.decorator;

//abstract decorator class
abstract class ColorDecorator implements Color{

    //base class object
    protected Color colored;

    //constructor with base class object as the parameter
    public ColorDecorator(Color colored){
        this.colored = colored;
    }

    public void fill(){
        colored.fill();
    }
}