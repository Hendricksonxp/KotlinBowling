import com.hxp.bowling.BowlingGame
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue


class BowlingTest {

    @Test
    fun hookUp(){
        assertTrue(true)
    }

    @Test
    fun gutterBallsTest(){
        val scores = listOf(0,0, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
        val game = BowlingGame(scores)
        val score = game.score();
        assertEquals(0, score)
    }

    @Test
    fun onePinEvertime(){
        val scores = listOf(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1)
        val game = BowlingGame(scores)
        val score = game.score();
        assertEquals(20, score)
    }
}