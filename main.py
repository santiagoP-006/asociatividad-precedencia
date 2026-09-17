import sys
from antlr4 import InputStream, CommonTokenStream
from antlr4.error.ErrorListener import ErrorListener
from G1Lexer import G1Lexer
from G1Parser import G1Parser
from G2Lexer import G2Lexer
from G2Parser import G2Parser
from G3Lexer import G3Lexer
from G3Parser import G3Parser
from G4Lexer import G4Lexer
from G4Parser import G4Parser

GRAMATICAS = {
    "G1": (G1Lexer, G1Parser, "Asoc.Izquierda  / Prec.Correcta  (*/ > +-)"),
    "G2": (G2Lexer, G2Parser, "Asoc.Derecha    / Prec.Correcta  (*/ > +-)"),
    "G3": (G3Lexer, G3Parser, "Asoc.Izquierda  / Prec.Invertida (+- > */)"),
    "G4": (G4Lexer, G4Parser, "Asoc.Derecha    / Prec.Invertida (+- > */)"),
}

class ContadorErrores(ErrorListener):
    def __init__(self):
        super().__init__()
        self.errores = 0

    def syntaxError(self, recognizer, offendingSymbol,
                    line, column, msg, e):
        self.errores += 1
        print(f"    [ERROR] línea {line}, col {column}: {msg}")

def probar(texto, nombre, LexerClass, ParserClass, descripcion):
    entrada = InputStream(texto)
    lexer = LexerClass(entrada)
    tokens = CommonTokenStream(lexer)
    parser = ParserClass(tokens)
    parser.removeErrorListeners()
    listener = ContadorErrores()
    parser.addErrorListener(listener)
    arbol = parser.prog()

    estado = "ACEPTADA" if listener.errores == 0 else "RECHAZADA"
    print(f"  [{nombre}] {descripcion}")
    print(f"    Entrada : '{texto}'")
    print(f"    Estado  : {estado}")
    print(f"    Árbol   : {arbol.toStringTree(recog=parser)}")
    print()

def main():
    # Prueba 1: Asociatividad — misma cadena con operador repetido
    print("=" * 60)
    print("PRUEBA 1: ASOCIATIVIDAD (2 - 3 - 4)")
    print("  Izquierda correcta: (2-3)-4 = -5")
    print("  Derecha:             2-(3-4) = 3")
    print("=" * 60)
    cadena_asoc = "2 - 3 - 4"
    for nombre, (Lex, Par, desc) in GRAMATICAS.items():
        probar(cadena_asoc, nombre, Lex, Par, desc)

    # Prueba 2: Precedencia — mezcla de + y *
    print("=" * 60)
    print("PRUEBA 2: PRECEDENCIA (2 + 3 * 4)")
    print("  Prec. correcta  (*/ > +-): 2+(3*4) = 14")
    print("  Prec. invertida (+- > */): (2+3)*4 = 20")
    print("=" * 60)
    cadena_prec = "2 + 3 * 4"
    for nombre, (Lex, Par, desc) in GRAMATICAS.items():
        probar(cadena_prec, nombre, Lex, Par, desc)

    # Prueba 3: Paréntesis (deben funcionar igual en todas)
    print("=" * 60)
    print("PRUEBA 3: PARÉNTESIS (2 * (3 + 4))")
    print("  Todas las gramáticas deben aceptar y agrupar igual")
    print("=" * 60)
    cadena_paren = "2 * (3 + 4)"
    for nombre, (Lex, Par, desc) in GRAMATICAS.items():
        probar(cadena_paren, nombre, Lex, Par, desc)

if __name__ == '__main__':
    main()
