# Generated from UVL.g4 by ANTLR 4.9
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


from antlr_denter.DenterHelper import DenterHelper
from UVLParser import UVLParser



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31")
        buf.write("\u0104\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3")
        buf.write("\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3")
        buf.write("\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3")
        buf.write("\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17")
        buf.write("\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21")
        buf.write("\3\21\7\21q\n\21\f\21\16\21t\13\21\5\21v\n\21\3\22\3\22")
        buf.write("\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22")
        buf.write("\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22")
        buf.write("\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22")
        buf.write("\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22")
        buf.write("\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ae\n")
        buf.write("\22\3\22\3\22\5\22\u00b2\n\22\3\22\5\22\u00b5\n\22\3\23")
        buf.write("\3\23\7\23\u00b9\n\23\f\23\16\23\u00bc\13\23\3\24\3\24")
        buf.write("\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c7\n\24\3")
        buf.write("\25\3\25\3\25\7\25\u00cc\n\25\f\25\16\25\u00cf\13\25\3")
        buf.write("\25\3\25\6\25\u00d3\n\25\r\25\16\25\u00d4\5\25\u00d7\n")
        buf.write("\25\5\25\u00d9\n\25\3\26\3\26\3\26\5\26\u00de\n\26\7\26")
        buf.write("\u00e0\n\26\f\26\16\26\u00e3\13\26\3\26\3\26\3\27\3\27")
        buf.write("\3\27\3\27\5\27\u00eb\n\27\3\30\6\30\u00ee\n\30\r\30\16")
        buf.write("\30\u00ef\3\30\3\30\3\31\5\31\u00f5\n\31\3\31\3\31\3\31")
        buf.write("\5\31\u00fa\n\31\3\31\3\31\7\31\u00fe\n\31\f\31\16\31")
        buf.write("\u0101\13\31\5\31\u0103\n\31\2\2\32\3\3\5\4\7\5\t\6\13")
        buf.write("\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37")
        buf.write("\21!\2#\22%\23\'\24)\25+\26-\27/\30\61\31\3\2\7\3\2\63")
        buf.write(";\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2")
        buf.write("\u011e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2")
        buf.write("\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2")
        buf.write("\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33")
        buf.write("\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2")
        buf.write("\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2")
        buf.write("\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5<\3\2\2\2\7>\3\2\2\2\t")
        buf.write("A\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3\2\2")
        buf.write("\2\23U\3\2\2\2\25W\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33")
        buf.write("^\3\2\2\2\35b\3\2\2\2\37j\3\2\2\2!u\3\2\2\2#\u00b4\3\2")
        buf.write("\2\2%\u00b6\3\2\2\2\'\u00c6\3\2\2\2)\u00d8\3\2\2\2+\u00da")
        buf.write("\3\2\2\2-\u00ea\3\2\2\2/\u00ed\3\2\2\2\61\u0102\3\2\2")
        buf.write("\2\63\64\7h\2\2\64\65\7g\2\2\65\66\7c\2\2\66\67\7v\2\2")
        buf.write("\678\7w\2\289\7t\2\29:\7g\2\2:;\7u\2\2;\4\3\2\2\2<=\7")
        buf.write("\60\2\2=\6\3\2\2\2>?\7}\2\2?@\7\177\2\2@\b\3\2\2\2AB\7")
        buf.write("}\2\2B\n\3\2\2\2CD\7.\2\2D\f\3\2\2\2EF\7\177\2\2F\16\3")
        buf.write("\2\2\2GH\7$\2\2H\20\3\2\2\2IJ\7e\2\2JK\7q\2\2KL\7p\2\2")
        buf.write("LM\7u\2\2MN\7v\2\2NO\7t\2\2OP\7c\2\2PQ\7k\2\2QR\7p\2\2")
        buf.write("RS\7v\2\2ST\7u\2\2T\22\3\2\2\2UV\7#\2\2V\24\3\2\2\2WX")
        buf.write("\7(\2\2X\26\3\2\2\2YZ\7~\2\2Z\30\3\2\2\2[\\\7?\2\2\\]")
        buf.write("\7@\2\2]\32\3\2\2\2^_\7>\2\2_`\7?\2\2`a\7@\2\2a\34\3\2")
        buf.write("\2\2bc\7k\2\2cd\7o\2\2de\7r\2\2ef\7q\2\2fg\7t\2\2gh\7")
        buf.write("v\2\2hi\7u\2\2i\36\3\2\2\2jk\7c\2\2kl\7u\2\2l \3\2\2\2")
        buf.write("mv\7\62\2\2nr\t\2\2\2oq\t\3\2\2po\3\2\2\2qt\3\2\2\2rp")
        buf.write("\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2um\3\2\2\2un\3\2")
        buf.write("\2\2v\"\3\2\2\2wx\7c\2\2xy\7n\2\2yz\7v\2\2z{\7g\2\2{|")
        buf.write("\7t\2\2|}\7p\2\2}~\7c\2\2~\177\7v\2\2\177\u0080\7k\2\2")
        buf.write("\u0080\u0081\7x\2\2\u0081\u00b5\7g\2\2\u0082\u0083\7q")
        buf.write("\2\2\u0083\u00b5\7t\2\2\u0084\u0085\7e\2\2\u0085\u0086")
        buf.write("\7q\2\2\u0086\u0087\7p\2\2\u0087\u0088\7u\2\2\u0088\u0089")
        buf.write("\7v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7c\2\2\u008b\u008c")
        buf.write("\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7v\2\2\u008e\u00b5")
        buf.write("\7u\2\2\u008f\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092")
        buf.write("\7w\2\2\u0092\u00b5\7g\2\2\u0093\u0094\7h\2\2\u0094\u0095")
        buf.write("\7c\2\2\u0095\u0096\7n\2\2\u0096\u0097\7u\2\2\u0097\u00b5")
        buf.write("\7g\2\2\u0098\u0099\7c\2\2\u0099\u00b5\7u\2\2\u009a\u009b")
        buf.write("\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7h\2\2\u009d\u009e")
        buf.write("\7g\2\2\u009e\u00b5\7t\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1")
        buf.write("\7c\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4")
        buf.write("\7c\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7")
        buf.write("\7t\2\2\u00a7\u00b5\7{\2\2\u00a8\u00ad\7]\2\2\u00a9\u00aa")
        buf.write("\5!\21\2\u00aa\u00ab\7\60\2\2\u00ab\u00ac\7\60\2\2\u00ac")
        buf.write("\u00ae\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ae\3\2\2\2")
        buf.write("\u00ae\u00b1\3\2\2\2\u00af\u00b2\5!\21\2\u00b0\u00b2\7")
        buf.write(",\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3")
        buf.write("\3\2\2\2\u00b3\u00b5\7_\2\2\u00b4w\3\2\2\2\u00b4\u0082")
        buf.write("\3\2\2\2\u00b4\u0084\3\2\2\2\u00b4\u008f\3\2\2\2\u00b4")
        buf.write("\u0093\3\2\2\2\u00b4\u0098\3\2\2\2\u00b4\u009a\3\2\2\2")
        buf.write("\u00b4\u009f\3\2\2\2\u00b4\u00a8\3\2\2\2\u00b5$\3\2\2")
        buf.write("\2\u00b6\u00ba\t\4\2\2\u00b7\u00b9\t\5\2\2\u00b8\u00b7")
        buf.write("\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba")
        buf.write("\u00bb\3\2\2\2\u00bb&\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd")
        buf.write("\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7w\2\2\u00c0")
        buf.write("\u00c7\7g\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7c\2\2\u00c3")
        buf.write("\u00c4\7n\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c7\7g\2\2\u00c6")
        buf.write("\u00bd\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c7(\3\2\2\2\u00c8")
        buf.write("\u00d9\7\62\2\2\u00c9\u00cd\t\2\2\2\u00ca\u00cc\t\3\2")
        buf.write("\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb")
        buf.write("\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d6\3\2\2\2\u00cf")
        buf.write("\u00cd\3\2\2\2\u00d0\u00d2\7\60\2\2\u00d1\u00d3\t\3\2")
        buf.write("\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2")
        buf.write("\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6")
        buf.write("\u00d0\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2")
        buf.write("\u00d8\u00c8\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d9*\3\2\2")
        buf.write("\2\u00da\u00e1\7]\2\2\u00db\u00dd\5-\27\2\u00dc\u00de")
        buf.write("\7.\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de")
        buf.write("\u00e0\3\2\2\2\u00df\u00db\3\2\2\2\u00e0\u00e3\3\2\2\2")
        buf.write("\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3")
        buf.write("\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7_\2\2\u00e5,\3")
        buf.write("\2\2\2\u00e6\u00eb\5\'\24\2\u00e7\u00eb\5)\25\2\u00e8")
        buf.write("\u00eb\5%\23\2\u00e9\u00eb\5+\26\2\u00ea\u00e6\3\2\2\2")
        buf.write("\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3")
        buf.write("\2\2\2\u00eb.\3\2\2\2\u00ec\u00ee\t\6\2\2\u00ed\u00ec")
        buf.write("\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef")
        buf.write("\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b\30\2")
        buf.write("\2\u00f2\60\3\2\2\2\u00f3\u00f5\7\17\2\2\u00f4\u00f3\3")
        buf.write("\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7")
        buf.write("\7\f\2\2\u00f7\u0103\7\13\2\2\u00f8\u00fa\7\17\2\2\u00f9")
        buf.write("\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2")
        buf.write("\u00fb\u00ff\7\f\2\2\u00fc\u00fe\7\"\2\2\u00fd\u00fc\3")
        buf.write("\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100")
        buf.write("\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102")
        buf.write("\u00f4\3\2\2\2\u0102\u00f9\3\2\2\2\u0103\62\3\2\2\2\26")
        buf.write("\2ru\u00ad\u00b1\u00b4\u00ba\u00c6\u00cd\u00d4\u00d6\u00d8")
        buf.write("\u00dd\u00e1\u00ea\u00ef\u00f4\u00f9\u00ff\u0102\3\b\2")
        buf.write("\2")
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
    KEYWORD = 16
    WORD = 17
    BOOLEAN = 18
    NUMBER = 19
    VECTOR = 20
    VALUE = 21
    WS = 22
    NL = 23

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'features'", "'.'", "'{}'", "'{'", "','", "'}'", "'\"'", "'constraints'", 
            "'!'", "'&'", "'|'", "'=>'", "'<=>'", "'imports'", "'as'" ]

    symbolicNames = [ "<INVALID>",
            "KEYWORD", "WORD", "BOOLEAN", "NUMBER", "VECTOR", "VALUE", "WS", 
            "NL" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "T__9", "T__10", "T__11", "T__12", "T__13", 
                  "T__14", "INT", "KEYWORD", "WORD", "BOOLEAN", "NUMBER", 
                  "VECTOR", "VALUE", "WS", "NL" ]

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



