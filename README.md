# Taller — Gramáticas GIC con ANTLR4

Implementación de cuatro gramáticas libres de contexto (GIC) en ANTLR4 con
objetivo Python, que demuestran los efectos de la **asociatividad** y la
**precedencia de operadores** sobre el árbol de análisis sintáctico (AST).

Desarrollado para el curso de Lenguajes de Programación — Cohorte 2026-02.

---

## Estructura del repositorio

```
gic-taller/
│
├── G1.g4                  # Asoc. izquierda  / Prec. correcta  (*/ > +-)
├── G2.g4                  # Asoc. derecha    / Prec. correcta  (*/ > +-)
├── G3.g4                  # Asoc. izquierda  / Prec. invertida (+- > */)
├── G4.g4                  # Asoc. derecha    / Prec. invertida (+- > */)
│
├── main.py                # Script principal de pruebas (acepta/rechaza + árbol)
│
├── G1Lexer.py             # Archivos generados por ANTLR (no editar)
├── G1Parser.py
├── G2Lexer.py
├── G2Parser.py
├── G3Lexer.py
├── G3Parser.py
├── G4Lexer.py
├── G4Parser.py
│   ...
│
└── README.md
```

---

## Requisitos

### 1. Java Development Kit (JDK)

ANTLR4 corre sobre la JVM. Se necesita JDK 11 o superior.

```bash
sudo apt update
sudo apt install default-jdk -y
java -version
```

### 2. JAR de ANTLR4

```bash
cd ~
curl -O https://www.antlr.org/download/antlr-4.13.2-complete.jar
ls ~/antlr-4.13.2-complete.jar
```

### 3. Alias de ANTLR en `.bashrc`

Agrega estas tres líneas al final de `~/.bashrc` para poder usar `antlr4` y
`grun` como comandos directos:

```bash
echo 'export CLASSPATH=".:$HOME/antlr-4.13.2-complete.jar:$CLASSPATH"' >> ~/.bashrc
echo 'alias antlr4="java -jar $HOME/antlr-4.13.2-complete.jar"' >> ~/.bashrc
echo 'alias grun="java org.antlr.v4.gui.TestRig"' >> ~/.bashrc
source ~/.bashrc
```

Verifica que quedaron activos:

```bash
type antlr4
type grun
```

### 4. Python 3 y runtime de ANTLR4

```bash
python3 --version       # debe ser 3.8 o superior
pip install antlr4-python3-runtime==4.13.2 --break-system-packages
```

Verifica:

```bash
python3 -c "import antlr4; print(antlr4.__version__)"
```

---

## Descripción de las gramáticas

Todas las gramáticas reconocen expresiones aritméticas con los operadores
`+  -  *  /` y paréntesis `()`. La diferencia entre ellas está en cómo
estructuran la recursión, lo que determina **asociatividad** y **precedencia**.

| Gramática | Asociatividad | Precedencia | Efecto en `2 + 3 * 4` | Efecto en `2 - 3 - 4` |
|-----------|--------------|-------------|----------------------|----------------------|
| G1 | Izquierda | `*/ > +-` (correcta) | `2 + (3*4) = 14` | `(2-3)-4 = -5` |
| G2 | Derecha | `*/ > +-` (correcta) | `2 + (3*4) = 14` | `2-(3-4) = 3` |
| G3 | Izquierda | `+- > */` (invertida) | `(2+3)*4 = 20` | `(2-3)-4 = -5` |
| G4 | Derecha | `+- > */` (invertida) | `(2+3)*4 = 20` | `2-(3-4) = 3` |

**Nota:** los valores numéricos en la tabla son los que resultarían si el árbol
se evaluara — el script solo verifica aceptación/rechazo y muestra el árbol,
no evalúa numéricamente.

### Principio de funcionamiento

- **Asociatividad** la determina el lado de la recursión:
  - `e '+' t` → recursión a la **izquierda** → `(2-3)-4`
  - `t '+' e` → recursión a la **derecha** → `2-(3-4)`

- **Precedencia** la determina la **jerarquía de reglas**:
  - Si `t` (que maneja `*/`) está *debajo* de `e` (que maneja `+-`), entonces
    `*/` tiene mayor precedencia — se resuelve primero en el árbol.
  - Intercambiar qué regla maneja qué operadores invierte la precedencia.

---

## Generación de los parsers

Si los archivos Python (`G1Lexer.py`, `G1Parser.py`, etc.) no están en el
repositorio o quieres regenerarlos desde los `.g4`:

```bash
cd ~/gic-taller

# Generar parsers en Python (para main.py)
antlr4 -Dlanguage=Python3 G1.g4
antlr4 -Dlanguage=Python3 G2.g4
antlr4 -Dlanguage=Python3 G3.g4
antlr4 -Dlanguage=Python3 G4.g4

# Generar parsers en Java (para grun y árbol gráfico)
antlr4 G1.g4 && javac G1*.java
antlr4 G2.g4 && javac G2*.java
antlr4 G3.g4 && javac G3*.java
antlr4 G4.g4 && javac G4*.java
```

---

## Cómo correr las pruebas

### Prueba principal — todas las gramáticas a la vez

```bash
cd ~/gic-taller
python3 main.py
```

El script corre tres cadenas de prueba sobre las cuatro gramáticas y muestra
para cada una: el estado (`ACEPTADA` / `RECHAZADA`) y el árbol en notación
LISP (`toStringTree`).

Cadenas de prueba incluidas:

| Cadena | Qué demuestra |
|--------|--------------|
| `2 - 3 - 4` | Asociatividad izquierda vs derecha |
| `2 + 3 * 4` | Precedencia correcta vs invertida |
| `2 * (3 + 4)` | Paréntesis — deben funcionar igual en todas |

### Prueba con cadena personalizada

Puedes pasar cualquier expresión como argumento:

```bash
python3 main.py "5 + 2 * 3 - 1"
```

O desde un archivo:

```bash
echo "5 + 2 * 3 - 1" > entrada.txt
python3 main.py -f entrada.txt
```

---

## Árbol gráfico con `grun`

Para visualizar el AST de forma gráfica (requiere entorno de escritorio o
servidor X11):

```bash
# Prueba de asociatividad
echo "2 - 3 - 4" | grun G1 prog -gui   # izquierda
echo "2 - 3 - 4" | grun G2 prog -gui   # derecha

# Prueba de precedencia
echo "2 + 3 * 4" | grun G1 prog -gui   # correcta
echo "2 + 3 * 4" | grun G3 prog -gui   # invertida
```

Si no hay entorno gráfico disponible, usa `-tree` para ver el árbol en texto:

```bash
echo "2 - 3 - 4" | grun G1 prog -tree
echo "2 - 3 - 4" | grun G2 prog -tree
echo "2 + 3 * 4" | grun G1 prog -tree
echo "2 + 3 * 4" | grun G3 prog -tree
```

---

## Resultados esperados

### Prueba 1 — Asociatividad (`2 - 3 - 4`)

```
[G1] Asoc.Izquierda  / Prec.Correcta
     Árbol: (prog (e (e (e 2) - (t 3)) - (t 4)) <EOF>)
            → agrupa como (2-3)-4   ✔ asociatividad izquierda

[G2] Asoc.Derecha    / Prec.Correcta
     Árbol: (prog (e (t 2) - (e (t 3) - (e (t 4)))) <EOF>)
            → agrupa como 2-(3-4)   ✔ asociatividad derecha
```

### Prueba 2 — Precedencia (`2 + 3 * 4`)

```
[G1] Asoc.Izquierda  / Prec.Correcta
     Árbol: (prog (e (e (t (t (f 2))) + (t (t (f 3)) * (f 4)))) <EOF>)
            → * queda más profundo → se resuelve primero → 2+(3*4)  ✔

[G3] Asoc.Izquierda  / Prec.Invertida
     Árbol: (prog (e (e (t (t (f 2)) + (f 3))) * (t (f 4))) <EOF>)
            → + queda más profundo → se resuelve primero → (2+3)*4  ✔
```

### Prueba 3 — Paréntesis (`2 * (3 + 4)`)

```
Todas las gramáticas: ACEPTADA
Los paréntesis fuerzan la agrupación independientemente de la gramática.
```

---

## Conceptos clave

**Gramática Libre de Contexto (GIC / CFG)**
Gramática formal donde cada producción tiene exactamente un no-terminal en el
lado izquierdo. Son la base teórica de los parsers para lenguajes de
programación.

**Asociatividad**
Define cómo se agrupan operadores del mismo nivel cuando aparecen en secuencia.
La recursión izquierda (`E → E op T`) produce asociatividad izquierda;
la recursión derecha (`E → T op E`) produce asociatividad derecha.

**Precedencia**
Define qué operadores se evalúan primero. En una gramática por niveles, el
operador cuya regla queda *más profunda* en la jerarquía tiene *mayor*
precedencia — aparece más abajo en el árbol y por tanto se "resuelve primero".

**AST (Abstract Syntax Tree)**
Árbol de derivación que representa la estructura sintáctica de una expresión.
La forma del árbol determina el orden de evaluación.

---

## Herramientas utilizadas

| Herramienta | Versión | Uso |
|-------------|---------|-----|
| ANTLR4 | 4.13.2 | Generador de parsers |
| Python | 3.x | Lenguaje objetivo del parser |
| antlr4-python3-runtime | 4.13.2 | Runtime de ANTLR para Python |
| Java JDK | 11+ | Requerido por ANTLR y `grun` |
| `grun` (TestRig) | incluido en JAR | Visualización de árboles |

---

## Referencias

- [Documentación oficial ANTLR4](https://www.antlr.org/)
- [The Definitive ANTLR4 Reference — Terence Parr](https://pragprog.com/titles/tpantlr2/the-definitive-antlr-4-reference/)
- [antlr4-python3-runtime en PyPI](https://pypi.org/project/antlr4-python3-runtime/)
