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
		TRASH=1, REAL_CONSTANT=2, INT_CONSTANT=3, CHAR_CONSTANT=4, IDENT=5, COMMENT=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRASH", "REAL_CONSTANT", "INT_CONSTANT", "CHAR_CONSTANT", "IDENT", "COMMENT"
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
			"COMMENT"
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
		"\u0004\u0000\u0006r\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001\u0013\b\u0001\n\u0001\f\u0001\u0016"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001a\b\u0001\u000b\u0001"+
		"\f\u0001\u001b\u0001\u0001\u0004\u0001\u001f\b\u0001\u000b\u0001\f\u0001"+
		" \u0001\u0001\u0001\u0001\u0005\u0001%\b\u0001\n\u0001\f\u0001(\t\u0001"+
		"\u0003\u0001*\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001"+
		"\u0001\u0003\u00011\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00016\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001:\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002"+
		"\u0003\u0002D\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003N\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004S\b\u0004\u0001\u0004"+
		"\u0005\u0004V\b\u0004\n\u0004\f\u0004Y\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0005\u0005]\b\u0005\n\u0005\f\u0005`\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005g\b\u0005\n\u0005\f\u0005"+
		"j\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0002^h\u0000\u0006\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\u0001\u0000\b\u0003\u0000\t\n\r\r  \u0001"+
		"\u000009\u0001\u000019\u0002\u0000EEee\u0002\u0000++--\u0002\u0000026"+
		"6\u0003\u0000AZ__az\u0003\u000009AZaz\u0083\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0001\r\u0001\u0000\u0000\u0000\u0003"+
		"9\u0001\u0000\u0000\u0000\u0005C\u0001\u0000\u0000\u0000\u0007E\u0001"+
		"\u0000\u0000\u0000\tR\u0001\u0000\u0000\u0000\u000bn\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0007\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0006\u0000\u0000\u0000\u0010\u0002\u0001\u0000\u0000\u0000"+
		"\u0011\u0013\u0007\u0001\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000"+
		"\u0013\u0016\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0017\u0001\u0000\u0000\u0000"+
		"\u0016\u0014\u0001\u0000\u0000\u0000\u0017\u0019\u0005.\u0000\u0000\u0018"+
		"\u001a\u0007\u0002\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c*\u0001\u0000\u0000\u0000\u001d\u001f"+
		"\u0007\u0001\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"&\u0005.\u0000\u0000#%\u0007\u0001"+
		"\u0000\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000)\u0014\u0001\u0000\u0000\u0000)\u001e\u0001"+
		"\u0000\u0000\u0000*0\u0001\u0000\u0000\u0000+-\u0007\u0003\u0000\u0000"+
		",.\u0007\u0004\u0000\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/1\u0003\u0005\u0002\u00000+\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u00001:\u0001\u0000\u0000\u000023\u0003"+
		"\u0005\u0002\u000035\u0007\u0003\u0000\u000046\u0007\u0004\u0000\u0000"+
		"54\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000078\u0003\u0005\u0002\u00008:\u0001\u0000\u0000\u00009)\u0001\u0000"+
		"\u0000\u000092\u0001\u0000\u0000\u0000:\u0004\u0001\u0000\u0000\u0000"+
		";D\u00050\u0000\u0000<@\u0007\u0002\u0000\u0000=?\u0007\u0001\u0000\u0000"+
		">=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000C;\u0001\u0000\u0000\u0000C<\u0001\u0000\u0000\u0000D\u0006"+
		"\u0001\u0000\u0000\u0000EM\u0005\'\u0000\u0000FG\u0005\\\u0000\u0000G"+
		"N\u0007\u0005\u0000\u0000HN\t\u0000\u0000\u0000IJ\u0005\\\u0000\u0000"+
		"JN\u0005t\u0000\u0000KL\u0005\\\u0000\u0000LN\u0005n\u0000\u0000MF\u0001"+
		"\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\'\u0000\u0000"+
		"P\b\u0001\u0000\u0000\u0000QS\u0007\u0006\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000SW\u0001\u0000\u0000\u0000TV\u0007\u0007\u0000\u0000UT\u0001\u0000"+
		"\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000X\n\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"Z^\u0005#\u0000\u0000[]\t\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000"+
		"]`\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ao\u0005\n\u0000"+
		"\u0000bc\u0005\'\u0000\u0000cd\u0005\'\u0000\u0000dh\u0005\'\u0000\u0000"+
		"eg\t\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000kl\u0005\'\u0000\u0000lm\u0005\'\u0000"+
		"\u0000mo\u0005\'\u0000\u0000nZ\u0001\u0000\u0000\u0000nb\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pq\u0006\u0005\u0000\u0000q\f\u0001\u0000"+
		"\u0000\u0000\u0012\u0000\u0014\u001b &)-059@CMRW^hn\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}