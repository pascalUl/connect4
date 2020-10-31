package controllers

import model.{MatchfieldModel, PlayerModel}

class GameLogic (var x: Int, var y: Int){

    /**
      * Check if a player has 4 chips in one row, column or diagonal
      *
      * @param player
      * @param matchfield
      * @return
      *
      */
  def checkIfPlayerWon(player: PlayerModel, matchfield : MatchfieldModel, a: Int, b: Int) : Boolean = {


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

    true
  }

}
