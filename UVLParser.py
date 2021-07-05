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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17")
        buf.write("T\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2\5\2\30\n\2\3\3\3\3")
        buf.write("\3\3\3\4\3\4\3\4\6\4 \n\4\r\4\16\4!\3\4\3\4\3\5\3\5\5")
        buf.write("\5(\n\5\3\6\3\6\7\6,\n\6\f\6\16\6/\13\6\3\6\3\6\3\7\3")
        buf.write("\7\3\7\3\7\3\7\7\78\n\7\f\7\16\7;\13\7\3\7\3\7\5\7?\n")
        buf.write("\7\3\b\3\b\5\bC\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13")
        buf.write("\3\13\6\13N\n\13\r\13\16\13O\3\13\3\13\3\13\2\2\f\2\4")
        buf.write("\6\b\n\f\16\20\22\24\2\2\2Q\2\27\3\2\2\2\4\31\3\2\2\2")
        buf.write("\6\34\3\2\2\2\b%\3\2\2\2\n-\3\2\2\2\f>\3\2\2\2\16@\3\2")
        buf.write("\2\2\20D\3\2\2\2\22F\3\2\2\2\24J\3\2\2\2\26\30\5\4\3\2")
        buf.write("\27\26\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\32\7\3\2")
        buf.write("\2\32\33\5\6\4\2\33\5\3\2\2\2\34\35\5\b\5\2\35\37\7\16")
        buf.write("\2\2\36 \5\24\13\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2")
        buf.write("!\"\3\2\2\2\"#\3\2\2\2#$\7\17\2\2$\7\3\2\2\2%\'\5\n\6")
        buf.write("\2&(\5\f\7\2\'&\3\2\2\2\'(\3\2\2\2(\t\3\2\2\2)*\7\13\2")
        buf.write("\2*,\7\4\2\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.")
        buf.write("\60\3\2\2\2/-\3\2\2\2\60\61\7\13\2\2\61\13\3\2\2\2\62")
        buf.write("?\7\5\2\2\63\64\7\6\2\2\649\5\16\b\2\65\66\7\7\2\2\66")
        buf.write("8\5\16\b\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2")
        buf.write("\2:<\3\2\2\2;9\3\2\2\2<=\7\b\2\2=?\3\2\2\2>\62\3\2\2\2")
        buf.write(">\63\3\2\2\2?\r\3\2\2\2@B\5\20\t\2AC\5\22\n\2BA\3\2\2")
        buf.write("\2BC\3\2\2\2C\17\3\2\2\2DE\7\13\2\2E\21\3\2\2\2FG\7\t")
        buf.write("\2\2GH\7\13\2\2HI\7\t\2\2I\23\3\2\2\2JK\7\n\2\2KM\7\16")
        buf.write("\2\2LN\5\6\4\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2")
        buf.write("PQ\3\2\2\2QR\7\17\2\2R\25\3\2\2\2\n\27!\'-9>BO")
        return buf.getvalue()


class UVLParser ( Parser ):

    grammarFileName = "UVL.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'features'", "'.'", "'{}'", "'{'", "','", 
                     "'}'", "'\"'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "KEYWORD", "WORD", "WS", "NL", "INDENT", "DEDENT" ]

    RULE_feature_model = 0
    RULE_features = 1
    RULE_child = 2
    RULE_feature_spec = 3
    RULE_ref = 4
    RULE_attributes = 5
    RULE_attribute = 6
    RULE_key = 7
    RULE_value = 8
    RULE_relationship = 9

    ruleNames =  [ "feature_model", "features", "child", "feature_spec", 
                   "ref", "attributes", "attribute", "key", "value", "relationship" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    KEYWORD=8
    WORD=9
    WS=10
    NL=11
    INDENT=12
    DEDENT=13

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
            self.state = 21
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==UVLParser.T__0:
                self.state = 20
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
            self.state = 23
            self.match(UVLParser.T__0)
            self.state = 24
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

        def feature_spec(self):
            return self.getTypedRuleContext(UVLParser.Feature_specContext,0)


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
            self.state = 26
            self.feature_spec()
            self.state = 27
            self.match(UVLParser.INDENT)
            self.state = 29 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 28
                self.relationship()
                self.state = 31 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==UVLParser.KEYWORD):
                    break

            self.state = 33
            self.match(UVLParser.DEDENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Feature_specContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ref(self):
            return self.getTypedRuleContext(UVLParser.RefContext,0)


        def attributes(self):
            return self.getTypedRuleContext(UVLParser.AttributesContext,0)


        def getRuleIndex(self):
            return UVLParser.RULE_feature_spec

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFeature_spec" ):
                listener.enterFeature_spec(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFeature_spec" ):
                listener.exitFeature_spec(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFeature_spec" ):
                return visitor.visitFeature_spec(self)
            else:
                return visitor.visitChildren(self)




    def feature_spec(self):

        localctx = UVLParser.Feature_specContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_feature_spec)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.ref()
            self.state = 37
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==UVLParser.T__2 or _la==UVLParser.T__3:
                self.state = 36
                self.attributes()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RefContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WORD(self, i:int=None):
            if i is None:
                return self.getTokens(UVLParser.WORD)
            else:
                return self.getToken(UVLParser.WORD, i)

        def getRuleIndex(self):
            return UVLParser.RULE_ref

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRef" ):
                listener.enterRef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRef" ):
                listener.exitRef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRef" ):
                return visitor.visitRef(self)
            else:
                return visitor.visitChildren(self)




    def ref(self):

        localctx = UVLParser.RefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_ref)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 39
                    self.match(UVLParser.WORD)
                    self.state = 40
                    self.match(UVLParser.T__1) 
                self.state = 45
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

            self.state = 46
            self.match(UVLParser.WORD)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AttributesContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def attribute(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(UVLParser.AttributeContext)
            else:
                return self.getTypedRuleContext(UVLParser.AttributeContext,i)


        def getRuleIndex(self):
            return UVLParser.RULE_attributes

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAttributes" ):
                listener.enterAttributes(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAttributes" ):
                listener.exitAttributes(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAttributes" ):
                return visitor.visitAttributes(self)
            else:
                return visitor.visitChildren(self)




    def attributes(self):

        localctx = UVLParser.AttributesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_attributes)
        self._la = 0 # Token type
        try:
            self.state = 60
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [UVLParser.T__2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 48
                self.match(UVLParser.T__2)
                pass
            elif token in [UVLParser.T__3]:
                self.enterOuterAlt(localctx, 2)
                self.state = 49
                self.match(UVLParser.T__3)
                self.state = 50
                self.attribute()
                self.state = 55
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==UVLParser.T__4:
                    self.state = 51
                    self.match(UVLParser.T__4)
                    self.state = 52
                    self.attribute()
                    self.state = 57
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 58
                self.match(UVLParser.T__5)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AttributeContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def key(self):
            return self.getTypedRuleContext(UVLParser.KeyContext,0)


        def value(self):
            return self.getTypedRuleContext(UVLParser.ValueContext,0)


        def getRuleIndex(self):
            return UVLParser.RULE_attribute

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAttribute" ):
                listener.enterAttribute(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAttribute" ):
                listener.exitAttribute(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAttribute" ):
                return visitor.visitAttribute(self)
            else:
                return visitor.visitChildren(self)




    def attribute(self):

        localctx = UVLParser.AttributeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_attribute)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 62
            self.key()
            self.state = 64
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==UVLParser.T__6:
                self.state = 63
                self.value()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class KeyContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(UVLParser.WORD, 0)

        def getRuleIndex(self):
            return UVLParser.RULE_key

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterKey" ):
                listener.enterKey(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitKey" ):
                listener.exitKey(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitKey" ):
                return visitor.visitKey(self)
            else:
                return visitor.visitChildren(self)




    def key(self):

        localctx = UVLParser.KeyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_key)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(UVLParser.WORD)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ValueContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(UVLParser.WORD, 0)

        def getRuleIndex(self):
            return UVLParser.RULE_value

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValue" ):
                listener.enterValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValue" ):
                listener.exitValue(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValue" ):
                return visitor.visitValue(self)
            else:
                return visitor.visitChildren(self)




    def value(self):

        localctx = UVLParser.ValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_value)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.match(UVLParser.T__6)
            self.state = 69
            self.match(UVLParser.WORD)
            self.state = 70
            self.match(UVLParser.T__6)
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
        self.enterRule(localctx, 18, self.RULE_relationship)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self.match(UVLParser.KEYWORD)
            self.state = 73
            self.match(UVLParser.INDENT)
            self.state = 75 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 74
                self.child()
                self.state = 77 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==UVLParser.WORD):
                    break

            self.state = 79
            self.match(UVLParser.DEDENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





