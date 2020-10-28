package model

import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec


class MatchfieldModelSpec extends AnyWordSpec with Matchers {
  "A MatchfieldModelSpec" when {
    "Created without parameter" should {
      "be created with 7 columns and 6 rows" in {}
      "initially have only free cells" in {}
      "have a string representation" in {}
      "give access to its cells" in {}
    }
    "Created with predefined matrix" should {
      "have the right values (PlayerModels) in the right places" in {}
    }
  }
}
