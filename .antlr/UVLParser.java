// Generated from /home/pabpazjim/diverso/uvl-diverso/uvl-diverso/UVL.g4 by ANTLR 4.8
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, RELATION_WORD=16, 
		WORD=17, BOOLEAN=18, NUMBER=19, VECTOR=20, VALUE=21, NL=22, WS=23, INDENT=24, 
		DEDENT=25;
	public static final int
		RULE_feature_model = 0, RULE_features = 1, RULE_child = 2, RULE_relation = 3, 
		RULE_feature_spec = 4, RULE_ref = 5, RULE_attributes = 6, RULE_attribute = 7, 
		RULE_key = 8, RULE_value = 9, RULE_relation_spec = 10, RULE_constraints = 11, 
		RULE_constraint = 12, RULE_negation = 13, RULE_conjunction = 14, RULE_disjuction = 15, 
		RULE_implication = 16, RULE_equivalence = 17, RULE_imports = 18, RULE_imp = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"feature_model", "features", "child", "relation", "feature_spec", "ref", 
			"attributes", "attribute", "key", "value", "relation_spec", "constraints", 
			"constraint", "negation", "conjunction", "disjuction", "implication", 
			"equivalence", "imports", "imp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'features'", "'.'", "'{}'", "'{'", "','", "'}'", "'\"'", "'constraints'", 
			"'!'", "'&'", "'|'", "'=>'", "'<=>'", "'imports'", "'as'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "RELATION_WORD", "WORD", "BOOLEAN", "NUMBER", 
			"VECTOR", "VALUE", "NL", "WS", "INDENT", "DEDENT"
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
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public FeaturesContext features() {
			return getRuleContext(FeaturesContext.class,0);
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(40);
				imports();
				}
			}

			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(43);
				features();
				}
			}

			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(46);
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
			setState(49);
			match(T__0);
			setState(50);
			match(INDENT);
			setState(51);
			child();
			setState(52);
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
			setState(54);
			feature_spec();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDENT) {
				{
				setState(55);
				match(INDENT);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RELATION_WORD) {
					{
					{
					setState(56);
					relation();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
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
			setState(65);
			relation_spec();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDENT) {
				{
				setState(66);
				match(INDENT);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(67);
					child();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
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
			setState(76);
			ref();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__3) {
				{
				setState(77);
				attributes();
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
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(WORD);
					setState(81);
					match(T__1);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(87);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__3);
				setState(91);
				attribute();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(92);
					match(T__4);
					setState(93);
					attribute();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
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
			setState(103);
			key();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(104);
				match(T__6);
				setState(105);
				value();
				setState(106);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(UVLParser.VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(VALUE);
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
			setState(114);
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
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
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
			setState(116);
			match(T__7);
			setState(117);
			match(INDENT);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==WORD) {
				{
				{
				setState(118);
				constraint();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constraint);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				negation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				conjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				disjuction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				implication();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				equivalence();
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
			setState(133);
			match(T__8);
			setState(134);
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
			setState(136);
			match(WORD);
			setState(137);
			match(T__9);
			setState(138);
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
			setState(140);
			match(WORD);
			setState(141);
			match(T__10);
			setState(142);
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
			setState(144);
			match(WORD);
			setState(145);
			match(T__11);
			setState(146);
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
			setState(148);
			match(WORD);
			setState(149);
			match(T__12);
			setState(150);
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
		enterRule(_localctx, 36, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__13);
			setState(153);
			match(INDENT);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(154);
				imp();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
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
		public ImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp; }
	}

	public final ImpContext imp() throws RecognitionException {
		ImpContext _localctx = new ImpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_imp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WORD);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(163);
				match(T__14);
				setState(164);
				match(WORD);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\5\2,\n\2\3\2\5\2/\n\2\3\2\5\2\62\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\5\4B\n"+
		"\4\3\5\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\5\5M\n\5\3\6\3\6\5\6Q\n\6\3"+
		"\7\3\7\7\7U\n\7\f\7\16\7X\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\ba\n\b\f"+
		"\b\16\bd\13\b\3\b\3\b\5\bh\n\b\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\7\rz\n\r\f\r\16\r}\13\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0086\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\7\24\u009e\n\24\f\24\16\24\u00a1\13\24\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u00a8\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2"+
		"\3\3\3\33\33\2\u00a8\2+\3\2\2\2\4\63\3\2\2\2\68\3\2\2\2\bC\3\2\2\2\nN"+
		"\3\2\2\2\fV\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2\26"+
		"t\3\2\2\2\30v\3\2\2\2\32\u0085\3\2\2\2\34\u0087\3\2\2\2\36\u008a\3\2\2"+
		"\2 \u008e\3\2\2\2\"\u0092\3\2\2\2$\u0096\3\2\2\2&\u009a\3\2\2\2(\u00a4"+
		"\3\2\2\2*,\5&\24\2+*\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/\5\4\3\2.-\3\2\2\2."+
		"/\3\2\2\2/\61\3\2\2\2\60\62\5\30\r\2\61\60\3\2\2\2\61\62\3\2\2\2\62\3"+
		"\3\2\2\2\63\64\7\3\2\2\64\65\7\32\2\2\65\66\5\6\4\2\66\67\7\33\2\2\67"+
		"\5\3\2\2\28A\5\n\6\29=\7\32\2\2:<\5\b\5\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2"+
		"\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@B\t\2\2\2A9\3\2\2\2AB\3\2\2\2B\7\3\2"+
		"\2\2CL\5\26\f\2DH\7\32\2\2EG\5\6\4\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3"+
		"\2\2\2IK\3\2\2\2JH\3\2\2\2KM\t\2\2\2LD\3\2\2\2LM\3\2\2\2M\t\3\2\2\2NP"+
		"\5\f\7\2OQ\5\16\b\2PO\3\2\2\2PQ\3\2\2\2Q\13\3\2\2\2RS\7\23\2\2SU\7\4\2"+
		"\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\23"+
		"\2\2Z\r\3\2\2\2[h\7\5\2\2\\]\7\6\2\2]b\5\20\t\2^_\7\7\2\2_a\5\20\t\2`"+
		"^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\b\2\2"+
		"fh\3\2\2\2g[\3\2\2\2g\\\3\2\2\2h\17\3\2\2\2in\5\22\n\2jk\7\t\2\2kl\5\24"+
		"\13\2lm\7\t\2\2mo\3\2\2\2nj\3\2\2\2no\3\2\2\2o\21\3\2\2\2pq\7\23\2\2q"+
		"\23\3\2\2\2rs\7\27\2\2s\25\3\2\2\2tu\7\22\2\2u\27\3\2\2\2vw\7\n\2\2w{"+
		"\7\32\2\2xz\5\32\16\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2"+
		"\2}{\3\2\2\2~\177\7\33\2\2\177\31\3\2\2\2\u0080\u0086\5\34\17\2\u0081"+
		"\u0086\5\36\20\2\u0082\u0086\5 \21\2\u0083\u0086\5\"\22\2\u0084\u0086"+
		"\5$\23\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\33\3\2\2\2\u0087\u0088\7\13\2"+
		"\2\u0088\u0089\7\23\2\2\u0089\35\3\2\2\2\u008a\u008b\7\23\2\2\u008b\u008c"+
		"\7\f\2\2\u008c\u008d\7\23\2\2\u008d\37\3\2\2\2\u008e\u008f\7\23\2\2\u008f"+
		"\u0090\7\r\2\2\u0090\u0091\7\23\2\2\u0091!\3\2\2\2\u0092\u0093\7\23\2"+
		"\2\u0093\u0094\7\16\2\2\u0094\u0095\7\23\2\2\u0095#\3\2\2\2\u0096\u0097"+
		"\7\23\2\2\u0097\u0098\7\17\2\2\u0098\u0099\7\23\2\2\u0099%\3\2\2\2\u009a"+
		"\u009b\7\20\2\2\u009b\u009f\7\32\2\2\u009c\u009e\5(\25\2\u009d\u009c\3"+
		"\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\33\2\2\u00a3\'\3\2\2"+
		"\2\u00a4\u00a7\7\23\2\2\u00a5\u00a6\7\21\2\2\u00a6\u00a8\7\23\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8)\3\2\2\2\22+.\61=AHLPVbgn{\u0085"+
		"\u009f\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}