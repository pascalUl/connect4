import controllers.GameLogic
import model.{MatchfieldModel, PlayerModel}

import scala.annotation.tailrec
import scala.io.StdIn

object ConnectFour {

  def main(args:Array[String]): Unit = {

    val gameLogic = new GameLogic()

    // Create players
    println("Please type in name of player 1:")
    val name1 = StdIn.readLine()
    println("Please type in name of player 2:")
    val name2 = StdIn.readLine()

    val player1 = PlayerModel(name1, 'x')
    val player2 = PlayerModel(name2, 'o')
    println(s"Symbol of player ${player1.name} is ${player1.sign}")
    println(s"Symbol of player ${player2.name} is ${player2.sign}")
    val players = Vector[PlayerModel](player1, player2)

    // Get initial match field
    val matchField = gameLogic.getInitialMatchField()

    // get randim index between 0 and 1
    val r = scala.util.Random
    val startPlayerIndex = r.nextInt(2)

    play(players, startPlayerIndex, matchField, gameLogic) match {
      case Some(p) => println(s"Player ${p.name} has won the game!")
      case None => println(s"Draw. The game is over.")
    }
  }

  // play(players, RoundIndex, matchField, gamelogic) : Option[PlayerModel]
  //  - Ruft sich rekursiv selbst auf.
  //  - Fragt nach Spalte in welche Chip gesetzt werden soll
  //  - setzt Chip inder Spalte (Funktion gibt matchField bei Erfolg zurück, None wenn Spalte voll ist)
  //    - Wenn Rueckgabe None: Hinweis per printf, rekursiver Aufruf mit selben Daten
  //    - Wenn Rueckgabe Some: Matchfield per printf ausgeben
  //  - Ende wenn:
  //    -Gewinner (gibt PlayerModel zurück) -> PlayerModel zuruckgeben
  //    - oder Unentschieden (Boolean).  -> None zurueckgeben
  // - Rekursion: Aufruf mit invertiertem index
  // Gewinner verkuenden/unentschieden

  @tailrec
  private def play(players: Vector[PlayerModel], playerIndex: Int, matchField: MatchfieldModel, gameLogic: GameLogic): Option[PlayerModel] = {
    val player = players(playerIndex)
    printf(s"${player.name}, in which column should the chip be placed?")
    val columnIndex = StdIn.readInt()

    gameLogic.setChip(columnIndex, matchField, player) match {
      case None =>
        println("Selected column is already full. Please select another column to place chip")
        play(players, playerIndex, matchField, gameLogic)
      case Some(m) =>
        println(m)

        gameLogic.checkIfSomeoneWon(m) match {
          // return winner
          case Some(w) => Some(w)

          case None =>
            if(gameLogic.checkIfDraw(matchField)) {
              // no winner, but game is over
              None
            }
            else {
              // Game not over yet, recurse
              // toggle playerIndex
              val nextPlayerIndex = if (playerIndex == 0) 1 else 0
              play(players, nextPlayerIndex, matchField, gameLogic)
            }
        }
    }
  }
}
