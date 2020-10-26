package model.RoundResult

import model.GameToken

trait RoundResult {
  val gameBoardState : Seq[Seq[Option[GameToken]]]
}
