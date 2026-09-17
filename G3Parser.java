// Generated from G3.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class G3Parser extends Parser {
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
	public String getGrammarFileName() { return "G3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public G3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode EOF() { return getToken(G3Parser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			e(0);
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
	public static class G3DivContext extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public G3DivContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).enterG3Div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).exitG3Div(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G3MultContext extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public G3MultContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).enterG3Mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).exitG3Mult(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G3TermEContext extends EContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public G3TermEContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).enterG3TermE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).exitG3TermE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new G3TermEContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(12);
			t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(22);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(20);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new G3MultContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(14);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(15);
						match(T__0);
						setState(16);
						t(0);
						}
						break;
					case 2:
						{
						_localctx = new G3DivContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(17);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(18);
						match(T__1);
						setState(19);
						t(0);
						}
						break;
					}
					} 
				}
				setState(24);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
	public static class G3RestaContext extends TContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public G3RestaContext(TContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).enterG3Resta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).exitG3Resta(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G3TermTContext extends TContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public G3TermTContext(TContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).enterG3TermT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).exitG3TermT(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G3SumaContext extends TContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public G3SumaContext(TContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).enterG3Suma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).exitG3Suma(this);
		}
	}

	public final TContext t() throws RecognitionException {
		return t(0);
	}

	private TContext t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TContext _localctx = new TContext(_ctx, _parentState);
		TContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new G3TermTContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(26);
			f();
			}
			_ctx.stop = _input.LT(-1);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(34);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new G3SumaContext(new TContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t);
						setState(28);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(29);
						match(T__2);
						setState(30);
						f();
						}
						break;
					case 2:
						{
						_localctx = new G3RestaContext(new TContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_t);
						setState(31);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(32);
						match(T__3);
						setState(33);
						f();
						}
						break;
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
	public static class G3ParenContext extends FContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public G3ParenContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).enterG3Paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).exitG3Paren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class G3NumContext extends FContext {
		public TerminalNode NUM() { return getToken(G3Parser.NUM, 0); }
		public G3NumContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).enterG3Num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof G3Listener ) ((G3Listener)listener).exitG3Num(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_f);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new G3ParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(T__4);
				setState(40);
				e(0);
				setState(41);
				match(T__5);
				}
				break;
			case NUM:
				_localctx = new G3NumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return e_sempred((EContext)_localctx, predIndex);
		case 2:
			return t_sempred((TContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean t_sempred(TContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b/\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0015\b\u0001\n"+
		"\u0001\f\u0001\u0018\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002#\b\u0002\n\u0002\f\u0002&\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003-\b\u0003\u0001\u0003\u0000"+
		"\u0002\u0002\u0004\u0004\u0000\u0002\u0004\u0006\u0000\u0000/\u0000\b"+
		"\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000\u0000\u0000\u0004\u0019"+
		"\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b\t\u0003\u0002"+
		"\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000"+
		"\u000b\f\u0006\u0001\uffff\uffff\u0000\f\r\u0003\u0004\u0002\u0000\r\u0016"+
		"\u0001\u0000\u0000\u0000\u000e\u000f\n\u0003\u0000\u0000\u000f\u0010\u0005"+
		"\u0001\u0000\u0000\u0010\u0015\u0003\u0004\u0002\u0000\u0011\u0012\n\u0002"+
		"\u0000\u0000\u0012\u0013\u0005\u0002\u0000\u0000\u0013\u0015\u0003\u0004"+
		"\u0002\u0000\u0014\u000e\u0001\u0000\u0000\u0000\u0014\u0011\u0001\u0000"+
		"\u0000\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0003\u0001\u0000"+
		"\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001a\u0006\u0002"+
		"\uffff\uffff\u0000\u001a\u001b\u0003\u0006\u0003\u0000\u001b$\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\n\u0003\u0000\u0000\u001d\u001e\u0005\u0003\u0000"+
		"\u0000\u001e#\u0003\u0006\u0003\u0000\u001f \n\u0002\u0000\u0000 !\u0005"+
		"\u0004\u0000\u0000!#\u0003\u0006\u0003\u0000\"\u001c\u0001\u0000\u0000"+
		"\u0000\"\u001f\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0005\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000\'(\u0005\u0005\u0000\u0000()\u0003\u0002"+
		"\u0001\u0000)*\u0005\u0006\u0000\u0000*-\u0001\u0000\u0000\u0000+-\u0005"+
		"\u0007\u0000\u0000,\'\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000"+
		"-\u0007\u0001\u0000\u0000\u0000\u0005\u0014\u0016\"$,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}