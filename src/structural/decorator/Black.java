package structural.decorator;

//concrete component of the base interface
public class Black implements Color{
    @Override
    public void fill(){
        System.out.println("Black color");
    }
}