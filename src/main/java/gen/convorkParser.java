// Generated from /home/pedro/convork/src/main/java/convork.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class convorkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, WS=27, ENDL=28, Identifier=29, COMENTARIO=30, CADEIA=31, 
		COMENTARIO_NAO_FECHADO=32, ERRO_LEXICO=33;
	public static final int
		RULE_program = 0, RULE_source = 1, RULE_parameters = 2, RULE_parameter = 3, 
		RULE_header = 4, RULE_content = 5, RULE_footer = 6, RULE_element = 7, 
		RULE_colorParameter = 8, RULE_paddingParameter = 9, RULE_marginParameter = 10, 
		RULE_sizeParameter = 11, RULE_iconParameter = 12, RULE_hrefParameter = 13, 
		RULE_spacingParameter = 14, RULE_logo_element = 15, RULE_button_element = 16, 
		RULE_search_element = 17, RULE_carousel_element = 18, RULE_text_element = 19, 
		RULE_card_element = 20, RULE_container_element = 21, RULE_image_element = 22, 
		RULE_section_element = 23, RULE_row_element = 24, RULE_col_element = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "source", "parameters", "parameter", "header", "content", 
			"footer", "element", "colorParameter", "paddingParameter", "marginParameter", 
			"sizeParameter", "iconParameter", "hrefParameter", "spacingParameter", 
			"logo_element", "button_element", "search_element", "carousel_element", 
			"text_element", "card_element", "container_element", "image_element", 
			"section_element", "row_element", "col_element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'header('", "')'", "'{'", "'};'", "'content('", "'footer('", 
			"'color'", "'padding'", "'margin'", "'size'", "'icon'", "'href'", "'spacing'", 
			"'logo('", "'button('", "'search('", "'carousel('", "'text('", "');'", 
			"'card('", "'container('", "'image('", "'section('", "'row('", "'col('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WS", "ENDL", "Identifier", "COMENTARIO", "CADEIA", 
			"COMENTARIO_NAO_FECHADO", "ERRO_LEXICO"
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
	public String getGrammarFileName() { return "convork.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public convorkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(convorkParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(52);
				header();
				}
			}

			setState(55);
			content();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(56);
				footer();
				}
			}

			setState(59);
			match(EOF);
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

	public static class SourceContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(61);
				header();
				}
			}

			setState(64);
			content();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(65);
				footer();
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(68);
				parameter();
				}
				}
				setState(73);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(convorkParser.Identifier, 0); }
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(Identifier);
			setState(75);
			match(T__0);
			setState(76);
			match(CADEIA);
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

	public static class HeaderContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__1);
			setState(79);
			parameters();
			setState(80);
			match(T__2);
			setState(81);
			match(T__3);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(82);
				element();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T__4);
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

	public static class ContentContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__5);
			setState(91);
			parameters();
			setState(92);
			match(T__2);
			setState(93);
			match(T__3);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(94);
				element();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(T__4);
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

	public static class FooterContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitFooter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitFooter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_footer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__6);
			setState(103);
			parameters();
			setState(104);
			match(T__2);
			setState(105);
			match(T__3);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(106);
				element();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__4);
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

	public static class ElementContext extends ParserRuleContext {
		public Logo_elementContext logo_element() {
			return getRuleContext(Logo_elementContext.class,0);
		}
		public Button_elementContext button_element() {
			return getRuleContext(Button_elementContext.class,0);
		}
		public Search_elementContext search_element() {
			return getRuleContext(Search_elementContext.class,0);
		}
		public SpacingParameterContext spacingParameter() {
			return getRuleContext(SpacingParameterContext.class,0);
		}
		public Carousel_elementContext carousel_element() {
			return getRuleContext(Carousel_elementContext.class,0);
		}
		public Text_elementContext text_element() {
			return getRuleContext(Text_elementContext.class,0);
		}
		public Section_elementContext section_element() {
			return getRuleContext(Section_elementContext.class,0);
		}
		public Row_elementContext row_element() {
			return getRuleContext(Row_elementContext.class,0);
		}
		public Col_elementContext col_element() {
			return getRuleContext(Col_elementContext.class,0);
		}
		public Card_elementContext card_element() {
			return getRuleContext(Card_elementContext.class,0);
		}
		public Container_elementContext container_element() {
			return getRuleContext(Container_elementContext.class,0);
		}
		public Image_elementContext image_element() {
			return getRuleContext(Image_elementContext.class,0);
		}
		public SizeParameterContext sizeParameter() {
			return getRuleContext(SizeParameterContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_element);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				logo_element();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				button_element();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				search_element();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				spacingParameter();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				carousel_element();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				text_element();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				section_element();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				row_element();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				col_element();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 10);
				{
				setState(123);
				card_element();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 11);
				{
				setState(124);
				container_element();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 12);
				{
				setState(125);
				image_element();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 13);
				{
				setState(126);
				sizeParameter();
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

	public static class ColorParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public ColorParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterColorParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitColorParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitColorParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorParameterContext colorParameter() throws RecognitionException {
		ColorParameterContext _localctx = new ColorParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_colorParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__7);
			setState(130);
			match(T__0);
			setState(131);
			match(CADEIA);
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

	public static class PaddingParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public PaddingParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paddingParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterPaddingParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitPaddingParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitPaddingParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingParameterContext paddingParameter() throws RecognitionException {
		PaddingParameterContext _localctx = new PaddingParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paddingParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__8);
			setState(134);
			match(T__0);
			setState(135);
			match(CADEIA);
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

	public static class MarginParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public MarginParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marginParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterMarginParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitMarginParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitMarginParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarginParameterContext marginParameter() throws RecognitionException {
		MarginParameterContext _localctx = new MarginParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_marginParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__9);
			setState(138);
			match(T__0);
			setState(139);
			match(CADEIA);
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

	public static class SizeParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public SizeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterSizeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitSizeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitSizeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeParameterContext sizeParameter() throws RecognitionException {
		SizeParameterContext _localctx = new SizeParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sizeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__10);
			setState(142);
			match(T__0);
			setState(143);
			match(CADEIA);
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

	public static class IconParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public IconParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iconParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterIconParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitIconParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitIconParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconParameterContext iconParameter() throws RecognitionException {
		IconParameterContext _localctx = new IconParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iconParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__11);
			setState(146);
			match(T__0);
			setState(147);
			match(CADEIA);
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

	public static class HrefParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public HrefParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hrefParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterHrefParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitHrefParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitHrefParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HrefParameterContext hrefParameter() throws RecognitionException {
		HrefParameterContext _localctx = new HrefParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_hrefParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__12);
			setState(150);
			match(T__0);
			setState(151);
			match(CADEIA);
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

	public static class SpacingParameterContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public SpacingParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spacingParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterSpacingParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitSpacingParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitSpacingParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpacingParameterContext spacingParameter() throws RecognitionException {
		SpacingParameterContext _localctx = new SpacingParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_spacingParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__13);
			setState(154);
			match(T__0);
			setState(155);
			match(CADEIA);
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

	public static class Logo_elementContext extends ParserRuleContext {
		public List<SizeParameterContext> sizeParameter() {
			return getRuleContexts(SizeParameterContext.class);
		}
		public SizeParameterContext sizeParameter(int i) {
			return getRuleContext(SizeParameterContext.class,i);
		}
		public List<MarginParameterContext> marginParameter() {
			return getRuleContexts(MarginParameterContext.class);
		}
		public MarginParameterContext marginParameter(int i) {
			return getRuleContext(MarginParameterContext.class,i);
		}
		public List<PaddingParameterContext> paddingParameter() {
			return getRuleContexts(PaddingParameterContext.class);
		}
		public PaddingParameterContext paddingParameter(int i) {
			return getRuleContext(PaddingParameterContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Logo_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logo_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterLogo_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitLogo_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitLogo_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logo_elementContext logo_element() throws RecognitionException {
		Logo_elementContext _localctx = new Logo_elementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logo_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__14);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				setState(161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(158);
					sizeParameter();
					}
					break;
				case T__9:
					{
					setState(159);
					marginParameter();
					}
					break;
				case T__8:
					{
					setState(160);
					paddingParameter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(T__2);
			setState(167);
			match(T__3);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(168);
				element();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(T__4);
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

	public static class Button_elementContext extends ParserRuleContext {
		public List<SizeParameterContext> sizeParameter() {
			return getRuleContexts(SizeParameterContext.class);
		}
		public SizeParameterContext sizeParameter(int i) {
			return getRuleContext(SizeParameterContext.class,i);
		}
		public List<MarginParameterContext> marginParameter() {
			return getRuleContexts(MarginParameterContext.class);
		}
		public MarginParameterContext marginParameter(int i) {
			return getRuleContext(MarginParameterContext.class,i);
		}
		public List<PaddingParameterContext> paddingParameter() {
			return getRuleContexts(PaddingParameterContext.class);
		}
		public PaddingParameterContext paddingParameter(int i) {
			return getRuleContext(PaddingParameterContext.class,i);
		}
		public List<IconParameterContext> iconParameter() {
			return getRuleContexts(IconParameterContext.class);
		}
		public IconParameterContext iconParameter(int i) {
			return getRuleContext(IconParameterContext.class,i);
		}
		public List<ColorParameterContext> colorParameter() {
			return getRuleContexts(ColorParameterContext.class);
		}
		public ColorParameterContext colorParameter(int i) {
			return getRuleContext(ColorParameterContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Button_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterButton_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitButton_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitButton_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Button_elementContext button_element() throws RecognitionException {
		Button_elementContext _localctx = new Button_elementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_button_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__15);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(177);
					sizeParameter();
					}
					break;
				case T__9:
					{
					setState(178);
					marginParameter();
					}
					break;
				case T__8:
					{
					setState(179);
					paddingParameter();
					}
					break;
				case T__11:
					{
					setState(180);
					iconParameter();
					}
					break;
				case T__7:
					{
					setState(181);
					colorParameter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(T__2);
			setState(188);
			match(T__3);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(189);
				element();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(T__4);
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

	public static class Search_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Search_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterSearch_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitSearch_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitSearch_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_elementContext search_element() throws RecognitionException {
		Search_elementContext _localctx = new Search_elementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_search_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__16);
			setState(198);
			parameters();
			setState(199);
			match(T__2);
			setState(200);
			match(T__3);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(201);
				element();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(T__4);
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

	public static class Carousel_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Carousel_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carousel_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterCarousel_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitCarousel_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitCarousel_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Carousel_elementContext carousel_element() throws RecognitionException {
		Carousel_elementContext _localctx = new Carousel_elementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_carousel_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__17);
			setState(210);
			parameters();
			setState(211);
			match(T__2);
			setState(212);
			match(T__3);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(213);
				element();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(T__4);
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

	public static class Text_elementContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(convorkParser.CADEIA, 0); }
		public Text_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterText_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitText_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitText_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_elementContext text_element() throws RecognitionException {
		Text_elementContext _localctx = new Text_elementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_text_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__18);
			setState(222);
			match(CADEIA);
			setState(223);
			match(T__19);
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

	public static class Card_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Card_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterCard_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitCard_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitCard_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Card_elementContext card_element() throws RecognitionException {
		Card_elementContext _localctx = new Card_elementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_card_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__20);
			setState(226);
			parameters();
			setState(227);
			match(T__2);
			setState(228);
			match(T__3);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(229);
				element();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(T__4);
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

	public static class Container_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Container_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterContainer_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitContainer_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitContainer_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Container_elementContext container_element() throws RecognitionException {
		Container_elementContext _localctx = new Container_elementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_container_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__21);
			setState(238);
			parameters();
			setState(239);
			match(T__2);
			setState(240);
			match(T__3);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(241);
				element();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(T__4);
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

	public static class Image_elementContext extends ParserRuleContext {
		public HrefParameterContext hrefParameter() {
			return getRuleContext(HrefParameterContext.class,0);
		}
		public Image_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterImage_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitImage_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitImage_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Image_elementContext image_element() throws RecognitionException {
		Image_elementContext _localctx = new Image_elementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_image_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__22);
			setState(250);
			hrefParameter();
			setState(251);
			match(T__19);
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

	public static class Section_elementContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Section_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterSection_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitSection_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitSection_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Section_elementContext section_element() throws RecognitionException {
		Section_elementContext _localctx = new Section_elementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_section_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__23);
			setState(254);
			parameters();
			setState(255);
			match(T__2);
			setState(256);
			match(T__3);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(257);
				element();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(T__4);
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

	public static class Row_elementContext extends ParserRuleContext {
		public SpacingParameterContext spacingParameter() {
			return getRuleContext(SpacingParameterContext.class,0);
		}
		public List<Col_elementContext> col_element() {
			return getRuleContexts(Col_elementContext.class);
		}
		public Col_elementContext col_element(int i) {
			return getRuleContext(Col_elementContext.class,i);
		}
		public Row_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterRow_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitRow_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitRow_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_elementContext row_element() throws RecognitionException {
		Row_elementContext _localctx = new Row_elementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_row_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__24);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(266);
				spacingParameter();
				}
			}

			setState(269);
			match(T__2);
			setState(270);
			match(T__3);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(271);
				col_element();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(T__4);
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

	public static class Col_elementContext extends ParserRuleContext {
		public SpacingParameterContext spacingParameter() {
			return getRuleContext(SpacingParameterContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Col_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).enterCol_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof convorkListener ) ((convorkListener)listener).exitCol_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof convorkVisitor ) return ((convorkVisitor<? extends T>)visitor).visitCol_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Col_elementContext col_element() throws RecognitionException {
		Col_elementContext _localctx = new Col_elementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_col_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__25);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(280);
				spacingParameter();
				}
			}

			setState(283);
			match(T__2);
			setState(284);
			match(T__3);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				{
				setState(285);
				element();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(T__4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0128\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\5\28\n\2\3\2\3\2\5\2<\n\2\3\2\3\2\3\3\5\3A\n"+
		"\3\3\3\3\3\5\3E\n\3\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7"+
		"b\n\7\f\7\16\7e\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082"+
		"\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\7\21\u00a4\n\21\f\21\16\21\u00a7\13\21\3\21\3\21\3\21\7"+
		"\21\u00ac\n\21\f\21\16\21\u00af\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\7\22\u00b9\n\22\f\22\16\22\u00bc\13\22\3\22\3\22\3\22\7\22\u00c1"+
		"\n\22\f\22\16\22\u00c4\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00cd"+
		"\n\23\f\23\16\23\u00d0\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u00d9"+
		"\n\24\f\24\16\24\u00dc\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u00e9\n\26\f\26\16\26\u00ec\13\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u00f5\n\27\f\27\16\27\u00f8\13\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u0105\n\31\f\31\16\31"+
		"\u0108\13\31\3\31\3\31\3\32\3\32\5\32\u010e\n\32\3\32\3\32\3\32\7\32\u0113"+
		"\n\32\f\32\16\32\u0116\13\32\3\32\3\32\3\33\3\33\5\33\u011c\n\33\3\33"+
		"\3\33\3\33\7\33\u0121\n\33\f\33\16\33\u0124\13\33\3\33\3\33\3\33\2\2\34"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\2\u0134"+
		"\2\67\3\2\2\2\4@\3\2\2\2\6I\3\2\2\2\bL\3\2\2\2\nP\3\2\2\2\f\\\3\2\2\2"+
		"\16h\3\2\2\2\20\u0081\3\2\2\2\22\u0083\3\2\2\2\24\u0087\3\2\2\2\26\u008b"+
		"\3\2\2\2\30\u008f\3\2\2\2\32\u0093\3\2\2\2\34\u0097\3\2\2\2\36\u009b\3"+
		"\2\2\2 \u009f\3\2\2\2\"\u00b2\3\2\2\2$\u00c7\3\2\2\2&\u00d3\3\2\2\2(\u00df"+
		"\3\2\2\2*\u00e3\3\2\2\2,\u00ef\3\2\2\2.\u00fb\3\2\2\2\60\u00ff\3\2\2\2"+
		"\62\u010b\3\2\2\2\64\u0119\3\2\2\2\668\5\n\6\2\67\66\3\2\2\2\678\3\2\2"+
		"\289\3\2\2\29;\5\f\7\2:<\5\16\b\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\2"+
		"\2\3>\3\3\2\2\2?A\5\n\6\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BD\5\f\7\2CE\5"+
		"\16\b\2DC\3\2\2\2DE\3\2\2\2E\5\3\2\2\2FH\5\b\5\2GF\3\2\2\2HK\3\2\2\2I"+
		"G\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KI\3\2\2\2LM\7\37\2\2MN\7\3\2\2NO\7!\2\2"+
		"O\t\3\2\2\2PQ\7\4\2\2QR\5\6\4\2RS\7\5\2\2SW\7\6\2\2TV\5\20\t\2UT\3\2\2"+
		"\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\7\2\2[\13\3\2"+
		"\2\2\\]\7\b\2\2]^\5\6\4\2^_\7\5\2\2_c\7\6\2\2`b\5\20\t\2a`\3\2\2\2be\3"+
		"\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\7\2\2g\r\3\2\2\2hi"+
		"\7\t\2\2ij\5\6\4\2jk\7\5\2\2ko\7\6\2\2ln\5\20\t\2ml\3\2\2\2nq\3\2\2\2"+
		"om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\7\2\2s\17\3\2\2\2t\u0082"+
		"\5 \21\2u\u0082\5\"\22\2v\u0082\5$\23\2w\u0082\5\36\20\2x\u0082\5&\24"+
		"\2y\u0082\5(\25\2z\u0082\5\60\31\2{\u0082\5\62\32\2|\u0082\5\64\33\2}"+
		"\u0082\5*\26\2~\u0082\5,\27\2\177\u0082\5.\30\2\u0080\u0082\5\30\r\2\u0081"+
		"t\3\2\2\2\u0081u\3\2\2\2\u0081v\3\2\2\2\u0081w\3\2\2\2\u0081x\3\2\2\2"+
		"\u0081y\3\2\2\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081|\3\2\2\2\u0081}\3"+
		"\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\21\3"+
		"\2\2\2\u0083\u0084\7\n\2\2\u0084\u0085\7\3\2\2\u0085\u0086\7!\2\2\u0086"+
		"\23\3\2\2\2\u0087\u0088\7\13\2\2\u0088\u0089\7\3\2\2\u0089\u008a\7!\2"+
		"\2\u008a\25\3\2\2\2\u008b\u008c\7\f\2\2\u008c\u008d\7\3\2\2\u008d\u008e"+
		"\7!\2\2\u008e\27\3\2\2\2\u008f\u0090\7\r\2\2\u0090\u0091\7\3\2\2\u0091"+
		"\u0092\7!\2\2\u0092\31\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u0095\7\3\2"+
		"\2\u0095\u0096\7!\2\2\u0096\33\3\2\2\2\u0097\u0098\7\17\2\2\u0098\u0099"+
		"\7\3\2\2\u0099\u009a\7!\2\2\u009a\35\3\2\2\2\u009b\u009c\7\20\2\2\u009c"+
		"\u009d\7\3\2\2\u009d\u009e\7!\2\2\u009e\37\3\2\2\2\u009f\u00a5\7\21\2"+
		"\2\u00a0\u00a4\5\30\r\2\u00a1\u00a4\5\26\f\2\u00a2\u00a4\5\24\13\2\u00a3"+
		"\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00a9\7\5\2\2\u00a9\u00ad\7\6\2\2\u00aa\u00ac\5\20"+
		"\t\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\7"+
		"\2\2\u00b1!\3\2\2\2\u00b2\u00ba\7\22\2\2\u00b3\u00b9\5\30\r\2\u00b4\u00b9"+
		"\5\26\f\2\u00b5\u00b9\5\24\13\2\u00b6\u00b9\5\32\16\2\u00b7\u00b9\5\22"+
		"\n\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\7\5\2\2\u00be\u00c2\7\6\2\2\u00bf\u00c1\5\20\t\2\u00c0\u00bf\3"+
		"\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\7\2\2\u00c6#\3\2\2\2"+
		"\u00c7\u00c8\7\23\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00ca\7\5\2\2\u00ca\u00ce"+
		"\7\6\2\2\u00cb\u00cd\5\20\t\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d2\7\7\2\2\u00d2%\3\2\2\2\u00d3\u00d4\7\24\2\2\u00d4"+
		"\u00d5\5\6\4\2\u00d5\u00d6\7\5\2\2\u00d6\u00da\7\6\2\2\u00d7\u00d9\5\20"+
		"\t\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\7"+
		"\2\2\u00de\'\3\2\2\2\u00df\u00e0\7\25\2\2\u00e0\u00e1\7!\2\2\u00e1\u00e2"+
		"\7\26\2\2\u00e2)\3\2\2\2\u00e3\u00e4\7\27\2\2\u00e4\u00e5\5\6\4\2\u00e5"+
		"\u00e6\7\5\2\2\u00e6\u00ea\7\6\2\2\u00e7\u00e9\5\20\t\2\u00e8\u00e7\3"+
		"\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\7\2\2\u00ee+\3\2\2\2"+
		"\u00ef\u00f0\7\30\2\2\u00f0\u00f1\5\6\4\2\u00f1\u00f2\7\5\2\2\u00f2\u00f6"+
		"\7\6\2\2\u00f3\u00f5\5\20\t\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f9\u00fa\7\7\2\2\u00fa-\3\2\2\2\u00fb\u00fc\7\31\2\2\u00fc"+
		"\u00fd\5\34\17\2\u00fd\u00fe\7\26\2\2\u00fe/\3\2\2\2\u00ff\u0100\7\32"+
		"\2\2\u0100\u0101\5\6\4\2\u0101\u0102\7\5\2\2\u0102\u0106\7\6\2\2\u0103"+
		"\u0105\5\20\t\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010a\7\7\2\2\u010a\61\3\2\2\2\u010b\u010d\7\33\2\2\u010c\u010e\5\36"+
		"\20\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\7\5\2\2\u0110\u0114\7\6\2\2\u0111\u0113\5\64\33\2\u0112\u0111\3"+
		"\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\7\2\2\u0118\63\3\2\2"+
		"\2\u0119\u011b\7\34\2\2\u011a\u011c\5\36\20\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\5\2\2\u011e\u0122\7\6"+
		"\2\2\u011f\u0121\5\20\t\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0125\u0126\7\7\2\2\u0126\65\3\2\2\2\32\67;@DIWco\u0081\u00a3\u00a5"+
		"\u00ad\u00b8\u00ba\u00c2\u00ce\u00da\u00ea\u00f6\u0106\u010d\u0114\u011b"+
		"\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}