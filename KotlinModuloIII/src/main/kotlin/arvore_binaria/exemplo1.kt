package arvore_binaria

data class NodeArray<T>(val value: T)

class TreeArray<T : Comparable<T>> {
    private val container = arrayOfNulls<NodeArray<T>>(100)
    fun add(value: T, index: Int = 0) {
        val node = container[index]

        if (node == null) {
            container[index] = NodeArray(value)
        } else if(node.value >= value) {
            //ir para a esquerda
            add(
                value,
                (2 * index + 1).coerceAtLeast(1)
            )
        } else {
            //ir para a direita
            add(
                value,
                (2 * index + 2)
            )
        }
    }

    override fun toString(): String {
        return container.contentToString()
    }
}

fun main() {
    val treeArray = TreeArray<Int>()

    treeArray.add(8)
    treeArray.add(5)
    treeArray.add(4)
    treeArray.add(7)
    treeArray.add(9)

    println(treeArray)
}