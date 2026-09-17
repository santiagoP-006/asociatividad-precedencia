// Generated from G1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link G1Parser}.
 */
public interface G1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link G1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(G1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link G1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(G1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G1Suma}
	 * labeled alternative in {@link G1Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG1Suma(G1Parser.G1SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G1Suma}
	 * labeled alternative in {@link G1Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG1Suma(G1Parser.G1SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G1TermE}
	 * labeled alternative in {@link G1Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG1TermE(G1Parser.G1TermEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G1TermE}
	 * labeled alternative in {@link G1Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG1TermE(G1Parser.G1TermEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G1Resta}
	 * labeled alternative in {@link G1Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG1Resta(G1Parser.G1RestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G1Resta}
	 * labeled alternative in {@link G1Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG1Resta(G1Parser.G1RestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G1Mult}
	 * labeled alternative in {@link G1Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG1Mult(G1Parser.G1MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G1Mult}
	 * labeled alternative in {@link G1Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG1Mult(G1Parser.G1MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G1Div}
	 * labeled alternative in {@link G1Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG1Div(G1Parser.G1DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G1Div}
	 * labeled alternative in {@link G1Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG1Div(G1Parser.G1DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G1TermT}
	 * labeled alternative in {@link G1Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG1TermT(G1Parser.G1TermTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G1TermT}
	 * labeled alternative in {@link G1Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG1TermT(G1Parser.G1TermTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G1Paren}
	 * labeled alternative in {@link G1Parser#f}.
	 * @param ctx the parse tree
	 */
	void enterG1Paren(G1Parser.G1ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G1Paren}
	 * labeled alternative in {@link G1Parser#f}.
	 * @param ctx the parse tree
	 */
	void exitG1Paren(G1Parser.G1ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G1Num}
	 * labeled alternative in {@link G1Parser#f}.
	 * @param ctx the parse tree
	 */
	void enterG1Num(G1Parser.G1NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G1Num}
	 * labeled alternative in {@link G1Parser#f}.
	 * @param ctx the parse tree
	 */
	void exitG1Num(G1Parser.G1NumContext ctx);
}