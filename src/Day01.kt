fun main() {
    fun part1(input: List<String>): Int {
        var dial = 50
        var zeroes = 0
        input.forEach {
            if (it[0] == 'L') {
                dial = (dial - it.drop(1).toInt()) % (100)
            } else {
                dial = (dial + it.drop(1).toInt()) % (100)
            }
            if (dial == 0) zeroes++
        }
        return zeroes
    }

//    fun part2(input: List<String>): Int {
//        return input.size
//    }

    // Test if implementation meets criteria from the description, like:
    // check(part1(listOf("test_input")) == 1)

    // Or read a large test input from the `src/Day01_test.txt` file:
    // val testInput = readInput("Day01_test")
    // check(part1(testInput) == 1)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input).println()
    // part2(input).println()
}
