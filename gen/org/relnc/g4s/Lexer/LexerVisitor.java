// Generated from /home/relanciobg/Projetos/Java/compilador/src/main/java/org/relnc/g4s/Lexer/Lexer.g4 by ANTLR 4.13.1
package org.relnc.g4s.Lexer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LexerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LexerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(LexerParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(LexerParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(LexerParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(LexerParser.PrintlnContext ctx);
}