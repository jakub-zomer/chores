package cz.zomer.chores

open class ChoresService {
    fun kidsWork(age: Int): Collection<String> {
        val chores = hashMapOf(Pair(1, "sports"), Pair(2, "general help to parents"), Pair(3, "pet care"), Pair(4, "helping with dishes"), Pair(5, "helping with cleaning"),
        Pair(6, "homework"), Pair(7, "study"))
        val age5 = chores.filterKeys { it < 5 }
        val age6 = chores.filterKeys { it < 6 }
        val age7 = chores.filterKeys { it < 7 }
        val age8 = chores.filterKeys { it < 8 }
        when (age) {
            8 -> return age8.values
            7 -> return age7.values
            6 -> return age6.values
            5 -> return age5.values
            else -> return age8.values

        }

    }
}

