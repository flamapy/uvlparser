# Generated from UVL.g4 by ANTLR 4.9
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t")
        buf.write("#\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\5\2\f\n\2\3\3\3")
        buf.write("\3\3\3\3\4\3\4\3\4\6\4\24\n\4\r\4\16\4\25\3\4\3\4\3\5")
        buf.write("\3\5\3\5\6\5\35\n\5\r\5\16\5\36\3\5\3\5\3\5\2\2\6\2\4")
        buf.write("\6\b\2\2\2!\2\13\3\2\2\2\4\r\3\2\2\2\6\20\3\2\2\2\b\31")
        buf.write("\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\13\f\3\2\2\2\f\3\3\2")
        buf.write("\2\2\r\16\7\3\2\2\16\17\5\6\4\2\17\5\3\2\2\2\20\21\7\5")
        buf.write("\2\2\21\23\7\b\2\2\22\24\5\b\5\2\23\22\3\2\2\2\24\25\3")
        buf.write("\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\30")
        buf.write("\7\t\2\2\30\7\3\2\2\2\31\32\7\4\2\2\32\34\7\b\2\2\33\35")
        buf.write("\5\6\4\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36")
        buf.write("\37\3\2\2\2\37 \3\2\2\2 !\7\t\2\2!\t\3\2\2\2\5\13\25\36")
        return buf.getvalue()


class UVLParser ( Parser ):

    grammarFileName = "UVL.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'features'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "KEYWORD", "FEATURE", "NL", 
                      "WS", "INDENT", "DEDENT" ]

    RULE_feature_model = 0
    RULE_features = 1
    RULE_child = 2
    RULE_relationship = 3

    ruleNames =  [ "feature_model", "features", "child", "relationship" ]

    EOF = Token.EOF
    T__0=1
    KEYWORD=2
    FEATURE=3
    NL=4
    WS=5
    INDENT=6
    DEDENT=7

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class Feature_modelContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def features(self):
            return self.getTypedRuleContext(UVLParser.FeaturesContext,0)


        def getRuleIndex(self):
            return UVLParser.RULE_feature_model

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFeature_model" ):
                listener.enterFeature_model(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFeature_model" ):
                listener.exitFeature_model(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFeature_model" ):
                return visitor.visitFeature_model(self)
            else:
                return visitor.visitChildren(self)




    def feature_model(self):

        localctx = UVLParser.Feature_modelContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_feature_model)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 9
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==UVLParser.T__0:
                self.state = 8
                self.features()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FeaturesContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def child(self):
            return self.getTypedRuleContext(UVLParser.ChildContext,0)


        def getRuleIndex(self):
            return UVLParser.RULE_features

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFeatures" ):
                listener.enterFeatures(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFeatures" ):
                listener.exitFeatures(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFeatures" ):
                return visitor.visitFeatures(self)
            else:
                return visitor.visitChildren(self)




    def features(self):

        localctx = UVLParser.FeaturesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_features)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11
            self.match(UVLParser.T__0)
            self.state = 12
            self.child()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ChildContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FEATURE(self):
            return self.getToken(UVLParser.FEATURE, 0)

        def INDENT(self):
            return self.getToken(UVLParser.INDENT, 0)

        def DEDENT(self):
            return self.getToken(UVLParser.DEDENT, 0)

        def relationship(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(UVLParser.RelationshipContext)
            else:
                return self.getTypedRuleContext(UVLParser.RelationshipContext,i)


        def getRuleIndex(self):
            return UVLParser.RULE_child

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterChild" ):
                listener.enterChild(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitChild" ):
                listener.exitChild(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitChild" ):
                return visitor.visitChild(self)
            else:
                return visitor.visitChildren(self)




    def child(self):

        localctx = UVLParser.ChildContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_child)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 14
            self.match(UVLParser.FEATURE)
            self.state = 15
            self.match(UVLParser.INDENT)
            self.state = 17 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 16
                self.relationship()
                self.state = 19 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==UVLParser.KEYWORD):
                    break

            self.state = 21
            self.match(UVLParser.DEDENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RelationshipContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def KEYWORD(self):
            return self.getToken(UVLParser.KEYWORD, 0)

        def INDENT(self):
            return self.getToken(UVLParser.INDENT, 0)

        def DEDENT(self):
            return self.getToken(UVLParser.DEDENT, 0)

        def child(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(UVLParser.ChildContext)
            else:
                return self.getTypedRuleContext(UVLParser.ChildContext,i)


        def getRuleIndex(self):
            return UVLParser.RULE_relationship

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRelationship" ):
                listener.enterRelationship(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRelationship" ):
                listener.exitRelationship(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRelationship" ):
                return visitor.visitRelationship(self)
            else:
                return visitor.visitChildren(self)




    def relationship(self):

        localctx = UVLParser.RelationshipContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_relationship)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23
            self.match(UVLParser.KEYWORD)
            self.state = 24
            self.match(UVLParser.INDENT)
            self.state = 26 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 25
                self.child()
                self.state = 28 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==UVLParser.FEATURE):
                    break

            self.state = 30
            self.match(UVLParser.DEDENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





