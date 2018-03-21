

import java.util.List;
import java.util.Set;
import java.util.HashSet;

/*
 * SD2x Homework #6
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class GraphUtils {

    public static int minDistance(Graph graph, String src, String dest) {

        if (graph == null || src == null || dest == null) {
            return -1;
        }

        if (!graph.containsElement(dest) || !graph.containsElement(src)) {
            return -1;
        }

        BreadthFirstSearch bfs = new BreadthFirstSearch(graph);

        Node start = graph.getNode(src);

        return bfs.bfsDistance(start, dest); // this line is here only so this code will compile if you don't modify it
    }


    public static Set<String> nodesWithinDistance(Graph graph, String src, int distance) {

        if (graph == null || src == null || distance < 1) {
            return null;
        }

        Node start = graph.getNode(src);

        if (!graph.containsNode(start)) {
            return null;
        }

        Set<Node> allNodes = graph.getAllNodes();
        Set<String> valuesWithinDistance = new HashSet<>();

        for (Node node : allNodes) {
            int distFromSrc = minDistance(graph, src, node.getElement());
            if (distFromSrc != -1 && distFromSrc != 0) {
                if (distFromSrc <= distance) {
                    valuesWithinDistance.add(node.getElement());
                }
            }

        }
        return valuesWithinDistance; // this line is here only so this code will compile if you don't modify it
    }


    public static boolean isHamiltonianPath(Graph g, List<String> values) {

        /* IMPLEMENT THIS METHOD! */

        return true; // this line is here only so this code will compile if you don't modify it
    }

}
