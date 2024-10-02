import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        try {
            // Open the input file
            File file = new File("input.txt");
            Scanner fileScanner = new Scanner(file);

            // Read the number of vertices and edges from the file
            int vertices = fileScanner.nextInt();
            int edges = fileScanner.nextInt();

            // Create a graph object with the given number of vertices
            Graph graph = new Graph(vertices);

            // Read the edges from the file and add them to the graph
            for (int i = 0; i < edges; i++) {
                int src = fileScanner.nextInt() - 1;  // Subtract 1 to make it 0-indexed
                int dest = fileScanner.nextInt() - 1; // Subtract 1 to make it 0-indexed
                graph.addEdge(src, dest);
            }

            // Read the starting vertex for BFS from the file
            int startVertex = fileScanner.nextInt();

            // Read the vertex to check for adjacent vertices from the file
            int vertexToCheck = fileScanner.nextInt() - 1;  // Make it 0-indexed

            // Display the graph's adjacency list
            graph.displayGraph();

            // Perform BFS from the given start vertex
            graph.bfs(startVertex);

            // Get and print the number of vertices
            System.out.println("Number of vertices in the graph: " + graph.getNumberOfVertices());

            // Get and print the adjacent vertices of the selected vertex
            System.out.print("Adjacent vertices of vertex " + (vertexToCheck + 1) + ": ");
            for (int adjacent : graph.getAdjacentVertices(vertexToCheck)) {
                System.out.print((adjacent + 1) + " ");  // Convert back to 1-indexed for display
            }
            System.out.println();

            // Adding n new vertices to the graph
            if (fileScanner.hasNextInt()) {
                int n = fileScanner.nextInt();
                System.out.println("Adding " + n + " new vertices to the graph...");
                graph.addVertex(n);

                // Display the updated graph's adjacency list after adding the vertices
                graph.displayGraph();
                System.out.println(n + " new vertices added. Total vertices now: " + graph.getNumberOfVertices());
            }

            // Reading the new edge to be added from the file
            if (fileScanner.hasNextInt()) {
                int newSrc = fileScanner.nextInt() - 1;  // Subtract 1 to make it 0-indexed
                int newDest = fileScanner.nextInt() - 1; // Subtract 1 to make it 0-indexed

                // Add the new edge to the graph
                graph.addEdge(newSrc, newDest);

                // Display the updated graph's adjacency list after adding the new edge
                graph.displayGraph();
                System.out.println("New edge added between vertices " + (newSrc + 1) + " and " + (newDest + 1));
            } else {
                System.out.println("No new edge information found in the file.");
            }

            // Print shortest paths again from the BFS start vertex
            System.out.println("Shortest paths from vertex " + startVertex + " after adding new vertices and edges:");
            graph.bfs(startVertex);

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}


/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        try {
            // Open the input file
            File file = new File("input.txt");
            Scanner fileScanner = new Scanner(file);

            // Read the number of vertices and edges from the file
            int vertices = fileScanner.nextInt();
            int edges = fileScanner.nextInt();

            // Create a graph object with the given number of vertices
            Graph graph = new Graph(vertices);

            // Read the edges from the file and add them to the graph
            for (int i = 0; i < edges; i++) {
                int src = fileScanner.nextInt() - 1;  // Subtract 1 to make it 0-indexed
                int dest = fileScanner.nextInt() - 1; // Subtract 1 to make it 0-indexed
                graph.addEdge(src, dest);
            }

            // Read the starting vertex for BFS from the file
            int startVertex = fileScanner.nextInt();

            // Read the vertex to check for adjacent vertices from the file
            int vertexToCheck = fileScanner.nextInt() - 1;  // Make it 0-indexed

            // Display the graph's adjacency list
            graph.displayGraph();

            // Perform BFS from the given start vertex
            graph.bfs(startVertex);

            // Get and print the number of vertices
            System.out.println("Number of vertices in the graph: " + graph.getNumberOfVertices());

            // Get and print the adjacent vertices of the selected vertex
            System.out.print("Adjacent vertices of vertex " + (vertexToCheck + 1) + ": ");
            for (int adjacent : graph.getAdjacentVertices(vertexToCheck)) {
                System.out.print((adjacent + 1) + " ");  // Convert back to 1-indexed for display
            }
            System.out.println();

            // Adding n new vertices to the graph
            if (fileScanner.hasNextInt()) {
                int n = fileScanner.nextInt();
                System.out.println("Adding " + n + " new vertices to the graph...");
                graph.addVertex(n);

                // Display the updated graph's adjacency list after adding the vertices
                graph.displayGraph();
                System.out.println(n + " new vertices added. Total vertices now: " + graph.getNumberOfVertices());
            }

            // Reading the new edge to be added from the file
            if (fileScanner.hasNextInt()) {
                int newSrc = fileScanner.nextInt() - 1;  // Subtract 1 to make it 0-indexed
                int newDest = fileScanner.nextInt() - 1; // Subtract 1 to make it 0-indexed

                // Add the new edge to the graph
                graph.addEdge(newSrc, newDest);

                // Display the updated graph's adjacency list after adding the new edge
                graph.displayGraph();
                System.out.println("New edge added between vertices " + (newSrc + 1) + " and " + (newDest + 1));
            } else {
                System.out.println("No new edge information found in the file.");
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}*/


/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        try {
            
            File file = new File("input.txt");
            Scanner fileScanner = new Scanner(file);

        
            int vertices = fileScanner.nextInt();
            int edges = fileScanner.nextInt();

            Graph graph = new Graph(vertices);

            for (int i = 0; i < edges; i++) {
                int src = fileScanner.nextInt() - 1;  
                int dest = fileScanner.nextInt() - 1; 
                graph.addEdge(src, dest);
            }

            int startVertex = fileScanner.nextInt();

            int vertexToCheck = fileScanner.nextInt() - 1;  

           
            graph.displayGraph();

            
            graph.bfs(startVertex);

            System.out.println("Number of vertices in the graph: " + graph.getNumberOfVertices());

            System.out.print("Adjacent vertices of vertex " + (vertexToCheck + 1) + ": ");
            for (int adjacent : graph.getAdjacentVertices(vertexToCheck)) {
                System.out.print((adjacent + 1) + " ");  
            }
            System.out.println();


            System.out.println("Adding a new vertex to the graph...");
            graph.addVertex();

            graph.displayGraph();
            System.out.println("New vertex added. Total vertices now: " + graph.getNumberOfVertices());

            if (fileScanner.hasNextInt()) {
                int newSrc = fileScanner.nextInt() - 1;
                int newDest = fileScanner.nextInt() - 1;

                graph.addEdge(newSrc, newDest);

                graph.displayGraph();
                System.out.println("New edge added between vertices " + (newSrc + 1) + " and " + (newDest + 1));
            } else {
                System.out.println("No new edge information found in the file.");
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}*/

