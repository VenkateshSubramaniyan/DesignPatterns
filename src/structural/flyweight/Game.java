package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Game {

    //Shared  Intrinsic
    private final List<Tree> trees;

    //Extrinsic
    private final List<TreePosition> treePositions;

    //Shared Intristic tree obj comes from factory
    private final TreeFactory treeFactory;

    public Game() {
        this.trees = new ArrayList<>();
        this.treePositions = new ArrayList<>();

        this.treeFactory = new TreeFactory();
    }

    public void addTree(int x, int y, String color) {
        Tree tree = treeFactory.getTree(color);

        if (tree == null) return;

        trees.add(tree);
        treePositions.add(new TreePosition(x, y));

        final int treeId = trees.size() - 1;
        this.renderTree(treeId);
    }

    private void renderTree(int id) {
        System.out.println("Tree " + id
                + " with " + trees.get(id).getColor() + " color"
                + " rendered at " + treePositions.get(id).getX()
                + ", " + treePositions.get(id).getY());
    }
}