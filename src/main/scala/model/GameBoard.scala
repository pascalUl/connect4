package model

import model.RoundResult.{RoundResult, RoundResultOk}

case class GameBoard() {
  val gameBoardState = Array.ofDim[GameToken](7, 6)

  def setField(token: GameToken, column: Int): RoundResult = {

    RoundResultOk(gameBoardState)
  }
}
