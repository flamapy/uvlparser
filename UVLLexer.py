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
        buf.write("\u00d2\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3")
        buf.write("\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t")
        buf.write("\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f")
        buf.write("\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3")
        buf.write("\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21")
        buf.write("\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21")
        buf.write("\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21")
        buf.write("\3\21\3\21\3\21\3\21\5\21\u008a\n\21\3\22\3\22\7\22\u008e")
        buf.write("\n\22\f\22\16\22\u0091\13\22\3\23\3\23\3\23\3\23\3\23")
        buf.write("\3\23\3\23\3\23\3\23\5\23\u009c\n\23\3\24\3\24\3\24\7")
        buf.write("\24\u00a1\n\24\f\24\16\24\u00a4\13\24\3\24\3\24\6\24\u00a8")
        buf.write("\n\24\r\24\16\24\u00a9\5\24\u00ac\n\24\5\24\u00ae\n\24")
        buf.write("\3\25\3\25\3\25\5\25\u00b3\n\25\7\25\u00b5\n\25\f\25\16")
        buf.write("\25\u00b8\13\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00c0")
        buf.write("\n\26\3\27\5\27\u00c3\n\27\3\27\3\27\7\27\u00c7\n\27\f")
        buf.write("\27\16\27\u00ca\13\27\3\30\6\30\u00cd\n\30\r\30\16\30")
        buf.write("\u00ce\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t")
        buf.write("\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23")
        buf.write("%\24\'\25)\26+\27-\30/\31\3\2\7\4\2C\\c|\6\2\62;C\\aa")
        buf.write("c|\3\2\63;\3\2\62;\3\2\"\"\2\u00e2\2\3\3\2\2\2\2\5\3\2")
        buf.write("\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2")
        buf.write("\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2")
        buf.write("\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37")
        buf.write("\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2")
        buf.write("\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2")
        buf.write("\2\2\5:\3\2\2\2\7<\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3")
        buf.write("\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2")
        buf.write("\27W\3\2\2\2\31Y\3\2\2\2\33\\\3\2\2\2\35`\3\2\2\2\37h")
        buf.write("\3\2\2\2!\u0089\3\2\2\2#\u008b\3\2\2\2%\u009b\3\2\2\2")
        buf.write("\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00bf\3\2\2\2-\u00c2")
        buf.write("\3\2\2\2/\u00cc\3\2\2\2\61\62\7h\2\2\62\63\7g\2\2\63\64")
        buf.write("\7c\2\2\64\65\7v\2\2\65\66\7w\2\2\66\67\7t\2\2\678\7g")
        buf.write("\2\289\7u\2\29\4\3\2\2\2:;\7\60\2\2;\6\3\2\2\2<=\7}\2")
        buf.write("\2=>\7\177\2\2>\b\3\2\2\2?@\7}\2\2@\n\3\2\2\2AB\7.\2\2")
        buf.write("B\f\3\2\2\2CD\7\177\2\2D\16\3\2\2\2EF\7$\2\2F\20\3\2\2")
        buf.write("\2GH\7e\2\2HI\7q\2\2IJ\7p\2\2JK\7u\2\2KL\7v\2\2LM\7t\2")
        buf.write("\2MN\7c\2\2NO\7k\2\2OP\7p\2\2PQ\7v\2\2QR\7u\2\2R\22\3")
        buf.write("\2\2\2ST\7#\2\2T\24\3\2\2\2UV\7(\2\2V\26\3\2\2\2WX\7~")
        buf.write("\2\2X\30\3\2\2\2YZ\7?\2\2Z[\7@\2\2[\32\3\2\2\2\\]\7>\2")
        buf.write("\2]^\7?\2\2^_\7@\2\2_\34\3\2\2\2`a\7k\2\2ab\7o\2\2bc\7")
        buf.write("r\2\2cd\7q\2\2de\7t\2\2ef\7v\2\2fg\7u\2\2g\36\3\2\2\2")
        buf.write("hi\7c\2\2ij\7u\2\2j \3\2\2\2kl\7c\2\2lm\7n\2\2mn\7v\2")
        buf.write("\2no\7g\2\2op\7t\2\2pq\7p\2\2qr\7c\2\2rs\7v\2\2st\7k\2")
        buf.write("\2tu\7x\2\2u\u008a\7g\2\2vw\7q\2\2w\u008a\7t\2\2xy\7q")
        buf.write("\2\2yz\7r\2\2z{\7v\2\2{|\7k\2\2|}\7q\2\2}~\7p\2\2~\177")
        buf.write("\7c\2\2\177\u008a\7n\2\2\u0080\u0081\7o\2\2\u0081\u0082")
        buf.write("\7c\2\2\u0082\u0083\7p\2\2\u0083\u0084\7f\2\2\u0084\u0085")
        buf.write("\7c\2\2\u0085\u0086\7v\2\2\u0086\u0087\7q\2\2\u0087\u0088")
        buf.write("\7t\2\2\u0088\u008a\7{\2\2\u0089k\3\2\2\2\u0089v\3\2\2")
        buf.write("\2\u0089x\3\2\2\2\u0089\u0080\3\2\2\2\u008a\"\3\2\2\2")
        buf.write("\u008b\u008f\t\2\2\2\u008c\u008e\t\3\2\2\u008d\u008c\3")
        buf.write("\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090")
        buf.write("\3\2\2\2\u0090$\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093")
        buf.write("\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095\7w\2\2\u0095\u009c")
        buf.write("\7g\2\2\u0096\u0097\7h\2\2\u0097\u0098\7c\2\2\u0098\u0099")
        buf.write("\7n\2\2\u0099\u009a\7u\2\2\u009a\u009c\7g\2\2\u009b\u0092")
        buf.write("\3\2\2\2\u009b\u0096\3\2\2\2\u009c&\3\2\2\2\u009d\u00ae")
        buf.write("\7\62\2\2\u009e\u00a2\t\4\2\2\u009f\u00a1\t\5\2\2\u00a0")
        buf.write("\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2")
        buf.write("\u00a2\u00a3\3\2\2\2\u00a3\u00ab\3\2\2\2\u00a4\u00a2\3")
        buf.write("\2\2\2\u00a5\u00a7\7\60\2\2\u00a6\u00a8\t\5\2\2\u00a7")
        buf.write("\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2")
        buf.write("\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a5\3")
        buf.write("\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u009d")
        buf.write("\3\2\2\2\u00ad\u009e\3\2\2\2\u00ae(\3\2\2\2\u00af\u00b6")
        buf.write("\7]\2\2\u00b0\u00b2\5+\26\2\u00b1\u00b3\7.\2\2\u00b2\u00b1")
        buf.write("\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4")
        buf.write("\u00b0\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2")
        buf.write("\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3")
        buf.write("\2\2\2\u00b9\u00ba\7_\2\2\u00ba*\3\2\2\2\u00bb\u00c0\5")
        buf.write("%\23\2\u00bc\u00c0\5\'\24\2\u00bd\u00c0\5#\22\2\u00be")
        buf.write("\u00c0\5)\25\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2")
        buf.write("\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0,\3\2\2")
        buf.write("\2\u00c1\u00c3\7\17\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3")
        buf.write("\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8\7\f\2\2\u00c5")
        buf.write("\u00c7\7\"\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2")
        buf.write("\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9.\3\2\2")
        buf.write("\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\t\6\2\2\u00cc\u00cb")
        buf.write("\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce")
        buf.write("\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\30\2")
        buf.write("\2\u00d1\60\3\2\2\2\20\2\u0089\u008f\u009b\u00a2\u00a9")
        buf.write("\u00ab\u00ad\u00b2\u00b6\u00bf\u00c2\u00c8\u00ce\3\b\2")
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
    RELATION_WORD = 16
    WORD = 17
    BOOLEAN = 18
    NUMBER = 19
    VECTOR = 20
    VALUE = 21
    NL = 22
    WS = 23

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'features'", "'.'", "'{}'", "'{'", "','", "'}'", "'\"'", "'constraints'", 
            "'!'", "'&'", "'|'", "'=>'", "'<=>'", "'imports'", "'as'" ]

    symbolicNames = [ "<INVALID>",
            "RELATION_WORD", "WORD", "BOOLEAN", "NUMBER", "VECTOR", "VALUE", 
            "NL", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "T__9", "T__10", "T__11", "T__12", "T__13", 
                  "T__14", "RELATION_WORD", "WORD", "BOOLEAN", "NUMBER", 
                  "VECTOR", "VALUE", "NL", "WS" ]

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



