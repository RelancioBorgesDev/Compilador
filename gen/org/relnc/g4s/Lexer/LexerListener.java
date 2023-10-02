// Generated from /home/relanciobg/Projetos/Java/compilador/src/main/java/org/relnc/g4s/Lexer/Lexer.g4 by ANTLR 4.13.1
package org.relnc.g4s.Lexer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexerParser}.
 */
public interface LexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LexerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LexerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(LexerParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(LexerParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(LexerParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(LexerParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(LexerParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(LexerParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(LexerParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(LexerParser.PrintlnContext ctx);
}