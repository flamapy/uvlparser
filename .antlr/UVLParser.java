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
		RELATION_WORD=18, WORD=19, BOOLEAN=20, NUMBER=21, VECTOR=22, NL=23, WS=24, 
		INDENT=25, DEDENT=26;
	public static final int
		RULE_feature_model = 0, RULE_features = 1, RULE_child = 2, RULE_relation = 3, 
		RULE_feature_spec = 4, RULE_ref = 5, RULE_attributes = 6, RULE_attribute = 7, 
		RULE_key = 8, RULE_value = 9, RULE_relation_spec = 10, RULE_constraints = 11, 
		RULE_constraint = 12, RULE_negation = 13, RULE_conjunction = 14, RULE_disjuction = 15, 
		RULE_implication = 16, RULE_equivalence = 17, RULE_requires = 18, RULE_excludes = 19, 
		RULE_imports = 20, RULE_imp = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"feature_model", "features", "child", "relation", "feature_spec", "ref", 
			"attributes", "attribute", "key", "value", "relation_spec", "constraints", 
			"constraint", "negation", "conjunction", "disjuction", "implication", 
			"equivalence", "requires", "excludes", "imports", "imp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'features'", "'.'", "'{}'", "'{'", "','", "'}'", "'\"'", "'constraints'", 
			"'!'", "'&'", "'|'", "'=>'", "'<=>'", "'requires'", "'excludes'", "'imports'", 
			"'as'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "RELATION_WORD", "WORD", "BOOLEAN", 
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
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
		}
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(44);
				imports();
				}
			}

			setState(47);
			features();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(48);
				constraints();
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
		enterRule(_localctx, 2, RULE_features);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(INDENT);
			setState(53);
			child();
			setState(54);
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
		enterRule(_localctx, 4, RULE_child);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			feature_spec();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDENT) {
				{
				setState(57);
				match(INDENT);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RELATION_WORD) {
					{
					{
					setState(58);
					relation();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
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
		enterRule(_localctx, 6, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			relation_spec();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDENT) {
				{
				setState(68);
				match(INDENT);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(69);
					child();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
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
		enterRule(_localctx, 8, RULE_feature_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			ref();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__3) {
				{
				setState(79);
				attributes();
				}
			}

			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(82);
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
		enterRule(_localctx, 10, RULE_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					match(WORD);
					setState(86);
					match(T__1);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(92);
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
		enterRule(_localctx, 12, RULE_attributes);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__3);
				setState(96);
				attribute();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(97);
					match(T__4);
					setState(98);
					attribute();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(T__5);
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
		enterRule(_localctx, 14, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			key();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(109);
				match(T__6);
				setState(110);
				value();
				setState(111);
				match(T__6);
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
		enterRule(_localctx, 16, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		enterRule(_localctx, 20, RULE_relation_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		enterRule(_localctx, 22, RULE_constraints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__7);
			setState(122);
			match(INDENT);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==WORD) {
				{
				{
				setState(123);
				constraint();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(124);
					match(NL);
					}
				}

				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
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
		enterRule(_localctx, 24, RULE_constraint);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				negation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				conjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				disjuction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				implication();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				equivalence();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				requires();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
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
		enterRule(_localctx, 26, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__8);
			setState(144);
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
		enterRule(_localctx, 28, RULE_conjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(WORD);
			setState(147);
			match(T__9);
			setState(148);
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
		enterRule(_localctx, 30, RULE_disjuction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(WORD);
			setState(151);
			match(T__10);
			setState(152);
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
		enterRule(_localctx, 32, RULE_implication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(WORD);
			setState(155);
			match(T__11);
			setState(156);
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
		enterRule(_localctx, 34, RULE_equivalence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(WORD);
			setState(159);
			match(T__12);
			setState(160);
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
		enterRule(_localctx, 36, RULE_requires);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WORD);
			setState(163);
			match(T__13);
			setState(164);
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
		enterRule(_localctx, 38, RULE_excludes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(WORD);
			setState(167);
			match(T__14);
			setState(168);
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
		enterRule(_localctx, 40, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__15);
			setState(171);
			match(INDENT);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(172);
				imp();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
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
		public List<TerminalNode> WORD() { return getTokens(UVLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(UVLParser.WORD, i);
		}
		public TerminalNode NL() { return getToken(UVLParser.NL, 0); }
		public ImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp; }
	}

	public final ImpContext imp() throws RecognitionException {
		ImpContext _localctx = new ImpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_imp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WORD);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(181);
				match(T__16);
				setState(182);
				match(WORD);
				}
			}

			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(185);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00bf\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\5\2\60\n\2\3\2"+
		"\3\2\5\2\64\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13"+
		"\4\3\4\5\4D\n\4\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\5\5O\n\5\3\6\3"+
		"\6\5\6S\n\6\3\6\5\6V\n\6\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\5\tt\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0080\n"+
		"\r\7\r\u0082\n\r\f\r\16\r\u0085\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0090\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u00b0\n\26\f\26\16\26\u00b3\13"+
		"\26\3\26\3\26\3\27\3\27\3\27\5\27\u00ba\n\27\3\27\5\27\u00bd\n\27\3\27"+
		"\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4\3\3\34\34\3"+
		"\2\25\30\2\u00bf\2/\3\2\2\2\4\65\3\2\2\2\6:\3\2\2\2\bE\3\2\2\2\nP\3\2"+
		"\2\2\f[\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2\22u\3\2\2\2\24w\3\2\2\2\26y\3"+
		"\2\2\2\30{\3\2\2\2\32\u008f\3\2\2\2\34\u0091\3\2\2\2\36\u0094\3\2\2\2"+
		" \u0098\3\2\2\2\"\u009c\3\2\2\2$\u00a0\3\2\2\2&\u00a4\3\2\2\2(\u00a8\3"+
		"\2\2\2*\u00ac\3\2\2\2,\u00b6\3\2\2\2.\60\5*\26\2/.\3\2\2\2/\60\3\2\2\2"+
		"\60\61\3\2\2\2\61\63\5\4\3\2\62\64\5\30\r\2\63\62\3\2\2\2\63\64\3\2\2"+
		"\2\64\3\3\2\2\2\65\66\7\3\2\2\66\67\7\33\2\2\678\5\6\4\289\7\34\2\29\5"+
		"\3\2\2\2:C\5\n\6\2;?\7\33\2\2<>\5\b\5\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2"+
		"?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BD\t\2\2\2C;\3\2\2\2CD\3\2\2\2D\7\3\2\2"+
		"\2EN\5\26\f\2FJ\7\33\2\2GI\5\6\4\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2"+
		"\2\2KM\3\2\2\2LJ\3\2\2\2MO\t\2\2\2NF\3\2\2\2NO\3\2\2\2O\t\3\2\2\2PR\5"+
		"\f\7\2QS\5\16\b\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\7\31\2\2UT\3\2\2\2U"+
		"V\3\2\2\2V\13\3\2\2\2WX\7\25\2\2XZ\7\4\2\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2"+
		"\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\25\2\2_\r\3\2\2\2`m\7\5\2\2ab\7"+
		"\6\2\2bg\5\20\t\2cd\7\7\2\2df\5\20\t\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2g"+
		"h\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\b\2\2km\3\2\2\2l`\3\2\2\2la\3\2\2\2"+
		"m\17\3\2\2\2ns\5\22\n\2op\7\t\2\2pq\5\24\13\2qr\7\t\2\2rt\3\2\2\2so\3"+
		"\2\2\2st\3\2\2\2t\21\3\2\2\2uv\7\25\2\2v\23\3\2\2\2wx\t\3\2\2x\25\3\2"+
		"\2\2yz\7\24\2\2z\27\3\2\2\2{|\7\n\2\2|\u0083\7\33\2\2}\177\5\32\16\2~"+
		"\u0080\7\31\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081"+
		"}\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\t\2\2\2\u0087\31"+
		"\3\2\2\2\u0088\u0090\5\34\17\2\u0089\u0090\5\36\20\2\u008a\u0090\5 \21"+
		"\2\u008b\u0090\5\"\22\2\u008c\u0090\5$\23\2\u008d\u0090\5&\24\2\u008e"+
		"\u0090\5(\25\2\u008f\u0088\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2"+
		"\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\33\3\2\2\2\u0091\u0092\7\13\2\2\u0092\u0093\7\25"+
		"\2\2\u0093\35\3\2\2\2\u0094\u0095\7\25\2\2\u0095\u0096\7\f\2\2\u0096\u0097"+
		"\7\25\2\2\u0097\37\3\2\2\2\u0098\u0099\7\25\2\2\u0099\u009a\7\r\2\2\u009a"+
		"\u009b\7\25\2\2\u009b!\3\2\2\2\u009c\u009d\7\25\2\2\u009d\u009e\7\16\2"+
		"\2\u009e\u009f\7\25\2\2\u009f#\3\2\2\2\u00a0\u00a1\7\25\2\2\u00a1\u00a2"+
		"\7\17\2\2\u00a2\u00a3\7\25\2\2\u00a3%\3\2\2\2\u00a4\u00a5\7\25\2\2\u00a5"+
		"\u00a6\7\20\2\2\u00a6\u00a7\7\25\2\2\u00a7\'\3\2\2\2\u00a8\u00a9\7\25"+
		"\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\7\25\2\2\u00ab)\3\2\2\2\u00ac\u00ad"+
		"\7\22\2\2\u00ad\u00b1\7\33\2\2\u00ae\u00b0\5,\27\2\u00af\u00ae\3\2\2\2"+
		"\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\34\2\2\u00b5+\3\2\2\2\u00b6"+
		"\u00b9\7\25\2\2\u00b7\u00b8\7\23\2\2\u00b8\u00ba\7\25\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\7\31\2\2"+
		"\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd-\3\2\2\2\24/\63?CJNRU["+
		"gls\177\u0083\u008f\u00b1\u00b9\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}