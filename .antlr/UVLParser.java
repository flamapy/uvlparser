// Generated from /home/pabpazjim/diverso/uvl-diverso/uvl-diverso/uvlparser/uvlparser/UVL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UVLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, RELATION_WORD=19, WORD=20, BOOLEAN=21, NUMBER=22, VECTOR=23, 
		NL=24, WS=25, INDENT=26, DEDENT=27;
	public static final int
		RULE_feature_model = 0, RULE_namespace = 1, RULE_features = 2, RULE_child = 3, 
		RULE_relation = 4, RULE_feature_spec = 5, RULE_ref = 6, RULE_attributes = 7, 
		RULE_attribute = 8, RULE_key = 9, RULE_value = 10, RULE_relation_spec = 11, 
		RULE_constraints = 12, RULE_constraint = 13, RULE_negation = 14, RULE_conjunction = 15, 
		RULE_disjuction = 16, RULE_implication = 17, RULE_equivalence = 18, RULE_requires = 19, 
		RULE_excludes = 20, RULE_imports = 21, RULE_imp = 22, RULE_imp_spec = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"feature_model", "namespace", "features", "child", "relation", "feature_spec", 
			"ref", "attributes", "attribute", "key", "value", "relation_spec", "constraints", 
			"constraint", "negation", "conjunction", "disjuction", "implication", 
			"equivalence", "requires", "excludes", "imports", "imp", "imp_spec"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'namespace'", "'features'", "'.'", "'{}'", "'{'", "','", "'}'", 
			"'\"'", "'constraints'", "'!'", "'&'", "'|'", "'=>'", "'<=>'", "'requires'", 
			"'excludes'", "'imports'", "'as'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "RELATION_WORD", "WORD", "BOOLEAN", 
			"NUMBER", "VECTOR", "NL", "WS", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "UVL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UVLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Feature_modelContext extends ParserRuleContext {
		public FeaturesContext features() {
			return getRuleContext(FeaturesContext.class,0);
		}
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(UVLParser.EOF, 0); }
		public Feature_modelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_model; }
	}

	public final Feature_modelContext feature_model() throws RecognitionException {
		Feature_modelContext _localctx = new Feature_modelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_feature_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(48);
				namespace();
				}
			}

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(51);
				imports();
				}
			}

			setState(54);
			features();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(55);
				constraints();
				}
			}

			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(58);
				match(EOF);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(UVLParser.WORD, 0); }
		public List<TerminalNode> NL() { return getTokens(UVLParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(UVLParser.NL, i);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			match(WORD);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(63);
				match(NL);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeaturesContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(UVLParser.INDENT, 0); }
		public ChildContext child() {
			return getRuleContext(ChildContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(UVLParser.DEDENT, 0); }
		public FeaturesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_features; }
	}

	public final FeaturesContext features() throws RecognitionException {
		FeaturesContext _localctx = new FeaturesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_features);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__1);
			setState(70);
			match(INDENT);
			setState(71);
			child();
			setState(72);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildContext extends ParserRuleContext {
		public Feature_specContext feature_spec() {
			return getRuleContext(Feature_specContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(UVLParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(UVLParser.DEDENT, 0); }
		public TerminalNode EOF() { return getToken(UVLParser.EOF, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_child);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			feature_spec();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDENT) {
				{
				setState(75);
				match(INDENT);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RELATION_WORD) {
					{
					{
					setState(76);
					relation();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==DEDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public Relation_specContext relation_spec() {
			return getRuleContext(Relation_specContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(UVLParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(UVLParser.DEDENT, 0); }
		public TerminalNode EOF() { return getToken(UVLParser.EOF, 0); }
		public List<ChildContext> child() {
			return getRuleContexts(ChildContext.class);
		}
		public ChildContext child(int i) {
			return getRuleContext(ChildContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			relation_spec();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDENT) {
				{
				setState(86);
				match(INDENT);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(87);
					child();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==DEDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Feature_specContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode NL() { return getToken(UVLParser.NL, 0); }
		public Feature_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_spec; }
	}

	public final Feature_specContext feature_spec() throws RecognitionException {
		Feature_specContext _localctx = new Feature_specContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_feature_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			ref();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(97);
				attributes();
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(100);
				match(NL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(UVLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(UVLParser.WORD, i);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(WORD);
					setState(104);
					match(T__2);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(110);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attributes);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__4);
				setState(114);
				attribute();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(115);
					match(T__5);
					setState(116);
					attribute();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			key();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(127);
				match(T__7);
				setState(128);
				value();
				setState(129);
				match(T__7);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(UVLParser.WORD, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(UVLParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(UVLParser.NUMBER, 0); }
		public TerminalNode WORD() { return getToken(UVLParser.WORD, 0); }
		public TerminalNode VECTOR() { return getToken(UVLParser.VECTOR, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << BOOLEAN) | (1L << NUMBER) | (1L << VECTOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relation_specContext extends ParserRuleContext {
		public TerminalNode RELATION_WORD() { return getToken(UVLParser.RELATION_WORD, 0); }
		public Relation_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_spec; }
	}

	public final Relation_specContext relation_spec() throws RecognitionException {
		Relation_specContext _localctx = new Relation_specContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relation_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(RELATION_WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintsContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(UVLParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(UVLParser.DEDENT, 0); }
		public TerminalNode EOF() { return getToken(UVLParser.EOF, 0); }
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(UVLParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(UVLParser.NL, i);
		}
		public ConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraints; }
	}

	public final ConstraintsContext constraints() throws RecognitionException {
		ConstraintsContext _localctx = new ConstraintsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constraints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__8);
			setState(140);
			match(INDENT);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==WORD) {
				{
				{
				setState(141);
				constraint();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(142);
					match(NL);
					}
				}

				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==DEDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public DisjuctionContext disjuction() {
			return getRuleContext(DisjuctionContext.class,0);
		}
		public ImplicationContext implication() {
			return getRuleContext(ImplicationContext.class,0);
		}
		public EquivalenceContext equivalence() {
			return getRuleContext(EquivalenceContext.class,0);
		}
		public RequiresContext requires() {
			return getRuleContext(RequiresContext.class,0);
		}
		public ExcludesContext excludes() {
			return getRuleContext(ExcludesContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constraint);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				negation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				conjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				disjuction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				implication();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				equivalence();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				requires();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				excludes();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegationContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(UVLParser.WORD, 0); }
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__9);
			setState(162);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(UVLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(UVLParser.WORD, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(WORD);
			setState(165);
			match(T__10);
			setState(166);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisjuctionContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(UVLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(UVLParser.WORD, i);
		}
		public DisjuctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjuction; }
	}

	public final DisjuctionContext disjuction() throws RecognitionException {
		DisjuctionContext _localctx = new DisjuctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_disjuction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(WORD);
			setState(169);
			match(T__11);
			setState(170);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicationContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(UVLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(UVLParser.WORD, i);
		}
		public ImplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication; }
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_implication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(WORD);
			setState(173);
			match(T__12);
			setState(174);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquivalenceContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(UVLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(UVLParser.WORD, i);
		}
		public EquivalenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equivalence; }
	}

	public final EquivalenceContext equivalence() throws RecognitionException {
		EquivalenceContext _localctx = new EquivalenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_equivalence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(WORD);
			setState(177);
			match(T__13);
			setState(178);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiresContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(UVLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(UVLParser.WORD, i);
		}
		public RequiresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requires; }
	}

	public final RequiresContext requires() throws RecognitionException {
		RequiresContext _localctx = new RequiresContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_requires);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WORD);
			setState(181);
			match(T__14);
			setState(182);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExcludesContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(UVLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(UVLParser.WORD, i);
		}
		public ExcludesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excludes; }
	}

	public final ExcludesContext excludes() throws RecognitionException {
		ExcludesContext _localctx = new ExcludesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_excludes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(WORD);
			setState(185);
			match(T__15);
			setState(186);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(UVLParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(UVLParser.DEDENT, 0); }
		public List<ImpContext> imp() {
			return getRuleContexts(ImpContext.class);
		}
		public ImpContext imp(int i) {
			return getRuleContext(ImpContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__16);
			setState(189);
			match(INDENT);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(190);
				imp();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpContext extends ParserRuleContext {
		public Imp_specContext imp_spec() {
			return getRuleContext(Imp_specContext.class,0);
		}
		public TerminalNode WORD() { return getToken(UVLParser.WORD, 0); }
		public TerminalNode NL() { return getToken(UVLParser.NL, 0); }
		public ImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp; }
	}

	public final ImpContext imp() throws RecognitionException {
		ImpContext _localctx = new ImpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_imp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			imp_spec();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(199);
				match(T__17);
				setState(200);
				match(WORD);
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(203);
				match(NL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Imp_specContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(UVLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(UVLParser.WORD, i);
		}
		public Imp_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp_spec; }
	}

	public final Imp_specContext imp_spec() throws RecognitionException {
		Imp_specContext _localctx = new Imp_specContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_imp_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(WORD);
			setState(207);
			match(T__2);
			setState(208);
			match(WORD);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(209);
				match(T__2);
				setState(210);
				match(WORD);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\5\2\67\n\2\3\2\3\2\5\2;\n\2\3\2\5\2>\n\2\3\3\3\3\3"+
		"\3\7\3C\n\3\f\3\16\3F\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5P\n\5\f"+
		"\5\16\5S\13\5\3\5\5\5V\n\5\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\5\6"+
		"a\n\6\3\7\3\7\5\7e\n\7\3\7\5\7h\n\7\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tx\n\t\f\t\16\t{\13\t\3\t\3\t\5\t\177\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u0086\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16\u0092\n\16\7\16\u0094\n\16\f\16\16\16\u0097\13\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a2\n\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27"+
		"\u00c2\n\27\f\27\16\27\u00c5\13\27\3\27\3\27\3\30\3\30\3\30\5\30\u00cc"+
		"\n\30\3\30\5\30\u00cf\n\30\3\31\3\31\3\31\3\31\3\31\7\31\u00d6\n\31\f"+
		"\31\16\31\u00d9\13\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\4\3\3\35\35\3\2\26\31\2\u00dd\2\63\3\2\2\2\4?\3\2\2"+
		"\2\6G\3\2\2\2\bL\3\2\2\2\nW\3\2\2\2\fb\3\2\2\2\16m\3\2\2\2\20~\3\2\2\2"+
		"\22\u0080\3\2\2\2\24\u0087\3\2\2\2\26\u0089\3\2\2\2\30\u008b\3\2\2\2\32"+
		"\u008d\3\2\2\2\34\u00a1\3\2\2\2\36\u00a3\3\2\2\2 \u00a6\3\2\2\2\"\u00aa"+
		"\3\2\2\2$\u00ae\3\2\2\2&\u00b2\3\2\2\2(\u00b6\3\2\2\2*\u00ba\3\2\2\2,"+
		"\u00be\3\2\2\2.\u00c8\3\2\2\2\60\u00d0\3\2\2\2\62\64\5\4\3\2\63\62\3\2"+
		"\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5,\27\2\66\65\3\2\2\2\66\67\3\2"+
		"\2\2\678\3\2\2\28:\5\6\4\29;\5\32\16\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<"+
		">\7\2\2\3=<\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?@\7\3\2\2@D\7\26\2\2AC\7\32\2"+
		"\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\5\3\2\2\2FD\3\2\2\2GH\7\4"+
		"\2\2HI\7\34\2\2IJ\5\b\5\2JK\7\35\2\2K\7\3\2\2\2LU\5\f\7\2MQ\7\34\2\2N"+
		"P\5\n\6\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2"+
		"TV\t\2\2\2UM\3\2\2\2UV\3\2\2\2V\t\3\2\2\2W`\5\30\r\2X\\\7\34\2\2Y[\5\b"+
		"\5\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_a"+
		"\t\2\2\2`X\3\2\2\2`a\3\2\2\2a\13\3\2\2\2bd\5\16\b\2ce\5\20\t\2dc\3\2\2"+
		"\2de\3\2\2\2eg\3\2\2\2fh\7\32\2\2gf\3\2\2\2gh\3\2\2\2h\r\3\2\2\2ij\7\26"+
		"\2\2jl\7\5\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2"+
		"\2\2pq\7\26\2\2q\17\3\2\2\2r\177\7\6\2\2st\7\7\2\2ty\5\22\n\2uv\7\b\2"+
		"\2vx\5\22\n\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2"+
		"\2\2|}\7\t\2\2}\177\3\2\2\2~r\3\2\2\2~s\3\2\2\2\177\21\3\2\2\2\u0080\u0085"+
		"\5\24\13\2\u0081\u0082\7\n\2\2\u0082\u0083\5\26\f\2\u0083\u0084\7\n\2"+
		"\2\u0084\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0086\3\2\2\2\u0086\23"+
		"\3\2\2\2\u0087\u0088\7\26\2\2\u0088\25\3\2\2\2\u0089\u008a\t\3\2\2\u008a"+
		"\27\3\2\2\2\u008b\u008c\7\25\2\2\u008c\31\3\2\2\2\u008d\u008e\7\13\2\2"+
		"\u008e\u0095\7\34\2\2\u008f\u0091\5\34\17\2\u0090\u0092\7\32\2\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u008f\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\t\2\2\2\u0099\33\3\2\2"+
		"\2\u009a\u00a2\5\36\20\2\u009b\u00a2\5 \21\2\u009c\u00a2\5\"\22\2\u009d"+
		"\u00a2\5$\23\2\u009e\u00a2\5&\24\2\u009f\u00a2\5(\25\2\u00a0\u00a2\5*"+
		"\26\2\u00a1\u009a\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1"+
		"\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7\26\2\2\u00a5\37"+
		"\3\2\2\2\u00a6\u00a7\7\26\2\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\7\26\2\2"+
		"\u00a9!\3\2\2\2\u00aa\u00ab\7\26\2\2\u00ab\u00ac\7\16\2\2\u00ac\u00ad"+
		"\7\26\2\2\u00ad#\3\2\2\2\u00ae\u00af\7\26\2\2\u00af\u00b0\7\17\2\2\u00b0"+
		"\u00b1\7\26\2\2\u00b1%\3\2\2\2\u00b2\u00b3\7\26\2\2\u00b3\u00b4\7\20\2"+
		"\2\u00b4\u00b5\7\26\2\2\u00b5\'\3\2\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8"+
		"\7\21\2\2\u00b8\u00b9\7\26\2\2\u00b9)\3\2\2\2\u00ba\u00bb\7\26\2\2\u00bb"+
		"\u00bc\7\22\2\2\u00bc\u00bd\7\26\2\2\u00bd+\3\2\2\2\u00be\u00bf\7\23\2"+
		"\2\u00bf\u00c3\7\34\2\2\u00c0\u00c2\5.\30\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\35\2\2\u00c7-\3\2\2\2\u00c8\u00cb"+
		"\5\60\31\2\u00c9\u00ca\7\24\2\2\u00ca\u00cc\7\26\2\2\u00cb\u00c9\3\2\2"+
		"\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf\7\32\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf/\3\2\2\2\u00d0\u00d1\7\26\2\2"+
		"\u00d1\u00d2\7\5\2\2\u00d2\u00d7\7\26\2\2\u00d3\u00d4\7\5\2\2\u00d4\u00d6"+
		"\7\26\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\61\3\2\2\2\u00d9\u00d7\3\2\2\2\30\63\66:=D"+
		"QU\\`dgmy~\u0085\u0091\u0095\u00a1\u00c3\u00cb\u00ce\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}