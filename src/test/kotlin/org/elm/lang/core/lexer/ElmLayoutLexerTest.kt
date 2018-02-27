package org.elm.lang.core.lexer

import com.intellij.lexer.Lexer

/**
 * Test the lexer's ability to synthesize tokens related to offside rule.
 *
 * @see ElmLayoutLexer
 */
class ElmLayoutLexerTest: ElmLexerTestCaseBase() {

    override fun getTestDataPath() =
            "org/elm/lang/core/lexer/fixtures/layout"

    override fun createLexer(): Lexer {
        return ElmLayoutLexer(ElmIncrementalLexer())
    }

    fun testLetIn() = doTest()
    fun testLetInSingleLineBug() = doTest()
    fun testCaseOf() = doTest()
}
