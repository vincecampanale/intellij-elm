package org.elm.lang.core.lexer

import com.intellij.lexer.Lexer

/**
 * Test the lexer's ability to tokenize basic Elm code.
 *
 * @see ElmIncrementalLexer
 */
class ElmIncrementalLexerTest : ElmLexerTestCaseBase() {

    override fun getTestDataPath() =
            "org/elm/lang/core/lexer/fixtures/incremental"

    override fun createLexer(): Lexer {
        return ElmIncrementalLexer()
    }

    fun testBasics() = doTest()
    fun testLineComments() = doTest()
    fun testBlockComments() = doTest()
    fun testDocComments() = doTest()
    fun testTypes() = doTest()
    fun testTypeAnnotations() = doTest()
    fun testMultiLineStringLiterals() = doTest()
}
