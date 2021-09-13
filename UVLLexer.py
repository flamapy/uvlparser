# Generated from UVL.g4 by ANTLR 4.9
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


from antlr_denter.DenterHelper import DenterHelper
from UVLParser import UVLParser



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30")
        buf.write("\u00f3\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3")
        buf.write("\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t")
        buf.write("\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f")
        buf.write("\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3")
        buf.write("\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\7\21")
        buf.write("o\n\21\f\21\16\21r\13\21\5\21t\n\21\3\22\3\22\3\22\3\22")
        buf.write("\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22")
        buf.write("\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22")
        buf.write("\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0099")
        buf.write("\n\22\3\22\3\22\5\22\u009d\n\22\3\22\5\22\u00a0\n\22\3")
        buf.write("\23\3\23\7\23\u00a4\n\23\f\23\16\23\u00a7\13\23\3\24\3")
        buf.write("\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b2\n\24")
        buf.write("\3\25\3\25\3\25\7\25\u00b7\n\25\f\25\16\25\u00ba\13\25")
        buf.write("\3\25\3\25\6\25\u00be\n\25\r\25\16\25\u00bf\5\25\u00c2")
        buf.write("\n\25\5\25\u00c4\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u00cb")
        buf.write("\n\26\3\26\5\26\u00ce\n\26\7\26\u00d0\n\26\f\26\16\26")
        buf.write("\u00d3\13\26\3\26\3\26\3\27\5\27\u00d8\n\27\3\27\3\27")
        buf.write("\7\27\u00dc\n\27\f\27\16\27\u00df\13\27\3\27\5\27\u00e2")
        buf.write("\n\27\3\27\3\27\7\27\u00e6\n\27\f\27\16\27\u00e9\13\27")
        buf.write("\5\27\u00eb\n\27\3\30\6\30\u00ee\n\30\r\30\16\30\u00ef")
        buf.write("\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23")
        buf.write("\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\22%\23\'\24")
        buf.write(")\25+\26-\27/\30\3\2\7\3\2\63;\3\2\62;\4\2C\\c|\6\2\62")
        buf.write(";C\\aac|\3\2\"\"\2\u010a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3")
        buf.write("\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2")
        buf.write("\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2")
        buf.write("\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2")
        buf.write("#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2")
        buf.write("\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5:\3\2\2\2\7<\3\2")
        buf.write("\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21")
        buf.write("G\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2")
        buf.write("\2\2\33\\\3\2\2\2\35`\3\2\2\2\37h\3\2\2\2!s\3\2\2\2#\u009f")
        buf.write("\3\2\2\2%\u00a1\3\2\2\2\'\u00b1\3\2\2\2)\u00c3\3\2\2\2")
        buf.write("+\u00c5\3\2\2\2-\u00ea\3\2\2\2/\u00ed\3\2\2\2\61\62\7")
        buf.write("h\2\2\62\63\7g\2\2\63\64\7c\2\2\64\65\7v\2\2\65\66\7w")
        buf.write("\2\2\66\67\7t\2\2\678\7g\2\289\7u\2\29\4\3\2\2\2:;\7\60")
        buf.write("\2\2;\6\3\2\2\2<=\7}\2\2=>\7\177\2\2>\b\3\2\2\2?@\7}\2")
        buf.write("\2@\n\3\2\2\2AB\7.\2\2B\f\3\2\2\2CD\7\177\2\2D\16\3\2")
        buf.write("\2\2EF\7$\2\2F\20\3\2\2\2GH\7e\2\2HI\7q\2\2IJ\7p\2\2J")
        buf.write("K\7u\2\2KL\7v\2\2LM\7t\2\2MN\7c\2\2NO\7k\2\2OP\7p\2\2")
        buf.write("PQ\7v\2\2QR\7u\2\2R\22\3\2\2\2ST\7#\2\2T\24\3\2\2\2UV")
        buf.write("\7(\2\2V\26\3\2\2\2WX\7~\2\2X\30\3\2\2\2YZ\7?\2\2Z[\7")
        buf.write("@\2\2[\32\3\2\2\2\\]\7>\2\2]^\7?\2\2^_\7@\2\2_\34\3\2")
        buf.write("\2\2`a\7k\2\2ab\7o\2\2bc\7r\2\2cd\7q\2\2de\7t\2\2ef\7")
        buf.write("v\2\2fg\7u\2\2g\36\3\2\2\2hi\7c\2\2ij\7u\2\2j \3\2\2\2")
        buf.write("kt\7\62\2\2lp\t\2\2\2mo\t\3\2\2nm\3\2\2\2or\3\2\2\2pn")
        buf.write("\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2sk\3\2\2\2sl\3\2")
        buf.write("\2\2t\"\3\2\2\2uv\7c\2\2vw\7n\2\2wx\7v\2\2xy\7g\2\2yz")
        buf.write("\7t\2\2z{\7p\2\2{|\7c\2\2|}\7v\2\2}~\7k\2\2~\177\7x\2")
        buf.write("\2\177\u00a0\7g\2\2\u0080\u0081\7q\2\2\u0081\u00a0\7t")
        buf.write("\2\2\u0082\u0083\7q\2\2\u0083\u0084\7r\2\2\u0084\u0085")
        buf.write("\7v\2\2\u0085\u0086\7k\2\2\u0086\u0087\7q\2\2\u0087\u0088")
        buf.write("\7p\2\2\u0088\u0089\7c\2\2\u0089\u00a0\7n\2\2\u008a\u008b")
        buf.write("\7o\2\2\u008b\u008c\7c\2\2\u008c\u008d\7p\2\2\u008d\u008e")
        buf.write("\7f\2\2\u008e\u008f\7c\2\2\u008f\u0090\7v\2\2\u0090\u0091")
        buf.write("\7q\2\2\u0091\u0092\7t\2\2\u0092\u00a0\7{\2\2\u0093\u0098")
        buf.write("\7]\2\2\u0094\u0095\5!\21\2\u0095\u0096\7\60\2\2\u0096")
        buf.write("\u0097\7\60\2\2\u0097\u0099\3\2\2\2\u0098\u0094\3\2\2")
        buf.write("\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009d")
        buf.write("\5!\21\2\u009b\u009d\7,\2\2\u009c\u009a\3\2\2\2\u009c")
        buf.write("\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\7_\2\2")
        buf.write("\u009fu\3\2\2\2\u009f\u0080\3\2\2\2\u009f\u0082\3\2\2")
        buf.write("\2\u009f\u008a\3\2\2\2\u009f\u0093\3\2\2\2\u00a0$\3\2")
        buf.write("\2\2\u00a1\u00a5\t\4\2\2\u00a2\u00a4\t\5\2\2\u00a3\u00a2")
        buf.write("\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5")
        buf.write("\u00a6\3\2\2\2\u00a6&\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8")
        buf.write("\u00a9\7v\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7w\2\2\u00ab")
        buf.write("\u00b2\7g\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7c\2\2\u00ae")
        buf.write("\u00af\7n\2\2\u00af\u00b0\7u\2\2\u00b0\u00b2\7g\2\2\u00b1")
        buf.write("\u00a8\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b2(\3\2\2\2\u00b3")
        buf.write("\u00c4\7\62\2\2\u00b4\u00b8\t\2\2\2\u00b5\u00b7\t\3\2")
        buf.write("\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6")
        buf.write("\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c1\3\2\2\2\u00ba")
        buf.write("\u00b8\3\2\2\2\u00bb\u00bd\7\60\2\2\u00bc\u00be\t\3\2")
        buf.write("\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd")
        buf.write("\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1")
        buf.write("\u00bb\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2")
        buf.write("\u00c3\u00b3\3\2\2\2\u00c3\u00b4\3\2\2\2\u00c4*\3\2\2")
        buf.write("\2\u00c5\u00d1\7]\2\2\u00c6\u00cb\5\'\24\2\u00c7\u00cb")
        buf.write("\5)\25\2\u00c8\u00cb\5%\23\2\u00c9\u00cb\5+\26\2\u00ca")
        buf.write("\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2")
        buf.write("\u00ca\u00c9\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\7")
        buf.write(".\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0")
        buf.write("\3\2\2\2\u00cf\u00ca\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1")
        buf.write("\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2")
        buf.write("\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7_\2\2\u00d5,\3\2\2\2")
        buf.write("\u00d6\u00d8\7\17\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8")
        buf.write("\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dd\7\f\2\2\u00da")
        buf.write("\u00dc\7\"\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2")
        buf.write("\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00eb\3")
        buf.write("\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\7\17\2\2\u00e1")
        buf.write("\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2")
        buf.write("\u00e3\u00e7\7\f\2\2\u00e4\u00e6\7\13\2\2\u00e5\u00e4")
        buf.write("\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7")
        buf.write("\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2")
        buf.write("\u00ea\u00d7\3\2\2\2\u00ea\u00e1\3\2\2\2\u00eb.\3\2\2")
        buf.write("\2\u00ec\u00ee\t\6\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef")
        buf.write("\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0")
        buf.write("\u00f1\3\2\2\2\u00f1\u00f2\b\30\2\2\u00f2\60\3\2\2\2\27")
        buf.write("\2ps\u0098\u009c\u009f\u00a5\u00b1\u00b8\u00bf\u00c1\u00c3")
        buf.write("\u00ca\u00cd\u00d1\u00d7\u00dd\u00e1\u00e7\u00ea\u00ef")
        buf.write("\3\b\2\2")
        return buf.getvalue()


class UVLLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    T__8 = 9
    T__9 = 10
    T__10 = 11
    T__11 = 12
    T__12 = 13
    T__13 = 14
    T__14 = 15
    RELATION_WORD = 16
    WORD = 17
    BOOLEAN = 18
    NUMBER = 19
    VECTOR = 20
    NL = 21
    WS = 22

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'features'", "'.'", "'{}'", "'{'", "','", "'}'", "'\"'", "'constraints'", 
            "'!'", "'&'", "'|'", "'=>'", "'<=>'", "'imports'", "'as'" ]

    symbolicNames = [ "<INVALID>",
            "RELATION_WORD", "WORD", "BOOLEAN", "NUMBER", "VECTOR", "NL", 
            "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "T__9", "T__10", "T__11", "T__12", "T__13", 
                  "T__14", "INT", "RELATION_WORD", "WORD", "BOOLEAN", "NUMBER", 
                  "VECTOR", "NL", "WS" ]

    grammarFileName = "UVL.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


    class UVLDenter(DenterHelper):
        def __init__(self, lexer, nl_token, indent_token, dedent_token, ignore_eof):
            super().__init__(nl_token, indent_token, dedent_token, ignore_eof)
            self.lexer: UVLLexer = lexer

        def pull_token(self):
            return super(UVLLexer, self.lexer).nextToken()

    denter = None

    def nextToken(self):
        if not self.denter:
            self.denter = self.UVLDenter(self, self.NL, UVLParser.INDENT, UVLParser.DEDENT, True)
        return self.denter.next_token()



