
//REVISIT - 1st GRAPH PROBLEM I CAME ACROSS
// Find maximum score (min edge weight) on any valid path from 0 to n-1
// where path cost <= k and all nodes are online
// Use BFS with bitmask for visited nodes

import java.util.*;

public class Leetcode_3620 {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;
        
        // Node 0 or n-1 offline means no valid path
        if (!online[0] || !online[n - 1]) return -1;
        
        // Build adjacency list: node -> list of (neighbor, weight)
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }
        
        // Use PriorityQueue: (minEdge, cost, node, visitedMask)
        // Prioritize by maximing minEdge
        PriorityQueue<State> pq = new PriorityQueue<>();
        Set<String> visited = new HashSet<>();
        
        pq.offer(new State(Integer.MAX_VALUE, 0, 0, 1L)); // Start at node 0
        int maxScore = -1;
        
        while (!pq.isEmpty()) {
            State curr = pq.poll();
            
            if (curr.node == n - 1) {
                maxScore = Math.max(maxScore, curr.minEdge);
                continue;
            }
            
            if (curr.cost > k) continue;
            
            String key = curr.node + ":" + curr.visitedMask;
            if (visited.contains(key)) continue;
            visited.add(key);
            
            for (int[] neighbor : graph.get(curr.node)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];
                
                if (!online[nextNode]) continue;
                
                // Check if already visited
                if ((curr.visitedMask & (1L << nextNode)) != 0) continue;
                
                long nextCost = curr.cost + weight;
                if (nextCost > k) continue;
                
                int nextMinEdge = Math.min(curr.minEdge, weight);
                long nextMask = curr.visitedMask | (1L << nextNode);
                
                pq.offer(new State(nextMinEdge, nextCost, nextNode, nextMask));
            }
        }
        
        return maxScore;
    }
    
    static class State implements Comparable<State> {
        int minEdge;
        long cost;
        int node;
        long visitedMask;
        
        State(int minEdge, long cost, int node, long visitedMask) {
            this.minEdge = minEdge;
            this.cost = cost;
            this.node = node;
            this.visitedMask = visitedMask;
        }
        
        @Override
        public int compareTo(State other) {
            // Prioritize by max minEdge
            if (this.minEdge != other.minEdge) {
                return Integer.compare(other.minEdge, this.minEdge);
            }
            // Then by lower cost
            return Long.compare(this.cost, other.cost);
        }
    }

    public static void main(String[] args) {
        Leetcode_3620 solution = new Leetcode_3620();
        
        // Example 1
        int[][] edges1 = {{0,1,5},{1,3,10},{0,2,3},{2,3,4}};
        boolean[] online1 = {true,true,true,true};
        long k1 = 10;
        System.out.println("Example 1: " + solution.findMaxPathScore(edges1, online1, k1)); // Expected: 3
        
        // Example 2
        int[][] edges2 = {{0,1,7},{1,4,5},{0,2,6},{2,3,6},{3,4,2},{2,4,6}};
        boolean[] online2 = {true,true,true,false,true};
        long k2 = 12;
        System.out.println("Example 2: " + solution.findMaxPathScore(edges2, online2, k2)); // Expected: 6
    }
}
