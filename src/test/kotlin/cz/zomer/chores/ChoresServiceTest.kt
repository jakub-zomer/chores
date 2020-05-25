package cz.zomer.chores

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChoresServiceTest {

@Test
    fun choresAgeSixTest() {
    val choresService = ChoresService()
    assertThat(choresService.kidsWork(6)).contains("pet care")
    assertThat(choresService.kidsWork(6)).doesNotContain("study", "clean")
    }
@Test
    fun choresAgeTenTest() {
    val choresService = ChoresService()
    assertThat(choresService.kidsWork(10)).isNotEmpty
    assertThat(choresService.kidsWork(10)).doesNotContainNull()
    assertThat(choresService.kidsWork(10)).contains("clean")
}
    @Test
    fun choresAgeFiveTest(){
        val choresService = ChoresService()
        assertThat(choresService.kidsWork(5)).element(2).isEqualTo("pet care")
        assertThat(choresService.kidsWork(5)).containsAnyOf("pet care", "bulldoze bedroom", "sports")
    }


}