package controllers

import model.PlayerModel
import org.scalatest.wordspec.AnyWordSpec

class GameLogicSpec extends AnyWordSpec {
  "The GameLogic" should {
    val gameLogic = new GameLogic()
    val initialField = gameLogic.getInitialMatchField()
    val player = PlayerModel("Max Mustermann", 'X')

    "return an initial match field" in {  }
    "set a chip in the matchfield" in {
      val resultField = gameLogic.setChip(1, initialField, player)
    }
    "check whether the game is over" in {
      val resultField = for (i <- 1 to 3) {
      }

    }
    "check whether the game continues" in {}
  }

}
