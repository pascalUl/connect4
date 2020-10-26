package model.RoundResult

import model.GameToken

case class RoundResultUndecided(gameBoardState : Seq[Seq[Option[GameToken]]]) extends RoundResult
