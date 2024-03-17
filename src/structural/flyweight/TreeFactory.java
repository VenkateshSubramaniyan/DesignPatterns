package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
    We created two classes,
            Tree        -> that store both the intrinsic
            TreePosition-> extrinsic states.
    The Game class stores and maintains the Tree flyweight objects and its extrinsic state TreePosition.
    We used the FlyweightFactory class to create and cache the flyweight objects.
 */
public class TreeFactory {
    private static Map<String, Tree> treeMap;

    public TreeFactory() {
        treeMap = new HashMap<>();
    }

    public Tree getTree(String color) {
        if(color == null) return null;

        if (!color.equals("green") && !color.equals("brown")) return null;

        if(treeMap.containsKey(color)) {
            return treeMap.get(color);
        }

        Tree tree = new Tree(color);
        treeMap.put(color, tree);

        return tree;
    }
}