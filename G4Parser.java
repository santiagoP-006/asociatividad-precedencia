// Generated from G4.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class G4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUM=7, WS=8;
	public static final int
		RULE_prog = 0, RULE_e = 1, RULE_t = 2, RULE_f = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "e", "t", "f"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "G4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public G4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode EOF() { return getToken(G4Parser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			e();
			setState(9);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G4MultContext extends EContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public G4MultContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).enterG4Mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).exitG4Mult(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G4DivContext extends EContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public G4DivContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).enterG4Div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).exitG4Div(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G4TermEContext extends EContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public G4TermEContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).enterG4TermE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).exitG4TermE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_e);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new G4MultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				t();
				setState(12);
				match(T__0);
				setState(13);
				e();
				}
				break;
			case 2:
				_localctx = new G4DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				t();
				setState(16);
				match(T__1);
				setState(17);
				e();
				}
				break;
			case 3:
				_localctx = new G4TermEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				t();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TContext extends ParserRuleContext {
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
	 
		public TContext() { }
		public void copyFrom(TContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G4RestaContext extends TContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public G4RestaContext(TContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).enterG4Resta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).exitG4Resta(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G4TermTContext extends TContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public G4TermTContext(TContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).enterG4TermT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).exitG4TermT(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G4SumaContext extends TContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public G4SumaContext(TContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).enterG4Suma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).exitG4Suma(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_t);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new G4SumaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				f();
				setState(23);
				match(T__2);
				setState(24);
				t();
				}
				break;
			case 2:
				_localctx = new G4RestaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				f();
				setState(27);
				match(T__3);
				setState(28);
				t();
				}
				break;
			case 3:
				_localctx = new G4TermTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				f();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G4ParenContext extends FContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public G4ParenContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).enterG4Paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).exitG4Paren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G4NumContext extends FContext {
		public TerminalNode NUM() { return getToken(G4Parser.NUM, 0); }
		public G4NumContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).enterG4Num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G4Listener ) ((G4Listener)listener).exitG4Num(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_f);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new G4ParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(T__4);
				setState(34);
				e();
				setState(35);
				match(T__5);
				}
				break;
			case NUM:
				_localctx = new G4NumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b)\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001"+
		"\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0000)\u0000\b"+
		"\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u001f"+
		"\u0001\u0000\u0000\u0000\u0006&\u0001\u0000\u0000\u0000\b\t\u0003\u0002"+
		"\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000"+
		"\u000b\f\u0003\u0004\u0002\u0000\f\r\u0005\u0001\u0000\u0000\r\u000e\u0003"+
		"\u0002\u0001\u0000\u000e\u0015\u0001\u0000\u0000\u0000\u000f\u0010\u0003"+
		"\u0004\u0002\u0000\u0010\u0011\u0005\u0002\u0000\u0000\u0011\u0012\u0003"+
		"\u0002\u0001\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0015\u0003"+
		"\u0004\u0002\u0000\u0014\u000b\u0001\u0000\u0000\u0000\u0014\u000f\u0001"+
		"\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0003\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0003\u0006\u0003\u0000\u0017\u0018\u0005"+
		"\u0003\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019 \u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0003\u0006\u0003\u0000\u001b\u001c\u0005\u0004"+
		"\u0000\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d \u0001\u0000\u0000"+
		"\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u0016\u0001\u0000\u0000\u0000"+
		"\u001f\u001a\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" \u0005\u0001\u0000\u0000\u0000!\"\u0005\u0005\u0000\u0000\"#\u0003\u0002"+
		"\u0001\u0000#$\u0005\u0006\u0000\u0000$\'\u0001\u0000\u0000\u0000%\'\u0005"+
		"\u0007\u0000\u0000&!\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000"+
		"\'\u0007\u0001\u0000\u0000\u0000\u0003\u0014\u001f&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}