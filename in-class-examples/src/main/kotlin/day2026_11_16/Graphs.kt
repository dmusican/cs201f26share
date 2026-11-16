package day2026_11_13

fun main() {
    val graph = Graph(numVertices = 7)
    graph.addEdge(1,3)
    graph.addEdge(1,4)
    graph.addEdge(3,5)
    graph.addEdge(5,6)
    graph.addEdge(5,2)

    println("Depth first:")
    graph.depthFirstDisplay(1)
}

class Graph(var numVertices: Int) {

    var adjacencyMatrix = MutableList(numVertices) {MutableList(numVertices) {false}}

    fun addEdge(vertex1: Int, vertex2: Int) {
        adjacencyMatrix[vertex1][vertex2] = true
        adjacencyMatrix[vertex2][vertex1] = true
    }

    fun depthFirstDisplay(startVertex: Int) {
        val visited = MutableList(numVertices) {false}
        depthFirstFromNode(startVertex, visited)
    }

    private fun depthFirstFromNode(vertex: Int, visited: MutableList<Boolean>) {

        if (_____________________________) {
            return
        } else {
            visited[vertex] = true
            println("Visiting " + vertex)
            for (j in 0..<numVertices) {

                if (___________________________________________) {

                    depthFirstFromNode(_____________________, _______________________)
                }
            }
        }
    }
