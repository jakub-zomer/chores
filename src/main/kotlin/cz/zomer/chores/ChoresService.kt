package cz.zomer.chores

open class ChoresService {
    fun kidsWork(age: Int): Collection<String> {
        val chores = hashMapOf(Pair(1, "sports"), Pair(2, "general help to parents"), Pair(3, "pet care"), Pair(4, "helping with dishes"), Pair(5, "helping with cleaning"),
        Pair(6, "homework"), Pair(7, "study"))
        val age5 = chores.filterKeys { it < 5 }
        val age6 = chores.filterKeys { it < 6 }
        val age7 = chores.filterKeys { it < 7 }
        val age8 = chores.filterKeys { it < 8 }
        return when {
            age == 8 ->  age8.values
            age == 7 ->  age7.values
            age == 6 ->  age6.values
            age < 6  -> age5.values

            else -> {
                chores.put(8, "work hard")
                chores[2] = "general help to kids"
                chores [4] = "make the dishes"
                chores [5] ="clean"
                chores [6] = "prepare kids to school"
                return chores.values
            }


        }

    }

}

