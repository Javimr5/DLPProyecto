// Generated from C:/Users/javie/OneDrive/Escritorio/Tercero/DLPProyecto/src/parser/Pmm.g4 by ANTLR 4.13.1
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
		TRASH=1, REAL_CONSTANT=2, INT_CONSTANT=3, CHAR_CONSTANT=4, IDENT=5, COMMENT1=6, 
		COMMENT2=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRASH", "REAL_CONSTANT", "INT_CONSTANT", "CHAR_CONSTANT", "IDENT", "COMMENT1", 
			"COMMENT2"
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
			null, "TRASH", "REAL_CONSTANT", "INT_CONSTANT", "CHAR_CONSTANT", "IDENT", 
			"COMMENT1", "COMMENT2"
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
		"\u0004\u0000\u0007i\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0017\b\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u001e\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\"\b\u0001\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		".\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00023\b\u0002\n\u0002"+
		"\f\u00026\t\u0002\u0003\u00028\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"B\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004G\b\u0004\u0001"+
		"\u0004\u0005\u0004J\b\u0004\n\u0004\f\u0004M\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0005\u0005Q\b\u0005\n\u0005\f\u0005T\t\u0005\u0001\u0005\u0003"+
		"\u0005W\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006_\b\u0006\n\u0006\f\u0006b\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0002"+
		"R`\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u0001\u0000\b\u0003\u0000\t\n\r\r  \u0002\u0000E"+
		"Eee\u0002\u0000++--\u0001\u000019\u0001\u000009\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0001\u0001\n\nw\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001"+
		"\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000"+
		"\u0000\u00079\u0001\u0000\u0000\u0000\tF\u0001\u0000\u0000\u0000\u000b"+
		"N\u0001\u0000\u0000\u0000\rZ\u0001\u0000\u0000\u0000\u000f\u0010\u0007"+
		"\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0006"+
		"\u0000\u0000\u0000\u0012\u0002\u0001\u0000\u0000\u0000\u0013\u0014\u0003"+
		"\u0005\u0002\u0000\u0014\u0016\u0005.\u0000\u0000\u0015\u0017\u0003\u0005"+
		"\u0002\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000"+
		"\u0000\u0000\u0017\u001e\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0005"+
		"\u0002\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005.\u0000"+
		"\u0000\u001c\u001e\u0003\u0005\u0002\u0000\u001d\u0013\u0001\u0000\u0000"+
		"\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001e$\u0001\u0000\u0000\u0000"+
		"\u001f!\u0007\u0001\u0000\u0000 \"\u0007\u0002\u0000\u0000! \u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0003"+
		"\u0005\u0002\u0000$\u001f\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%.\u0001\u0000\u0000\u0000&\'\u0003\u0005\u0002\u0000\')\u0007\u0001"+
		"\u0000\u0000(*\u0007\u0002\u0000\u0000)(\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0003\u0005\u0002\u0000"+
		",.\u0001\u0000\u0000\u0000-\u001d\u0001\u0000\u0000\u0000-&\u0001\u0000"+
		"\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/8\u00050\u0000\u000004\u0007"+
		"\u0003\u0000\u000013\u0007\u0004\u0000\u000021\u0001\u0000\u0000\u0000"+
		"36\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u00007/\u0001\u0000"+
		"\u0000\u000070\u0001\u0000\u0000\u00008\u0006\u0001\u0000\u0000\u0000"+
		"9A\u0005\'\u0000\u0000:;\u0005\\\u0000\u0000;B\u0003\u0005\u0002\u0000"+
		"<B\t\u0000\u0000\u0000=>\u0005\\\u0000\u0000>B\u0005n\u0000\u0000?@\u0005"+
		"\\\u0000\u0000@B\u0005t\u0000\u0000A:\u0001\u0000\u0000\u0000A<\u0001"+
		"\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CD\u0005\'\u0000\u0000D\b\u0001\u0000\u0000"+
		"\u0000EG\u0007\u0005\u0000\u0000FE\u0001\u0000\u0000\u0000GK\u0001\u0000"+
		"\u0000\u0000HJ\u0007\u0006\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"L\n\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NR\u0005#\u0000\u0000"+
		"OQ\t\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000UW\u0007\u0007\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0006\u0005\u0000\u0000Y\f\u0001"+
		"\u0000\u0000\u0000Z[\u0005\"\u0000\u0000[\\\u0005\"\u0000\u0000\\`\u0005"+
		"\"\u0000\u0000]_\t\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005\"\u0000\u0000"+
		"de\u0005\"\u0000\u0000ef\u0005\"\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gh\u0006\u0006\u0000\u0000h\u000e\u0001\u0000\u0000\u0000\u0010\u0000"+
		"\u0016\u0019\u001d!$)-47AFKRV`\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}