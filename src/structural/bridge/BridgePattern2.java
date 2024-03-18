package structural.bridge;

/**
 * Bridge pattern split a large class into two separate inheritance hierarchies one for the implementations and one for the abstractions.
 * These hierarchies are then connected to each other via object composition, forming a bridge-like structure.
 *
 * IResource is the left side of bridge
 * View is the right side of bridge
 *
 */
public class BridgePattern2 {

    public static void main(String[] args) {
        IResource my_artist = new Artist();
        View artist_view = new LongView(my_artist);

        IResource my_album = new Album();
        View album_view = new LongView(my_album);

        artist_view.show();
        album_view.show();
    }
}