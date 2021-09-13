package behavioural.memento.articlexample;


/**
 * Memento pattern is used to restore state of an object to a previous state.
 * It is also known as snapshot pattern.
 *
 * Real world example:-
 *   Gui editor like MS paint ctrl+z operations
 *   javax.swing.text.JTextComponent class provides an undo support mechanism.
 *   javax.swing.undo.UndoManager can act as a caretaker,
 *   an implementation of javax.swing.undo.UndoableEdit can act like a memento,
 *   and an implementation of javax.swing.text.Document can act like an originator.
 */
public final class ArticleMemento
{
    private final long id;
    private final String title;
    private final String content;

    public ArticleMemento(long id, String title, String content) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}