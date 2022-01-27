import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// package Data Structures;

public class Graph {
    static LinkedList<Integer> adj[]; 

    public Graph(int v){
        adj = new LinkedList[v];
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    static void createEdge(int source, int dest){
        adj[source].add(dest);
        adj[dest].add(source);
    } 

    static int BFS(int source, int dest){
        boolean[] vis = new boolean[adj.length];
        int[] parent = new int[adj.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(source);
        parent[source]=-1;
        vis[source]=true;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            if(cur==dest)   
                break;
            for(int neigh: adj[cur]){
                if(!vis[neigh]){
                    vis[neigh]=true;
                    queue.add(neigh);
                    parent[neigh]=cur;
                }
                
            }    
        }
        int dist=0;
        int cur = dest;
        while(parent[cur]!=-1){
            System.out.print(cur+" ->");
            cur = parent[cur];
            dist++;
        }
        System.out.println(parent[cur]);
        return dist;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        Graph graph = new Graph(v);
        System.out.println("Enter edges");
        for(int i=0; i<e; i++){
            int source = sc.nextInt();
            int dest = sc.nextInt();
            graph.createEdge(source, dest);
        }
        System.out.println("Enter source and destination");
        int s = sc.nextInt();
        int d = sc.nextInt();
        int bfsDist = BFS(s, d);
        System.out.println("Dist" +bfsDist);
    }
}
