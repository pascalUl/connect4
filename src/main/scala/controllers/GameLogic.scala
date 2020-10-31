package controllers

import model.{MatchfieldModel, PlayerModel}

class GameLogic () {

    /**
      * Check if a player has 4 chips in one row, column or diagonal
      *
      * @param matchfield
      * @return Option with the player who has won the game or None
      *
      */
  def checkIfSomeoneWon(matchfield : MatchfieldModel) : Option[PlayerModel] = {


    def fourInColumn() : Boolean = {
      true
    }

    def fourInRow() : Boolean = {
      true
    }

    def fourDiagonalFromXTop() : Boolean = {
      true
    }

    def fourDiagonalFromXBottom() : Boolean = {
      true
    }

    def fourDiagonalFromYTop() : Boolean = {
      true
    }

    def fourDiagonalFromYBottom() : Boolean = {
      true
    }

    // for now
    None
  }

  def getInitialMatchField() = {
    MatchfieldModel()
  }

  def setChip(column : Int, matchField : MatchfieldModel, player : PlayerModel) = {
    MatchfieldModel()
  }

}
