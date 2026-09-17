# Generated from G4.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,8,41,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,1,0,1,0,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,3,1,21,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,2,3,2,32,8,2,1,3,1,3,1,3,1,3,1,3,3,3,39,8,3,1,3,0,0,4,0,2,4,
        6,0,0,41,0,8,1,0,0,0,2,20,1,0,0,0,4,31,1,0,0,0,6,38,1,0,0,0,8,9,
        3,2,1,0,9,10,5,0,0,1,10,1,1,0,0,0,11,12,3,4,2,0,12,13,5,1,0,0,13,
        14,3,2,1,0,14,21,1,0,0,0,15,16,3,4,2,0,16,17,5,2,0,0,17,18,3,2,1,
        0,18,21,1,0,0,0,19,21,3,4,2,0,20,11,1,0,0,0,20,15,1,0,0,0,20,19,
        1,0,0,0,21,3,1,0,0,0,22,23,3,6,3,0,23,24,5,3,0,0,24,25,3,4,2,0,25,
        32,1,0,0,0,26,27,3,6,3,0,27,28,5,4,0,0,28,29,3,4,2,0,29,32,1,0,0,
        0,30,32,3,6,3,0,31,22,1,0,0,0,31,26,1,0,0,0,31,30,1,0,0,0,32,5,1,
        0,0,0,33,34,5,5,0,0,34,35,3,2,1,0,35,36,5,6,0,0,36,39,1,0,0,0,37,
        39,5,7,0,0,38,33,1,0,0,0,38,37,1,0,0,0,39,7,1,0,0,0,3,20,31,38
    ]

class G4Parser ( Parser ):

    grammarFileName = "G4.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'*'", "'/'", "'+'", "'-'", "'('", "')'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "NUM", "WS" ]

    RULE_prog = 0
    RULE_e = 1
    RULE_t = 2
    RULE_f = 3

    ruleNames =  [ "prog", "e", "t", "f" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    NUM=7
    WS=8

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def e(self):
            return self.getTypedRuleContext(G4Parser.EContext,0)


        def EOF(self):
            return self.getToken(G4Parser.EOF, 0)

        def getRuleIndex(self):
            return G4Parser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)




    def prog(self):

        localctx = G4Parser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 8
            self.e()
            self.state = 9
            self.match(G4Parser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return G4Parser.RULE_e

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class G4MultContext(EContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a G4Parser.EContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def t(self):
            return self.getTypedRuleContext(G4Parser.TContext,0)

        def e(self):
            return self.getTypedRuleContext(G4Parser.EContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterG4Mult" ):
                listener.enterG4Mult(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitG4Mult" ):
                listener.exitG4Mult(self)


    class G4DivContext(EContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a G4Parser.EContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def t(self):
            return self.getTypedRuleContext(G4Parser.TContext,0)

        def e(self):
            return self.getTypedRuleContext(G4Parser.EContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterG4Div" ):
                listener.enterG4Div(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitG4Div" ):
                listener.exitG4Div(self)


    class G4TermEContext(EContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a G4Parser.EContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def t(self):
            return self.getTypedRuleContext(G4Parser.TContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterG4TermE" ):
                listener.enterG4TermE(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitG4TermE" ):
                listener.exitG4TermE(self)



    def e(self):

        localctx = G4Parser.EContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_e)
        try:
            self.state = 20
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
            if la_ == 1:
                localctx = G4Parser.G4MultContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 11
                self.t()
                self.state = 12
                self.match(G4Parser.T__0)
                self.state = 13
                self.e()
                pass

            elif la_ == 2:
                localctx = G4Parser.G4DivContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 15
                self.t()
                self.state = 16
                self.match(G4Parser.T__1)
                self.state = 17
                self.e()
                pass

            elif la_ == 3:
                localctx = G4Parser.G4TermEContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 19
                self.t()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return G4Parser.RULE_t

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class G4RestaContext(TContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a G4Parser.TContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def f(self):
            return self.getTypedRuleContext(G4Parser.FContext,0)

        def t(self):
            return self.getTypedRuleContext(G4Parser.TContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterG4Resta" ):
                listener.enterG4Resta(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitG4Resta" ):
                listener.exitG4Resta(self)


    class G4TermTContext(TContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a G4Parser.TContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def f(self):
            return self.getTypedRuleContext(G4Parser.FContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterG4TermT" ):
                listener.enterG4TermT(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitG4TermT" ):
                listener.exitG4TermT(self)


    class G4SumaContext(TContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a G4Parser.TContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def f(self):
            return self.getTypedRuleContext(G4Parser.FContext,0)

        def t(self):
            return self.getTypedRuleContext(G4Parser.TContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterG4Suma" ):
                listener.enterG4Suma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitG4Suma" ):
                listener.exitG4Suma(self)



    def t(self):

        localctx = G4Parser.TContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_t)
        try:
            self.state = 31
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                localctx = G4Parser.G4SumaContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 22
                self.f()
                self.state = 23
                self.match(G4Parser.T__2)
                self.state = 24
                self.t()
                pass

            elif la_ == 2:
                localctx = G4Parser.G4RestaContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 26
                self.f()
                self.state = 27
                self.match(G4Parser.T__3)
                self.state = 28
                self.t()
                pass

            elif la_ == 3:
                localctx = G4Parser.G4TermTContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 30
                self.f()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return G4Parser.RULE_f

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class G4ParenContext(FContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a G4Parser.FContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def e(self):
            return self.getTypedRuleContext(G4Parser.EContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterG4Paren" ):
                listener.enterG4Paren(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitG4Paren" ):
                listener.exitG4Paren(self)


    class G4NumContext(FContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a G4Parser.FContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUM(self):
            return self.getToken(G4Parser.NUM, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterG4Num" ):
                listener.enterG4Num(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitG4Num" ):
                listener.exitG4Num(self)



    def f(self):

        localctx = G4Parser.FContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_f)
        try:
            self.state = 38
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5]:
                localctx = G4Parser.G4ParenContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 33
                self.match(G4Parser.T__4)
                self.state = 34
                self.e()
                self.state = 35
                self.match(G4Parser.T__5)
                pass
            elif token in [7]:
                localctx = G4Parser.G4NumContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 37
                self.match(G4Parser.NUM)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





