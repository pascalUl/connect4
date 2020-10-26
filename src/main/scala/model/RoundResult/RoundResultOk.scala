package model.RoundResult

import model.GameToken

case class RoundResultOk(gameBoardState : Seq[Seq[Option[GameToken]]]) extends RoundResult
