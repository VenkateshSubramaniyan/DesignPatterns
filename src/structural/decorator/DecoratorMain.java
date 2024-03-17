package structural.decorator;

public class DecoratorMain {

    public static void main(String[] args){

        Color black = new Black();
        Color pattern = new TextureDecorator(new Black());

        System.out.println("\nStyle: Solid");
        black.fill();

        System.out.println("\nStyle: Pattern");
        pattern.fill();
    }
}
