# Generated from UVL.g4 by ANTLR 4.9
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


from antlr_denter.DenterHelper import DenterHelper
from UVLParser import UVLParser



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7")
        buf.write("^\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2")
        buf.write("\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\5\3H\n\3\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5")
        buf.write("\5\5R\n\5\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\6\3\6\3\6")
        buf.write("\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\5\4\2C\\c|\6\2\62")
        buf.write(";C\\aac|\4\2\13\f\"\"\2g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3")
        buf.write("\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5G\3\2\2\2")
        buf.write("\7I\3\2\2\2\tQ\3\2\2\2\13Z\3\2\2\2\r\16\7h\2\2\16\17\7")
        buf.write("g\2\2\17\20\7c\2\2\20\21\7v\2\2\21\22\7w\2\2\22\23\7t")
        buf.write("\2\2\23\24\7g\2\2\24\25\7u\2\2\25\4\3\2\2\2\26\27\7c\2")
        buf.write("\2\27\30\7n\2\2\30\31\7v\2\2\31\32\7g\2\2\32\33\7t\2\2")
        buf.write("\33\34\7p\2\2\34\35\7c\2\2\35\36\7v\2\2\36\37\7k\2\2\37")
        buf.write(" \7x\2\2 H\7g\2\2!\"\7q\2\2\"H\7t\2\2#$\7e\2\2$%\7q\2")
        buf.write("\2%&\7p\2\2&\'\7u\2\2\'(\7v\2\2()\7t\2\2)*\7c\2\2*+\7")
        buf.write("k\2\2+,\7p\2\2,-\7v\2\2-H\7u\2\2./\7v\2\2/\60\7t\2\2\60")
        buf.write("\61\7w\2\2\61H\7g\2\2\62\63\7h\2\2\63\64\7c\2\2\64\65")
        buf.write("\7n\2\2\65\66\7u\2\2\66H\7g\2\2\678\7c\2\28H\7u\2\29:")
        buf.write("\7t\2\2:;\7g\2\2;<\7h\2\2<=\7g\2\2=H\7t\2\2>?\7o\2\2?")
        buf.write("@\7c\2\2@A\7p\2\2AB\7f\2\2BC\7c\2\2CD\7v\2\2DE\7q\2\2")
        buf.write("EF\7t\2\2FH\7{\2\2G\26\3\2\2\2G!\3\2\2\2G#\3\2\2\2G.\3")
        buf.write("\2\2\2G\62\3\2\2\2G\67\3\2\2\2G9\3\2\2\2G>\3\2\2\2H\6")
        buf.write("\3\2\2\2IM\t\2\2\2JL\t\3\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2")
        buf.write("\2\2MN\3\2\2\2N\b\3\2\2\2OM\3\2\2\2PR\7\17\2\2QP\3\2\2")
        buf.write("\2QR\3\2\2\2RS\3\2\2\2SW\7\f\2\2TV\7\"\2\2UT\3\2\2\2V")
        buf.write("Y\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\n\3\2\2\2YW\3\2\2\2Z[\t")
        buf.write("\4\2\2[\\\3\2\2\2\\]\b\6\2\2]\f\3\2\2\2\7\2GMQW\3\b\2")
        buf.write("\2")
        return buf.getvalue()


class UVLLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    KEYWORD = 2
    FEATURE = 3
    NL = 4
    WS = 5

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'features'" ]

    symbolicNames = [ "<INVALID>",
            "KEYWORD", "FEATURE", "NL", "WS" ]

    ruleNames = [ "T__0", "KEYWORD", "FEATURE", "NL", "WS" ]

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



