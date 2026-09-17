grammar G4;

prog : e EOF ;

e   : t '*' e   # G4Mult
    | t '/' e   # G4Div
    | t         # G4TermE
    ;

t   : f '+' t   # G4Suma
    | f '-' t   # G4Resta
    | f         # G4TermT
    ;

f   : '(' e ')' # G4Paren
    | NUM       # G4Num
    ;

NUM : [0-9]+ ('.' [0-9]+)? ;
WS  : [ \t\r\n]+ -> skip ;
