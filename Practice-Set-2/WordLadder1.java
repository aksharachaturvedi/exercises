package LeetCode;

import java.util.*;

/**
 * Created by rbabbar on 8/21/14.
 */
public class WordLadder1 {
    public int ladderLength(String start, String end, Set<String> dict) {
        if (start == null || end == null || start.length() != end.length() || start.length() == 0)
            return 0;

        // A queue used for breadth-first search
        Deque<String> queue = new ArrayDeque<String>();
        queue.offer(start);

        Set<String> visited = new HashSet<String>();    // Record the strings that have been visited

        int depth = 1;
        int nodesInCurrentLevel = 1, nodesInNextLevel = 0;

        // A breadth-first search starting from "start"
        while (queue.peek() != null) {

            String current = queue.poll();
            nodesInCurrentLevel--;

            // Try each string that is one character away from the current one
            for (int i = 0; i < current.length(); i++) {
                char[] charCurrent = current.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    charCurrent[i] = c;
                    String temp = new String(charCurrent);
                    if (temp.equals(end))   // Reach target string with one more transformation
                        return depth + 1;
                    if (!visited.contains(temp) && dict.contains(temp)) {
                        queue.offer(temp);
                        nodesInNextLevel++;
                        visited.add(temp);
                    }
                }
            }

            // All nodes at the current level are done; prepare to go to the next level
            if (nodesInCurrentLevel == 0) {
                nodesInCurrentLevel = nodesInNextLevel;
                nodesInNextLevel = 0;
                depth++;
            }
        }

        return 0;
    }
}