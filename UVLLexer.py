# Generated from UVL.g4 by ANTLR 4.9
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


from antlr_denter.DenterHelper import DenterHelper
from UVLParser import UVLParser



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r")
        buf.write("v\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\2")
        buf.write("\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3")
        buf.write("\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t")
        buf.write("\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3")
        buf.write("\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t")
        buf.write("\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3")
        buf.write("\t\5\ta\n\t\3\n\3\n\7\ne\n\n\f\n\16\nh\13\n\3\13\6\13")
        buf.write("k\n\13\r\13\16\13l\3\13\3\13\3\f\5\fr\n\f\3\f\3\f\3\f")
        buf.write("\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27")
        buf.write("\r\3\2\5\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2")
        buf.write("\177\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2")
        buf.write("\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23")
        buf.write("\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\"\3")
        buf.write("\2\2\2\7$\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17")
        buf.write("-\3\2\2\2\21`\3\2\2\2\23b\3\2\2\2\25j\3\2\2\2\27q\3\2")
        buf.write("\2\2\31\32\7h\2\2\32\33\7g\2\2\33\34\7c\2\2\34\35\7v\2")
        buf.write("\2\35\36\7w\2\2\36\37\7t\2\2\37 \7g\2\2 !\7u\2\2!\4\3")
        buf.write("\2\2\2\"#\7\60\2\2#\6\3\2\2\2$%\7}\2\2%&\7\177\2\2&\b")
        buf.write("\3\2\2\2\'(\7}\2\2(\n\3\2\2\2)*\7.\2\2*\f\3\2\2\2+,\7")
        buf.write("\177\2\2,\16\3\2\2\2-.\7$\2\2.\20\3\2\2\2/\60\7c\2\2\60")
        buf.write("\61\7n\2\2\61\62\7v\2\2\62\63\7g\2\2\63\64\7t\2\2\64\65")
        buf.write("\7p\2\2\65\66\7c\2\2\66\67\7v\2\2\678\7k\2\289\7x\2\2")
        buf.write("9a\7g\2\2:;\7q\2\2;a\7t\2\2<=\7e\2\2=>\7q\2\2>?\7p\2\2")
        buf.write("?@\7u\2\2@A\7v\2\2AB\7t\2\2BC\7c\2\2CD\7k\2\2DE\7p\2\2")
        buf.write("EF\7v\2\2Fa\7u\2\2GH\7v\2\2HI\7t\2\2IJ\7w\2\2Ja\7g\2\2")
        buf.write("KL\7h\2\2LM\7c\2\2MN\7n\2\2NO\7u\2\2Oa\7g\2\2PQ\7c\2\2")
        buf.write("Qa\7u\2\2RS\7t\2\2ST\7g\2\2TU\7h\2\2UV\7g\2\2Va\7t\2\2")
        buf.write("WX\7o\2\2XY\7c\2\2YZ\7p\2\2Z[\7f\2\2[\\\7c\2\2\\]\7v\2")
        buf.write("\2]^\7q\2\2^_\7t\2\2_a\7{\2\2`/\3\2\2\2`:\3\2\2\2`<\3")
        buf.write("\2\2\2`G\3\2\2\2`K\3\2\2\2`P\3\2\2\2`R\3\2\2\2`W\3\2\2")
        buf.write("\2a\22\3\2\2\2bf\t\2\2\2ce\t\3\2\2dc\3\2\2\2eh\3\2\2\2")
        buf.write("fd\3\2\2\2fg\3\2\2\2g\24\3\2\2\2hf\3\2\2\2ik\t\4\2\2j")
        buf.write("i\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b")
        buf.write("\13\2\2o\26\3\2\2\2pr\7\17\2\2qp\3\2\2\2qr\3\2\2\2rs\3")
        buf.write("\2\2\2st\7\f\2\2tu\7\13\2\2u\30\3\2\2\2\7\2`flq\3\b\2")
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
    KEYWORD = 8
    WORD = 9
    WS = 10
    NL = 11

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'features'", "'.'", "'{}'", "'{'", "','", "'}'", "'\"'" ]

    symbolicNames = [ "<INVALID>",
            "KEYWORD", "WORD", "WS", "NL" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "KEYWORD", "WORD", "WS", "NL" ]

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



