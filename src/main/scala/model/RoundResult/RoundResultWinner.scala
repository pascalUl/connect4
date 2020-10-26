package model.RoundResult

import model.GameToken

case class RoundResultWinner(gameBoardState : Seq[Seq[Option[GameToken]]]) extends RoundResult
