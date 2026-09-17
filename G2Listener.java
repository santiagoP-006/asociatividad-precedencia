// Generated from G2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link G2Parser}.
 */
public interface G2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link G2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(G2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link G2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(G2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G2Suma}
	 * labeled alternative in {@link G2Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG2Suma(G2Parser.G2SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G2Suma}
	 * labeled alternative in {@link G2Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG2Suma(G2Parser.G2SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G2Resta}
	 * labeled alternative in {@link G2Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG2Resta(G2Parser.G2RestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G2Resta}
	 * labeled alternative in {@link G2Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG2Resta(G2Parser.G2RestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G2TermE}
	 * labeled alternative in {@link G2Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG2TermE(G2Parser.G2TermEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G2TermE}
	 * labeled alternative in {@link G2Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG2TermE(G2Parser.G2TermEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G2Mult}
	 * labeled alternative in {@link G2Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG2Mult(G2Parser.G2MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G2Mult}
	 * labeled alternative in {@link G2Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG2Mult(G2Parser.G2MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G2Div}
	 * labeled alternative in {@link G2Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG2Div(G2Parser.G2DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G2Div}
	 * labeled alternative in {@link G2Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG2Div(G2Parser.G2DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G2TermT}
	 * labeled alternative in {@link G2Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG2TermT(G2Parser.G2TermTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G2TermT}
	 * labeled alternative in {@link G2Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG2TermT(G2Parser.G2TermTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G2Paren}
	 * labeled alternative in {@link G2Parser#f}.
	 * @param ctx the parse tree
	 */
	void enterG2Paren(G2Parser.G2ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G2Paren}
	 * labeled alternative in {@link G2Parser#f}.
	 * @param ctx the parse tree
	 */
	void exitG2Paren(G2Parser.G2ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G2Num}
	 * labeled alternative in {@link G2Parser#f}.
	 * @param ctx the parse tree
	 */
	void enterG2Num(G2Parser.G2NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G2Num}
	 * labeled alternative in {@link G2Parser#f}.
	 * @param ctx the parse tree
	 */
	void exitG2Num(G2Parser.G2NumContext ctx);
}