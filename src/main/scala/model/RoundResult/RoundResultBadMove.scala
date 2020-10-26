package model.RoundResult

import model.GameToken

case class RoundResultBadMove(gameBoardState : Seq[Seq[Option[GameToken]]]) extends RoundResult
