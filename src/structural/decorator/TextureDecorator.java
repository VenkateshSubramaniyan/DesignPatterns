package structural.decorator;

//concrete decorator class extending base decorator class

/** Create a decorator that accepts the interface,
 *  Perform desired additional function
 *  call that interface after performing what we want

 */
public class TextureDecorator extends ColorDecorator{
    public TextureDecorator(Color colored){
        super(colored);
    }

    public void fill(){
        colored.fill();
        addPattern(colored);
    }

    private void addPattern(Color colored){

        System.out.println("Texture Added");
    }
}
