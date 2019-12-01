// Generated from /home/pedro/convork/src/main/java/convork.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class convorkLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "ALGARISMO", "LETRA", "WS", "ENDL", "Identifier", "COMENTARIO", 
			"CADEIA", "COMENTARIO_NAO_FECHADO", "ERRO_LEXICO"
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

	void erroLexico(String msg) { throw new ParseCancellationException(msg); }

	public convorkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "convork.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 33:
			COMENTARIO_NAO_FECHADO_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			ERRO_LEXICO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_NAO_FECHADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			erroLexico("Linha " + (getLine()+1) + ": comentario nao fechado");
			break;
		}
	}
	private void ERRO_LEXICO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			erroLexico("Linha " + getLine() + ": " + getText() + " - simbolo nao identificado");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0128\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		" \3 \5 \u00fa\n \3 \3 \3 \7 \u00ff\n \f \16 \u0102\13 \3!\3!\3!\3!\7!"+
		"\u0108\n!\f!\16!\u010b\13!\3!\3!\3!\3!\3!\3\"\3\"\7\"\u0114\n\"\f\"\16"+
		"\"\u0117\13\"\3\"\3\"\3#\3#\3#\3#\7#\u011f\n#\f#\16#\u0122\13#\3#\3#\3"+
		"$\3$\3$\3\u0120\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\29\2;\35=\36?\37A C!E\"G#\3\2\6\4\2C\\c|\4\2\13\f\17\17\5\2"+
		"\f\f\17\17\177\177\5\2\f\f\17\17$$\2\u012c\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3"+
		"\2\2\2\rZ\3\2\2\2\17c\3\2\2\2\21k\3\2\2\2\23q\3\2\2\2\25y\3\2\2\2\27\u0080"+
		"\3\2\2\2\31\u0085\3\2\2\2\33\u008a\3\2\2\2\35\u008f\3\2\2\2\37\u0097\3"+
		"\2\2\2!\u009d\3\2\2\2#\u00a5\3\2\2\2%\u00ad\3\2\2\2\'\u00b7\3\2\2\2)\u00bd"+
		"\3\2\2\2+\u00c0\3\2\2\2-\u00c6\3\2\2\2/\u00d1\3\2\2\2\61\u00d8\3\2\2\2"+
		"\63\u00e1\3\2\2\2\65\u00e6\3\2\2\2\67\u00eb\3\2\2\29\u00ed\3\2\2\2;\u00ef"+
		"\3\2\2\2=\u00f3\3\2\2\2?\u00f9\3\2\2\2A\u0103\3\2\2\2C\u0111\3\2\2\2E"+
		"\u011a\3\2\2\2G\u0125\3\2\2\2IJ\7?\2\2J\4\3\2\2\2KL\7j\2\2LM\7g\2\2MN"+
		"\7c\2\2NO\7f\2\2OP\7g\2\2PQ\7t\2\2QR\7*\2\2R\6\3\2\2\2ST\7+\2\2T\b\3\2"+
		"\2\2UV\7}\2\2V\n\3\2\2\2WX\7\177\2\2XY\7=\2\2Y\f\3\2\2\2Z[\7e\2\2[\\\7"+
		"q\2\2\\]\7p\2\2]^\7v\2\2^_\7g\2\2_`\7p\2\2`a\7v\2\2ab\7*\2\2b\16\3\2\2"+
		"\2cd\7h\2\2de\7q\2\2ef\7q\2\2fg\7v\2\2gh\7g\2\2hi\7t\2\2ij\7*\2\2j\20"+
		"\3\2\2\2kl\7e\2\2lm\7q\2\2mn\7n\2\2no\7q\2\2op\7t\2\2p\22\3\2\2\2qr\7"+
		"r\2\2rs\7c\2\2st\7f\2\2tu\7f\2\2uv\7k\2\2vw\7p\2\2wx\7i\2\2x\24\3\2\2"+
		"\2yz\7o\2\2z{\7c\2\2{|\7t\2\2|}\7i\2\2}~\7k\2\2~\177\7p\2\2\177\26\3\2"+
		"\2\2\u0080\u0081\7u\2\2\u0081\u0082\7k\2\2\u0082\u0083\7|\2\2\u0083\u0084"+
		"\7g\2\2\u0084\30\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7e\2\2\u0087\u0088"+
		"\7q\2\2\u0088\u0089\7p\2\2\u0089\32\3\2\2\2\u008a\u008b\7j\2\2\u008b\u008c"+
		"\7t\2\2\u008c\u008d\7g\2\2\u008d\u008e\7h\2\2\u008e\34\3\2\2\2\u008f\u0090"+
		"\7u\2\2\u0090\u0091\7r\2\2\u0091\u0092\7c\2\2\u0092\u0093\7e\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096\7i\2\2\u0096\36\3\2\2\2\u0097"+
		"\u0098\7n\2\2\u0098\u0099\7q\2\2\u0099\u009a\7i\2\2\u009a\u009b\7q\2\2"+
		"\u009b\u009c\7*\2\2\u009c \3\2\2\2\u009d\u009e\7d\2\2\u009e\u009f\7w\2"+
		"\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3"+
		"\7p\2\2\u00a3\u00a4\7*\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7e\2\2\u00aa"+
		"\u00ab\7j\2\2\u00ab\u00ac\7*\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7w\2\2"+
		"\u00b2\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6"+
		"\7*\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba"+
		"\7z\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7*\2\2\u00bc(\3\2\2\2\u00bd\u00be"+
		"\7+\2\2\u00be\u00bf\7=\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7*\2\2\u00c5"+
		",\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2"+
		"\u00cd\u00ce\7g\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7*\2\2\u00d0.\3\2\2"+
		"\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5"+
		"\7i\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7*\2\2\u00d7\60\3\2\2\2\u00d8\u00d9"+
		"\7u\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7v\2\2\u00dc"+
		"\u00dd\7k\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7*\2\2"+
		"\u00e0\62\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7"+
		"y\2\2\u00e4\u00e5\7*\2\2\u00e5\64\3\2\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8"+
		"\7q\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7*\2\2\u00ea\66\3\2\2\2\u00eb\u00ec"+
		"\4\62;\2\u00ec8\3\2\2\2\u00ed\u00ee\t\2\2\2\u00ee:\3\2\2\2\u00ef\u00f0"+
		"\7\"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b\36\2\2\u00f2<\3\2\2\2\u00f3"+
		"\u00f4\t\3\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\37\2\2\u00f6>\3\2\2\2"+
		"\u00f7\u00fa\59\35\2\u00f8\u00fa\7a\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa\u0100\3\2\2\2\u00fb\u00ff\7a\2\2\u00fc\u00ff\5\67\34\2"+
		"\u00fd\u00ff\59\35\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"@\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\61\2\2\u0104\u0105\7,\2\2"+
		"\u0105\u0109\3\2\2\2\u0106\u0108\n\4\2\2\u0107\u0106\3\2\2\2\u0108\u010b"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010d\7,\2\2\u010d\u010e\7\61\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\b!\2\2\u0110B\3\2\2\2\u0111\u0115\7$\2\2\u0112\u0114"+
		"\n\5\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7$"+
		"\2\2\u0119D\3\2\2\2\u011a\u011b\7\61\2\2\u011b\u011c\7,\2\2\u011c\u0120"+
		"\3\2\2\2\u011d\u011f\13\2\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2"+
		"\u0120\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0124\b#\3\2\u0124F\3\2\2\2\u0125\u0126\13\2\2\2\u0126"+
		"\u0127\b$\4\2\u0127H\3\2\2\2\t\2\u00f9\u00fe\u0100\u0109\u0115\u0120\5"+
		"\b\2\2\3#\2\3$\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}