package dotc

import org.junit.Test
import test._

class tests extends CompilerTest {

  override val defaultOptions =
    List("-verbose", "-Ylog:frontend", "-explaintypes", "-Yshow-suppressed-errors", "-pagewidth", "160")

  val posDir = "/Users/odersky/workspace/dotty/tests/pos/"
  val negDir = "/Users/odersky/workspace/dotty/tests/neg/"


  @Test def pos_Coder() = compileFile(posDir, "Coder")
  @Test def pos_blockescapes() = compileFile(posDir, "blockescapes")
  @Test def pos_collections() = compileFile(posDir, "collections")
  @Test def pos_functions1() = compileFile(posDir, "functions1")
  @Test def pos_implicits1() = compileFile(posDir, "implicits1")
  @Test def pos_inferred() = compileFile(posDir, "inferred")
  @Test def pos_Patterns() = compileFile(posDir, "Patterns")
  @Test def pos_selftypes() = compileFile(posDir, "selftypes")
  @Test def pos_varargs() = compileFile(posDir, "varargs")

  @Test def neg_blockescapes() = compileFile(negDir, "blockescapesNeg", xerrors = 2)

}