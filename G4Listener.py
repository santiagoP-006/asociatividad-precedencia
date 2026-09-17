# Generated from G4.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .G4Parser import G4Parser
else:
    from G4Parser import G4Parser

# This class defines a complete listener for a parse tree produced by G4Parser.
class G4Listener(ParseTreeListener):

    # Enter a parse tree produced by G4Parser#prog.
    def enterProg(self, ctx:G4Parser.ProgContext):
        pass

    # Exit a parse tree produced by G4Parser#prog.
    def exitProg(self, ctx:G4Parser.ProgContext):
        pass


    # Enter a parse tree produced by G4Parser#G4Mult.
    def enterG4Mult(self, ctx:G4Parser.G4MultContext):
        pass

    # Exit a parse tree produced by G4Parser#G4Mult.
    def exitG4Mult(self, ctx:G4Parser.G4MultContext):
        pass


    # Enter a parse tree produced by G4Parser#G4Div.
    def enterG4Div(self, ctx:G4Parser.G4DivContext):
        pass

    # Exit a parse tree produced by G4Parser#G4Div.
    def exitG4Div(self, ctx:G4Parser.G4DivContext):
        pass


    # Enter a parse tree produced by G4Parser#G4TermE.
    def enterG4TermE(self, ctx:G4Parser.G4TermEContext):
        pass

    # Exit a parse tree produced by G4Parser#G4TermE.
    def exitG4TermE(self, ctx:G4Parser.G4TermEContext):
        pass


    # Enter a parse tree produced by G4Parser#G4Suma.
    def enterG4Suma(self, ctx:G4Parser.G4SumaContext):
        pass

    # Exit a parse tree produced by G4Parser#G4Suma.
    def exitG4Suma(self, ctx:G4Parser.G4SumaContext):
        pass


    # Enter a parse tree produced by G4Parser#G4Resta.
    def enterG4Resta(self, ctx:G4Parser.G4RestaContext):
        pass

    # Exit a parse tree produced by G4Parser#G4Resta.
    def exitG4Resta(self, ctx:G4Parser.G4RestaContext):
        pass


    # Enter a parse tree produced by G4Parser#G4TermT.
    def enterG4TermT(self, ctx:G4Parser.G4TermTContext):
        pass

    # Exit a parse tree produced by G4Parser#G4TermT.
    def exitG4TermT(self, ctx:G4Parser.G4TermTContext):
        pass


    # Enter a parse tree produced by G4Parser#G4Paren.
    def enterG4Paren(self, ctx:G4Parser.G4ParenContext):
        pass

    # Exit a parse tree produced by G4Parser#G4Paren.
    def exitG4Paren(self, ctx:G4Parser.G4ParenContext):
        pass


    # Enter a parse tree produced by G4Parser#G4Num.
    def enterG4Num(self, ctx:G4Parser.G4NumContext):
        pass

    # Exit a parse tree produced by G4Parser#G4Num.
    def exitG4Num(self, ctx:G4Parser.G4NumContext):
        pass



del G4Parser