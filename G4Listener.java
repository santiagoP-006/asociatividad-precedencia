// Generated from G4.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link G4Parser}.
 */
public interface G4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link G4Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(G4Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link G4Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(G4Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G4Mult}
	 * labeled alternative in {@link G4Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG4Mult(G4Parser.G4MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G4Mult}
	 * labeled alternative in {@link G4Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG4Mult(G4Parser.G4MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G4Div}
	 * labeled alternative in {@link G4Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG4Div(G4Parser.G4DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G4Div}
	 * labeled alternative in {@link G4Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG4Div(G4Parser.G4DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G4TermE}
	 * labeled alternative in {@link G4Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterG4TermE(G4Parser.G4TermEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G4TermE}
	 * labeled alternative in {@link G4Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitG4TermE(G4Parser.G4TermEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G4Suma}
	 * labeled alternative in {@link G4Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG4Suma(G4Parser.G4SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G4Suma}
	 * labeled alternative in {@link G4Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG4Suma(G4Parser.G4SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G4Resta}
	 * labeled alternative in {@link G4Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG4Resta(G4Parser.G4RestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G4Resta}
	 * labeled alternative in {@link G4Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG4Resta(G4Parser.G4RestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G4TermT}
	 * labeled alternative in {@link G4Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterG4TermT(G4Parser.G4TermTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G4TermT}
	 * labeled alternative in {@link G4Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitG4TermT(G4Parser.G4TermTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G4Paren}
	 * labeled alternative in {@link G4Parser#f}.
	 * @param ctx the parse tree
	 */
	void enterG4Paren(G4Parser.G4ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G4Paren}
	 * labeled alternative in {@link G4Parser#f}.
	 * @param ctx the parse tree
	 */
	void exitG4Paren(G4Parser.G4ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G4Num}
	 * labeled alternative in {@link G4Parser#f}.
	 * @param ctx the parse tree
	 */
	void enterG4Num(G4Parser.G4NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G4Num}
	 * labeled alternative in {@link G4Parser#f}.
	 * @param ctx the parse tree
	 */
	void exitG4Num(G4Parser.G4NumContext ctx);
}