// Generated from G3.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link G3Parser}.
 */
public interface G3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link G3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(G3Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link G3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(G3Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G3Div}
	 * labeled alternative in {@link G3Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG3Div(G3Parser.G3DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G3Div}
	 * labeled alternative in {@link G3Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG3Div(G3Parser.G3DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G3Mult}
	 * labeled alternative in {@link G3Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG3Mult(G3Parser.G3MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G3Mult}
	 * labeled alternative in {@link G3Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG3Mult(G3Parser.G3MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G3TermE}
	 * labeled alternative in {@link G3Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG3TermE(G3Parser.G3TermEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G3TermE}
	 * labeled alternative in {@link G3Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG3TermE(G3Parser.G3TermEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G3Resta}
	 * labeled alternative in {@link G3Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG3Resta(G3Parser.G3RestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G3Resta}
	 * labeled alternative in {@link G3Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG3Resta(G3Parser.G3RestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G3TermT}
	 * labeled alternative in {@link G3Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG3TermT(G3Parser.G3TermTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G3TermT}
	 * labeled alternative in {@link G3Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG3TermT(G3Parser.G3TermTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G3Suma}
	 * labeled alternative in {@link G3Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG3Suma(G3Parser.G3SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G3Suma}
	 * labeled alternative in {@link G3Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG3Suma(G3Parser.G3SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G3Paren}
	 * labeled alternative in {@link G3Parser#f}.
	 * @param ctx the parse tree
	 */
	void enterG3Paren(G3Parser.G3ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G3Paren}
	 * labeled alternative in {@link G3Parser#f}.
	 * @param ctx the parse tree
	 */
	void exitG3Paren(G3Parser.G3ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G3Num}
	 * labeled alternative in {@link G3Parser#f}.
	 * @param ctx the parse tree
	 */
	void enterG3Num(G3Parser.G3NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G3Num}
	 * labeled alternative in {@link G3Parser#f}.
	 * @param ctx the parse tree
	 */
	void exitG3Num(G3Parser.G3NumContext ctx);
}