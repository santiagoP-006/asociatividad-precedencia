# Generated from G1.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .G1Parser import G1Parser
else:
    from G1Parser import G1Parser

# This class defines a complete listener for a parse tree produced by G1Parser.
class G1Listener(ParseTreeListener):

    # Enter a parse tree produced by G1Parser#prog.
    def enterProg(self, ctx:G1Parser.ProgContext):
        pass

    # Exit a parse tree produced by G1Parser#prog.
    def exitProg(self, ctx:G1Parser.ProgContext):
        pass


    # Enter a parse tree produced by G1Parser#G1Suma.
    def enterG1Suma(self, ctx:G1Parser.G1SumaContext):
        pass

    # Exit a parse tree produced by G1Parser#G1Suma.
    def exitG1Suma(self, ctx:G1Parser.G1SumaContext):
        pass


    # Enter a parse tree produced by G1Parser#G1TermE.
    def enterG1TermE(self, ctx:G1Parser.G1TermEContext):
        pass

    # Exit a parse tree produced by G1Parser#G1TermE.
    def exitG1TermE(self, ctx:G1Parser.G1TermEContext):
        pass


    # Enter a parse tree produced by G1Parser#G1Resta.
    def enterG1Resta(self, ctx:G1Parser.G1RestaContext):
        pass

    # Exit a parse tree produced by G1Parser#G1Resta.
    def exitG1Resta(self, ctx:G1Parser.G1RestaContext):
        pass


    # Enter a parse tree produced by G1Parser#G1Mult.
    def enterG1Mult(self, ctx:G1Parser.G1MultContext):
        pass

    # Exit a parse tree produced by G1Parser#G1Mult.
    def exitG1Mult(self, ctx:G1Parser.G1MultContext):
        pass


    # Enter a parse tree produced by G1Parser#G1Div.
    def enterG1Div(self, ctx:G1Parser.G1DivContext):
        pass

    # Exit a parse tree produced by G1Parser#G1Div.
    def exitG1Div(self, ctx:G1Parser.G1DivContext):
        pass


    # Enter a parse tree produced by G1Parser#G1TermT.
    def enterG1TermT(self, ctx:G1Parser.G1TermTContext):
        pass

    # Exit a parse tree produced by G1Parser#G1TermT.
    def exitG1TermT(self, ctx:G1Parser.G1TermTContext):
        pass


    # Enter a parse tree produced by G1Parser#G1Paren.
    def enterG1Paren(self, ctx:G1Parser.G1ParenContext):
        pass

    # Exit a parse tree produced by G1Parser#G1Paren.
    def exitG1Paren(self, ctx:G1Parser.G1ParenContext):
        pass


    # Enter a parse tree produced by G1Parser#G1Num.
    def enterG1Num(self, ctx:G1Parser.G1NumContext):
        pass

    # Exit a parse tree produced by G1Parser#G1Num.
    def exitG1Num(self, ctx:G1Parser.G1NumContext):
        pass



del G1Parser