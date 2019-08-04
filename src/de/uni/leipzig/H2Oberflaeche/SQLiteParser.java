// Generated from C:/Users/Anna/Desktop/test/H2Oberfleache/src/main/antlr4\SQLite.g4 by ANTLR 4.7.2
package de\uni\leipzig\H2Oberflaeche;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SCOL=2, DOT=3, OPEN_PAR=4, CLOSE_PAR=5, COMMA=6, ASSIGN=7, STAR=8, 
		PLUS=9, MINUS=10, TILDE=11, PIPE2=12, DIV=13, MOD=14, LT2=15, GT2=16, 
		AMP=17, PIPE=18, LT=19, LT_EQ=20, GT=21, GT_EQ=22, EQ=23, NOT_EQ1=24, 
		NOT_EQ2=25, K_ABORT=26, K_ACTION=27, K_ADD=28, K_AFTER=29, K_ALL=30, K_ALTER=31, 
		K_ANALYZE=32, K_AND=33, K_AS=34, K_ASC=35, K_ATTACH=36, K_AUTOINCREMENT=37, 
		K_BEFORE=38, K_BEGIN=39, K_BETWEEN=40, K_BY=41, K_CASCADE=42, K_CASE=43, 
		K_CAST=44, K_CHECK=45, K_COLLATE=46, K_COLUMN=47, K_COMMIT=48, K_CONFLICT=49, 
		K_CONSTRAINT=50, K_CREATE=51, K_CROSS=52, K_CURRENT_DATE=53, K_CURRENT_TIME=54, 
		K_CURRENT_TIMESTAMP=55, K_DATABASE=56, K_DEFAULT=57, K_DEFERRABLE=58, 
		K_DEFERRED=59, K_DELETE=60, K_DESC=61, K_DETACH=62, K_DISTINCT=63, K_DROP=64, 
		K_EACH=65, K_ELSE=66, K_END=67, K_ESCAPE=68, K_EXCEPT=69, K_EXCLUSIVE=70, 
		K_EXISTS=71, K_EXPLAIN=72, K_FAIL=73, K_FOR=74, K_FOREIGN=75, K_FROM=76, 
		K_FULL=77, K_GLOB=78, K_GROUP=79, K_HAVING=80, K_IF=81, K_IGNORE=82, K_IMMEDIATE=83, 
		K_IN=84, K_INDEX=85, K_INDEXED=86, K_INITIALLY=87, K_INNER=88, K_INSERT=89, 
		K_INSTEAD=90, K_INTERSECT=91, K_INTO=92, K_IS=93, K_ISNULL=94, K_JOIN=95, 
		K_KEY=96, K_LEFT=97, K_LIKE=98, K_LIMIT=99, K_MATCH=100, K_NATURAL=101, 
		K_NO=102, K_NOT=103, K_NOTNULL=104, K_NULL=105, K_OF=106, K_OFFSET=107, 
		K_ON=108, K_OR=109, K_ORDER=110, K_OUTER=111, K_PLAN=112, K_PRAGMA=113, 
		K_PRIMARY=114, K_QUERY=115, K_RAISE=116, K_RECURSIVE=117, K_REFERENCES=118, 
		K_REGEXP=119, K_REINDEX=120, K_RELEASE=121, K_RENAME=122, K_REPLACE=123, 
		K_RESTRICT=124, K_RIGHT=125, K_ROLLBACK=126, K_ROW=127, K_SAVEPOINT=128, 
		K_SELECT=129, K_SET=130, K_TABLE=131, K_TEMP=132, K_TEMPORARY=133, K_THEN=134, 
		K_TO=135, K_TRANSACTION=136, K_TRIGGER=137, K_UNION=138, K_UNIQUE=139, 
		K_UPDATE=140, K_USING=141, K_VACUUM=142, K_VALUES=143, K_VIEW=144, K_VIRTUAL=145, 
		K_WHEN=146, K_WHERE=147, K_WITH=148, K_WITHOUT=149, IDENTIFIER=150, NUMERIC_LITERAL=151, 
		BIND_PARAMETER=152, STRING_LITERAL=153, BLOB_LITERAL=154, SINGLE_LINE_COMMENT=155, 
		MULTILINE_COMMENT=156, SPACES=157, UNEXPECTED_CHAR=158;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5, RULE_attach_stmt = 6, 
		RULE_begin_stmt = 7, RULE_commit_stmt = 8, RULE_compound_select_stmt = 9, 
		RULE_create_index_stmt = 10, RULE_set_row_create = 11, RULE_create_table_stmt = 12, 
		RULE_create_trigger_stmt = 13, RULE_create_view_stmt = 14, RULE_create_virtual_table_stmt = 15, 
		RULE_delete_stmt = 16, RULE_delete_stmt_limited = 17, RULE_detach_stmt = 18, 
		RULE_drop_index_stmt = 19, RULE_drop_table_stmt = 20, RULE_drop_trigger_stmt = 21, 
		RULE_drop_view_stmt = 22, RULE_factored_select_stmt = 23, RULE_insert_stmt = 24, 
		RULE_pragma_stmt = 25, RULE_reindex_stmt = 26, RULE_release_stmt = 27, 
		RULE_rollback_stmt = 28, RULE_savepoint_stmt = 29, RULE_simple_select_stmt = 30, 
		RULE_select_stmt = 31, RULE_select_or_values = 32, RULE_update_stmt = 33, 
		RULE_update_stmt_limited = 34, RULE_vacuum_stmt = 35, RULE_column_def = 36, 
		RULE_type_name = 37, RULE_column_constraint = 38, RULE_conflict_clause = 39, 
		RULE_expr = 40, RULE_foreign_key_clause = 41, RULE_raise_function = 42, 
		RULE_indexed_column = 43, RULE_table_constraint = 44, RULE_with_clause = 45, 
		RULE_qualified_table_name = 46, RULE_ordering_term = 47, RULE_pragma_value = 48, 
		RULE_common_table_expression = 49, RULE_result_column = 50, RULE_table_or_subquery = 51, 
		RULE_join_clause = 52, RULE_join_operator = 53, RULE_join_constraint = 54, 
		RULE_select_core = 55, RULE_compound_operator = 56, RULE_cte_table_name = 57, 
		RULE_signed_number = 58, RULE_literal_value = 59, RULE_unary_operator = 60, 
		RULE_error_message = 61, RULE_module_argument = 62, RULE_column_alias = 63, 
		RULE_keyword = 64, RULE_name = 65, RULE_function_name = 66, RULE_database_name = 67, 
		RULE_table_name = 68, RULE_table_or_index_name = 69, RULE_new_table_name = 70, 
		RULE_column_name = 71, RULE_subtable_name = 72, RULE_collation_name = 73, 
		RULE_foreign_table = 74, RULE_index_name = 75, RULE_trigger_name = 76, 
		RULE_view_name = 77, RULE_module_name = 78, RULE_pragma_name = 79, RULE_savepoint_name = 80, 
		RULE_table_alias = 81, RULE_transaction_name = 82, RULE_any_name = 83;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
			"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
			"set_row_create", "create_table_stmt", "create_trigger_stmt", "create_view_stmt", 
			"create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", "detach_stmt", 
			"drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", 
			"factored_select_stmt", "insert_stmt", "pragma_stmt", "reindex_stmt", 
			"release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
			"select_stmt", "select_or_values", "update_stmt", "update_stmt_limited", 
			"vacuum_stmt", "column_def", "type_name", "column_constraint", "conflict_clause", 
			"expr", "foreign_key_clause", "raise_function", "indexed_column", "table_constraint", 
			"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "compound_operator", 
			"cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "name", 
			"function_name", "database_name", "table_name", "table_or_index_name", 
			"new_table_name", "column_name", "subtable_name", "collation_name", "foreign_table", 
			"index_name", "trigger_name", "view_name", "module_name", "pragma_name", 
			"savepoint_name", "table_alias", "transaction_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'))'", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", 
			"'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", 
			"'<='", "'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", 
			"STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", 
			"AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", 
			"K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", 
			"K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", 
			"K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", 
			"K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", 
			"K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
			"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", 
			"K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", 
			"K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", 
			"K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
			"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", 
			"K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", 
			"K_NATURAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", 
			"K_ON", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", 
			"K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", 
			"K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", 
			"K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", 
			"K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", 
			"K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", 
			"K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", 
			"BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "SQLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DROP - 64)) | (1L << (K_END - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_ROLLBACK - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_WITH - 128)) | (1L << (UNEXPECTED_CHAR - 128)))) != 0)) {
				{
				setState(170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(168);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(169);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLiteParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt_list(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(180);
				match(SCOL);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			sql_stmt();
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(187);
						match(SCOL);
						}
						}
						setState(190); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(192);
					sql_stmt();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					match(SCOL);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(204);
				match(K_EXPLAIN);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(205);
					match(K_QUERY);
					setState(206);
					match(K_PLAN);
					}
				}

				}
			}

			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(211);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(212);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(213);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(214);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(215);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(216);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(217);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(218);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(219);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(220);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(221);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(222);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(223);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(224);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(225);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(226);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(227);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(228);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(229);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(230);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(231);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(232);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(233);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(234);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(235);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(236);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(237);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(238);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(239);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(240);
				vacuum_stmt();
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAlter_table_stmt(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(K_ALTER);
			setState(244);
			match(K_TABLE);
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(245);
				database_name();
				setState(246);
				match(DOT);
				}
				break;
			}
			setState(250);
			table_name();
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(251);
				match(K_RENAME);
				setState(252);
				match(K_TO);
				setState(253);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(254);
				match(K_ADD);
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(255);
					match(K_COLUMN);
					}
					break;
				}
				setState(258);
				column_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAnalyze_stmt(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(K_ANALYZE);
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(262);
				database_name();
				}
				break;
			case 2:
				{
				setState(263);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(264);
				database_name();
				setState(265);
				match(DOT);
				setState(266);
				table_or_index_name();
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

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAttach_stmt(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(K_ATTACH);
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(271);
				match(K_DATABASE);
				}
				break;
			}
			setState(274);
			expr(0);
			setState(275);
			match(K_AS);
			setState(276);
			database_name();
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

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitBegin_stmt(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(K_BEGIN);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (K_DEFERRED - 59)) | (1L << (K_EXCLUSIVE - 59)) | (1L << (K_IMMEDIATE - 59)))) != 0)) {
				{
				setState(279);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (K_DEFERRED - 59)) | (1L << (K_EXCLUSIVE - 59)) | (1L << (K_IMMEDIATE - 59)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(282);
				match(K_TRANSACTION);
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(283);
					transaction_name();
					}
					break;
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

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommit_stmt(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(289);
				match(K_TRANSACTION);
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(290);
					transaction_name();
					}
					break;
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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SQLiteParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SQLiteParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SQLiteParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SQLiteParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SQLiteParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SQLiteParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SQLiteParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SQLiteParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_select_stmt(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(295);
				match(K_WITH);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(296);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(299);
				common_table_expression();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(300);
					match(COMMA);
					setState(301);
					common_table_expression();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(309);
			select_core();
			setState(319); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(316);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(310);
					match(K_UNION);
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(311);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(314);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(315);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(318);
				select_core();
				}
				}
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(323);
				match(K_ORDER);
				setState(324);
				match(K_BY);
				setState(325);
				ordering_term();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(326);
					match(COMMA);
					setState(327);
					ordering_term();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(335);
				match(K_LIMIT);
				setState(336);
				expr(0);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(337);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(338);
					expr(0);
					}
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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_index_stmt(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(K_CREATE);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(344);
				match(K_UNIQUE);
				}
			}

			setState(347);
			match(K_INDEX);
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(348);
				match(K_IF);
				setState(349);
				match(K_NOT);
				setState(350);
				match(K_EXISTS);
				}
				break;
			}
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(353);
				database_name();
				setState(354);
				match(DOT);
				}
				break;
			}
			setState(358);
			index_name();
			setState(359);
			match(K_ON);
			setState(360);
			table_name();
			setState(361);
			match(OPEN_PAR);
			setState(362);
			indexed_column();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(363);
				match(COMMA);
				setState(364);
				indexed_column();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(CLOSE_PAR);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(371);
				match(K_WHERE);
				setState(372);
				expr(0);
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

	public static class Set_row_createContext extends ParserRuleContext {
		public Subtable_nameContext subtable_name() {
			return getRuleContext(Subtable_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Set_row_createContext> set_row_create() {
			return getRuleContexts(Set_row_createContext.class);
		}
		public Set_row_createContext set_row_create(int i) {
			return getRuleContext(Set_row_createContext.class,i);
		}
		public Set_row_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_row_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSet_row_create(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSet_row_create(this);
		}
	}

	public final Set_row_createContext set_row_create() throws RecognitionException {
		Set_row_createContext _localctx = new Set_row_createContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_set_row_create);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			subtable_name();
			setState(376);
			match(K_SET);
			setState(377);
			match(OPEN_PAR);
			setState(378);
			match(K_ROW);
			setState(379);
			match(OPEN_PAR);
			setState(380);
			column_def();
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(381);
					match(COMMA);
					setState(382);
					column_def();
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(388);
				match(COMMA);
				setState(389);
				set_row_create();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			match(T__0);
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public List<Set_row_createContext> set_row_create() {
			return getRuleContexts(Set_row_createContext.class);
		}
		public Set_row_createContext set_row_create(int i) {
			return getRuleContext(Set_row_createContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_table_stmt(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(K_CREATE);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(398);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(401);
			match(K_TABLE);
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(402);
				match(K_IF);
				setState(403);
				match(K_NOT);
				setState(404);
				match(K_EXISTS);
				}
				break;
			}
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(407);
				database_name();
				setState(408);
				match(DOT);
				}
				break;
			}
			setState(412);
			table_name();
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(413);
				match(OPEN_PAR);
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(414);
					column_def();
					}
					break;
				case 2:
					{
					setState(415);
					set_row_create();
					}
					break;
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(418);
						match(COMMA);
						setState(419);
						column_def();
						}
						} 
					}
					setState(424);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(425);
						match(COMMA);
						setState(426);
						set_row_create();
						}
						} 
					}
					setState(431);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(432);
					match(COMMA);
					setState(433);
					table_constraint();
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(439);
				match(CLOSE_PAR);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(440);
					match(K_WITHOUT);
					setState(441);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(444);
				match(K_AS);
				setState(445);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SQLiteParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SQLiteParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_trigger_stmt(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(K_CREATE);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(449);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(452);
			match(K_TRIGGER);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(453);
				match(K_IF);
				setState(454);
				match(K_NOT);
				setState(455);
				match(K_EXISTS);
				}
				break;
			}
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(458);
				database_name();
				setState(459);
				match(DOT);
				}
				break;
			}
			setState(463);
			trigger_name();
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(464);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(465);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(466);
				match(K_INSTEAD);
				setState(467);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(470);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(471);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(472);
				match(K_UPDATE);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(473);
					match(K_OF);
					setState(474);
					column_name();
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(475);
						match(COMMA);
						setState(476);
						column_name();
						}
						}
						setState(481);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(486);
			match(K_ON);
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(487);
				database_name();
				setState(488);
				match(DOT);
				}
				break;
			}
			setState(492);
			table_name();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(493);
				match(K_FOR);
				setState(494);
				match(K_EACH);
				setState(495);
				match(K_ROW);
				}
			}

			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(498);
				match(K_WHEN);
				setState(499);
				expr(0);
				}
			}

			setState(502);
			match(K_BEGIN);
			setState(511); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(503);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(504);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(505);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(506);
					select_stmt();
					}
					break;
				}
				setState(509);
				match(SCOL);
				}
				}
				setState(513); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSERT - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_WITH - 89)))) != 0) );
			setState(515);
			match(K_END);
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

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_view_stmt(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(K_CREATE);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(518);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(521);
			match(K_VIEW);
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(522);
				match(K_IF);
				setState(523);
				match(K_NOT);
				setState(524);
				match(K_EXISTS);
				}
				break;
			}
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(527);
				database_name();
				setState(528);
				match(DOT);
				}
				break;
			}
			setState(532);
			view_name();
			setState(533);
			match(K_AS);
			setState(534);
			select_stmt();
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

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_virtual_table_stmt(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(K_CREATE);
			setState(537);
			match(K_VIRTUAL);
			setState(538);
			match(K_TABLE);
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(539);
				match(K_IF);
				setState(540);
				match(K_NOT);
				setState(541);
				match(K_EXISTS);
				}
				break;
			}
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(544);
				database_name();
				setState(545);
				match(DOT);
				}
				break;
			}
			setState(549);
			table_name();
			setState(550);
			match(K_USING);
			setState(551);
			module_name();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(552);
				match(OPEN_PAR);
				setState(553);
				module_argument();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(554);
					match(COMMA);
					setState(555);
					module_argument();
					}
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(561);
				match(CLOSE_PAR);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(565);
				with_clause();
				}
			}

			setState(568);
			match(K_DELETE);
			setState(569);
			match(K_FROM);
			setState(570);
			qualified_table_name();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(571);
				match(K_WHERE);
				setState(572);
				expr(0);
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

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt_limited(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(575);
				with_clause();
				}
			}

			setState(578);
			match(K_DELETE);
			setState(579);
			match(K_FROM);
			setState(580);
			qualified_table_name();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(581);
				match(K_WHERE);
				setState(582);
				expr(0);
				}
			}

			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(585);
					match(K_ORDER);
					setState(586);
					match(K_BY);
					setState(587);
					ordering_term();
					setState(592);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(588);
						match(COMMA);
						setState(589);
						ordering_term();
						}
						}
						setState(594);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(597);
				match(K_LIMIT);
				setState(598);
				expr(0);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(599);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(600);
					expr(0);
					}
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

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDetach_stmt(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(K_DETACH);
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(606);
				match(K_DATABASE);
				}
				break;
			}
			setState(609);
			database_name();
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

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_index_stmt(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(K_DROP);
			setState(612);
			match(K_INDEX);
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(613);
				match(K_IF);
				setState(614);
				match(K_EXISTS);
				}
				break;
			}
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(617);
				database_name();
				setState(618);
				match(DOT);
				}
				break;
			}
			setState(622);
			index_name();
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_table_stmt(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(K_DROP);
			setState(625);
			match(K_TABLE);
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(626);
				match(K_IF);
				setState(627);
				match(K_EXISTS);
				}
				break;
			}
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(630);
				database_name();
				setState(631);
				match(DOT);
				}
				break;
			}
			setState(635);
			table_name();
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

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_trigger_stmt(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(K_DROP);
			setState(638);
			match(K_TRIGGER);
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(639);
				match(K_IF);
				setState(640);
				match(K_EXISTS);
				}
				break;
			}
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(643);
				database_name();
				setState(644);
				match(DOT);
				}
				break;
			}
			setState(648);
			trigger_name();
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

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_view_stmt(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(K_DROP);
			setState(651);
			match(K_VIEW);
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(652);
				match(K_IF);
				setState(653);
				match(K_EXISTS);
				}
				break;
			}
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(656);
				database_name();
				setState(657);
				match(DOT);
				}
				break;
			}
			setState(661);
			view_name();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFactored_select_stmt(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(663);
				match(K_WITH);
				setState(665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(664);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(667);
				common_table_expression();
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(668);
					match(COMMA);
					setState(669);
					common_table_expression();
					}
					}
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(677);
			select_core();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(678);
				compound_operator();
				setState(679);
				select_core();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(686);
				match(K_ORDER);
				setState(687);
				match(K_BY);
				setState(688);
				ordering_term();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(689);
					match(COMMA);
					setState(690);
					ordering_term();
					}
					}
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(698);
				match(K_LIMIT);
				setState(699);
				expr(0);
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(700);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(701);
					expr(0);
					}
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitInsert_stmt(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(706);
				with_clause();
				}
			}

			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(709);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(710);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(711);
				match(K_INSERT);
				setState(712);
				match(K_OR);
				setState(713);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(714);
				match(K_INSERT);
				setState(715);
				match(K_OR);
				setState(716);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(717);
				match(K_INSERT);
				setState(718);
				match(K_OR);
				setState(719);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(720);
				match(K_INSERT);
				setState(721);
				match(K_OR);
				setState(722);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(723);
				match(K_INSERT);
				setState(724);
				match(K_OR);
				setState(725);
				match(K_IGNORE);
				}
				break;
			}
			setState(728);
			match(K_INTO);
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(729);
				database_name();
				setState(730);
				match(DOT);
				}
				break;
			}
			setState(734);
			table_name();
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(735);
				match(OPEN_PAR);
				setState(736);
				column_name();
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(737);
					match(COMMA);
					setState(738);
					column_name();
					}
					}
					setState(743);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(744);
				match(CLOSE_PAR);
				}
			}

			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(748);
				match(K_VALUES);
				setState(749);
				match(OPEN_PAR);
				setState(750);
				expr(0);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(751);
					match(COMMA);
					setState(752);
					expr(0);
					}
					}
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(758);
				match(CLOSE_PAR);
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(759);
					match(COMMA);
					setState(760);
					match(OPEN_PAR);
					setState(761);
					expr(0);
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(762);
						match(COMMA);
						setState(763);
						expr(0);
						}
						}
						setState(768);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(769);
					match(CLOSE_PAR);
					}
					}
					setState(775);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(776);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(777);
				match(K_DEFAULT);
				setState(778);
				match(K_VALUES);
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

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_stmt(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(K_PRAGMA);
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(782);
				database_name();
				setState(783);
				match(DOT);
				}
				break;
			}
			setState(787);
			pragma_name();
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(788);
				match(ASSIGN);
				setState(789);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(790);
				match(OPEN_PAR);
				setState(791);
				pragma_value();
				setState(792);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitReindex_stmt(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(K_REINDEX);
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(797);
				collation_name();
				}
				break;
			case 2:
				{
				setState(801);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(798);
					database_name();
					setState(799);
					match(DOT);
					}
					break;
				}
				setState(805);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(803);
					table_name();
					}
					break;
				case 2:
					{
					setState(804);
					index_name();
					}
					break;
				}
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

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRelease_stmt(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(K_RELEASE);
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(810);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(813);
			savepoint_name();
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

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRollback_stmt(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(K_ROLLBACK);
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(816);
				match(K_TRANSACTION);
				setState(818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(817);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(822);
				match(K_TO);
				setState(824);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(823);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(826);
				savepoint_name();
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

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_stmt(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(K_SAVEPOINT);
			setState(830);
			savepoint_name();
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

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSimple_select_stmt(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(832);
				match(K_WITH);
				setState(834);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(833);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(836);
				common_table_expression();
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(837);
					match(COMMA);
					setState(838);
					common_table_expression();
					}
					}
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(846);
			select_core();
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(847);
				match(K_ORDER);
				setState(848);
				match(K_BY);
				setState(849);
				ordering_term();
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(850);
					match(COMMA);
					setState(851);
					ordering_term();
					}
					}
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(859);
				match(K_LIMIT);
				setState(860);
				expr(0);
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(861);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(862);
					expr(0);
					}
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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(867);
				match(K_WITH);
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(868);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(871);
				common_table_expression();
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(872);
					match(COMMA);
					setState(873);
					common_table_expression();
					}
					}
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(881);
			select_or_values();
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(882);
				compound_operator();
				setState(883);
				select_or_values();
				}
				}
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(890);
				match(K_ORDER);
				setState(891);
				match(K_BY);
				setState(892);
				ordering_term();
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(893);
					match(COMMA);
					setState(894);
					ordering_term();
					}
					}
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(902);
				match(K_LIMIT);
				setState(903);
				expr(0);
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(904);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(905);
					expr(0);
					}
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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_or_values(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_select_or_values);
		int _la;
		try {
			setState(984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(910);
				match(K_SELECT);
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(911);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(914);
				result_column();
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(915);
					match(COMMA);
					setState(916);
					result_column();
					}
					}
					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(922);
					match(K_FROM);
					setState(932);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(923);
						table_or_subquery();
						setState(928);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(924);
							match(COMMA);
							setState(925);
							table_or_subquery();
							}
							}
							setState(930);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(931);
						join_clause();
						}
						break;
					}
					}
				}

				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(936);
					match(K_WHERE);
					setState(937);
					expr(0);
					}
				}

				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(940);
					match(K_GROUP);
					setState(941);
					match(K_BY);
					setState(942);
					expr(0);
					setState(947);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(943);
						match(COMMA);
						setState(944);
						expr(0);
						}
						}
						setState(949);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(952);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(950);
						match(K_HAVING);
						setState(951);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(K_VALUES);
				setState(957);
				match(OPEN_PAR);
				setState(958);
				expr(0);
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(959);
					match(COMMA);
					setState(960);
					expr(0);
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(966);
				match(CLOSE_PAR);
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(967);
					match(COMMA);
					setState(968);
					match(OPEN_PAR);
					setState(969);
					expr(0);
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(970);
						match(COMMA);
						setState(971);
						expr(0);
						}
						}
						setState(976);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(977);
					match(CLOSE_PAR);
					}
					}
					setState(983);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(986);
				with_clause();
				}
			}

			setState(989);
			match(K_UPDATE);
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(990);
				match(K_OR);
				setState(991);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(992);
				match(K_OR);
				setState(993);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(994);
				match(K_OR);
				setState(995);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(996);
				match(K_OR);
				setState(997);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(998);
				match(K_OR);
				setState(999);
				match(K_IGNORE);
				}
				break;
			}
			setState(1002);
			qualified_table_name();
			setState(1003);
			match(K_SET);
			setState(1004);
			column_name();
			setState(1005);
			match(ASSIGN);
			setState(1006);
			expr(0);
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1007);
				match(COMMA);
				setState(1008);
				column_name();
				setState(1009);
				match(ASSIGN);
				setState(1010);
				expr(0);
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1017);
				match(K_WHERE);
				setState(1018);
				expr(0);
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

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt_limited(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1021);
				with_clause();
				}
			}

			setState(1024);
			match(K_UPDATE);
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1025);
				match(K_OR);
				setState(1026);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1027);
				match(K_OR);
				setState(1028);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1029);
				match(K_OR);
				setState(1030);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1031);
				match(K_OR);
				setState(1032);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1033);
				match(K_OR);
				setState(1034);
				match(K_IGNORE);
				}
				break;
			}
			setState(1037);
			qualified_table_name();
			setState(1038);
			match(K_SET);
			setState(1039);
			column_name();
			setState(1040);
			match(ASSIGN);
			setState(1041);
			expr(0);
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1042);
				match(COMMA);
				setState(1043);
				column_name();
				setState(1044);
				match(ASSIGN);
				setState(1045);
				expr(0);
				}
				}
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1052);
				match(K_WHERE);
				setState(1053);
				expr(0);
				}
			}

			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1056);
					match(K_ORDER);
					setState(1057);
					match(K_BY);
					setState(1058);
					ordering_term();
					setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1059);
						match(COMMA);
						setState(1060);
						ordering_term();
						}
						}
						setState(1065);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1068);
				match(K_LIMIT);
				setState(1069);
				expr(0);
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1070);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1071);
					expr(0);
					}
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

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitVacuum_stmt(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(K_VACUUM);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_def(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			column_name();
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1079);
				type_name();
				}
				break;
			}
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (K_NOT - 103)) | (1L << (K_NULL - 103)) | (1L << (K_PRIMARY - 103)) | (1L << (K_REFERENCES - 103)) | (1L << (K_UNIQUE - 103)))) != 0)) {
				{
				{
				setState(1082);
				column_constraint();
				}
				}
				setState(1087);
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

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1089); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1088);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1091); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1093);
				match(OPEN_PAR);
				setState(1094);
				signed_number();
				setState(1095);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1097);
				match(OPEN_PAR);
				setState(1098);
				signed_number();
				setState(1099);
				match(COMMA);
				setState(1100);
				signed_number();
				setState(1101);
				match(CLOSE_PAR);
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_constraint(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1105);
				match(K_CONSTRAINT);
				setState(1106);
				name();
				}
			}

			setState(1142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1109);
				match(K_PRIMARY);
				setState(1110);
				match(K_KEY);
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1111);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1114);
				conflict_clause();
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1115);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1118);
					match(K_NOT);
					}
				}

				setState(1121);
				match(K_NULL);
				setState(1122);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1123);
				match(K_UNIQUE);
				setState(1124);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1125);
				match(K_CHECK);
				setState(1126);
				match(OPEN_PAR);
				setState(1127);
				expr(0);
				setState(1128);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1130);
				match(K_DEFAULT);
				setState(1137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1131);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1132);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1133);
					match(OPEN_PAR);
					setState(1134);
					expr(0);
					setState(1135);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1139);
				match(K_COLLATE);
				setState(1140);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1141);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitConflict_clause(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1144);
				match(K_ON);
				setState(1145);
				match(K_CONFLICT);
				setState(1146);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (K_FAIL - 73)) | (1L << (K_IGNORE - 73)) | (1L << (K_REPLACE - 73)) | (1L << (K_ROLLBACK - 73)))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SQLiteParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SQLiteParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SQLiteParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SQLiteParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLiteParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLiteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLiteParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLiteParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLiteParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLiteParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLiteParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLiteParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLiteParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLiteParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLiteParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLiteParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLiteParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLiteParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1150);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1151);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
					case 1:
						{
						setState(1152);
						database_name();
						setState(1153);
						match(DOT);
						}
						break;
					}
					setState(1157);
					table_name();
					setState(1158);
					match(DOT);
					}
					break;
				}
				setState(1162);
				column_name();
				}
				break;
			case 4:
				{
				setState(1163);
				unary_operator();
				setState(1164);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1166);
				function_name();
				setState(1167);
				match(OPEN_PAR);
				setState(1180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						setState(1168);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1171);
					expr(0);
					setState(1176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1172);
						match(COMMA);
						setState(1173);
						expr(0);
						}
						}
						setState(1178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1179);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1182);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1184);
				match(OPEN_PAR);
				setState(1185);
				expr(0);
				setState(1186);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1188);
				match(K_CAST);
				setState(1189);
				match(OPEN_PAR);
				setState(1190);
				expr(0);
				setState(1191);
				match(K_AS);
				setState(1192);
				type_name();
				setState(1193);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1195);
						match(K_NOT);
						}
					}

					setState(1198);
					match(K_EXISTS);
					}
				}

				setState(1201);
				match(OPEN_PAR);
				setState(1202);
				select_stmt();
				setState(1203);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1205);
				match(K_CASE);
				setState(1207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1206);
					expr(0);
					}
					break;
				}
				setState(1214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1209);
					match(K_WHEN);
					setState(1210);
					expr(0);
					setState(1211);
					match(K_THEN);
					setState(1212);
					expr(0);
					}
					}
					setState(1216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1218);
					match(K_ELSE);
					setState(1219);
					expr(0);
					}
				}

				setState(1222);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1224);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1227);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1228);
						match(PIPE2);
						setState(1229);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1230);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1231);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1232);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1233);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1234);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1235);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1236);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1237);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1238);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1239);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1240);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1241);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1242);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1255);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1:
							{
							setState(1243);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1244);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1245);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1246);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1247);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1248);
							match(K_IS);
							setState(1249);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1250);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1251);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1252);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1253);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1254);
							match(K_REGEXP);
							}
							break;
						}
						setState(1257);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1258);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1259);
						match(K_AND);
						setState(1260);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1261);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1262);
						match(K_OR);
						setState(1263);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1264);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1265);
						match(K_IS);
						setState(1267);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
						case 1:
							{
							setState(1266);
							match(K_NOT);
							}
							break;
						}
						setState(1269);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1270);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1272);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1271);
							match(K_NOT);
							}
						}

						setState(1274);
						match(K_BETWEEN);
						setState(1275);
						expr(0);
						setState(1276);
						match(K_AND);
						setState(1277);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1279);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1280);
						match(K_COLLATE);
						setState(1281);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1282);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1284);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1283);
							match(K_NOT);
							}
						}

						setState(1286);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (K_GLOB - 78)) | (1L << (K_LIKE - 78)) | (1L << (K_MATCH - 78)) | (1L << (K_REGEXP - 78)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1287);
						expr(0);
						setState(1290);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
						case 1:
							{
							setState(1288);
							match(K_ESCAPE);
							setState(1289);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1292);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1297);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1293);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1294);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1295);
							match(K_NOT);
							setState(1296);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1299);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1301);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1300);
							match(K_NOT);
							}
						}

						setState(1303);
						match(K_IN);
						setState(1323);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
						case 1:
							{
							setState(1304);
							match(OPEN_PAR);
							setState(1314);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
							case 1:
								{
								setState(1305);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1306);
								expr(0);
								setState(1311);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1307);
									match(COMMA);
									setState(1308);
									expr(0);
									}
									}
									setState(1313);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1316);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1320);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
							case 1:
								{
								setState(1317);
								database_name();
								setState(1318);
								match(DOT);
								}
								break;
							}
							setState(1322);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLiteParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLiteParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLiteParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLiteParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLiteParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLiteParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLiteParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLiteParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLiteParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLiteParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLiteParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLiteParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLiteParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLiteParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLiteParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLiteParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLiteParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLiteParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLiteParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLiteParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLiteParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLiteParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_key_clause(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(K_REFERENCES);
			setState(1331);
			foreign_table();
			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1332);
				match(OPEN_PAR);
				setState(1333);
				column_name();
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1334);
					match(COMMA);
					setState(1335);
					column_name();
					}
					}
					setState(1340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1341);
				match(CLOSE_PAR);
				}
			}

			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1359);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1345);
					match(K_ON);
					setState(1346);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1355);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						setState(1347);
						match(K_SET);
						setState(1348);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1349);
						match(K_SET);
						setState(1350);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1351);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1352);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1353);
						match(K_NO);
						setState(1354);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1357);
					match(K_MATCH);
					setState(1358);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1366);
					match(K_NOT);
					}
				}

				setState(1369);
				match(K_DEFERRABLE);
				setState(1374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1370);
					match(K_INITIALLY);
					setState(1371);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1372);
					match(K_INITIALLY);
					setState(1373);
					match(K_IMMEDIATE);
					}
					break;
				}
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

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRaise_function(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(K_RAISE);
			setState(1379);
			match(OPEN_PAR);
			setState(1384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1380);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1381);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1382);
				match(COMMA);
				setState(1383);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1386);
			match(CLOSE_PAR);
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndexed_column(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			column_name();
			setState(1391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1389);
				match(K_COLLATE);
				setState(1390);
				collation_name();
				}
			}

			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1393);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
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

	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_constraint(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1396);
				match(K_CONSTRAINT);
				setState(1397);
				name();
				}
			}

			setState(1436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1403);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1400);
					match(K_PRIMARY);
					setState(1401);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1402);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1405);
				match(OPEN_PAR);
				setState(1406);
				indexed_column();
				setState(1411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1407);
					match(COMMA);
					setState(1408);
					indexed_column();
					}
					}
					setState(1413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1414);
				match(CLOSE_PAR);
				setState(1415);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1417);
				match(K_CHECK);
				setState(1418);
				match(OPEN_PAR);
				setState(1419);
				expr(0);
				setState(1420);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1422);
				match(K_FOREIGN);
				setState(1423);
				match(K_KEY);
				setState(1424);
				match(OPEN_PAR);
				setState(1425);
				column_name();
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1426);
					match(COMMA);
					setState(1427);
					column_name();
					}
					}
					setState(1432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1433);
				match(CLOSE_PAR);
				setState(1434);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SQLiteParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SQLiteParser.K_AS, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWith_clause(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			match(K_WITH);
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1439);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1442);
			cte_table_name();
			setState(1443);
			match(K_AS);
			setState(1444);
			match(OPEN_PAR);
			setState(1445);
			select_stmt();
			setState(1446);
			match(CLOSE_PAR);
			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1447);
				match(COMMA);
				setState(1448);
				cte_table_name();
				setState(1449);
				match(K_AS);
				setState(1450);
				match(OPEN_PAR);
				setState(1451);
				select_stmt();
				setState(1452);
				match(CLOSE_PAR);
				}
				}
				setState(1458);
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitQualified_table_name(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1459);
				database_name();
				setState(1460);
				match(DOT);
				}
				break;
			}
			setState(1464);
			table_name();
			setState(1470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1465);
				match(K_INDEXED);
				setState(1466);
				match(K_BY);
				setState(1467);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1468);
				match(K_NOT);
				setState(1469);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOrdering_term(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			expr(0);
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1473);
				match(K_COLLATE);
				setState(1474);
				collation_name();
				}
			}

			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1477);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_value(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pragma_value);
		try {
			setState(1483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1480);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1481);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1482);
				match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommon_table_expression(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			table_name();
			setState(1497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1486);
				match(OPEN_PAR);
				setState(1487);
				column_name();
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1488);
					match(COMMA);
					setState(1489);
					column_name();
					}
					}
					setState(1494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1495);
				match(CLOSE_PAR);
				}
			}

			setState(1499);
			match(K_AS);
			setState(1500);
			match(OPEN_PAR);
			setState(1501);
			select_stmt();
			setState(1502);
			match(CLOSE_PAR);
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

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitResult_column(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_result_column);
		int _la;
		try {
			setState(1516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1504);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1505);
				table_name();
				setState(1506);
				match(DOT);
				setState(1507);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1509);
				expr(0);
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1511);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1510);
						match(K_AS);
						}
					}

					setState(1513);
					column_alias();
					}
				}

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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_subquery(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_table_or_subquery);
		int _la;
		try {
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1518);
					database_name();
					setState(1519);
					match(DOT);
					}
					break;
				}
				setState(1523);
				table_name();
				setState(1528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1525);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
					case 1:
						{
						setState(1524);
						match(K_AS);
						}
						break;
					}
					setState(1527);
					table_alias();
					}
					break;
				}
				setState(1535);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1530);
					match(K_INDEXED);
					setState(1531);
					match(K_BY);
					setState(1532);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1533);
					match(K_NOT);
					setState(1534);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_CROSS:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXCEPT:
				case K_EXPLAIN:
				case K_GROUP:
				case K_INNER:
				case K_INSERT:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UNION:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537);
				match(OPEN_PAR);
				setState(1547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1538);
					table_or_subquery();
					setState(1543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1539);
						match(COMMA);
						setState(1540);
						table_or_subquery();
						}
						}
						setState(1545);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1546);
					join_clause();
					}
					break;
				}
				setState(1549);
				match(CLOSE_PAR);
				setState(1554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1551);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
					case 1:
						{
						setState(1550);
						match(K_AS);
						}
						break;
					}
					setState(1553);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1556);
				match(OPEN_PAR);
				setState(1557);
				select_stmt();
				setState(1558);
				match(CLOSE_PAR);
				setState(1563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1560);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
					case 1:
						{
						setState(1559);
						match(K_AS);
						}
						break;
					}
					setState(1562);
					table_alias();
					}
					break;
				}
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_clause(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			table_or_subquery();
			setState(1574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INNER - 88)) | (1L << (K_JOIN - 88)) | (1L << (K_LEFT - 88)) | (1L << (K_NATURAL - 88)))) != 0)) {
				{
				{
				setState(1568);
				join_operator();
				setState(1569);
				table_or_subquery();
				setState(1570);
				join_constraint();
				}
				}
				setState(1576);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_operator(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_join_operator);
		int _la;
		try {
			setState(1590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1577);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1578);
					match(K_NATURAL);
					}
				}

				setState(1587);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1581);
					match(K_LEFT);
					setState(1583);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1582);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1585);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1586);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1589);
				match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_constraint(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1592);
				match(K_ON);
				setState(1593);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1594);
				match(K_USING);
				setState(1595);
				match(OPEN_PAR);
				setState(1596);
				column_name();
				setState(1601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1597);
					match(COMMA);
					setState(1598);
					column_name();
					}
					}
					setState(1603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1604);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_CROSS:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXCEPT:
			case K_EXPLAIN:
			case K_GROUP:
			case K_INNER:
			case K_INSERT:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UNION:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_core(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_select_core);
		int _la;
		try {
			setState(1682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1608);
				match(K_SELECT);
				setState(1610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1609);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1612);
				result_column();
				setState(1617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1613);
					match(COMMA);
					setState(1614);
					result_column();
					}
					}
					setState(1619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1620);
					match(K_FROM);
					setState(1630);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
					case 1:
						{
						setState(1621);
						table_or_subquery();
						setState(1626);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1622);
							match(COMMA);
							setState(1623);
							table_or_subquery();
							}
							}
							setState(1628);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1629);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1634);
					match(K_WHERE);
					setState(1635);
					expr(0);
					}
				}

				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1638);
					match(K_GROUP);
					setState(1639);
					match(K_BY);
					setState(1640);
					expr(0);
					setState(1645);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1641);
						match(COMMA);
						setState(1642);
						expr(0);
						}
						}
						setState(1647);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1650);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1648);
						match(K_HAVING);
						setState(1649);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1654);
				match(K_VALUES);
				setState(1655);
				match(OPEN_PAR);
				setState(1656);
				expr(0);
				setState(1661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1657);
					match(COMMA);
					setState(1658);
					expr(0);
					}
					}
					setState(1663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1664);
				match(CLOSE_PAR);
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1665);
					match(COMMA);
					setState(1666);
					match(OPEN_PAR);
					setState(1667);
					expr(0);
					setState(1672);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1668);
						match(COMMA);
						setState(1669);
						expr(0);
						}
						}
						setState(1674);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1675);
					match(CLOSE_PAR);
					}
					}
					setState(1681);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_operator(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_compound_operator);
		try {
			setState(1689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1684);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1685);
				match(K_UNION);
				setState(1686);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1687);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1688);
				match(K_EXCEPT);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCte_table_name(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			table_name();
			setState(1703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1692);
				match(OPEN_PAR);
				setState(1693);
				column_name();
				setState(1698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1694);
					match(COMMA);
					setState(1695);
					column_name();
					}
					}
					setState(1700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1701);
				match(CLOSE_PAR);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSigned_number(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1705);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1708);
			match(NUMERIC_LITERAL);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (K_NULL - 105)) | (1L << (NUMERIC_LITERAL - 105)) | (1L << (STRING_LITERAL - 105)) | (1L << (BLOB_LITERAL - 105)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLiteParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError_message(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_argument(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_module_argument);
		try {
			setState(1718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1716);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1717);
				column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_alias(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLiteParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLiteParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLiteParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLiteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLiteParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLiteParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLiteParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLiteParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (K_ABORT - 26)) | (1L << (K_ACTION - 26)) | (1L << (K_ADD - 26)) | (1L << (K_AFTER - 26)) | (1L << (K_ALL - 26)) | (1L << (K_ALTER - 26)) | (1L << (K_ANALYZE - 26)) | (1L << (K_AND - 26)) | (1L << (K_AS - 26)) | (1L << (K_ASC - 26)) | (1L << (K_ATTACH - 26)) | (1L << (K_AUTOINCREMENT - 26)) | (1L << (K_BEFORE - 26)) | (1L << (K_BEGIN - 26)) | (1L << (K_BETWEEN - 26)) | (1L << (K_BY - 26)) | (1L << (K_CASCADE - 26)) | (1L << (K_CASE - 26)) | (1L << (K_CAST - 26)) | (1L << (K_CHECK - 26)) | (1L << (K_COLLATE - 26)) | (1L << (K_COLUMN - 26)) | (1L << (K_COMMIT - 26)) | (1L << (K_CONFLICT - 26)) | (1L << (K_CONSTRAINT - 26)) | (1L << (K_CREATE - 26)) | (1L << (K_CROSS - 26)) | (1L << (K_CURRENT_DATE - 26)) | (1L << (K_CURRENT_TIME - 26)) | (1L << (K_CURRENT_TIMESTAMP - 26)) | (1L << (K_DATABASE - 26)) | (1L << (K_DEFAULT - 26)) | (1L << (K_DEFERRABLE - 26)) | (1L << (K_DEFERRED - 26)) | (1L << (K_DELETE - 26)) | (1L << (K_DESC - 26)) | (1L << (K_DETACH - 26)) | (1L << (K_DISTINCT - 26)) | (1L << (K_DROP - 26)) | (1L << (K_EACH - 26)) | (1L << (K_ELSE - 26)) | (1L << (K_END - 26)) | (1L << (K_ESCAPE - 26)) | (1L << (K_EXCEPT - 26)) | (1L << (K_EXCLUSIVE - 26)) | (1L << (K_EXISTS - 26)) | (1L << (K_EXPLAIN - 26)) | (1L << (K_FAIL - 26)) | (1L << (K_FOR - 26)) | (1L << (K_FOREIGN - 26)) | (1L << (K_FROM - 26)) | (1L << (K_FULL - 26)) | (1L << (K_GLOB - 26)) | (1L << (K_GROUP - 26)) | (1L << (K_HAVING - 26)) | (1L << (K_IF - 26)) | (1L << (K_IGNORE - 26)) | (1L << (K_IMMEDIATE - 26)) | (1L << (K_IN - 26)) | (1L << (K_INDEX - 26)) | (1L << (K_INDEXED - 26)) | (1L << (K_INITIALLY - 26)) | (1L << (K_INNER - 26)) | (1L << (K_INSERT - 26)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (K_INSTEAD - 90)) | (1L << (K_INTERSECT - 90)) | (1L << (K_INTO - 90)) | (1L << (K_IS - 90)) | (1L << (K_ISNULL - 90)) | (1L << (K_JOIN - 90)) | (1L << (K_KEY - 90)) | (1L << (K_LEFT - 90)) | (1L << (K_LIKE - 90)) | (1L << (K_LIMIT - 90)) | (1L << (K_MATCH - 90)) | (1L << (K_NATURAL - 90)) | (1L << (K_NO - 90)) | (1L << (K_NOT - 90)) | (1L << (K_NOTNULL - 90)) | (1L << (K_NULL - 90)) | (1L << (K_OF - 90)) | (1L << (K_OFFSET - 90)) | (1L << (K_ON - 90)) | (1L << (K_OR - 90)) | (1L << (K_ORDER - 90)) | (1L << (K_OUTER - 90)) | (1L << (K_PLAN - 90)) | (1L << (K_PRAGMA - 90)) | (1L << (K_PRIMARY - 90)) | (1L << (K_QUERY - 90)) | (1L << (K_RAISE - 90)) | (1L << (K_RECURSIVE - 90)) | (1L << (K_REFERENCES - 90)) | (1L << (K_REGEXP - 90)) | (1L << (K_REINDEX - 90)) | (1L << (K_RELEASE - 90)) | (1L << (K_RENAME - 90)) | (1L << (K_REPLACE - 90)) | (1L << (K_RESTRICT - 90)) | (1L << (K_RIGHT - 90)) | (1L << (K_ROLLBACK - 90)) | (1L << (K_ROW - 90)) | (1L << (K_SAVEPOINT - 90)) | (1L << (K_SELECT - 90)) | (1L << (K_SET - 90)) | (1L << (K_TABLE - 90)) | (1L << (K_TEMP - 90)) | (1L << (K_TEMPORARY - 90)) | (1L << (K_THEN - 90)) | (1L << (K_TO - 90)) | (1L << (K_TRANSACTION - 90)) | (1L << (K_TRIGGER - 90)) | (1L << (K_UNION - 90)) | (1L << (K_UNIQUE - 90)) | (1L << (K_UPDATE - 90)) | (1L << (K_USING - 90)) | (1L << (K_VACUUM - 90)) | (1L << (K_VALUES - 90)) | (1L << (K_VIEW - 90)) | (1L << (K_VIRTUAL - 90)) | (1L << (K_WHEN - 90)) | (1L << (K_WHERE - 90)) | (1L << (K_WITH - 90)) | (1L << (K_WITHOUT - 90)))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDatabase_name(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_index_name(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitNew_table_name(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			any_name();
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

	public static class Subtable_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Subtable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSubtable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSubtable_name(this);
		}
	}

	public final Subtable_nameContext subtable_name() throws RecognitionException {
		Subtable_nameContext _localctx = new Subtable_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_subtable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCollation_name(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_table(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTrigger_name(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitView_name(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_name(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_name(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_name(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_alias(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			any_name();
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTransaction_name(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_name(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_any_name);
		try {
			setState(1767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1760);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1761);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1762);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1763);
				match(OPEN_PAR);
				setState(1764);
				any_name();
				setState(1765);
				match(CLOSE_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 40:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a0\u06ec\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\7\2\u00ad\n\2\f\2\16\2\u00b0\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\7\4\u00b8\n\4\f\4\16\4\u00bb\13\4\3\4\3\4\6\4\u00bf\n\4\r\4\16\4\u00c0"+
		"\3\4\7\4\u00c4\n\4\f\4\16\4\u00c7\13\4\3\4\7\4\u00ca\n\4\f\4\16\4\u00cd"+
		"\13\4\3\5\3\5\3\5\5\5\u00d2\n\5\5\5\u00d4\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f4\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00fb"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0103\n\6\3\6\5\6\u0106\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u010f\n\7\3\b\3\b\5\b\u0113\n\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\5\t\u011b\n\t\3\t\3\t\5\t\u011f\n\t\5\t\u0121\n\t\3\n\3\n\3\n"+
		"\5\n\u0126\n\n\5\n\u0128\n\n\3\13\3\13\5\13\u012c\n\13\3\13\3\13\3\13"+
		"\7\13\u0131\n\13\f\13\16\13\u0134\13\13\5\13\u0136\n\13\3\13\3\13\3\13"+
		"\5\13\u013b\n\13\3\13\3\13\5\13\u013f\n\13\3\13\6\13\u0142\n\13\r\13\16"+
		"\13\u0143\3\13\3\13\3\13\3\13\3\13\7\13\u014b\n\13\f\13\16\13\u014e\13"+
		"\13\5\13\u0150\n\13\3\13\3\13\3\13\3\13\5\13\u0156\n\13\5\13\u0158\n\13"+
		"\3\f\3\f\5\f\u015c\n\f\3\f\3\f\3\f\3\f\5\f\u0162\n\f\3\f\3\f\3\f\5\f\u0167"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0170\n\f\f\f\16\f\u0173\13\f\3\f"+
		"\3\f\3\f\5\f\u0178\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0182\n\r\f"+
		"\r\16\r\u0185\13\r\3\r\3\r\7\r\u0189\n\r\f\r\16\r\u018c\13\r\3\r\3\r\3"+
		"\16\3\16\5\16\u0192\n\16\3\16\3\16\3\16\3\16\5\16\u0198\n\16\3\16\3\16"+
		"\3\16\5\16\u019d\n\16\3\16\3\16\3\16\3\16\5\16\u01a3\n\16\3\16\3\16\7"+
		"\16\u01a7\n\16\f\16\16\16\u01aa\13\16\3\16\3\16\7\16\u01ae\n\16\f\16\16"+
		"\16\u01b1\13\16\3\16\3\16\7\16\u01b5\n\16\f\16\16\16\u01b8\13\16\3\16"+
		"\3\16\3\16\5\16\u01bd\n\16\3\16\3\16\5\16\u01c1\n\16\3\17\3\17\5\17\u01c5"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u01cb\n\17\3\17\3\17\3\17\5\17\u01d0\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u01d7\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u01e0\n\17\f\17\16\17\u01e3\13\17\5\17\u01e5\n\17\5\17"+
		"\u01e7\n\17\3\17\3\17\3\17\3\17\5\17\u01ed\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u01f3\n\17\3\17\3\17\5\17\u01f7\n\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u01fe\n\17\3\17\3\17\6\17\u0202\n\17\r\17\16\17\u0203\3\17\3\17\3\20"+
		"\3\20\5\20\u020a\n\20\3\20\3\20\3\20\3\20\5\20\u0210\n\20\3\20\3\20\3"+
		"\20\5\20\u0215\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0221\n\21\3\21\3\21\3\21\5\21\u0226\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u022f\n\21\f\21\16\21\u0232\13\21\3\21\3\21\5\21\u0236"+
		"\n\21\3\22\5\22\u0239\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0240\n\22\3"+
		"\23\5\23\u0243\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u024a\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0251\n\23\f\23\16\23\u0254\13\23\5\23\u0256\n\23"+
		"\3\23\3\23\3\23\3\23\5\23\u025c\n\23\5\23\u025e\n\23\3\24\3\24\5\24\u0262"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u026a\n\25\3\25\3\25\3\25\5\25"+
		"\u026f\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0277\n\26\3\26\3\26\3"+
		"\26\5\26\u027c\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0284\n\27\3\27"+
		"\3\27\3\27\5\27\u0289\n\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0291\n"+
		"\30\3\30\3\30\3\30\5\30\u0296\n\30\3\30\3\30\3\31\3\31\5\31\u029c\n\31"+
		"\3\31\3\31\3\31\7\31\u02a1\n\31\f\31\16\31\u02a4\13\31\5\31\u02a6\n\31"+
		"\3\31\3\31\3\31\3\31\7\31\u02ac\n\31\f\31\16\31\u02af\13\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u02b6\n\31\f\31\16\31\u02b9\13\31\5\31\u02bb\n\31"+
		"\3\31\3\31\3\31\3\31\5\31\u02c1\n\31\5\31\u02c3\n\31\3\32\5\32\u02c6\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u02d9\n\32\3\32\3\32\3\32\3\32\5\32\u02df\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u02e6\n\32\f\32\16\32\u02e9\13\32\3\32"+
		"\3\32\5\32\u02ed\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u02f4\n\32\f\32\16"+
		"\32\u02f7\13\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u02ff\n\32\f\32\16"+
		"\32\u0302\13\32\3\32\3\32\7\32\u0306\n\32\f\32\16\32\u0309\13\32\3\32"+
		"\3\32\3\32\5\32\u030e\n\32\3\33\3\33\3\33\3\33\5\33\u0314\n\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u031d\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0324\n\34\3\34\3\34\5\34\u0328\n\34\5\34\u032a\n\34\3\35\3\35\5"+
		"\35\u032e\n\35\3\35\3\35\3\36\3\36\3\36\5\36\u0335\n\36\5\36\u0337\n\36"+
		"\3\36\3\36\5\36\u033b\n\36\3\36\5\36\u033e\n\36\3\37\3\37\3\37\3 \3 \5"+
		" \u0345\n \3 \3 \3 \7 \u034a\n \f \16 \u034d\13 \5 \u034f\n \3 \3 \3 "+
		"\3 \3 \3 \7 \u0357\n \f \16 \u035a\13 \5 \u035c\n \3 \3 \3 \3 \5 \u0362"+
		"\n \5 \u0364\n \3!\3!\5!\u0368\n!\3!\3!\3!\7!\u036d\n!\f!\16!\u0370\13"+
		"!\5!\u0372\n!\3!\3!\3!\3!\7!\u0378\n!\f!\16!\u037b\13!\3!\3!\3!\3!\3!"+
		"\7!\u0382\n!\f!\16!\u0385\13!\5!\u0387\n!\3!\3!\3!\3!\5!\u038d\n!\5!\u038f"+
		"\n!\3\"\3\"\5\"\u0393\n\"\3\"\3\"\3\"\7\"\u0398\n\"\f\"\16\"\u039b\13"+
		"\"\3\"\3\"\3\"\3\"\7\"\u03a1\n\"\f\"\16\"\u03a4\13\"\3\"\5\"\u03a7\n\""+
		"\5\"\u03a9\n\"\3\"\3\"\5\"\u03ad\n\"\3\"\3\"\3\"\3\"\3\"\7\"\u03b4\n\""+
		"\f\"\16\"\u03b7\13\"\3\"\3\"\5\"\u03bb\n\"\5\"\u03bd\n\"\3\"\3\"\3\"\3"+
		"\"\3\"\7\"\u03c4\n\"\f\"\16\"\u03c7\13\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u03cf"+
		"\n\"\f\"\16\"\u03d2\13\"\3\"\3\"\7\"\u03d6\n\"\f\"\16\"\u03d9\13\"\5\""+
		"\u03db\n\"\3#\5#\u03de\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u03eb\n"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u03f7\n#\f#\16#\u03fa\13#\3#\3#\5#"+
		"\u03fe\n#\3$\5$\u0401\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u040e\n$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u041a\n$\f$\16$\u041d\13$\3$\3$\5$\u0421"+
		"\n$\3$\3$\3$\3$\3$\7$\u0428\n$\f$\16$\u042b\13$\5$\u042d\n$\3$\3$\3$\3"+
		"$\5$\u0433\n$\5$\u0435\n$\3%\3%\3&\3&\5&\u043b\n&\3&\7&\u043e\n&\f&\16"+
		"&\u0441\13&\3\'\6\'\u0444\n\'\r\'\16\'\u0445\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u0452\n\'\3(\3(\5(\u0456\n(\3(\3(\3(\5(\u045b\n(\3"+
		"(\3(\5(\u045f\n(\3(\5(\u0462\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u0474\n(\3(\3(\3(\5(\u0479\n(\3)\3)\3)\5)\u047e\n)\3*\3"+
		"*\3*\3*\3*\3*\5*\u0486\n*\3*\3*\3*\5*\u048b\n*\3*\3*\3*\3*\3*\3*\3*\5"+
		"*\u0494\n*\3*\3*\3*\7*\u0499\n*\f*\16*\u049c\13*\3*\5*\u049f\n*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u04af\n*\3*\5*\u04b2\n*\3*\3*"+
		"\3*\3*\3*\3*\5*\u04ba\n*\3*\3*\3*\3*\3*\6*\u04c1\n*\r*\16*\u04c2\3*\3"+
		"*\5*\u04c7\n*\3*\3*\3*\5*\u04cc\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u04ea\n*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\5*\u04f6\n*\3*\3*\3*\5*\u04fb\n*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\5*\u0507\n*\3*\3*\3*\3*\5*\u050d\n*\3*\3*\3*\3*\3*\5"+
		"*\u0514\n*\3*\3*\5*\u0518\n*\3*\3*\3*\3*\3*\3*\7*\u0520\n*\f*\16*\u0523"+
		"\13*\5*\u0525\n*\3*\3*\3*\3*\5*\u052b\n*\3*\5*\u052e\n*\7*\u0530\n*\f"+
		"*\16*\u0533\13*\3+\3+\3+\3+\3+\3+\7+\u053b\n+\f+\16+\u053e\13+\3+\3+\5"+
		"+\u0542\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u054e\n+\3+\3+\5+\u0552\n"+
		"+\7+\u0554\n+\f+\16+\u0557\13+\3+\5+\u055a\n+\3+\3+\3+\3+\3+\5+\u0561"+
		"\n+\5+\u0563\n+\3,\3,\3,\3,\3,\3,\5,\u056b\n,\3,\3,\3-\3-\3-\5-\u0572"+
		"\n-\3-\5-\u0575\n-\3.\3.\5.\u0579\n.\3.\3.\3.\5.\u057e\n.\3.\3.\3.\3."+
		"\7.\u0584\n.\f.\16.\u0587\13.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\7.\u0597\n.\f.\16.\u059a\13.\3.\3.\3.\5.\u059f\n.\3/\3/\5/\u05a3\n/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u05b1\n/\f/\16/\u05b4\13/\3\60"+
		"\3\60\3\60\5\60\u05b9\n\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u05c1\n"+
		"\60\3\61\3\61\3\61\5\61\u05c6\n\61\3\61\5\61\u05c9\n\61\3\62\3\62\3\62"+
		"\5\62\u05ce\n\62\3\63\3\63\3\63\3\63\3\63\7\63\u05d5\n\63\f\63\16\63\u05d8"+
		"\13\63\3\63\3\63\5\63\u05dc\n\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u05ea\n\64\3\64\5\64\u05ed\n\64\5\64\u05ef"+
		"\n\64\3\65\3\65\3\65\5\65\u05f4\n\65\3\65\3\65\5\65\u05f8\n\65\3\65\5"+
		"\65\u05fb\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u0602\n\65\3\65\3\65\3\65"+
		"\3\65\7\65\u0608\n\65\f\65\16\65\u060b\13\65\3\65\5\65\u060e\n\65\3\65"+
		"\3\65\5\65\u0612\n\65\3\65\5\65\u0615\n\65\3\65\3\65\3\65\3\65\5\65\u061b"+
		"\n\65\3\65\5\65\u061e\n\65\5\65\u0620\n\65\3\66\3\66\3\66\3\66\3\66\7"+
		"\66\u0627\n\66\f\66\16\66\u062a\13\66\3\67\3\67\5\67\u062e\n\67\3\67\3"+
		"\67\5\67\u0632\n\67\3\67\3\67\5\67\u0636\n\67\3\67\5\67\u0639\n\67\38"+
		"\38\38\38\38\38\38\78\u0642\n8\f8\168\u0645\138\38\38\58\u0649\n8\39\3"+
		"9\59\u064d\n9\39\39\39\79\u0652\n9\f9\169\u0655\139\39\39\39\39\79\u065b"+
		"\n9\f9\169\u065e\139\39\59\u0661\n9\59\u0663\n9\39\39\59\u0667\n9\39\3"+
		"9\39\39\39\79\u066e\n9\f9\169\u0671\139\39\39\59\u0675\n9\59\u0677\n9"+
		"\39\39\39\39\39\79\u067e\n9\f9\169\u0681\139\39\39\39\39\39\39\79\u0689"+
		"\n9\f9\169\u068c\139\39\39\79\u0690\n9\f9\169\u0693\139\59\u0695\n9\3"+
		":\3:\3:\3:\3:\5:\u069c\n:\3;\3;\3;\3;\3;\7;\u06a3\n;\f;\16;\u06a6\13;"+
		"\3;\3;\5;\u06aa\n;\3<\5<\u06ad\n<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\5@\u06b9"+
		"\n@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K"+
		"\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3U\3U\3U"+
		"\3U\3U\5U\u06ea\nU\3U\2\3RV\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\2\24\5\2==HHUU\4\2\62\62EE\4\2\b"+
		"\bmm\3\2\u0086\u0087\4\2  AA\4\2%%??\7\2\34\34KKTT}}\u0080\u0080\4\2\n"+
		"\n\17\20\3\2\13\f\3\2\21\24\3\2\25\30\6\2PPddffyy\4\2>>\u008e\u008e\5"+
		"\2\34\34KK\u0080\u0080\6\2\679kk\u0099\u0099\u009b\u009c\4\2\13\rii\4"+
		"\2\u0098\u0098\u009b\u009b\3\2\34\u0097\2\u07fb\2\u00ae\3\2\2\2\4\u00b3"+
		"\3\2\2\2\6\u00b9\3\2\2\2\b\u00d3\3\2\2\2\n\u00f5\3\2\2\2\f\u0107\3\2\2"+
		"\2\16\u0110\3\2\2\2\20\u0118\3\2\2\2\22\u0122\3\2\2\2\24\u0135\3\2\2\2"+
		"\26\u0159\3\2\2\2\30\u0179\3\2\2\2\32\u018f\3\2\2\2\34\u01c2\3\2\2\2\36"+
		"\u0207\3\2\2\2 \u021a\3\2\2\2\"\u0238\3\2\2\2$\u0242\3\2\2\2&\u025f\3"+
		"\2\2\2(\u0265\3\2\2\2*\u0272\3\2\2\2,\u027f\3\2\2\2.\u028c\3\2\2\2\60"+
		"\u02a5\3\2\2\2\62\u02c5\3\2\2\2\64\u030f\3\2\2\2\66\u031e\3\2\2\28\u032b"+
		"\3\2\2\2:\u0331\3\2\2\2<\u033f\3\2\2\2>\u034e\3\2\2\2@\u0371\3\2\2\2B"+
		"\u03da\3\2\2\2D\u03dd\3\2\2\2F\u0400\3\2\2\2H\u0436\3\2\2\2J\u0438\3\2"+
		"\2\2L\u0443\3\2\2\2N\u0455\3\2\2\2P\u047d\3\2\2\2R\u04cb\3\2\2\2T\u0534"+
		"\3\2\2\2V\u0564\3\2\2\2X\u056e\3\2\2\2Z\u0578\3\2\2\2\\\u05a0\3\2\2\2"+
		"^\u05b8\3\2\2\2`\u05c2\3\2\2\2b\u05cd\3\2\2\2d\u05cf\3\2\2\2f\u05ee\3"+
		"\2\2\2h\u061f\3\2\2\2j\u0621\3\2\2\2l\u0638\3\2\2\2n\u0648\3\2\2\2p\u0694"+
		"\3\2\2\2r\u069b\3\2\2\2t\u069d\3\2\2\2v\u06ac\3\2\2\2x\u06b0\3\2\2\2z"+
		"\u06b2\3\2\2\2|\u06b4\3\2\2\2~\u06b8\3\2\2\2\u0080\u06ba\3\2\2\2\u0082"+
		"\u06bc\3\2\2\2\u0084\u06be\3\2\2\2\u0086\u06c0\3\2\2\2\u0088\u06c2\3\2"+
		"\2\2\u008a\u06c4\3\2\2\2\u008c\u06c6\3\2\2\2\u008e\u06c8\3\2\2\2\u0090"+
		"\u06ca\3\2\2\2\u0092\u06cc\3\2\2\2\u0094\u06ce\3\2\2\2\u0096\u06d0\3\2"+
		"\2\2\u0098\u06d2\3\2\2\2\u009a\u06d4\3\2\2\2\u009c\u06d6\3\2\2\2\u009e"+
		"\u06d8\3\2\2\2\u00a0\u06da\3\2\2\2\u00a2\u06dc\3\2\2\2\u00a4\u06de\3\2"+
		"\2\2\u00a6\u06e0\3\2\2\2\u00a8\u06e9\3\2\2\2\u00aa\u00ad\5\6\4\2\u00ab"+
		"\u00ad\5\4\3\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\7\2\2\3\u00b2\3\3\2\2\2\u00b3\u00b4\7\u00a0"+
		"\2\2\u00b4\u00b5\b\3\1\2\u00b5\5\3\2\2\2\u00b6\u00b8\7\4\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c5\5\b\5\2\u00bd\u00bf\7\4"+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\5\b\5\2\u00c3\u00be\3\2"+
		"\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00cb\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\7\4\2\2\u00c9\u00c8\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\7\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\7J\2\2\u00cf\u00d0\7u\2\2\u00d0"+
		"\u00d2\7r\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00f3\3\2\2\2\u00d5"+
		"\u00f4\5\n\6\2\u00d6\u00f4\5\f\7\2\u00d7\u00f4\5\16\b\2\u00d8\u00f4\5"+
		"\20\t\2\u00d9\u00f4\5\22\n\2\u00da\u00f4\5\24\13\2\u00db\u00f4\5\26\f"+
		"\2\u00dc\u00f4\5\32\16\2\u00dd\u00f4\5\34\17\2\u00de\u00f4\5\36\20\2\u00df"+
		"\u00f4\5 \21\2\u00e0\u00f4\5\"\22\2\u00e1\u00f4\5$\23\2\u00e2\u00f4\5"+
		"&\24\2\u00e3\u00f4\5(\25\2\u00e4\u00f4\5*\26\2\u00e5\u00f4\5,\27\2\u00e6"+
		"\u00f4\5.\30\2\u00e7\u00f4\5\60\31\2\u00e8\u00f4\5\62\32\2\u00e9\u00f4"+
		"\5\64\33\2\u00ea\u00f4\5\66\34\2\u00eb\u00f4\58\35\2\u00ec\u00f4\5:\36"+
		"\2\u00ed\u00f4\5<\37\2\u00ee\u00f4\5> \2\u00ef\u00f4\5@!\2\u00f0\u00f4"+
		"\5D#\2\u00f1\u00f4\5F$\2\u00f2\u00f4\5H%\2\u00f3\u00d5\3\2\2\2\u00f3\u00d6"+
		"\3\2\2\2\u00f3\u00d7\3\2\2\2\u00f3\u00d8\3\2\2\2\u00f3\u00d9\3\2\2\2\u00f3"+
		"\u00da\3\2\2\2\u00f3\u00db\3\2\2\2\u00f3\u00dc\3\2\2\2\u00f3\u00dd\3\2"+
		"\2\2\u00f3\u00de\3\2\2\2\u00f3\u00df\3\2\2\2\u00f3\u00e0\3\2\2\2\u00f3"+
		"\u00e1\3\2\2\2\u00f3\u00e2\3\2\2\2\u00f3\u00e3\3\2\2\2\u00f3\u00e4\3\2"+
		"\2\2\u00f3\u00e5\3\2\2\2\u00f3\u00e6\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f3"+
		"\u00e8\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00eb\3\2"+
		"\2\2\u00f3\u00ec\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3"+
		"\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2"+
		"\2\2\u00f4\t\3\2\2\2\u00f5\u00f6\7!\2\2\u00f6\u00fa\7\u0085\2\2\u00f7"+
		"\u00f8\5\u0088E\2\u00f8\u00f9\7\5\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f7"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0105\5\u008aF"+
		"\2\u00fd\u00fe\7|\2\2\u00fe\u00ff\7\u0089\2\2\u00ff\u0106\5\u008eH\2\u0100"+
		"\u0102\7\36\2\2\u0101\u0103\7\61\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\5J&\2\u0105\u00fd\3\2\2\2\u0105"+
		"\u0100\3\2\2\2\u0106\13\3\2\2\2\u0107\u010e\7\"\2\2\u0108\u010f\5\u0088"+
		"E\2\u0109\u010f\5\u008cG\2\u010a\u010b\5\u0088E\2\u010b\u010c\7\5\2\2"+
		"\u010c\u010d\5\u008cG\2\u010d\u010f\3\2\2\2\u010e\u0108\3\2\2\2\u010e"+
		"\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010f\3\2\2\2\u010f\r\3\2\2\2"+
		"\u0110\u0112\7&\2\2\u0111\u0113\7:\2\2\u0112\u0111\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\5R*\2\u0115\u0116\7$\2\2\u0116"+
		"\u0117\5\u0088E\2\u0117\17\3\2\2\2\u0118\u011a\7)\2\2\u0119\u011b\t\2"+
		"\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0120\3\2\2\2\u011c"+
		"\u011e\7\u008a\2\2\u011d\u011f\5\u00a6T\2\u011e\u011d\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\21\3\2\2\2\u0122\u0127\t\3\2\2\u0123\u0125\7\u008a\2\2\u0124\u0126\5"+
		"\u00a6T\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2"+
		"\u0127\u0123\3\2\2\2\u0127\u0128\3\2\2\2\u0128\23\3\2\2\2\u0129\u012b"+
		"\7\u0096\2\2\u012a\u012c\7w\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2"+
		"\2\u012c\u012d\3\2\2\2\u012d\u0132\5d\63\2\u012e\u012f\7\b\2\2\u012f\u0131"+
		"\5d\63\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0129\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0141\5p9\2\u0138\u013a"+
		"\7\u008c\2\2\u0139\u013b\7 \2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2"+
		"\2\u013b\u013f\3\2\2\2\u013c\u013f\7]\2\2\u013d\u013f\7G\2\2\u013e\u0138"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0142\5p9\2\u0141\u013e\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2"+
		"\2\u0143\u0144\3\2\2\2\u0144\u014f\3\2\2\2\u0145\u0146\7p\2\2\u0146\u0147"+
		"\7+\2\2\u0147\u014c\5`\61\2\u0148\u0149\7\b\2\2\u0149\u014b\5`\61\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0145\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0157\3\2\2\2\u0151\u0152\7e\2\2\u0152\u0155\5R*"+
		"\2\u0153\u0154\t\4\2\2\u0154\u0156\5R*\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0151\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\25\3\2\2\2\u0159\u015b\7\65\2\2\u015a\u015c\7\u008d\2\2\u015b\u015a\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0161\7W\2\2\u015e"+
		"\u015f\7S\2\2\u015f\u0160\7i\2\2\u0160\u0162\7I\2\2\u0161\u015e\3\2\2"+
		"\2\u0161\u0162\3\2\2\2\u0162\u0166\3\2\2\2\u0163\u0164\5\u0088E\2\u0164"+
		"\u0165\7\5\2\2\u0165\u0167\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u0169\5\u0098M\2\u0169\u016a\7n\2\2\u016a"+
		"\u016b\5\u008aF\2\u016b\u016c\7\6\2\2\u016c\u0171\5X-\2\u016d\u016e\7"+
		"\b\2\2\u016e\u0170\5X-\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0174\u0177\7\7\2\2\u0175\u0176\7\u0095\2\2\u0176\u0178\5R*\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\27\3\2\2\2\u0179\u017a\5\u0092"+
		"J\2\u017a\u017b\7\u0084\2\2\u017b\u017c\7\6\2\2\u017c\u017d\7\u0081\2"+
		"\2\u017d\u017e\7\6\2\2\u017e\u0183\5J&\2\u017f\u0180\7\b\2\2\u0180\u0182"+
		"\5J&\2\u0181\u017f\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u018a\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7\b"+
		"\2\2\u0187\u0189\5\30\r\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018d\u018e\7\3\2\2\u018e\31\3\2\2\2\u018f\u0191\7\65\2\2\u0190\u0192"+
		"\t\5\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0197\7\u0085\2\2\u0194\u0195\7S\2\2\u0195\u0196\7i\2\2\u0196\u0198\7"+
		"I\2\2\u0197\u0194\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019c\3\2\2\2\u0199"+
		"\u019a\5\u0088E\2\u019a\u019b\7\5\2\2\u019b\u019d\3\2\2\2\u019c\u0199"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01c0\5\u008aF"+
		"\2\u019f\u01a2\7\6\2\2\u01a0\u01a3\5J&\2\u01a1\u01a3\5\30\r\2\u01a2\u01a0"+
		"\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a8\3\2\2\2\u01a4\u01a5\7\b\2\2\u01a5"+
		"\u01a7\5J&\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2"+
		"\2\u01a8\u01a9\3\2\2\2\u01a9\u01af\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac"+
		"\7\b\2\2\u01ac\u01ae\5\30\r\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2"+
		"\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b6\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\u01b2\u01b3\7\b\2\2\u01b3\u01b5\5Z.\2\u01b4\u01b2\3\2\2\2\u01b5"+
		"\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\7\7\2\2\u01ba\u01bb\7\u0097\2\2\u01bb"+
		"\u01bd\7\u0098\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c1"+
		"\3\2\2\2\u01be\u01bf\7$\2\2\u01bf\u01c1\5@!\2\u01c0\u019f\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c1\33\3\2\2\2\u01c2\u01c4\7\65\2\2\u01c3\u01c5\t\5\2"+
		"\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01ca"+
		"\7\u008b\2\2\u01c7\u01c8\7S\2\2\u01c8\u01c9\7i\2\2\u01c9\u01cb\7I\2\2"+
		"\u01ca\u01c7\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cf\3\2\2\2\u01cc\u01cd"+
		"\5\u0088E\2\u01cd\u01ce\7\5\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cc\3\2\2"+
		"\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d6\5\u009aN\2\u01d2"+
		"\u01d7\7(\2\2\u01d3\u01d7\7\37\2\2\u01d4\u01d5\7\\\2\2\u01d5\u01d7\7l"+
		"\2\2\u01d6\u01d2\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01e6\3\2\2\2\u01d8\u01e7\7>\2\2\u01d9\u01e7\7[\2"+
		"\2\u01da\u01e4\7\u008e\2\2\u01db\u01dc\7l\2\2\u01dc\u01e1\5\u0090I\2\u01dd"+
		"\u01de\7\b\2\2\u01de\u01e0\5\u0090I\2\u01df\u01dd\3\2\2\2\u01e0\u01e3"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01db\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2"+
		"\2\2\u01e6\u01d8\3\2\2\2\u01e6\u01d9\3\2\2\2\u01e6\u01da\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01ec\7n\2\2\u01e9\u01ea\5\u0088E\2\u01ea\u01eb\7"+
		"\5\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01f2\5\u008aF\2\u01ef\u01f0\7L\2\2\u01f0\u01f1\7"+
		"C\2\2\u01f1\u01f3\7\u0081\2\2\u01f2\u01ef\3\2\2\2\u01f2\u01f3\3\2\2\2"+
		"\u01f3\u01f6\3\2\2\2\u01f4\u01f5\7\u0094\2\2\u01f5\u01f7\5R*\2\u01f6\u01f4"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0201\7)\2\2\u01f9"+
		"\u01fe\5D#\2\u01fa\u01fe\5\62\32\2\u01fb\u01fe\5\"\22\2\u01fc\u01fe\5"+
		"@!\2\u01fd\u01f9\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7\4\2\2\u0200\u0202\3\2"+
		"\2\2\u0201\u01fd\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7E\2\2\u0206\35\3\2\2\2"+
		"\u0207\u0209\7\65\2\2\u0208\u020a\t\5\2\2\u0209\u0208\3\2\2\2\u0209\u020a"+
		"\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020f\7\u0092\2\2\u020c\u020d\7S\2"+
		"\2\u020d\u020e\7i\2\2\u020e\u0210\7I\2\2\u020f\u020c\3\2\2\2\u020f\u0210"+
		"\3\2\2\2\u0210\u0214\3\2\2\2\u0211\u0212\5\u0088E\2\u0212\u0213\7\5\2"+
		"\2\u0213\u0215\3\2\2\2\u0214\u0211\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216"+
		"\3\2\2\2\u0216\u0217\5\u009cO\2\u0217\u0218\7$\2\2\u0218\u0219\5@!\2\u0219"+
		"\37\3\2\2\2\u021a\u021b\7\65\2\2\u021b\u021c\7\u0093\2\2\u021c\u0220\7"+
		"\u0085\2\2\u021d\u021e\7S\2\2\u021e\u021f\7i\2\2\u021f\u0221\7I\2\2\u0220"+
		"\u021d\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0225\3\2\2\2\u0222\u0223\5\u0088"+
		"E\2\u0223\u0224\7\5\2\2\u0224\u0226\3\2\2\2\u0225\u0222\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\5\u008aF\2\u0228\u0229"+
		"\7\u008f\2\2\u0229\u0235\5\u009eP\2\u022a\u022b\7\6\2\2\u022b\u0230\5"+
		"~@\2\u022c\u022d\7\b\2\2\u022d\u022f\5~@\2\u022e\u022c\3\2\2\2\u022f\u0232"+
		"\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232"+
		"\u0230\3\2\2\2\u0233\u0234\7\7\2\2\u0234\u0236\3\2\2\2\u0235\u022a\3\2"+
		"\2\2\u0235\u0236\3\2\2\2\u0236!\3\2\2\2\u0237\u0239\5\\/\2\u0238\u0237"+
		"\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\7>\2\2\u023b"+
		"\u023c\7N\2\2\u023c\u023f\5^\60\2\u023d\u023e\7\u0095\2\2\u023e\u0240"+
		"\5R*\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240#\3\2\2\2\u0241\u0243"+
		"\5\\/\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0245\7>\2\2\u0245\u0246\7N\2\2\u0246\u0249\5^\60\2\u0247\u0248\7\u0095"+
		"\2\2\u0248\u024a\5R*\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u025d"+
		"\3\2\2\2\u024b\u024c\7p\2\2\u024c\u024d\7+\2\2\u024d\u0252\5`\61\2\u024e"+
		"\u024f\7\b\2\2\u024f\u0251\5`\61\2\u0250\u024e\3\2\2\2\u0251\u0254\3\2"+
		"\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0256\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u024b\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2"+
		"\2\2\u0257\u0258\7e\2\2\u0258\u025b\5R*\2\u0259\u025a\t\4\2\2\u025a\u025c"+
		"\5R*\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d"+
		"\u0255\3\2\2\2\u025d\u025e\3\2\2\2\u025e%\3\2\2\2\u025f\u0261\7@\2\2\u0260"+
		"\u0262\7:\2\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263\u0264\5\u0088E\2\u0264\'\3\2\2\2\u0265\u0266\7B\2\2\u0266\u0269"+
		"\7W\2\2\u0267\u0268\7S\2\2\u0268\u026a\7I\2\2\u0269\u0267\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u026e\3\2\2\2\u026b\u026c\5\u0088E\2\u026c\u026d"+
		"\7\5\2\2\u026d\u026f\3\2\2\2\u026e\u026b\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0271\5\u0098M\2\u0271)\3\2\2\2\u0272\u0273\7B\2"+
		"\2\u0273\u0276\7\u0085\2\2\u0274\u0275\7S\2\2\u0275\u0277\7I\2\2\u0276"+
		"\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027b\3\2\2\2\u0278\u0279\5\u0088"+
		"E\2\u0279\u027a\7\5\2\2\u027a\u027c\3\2\2\2\u027b\u0278\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\5\u008aF\2\u027e+\3\2\2"+
		"\2\u027f\u0280\7B\2\2\u0280\u0283\7\u008b\2\2\u0281\u0282\7S\2\2\u0282"+
		"\u0284\7I\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0288\3\2"+
		"\2\2\u0285\u0286\5\u0088E\2\u0286\u0287\7\5\2\2\u0287\u0289\3\2\2\2\u0288"+
		"\u0285\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\5\u009a"+
		"N\2\u028b-\3\2\2\2\u028c\u028d\7B\2\2\u028d\u0290\7\u0092\2\2\u028e\u028f"+
		"\7S\2\2\u028f\u0291\7I\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0295\3\2\2\2\u0292\u0293\5\u0088E\2\u0293\u0294\7\5\2\2\u0294\u0296"+
		"\3\2\2\2\u0295\u0292\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0298\5\u009cO\2\u0298/\3\2\2\2\u0299\u029b\7\u0096\2\2\u029a\u029c\7"+
		"w\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u02a2\5d\63\2\u029e\u029f\7\b\2\2\u029f\u02a1\5d\63\2\u02a0\u029e\3\2"+
		"\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u0299\3\2\2\2\u02a5\u02a6\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02ad\5p9\2\u02a8\u02a9\5r:\2\u02a9\u02aa"+
		"\5p9\2\u02aa\u02ac\3\2\2\2\u02ab\u02a8\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad"+
		"\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02ba\3\2\2\2\u02af\u02ad\3\2"+
		"\2\2\u02b0\u02b1\7p\2\2\u02b1\u02b2\7+\2\2\u02b2\u02b7\5`\61\2\u02b3\u02b4"+
		"\7\b\2\2\u02b4\u02b6\5`\61\2\u02b5\u02b3\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2"+
		"\2\2\u02ba\u02b0\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02c2\3\2\2\2\u02bc"+
		"\u02bd\7e\2\2\u02bd\u02c0\5R*\2\u02be\u02bf\t\4\2\2\u02bf\u02c1\5R*\2"+
		"\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02bc"+
		"\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\61\3\2\2\2\u02c4\u02c6\5\\/\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02d8\3\2\2\2\u02c7\u02d9\7["+
		"\2\2\u02c8\u02d9\7}\2\2\u02c9\u02ca\7[\2\2\u02ca\u02cb\7o\2\2\u02cb\u02d9"+
		"\7}\2\2\u02cc\u02cd\7[\2\2\u02cd\u02ce\7o\2\2\u02ce\u02d9\7\u0080\2\2"+
		"\u02cf\u02d0\7[\2\2\u02d0\u02d1\7o\2\2\u02d1\u02d9\7\34\2\2\u02d2\u02d3"+
		"\7[\2\2\u02d3\u02d4\7o\2\2\u02d4\u02d9\7K\2\2\u02d5\u02d6\7[\2\2\u02d6"+
		"\u02d7\7o\2\2\u02d7\u02d9\7T\2\2\u02d8\u02c7\3\2\2\2\u02d8\u02c8\3\2\2"+
		"\2\u02d8\u02c9\3\2\2\2\u02d8\u02cc\3\2\2\2\u02d8\u02cf\3\2\2\2\u02d8\u02d2"+
		"\3\2\2\2\u02d8\u02d5\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02de\7^\2\2\u02db"+
		"\u02dc\5\u0088E\2\u02dc\u02dd\7\5\2\2\u02dd\u02df\3\2\2\2\u02de\u02db"+
		"\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02ec\5\u008aF"+
		"\2\u02e1\u02e2\7\6\2\2\u02e2\u02e7\5\u0090I\2\u02e3\u02e4\7\b\2\2\u02e4"+
		"\u02e6\5\u0090I\2\u02e5\u02e3\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea"+
		"\u02eb\7\7\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02e1\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u030d\3\2\2\2\u02ee\u02ef\7\u0091\2\2\u02ef\u02f0\7\6\2\2\u02f0"+
		"\u02f5\5R*\2\u02f1\u02f2\7\b\2\2\u02f2\u02f4\5R*\2\u02f3\u02f1\3\2\2\2"+
		"\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8"+
		"\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u0307\7\7\2\2\u02f9\u02fa\7\b\2\2\u02fa"+
		"\u02fb\7\6\2\2\u02fb\u0300\5R*\2\u02fc\u02fd\7\b\2\2\u02fd\u02ff\5R*\2"+
		"\u02fe\u02fc\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301"+
		"\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304\7\7\2\2\u0304"+
		"\u0306\3\2\2\2\u0305\u02f9\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u030e\3\2\2\2\u0309\u0307\3\2\2\2\u030a"+
		"\u030e\5@!\2\u030b\u030c\7;\2\2\u030c\u030e\7\u0091\2\2\u030d\u02ee\3"+
		"\2\2\2\u030d\u030a\3\2\2\2\u030d\u030b\3\2\2\2\u030e\63\3\2\2\2\u030f"+
		"\u0313\7s\2\2\u0310\u0311\5\u0088E\2\u0311\u0312\7\5\2\2\u0312\u0314\3"+
		"\2\2\2\u0313\u0310\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315"+
		"\u031c\5\u00a0Q\2\u0316\u0317\7\t\2\2\u0317\u031d\5b\62\2\u0318\u0319"+
		"\7\6\2\2\u0319\u031a\5b\62\2\u031a\u031b\7\7\2\2\u031b\u031d\3\2\2\2\u031c"+
		"\u0316\3\2\2\2\u031c\u0318\3\2\2\2\u031c\u031d\3\2\2\2\u031d\65\3\2\2"+
		"\2\u031e\u0329\7z\2\2\u031f\u032a\5\u0094K\2\u0320\u0321\5\u0088E\2\u0321"+
		"\u0322\7\5\2\2\u0322\u0324\3\2\2\2\u0323\u0320\3\2\2\2\u0323\u0324\3\2"+
		"\2\2\u0324\u0327\3\2\2\2\u0325\u0328\5\u008aF\2\u0326\u0328\5\u0098M\2"+
		"\u0327\u0325\3\2\2\2\u0327\u0326\3\2\2\2\u0328\u032a\3\2\2\2\u0329\u031f"+
		"\3\2\2\2\u0329\u0323\3\2\2\2\u0329\u032a\3\2\2\2\u032a\67\3\2\2\2\u032b"+
		"\u032d\7{\2\2\u032c\u032e\7\u0082\2\2\u032d\u032c\3\2\2\2\u032d\u032e"+
		"\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\5\u00a2R\2\u03309\3\2\2\2\u0331"+
		"\u0336\7\u0080\2\2\u0332\u0334\7\u008a\2\2\u0333\u0335\5\u00a6T\2\u0334"+
		"\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2\2\2\u0336\u0332\3\2"+
		"\2\2\u0336\u0337\3\2\2\2\u0337\u033d\3\2\2\2\u0338\u033a\7\u0089\2\2\u0339"+
		"\u033b\7\u0082\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c"+
		"\3\2\2\2\u033c\u033e\5\u00a2R\2\u033d\u0338\3\2\2\2\u033d\u033e\3\2\2"+
		"\2\u033e;\3\2\2\2\u033f\u0340\7\u0082\2\2\u0340\u0341\5\u00a2R\2\u0341"+
		"=\3\2\2\2\u0342\u0344\7\u0096\2\2\u0343\u0345\7w\2\2\u0344\u0343\3\2\2"+
		"\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u034b\5d\63\2\u0347\u0348"+
		"\7\b\2\2\u0348\u034a\5d\63\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b"+
		"\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2"+
		"\2\2\u034e\u0342\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"\u035b\5p9\2\u0351\u0352\7p\2\2\u0352\u0353\7+\2\2\u0353\u0358\5`\61\2"+
		"\u0354\u0355\7\b\2\2\u0355\u0357\5`\61\2\u0356\u0354\3\2\2\2\u0357\u035a"+
		"\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035c\3\2\2\2\u035a"+
		"\u0358\3\2\2\2\u035b\u0351\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u0363\3\2"+
		"\2\2\u035d\u035e\7e\2\2\u035e\u0361\5R*\2\u035f\u0360\t\4\2\2\u0360\u0362"+
		"\5R*\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363"+
		"\u035d\3\2\2\2\u0363\u0364\3\2\2\2\u0364?\3\2\2\2\u0365\u0367\7\u0096"+
		"\2\2\u0366\u0368\7w\2\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036e\5d\63\2\u036a\u036b\7\b\2\2\u036b\u036d\5d"+
		"\63\2\u036c\u036a\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0371\u0365\3\2"+
		"\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0379\5B\"\2\u0374"+
		"\u0375\5r:\2\u0375\u0376\5B\"\2\u0376\u0378\3\2\2\2\u0377\u0374\3\2\2"+
		"\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0386"+
		"\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u037d\7p\2\2\u037d\u037e\7+\2\2\u037e"+
		"\u0383\5`\61\2\u037f\u0380\7\b\2\2\u0380\u0382\5`\61\2\u0381\u037f\3\2"+
		"\2\2\u0382\u0385\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384"+
		"\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0386\u037c\3\2\2\2\u0386\u0387\3\2"+
		"\2\2\u0387\u038e\3\2\2\2\u0388\u0389\7e\2\2\u0389\u038c\5R*\2\u038a\u038b"+
		"\t\4\2\2\u038b\u038d\5R*\2\u038c\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d"+
		"\u038f\3\2\2\2\u038e\u0388\3\2\2\2\u038e\u038f\3\2\2\2\u038fA\3\2\2\2"+
		"\u0390\u0392\7\u0083\2\2\u0391\u0393\t\6\2\2\u0392\u0391\3\2\2\2\u0392"+
		"\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0399\5f\64\2\u0395\u0396\7\b"+
		"\2\2\u0396\u0398\5f\64\2\u0397\u0395\3\2\2\2\u0398\u039b\3\2\2\2\u0399"+
		"\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u03a8\3\2\2\2\u039b\u0399\3\2"+
		"\2\2\u039c\u03a6\7N\2\2\u039d\u03a2\5h\65\2\u039e\u039f\7\b\2\2\u039f"+
		"\u03a1\5h\65\2\u03a0\u039e\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2"+
		"\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a7\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5"+
		"\u03a7\5j\66\2\u03a6\u039d\3\2\2\2\u03a6\u03a5\3\2\2\2\u03a7\u03a9\3\2"+
		"\2\2\u03a8\u039c\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa"+
		"\u03ab\7\u0095\2\2\u03ab\u03ad\5R*\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad\3"+
		"\2\2\2\u03ad\u03bc\3\2\2\2\u03ae\u03af\7Q\2\2\u03af\u03b0\7+\2\2\u03b0"+
		"\u03b5\5R*\2\u03b1\u03b2\7\b\2\2\u03b2\u03b4\5R*\2\u03b3\u03b1\3\2\2\2"+
		"\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03ba"+
		"\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03b9\7R\2\2\u03b9\u03bb\5R*\2\u03ba"+
		"\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03ae\3\2"+
		"\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03db\3\2\2\2\u03be\u03bf\7\u0091\2\2\u03bf"+
		"\u03c0\7\6\2\2\u03c0\u03c5\5R*\2\u03c1\u03c2\7\b\2\2\u03c2\u03c4\5R*\2"+
		"\u03c3\u03c1\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6"+
		"\3\2\2\2\u03c6\u03c8\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03d7\7\7\2\2\u03c9"+
		"\u03ca\7\b\2\2\u03ca\u03cb\7\6\2\2\u03cb\u03d0\5R*\2\u03cc\u03cd\7\b\2"+
		"\2\u03cd\u03cf\5R*\2\u03ce\u03cc\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce"+
		"\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3"+
		"\u03d4\7\7\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03c9\3\2\2\2\u03d6\u03d9\3\2"+
		"\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9"+
		"\u03d7\3\2\2\2\u03da\u0390\3\2\2\2\u03da\u03be\3\2\2\2\u03dbC\3\2\2\2"+
		"\u03dc\u03de\5\\/\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df"+
		"\3\2\2\2\u03df\u03ea\7\u008e\2\2\u03e0\u03e1\7o\2\2\u03e1\u03eb\7\u0080"+
		"\2\2\u03e2\u03e3\7o\2\2\u03e3\u03eb\7\34\2\2\u03e4\u03e5\7o\2\2\u03e5"+
		"\u03eb\7}\2\2\u03e6\u03e7\7o\2\2\u03e7\u03eb\7K\2\2\u03e8\u03e9\7o\2\2"+
		"\u03e9\u03eb\7T\2\2\u03ea\u03e0\3\2\2\2\u03ea\u03e2\3\2\2\2\u03ea\u03e4"+
		"\3\2\2\2\u03ea\u03e6\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
		"\u03ec\3\2\2\2\u03ec\u03ed\5^\60\2\u03ed\u03ee\7\u0084\2\2\u03ee\u03ef"+
		"\5\u0090I\2\u03ef\u03f0\7\t\2\2\u03f0\u03f8\5R*\2\u03f1\u03f2\7\b\2\2"+
		"\u03f2\u03f3\5\u0090I\2\u03f3\u03f4\7\t\2\2\u03f4\u03f5\5R*\2\u03f5\u03f7"+
		"\3\2\2\2\u03f6\u03f1\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8"+
		"\u03f9\3\2\2\2\u03f9\u03fd\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u03fc\7\u0095"+
		"\2\2\u03fc\u03fe\5R*\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03feE"+
		"\3\2\2\2\u03ff\u0401\5\\/\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u040d\7\u008e\2\2\u0403\u0404\7o\2\2\u0404\u040e"+
		"\7\u0080\2\2\u0405\u0406\7o\2\2\u0406\u040e\7\34\2\2\u0407\u0408\7o\2"+
		"\2\u0408\u040e\7}\2\2\u0409\u040a\7o\2\2\u040a\u040e\7K\2\2\u040b\u040c"+
		"\7o\2\2\u040c\u040e\7T\2\2\u040d\u0403\3\2\2\2\u040d\u0405\3\2\2\2\u040d"+
		"\u0407\3\2\2\2\u040d\u0409\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2"+
		"\2\2\u040e\u040f\3\2\2\2\u040f\u0410\5^\60\2\u0410\u0411\7\u0084\2\2\u0411"+
		"\u0412\5\u0090I\2\u0412\u0413\7\t\2\2\u0413\u041b\5R*\2\u0414\u0415\7"+
		"\b\2\2\u0415\u0416\5\u0090I\2\u0416\u0417\7\t\2\2\u0417\u0418\5R*\2\u0418"+
		"\u041a\3\2\2\2\u0419\u0414\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2"+
		"\2\2\u041b\u041c\3\2\2\2\u041c\u0420\3\2\2\2\u041d\u041b\3\2\2\2\u041e"+
		"\u041f\7\u0095\2\2\u041f\u0421\5R*\2\u0420\u041e\3\2\2\2\u0420\u0421\3"+
		"\2\2\2\u0421\u0434\3\2\2\2\u0422\u0423\7p\2\2\u0423\u0424\7+\2\2\u0424"+
		"\u0429\5`\61\2\u0425\u0426\7\b\2\2\u0426\u0428\5`\61\2\u0427\u0425\3\2"+
		"\2\2\u0428\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
		"\u042d\3\2\2\2\u042b\u0429\3\2\2\2\u042c\u0422\3\2\2\2\u042c\u042d\3\2"+
		"\2\2\u042d\u042e\3\2\2\2\u042e\u042f\7e\2\2\u042f\u0432\5R*\2\u0430\u0431"+
		"\t\4\2\2\u0431\u0433\5R*\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0435\3\2\2\2\u0434\u042c\3\2\2\2\u0434\u0435\3\2\2\2\u0435G\3\2\2\2"+
		"\u0436\u0437\7\u0090\2\2\u0437I\3\2\2\2\u0438\u043a\5\u0090I\2\u0439\u043b"+
		"\5L\'\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043f\3\2\2\2\u043c"+
		"\u043e\5N(\2\u043d\u043c\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2\2"+
		"\2\u043f\u0440\3\2\2\2\u0440K\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0444"+
		"\5\u0084C\2\u0443\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0443\3\2\2"+
		"\2\u0445\u0446\3\2\2\2\u0446\u0451\3\2\2\2\u0447\u0448\7\6\2\2\u0448\u0449"+
		"\5v<\2\u0449\u044a\7\7\2\2\u044a\u0452\3\2\2\2\u044b\u044c\7\6\2\2\u044c"+
		"\u044d\5v<\2\u044d\u044e\7\b\2\2\u044e\u044f\5v<\2\u044f\u0450\7\7\2\2"+
		"\u0450\u0452\3\2\2\2\u0451\u0447\3\2\2\2\u0451\u044b\3\2\2\2\u0451\u0452"+
		"\3\2\2\2\u0452M\3\2\2\2\u0453\u0454\7\64\2\2\u0454\u0456\5\u0084C\2\u0455"+
		"\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0478\3\2\2\2\u0457\u0458\7t"+
		"\2\2\u0458\u045a\7b\2\2\u0459\u045b\t\7\2\2\u045a\u0459\3\2\2\2\u045a"+
		"\u045b\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045e\5P)\2\u045d\u045f\7\'\2"+
		"\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0479\3\2\2\2\u0460\u0462"+
		"\7i\2\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463"+
		"\u0464\7k\2\2\u0464\u0479\5P)\2\u0465\u0466\7\u008d\2\2\u0466\u0479\5"+
		"P)\2\u0467\u0468\7/\2\2\u0468\u0469\7\6\2\2\u0469\u046a\5R*\2\u046a\u046b"+
		"\7\7\2\2\u046b\u0479\3\2\2\2\u046c\u0473\7;\2\2\u046d\u0474\5v<\2\u046e"+
		"\u0474\5x=\2\u046f\u0470\7\6\2\2\u0470\u0471\5R*\2\u0471\u0472\7\7\2\2"+
		"\u0472\u0474\3\2\2\2\u0473\u046d\3\2\2\2\u0473\u046e\3\2\2\2\u0473\u046f"+
		"\3\2\2\2\u0474\u0479\3\2\2\2\u0475\u0476\7\60\2\2\u0476\u0479\5\u0094"+
		"K\2\u0477\u0479\5T+\2\u0478\u0457\3\2\2\2\u0478\u0461\3\2\2\2\u0478\u0465"+
		"\3\2\2\2\u0478\u0467\3\2\2\2\u0478\u046c\3\2\2\2\u0478\u0475\3\2\2\2\u0478"+
		"\u0477\3\2\2\2\u0479O\3\2\2\2\u047a\u047b\7n\2\2\u047b\u047c\7\63\2\2"+
		"\u047c\u047e\t\b\2\2\u047d\u047a\3\2\2\2\u047d\u047e\3\2\2\2\u047eQ\3"+
		"\2\2\2\u047f\u0480\b*\1\2\u0480\u04cc\5x=\2\u0481\u04cc\7\u009a\2\2\u0482"+
		"\u0483\5\u0088E\2\u0483\u0484\7\5\2\2\u0484\u0486\3\2\2\2\u0485\u0482"+
		"\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\5\u008aF"+
		"\2\u0488\u0489\7\5\2\2\u0489\u048b\3\2\2\2\u048a\u0485\3\2\2\2\u048a\u048b"+
		"\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u04cc\5\u0090I\2\u048d\u048e\5z>\2"+
		"\u048e\u048f\5R*\27\u048f\u04cc\3\2\2\2\u0490\u0491\5\u0086D\2\u0491\u049e"+
		"\7\6\2\2\u0492\u0494\7A\2\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u0495\3\2\2\2\u0495\u049a\5R*\2\u0496\u0497\7\b\2\2\u0497\u0499\5R*\2"+
		"\u0498\u0496\3\2\2\2\u0499\u049c\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b"+
		"\3\2\2\2\u049b\u049f\3\2\2\2\u049c\u049a\3\2\2\2\u049d\u049f\7\n\2\2\u049e"+
		"\u0493\3\2\2\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\3\2"+
		"\2\2\u04a0\u04a1\7\7\2\2\u04a1\u04cc\3\2\2\2\u04a2\u04a3\7\6\2\2\u04a3"+
		"\u04a4\5R*\2\u04a4\u04a5\7\7\2\2\u04a5\u04cc\3\2\2\2\u04a6\u04a7\7.\2"+
		"\2\u04a7\u04a8\7\6\2\2\u04a8\u04a9\5R*\2\u04a9\u04aa\7$\2\2\u04aa\u04ab"+
		"\5L\'\2\u04ab\u04ac\7\7\2\2\u04ac\u04cc\3\2\2\2\u04ad\u04af\7i\2\2\u04ae"+
		"\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b2\7I"+
		"\2\2\u04b1\u04ae\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04b4\7\6\2\2\u04b4\u04b5\5@!\2\u04b5\u04b6\7\7\2\2\u04b6\u04cc\3\2\2"+
		"\2\u04b7\u04b9\7-\2\2\u04b8\u04ba\5R*\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba"+
		"\3\2\2\2\u04ba\u04c0\3\2\2\2\u04bb\u04bc\7\u0094\2\2\u04bc\u04bd\5R*\2"+
		"\u04bd\u04be\7\u0088\2\2\u04be\u04bf\5R*\2\u04bf\u04c1\3\2\2\2\u04c0\u04bb"+
		"\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3"+
		"\u04c6\3\2\2\2\u04c4\u04c5\7D\2\2\u04c5\u04c7\5R*\2\u04c6\u04c4\3\2\2"+
		"\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\7E\2\2\u04c9\u04cc"+
		"\3\2\2\2\u04ca\u04cc\5V,\2\u04cb\u047f\3\2\2\2\u04cb\u0481\3\2\2\2\u04cb"+
		"\u048a\3\2\2\2\u04cb\u048d\3\2\2\2\u04cb\u0490\3\2\2\2\u04cb\u04a2\3\2"+
		"\2\2\u04cb\u04a6\3\2\2\2\u04cb\u04b1\3\2\2\2\u04cb\u04b7\3\2\2\2\u04cb"+
		"\u04ca\3\2\2\2\u04cc\u0531\3\2\2\2\u04cd\u04ce\f\26\2\2\u04ce\u04cf\7"+
		"\16\2\2\u04cf\u0530\5R*\27\u04d0\u04d1\f\25\2\2\u04d1\u04d2\t\t\2\2\u04d2"+
		"\u0530\5R*\26\u04d3\u04d4\f\24\2\2\u04d4\u04d5\t\n\2\2\u04d5\u0530\5R"+
		"*\25\u04d6\u04d7\f\23\2\2\u04d7\u04d8\t\13\2\2\u04d8\u0530\5R*\24\u04d9"+
		"\u04da\f\22\2\2\u04da\u04db\t\f\2\2\u04db\u0530\5R*\23\u04dc\u04e9\f\21"+
		"\2\2\u04dd\u04ea\7\t\2\2\u04de\u04ea\7\31\2\2\u04df\u04ea\7\32\2\2\u04e0"+
		"\u04ea\7\33\2\2\u04e1\u04ea\7_\2\2\u04e2\u04e3\7_\2\2\u04e3\u04ea\7i\2"+
		"\2\u04e4\u04ea\7V\2\2\u04e5\u04ea\7d\2\2\u04e6\u04ea\7P\2\2\u04e7\u04ea"+
		"\7f\2\2\u04e8\u04ea\7y\2\2\u04e9\u04dd\3\2\2\2\u04e9\u04de\3\2\2\2\u04e9"+
		"\u04df\3\2\2\2\u04e9\u04e0\3\2\2\2\u04e9\u04e1\3\2\2\2\u04e9\u04e2\3\2"+
		"\2\2\u04e9\u04e4\3\2\2\2\u04e9\u04e5\3\2\2\2\u04e9\u04e6\3\2\2\2\u04e9"+
		"\u04e7\3\2\2\2\u04e9\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u0530\5R"+
		"*\22\u04ec\u04ed\f\20\2\2\u04ed\u04ee\7#\2\2\u04ee\u0530\5R*\21\u04ef"+
		"\u04f0\f\17\2\2\u04f0\u04f1\7o\2\2\u04f1\u0530\5R*\20\u04f2\u04f3\f\b"+
		"\2\2\u04f3\u04f5\7_\2\2\u04f4\u04f6\7i\2\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6"+
		"\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u0530\5R*\t\u04f8\u04fa\f\7\2\2\u04f9"+
		"\u04fb\7i\2\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2"+
		"\2\2\u04fc\u04fd\7*\2\2\u04fd\u04fe\5R*\2\u04fe\u04ff\7#\2\2\u04ff\u0500"+
		"\5R*\b\u0500\u0530\3\2\2\2\u0501\u0502\f\13\2\2\u0502\u0503\7\60\2\2\u0503"+
		"\u0530\5\u0094K\2\u0504\u0506\f\n\2\2\u0505\u0507\7i\2\2\u0506\u0505\3"+
		"\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\t\r\2\2\u0509"+
		"\u050c\5R*\2\u050a\u050b\7F\2\2\u050b\u050d\5R*\2\u050c\u050a\3\2\2\2"+
		"\u050c\u050d\3\2\2\2\u050d\u0530\3\2\2\2\u050e\u0513\f\t\2\2\u050f\u0514"+
		"\7`\2\2\u0510\u0514\7j\2\2\u0511\u0512\7i\2\2\u0512\u0514\7k\2\2\u0513"+
		"\u050f\3\2\2\2\u0513\u0510\3\2\2\2\u0513\u0511\3\2\2\2\u0514\u0530\3\2"+
		"\2\2\u0515\u0517\f\6\2\2\u0516\u0518\7i\2\2\u0517\u0516\3\2\2\2\u0517"+
		"\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u052d\7V\2\2\u051a\u0524\7\6"+
		"\2\2\u051b\u0525\5@!\2\u051c\u0521\5R*\2\u051d\u051e\7\b\2\2\u051e\u0520"+
		"\5R*\2\u051f\u051d\3\2\2\2\u0520\u0523\3\2\2\2\u0521\u051f\3\2\2\2\u0521"+
		"\u0522\3\2\2\2\u0522\u0525\3\2\2\2\u0523\u0521\3\2\2\2\u0524\u051b\3\2"+
		"\2\2\u0524\u051c\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\3\2\2\2\u0526"+
		"\u052e\7\7\2\2\u0527\u0528\5\u0088E\2\u0528\u0529\7\5\2\2\u0529\u052b"+
		"\3\2\2\2\u052a\u0527\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\3\2\2\2\u052c"+
		"\u052e\5\u008aF\2\u052d\u051a\3\2\2\2\u052d\u052a\3\2\2\2\u052e\u0530"+
		"\3\2\2\2\u052f\u04cd\3\2\2\2\u052f\u04d0\3\2\2\2\u052f\u04d3\3\2\2\2\u052f"+
		"\u04d6\3\2\2\2\u052f\u04d9\3\2\2\2\u052f\u04dc\3\2\2\2\u052f\u04ec\3\2"+
		"\2\2\u052f\u04ef\3\2\2\2\u052f\u04f2\3\2\2\2\u052f\u04f8\3\2\2\2\u052f"+
		"\u0501\3\2\2\2\u052f\u0504\3\2\2\2\u052f\u050e\3\2\2\2\u052f\u0515\3\2"+
		"\2\2\u0530\u0533\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532"+
		"S\3\2\2\2\u0533\u0531\3\2\2\2\u0534\u0535\7x\2\2\u0535\u0541\5\u0096L"+
		"\2\u0536\u0537\7\6\2\2\u0537\u053c\5\u0090I\2\u0538\u0539\7\b\2\2\u0539"+
		"\u053b\5\u0090I\2\u053a\u0538\3\2\2\2\u053b\u053e\3\2\2\2\u053c\u053a"+
		"\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\3\2\2\2\u053e\u053c\3\2\2\2\u053f"+
		"\u0540\7\7\2\2\u0540\u0542\3\2\2\2\u0541\u0536\3\2\2\2\u0541\u0542\3\2"+
		"\2\2\u0542\u0555\3\2\2\2\u0543\u0544\7n\2\2\u0544\u054d\t\16\2\2\u0545"+
		"\u0546\7\u0084\2\2\u0546\u054e\7k\2\2\u0547\u0548\7\u0084\2\2\u0548\u054e"+
		"\7;\2\2\u0549\u054e\7,\2\2\u054a\u054e\7~\2\2\u054b\u054c\7h\2\2\u054c"+
		"\u054e\7\35\2\2\u054d\u0545\3\2\2\2\u054d\u0547\3\2\2\2\u054d\u0549\3"+
		"\2\2\2\u054d\u054a\3\2\2\2\u054d\u054b\3\2\2\2\u054e\u0552\3\2\2\2\u054f"+
		"\u0550\7f\2\2\u0550\u0552\5\u0084C\2\u0551\u0543\3\2\2\2\u0551\u054f\3"+
		"\2\2\2\u0552\u0554\3\2\2\2\u0553\u0551\3\2\2\2\u0554\u0557\3\2\2\2\u0555"+
		"\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0562\3\2\2\2\u0557\u0555\3\2"+
		"\2\2\u0558\u055a\7i\2\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055a"+
		"\u055b\3\2\2\2\u055b\u0560\7<\2\2\u055c\u055d\7Y\2\2\u055d\u0561\7=\2"+
		"\2\u055e\u055f\7Y\2\2\u055f\u0561\7U\2\2\u0560\u055c\3\2\2\2\u0560\u055e"+
		"\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0563\3\2\2\2\u0562\u0559\3\2\2\2\u0562"+
		"\u0563\3\2\2\2\u0563U\3\2\2\2\u0564\u0565\7v\2\2\u0565\u056a\7\6\2\2\u0566"+
		"\u056b\7T\2\2\u0567\u0568\t\17\2\2\u0568\u0569\7\b\2\2\u0569\u056b\5|"+
		"?\2\u056a\u0566\3\2\2\2\u056a\u0567\3\2\2\2\u056b\u056c\3\2\2\2\u056c"+
		"\u056d\7\7\2\2\u056dW\3\2\2\2\u056e\u0571\5\u0090I\2\u056f\u0570\7\60"+
		"\2\2\u0570\u0572\5\u0094K\2\u0571\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572"+
		"\u0574\3\2\2\2\u0573\u0575\t\7\2\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2"+
		"\2\2\u0575Y\3\2\2\2\u0576\u0577\7\64\2\2\u0577\u0579\5\u0084C\2\u0578"+
		"\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u059e\3\2\2\2\u057a\u057b\7t"+
		"\2\2\u057b\u057e\7b\2\2\u057c\u057e\7\u008d\2\2\u057d\u057a\3\2\2\2\u057d"+
		"\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\7\6\2\2\u0580\u0585\5X"+
		"-\2\u0581\u0582\7\b\2\2\u0582\u0584\5X-\2\u0583\u0581\3\2\2\2\u0584\u0587"+
		"\3\2\2\2\u0585\u0583\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0588\3\2\2\2\u0587"+
		"\u0585\3\2\2\2\u0588\u0589\7\7\2\2\u0589\u058a\5P)\2\u058a\u059f\3\2\2"+
		"\2\u058b\u058c\7/\2\2\u058c\u058d\7\6\2\2\u058d\u058e\5R*\2\u058e\u058f"+
		"\7\7\2\2\u058f\u059f\3\2\2\2\u0590\u0591\7M\2\2\u0591\u0592\7b\2\2\u0592"+
		"\u0593\7\6\2\2\u0593\u0598\5\u0090I\2\u0594\u0595\7\b\2\2\u0595\u0597"+
		"\5\u0090I\2\u0596\u0594\3\2\2\2\u0597\u059a\3\2\2\2\u0598\u0596\3\2\2"+
		"\2\u0598\u0599\3\2\2\2\u0599\u059b\3\2\2\2\u059a\u0598\3\2\2\2\u059b\u059c"+
		"\7\7\2\2\u059c\u059d\5T+\2\u059d\u059f\3\2\2\2\u059e\u057d\3\2\2\2\u059e"+
		"\u058b\3\2\2\2\u059e\u0590\3\2\2\2\u059f[\3\2\2\2\u05a0\u05a2\7\u0096"+
		"\2\2\u05a1\u05a3\7w\2\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3"+
		"\u05a4\3\2\2\2\u05a4\u05a5\5t;\2\u05a5\u05a6\7$\2\2\u05a6\u05a7\7\6\2"+
		"\2\u05a7\u05a8\5@!\2\u05a8\u05b2\7\7\2\2\u05a9\u05aa\7\b\2\2\u05aa\u05ab"+
		"\5t;\2\u05ab\u05ac\7$\2\2\u05ac\u05ad\7\6\2\2\u05ad\u05ae\5@!\2\u05ae"+
		"\u05af\7\7\2\2\u05af\u05b1\3\2\2\2\u05b0\u05a9\3\2\2\2\u05b1\u05b4\3\2"+
		"\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3]\3\2\2\2\u05b4\u05b2"+
		"\3\2\2\2\u05b5\u05b6\5\u0088E\2\u05b6\u05b7\7\5\2\2\u05b7\u05b9\3\2\2"+
		"\2\u05b8\u05b5\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05c0"+
		"\5\u008aF\2\u05bb\u05bc\7X\2\2\u05bc\u05bd\7+\2\2\u05bd\u05c1\5\u0098"+
		"M\2\u05be\u05bf\7i\2\2\u05bf\u05c1\7X\2\2\u05c0\u05bb\3\2\2\2\u05c0\u05be"+
		"\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1_\3\2\2\2\u05c2\u05c5\5R*\2\u05c3\u05c4"+
		"\7\60\2\2\u05c4\u05c6\5\u0094K\2\u05c5\u05c3\3\2\2\2\u05c5\u05c6\3\2\2"+
		"\2\u05c6\u05c8\3\2\2\2\u05c7\u05c9\t\7\2\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9"+
		"\3\2\2\2\u05c9a\3\2\2\2\u05ca\u05ce\5v<\2\u05cb\u05ce\5\u0084C\2\u05cc"+
		"\u05ce\7\u009b\2\2\u05cd\u05ca\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05cc"+
		"\3\2\2\2\u05cec\3\2\2\2\u05cf\u05db\5\u008aF\2\u05d0\u05d1\7\6\2\2\u05d1"+
		"\u05d6\5\u0090I\2\u05d2\u05d3\7\b\2\2\u05d3\u05d5\5\u0090I\2\u05d4\u05d2"+
		"\3\2\2\2\u05d5\u05d8\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7"+
		"\u05d9\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d9\u05da\7\7\2\2\u05da\u05dc\3\2"+
		"\2\2\u05db\u05d0\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd"+
		"\u05de\7$\2\2\u05de\u05df\7\6\2\2\u05df\u05e0\5@!\2\u05e0\u05e1\7\7\2"+
		"\2\u05e1e\3\2\2\2\u05e2\u05ef\7\n\2\2\u05e3\u05e4\5\u008aF\2\u05e4\u05e5"+
		"\7\5\2\2\u05e5\u05e6\7\n\2\2\u05e6\u05ef\3\2\2\2\u05e7\u05ec\5R*\2\u05e8"+
		"\u05ea\7$\2\2\u05e9\u05e8\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05eb\3\2"+
		"\2\2\u05eb\u05ed\5\u0080A\2\u05ec\u05e9\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed"+
		"\u05ef\3\2\2\2\u05ee\u05e2\3\2\2\2\u05ee\u05e3\3\2\2\2\u05ee\u05e7\3\2"+
		"\2\2\u05efg\3\2\2\2\u05f0\u05f1\5\u0088E\2\u05f1\u05f2\7\5\2\2\u05f2\u05f4"+
		"\3\2\2\2\u05f3\u05f0\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5"+
		"\u05fa\5\u008aF\2\u05f6\u05f8\7$\2\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3"+
		"\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fb\5\u00a4S\2\u05fa\u05f7\3\2\2\2"+
		"\u05fa\u05fb\3\2\2\2\u05fb\u0601\3\2\2\2\u05fc\u05fd\7X\2\2\u05fd\u05fe"+
		"\7+\2\2\u05fe\u0602\5\u0098M\2\u05ff\u0600\7i\2\2\u0600\u0602\7X\2\2\u0601"+
		"\u05fc\3\2\2\2\u0601\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0620\3\2"+
		"\2\2\u0603\u060d\7\6\2\2\u0604\u0609\5h\65\2\u0605\u0606\7\b\2\2\u0606"+
		"\u0608\5h\65\2\u0607\u0605\3\2\2\2\u0608\u060b\3\2\2\2\u0609\u0607\3\2"+
		"\2\2\u0609\u060a\3\2\2\2\u060a\u060e\3\2\2\2\u060b\u0609\3\2\2\2\u060c"+
		"\u060e\5j\66\2\u060d\u0604\3\2\2\2\u060d\u060c\3\2\2\2\u060e\u060f\3\2"+
		"\2\2\u060f\u0614\7\7\2\2\u0610\u0612\7$\2\2\u0611\u0610\3\2\2\2\u0611"+
		"\u0612\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615\5\u00a4S\2\u0614\u0611"+
		"\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0620\3\2\2\2\u0616\u0617\7\6\2\2\u0617"+
		"\u0618\5@!\2\u0618\u061d\7\7\2\2\u0619\u061b\7$\2\2\u061a\u0619\3\2\2"+
		"\2\u061a\u061b\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061e\5\u00a4S\2\u061d"+
		"\u061a\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0620\3\2\2\2\u061f\u05f3\3\2"+
		"\2\2\u061f\u0603\3\2\2\2\u061f\u0616\3\2\2\2\u0620i\3\2\2\2\u0621\u0628"+
		"\5h\65\2\u0622\u0623\5l\67\2\u0623\u0624\5h\65\2\u0624\u0625\5n8\2\u0625"+
		"\u0627\3\2\2\2\u0626\u0622\3\2\2\2\u0627\u062a\3\2\2\2\u0628\u0626\3\2"+
		"\2\2\u0628\u0629\3\2\2\2\u0629k\3\2\2\2\u062a\u0628\3\2\2\2\u062b\u0639"+
		"\7\b\2\2\u062c\u062e\7g\2\2\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2\2\u062e"+
		"\u0635\3\2\2\2\u062f\u0631\7c\2\2\u0630\u0632\7q\2\2\u0631\u0630\3\2\2"+
		"\2\u0631\u0632\3\2\2\2\u0632\u0636\3\2\2\2\u0633\u0636\7Z\2\2\u0634\u0636"+
		"\7\66\2\2\u0635\u062f\3\2\2\2\u0635\u0633\3\2\2\2\u0635\u0634\3\2\2\2"+
		"\u0635\u0636\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0639\7a\2\2\u0638\u062b"+
		"\3\2\2\2\u0638\u062d\3\2\2\2\u0639m\3\2\2\2\u063a\u063b\7n\2\2\u063b\u0649"+
		"\5R*\2\u063c\u063d\7\u008f\2\2\u063d\u063e\7\6\2\2\u063e\u0643\5\u0090"+
		"I\2\u063f\u0640\7\b\2\2\u0640\u0642\5\u0090I\2\u0641\u063f\3\2\2\2\u0642"+
		"\u0645\3\2\2\2\u0643\u0641\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0646\3\2"+
		"\2\2\u0645\u0643\3\2\2\2\u0646\u0647\7\7\2\2\u0647\u0649\3\2\2\2\u0648"+
		"\u063a\3\2\2\2\u0648\u063c\3\2\2\2\u0648\u0649\3\2\2\2\u0649o\3\2\2\2"+
		"\u064a\u064c\7\u0083\2\2\u064b\u064d\t\6\2\2\u064c\u064b\3\2\2\2\u064c"+
		"\u064d\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0653\5f\64\2\u064f\u0650\7\b"+
		"\2\2\u0650\u0652\5f\64\2\u0651\u064f\3\2\2\2\u0652\u0655\3\2\2\2\u0653"+
		"\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0662\3\2\2\2\u0655\u0653\3\2"+
		"\2\2\u0656\u0660\7N\2\2\u0657\u065c\5h\65\2\u0658\u0659\7\b\2\2\u0659"+
		"\u065b\5h\65\2\u065a\u0658\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2"+
		"\2\2\u065c\u065d\3\2\2\2\u065d\u0661\3\2\2\2\u065e\u065c\3\2\2\2\u065f"+
		"\u0661\5j\66\2\u0660\u0657\3\2\2\2\u0660\u065f\3\2\2\2\u0661\u0663\3\2"+
		"\2\2\u0662\u0656\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0666\3\2\2\2\u0664"+
		"\u0665\7\u0095\2\2\u0665\u0667\5R*\2\u0666\u0664\3\2\2\2\u0666\u0667\3"+
		"\2\2\2\u0667\u0676\3\2\2\2\u0668\u0669\7Q\2\2\u0669\u066a\7+\2\2\u066a"+
		"\u066f\5R*\2\u066b\u066c\7\b\2\2\u066c\u066e\5R*\2\u066d\u066b\3\2\2\2"+
		"\u066e\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0674"+
		"\3\2\2\2\u0671\u066f\3\2\2\2\u0672\u0673\7R\2\2\u0673\u0675\5R*\2\u0674"+
		"\u0672\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\3\2\2\2\u0676\u0668\3\2"+
		"\2\2\u0676\u0677\3\2\2\2\u0677\u0695\3\2\2\2\u0678\u0679\7\u0091\2\2\u0679"+
		"\u067a\7\6\2\2\u067a\u067f\5R*\2\u067b\u067c\7\b\2\2\u067c\u067e\5R*\2"+
		"\u067d\u067b\3\2\2\2\u067e\u0681\3\2\2\2\u067f\u067d\3\2\2\2\u067f\u0680"+
		"\3\2\2\2\u0680\u0682\3\2\2\2\u0681\u067f\3\2\2\2\u0682\u0691\7\7\2\2\u0683"+
		"\u0684\7\b\2\2\u0684\u0685\7\6\2\2\u0685\u068a\5R*\2\u0686\u0687\7\b\2"+
		"\2\u0687\u0689\5R*\2\u0688\u0686\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688"+
		"\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068d\3\2\2\2\u068c\u068a\3\2\2\2\u068d"+
		"\u068e\7\7\2\2\u068e\u0690\3\2\2\2\u068f\u0683\3\2\2\2\u0690\u0693\3\2"+
		"\2\2\u0691\u068f\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0695\3\2\2\2\u0693"+
		"\u0691\3\2\2\2\u0694\u064a\3\2\2\2\u0694\u0678\3\2\2\2\u0695q\3\2\2\2"+
		"\u0696\u069c\7\u008c\2\2\u0697\u0698\7\u008c\2\2\u0698\u069c\7 \2\2\u0699"+
		"\u069c\7]\2\2\u069a\u069c\7G\2\2\u069b\u0696\3\2\2\2\u069b\u0697\3\2\2"+
		"\2\u069b\u0699\3\2\2\2\u069b\u069a\3\2\2\2\u069cs\3\2\2\2\u069d\u06a9"+
		"\5\u008aF\2\u069e\u069f\7\6\2\2\u069f\u06a4\5\u0090I\2\u06a0\u06a1\7\b"+
		"\2\2\u06a1\u06a3\5\u0090I\2\u06a2\u06a0\3\2\2\2\u06a3\u06a6\3\2\2\2\u06a4"+
		"\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a7\3\2\2\2\u06a6\u06a4\3\2"+
		"\2\2\u06a7\u06a8\7\7\2\2\u06a8\u06aa\3\2\2\2\u06a9\u069e\3\2\2\2\u06a9"+
		"\u06aa\3\2\2\2\u06aau\3\2\2\2\u06ab\u06ad\t\n\2\2\u06ac\u06ab\3\2\2\2"+
		"\u06ac\u06ad\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06af\7\u0099\2\2\u06af"+
		"w\3\2\2\2\u06b0\u06b1\t\20\2\2\u06b1y\3\2\2\2\u06b2\u06b3\t\21\2\2\u06b3"+
		"{\3\2\2\2\u06b4\u06b5\7\u009b\2\2\u06b5}\3\2\2\2\u06b6\u06b9\5R*\2\u06b7"+
		"\u06b9\5J&\2\u06b8\u06b6\3\2\2\2\u06b8\u06b7\3\2\2\2\u06b9\177\3\2\2\2"+
		"\u06ba\u06bb\t\22\2\2\u06bb\u0081\3\2\2\2\u06bc\u06bd\t\23\2\2\u06bd\u0083"+
		"\3\2\2\2\u06be\u06bf\5\u00a8U\2\u06bf\u0085\3\2\2\2\u06c0\u06c1\5\u00a8"+
		"U\2\u06c1\u0087\3\2\2\2\u06c2\u06c3\5\u00a8U\2\u06c3\u0089\3\2\2\2\u06c4"+
		"\u06c5\5\u00a8U\2\u06c5\u008b\3\2\2\2\u06c6\u06c7\5\u00a8U\2\u06c7\u008d"+
		"\3\2\2\2\u06c8\u06c9\5\u00a8U\2\u06c9\u008f\3\2\2\2\u06ca\u06cb\5\u00a8"+
		"U\2\u06cb\u0091\3\2\2\2\u06cc\u06cd\5\u00a8U\2\u06cd\u0093\3\2\2\2\u06ce"+
		"\u06cf\5\u00a8U\2\u06cf\u0095\3\2\2\2\u06d0\u06d1\5\u00a8U\2\u06d1\u0097"+
		"\3\2\2\2\u06d2\u06d3\5\u00a8U\2\u06d3\u0099\3\2\2\2\u06d4\u06d5\5\u00a8"+
		"U\2\u06d5\u009b\3\2\2\2\u06d6\u06d7\5\u00a8U\2\u06d7\u009d\3\2\2\2\u06d8"+
		"\u06d9\5\u00a8U\2\u06d9\u009f\3\2\2\2\u06da\u06db\5\u00a8U\2\u06db\u00a1"+
		"\3\2\2\2\u06dc\u06dd\5\u00a8U\2\u06dd\u00a3\3\2\2\2\u06de\u06df\5\u00a8"+
		"U\2\u06df\u00a5\3\2\2\2\u06e0\u06e1\5\u00a8U\2\u06e1\u00a7\3\2\2\2\u06e2"+
		"\u06ea\7\u0098\2\2\u06e3\u06ea\5\u0082B\2\u06e4\u06ea\7\u009b\2\2\u06e5"+
		"\u06e6\7\6\2\2\u06e6\u06e7\5\u00a8U\2\u06e7\u06e8\7\7\2\2\u06e8\u06ea"+
		"\3\2\2\2\u06e9\u06e2\3\2\2\2\u06e9\u06e3\3\2\2\2\u06e9\u06e4\3\2\2\2\u06e9"+
		"\u06e5\3\2\2\2\u06ea\u00a9\3\2\2\2\u00fa\u00ac\u00ae\u00b9\u00c0\u00c5"+
		"\u00cb\u00d1\u00d3\u00f3\u00fa\u0102\u0105\u010e\u0112\u011a\u011e\u0120"+
		"\u0125\u0127\u012b\u0132\u0135\u013a\u013e\u0143\u014c\u014f\u0155\u0157"+
		"\u015b\u0161\u0166\u0171\u0177\u0183\u018a\u0191\u0197\u019c\u01a2\u01a8"+
		"\u01af\u01b6\u01bc\u01c0\u01c4\u01ca\u01cf\u01d6\u01e1\u01e4\u01e6\u01ec"+
		"\u01f2\u01f6\u01fd\u0203\u0209\u020f\u0214\u0220\u0225\u0230\u0235\u0238"+
		"\u023f\u0242\u0249\u0252\u0255\u025b\u025d\u0261\u0269\u026e\u0276\u027b"+
		"\u0283\u0288\u0290\u0295\u029b\u02a2\u02a5\u02ad\u02b7\u02ba\u02c0\u02c2"+
		"\u02c5\u02d8\u02de\u02e7\u02ec\u02f5\u0300\u0307\u030d\u0313\u031c\u0323"+
		"\u0327\u0329\u032d\u0334\u0336\u033a\u033d\u0344\u034b\u034e\u0358\u035b"+
		"\u0361\u0363\u0367\u036e\u0371\u0379\u0383\u0386\u038c\u038e\u0392\u0399"+
		"\u03a2\u03a6\u03a8\u03ac\u03b5\u03ba\u03bc\u03c5\u03d0\u03d7\u03da\u03dd"+
		"\u03ea\u03f8\u03fd\u0400\u040d\u041b\u0420\u0429\u042c\u0432\u0434\u043a"+
		"\u043f\u0445\u0451\u0455\u045a\u045e\u0461\u0473\u0478\u047d\u0485\u048a"+
		"\u0493\u049a\u049e\u04ae\u04b1\u04b9\u04c2\u04c6\u04cb\u04e9\u04f5\u04fa"+
		"\u0506\u050c\u0513\u0517\u0521\u0524\u052a\u052d\u052f\u0531\u053c\u0541"+
		"\u054d\u0551\u0555\u0559\u0560\u0562\u056a\u0571\u0574\u0578\u057d\u0585"+
		"\u0598\u059e\u05a2\u05b2\u05b8\u05c0\u05c5\u05c8\u05cd\u05d6\u05db\u05e9"+
		"\u05ec\u05ee\u05f3\u05f7\u05fa\u0601\u0609\u060d\u0611\u0614\u061a\u061d"+
		"\u061f\u0628\u062d\u0631\u0635\u0638\u0643\u0648\u064c\u0653\u065c\u0660"+
		"\u0662\u0666\u066f\u0674\u0676\u067f\u068a\u0691\u0694\u069b\u06a4\u06a9"+
		"\u06ac\u06b8\u06e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}