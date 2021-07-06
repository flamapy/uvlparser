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
        buf.write("\u00ec\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
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
        buf.write("\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21")
        buf.write("\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21")
        buf.write("\3\21\5\21\u009d\n\21\3\22\3\22\7\22\u00a1\n\22\f\22\16")
        buf.write("\22\u00a4\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23")
        buf.write("\3\23\5\23\u00af\n\23\3\24\3\24\3\24\7\24\u00b4\n\24\f")
        buf.write("\24\16\24\u00b7\13\24\3\24\3\24\6\24\u00bb\n\24\r\24\16")
        buf.write("\24\u00bc\5\24\u00bf\n\24\5\24\u00c1\n\24\3\25\3\25\3")
        buf.write("\25\5\25\u00c6\n\25\7\25\u00c8\n\25\f\25\16\25\u00cb\13")
        buf.write("\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00d3\n\26\3\27")
        buf.write("\6\27\u00d6\n\27\r\27\16\27\u00d7\3\27\3\27\3\30\5\30")
        buf.write("\u00dd\n\30\3\30\3\30\3\30\5\30\u00e2\n\30\3\30\3\30\7")
        buf.write("\30\u00e6\n\30\f\30\16\30\u00e9\13\30\5\30\u00eb\n\30")
        buf.write("\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f")
        buf.write("\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27")
        buf.write("-\30/\31\3\2\7\4\2C\\c|\6\2\62;C\\aac|\3\2\63;\3\2\62")
        buf.write(";\5\2\13\f\17\17\"\"\2\u0102\2\3\3\2\2\2\2\5\3\2\2\2\2")
        buf.write("\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3")
        buf.write("\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2")
        buf.write("\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2")
        buf.write("\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2")
        buf.write("\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5:")
        buf.write("\3\2\2\2\7<\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2")
        buf.write("\17E\3\2\2\2\21G\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3")
        buf.write("\2\2\2\31Y\3\2\2\2\33\\\3\2\2\2\35`\3\2\2\2\37h\3\2\2")
        buf.write("\2!\u009c\3\2\2\2#\u009e\3\2\2\2%\u00ae\3\2\2\2\'\u00c0")
        buf.write("\3\2\2\2)\u00c2\3\2\2\2+\u00d2\3\2\2\2-\u00d5\3\2\2\2")
        buf.write("/\u00ea\3\2\2\2\61\62\7h\2\2\62\63\7g\2\2\63\64\7c\2\2")
        buf.write("\64\65\7v\2\2\65\66\7w\2\2\66\67\7t\2\2\678\7g\2\289\7")
        buf.write("u\2\29\4\3\2\2\2:;\7\60\2\2;\6\3\2\2\2<=\7}\2\2=>\7\177")
        buf.write("\2\2>\b\3\2\2\2?@\7}\2\2@\n\3\2\2\2AB\7.\2\2B\f\3\2\2")
        buf.write("\2CD\7\177\2\2D\16\3\2\2\2EF\7$\2\2F\20\3\2\2\2GH\7e\2")
        buf.write("\2HI\7q\2\2IJ\7p\2\2JK\7u\2\2KL\7v\2\2LM\7t\2\2MN\7c\2")
        buf.write("\2NO\7k\2\2OP\7p\2\2PQ\7v\2\2QR\7u\2\2R\22\3\2\2\2ST\7")
        buf.write("#\2\2T\24\3\2\2\2UV\7(\2\2V\26\3\2\2\2WX\7~\2\2X\30\3")
        buf.write("\2\2\2YZ\7?\2\2Z[\7@\2\2[\32\3\2\2\2\\]\7>\2\2]^\7?\2")
        buf.write("\2^_\7@\2\2_\34\3\2\2\2`a\7k\2\2ab\7o\2\2bc\7r\2\2cd\7")
        buf.write("q\2\2de\7t\2\2ef\7v\2\2fg\7u\2\2g\36\3\2\2\2hi\7c\2\2")
        buf.write("ij\7u\2\2j \3\2\2\2kl\7c\2\2lm\7n\2\2mn\7v\2\2no\7g\2")
        buf.write("\2op\7t\2\2pq\7p\2\2qr\7c\2\2rs\7v\2\2st\7k\2\2tu\7x\2")
        buf.write("\2u\u009d\7g\2\2vw\7q\2\2w\u009d\7t\2\2xy\7e\2\2yz\7q")
        buf.write("\2\2z{\7p\2\2{|\7u\2\2|}\7v\2\2}~\7t\2\2~\177\7c\2\2\177")
        buf.write("\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7v\2\2\u0082")
        buf.write("\u009d\7u\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085")
        buf.write("\u0086\7w\2\2\u0086\u009d\7g\2\2\u0087\u0088\7h\2\2\u0088")
        buf.write("\u0089\7c\2\2\u0089\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b")
        buf.write("\u009d\7g\2\2\u008c\u008d\7c\2\2\u008d\u009d\7u\2\2\u008e")
        buf.write("\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091\7h\2\2\u0091")
        buf.write("\u0092\7g\2\2\u0092\u009d\7t\2\2\u0093\u0094\7o\2\2\u0094")
        buf.write("\u0095\7c\2\2\u0095\u0096\7p\2\2\u0096\u0097\7f\2\2\u0097")
        buf.write("\u0098\7c\2\2\u0098\u0099\7v\2\2\u0099\u009a\7q\2\2\u009a")
        buf.write("\u009b\7t\2\2\u009b\u009d\7{\2\2\u009ck\3\2\2\2\u009c")
        buf.write("v\3\2\2\2\u009cx\3\2\2\2\u009c\u0083\3\2\2\2\u009c\u0087")
        buf.write("\3\2\2\2\u009c\u008c\3\2\2\2\u009c\u008e\3\2\2\2\u009c")
        buf.write("\u0093\3\2\2\2\u009d\"\3\2\2\2\u009e\u00a2\t\2\2\2\u009f")
        buf.write("\u00a1\t\3\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2")
        buf.write("\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3$\3\2\2")
        buf.write("\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7")
        buf.write("\7t\2\2\u00a7\u00a8\7w\2\2\u00a8\u00af\7g\2\2\u00a9\u00aa")
        buf.write("\7h\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad")
        buf.write("\7u\2\2\u00ad\u00af\7g\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a9")
        buf.write("\3\2\2\2\u00af&\3\2\2\2\u00b0\u00c1\7\62\2\2\u00b1\u00b5")
        buf.write("\t\4\2\2\u00b2\u00b4\t\5\2\2\u00b3\u00b2\3\2\2\2\u00b4")
        buf.write("\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2")
        buf.write("\u00b6\u00be\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\7")
        buf.write("\60\2\2\u00b9\u00bb\t\5\2\2\u00ba\u00b9\3\2\2\2\u00bb")
        buf.write("\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2")
        buf.write("\u00bd\u00bf\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bf\3")
        buf.write("\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b0\3\2\2\2\u00c0\u00b1")
        buf.write("\3\2\2\2\u00c1(\3\2\2\2\u00c2\u00c9\7]\2\2\u00c3\u00c5")
        buf.write("\5+\26\2\u00c4\u00c6\7.\2\2\u00c5\u00c4\3\2\2\2\u00c5")
        buf.write("\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2")
        buf.write("\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3")
        buf.write("\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd")
        buf.write("\7_\2\2\u00cd*\3\2\2\2\u00ce\u00d3\5%\23\2\u00cf\u00d3")
        buf.write("\5\'\24\2\u00d0\u00d3\5#\22\2\u00d1\u00d3\5)\25\2\u00d2")
        buf.write("\u00ce\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2")
        buf.write("\u00d2\u00d1\3\2\2\2\u00d3,\3\2\2\2\u00d4\u00d6\t\6\2")
        buf.write("\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5")
        buf.write("\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9")
        buf.write("\u00da\b\27\2\2\u00da.\3\2\2\2\u00db\u00dd\7\17\2\2\u00dc")
        buf.write("\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2")
        buf.write("\u00de\u00df\7\f\2\2\u00df\u00eb\7\13\2\2\u00e0\u00e2")
        buf.write("\7\17\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2")
        buf.write("\u00e3\3\2\2\2\u00e3\u00e7\7\f\2\2\u00e4\u00e6\7\"\2\2")
        buf.write("\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3")
        buf.write("\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7")
        buf.write("\3\2\2\2\u00ea\u00dc\3\2\2\2\u00ea\u00e1\3\2\2\2\u00eb")
        buf.write("\60\3\2\2\2\22\2\u009c\u00a2\u00ae\u00b5\u00bc\u00be\u00c0")
        buf.write("\u00c5\u00c9\u00d2\u00d7\u00dc\u00e1\u00e7\u00ea\3\b\2")
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
                  "T__14", "KEYWORD", "WORD", "BOOLEAN", "NUMBER", "VECTOR", 
                  "VALUE", "WS", "NL" ]

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



