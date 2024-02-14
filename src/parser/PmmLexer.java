// Generated from C:/Users/UO288524/Desktop/DLP/proyectoBien/proyectoBien/src/parser/Pmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRASH=1, REAL_CONSTANT=2, INT_CONSTANT=3, COMMENT=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRASH", "REAL_CONSTANT", "INT_CONSTANT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRASH", "REAL_CONSTANT", "INT_CONSTANT", "COMMENT"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0004Y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u000f\b\u0001"+
		"\n\u0001\f\u0001\u0012\t\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0016"+
		"\b\u0001\u000b\u0001\f\u0001\u0017\u0001\u0001\u0004\u0001\u001b\b\u0001"+
		"\u000b\u0001\f\u0001\u001c\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001"+
		"\n\u0001\f\u0001$\t\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001*\b\u0001\u0001\u0001\u0003\u0001-\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00016\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002;\b\u0002"+
		"\n\u0002\f\u0002>\t\u0002\u0003\u0002@\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0005\u0003D\b\u0003\n\u0003\f\u0003G\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003N\b\u0003\n\u0003\f\u0003"+
		"Q\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0002EO\u0000\u0004\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\u0001\u0000\u0004\u0003\u0000\t\n\r\r  \u0001\u000009\u0001"+
		"\u000019\u0002\u0000EEeef\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0001\t\u0001\u0000\u0000\u0000\u00035\u0001"+
		"\u0000\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007U\u0001\u0000\u0000"+
		"\u0000\t\n\u0007\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b"+
		"\f\u0006\u0000\u0000\u0000\f\u0002\u0001\u0000\u0000\u0000\r\u000f\u0007"+
		"\u0001\u0000\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f\u0012\u0001\u0000"+
		"\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000"+
		"\u0000\u0000\u0011\u0013\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000"+
		"\u0000\u0000\u0013\u0015\u0005.\u0000\u0000\u0014\u0016\u0007\u0002\u0000"+
		"\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018&\u0001\u0000\u0000\u0000\u0019\u001b\u0007\u0001\u0000\u0000"+
		"\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e\"\u0005.\u0000\u0000\u001f"+
		"!\u0007\u0001\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#&\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%\u0010\u0001\u0000\u0000"+
		"\u0000%\u001a\u0001\u0000\u0000\u0000&,\u0001\u0000\u0000\u0000\')\u0007"+
		"\u0003\u0000\u0000(*\u0005-\u0000\u0000)(\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0003\u0005\u0002\u0000"+
		",\'\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-6\u0001\u0000\u0000"+
		"\u0000./\u0003\u0005\u0002\u0000/1\u0007\u0003\u0000\u000002\u0005-\u0000"+
		"\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000034\u0003\u0005\u0002\u000046\u0001\u0000\u0000\u00005%\u0001"+
		"\u0000\u0000\u00005.\u0001\u0000\u0000\u00006\u0004\u0001\u0000\u0000"+
		"\u00007@\u00050\u0000\u00008<\u0007\u0002\u0000\u00009;\u0007\u0001\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?7\u0001\u0000\u0000\u0000?8\u0001\u0000\u0000\u0000"+
		"@\u0006\u0001\u0000\u0000\u0000AE\u0005#\u0000\u0000BD\t\u0000\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000HV\u0005\n\u0000\u0000IJ\u0005\'\u0000\u0000JK\u0005\'\u0000"+
		"\u0000KO\u0005\'\u0000\u0000LN\t\u0000\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000NQ\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005"+
		"\'\u0000\u0000ST\u0005\'\u0000\u0000TV\u0005\'\u0000\u0000UA\u0001\u0000"+
		"\u0000\u0000UI\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0006"+
		"\u0003\u0000\u0000X\b\u0001\u0000\u0000\u0000\u000f\u0000\u0010\u0017"+
		"\u001c\"%),15<?EOU\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}