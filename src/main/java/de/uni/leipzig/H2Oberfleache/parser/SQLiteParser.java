package de.uni.leipzig.H2Oberfleache.parser;
// Generated from C:/Users/Anna/Desktop/test/H2Oberfleache/src/main/antlr4\SQLite.g4 by ANTLR 4.7.2
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
		K_WHEN=146, K_WHERE=147, K_WITH=148, K_WITHOUT=149, K_NEST=150, K_UNNEST=151, 
		IDENTIFIER=152, NUMERIC_LITERAL=153, BIND_PARAMETER=154, STRING_LITERAL=155, 
		BLOB_LITERAL=156, SINGLE_LINE_COMMENT=157, MULTILINE_COMMENT=158, SPACES=159, 
		UNEXPECTED_CHAR=160;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5, RULE_attach_stmt = 6, 
		RULE_begin_stmt = 7, RULE_commit_stmt = 8, RULE_compound_select_stmt = 9, 
		RULE_create_index_stmt = 10, RULE_set_row_create = 11, RULE_create_table_stmt = 12, 
		RULE_create_trigger_stmt = 13, RULE_create_view_stmt = 14, RULE_create_virtual_table_stmt = 15, 
		RULE_delete_stmt = 16, RULE_delete_stmt_limited = 17, RULE_where_expr = 18, 
		RULE_detach_stmt = 19, RULE_drop_index_stmt = 20, RULE_drop_table_stmt = 21, 
		RULE_drop_trigger_stmt = 22, RULE_drop_view_stmt = 23, RULE_factored_select_stmt = 24, 
		RULE_insert_stmt = 25, RULE_pragma_stmt = 26, RULE_reindex_stmt = 27, 
		RULE_release_stmt = 28, RULE_rollback_stmt = 29, RULE_savepoint_stmt = 30, 
		RULE_simple_select_stmt = 31, RULE_select_stmt = 32, RULE_select_or_values = 33, 
		RULE_update_stmt = 34, RULE_update_stmt_limited = 35, RULE_vacuum_stmt = 36, 
		RULE_column_def = 37, RULE_type_name = 38, RULE_column_constraint = 39, 
		RULE_conflict_clause = 40, RULE_expr = 41, RULE_foreign_key_clause = 42, 
		RULE_raise_function = 43, RULE_indexed_column = 44, RULE_table_constraint = 45, 
		RULE_with_clause = 46, RULE_qualified_table_name = 47, RULE_ordering_term = 48, 
		RULE_pragma_value = 49, RULE_common_table_expression = 50, RULE_result_column = 51, 
		RULE_table_or_subquery = 52, RULE_join_clause = 53, RULE_join_operator = 54, 
		RULE_join_constraint = 55, RULE_select_core = 56, RULE_compound_operator = 57, 
		RULE_cte_table_name = 58, RULE_signed_number = 59, RULE_literal_value = 60, 
		RULE_unary_operator = 61, RULE_error_message = 62, RULE_module_argument = 63, 
		RULE_column_alias = 64, RULE_keyword = 65, RULE_nf2_point_Noation = 66, 
		RULE_name_of_subtable = 67, RULE_subtable_column_name = 68, RULE_name = 69, 
		RULE_function_name = 70, RULE_database_name = 71, RULE_table_name = 72, 
		RULE_table_or_index_name = 73, RULE_new_table_name = 74, RULE_column_name = 75, 
		RULE_subtable_name = 76, RULE_collation_name = 77, RULE_foreign_table = 78, 
		RULE_index_name = 79, RULE_trigger_name = 80, RULE_view_name = 81, RULE_module_name = 82, 
		RULE_pragma_name = 83, RULE_savepoint_name = 84, RULE_table_alias = 85, 
		RULE_transaction_name = 86, RULE_any_name = 87;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
			"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
			"set_row_create", "create_table_stmt", "create_trigger_stmt", "create_view_stmt", 
			"create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", "where_expr", 
			"detach_stmt", "drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", 
			"drop_view_stmt", "factored_select_stmt", "insert_stmt", "pragma_stmt", 
			"reindex_stmt", "release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
			"select_stmt", "select_or_values", "update_stmt", "update_stmt_limited", 
			"vacuum_stmt", "column_def", "type_name", "column_constraint", "conflict_clause", 
			"expr", "foreign_key_clause", "raise_function", "indexed_column", "table_constraint", 
			"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "compound_operator", 
			"cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "nf2_point_Noation", 
			"name_of_subtable", "subtable_column_name", "name", "function_name", 
			"database_name", "table_name", "table_or_index_name", "new_table_name", 
			"column_name", "subtable_name", "collation_name", "foreign_table", "index_name", 
			"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
			"table_alias", "transaction_name", "any_name"
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
			"K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "K_NEST", "K_UNNEST", "IDENTIFIER", 
			"NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", 
			"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DROP - 64)) | (1L << (K_END - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_ROLLBACK - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_WITH - 128)) | (1L << (UNEXPECTED_CHAR - 128)))) != 0)) {
				{
				setState(178);
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
					setState(176);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(177);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
			setState(185);
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
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(188);
				match(SCOL);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			sql_stmt();
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(195);
						match(SCOL);
						}
						}
						setState(198); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(200);
					sql_stmt();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					match(SCOL);
					}
					} 
				}
				setState(211);
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
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(212);
				match(K_EXPLAIN);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(213);
					match(K_QUERY);
					setState(214);
					match(K_PLAN);
					}
				}

				}
			}

			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(219);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(220);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(221);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(222);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(223);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(224);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(225);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(226);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(227);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(228);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(229);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(230);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(231);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(232);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(233);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(234);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(235);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(236);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(237);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(238);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(239);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(240);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(241);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(242);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(243);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(244);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(245);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(246);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(247);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(248);
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
			setState(251);
			match(K_ALTER);
			setState(252);
			match(K_TABLE);
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(253);
				database_name();
				setState(254);
				match(DOT);
				}
				break;
			}
			setState(258);
			table_name();
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(259);
				match(K_RENAME);
				setState(260);
				match(K_TO);
				setState(261);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(262);
				match(K_ADD);
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(263);
					match(K_COLUMN);
					}
					break;
				}
				setState(266);
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
			setState(269);
			match(K_ANALYZE);
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(270);
				database_name();
				}
				break;
			case 2:
				{
				setState(271);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(272);
				database_name();
				setState(273);
				match(DOT);
				setState(274);
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
			setState(278);
			match(K_ATTACH);
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(279);
				match(K_DATABASE);
				}
				break;
			}
			setState(282);
			expr(0);
			setState(283);
			match(K_AS);
			setState(284);
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
			setState(286);
			match(K_BEGIN);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (K_DEFERRED - 59)) | (1L << (K_EXCLUSIVE - 59)) | (1L << (K_IMMEDIATE - 59)))) != 0)) {
				{
				setState(287);
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

			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(290);
				match(K_TRANSACTION);
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(291);
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
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(297);
				match(K_TRANSACTION);
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(298);
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
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(303);
				match(K_WITH);
				setState(305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(304);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(307);
				common_table_expression();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(308);
					match(COMMA);
					setState(309);
					common_table_expression();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(317);
			select_core();
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(324);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(318);
					match(K_UNION);
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(319);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(322);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(323);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326);
				select_core();
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(331);
				match(K_ORDER);
				setState(332);
				match(K_BY);
				setState(333);
				ordering_term();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(334);
					match(COMMA);
					setState(335);
					ordering_term();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(343);
				match(K_LIMIT);
				setState(344);
				expr(0);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(345);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(346);
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
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
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
			setState(351);
			match(K_CREATE);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(352);
				match(K_UNIQUE);
				}
			}

			setState(355);
			match(K_INDEX);
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(356);
				match(K_IF);
				setState(357);
				match(K_NOT);
				setState(358);
				match(K_EXISTS);
				}
				break;
			}
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(361);
				database_name();
				setState(362);
				match(DOT);
				}
				break;
			}
			setState(366);
			index_name();
			setState(367);
			match(K_ON);
			setState(368);
			table_name();
			setState(369);
			match(OPEN_PAR);
			setState(370);
			indexed_column();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371);
				match(COMMA);
				setState(372);
				indexed_column();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(CLOSE_PAR);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(379);
				where_expr();
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
			setState(382);
			subtable_name();
			setState(383);
			match(K_SET);
			setState(384);
			match(OPEN_PAR);
			setState(385);
			match(K_ROW);
			setState(386);
			match(OPEN_PAR);
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(387);
				column_def();
				}
				break;
			case 2:
				{
				setState(388);
				set_row_create();
				}
				break;
			}
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					match(COMMA);
					setState(392);
					column_def();
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(398);
				match(COMMA);
				setState(399);
				set_row_create();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
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
			setState(407);
			match(K_CREATE);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(408);
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

			setState(411);
			match(K_TABLE);
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(412);
				match(K_IF);
				setState(413);
				match(K_NOT);
				setState(414);
				match(K_EXISTS);
				}
				break;
			}
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(417);
				database_name();
				setState(418);
				match(DOT);
				}
				break;
			}
			setState(422);
			table_name();
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(423);
				match(OPEN_PAR);
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(424);
					column_def();
					}
					break;
				case 2:
					{
					setState(425);
					set_row_create();
					}
					break;
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(428);
						match(COMMA);
						setState(429);
						column_def();
						}
						} 
					}
					setState(434);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(435);
						match(COMMA);
						setState(436);
						set_row_create();
						}
						} 
					}
					setState(441);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(442);
					match(COMMA);
					setState(443);
					table_constraint();
					}
					}
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(449);
				match(CLOSE_PAR);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(450);
					match(K_WITHOUT);
					setState(451);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(454);
				match(K_AS);
				setState(455);
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
			setState(458);
			match(K_CREATE);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(459);
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

			setState(462);
			match(K_TRIGGER);
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(463);
				match(K_IF);
				setState(464);
				match(K_NOT);
				setState(465);
				match(K_EXISTS);
				}
				break;
			}
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(468);
				database_name();
				setState(469);
				match(DOT);
				}
				break;
			}
			setState(473);
			trigger_name();
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(474);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(475);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(476);
				match(K_INSTEAD);
				setState(477);
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
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(480);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(481);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(482);
				match(K_UPDATE);
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(483);
					match(K_OF);
					setState(484);
					column_name();
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(485);
						match(COMMA);
						setState(486);
						column_name();
						}
						}
						setState(491);
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
			setState(496);
			match(K_ON);
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(497);
				database_name();
				setState(498);
				match(DOT);
				}
				break;
			}
			setState(502);
			table_name();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(503);
				match(K_FOR);
				setState(504);
				match(K_EACH);
				setState(505);
				match(K_ROW);
				}
			}

			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(508);
				match(K_WHEN);
				setState(509);
				expr(0);
				}
			}

			setState(512);
			match(K_BEGIN);
			setState(521); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(513);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(514);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(515);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(516);
					select_stmt();
					}
					break;
				}
				setState(519);
				match(SCOL);
				}
				}
				setState(523); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSERT - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_WITH - 89)))) != 0) );
			setState(525);
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
			setState(527);
			match(K_CREATE);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(528);
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

			setState(531);
			match(K_VIEW);
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(532);
				match(K_IF);
				setState(533);
				match(K_NOT);
				setState(534);
				match(K_EXISTS);
				}
				break;
			}
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(537);
				database_name();
				setState(538);
				match(DOT);
				}
				break;
			}
			setState(542);
			view_name();
			setState(543);
			match(K_AS);
			setState(544);
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
			setState(546);
			match(K_CREATE);
			setState(547);
			match(K_VIRTUAL);
			setState(548);
			match(K_TABLE);
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(549);
				match(K_IF);
				setState(550);
				match(K_NOT);
				setState(551);
				match(K_EXISTS);
				}
				break;
			}
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(554);
				database_name();
				setState(555);
				match(DOT);
				}
				break;
			}
			setState(559);
			table_name();
			setState(560);
			match(K_USING);
			setState(561);
			module_name();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(562);
				match(OPEN_PAR);
				setState(563);
				module_argument();
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(564);
					match(COMMA);
					setState(565);
					module_argument();
					}
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(571);
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
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
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
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(581);
				where_expr();
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
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(584);
				with_clause();
				}
			}

			setState(587);
			match(K_DELETE);
			setState(588);
			match(K_FROM);
			setState(589);
			qualified_table_name();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(590);
				where_expr();
				}
			}

			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(593);
					match(K_ORDER);
					setState(594);
					match(K_BY);
					setState(595);
					ordering_term();
					setState(600);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(596);
						match(COMMA);
						setState(597);
						ordering_term();
						}
						}
						setState(602);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(605);
				match(K_LIMIT);
				setState(606);
				expr(0);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(607);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(608);
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

	public static class Where_exprContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Where_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWhere_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWhere_expr(this);
		}
	}

	public final Where_exprContext where_expr() throws RecognitionException {
		Where_exprContext _localctx = new Where_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_where_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(K_WHERE);
			setState(614);
			expr(0);
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
		enterRule(_localctx, 38, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(K_DETACH);
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(617);
				match(K_DATABASE);
				}
				break;
			}
			setState(620);
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
		enterRule(_localctx, 40, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(K_DROP);
			setState(623);
			match(K_INDEX);
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(624);
				match(K_IF);
				setState(625);
				match(K_EXISTS);
				}
				break;
			}
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(628);
				database_name();
				setState(629);
				match(DOT);
				}
				break;
			}
			setState(633);
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
		enterRule(_localctx, 42, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(K_DROP);
			setState(636);
			match(K_TABLE);
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(637);
				match(K_IF);
				setState(638);
				match(K_EXISTS);
				}
				break;
			}
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(641);
				database_name();
				setState(642);
				match(DOT);
				}
				break;
			}
			setState(646);
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
		enterRule(_localctx, 44, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(K_DROP);
			setState(649);
			match(K_TRIGGER);
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(650);
				match(K_IF);
				setState(651);
				match(K_EXISTS);
				}
				break;
			}
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(654);
				database_name();
				setState(655);
				match(DOT);
				}
				break;
			}
			setState(659);
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
		enterRule(_localctx, 46, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(K_DROP);
			setState(662);
			match(K_VIEW);
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(663);
				match(K_IF);
				setState(664);
				match(K_EXISTS);
				}
				break;
			}
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(667);
				database_name();
				setState(668);
				match(DOT);
				}
				break;
			}
			setState(672);
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
		enterRule(_localctx, 48, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(674);
				match(K_WITH);
				setState(676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(675);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(678);
				common_table_expression();
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(679);
					match(COMMA);
					setState(680);
					common_table_expression();
					}
					}
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(688);
			select_core();
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(689);
				compound_operator();
				setState(690);
				select_core();
				}
				}
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(697);
				match(K_ORDER);
				setState(698);
				match(K_BY);
				setState(699);
				ordering_term();
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(700);
					match(COMMA);
					setState(701);
					ordering_term();
					}
					}
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(709);
				match(K_LIMIT);
				setState(710);
				expr(0);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(711);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(712);
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
		public List<Nf2_point_NoationContext> nf2_point_Noation() {
			return getRuleContexts(Nf2_point_NoationContext.class);
		}
		public Nf2_point_NoationContext nf2_point_Noation(int i) {
			return getRuleContext(Nf2_point_NoationContext.class,i);
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
		enterRule(_localctx, 50, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(717);
				with_clause();
				}
			}

			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(720);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(721);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(722);
				match(K_INSERT);
				setState(723);
				match(K_OR);
				setState(724);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(725);
				match(K_INSERT);
				setState(726);
				match(K_OR);
				setState(727);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(728);
				match(K_INSERT);
				setState(729);
				match(K_OR);
				setState(730);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(731);
				match(K_INSERT);
				setState(732);
				match(K_OR);
				setState(733);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(734);
				match(K_INSERT);
				setState(735);
				match(K_OR);
				setState(736);
				match(K_IGNORE);
				}
				break;
			}
			setState(739);
			match(K_INTO);
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(740);
				database_name();
				setState(741);
				match(DOT);
				}
				break;
			}
			setState(745);
			table_name();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(746);
				match(OPEN_PAR);
				setState(749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(747);
					column_name();
					}
					break;
				case 2:
					{
					setState(748);
					nf2_point_Noation();
					}
					break;
				}
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(751);
					match(COMMA);
					setState(754);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						setState(752);
						column_name();
						}
						break;
					case 2:
						{
						setState(753);
						nf2_point_Noation();
						}
						break;
					}
					}
					}
					setState(760);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(761);
				match(CLOSE_PAR);
				}
			}

			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(765);
				match(K_VALUES);
				setState(766);
				match(OPEN_PAR);
				setState(767);
				expr(0);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(768);
					match(COMMA);
					setState(769);
					expr(0);
					}
					}
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(775);
				match(CLOSE_PAR);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(776);
					match(COMMA);
					setState(777);
					match(OPEN_PAR);
					setState(778);
					expr(0);
					setState(783);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(779);
						match(COMMA);
						setState(780);
						expr(0);
						}
						}
						setState(785);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(786);
					match(CLOSE_PAR);
					}
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(793);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(794);
				match(K_DEFAULT);
				setState(795);
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
		enterRule(_localctx, 52, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(K_PRAGMA);
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(799);
				database_name();
				setState(800);
				match(DOT);
				}
				break;
			}
			setState(804);
			pragma_name();
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(805);
				match(ASSIGN);
				setState(806);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(807);
				match(OPEN_PAR);
				setState(808);
				pragma_value();
				setState(809);
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
		enterRule(_localctx, 54, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(K_REINDEX);
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(814);
				collation_name();
				}
				break;
			case 2:
				{
				setState(818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(815);
					database_name();
					setState(816);
					match(DOT);
					}
					break;
				}
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(820);
					table_name();
					}
					break;
				case 2:
					{
					setState(821);
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
		enterRule(_localctx, 56, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(K_RELEASE);
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(827);
				match(K_SAVEPOINT);
				}
				break;
			}
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
		enterRule(_localctx, 58, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(K_ROLLBACK);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(833);
				match(K_TRANSACTION);
				setState(835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(834);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(839);
				match(K_TO);
				setState(841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(840);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(843);
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
		enterRule(_localctx, 60, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(K_SAVEPOINT);
			setState(847);
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
		enterRule(_localctx, 62, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(849);
				match(K_WITH);
				setState(851);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(850);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(853);
				common_table_expression();
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(854);
					match(COMMA);
					setState(855);
					common_table_expression();
					}
					}
					setState(860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(863);
			select_core();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(864);
				match(K_ORDER);
				setState(865);
				match(K_BY);
				setState(866);
				ordering_term();
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(867);
					match(COMMA);
					setState(868);
					ordering_term();
					}
					}
					setState(873);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(876);
				match(K_LIMIT);
				setState(877);
				expr(0);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(878);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(879);
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
		enterRule(_localctx, 64, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(884);
				match(K_WITH);
				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(885);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(888);
				common_table_expression();
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(889);
					match(COMMA);
					setState(890);
					common_table_expression();
					}
					}
					setState(895);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(898);
			select_or_values();
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(899);
				compound_operator();
				setState(900);
				select_or_values();
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(907);
				match(K_ORDER);
				setState(908);
				match(K_BY);
				setState(909);
				ordering_term();
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(910);
					match(COMMA);
					setState(911);
					ordering_term();
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(919);
				match(K_LIMIT);
				setState(920);
				expr(0);
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(921);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(922);
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
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 66, RULE_select_or_values);
		int _la;
		try {
			setState(1000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				match(K_SELECT);
				setState(929);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(928);
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
				setState(931);
				result_column();
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(932);
					match(COMMA);
					setState(933);
					result_column();
					}
					}
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(939);
					match(K_FROM);
					setState(949);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
						{
						setState(940);
						table_or_subquery();
						setState(945);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(941);
							match(COMMA);
							setState(942);
							table_or_subquery();
							}
							}
							setState(947);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(948);
						join_clause();
						}
						break;
					}
					}
				}

				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(953);
					where_expr();
					}
				}

				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(956);
					match(K_GROUP);
					setState(957);
					match(K_BY);
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
					setState(968);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(966);
						match(K_HAVING);
						setState(967);
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
				setState(972);
				match(K_VALUES);
				setState(973);
				match(OPEN_PAR);
				setState(974);
				expr(0);
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(975);
					match(COMMA);
					setState(976);
					expr(0);
					}
					}
					setState(981);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(982);
				match(CLOSE_PAR);
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(983);
					match(COMMA);
					setState(984);
					match(OPEN_PAR);
					setState(985);
					expr(0);
					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(986);
						match(COMMA);
						setState(987);
						expr(0);
						}
						}
						setState(992);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(993);
					match(CLOSE_PAR);
					}
					}
					setState(999);
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
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Nf2_point_NoationContext> nf2_point_Noation() {
			return getRuleContexts(Nf2_point_NoationContext.class);
		}
		public Nf2_point_NoationContext nf2_point_Noation(int i) {
			return getRuleContext(Nf2_point_NoationContext.class,i);
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
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_update_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1002);
				with_clause();
				}
			}

			setState(1005);
			match(K_UPDATE);
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1006);
				match(K_OR);
				setState(1007);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1008);
				match(K_OR);
				setState(1009);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1010);
				match(K_OR);
				setState(1011);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1012);
				match(K_OR);
				setState(1013);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1014);
				match(K_OR);
				setState(1015);
				match(K_IGNORE);
				}
				break;
			}
			setState(1018);
			qualified_table_name();
			setState(1019);
			match(K_SET);
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1020);
				column_name();
				}
				break;
			case 2:
				{
				setState(1021);
				nf2_point_Noation();
				}
				break;
			}
			setState(1024);
			match(ASSIGN);
			setState(1025);
			expr(0);
			setState(1033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1026);
					match(COMMA);
					setState(1027);
					column_name();
					setState(1028);
					match(ASSIGN);
					setState(1029);
					expr(0);
					}
					} 
				}
				setState(1035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1036);
				match(COMMA);
				setState(1037);
				nf2_point_Noation();
				setState(1038);
				match(ASSIGN);
				setState(1039);
				expr(0);
				}
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1046);
				where_expr();
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
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Nf2_point_NoationContext> nf2_point_Noation() {
			return getRuleContexts(Nf2_point_NoationContext.class);
		}
		public Nf2_point_NoationContext nf2_point_Noation(int i) {
			return getRuleContext(Nf2_point_NoationContext.class,i);
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
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
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
		enterRule(_localctx, 70, RULE_update_stmt_limited);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1049);
				with_clause();
				}
			}

			setState(1052);
			match(K_UPDATE);
			setState(1063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1053);
				match(K_OR);
				setState(1054);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1055);
				match(K_OR);
				setState(1056);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1057);
				match(K_OR);
				setState(1058);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1059);
				match(K_OR);
				setState(1060);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1061);
				match(K_OR);
				setState(1062);
				match(K_IGNORE);
				}
				break;
			}
			setState(1065);
			qualified_table_name();
			setState(1066);
			match(K_SET);
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1067);
				column_name();
				}
				break;
			case 2:
				{
				setState(1068);
				nf2_point_Noation();
				}
				break;
			}
			setState(1071);
			match(ASSIGN);
			setState(1072);
			expr(0);
			setState(1080);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1073);
					match(COMMA);
					setState(1074);
					column_name();
					setState(1075);
					match(ASSIGN);
					setState(1076);
					expr(0);
					}
					} 
				}
				setState(1082);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1083);
				match(COMMA);
				setState(1084);
				nf2_point_Noation();
				setState(1085);
				match(ASSIGN);
				setState(1086);
				expr(0);
				}
				}
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1093);
				where_expr();
				}
			}

			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1096);
					match(K_ORDER);
					setState(1097);
					match(K_BY);
					setState(1098);
					ordering_term();
					setState(1103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1099);
						match(COMMA);
						setState(1100);
						ordering_term();
						}
						}
						setState(1105);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1108);
				match(K_LIMIT);
				setState(1109);
				expr(0);
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1110);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1111);
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
		enterRule(_localctx, 72, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
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
		enterRule(_localctx, 74, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			column_name();
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1119);
				type_name();
				}
				break;
			}
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (K_NOT - 103)) | (1L << (K_NULL - 103)) | (1L << (K_PRIMARY - 103)) | (1L << (K_REFERENCES - 103)) | (1L << (K_UNIQUE - 103)))) != 0)) {
				{
				{
				setState(1122);
				column_constraint();
				}
				}
				setState(1127);
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
		enterRule(_localctx, 76, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1129); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1128);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1131); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1133);
				match(OPEN_PAR);
				setState(1134);
				signed_number();
				setState(1135);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1137);
				match(OPEN_PAR);
				setState(1138);
				signed_number();
				setState(1139);
				match(COMMA);
				setState(1140);
				signed_number();
				setState(1141);
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
		enterRule(_localctx, 78, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1145);
				match(K_CONSTRAINT);
				setState(1146);
				name();
				}
			}

			setState(1182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1149);
				match(K_PRIMARY);
				setState(1150);
				match(K_KEY);
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1151);
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

				setState(1154);
				conflict_clause();
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1155);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1158);
					match(K_NOT);
					}
				}

				setState(1161);
				match(K_NULL);
				setState(1162);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1163);
				match(K_UNIQUE);
				setState(1164);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1165);
				match(K_CHECK);
				setState(1166);
				match(OPEN_PAR);
				setState(1167);
				expr(0);
				setState(1168);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1170);
				match(K_DEFAULT);
				setState(1177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1171);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1172);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1173);
					match(OPEN_PAR);
					setState(1174);
					expr(0);
					setState(1175);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1179);
				match(K_COLLATE);
				setState(1180);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1181);
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
		enterRule(_localctx, 80, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1184);
				match(K_ON);
				setState(1185);
				match(K_CONFLICT);
				setState(1186);
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
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
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
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1190);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1191);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1192);
					table_name();
					setState(1193);
					match(DOT);
					}
					break;
				}
				setState(1198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1197);
					column_name();
					}
					break;
				}
				setState(1204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1200);
						match(DOT);
						setState(1201);
						column_name();
						}
						} 
					}
					setState(1206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(1207);
				unary_operator();
				setState(1208);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1210);
				function_name();
				setState(1211);
				match(OPEN_PAR);
				setState(1224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						setState(1212);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1215);
					expr(0);
					setState(1220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1216);
						match(COMMA);
						setState(1217);
						expr(0);
						}
						}
						setState(1222);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1223);
					match(STAR);
					}
					break;
				}
				setState(1226);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1228);
				match(OPEN_PAR);
				setState(1229);
				expr(0);
				setState(1230);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1232);
				match(K_CAST);
				setState(1233);
				match(OPEN_PAR);
				setState(1234);
				expr(0);
				setState(1235);
				match(K_AS);
				setState(1236);
				type_name();
				setState(1237);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1239);
						match(K_NOT);
						}
					}

					setState(1242);
					match(K_EXISTS);
					}
				}

				setState(1245);
				match(OPEN_PAR);
				setState(1246);
				select_stmt();
				setState(1247);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1249);
				match(K_CASE);
				setState(1251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1250);
					expr(0);
					}
					break;
				}
				setState(1258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1253);
					match(K_WHEN);
					setState(1254);
					expr(0);
					setState(1255);
					match(K_THEN);
					setState(1256);
					expr(0);
					}
					}
					setState(1260); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1262);
					match(K_ELSE);
					setState(1263);
					expr(0);
					}
				}

				setState(1266);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1268);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1369);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1271);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1272);
						match(PIPE2);
						setState(1273);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1274);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1275);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1276);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1277);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1278);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1279);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1280);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1281);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1282);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1283);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1284);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1285);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1286);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1299);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
						case 1:
							{
							setState(1287);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1288);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1289);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1290);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1291);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1292);
							match(K_IS);
							setState(1293);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1294);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1295);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1296);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1297);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1298);
							match(K_REGEXP);
							}
							break;
						}
						setState(1301);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1302);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1303);
						match(K_AND);
						setState(1304);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1305);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1306);
						match(K_OR);
						setState(1307);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1308);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1309);
						match(K_IS);
						setState(1311);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
						case 1:
							{
							setState(1310);
							match(K_NOT);
							}
							break;
						}
						setState(1313);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1314);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1316);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1315);
							match(K_NOT);
							}
						}

						setState(1318);
						match(K_BETWEEN);
						setState(1319);
						expr(0);
						setState(1320);
						match(K_AND);
						setState(1321);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1323);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1324);
						match(K_COLLATE);
						setState(1325);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1326);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1328);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1327);
							match(K_NOT);
							}
						}

						setState(1330);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (K_GLOB - 78)) | (1L << (K_LIKE - 78)) | (1L << (K_MATCH - 78)) | (1L << (K_REGEXP - 78)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1331);
						expr(0);
						setState(1334);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
						case 1:
							{
							setState(1332);
							match(K_ESCAPE);
							setState(1333);
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
						setState(1336);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1341);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1337);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1338);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1339);
							match(K_NOT);
							setState(1340);
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
						setState(1343);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1345);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1344);
							match(K_NOT);
							}
						}

						setState(1347);
						match(K_IN);
						setState(1367);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
						case 1:
							{
							setState(1348);
							match(OPEN_PAR);
							setState(1358);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
							case 1:
								{
								setState(1349);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1350);
								expr(0);
								setState(1355);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1351);
									match(COMMA);
									setState(1352);
									expr(0);
									}
									}
									setState(1357);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1360);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1364);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
							case 1:
								{
								setState(1361);
								database_name();
								setState(1362);
								match(DOT);
								}
								break;
							}
							setState(1366);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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
		enterRule(_localctx, 84, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			match(K_REFERENCES);
			setState(1375);
			foreign_table();
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1376);
				match(OPEN_PAR);
				setState(1377);
				column_name();
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1378);
					match(COMMA);
					setState(1379);
					column_name();
					}
					}
					setState(1384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1385);
				match(CLOSE_PAR);
				}
			}

			setState(1407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1403);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1389);
					match(K_ON);
					setState(1390);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
					case 1:
						{
						setState(1391);
						match(K_SET);
						setState(1392);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1393);
						match(K_SET);
						setState(1394);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1395);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1396);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1397);
						match(K_NO);
						setState(1398);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1401);
					match(K_MATCH);
					setState(1402);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1410);
					match(K_NOT);
					}
				}

				setState(1413);
				match(K_DEFERRABLE);
				setState(1418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1414);
					match(K_INITIALLY);
					setState(1415);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1416);
					match(K_INITIALLY);
					setState(1417);
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
		enterRule(_localctx, 86, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			match(K_RAISE);
			setState(1423);
			match(OPEN_PAR);
			setState(1428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1424);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1425);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1426);
				match(COMMA);
				setState(1427);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1430);
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
		public Nf2_point_NoationContext nf2_point_Noation() {
			return getRuleContext(Nf2_point_NoationContext.class,0);
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
		enterRule(_localctx, 88, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1432);
				column_name();
				}
				break;
			case 2:
				{
				setState(1433);
				nf2_point_Noation();
				}
				break;
			}
			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1436);
				match(K_COLLATE);
				setState(1437);
				collation_name();
				}
			}

			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1440);
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
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Nf2_point_NoationContext> nf2_point_Noation() {
			return getRuleContexts(Nf2_point_NoationContext.class);
		}
		public Nf2_point_NoationContext nf2_point_Noation(int i) {
			return getRuleContext(Nf2_point_NoationContext.class,i);
		}
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
		enterRule(_localctx, 90, RULE_table_constraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1443);
				match(K_CONSTRAINT);
				setState(1444);
				name();
				}
			}

			setState(1489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1450);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1447);
					match(K_PRIMARY);
					setState(1448);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1449);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1452);
				match(OPEN_PAR);
				setState(1453);
				indexed_column();
				setState(1458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1454);
					match(COMMA);
					setState(1455);
					indexed_column();
					}
					}
					setState(1460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1461);
				match(CLOSE_PAR);
				setState(1462);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1464);
				match(K_CHECK);
				setState(1465);
				match(OPEN_PAR);
				setState(1466);
				expr(0);
				setState(1467);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1469);
				match(K_FOREIGN);
				setState(1470);
				match(K_KEY);
				setState(1471);
				match(OPEN_PAR);
				setState(1474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1472);
					column_name();
					}
					break;
				case 2:
					{
					setState(1473);
					nf2_point_Noation();
					}
					break;
				}
				setState(1480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1476);
						match(COMMA);
						setState(1477);
						column_name();
						}
						} 
					}
					setState(1482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				{
				setState(1483);
				match(COMMA);
				setState(1484);
				nf2_point_Noation();
				}
				setState(1486);
				match(CLOSE_PAR);
				setState(1487);
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
		enterRule(_localctx, 92, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(K_WITH);
			setState(1493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1492);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1495);
			cte_table_name();
			setState(1496);
			match(K_AS);
			setState(1497);
			match(OPEN_PAR);
			setState(1498);
			select_stmt();
			setState(1499);
			match(CLOSE_PAR);
			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1500);
				match(COMMA);
				setState(1501);
				cte_table_name();
				setState(1502);
				match(K_AS);
				setState(1503);
				match(OPEN_PAR);
				setState(1504);
				select_stmt();
				setState(1505);
				match(CLOSE_PAR);
				}
				}
				setState(1511);
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
		enterRule(_localctx, 94, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1512);
				database_name();
				setState(1513);
				match(DOT);
				}
				break;
			}
			setState(1517);
			table_name();
			setState(1523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1518);
				match(K_INDEXED);
				setState(1519);
				match(K_BY);
				setState(1520);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1521);
				match(K_NOT);
				setState(1522);
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
		enterRule(_localctx, 96, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			expr(0);
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1526);
				match(K_COLLATE);
				setState(1527);
				collation_name();
				}
			}

			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1530);
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
		enterRule(_localctx, 98, RULE_pragma_value);
		try {
			setState(1536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1533);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1535);
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
		public List<Nf2_point_NoationContext> nf2_point_Noation() {
			return getRuleContexts(Nf2_point_NoationContext.class);
		}
		public Nf2_point_NoationContext nf2_point_Noation(int i) {
			return getRuleContext(Nf2_point_NoationContext.class,i);
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
		enterRule(_localctx, 100, RULE_common_table_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			table_name();
			setState(1560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1539);
				match(OPEN_PAR);
				setState(1542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1540);
					column_name();
					}
					break;
				case 2:
					{
					setState(1541);
					nf2_point_Noation();
					}
					break;
				}
				setState(1548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1544);
						match(COMMA);
						setState(1545);
						column_name();
						}
						} 
					}
					setState(1550);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
				}
				setState(1555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1551);
					match(COMMA);
					setState(1552);
					nf2_point_Noation();
					}
					}
					setState(1557);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1558);
				match(CLOSE_PAR);
				}
			}

			setState(1562);
			match(K_AS);
			setState(1563);
			match(OPEN_PAR);
			setState(1564);
			select_stmt();
			setState(1565);
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
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Nf2_point_NoationContext nf2_point_Noation() {
			return getRuleContext(Nf2_point_NoationContext.class,0);
		}
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
		enterRule(_localctx, 102, RULE_result_column);
		int _la;
		try {
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1567);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1568);
				table_name();
				setState(1569);
				match(DOT);
				setState(1575);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(1570);
					match(STAR);
					}
					break;
				case OPEN_PAR:
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
				case STRING_LITERAL:
					{
					setState(1573);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
					case 1:
						{
						setState(1571);
						column_name();
						}
						break;
					case 2:
						{
						setState(1572);
						nf2_point_Noation();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1577);
				expr(0);
				setState(1582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1579);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1578);
						match(K_AS);
						}
					}

					setState(1581);
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
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Nf2_point_NoationContext nf2_point_Noation() {
			return getRuleContext(Nf2_point_NoationContext.class,0);
		}
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
		enterRule(_localctx, 104, RULE_table_or_subquery);
		int _la;
		try {
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1586);
				table_name();
				setState(1591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1587);
					match(DOT);
					setState(1588);
					column_name();
					}
					break;
				case 2:
					{
					setState(1589);
					match(DOT);
					setState(1590);
					nf2_point_Noation();
					}
					break;
				}
				setState(1597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1594);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
					case 1:
						{
						setState(1593);
						match(K_AS);
						}
						break;
					}
					setState(1596);
					table_alias();
					}
					break;
				}
				setState(1604);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1599);
					match(K_INDEXED);
					setState(1600);
					match(K_BY);
					setState(1601);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1602);
					match(K_NOT);
					setState(1603);
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
				setState(1606);
				match(OPEN_PAR);
				setState(1616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1607);
					table_or_subquery();
					setState(1612);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1608);
						match(COMMA);
						setState(1609);
						table_or_subquery();
						}
						}
						setState(1614);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1615);
					join_clause();
					}
					break;
				}
				setState(1618);
				match(CLOSE_PAR);
				setState(1623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1620);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
					case 1:
						{
						setState(1619);
						match(K_AS);
						}
						break;
					}
					setState(1622);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1625);
				match(OPEN_PAR);
				setState(1626);
				select_stmt();
				setState(1627);
				match(CLOSE_PAR);
				setState(1632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1629);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
					case 1:
						{
						setState(1628);
						match(K_AS);
						}
						break;
					}
					setState(1631);
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
		enterRule(_localctx, 106, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			table_or_subquery();
			setState(1643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INNER - 88)) | (1L << (K_JOIN - 88)) | (1L << (K_LEFT - 88)) | (1L << (K_NATURAL - 88)))) != 0)) {
				{
				{
				setState(1637);
				join_operator();
				setState(1638);
				table_or_subquery();
				setState(1639);
				join_constraint();
				}
				}
				setState(1645);
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
		enterRule(_localctx, 108, RULE_join_operator);
		int _la;
		try {
			setState(1659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646);
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
				setState(1648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1647);
					match(K_NATURAL);
					}
				}

				setState(1656);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1650);
					match(K_LEFT);
					setState(1652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1651);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1654);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1655);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1658);
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
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<Nf2_point_NoationContext> nf2_point_Noation() {
			return getRuleContexts(Nf2_point_NoationContext.class);
		}
		public Nf2_point_NoationContext nf2_point_Noation(int i) {
			return getRuleContext(Nf2_point_NoationContext.class,i);
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
		enterRule(_localctx, 110, RULE_join_constraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1661);
				match(K_ON);
				setState(1662);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1663);
				match(K_USING);
				setState(1664);
				match(OPEN_PAR);
				setState(1667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1665);
					nf2_point_Noation();
					}
					break;
				case 2:
					{
					setState(1666);
					column_name();
					}
					break;
				}
				setState(1673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1669);
						match(COMMA);
						setState(1670);
						column_name();
						}
						} 
					}
					setState(1675);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
				}
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1676);
					match(COMMA);
					setState(1677);
					nf2_point_Noation();
					}
					}
					setState(1682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1683);
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
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 112, RULE_select_core);
		int _la;
		try {
			setState(1760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1687);
				match(K_SELECT);
				setState(1689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1688);
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
				setState(1691);
				result_column();
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1692);
					match(COMMA);
					setState(1693);
					result_column();
					}
					}
					setState(1698);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1699);
					match(K_FROM);
					setState(1709);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
					case 1:
						{
						setState(1700);
						table_or_subquery();
						setState(1705);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1701);
							match(COMMA);
							setState(1702);
							table_or_subquery();
							}
							}
							setState(1707);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1708);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1713);
					where_expr();
					}
				}

				setState(1730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1716);
					match(K_GROUP);
					setState(1717);
					match(K_BY);
					setState(1718);
					expr(0);
					setState(1723);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1719);
						match(COMMA);
						setState(1720);
						expr(0);
						}
						}
						setState(1725);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1728);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1726);
						match(K_HAVING);
						setState(1727);
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
				setState(1732);
				match(K_VALUES);
				setState(1733);
				match(OPEN_PAR);
				setState(1734);
				expr(0);
				setState(1739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1735);
					match(COMMA);
					setState(1736);
					expr(0);
					}
					}
					setState(1741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1742);
				match(CLOSE_PAR);
				setState(1757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1743);
					match(COMMA);
					setState(1744);
					match(OPEN_PAR);
					setState(1745);
					expr(0);
					setState(1750);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1746);
						match(COMMA);
						setState(1747);
						expr(0);
						}
						}
						setState(1752);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1753);
					match(CLOSE_PAR);
					}
					}
					setState(1759);
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
		enterRule(_localctx, 114, RULE_compound_operator);
		try {
			setState(1767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1762);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1763);
				match(K_UNION);
				setState(1764);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1765);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1766);
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
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Nf2_point_NoationContext> nf2_point_Noation() {
			return getRuleContexts(Nf2_point_NoationContext.class);
		}
		public Nf2_point_NoationContext nf2_point_Noation(int i) {
			return getRuleContext(Nf2_point_NoationContext.class,i);
		}
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
		enterRule(_localctx, 116, RULE_cte_table_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			table_name();
			setState(1791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1770);
				match(OPEN_PAR);
				setState(1773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(1771);
					column_name();
					}
					break;
				case 2:
					{
					setState(1772);
					nf2_point_Noation();
					}
					break;
				}
				setState(1779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1775);
						match(COMMA);
						setState(1776);
						column_name();
						}
						} 
					}
					setState(1781);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				}
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1782);
					match(COMMA);
					setState(1783);
					nf2_point_Noation();
					}
					}
					setState(1788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1789);
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
		enterRule(_localctx, 118, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1793);
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

			setState(1796);
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
		enterRule(_localctx, 120, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
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
		enterRule(_localctx, 122, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
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
		enterRule(_localctx, 124, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
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
		enterRule(_localctx, 126, RULE_module_argument);
		try {
			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1804);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1805);
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
		enterRule(_localctx, 128, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
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
		enterRule(_localctx, 130, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
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

	public static class Nf2_point_NoationContext extends ParserRuleContext {
		public Name_of_subtableContext name_of_subtable() {
			return getRuleContext(Name_of_subtableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Subtable_column_nameContext subtable_column_name() {
			return getRuleContext(Subtable_column_nameContext.class,0);
		}
		public Nf2_point_NoationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nf2_point_Noation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterNf2_point_Noation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitNf2_point_Noation(this);
		}
	}

	public final Nf2_point_NoationContext nf2_point_Noation() throws RecognitionException {
		Nf2_point_NoationContext _localctx = new Nf2_point_NoationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_nf2_point_Noation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			name_of_subtable();
			setState(1813);
			match(DOT);
			setState(1814);
			subtable_column_name();
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

	public static class Name_of_subtableContext extends ParserRuleContext {
		public List<Subtable_nameContext> subtable_name() {
			return getRuleContexts(Subtable_nameContext.class);
		}
		public Subtable_nameContext subtable_name(int i) {
			return getRuleContext(Subtable_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public Name_of_subtableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_of_subtable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterName_of_subtable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitName_of_subtable(this);
		}
	}

	public final Name_of_subtableContext name_of_subtable() throws RecognitionException {
		Name_of_subtableContext _localctx = new Name_of_subtableContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_name_of_subtable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			subtable_name();
			setState(1821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1817);
					match(DOT);
					setState(1818);
					subtable_name();
					}
					} 
				}
				setState(1823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
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

	public static class Subtable_column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Subtable_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtable_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSubtable_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSubtable_column_name(this);
		}
	}

	public final Subtable_column_nameContext subtable_column_name() throws RecognitionException {
		Subtable_column_nameContext _localctx = new Subtable_column_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_subtable_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
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
		enterRule(_localctx, 138, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
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
		enterRule(_localctx, 140, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
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
		enterRule(_localctx, 142, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
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
		enterRule(_localctx, 144, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
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
		enterRule(_localctx, 146, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
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
		enterRule(_localctx, 148, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
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
		enterRule(_localctx, 150, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
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
		enterRule(_localctx, 152, RULE_subtable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
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
		enterRule(_localctx, 154, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
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
		enterRule(_localctx, 156, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
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
		enterRule(_localctx, 158, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
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
		enterRule(_localctx, 160, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
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
		enterRule(_localctx, 162, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
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
		enterRule(_localctx, 164, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
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
		enterRule(_localctx, 166, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
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
		enterRule(_localctx, 168, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
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
		enterRule(_localctx, 170, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
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
		enterRule(_localctx, 172, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
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
		enterRule(_localctx, 174, RULE_any_name);
		try {
			setState(1869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1862);
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
				setState(1863);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1864);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1865);
				match(OPEN_PAR);
				setState(1866);
				any_name();
				setState(1867);
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
		case 41:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a2\u0752\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\7\2\u00b5\n\2\f\2\16\2\u00b8\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u00c0\n\4\f\4\16\4\u00c3\13\4\3\4\3\4\6"+
		"\4\u00c7\n\4\r\4\16\4\u00c8\3\4\7\4\u00cc\n\4\f\4\16\4\u00cf\13\4\3\4"+
		"\7\4\u00d2\n\4\f\4\16\4\u00d5\13\4\3\5\3\5\3\5\5\5\u00da\n\5\5\5\u00dc"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00fc\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u0103\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u010b\n\6"+
		"\3\6\5\6\u010e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0117\n\7\3\b\3\b\5"+
		"\b\u011b\n\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u0123\n\t\3\t\3\t\5\t\u0127\n"+
		"\t\5\t\u0129\n\t\3\n\3\n\3\n\5\n\u012e\n\n\5\n\u0130\n\n\3\13\3\13\5\13"+
		"\u0134\n\13\3\13\3\13\3\13\7\13\u0139\n\13\f\13\16\13\u013c\13\13\5\13"+
		"\u013e\n\13\3\13\3\13\3\13\5\13\u0143\n\13\3\13\3\13\5\13\u0147\n\13\3"+
		"\13\6\13\u014a\n\13\r\13\16\13\u014b\3\13\3\13\3\13\3\13\3\13\7\13\u0153"+
		"\n\13\f\13\16\13\u0156\13\13\5\13\u0158\n\13\3\13\3\13\3\13\3\13\5\13"+
		"\u015e\n\13\5\13\u0160\n\13\3\f\3\f\5\f\u0164\n\f\3\f\3\f\3\f\3\f\5\f"+
		"\u016a\n\f\3\f\3\f\3\f\5\f\u016f\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0178"+
		"\n\f\f\f\16\f\u017b\13\f\3\f\3\f\5\f\u017f\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0188\n\r\3\r\3\r\7\r\u018c\n\r\f\r\16\r\u018f\13\r\3\r\3\r\7"+
		"\r\u0193\n\r\f\r\16\r\u0196\13\r\3\r\3\r\3\16\3\16\5\16\u019c\n\16\3\16"+
		"\3\16\3\16\3\16\5\16\u01a2\n\16\3\16\3\16\3\16\5\16\u01a7\n\16\3\16\3"+
		"\16\3\16\3\16\5\16\u01ad\n\16\3\16\3\16\7\16\u01b1\n\16\f\16\16\16\u01b4"+
		"\13\16\3\16\3\16\7\16\u01b8\n\16\f\16\16\16\u01bb\13\16\3\16\3\16\7\16"+
		"\u01bf\n\16\f\16\16\16\u01c2\13\16\3\16\3\16\3\16\5\16\u01c7\n\16\3\16"+
		"\3\16\5\16\u01cb\n\16\3\17\3\17\5\17\u01cf\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u01d5\n\17\3\17\3\17\3\17\5\17\u01da\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u01e1\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01ea\n\17\f"+
		"\17\16\17\u01ed\13\17\5\17\u01ef\n\17\5\17\u01f1\n\17\3\17\3\17\3\17\3"+
		"\17\5\17\u01f7\n\17\3\17\3\17\3\17\3\17\5\17\u01fd\n\17\3\17\3\17\5\17"+
		"\u0201\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u0208\n\17\3\17\3\17\6\17\u020c"+
		"\n\17\r\17\16\17\u020d\3\17\3\17\3\20\3\20\5\20\u0214\n\20\3\20\3\20\3"+
		"\20\3\20\5\20\u021a\n\20\3\20\3\20\3\20\5\20\u021f\n\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u022b\n\21\3\21\3\21\3\21\5\21"+
		"\u0230\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0239\n\21\f\21\16"+
		"\21\u023c\13\21\3\21\3\21\5\21\u0240\n\21\3\22\5\22\u0243\n\22\3\22\3"+
		"\22\3\22\3\22\5\22\u0249\n\22\3\23\5\23\u024c\n\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0252\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u0259\n\23\f\23\16\23\u025c"+
		"\13\23\5\23\u025e\n\23\3\23\3\23\3\23\3\23\5\23\u0264\n\23\5\23\u0266"+
		"\n\23\3\24\3\24\3\24\3\25\3\25\5\25\u026d\n\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\5\26\u0275\n\26\3\26\3\26\3\26\5\26\u027a\n\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\5\27\u0282\n\27\3\27\3\27\3\27\5\27\u0287\n\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\5\30\u028f\n\30\3\30\3\30\3\30\5\30\u0294\n\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\5\31\u029c\n\31\3\31\3\31\3\31\5\31\u02a1"+
		"\n\31\3\31\3\31\3\32\3\32\5\32\u02a7\n\32\3\32\3\32\3\32\7\32\u02ac\n"+
		"\32\f\32\16\32\u02af\13\32\5\32\u02b1\n\32\3\32\3\32\3\32\3\32\7\32\u02b7"+
		"\n\32\f\32\16\32\u02ba\13\32\3\32\3\32\3\32\3\32\3\32\7\32\u02c1\n\32"+
		"\f\32\16\32\u02c4\13\32\5\32\u02c6\n\32\3\32\3\32\3\32\3\32\5\32\u02cc"+
		"\n\32\5\32\u02ce\n\32\3\33\5\33\u02d1\n\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02e4"+
		"\n\33\3\33\3\33\3\33\3\33\5\33\u02ea\n\33\3\33\3\33\3\33\3\33\5\33\u02f0"+
		"\n\33\3\33\3\33\3\33\5\33\u02f5\n\33\7\33\u02f7\n\33\f\33\16\33\u02fa"+
		"\13\33\3\33\3\33\5\33\u02fe\n\33\3\33\3\33\3\33\3\33\3\33\7\33\u0305\n"+
		"\33\f\33\16\33\u0308\13\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0310\n"+
		"\33\f\33\16\33\u0313\13\33\3\33\3\33\7\33\u0317\n\33\f\33\16\33\u031a"+
		"\13\33\3\33\3\33\3\33\5\33\u031f\n\33\3\34\3\34\3\34\3\34\5\34\u0325\n"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u032e\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0335\n\35\3\35\3\35\5\35\u0339\n\35\5\35\u033b\n\35\3"+
		"\36\3\36\5\36\u033f\n\36\3\36\3\36\3\37\3\37\3\37\5\37\u0346\n\37\5\37"+
		"\u0348\n\37\3\37\3\37\5\37\u034c\n\37\3\37\5\37\u034f\n\37\3 \3 \3 \3"+
		"!\3!\5!\u0356\n!\3!\3!\3!\7!\u035b\n!\f!\16!\u035e\13!\5!\u0360\n!\3!"+
		"\3!\3!\3!\3!\3!\7!\u0368\n!\f!\16!\u036b\13!\5!\u036d\n!\3!\3!\3!\3!\5"+
		"!\u0373\n!\5!\u0375\n!\3\"\3\"\5\"\u0379\n\"\3\"\3\"\3\"\7\"\u037e\n\""+
		"\f\"\16\"\u0381\13\"\5\"\u0383\n\"\3\"\3\"\3\"\3\"\7\"\u0389\n\"\f\"\16"+
		"\"\u038c\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u0393\n\"\f\"\16\"\u0396\13\"\5"+
		"\"\u0398\n\"\3\"\3\"\3\"\3\"\5\"\u039e\n\"\5\"\u03a0\n\"\3#\3#\5#\u03a4"+
		"\n#\3#\3#\3#\7#\u03a9\n#\f#\16#\u03ac\13#\3#\3#\3#\3#\7#\u03b2\n#\f#\16"+
		"#\u03b5\13#\3#\5#\u03b8\n#\5#\u03ba\n#\3#\5#\u03bd\n#\3#\3#\3#\3#\3#\7"+
		"#\u03c4\n#\f#\16#\u03c7\13#\3#\3#\5#\u03cb\n#\5#\u03cd\n#\3#\3#\3#\3#"+
		"\3#\7#\u03d4\n#\f#\16#\u03d7\13#\3#\3#\3#\3#\3#\3#\7#\u03df\n#\f#\16#"+
		"\u03e2\13#\3#\3#\7#\u03e6\n#\f#\16#\u03e9\13#\5#\u03eb\n#\3$\5$\u03ee"+
		"\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u03fb\n$\3$\3$\3$\3$\5$\u0401"+
		"\n$\3$\3$\3$\3$\3$\3$\3$\7$\u040a\n$\f$\16$\u040d\13$\3$\3$\3$\3$\3$\7"+
		"$\u0414\n$\f$\16$\u0417\13$\3$\5$\u041a\n$\3%\5%\u041d\n%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\5%\u042a\n%\3%\3%\3%\3%\5%\u0430\n%\3%\3%\3%\3%"+
		"\3%\3%\3%\7%\u0439\n%\f%\16%\u043c\13%\3%\3%\3%\3%\3%\7%\u0443\n%\f%\16"+
		"%\u0446\13%\3%\5%\u0449\n%\3%\3%\3%\3%\3%\7%\u0450\n%\f%\16%\u0453\13"+
		"%\5%\u0455\n%\3%\3%\3%\3%\5%\u045b\n%\5%\u045d\n%\3&\3&\3\'\3\'\5\'\u0463"+
		"\n\'\3\'\7\'\u0466\n\'\f\'\16\'\u0469\13\'\3(\6(\u046c\n(\r(\16(\u046d"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u047a\n(\3)\3)\5)\u047e\n)\3)\3)\3)"+
		"\5)\u0483\n)\3)\3)\5)\u0487\n)\3)\5)\u048a\n)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\5)\u049c\n)\3)\3)\3)\5)\u04a1\n)\3*\3*\3*\5*"+
		"\u04a6\n*\3+\3+\3+\3+\3+\3+\5+\u04ae\n+\3+\5+\u04b1\n+\3+\3+\7+\u04b5"+
		"\n+\f+\16+\u04b8\13+\3+\3+\3+\3+\3+\3+\5+\u04c0\n+\3+\3+\3+\7+\u04c5\n"+
		"+\f+\16+\u04c8\13+\3+\5+\u04cb\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\5+\u04db\n+\3+\5+\u04de\n+\3+\3+\3+\3+\3+\3+\5+\u04e6\n+\3+\3+"+
		"\3+\3+\3+\6+\u04ed\n+\r+\16+\u04ee\3+\3+\5+\u04f3\n+\3+\3+\3+\5+\u04f8"+
		"\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\5+\u0516\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0522"+
		"\n+\3+\3+\3+\5+\u0527\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0533\n+\3+"+
		"\3+\3+\3+\5+\u0539\n+\3+\3+\3+\3+\3+\5+\u0540\n+\3+\3+\5+\u0544\n+\3+"+
		"\3+\3+\3+\3+\3+\7+\u054c\n+\f+\16+\u054f\13+\5+\u0551\n+\3+\3+\3+\3+\5"+
		"+\u0557\n+\3+\5+\u055a\n+\7+\u055c\n+\f+\16+\u055f\13+\3,\3,\3,\3,\3,"+
		"\3,\7,\u0567\n,\f,\16,\u056a\13,\3,\3,\5,\u056e\n,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\5,\u057a\n,\3,\3,\5,\u057e\n,\7,\u0580\n,\f,\16,\u0583\13,"+
		"\3,\5,\u0586\n,\3,\3,\3,\3,\3,\5,\u058d\n,\5,\u058f\n,\3-\3-\3-\3-\3-"+
		"\3-\5-\u0597\n-\3-\3-\3.\3.\5.\u059d\n.\3.\3.\5.\u05a1\n.\3.\5.\u05a4"+
		"\n.\3/\3/\5/\u05a8\n/\3/\3/\3/\5/\u05ad\n/\3/\3/\3/\3/\7/\u05b3\n/\f/"+
		"\16/\u05b6\13/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u05c5\n/\3/\3"+
		"/\7/\u05c9\n/\f/\16/\u05cc\13/\3/\3/\3/\3/\3/\3/\5/\u05d4\n/\3\60\3\60"+
		"\5\60\u05d8\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u05e6\n\60\f\60\16\60\u05e9\13\60\3\61\3\61\3\61\5\61\u05ee"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u05f6\n\61\3\62\3\62\3\62\5\62"+
		"\u05fb\n\62\3\62\5\62\u05fe\n\62\3\63\3\63\3\63\5\63\u0603\n\63\3\64\3"+
		"\64\3\64\3\64\5\64\u0609\n\64\3\64\3\64\7\64\u060d\n\64\f\64\16\64\u0610"+
		"\13\64\3\64\3\64\7\64\u0614\n\64\f\64\16\64\u0617\13\64\3\64\3\64\5\64"+
		"\u061b\n\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u0628\n\65\5\65\u062a\n\65\3\65\3\65\5\65\u062e\n\65\3\65\5\65\u0631"+
		"\n\65\5\65\u0633\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u063a\n\66\3\66\5"+
		"\66\u063d\n\66\3\66\5\66\u0640\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u0647"+
		"\n\66\3\66\3\66\3\66\3\66\7\66\u064d\n\66\f\66\16\66\u0650\13\66\3\66"+
		"\5\66\u0653\n\66\3\66\3\66\5\66\u0657\n\66\3\66\5\66\u065a\n\66\3\66\3"+
		"\66\3\66\3\66\5\66\u0660\n\66\3\66\5\66\u0663\n\66\5\66\u0665\n\66\3\67"+
		"\3\67\3\67\3\67\3\67\7\67\u066c\n\67\f\67\16\67\u066f\13\67\38\38\58\u0673"+
		"\n8\38\38\58\u0677\n8\38\38\58\u067b\n8\38\58\u067e\n8\39\39\39\39\39"+
		"\39\59\u0686\n9\39\39\79\u068a\n9\f9\169\u068d\139\39\39\79\u0691\n9\f"+
		"9\169\u0694\139\39\39\59\u0698\n9\3:\3:\5:\u069c\n:\3:\3:\3:\7:\u06a1"+
		"\n:\f:\16:\u06a4\13:\3:\3:\3:\3:\7:\u06aa\n:\f:\16:\u06ad\13:\3:\5:\u06b0"+
		"\n:\5:\u06b2\n:\3:\5:\u06b5\n:\3:\3:\3:\3:\3:\7:\u06bc\n:\f:\16:\u06bf"+
		"\13:\3:\3:\5:\u06c3\n:\5:\u06c5\n:\3:\3:\3:\3:\3:\7:\u06cc\n:\f:\16:\u06cf"+
		"\13:\3:\3:\3:\3:\3:\3:\7:\u06d7\n:\f:\16:\u06da\13:\3:\3:\7:\u06de\n:"+
		"\f:\16:\u06e1\13:\5:\u06e3\n:\3;\3;\3;\3;\3;\5;\u06ea\n;\3<\3<\3<\3<\5"+
		"<\u06f0\n<\3<\3<\7<\u06f4\n<\f<\16<\u06f7\13<\3<\3<\7<\u06fb\n<\f<\16"+
		"<\u06fe\13<\3<\3<\5<\u0702\n<\3=\5=\u0705\n=\3=\3=\3>\3>\3?\3?\3@\3@\3"+
		"A\3A\5A\u0711\nA\3B\3B\3C\3C\3D\3D\3D\3D\3E\3E\3E\7E\u071e\nE\fE\16E\u0721"+
		"\13E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3"+
		"P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\5Y\u0750\nY\3Y\2\3TZ\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\2\24\5\2==HHUU"+
		"\4\2\62\62EE\4\2\b\bmm\3\2\u0086\u0087\4\2  AA\4\2%%??\7\2\34\34KKTT}"+
		"}\u0080\u0080\4\2\n\n\17\20\3\2\13\f\3\2\21\24\3\2\25\30\6\2PPddffyy\4"+
		"\2>>\u008e\u008e\5\2\34\34KK\u0080\u0080\6\2\679kk\u009b\u009b\u009d\u009e"+
		"\4\2\13\rii\4\2\u009a\u009a\u009d\u009d\3\2\34\u0097\2\u0871\2\u00b6\3"+
		"\2\2\2\4\u00bb\3\2\2\2\6\u00c1\3\2\2\2\b\u00db\3\2\2\2\n\u00fd\3\2\2\2"+
		"\f\u010f\3\2\2\2\16\u0118\3\2\2\2\20\u0120\3\2\2\2\22\u012a\3\2\2\2\24"+
		"\u013d\3\2\2\2\26\u0161\3\2\2\2\30\u0180\3\2\2\2\32\u0199\3\2\2\2\34\u01cc"+
		"\3\2\2\2\36\u0211\3\2\2\2 \u0224\3\2\2\2\"\u0242\3\2\2\2$\u024b\3\2\2"+
		"\2&\u0267\3\2\2\2(\u026a\3\2\2\2*\u0270\3\2\2\2,\u027d\3\2\2\2.\u028a"+
		"\3\2\2\2\60\u0297\3\2\2\2\62\u02b0\3\2\2\2\64\u02d0\3\2\2\2\66\u0320\3"+
		"\2\2\28\u032f\3\2\2\2:\u033c\3\2\2\2<\u0342\3\2\2\2>\u0350\3\2\2\2@\u035f"+
		"\3\2\2\2B\u0382\3\2\2\2D\u03ea\3\2\2\2F\u03ed\3\2\2\2H\u041c\3\2\2\2J"+
		"\u045e\3\2\2\2L\u0460\3\2\2\2N\u046b\3\2\2\2P\u047d\3\2\2\2R\u04a5\3\2"+
		"\2\2T\u04f7\3\2\2\2V\u0560\3\2\2\2X\u0590\3\2\2\2Z\u059c\3\2\2\2\\\u05a7"+
		"\3\2\2\2^\u05d5\3\2\2\2`\u05ed\3\2\2\2b\u05f7\3\2\2\2d\u0602\3\2\2\2f"+
		"\u0604\3\2\2\2h\u0632\3\2\2\2j\u0664\3\2\2\2l\u0666\3\2\2\2n\u067d\3\2"+
		"\2\2p\u0697\3\2\2\2r\u06e2\3\2\2\2t\u06e9\3\2\2\2v\u06eb\3\2\2\2x\u0704"+
		"\3\2\2\2z\u0708\3\2\2\2|\u070a\3\2\2\2~\u070c\3\2\2\2\u0080\u0710\3\2"+
		"\2\2\u0082\u0712\3\2\2\2\u0084\u0714\3\2\2\2\u0086\u0716\3\2\2\2\u0088"+
		"\u071a\3\2\2\2\u008a\u0722\3\2\2\2\u008c\u0724\3\2\2\2\u008e\u0726\3\2"+
		"\2\2\u0090\u0728\3\2\2\2\u0092\u072a\3\2\2\2\u0094\u072c\3\2\2\2\u0096"+
		"\u072e\3\2\2\2\u0098\u0730\3\2\2\2\u009a\u0732\3\2\2\2\u009c\u0734\3\2"+
		"\2\2\u009e\u0736\3\2\2\2\u00a0\u0738\3\2\2\2\u00a2\u073a\3\2\2\2\u00a4"+
		"\u073c\3\2\2\2\u00a6\u073e\3\2\2\2\u00a8\u0740\3\2\2\2\u00aa\u0742\3\2"+
		"\2\2\u00ac\u0744\3\2\2\2\u00ae\u0746\3\2\2\2\u00b0\u074f\3\2\2\2\u00b2"+
		"\u00b5\5\6\4\2\u00b3\u00b5\5\4\3\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2"+
		"\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\2\2\3\u00ba\3\3\2\2\2"+
		"\u00bb\u00bc\7\u00a2\2\2\u00bc\u00bd\b\3\1\2\u00bd\5\3\2\2\2\u00be\u00c0"+
		"\7\4\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00cd\5\b"+
		"\5\2\u00c5\u00c7\7\4\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\5\b"+
		"\5\2\u00cb\u00c6\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d3\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\7\4"+
		"\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\7J\2\2"+
		"\u00d7\u00d8\7u\2\2\u00d8\u00da\7r\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00fb\3\2\2\2\u00dd\u00fc\5\n\6\2\u00de\u00fc\5\f\7\2\u00df\u00fc\5\16"+
		"\b\2\u00e0\u00fc\5\20\t\2\u00e1\u00fc\5\22\n\2\u00e2\u00fc\5\24\13\2\u00e3"+
		"\u00fc\5\26\f\2\u00e4\u00fc\5\32\16\2\u00e5\u00fc\5\34\17\2\u00e6\u00fc"+
		"\5\36\20\2\u00e7\u00fc\5 \21\2\u00e8\u00fc\5\"\22\2\u00e9\u00fc\5$\23"+
		"\2\u00ea\u00fc\5(\25\2\u00eb\u00fc\5*\26\2\u00ec\u00fc\5,\27\2\u00ed\u00fc"+
		"\5.\30\2\u00ee\u00fc\5\60\31\2\u00ef\u00fc\5\62\32\2\u00f0\u00fc\5\64"+
		"\33\2\u00f1\u00fc\5\66\34\2\u00f2\u00fc\58\35\2\u00f3\u00fc\5:\36\2\u00f4"+
		"\u00fc\5<\37\2\u00f5\u00fc\5> \2\u00f6\u00fc\5@!\2\u00f7\u00fc\5B\"\2"+
		"\u00f8\u00fc\5F$\2\u00f9\u00fc\5H%\2\u00fa\u00fc\5J&\2\u00fb\u00dd\3\2"+
		"\2\2\u00fb\u00de\3\2\2\2\u00fb\u00df\3\2\2\2\u00fb\u00e0\3\2\2\2\u00fb"+
		"\u00e1\3\2\2\2\u00fb\u00e2\3\2\2\2\u00fb\u00e3\3\2\2\2\u00fb\u00e4\3\2"+
		"\2\2\u00fb\u00e5\3\2\2\2\u00fb\u00e6\3\2\2\2\u00fb\u00e7\3\2\2\2\u00fb"+
		"\u00e8\3\2\2\2\u00fb\u00e9\3\2\2\2\u00fb\u00ea\3\2\2\2\u00fb\u00eb\3\2"+
		"\2\2\u00fb\u00ec\3\2\2\2\u00fb\u00ed\3\2\2\2\u00fb\u00ee\3\2\2\2\u00fb"+
		"\u00ef\3\2\2\2\u00fb\u00f0\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f2\3\2"+
		"\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb"+
		"\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fa\3\2\2\2\u00fc\t\3\2\2\2\u00fd\u00fe\7!\2\2\u00fe\u0102"+
		"\7\u0085\2\2\u00ff\u0100\5\u0090I\2\u0100\u0101\7\5\2\2\u0101\u0103\3"+
		"\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u010d\5\u0092J\2\u0105\u0106\7|\2\2\u0106\u0107\7\u0089\2\2\u0107\u010e"+
		"\5\u0096L\2\u0108\u010a\7\36\2\2\u0109\u010b\7\61\2\2\u010a\u0109\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\5L\'\2\u010d"+
		"\u0105\3\2\2\2\u010d\u0108\3\2\2\2\u010e\13\3\2\2\2\u010f\u0116\7\"\2"+
		"\2\u0110\u0117\5\u0090I\2\u0111\u0117\5\u0094K\2\u0112\u0113\5\u0090I"+
		"\2\u0113\u0114\7\5\2\2\u0114\u0115\5\u0094K\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0110\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\r\3\2\2\2\u0118\u011a\7&\2\2\u0119\u011b\7:\2\2\u011a\u0119"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5T+\2\u011d"+
		"\u011e\7$\2\2\u011e\u011f\5\u0090I\2\u011f\17\3\2\2\2\u0120\u0122\7)\2"+
		"\2\u0121\u0123\t\2\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0128"+
		"\3\2\2\2\u0124\u0126\7\u008a\2\2\u0125\u0127\5\u00aeX\2\u0126\u0125\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0124\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\21\3\2\2\2\u012a\u012f\t\3\2\2\u012b\u012d\7\u008a"+
		"\2\2\u012c\u012e\5\u00aeX\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u0130\3\2\2\2\u0130\23\3\2\2"+
		"\2\u0131\u0133\7\u0096\2\2\u0132\u0134\7w\2\2\u0133\u0132\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013a\5f\64\2\u0136\u0137\7\b"+
		"\2\2\u0137\u0139\5f\64\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u0131\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0149\5r:\2\u0140\u0142\7\u008c\2\2\u0141\u0143\7 \2\2\u0142\u0141\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\u0147\3\2\2\2\u0144\u0147\7]\2\2\u0145"+
		"\u0147\7G\2\2\u0146\u0140\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u014a\5r:\2\u0149\u0146\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0157\3\2\2\2\u014d"+
		"\u014e\7p\2\2\u014e\u014f\7+\2\2\u014f\u0154\5b\62\2\u0150\u0151\7\b\2"+
		"\2\u0151\u0153\5b\62\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u014d\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015f\3\2\2\2\u0159\u015a\7e"+
		"\2\2\u015a\u015d\5T+\2\u015b\u015c\t\4\2\2\u015c\u015e\5T+\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0159\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\25\3\2\2\2\u0161\u0163\7\65\2\2\u0162\u0164\7\u008d"+
		"\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0169\7W\2\2\u0166\u0167\7S\2\2\u0167\u0168\7i\2\2\u0168\u016a\7I\2\2"+
		"\u0169\u0166\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016e\3\2\2\2\u016b\u016c"+
		"\5\u0090I\2\u016c\u016d\7\5\2\2\u016d\u016f\3\2\2\2\u016e\u016b\3\2\2"+
		"\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5\u00a0Q\2\u0171"+
		"\u0172\7n\2\2\u0172\u0173\5\u0092J\2\u0173\u0174\7\6\2\2\u0174\u0179\5"+
		"Z.\2\u0175\u0176\7\b\2\2\u0176\u0178\5Z.\2\u0177\u0175\3\2\2\2\u0178\u017b"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u017e\7\7\2\2\u017d\u017f\5&\24\2\u017e\u017d\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f\27\3\2\2\2\u0180\u0181\5\u009aN\2\u0181"+
		"\u0182\7\u0084\2\2\u0182\u0183\7\6\2\2\u0183\u0184\7\u0081\2\2\u0184\u0187"+
		"\7\6\2\2\u0185\u0188\5L\'\2\u0186\u0188\5\30\r\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u018d\3\2\2\2\u0189\u018a\7\b\2\2\u018a\u018c\5L"+
		"\'\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0194\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7\b"+
		"\2\2\u0191\u0193\5\30\r\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0197\u0198\7\3\2\2\u0198\31\3\2\2\2\u0199\u019b\7\65\2\2\u019a\u019c"+
		"\t\5\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u01a1\7\u0085\2\2\u019e\u019f\7S\2\2\u019f\u01a0\7i\2\2\u01a0\u01a2\7"+
		"I\2\2\u01a1\u019e\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a6\3\2\2\2\u01a3"+
		"\u01a4\5\u0090I\2\u01a4\u01a5\7\5\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a3"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ca\5\u0092J"+
		"\2\u01a9\u01ac\7\6\2\2\u01aa\u01ad\5L\'\2\u01ab\u01ad\5\30\r\2\u01ac\u01aa"+
		"\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b2\3\2\2\2\u01ae\u01af\7\b\2\2\u01af"+
		"\u01b1\5L\'\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b9\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5"+
		"\u01b6\7\b\2\2\u01b6\u01b8\5\30\r\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\3"+
		"\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01c0\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01bd\7\b\2\2\u01bd\u01bf\5\\/\2\u01be\u01bc\3\2"+
		"\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\7\7\2\2\u01c4\u01c5\7\u0097"+
		"\2\2\u01c5\u01c7\7\u009a\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01cb\3\2\2\2\u01c8\u01c9\7$\2\2\u01c9\u01cb\5B\"\2\u01ca\u01a9\3\2\2"+
		"\2\u01ca\u01c8\3\2\2\2\u01cb\33\3\2\2\2\u01cc\u01ce\7\65\2\2\u01cd\u01cf"+
		"\t\5\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d4\7\u008b\2\2\u01d1\u01d2\7S\2\2\u01d2\u01d3\7i\2\2\u01d3\u01d5\7"+
		"I\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d9\3\2\2\2\u01d6"+
		"\u01d7\5\u0090I\2\u01d7\u01d8\7\5\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d6"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01e0\5\u00a2R"+
		"\2\u01dc\u01e1\7(\2\2\u01dd\u01e1\7\37\2\2\u01de\u01df\7\\\2\2\u01df\u01e1"+
		"\7l\2\2\u01e0\u01dc\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01f0\3\2\2\2\u01e2\u01f1\7>\2\2\u01e3\u01f1\7[\2"+
		"\2\u01e4\u01ee\7\u008e\2\2\u01e5\u01e6\7l\2\2\u01e6\u01eb\5\u0098M\2\u01e7"+
		"\u01e8\7\b\2\2\u01e8\u01ea\5\u0098M\2\u01e9\u01e7\3\2\2\2\u01ea\u01ed"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01e5\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2"+
		"\2\2\u01f0\u01e2\3\2\2\2\u01f0\u01e3\3\2\2\2\u01f0\u01e4\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f6\7n\2\2\u01f3\u01f4\5\u0090I\2\u01f4\u01f5\7"+
		"\5\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01fc\5\u0092J\2\u01f9\u01fa\7L\2\2\u01fa\u01fb\7"+
		"C\2\2\u01fb\u01fd\7\u0081\2\2\u01fc\u01f9\3\2\2\2\u01fc\u01fd\3\2\2\2"+
		"\u01fd\u0200\3\2\2\2\u01fe\u01ff\7\u0094\2\2\u01ff\u0201\5T+\2\u0200\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u020b\7)\2\2\u0203"+
		"\u0208\5F$\2\u0204\u0208\5\64\33\2\u0205\u0208\5\"\22\2\u0206\u0208\5"+
		"B\"\2\u0207\u0203\3\2\2\2\u0207\u0204\3\2\2\2\u0207\u0205\3\2\2\2\u0207"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\7\4\2\2\u020a\u020c\3\2"+
		"\2\2\u020b\u0207\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\7E\2\2\u0210\35\3\2\2\2"+
		"\u0211\u0213\7\65\2\2\u0212\u0214\t\5\2\2\u0213\u0212\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0219\7\u0092\2\2\u0216\u0217\7S\2"+
		"\2\u0217\u0218\7i\2\2\u0218\u021a\7I\2\2\u0219\u0216\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021e\3\2\2\2\u021b\u021c\5\u0090I\2\u021c\u021d\7\5\2"+
		"\2\u021d\u021f\3\2\2\2\u021e\u021b\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0221\5\u00a4S\2\u0221\u0222\7$\2\2\u0222\u0223\5B\"\2"+
		"\u0223\37\3\2\2\2\u0224\u0225\7\65\2\2\u0225\u0226\7\u0093\2\2\u0226\u022a"+
		"\7\u0085\2\2\u0227\u0228\7S\2\2\u0228\u0229\7i\2\2\u0229\u022b\7I\2\2"+
		"\u022a\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022f\3\2\2\2\u022c\u022d"+
		"\5\u0090I\2\u022d\u022e\7\5\2\2\u022e\u0230\3\2\2\2\u022f\u022c\3\2\2"+
		"\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\5\u0092J\2\u0232"+
		"\u0233\7\u008f\2\2\u0233\u023f\5\u00a6T\2\u0234\u0235\7\6\2\2\u0235\u023a"+
		"\5\u0080A\2\u0236\u0237\7\b\2\2\u0237\u0239\5\u0080A\2\u0238\u0236\3\2"+
		"\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\7\7\2\2\u023e\u0240\3\2"+
		"\2\2\u023f\u0234\3\2\2\2\u023f\u0240\3\2\2\2\u0240!\3\2\2\2\u0241\u0243"+
		"\5^\60\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0245\7>\2\2\u0245\u0246\7N\2\2\u0246\u0248\5`\61\2\u0247\u0249\5&\24"+
		"\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249#\3\2\2\2\u024a\u024c"+
		"\5^\60\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024e\7>\2\2\u024e\u024f\7N\2\2\u024f\u0251\5`\61\2\u0250\u0252\5&\24"+
		"\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0265\3\2\2\2\u0253\u0254"+
		"\7p\2\2\u0254\u0255\7+\2\2\u0255\u025a\5b\62\2\u0256\u0257\7\b\2\2\u0257"+
		"\u0259\5b\62\2\u0258\u0256\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2"+
		"\2\2\u025a\u025b\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025d"+
		"\u0253\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\7e"+
		"\2\2\u0260\u0263\5T+\2\u0261\u0262\t\4\2\2\u0262\u0264\5T+\2\u0263\u0261"+
		"\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u025d\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266%\3\2\2\2\u0267\u0268\7\u0095\2\2\u0268\u0269\5T+"+
		"\2\u0269\'\3\2\2\2\u026a\u026c\7@\2\2\u026b\u026d\7:\2\2\u026c\u026b\3"+
		"\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\5\u0090I\2"+
		"\u026f)\3\2\2\2\u0270\u0271\7B\2\2\u0271\u0274\7W\2\2\u0272\u0273\7S\2"+
		"\2\u0273\u0275\7I\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0279"+
		"\3\2\2\2\u0276\u0277\5\u0090I\2\u0277\u0278\7\5\2\2\u0278\u027a\3\2\2"+
		"\2\u0279\u0276\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c"+
		"\5\u00a0Q\2\u027c+\3\2\2\2\u027d\u027e\7B\2\2\u027e\u0281\7\u0085\2\2"+
		"\u027f\u0280\7S\2\2\u0280\u0282\7I\2\2\u0281\u027f\3\2\2\2\u0281\u0282"+
		"\3\2\2\2\u0282\u0286\3\2\2\2\u0283\u0284\5\u0090I\2\u0284\u0285\7\5\2"+
		"\2\u0285\u0287\3\2\2\2\u0286\u0283\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288"+
		"\3\2\2\2\u0288\u0289\5\u0092J\2\u0289-\3\2\2\2\u028a\u028b\7B\2\2\u028b"+
		"\u028e\7\u008b\2\2\u028c\u028d\7S\2\2\u028d\u028f\7I\2\2\u028e\u028c\3"+
		"\2\2\2\u028e\u028f\3\2\2\2\u028f\u0293\3\2\2\2\u0290\u0291\5\u0090I\2"+
		"\u0291\u0292\7\5\2\2\u0292\u0294\3\2\2\2\u0293\u0290\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\5\u00a2R\2\u0296/\3\2\2\2\u0297"+
		"\u0298\7B\2\2\u0298\u029b\7\u0092\2\2\u0299\u029a\7S\2\2\u029a\u029c\7"+
		"I\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a0\3\2\2\2\u029d"+
		"\u029e\5\u0090I\2\u029e\u029f\7\5\2\2\u029f\u02a1\3\2\2\2\u02a0\u029d"+
		"\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\5\u00a4S"+
		"\2\u02a3\61\3\2\2\2\u02a4\u02a6\7\u0096\2\2\u02a5\u02a7\7w\2\2\u02a6\u02a5"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02ad\5f\64\2\u02a9"+
		"\u02aa\7\b\2\2\u02aa\u02ac\5f\64\2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2"+
		"\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af"+
		"\u02ad\3\2\2\2\u02b0\u02a4\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2"+
		"\2\2\u02b2\u02b8\5r:\2\u02b3\u02b4\5t;\2\u02b4\u02b5\5r:\2\u02b5\u02b7"+
		"\3\2\2\2\u02b6\u02b3\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8"+
		"\u02b9\3\2\2\2\u02b9\u02c5\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc\7p"+
		"\2\2\u02bc\u02bd\7+\2\2\u02bd\u02c2\5b\62\2\u02be\u02bf\7\b\2\2\u02bf"+
		"\u02c1\5b\62\2\u02c0\u02be\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2"+
		"\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5"+
		"\u02bb\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02cd\3\2\2\2\u02c7\u02c8\7e"+
		"\2\2\u02c8\u02cb\5T+\2\u02c9\u02ca\t\4\2\2\u02ca\u02cc\5T+\2\u02cb\u02c9"+
		"\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02c7\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02ce\63\3\2\2\2\u02cf\u02d1\5^\60\2\u02d0\u02cf\3\2\2"+
		"\2\u02d0\u02d1\3\2\2\2\u02d1\u02e3\3\2\2\2\u02d2\u02e4\7[\2\2\u02d3\u02e4"+
		"\7}\2\2\u02d4\u02d5\7[\2\2\u02d5\u02d6\7o\2\2\u02d6\u02e4\7}\2\2\u02d7"+
		"\u02d8\7[\2\2\u02d8\u02d9\7o\2\2\u02d9\u02e4\7\u0080\2\2\u02da\u02db\7"+
		"[\2\2\u02db\u02dc\7o\2\2\u02dc\u02e4\7\34\2\2\u02dd\u02de\7[\2\2\u02de"+
		"\u02df\7o\2\2\u02df\u02e4\7K\2\2\u02e0\u02e1\7[\2\2\u02e1\u02e2\7o\2\2"+
		"\u02e2\u02e4\7T\2\2\u02e3\u02d2\3\2\2\2\u02e3\u02d3\3\2\2\2\u02e3\u02d4"+
		"\3\2\2\2\u02e3\u02d7\3\2\2\2\u02e3\u02da\3\2\2\2\u02e3\u02dd\3\2\2\2\u02e3"+
		"\u02e0\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e9\7^\2\2\u02e6\u02e7\5\u0090"+
		"I\2\u02e7\u02e8\7\5\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e6\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02fd\5\u0092J\2\u02ec\u02ef"+
		"\7\6\2\2\u02ed\u02f0\5\u0098M\2\u02ee\u02f0\5\u0086D\2\u02ef\u02ed\3\2"+
		"\2\2\u02ef\u02ee\3\2\2\2\u02f0\u02f8\3\2\2\2\u02f1\u02f4\7\b\2\2\u02f2"+
		"\u02f5\5\u0098M\2\u02f3\u02f5\5\u0086D\2\u02f4\u02f2\3\2\2\2\u02f4\u02f3"+
		"\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f1\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8"+
		"\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02f8\3\2"+
		"\2\2\u02fb\u02fc\7\7\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02ec\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u031e\3\2\2\2\u02ff\u0300\7\u0091\2\2\u0300\u0301"+
		"\7\6\2\2\u0301\u0306\5T+\2\u0302\u0303\7\b\2\2\u0303\u0305\5T+\2\u0304"+
		"\u0302\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2"+
		"\2\2\u0307\u0309\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u0318\7\7\2\2\u030a"+
		"\u030b\7\b\2\2\u030b\u030c\7\6\2\2\u030c\u0311\5T+\2\u030d\u030e\7\b\2"+
		"\2\u030e\u0310\5T+\2\u030f\u030d\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313\u0311\3\2\2\2\u0314"+
		"\u0315\7\7\2\2\u0315\u0317\3\2\2\2\u0316\u030a\3\2\2\2\u0317\u031a\3\2"+
		"\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031f\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031b\u031f\5B\"\2\u031c\u031d\7;\2\2\u031d\u031f\7\u0091"+
		"\2\2\u031e\u02ff\3\2\2\2\u031e\u031b\3\2\2\2\u031e\u031c\3\2\2\2\u031f"+
		"\65\3\2\2\2\u0320\u0324\7s\2\2\u0321\u0322\5\u0090I\2\u0322\u0323\7\5"+
		"\2\2\u0323\u0325\3\2\2\2\u0324\u0321\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u032d\5\u00a8U\2\u0327\u0328\7\t\2\2\u0328\u032e"+
		"\5d\63\2\u0329\u032a\7\6\2\2\u032a\u032b\5d\63\2\u032b\u032c\7\7\2\2\u032c"+
		"\u032e\3\2\2\2\u032d\u0327\3\2\2\2\u032d\u0329\3\2\2\2\u032d\u032e\3\2"+
		"\2\2\u032e\67\3\2\2\2\u032f\u033a\7z\2\2\u0330\u033b\5\u009cO\2\u0331"+
		"\u0332\5\u0090I\2\u0332\u0333\7\5\2\2\u0333\u0335\3\2\2\2\u0334\u0331"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0339\5\u0092J"+
		"\2\u0337\u0339\5\u00a0Q\2\u0338\u0336\3\2\2\2\u0338\u0337\3\2\2\2\u0339"+
		"\u033b\3\2\2\2\u033a\u0330\3\2\2\2\u033a\u0334\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033b9\3\2\2\2\u033c\u033e\7{\2\2\u033d\u033f\7\u0082\2\2\u033e\u033d"+
		"\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\5\u00aaV"+
		"\2\u0341;\3\2\2\2\u0342\u0347\7\u0080\2\2\u0343\u0345\7\u008a\2\2\u0344"+
		"\u0346\5\u00aeX\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348"+
		"\3\2\2\2\u0347\u0343\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034e\3\2\2\2\u0349"+
		"\u034b\7\u0089\2\2\u034a\u034c\7\u0082\2\2\u034b\u034a\3\2\2\2\u034b\u034c"+
		"\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\5\u00aaV\2\u034e\u0349\3\2\2"+
		"\2\u034e\u034f\3\2\2\2\u034f=\3\2\2\2\u0350\u0351\7\u0082\2\2\u0351\u0352"+
		"\5\u00aaV\2\u0352?\3\2\2\2\u0353\u0355\7\u0096\2\2\u0354\u0356\7w\2\2"+
		"\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u035c"+
		"\5f\64\2\u0358\u0359\7\b\2\2\u0359\u035b\5f\64\2\u035a\u0358\3\2\2\2\u035b"+
		"\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0360\3\2"+
		"\2\2\u035e\u035c\3\2\2\2\u035f\u0353\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u036c\5r:\2\u0362\u0363\7p\2\2\u0363\u0364\7+\2\2"+
		"\u0364\u0369\5b\62\2\u0365\u0366\7\b\2\2\u0366\u0368\5b\62\2\u0367\u0365"+
		"\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u0362\3\2\2\2\u036c\u036d\3\2"+
		"\2\2\u036d\u0374\3\2\2\2\u036e\u036f\7e\2\2\u036f\u0372\5T+\2\u0370\u0371"+
		"\t\4\2\2\u0371\u0373\5T+\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373"+
		"\u0375\3\2\2\2\u0374\u036e\3\2\2\2\u0374\u0375\3\2\2\2\u0375A\3\2\2\2"+
		"\u0376\u0378\7\u0096\2\2\u0377\u0379\7w\2\2\u0378\u0377\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037f\5f\64\2\u037b\u037c\7\b"+
		"\2\2\u037c\u037e\5f\64\2\u037d\u037b\3\2\2\2\u037e\u0381\3\2\2\2\u037f"+
		"\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2"+
		"\2\2\u0382\u0376\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\3\2\2\2\u0384"+
		"\u038a\5D#\2\u0385\u0386\5t;\2\u0386\u0387\5D#\2\u0387\u0389\3\2\2\2\u0388"+
		"\u0385\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2"+
		"\2\2\u038b\u0397\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u038e\7p\2\2\u038e"+
		"\u038f\7+\2\2\u038f\u0394\5b\62\2\u0390\u0391\7\b\2\2\u0391\u0393\5b\62"+
		"\2\u0392\u0390\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2\2\u0394\u0395"+
		"\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0397\u038d\3\2\2\2\u0397"+
		"\u0398\3\2\2\2\u0398\u039f\3\2\2\2\u0399\u039a\7e\2\2\u039a\u039d\5T+"+
		"\2\u039b\u039c\t\4\2\2\u039c\u039e\5T+\2\u039d\u039b\3\2\2\2\u039d\u039e"+
		"\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u0399\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"C\3\2\2\2\u03a1\u03a3\7\u0083\2\2\u03a2\u03a4\t\6\2\2\u03a3\u03a2\3\2"+
		"\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03aa\5h\65\2\u03a6"+
		"\u03a7\7\b\2\2\u03a7\u03a9\5h\65\2\u03a8\u03a6\3\2\2\2\u03a9\u03ac\3\2"+
		"\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03b9\3\2\2\2\u03ac"+
		"\u03aa\3\2\2\2\u03ad\u03b7\7N\2\2\u03ae\u03b3\5j\66\2\u03af\u03b0\7\b"+
		"\2\2\u03b0\u03b2\5j\66\2\u03b1\u03af\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3"+
		"\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b8\3\2\2\2\u03b5\u03b3\3\2"+
		"\2\2\u03b6\u03b8\5l\67\2\u03b7\u03ae\3\2\2\2\u03b7\u03b6\3\2\2\2\u03b8"+
		"\u03ba\3\2\2\2\u03b9\u03ad\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\3\2"+
		"\2\2\u03bb\u03bd\5&\24\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03cc\3\2\2\2\u03be\u03bf\7Q\2\2\u03bf\u03c0\7+\2\2\u03c0\u03c5\5T+\2"+
		"\u03c1\u03c2\7\b\2\2\u03c2\u03c4\5T+\2\u03c3\u03c1\3\2\2\2\u03c4\u03c7"+
		"\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03ca\3\2\2\2\u03c7"+
		"\u03c5\3\2\2\2\u03c8\u03c9\7R\2\2\u03c9\u03cb\5T+\2\u03ca\u03c8\3\2\2"+
		"\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03be\3\2\2\2\u03cc\u03cd"+
		"\3\2\2\2\u03cd\u03eb\3\2\2\2\u03ce\u03cf\7\u0091\2\2\u03cf\u03d0\7\6\2"+
		"\2\u03d0\u03d5\5T+\2\u03d1\u03d2\7\b\2\2\u03d2\u03d4\5T+\2\u03d3\u03d1"+
		"\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u03d8\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03e7\7\7\2\2\u03d9\u03da\7\b"+
		"\2\2\u03da\u03db\7\6\2\2\u03db\u03e0\5T+\2\u03dc\u03dd\7\b\2\2\u03dd\u03df"+
		"\5T+\2\u03de\u03dc\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3\u03e4\7\7"+
		"\2\2\u03e4\u03e6\3\2\2\2\u03e5\u03d9\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2"+
		"\2\2\u03ea\u03a1\3\2\2\2\u03ea\u03ce\3\2\2\2\u03ebE\3\2\2\2\u03ec\u03ee"+
		"\5^\60\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u03fa\7\u008e\2\2\u03f0\u03f1\7o\2\2\u03f1\u03fb\7\u0080\2\2\u03f2\u03f3"+
		"\7o\2\2\u03f3\u03fb\7\34\2\2\u03f4\u03f5\7o\2\2\u03f5\u03fb\7}\2\2\u03f6"+
		"\u03f7\7o\2\2\u03f7\u03fb\7K\2\2\u03f8\u03f9\7o\2\2\u03f9\u03fb\7T\2\2"+
		"\u03fa\u03f0\3\2\2\2\u03fa\u03f2\3\2\2\2\u03fa\u03f4\3\2\2\2\u03fa\u03f6"+
		"\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fd\5`\61\2\u03fd\u0400\7\u0084\2\2\u03fe\u0401\5\u0098M\2\u03ff\u0401"+
		"\5\u0086D\2\u0400\u03fe\3\2\2\2\u0400\u03ff\3\2\2\2\u0401\u0402\3\2\2"+
		"\2\u0402\u0403\7\t\2\2\u0403\u040b\5T+\2\u0404\u0405\7\b\2\2\u0405\u0406"+
		"\5\u0098M\2\u0406\u0407\7\t\2\2\u0407\u0408\5T+\2\u0408\u040a\3\2\2\2"+
		"\u0409\u0404\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c"+
		"\3\2\2\2\u040c\u0415\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u040f\7\b\2\2\u040f"+
		"\u0410\5\u0086D\2\u0410\u0411\7\t\2\2\u0411\u0412\5T+\2\u0412\u0414\3"+
		"\2\2\2\u0413\u040e\3\2\2\2\u0414\u0417\3\2\2\2\u0415\u0413\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0418\u041a\5&"+
		"\24\2\u0419\u0418\3\2\2\2\u0419\u041a\3\2\2\2\u041aG\3\2\2\2\u041b\u041d"+
		"\5^\60\2\u041c\u041b\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e"+
		"\u0429\7\u008e\2\2\u041f\u0420\7o\2\2\u0420\u042a\7\u0080\2\2\u0421\u0422"+
		"\7o\2\2\u0422\u042a\7\34\2\2\u0423\u0424\7o\2\2\u0424\u042a\7}\2\2\u0425"+
		"\u0426\7o\2\2\u0426\u042a\7K\2\2\u0427\u0428\7o\2\2\u0428\u042a\7T\2\2"+
		"\u0429\u041f\3\2\2\2\u0429\u0421\3\2\2\2\u0429\u0423\3\2\2\2\u0429\u0425"+
		"\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2\2\2\u042b"+
		"\u042c\5`\61\2\u042c\u042f\7\u0084\2\2\u042d\u0430\5\u0098M\2\u042e\u0430"+
		"\5\u0086D\2\u042f\u042d\3\2\2\2\u042f\u042e\3\2\2\2\u0430\u0431\3\2\2"+
		"\2\u0431\u0432\7\t\2\2\u0432\u043a\5T+\2\u0433\u0434\7\b\2\2\u0434\u0435"+
		"\5\u0098M\2\u0435\u0436\7\t\2\2\u0436\u0437\5T+\2\u0437\u0439\3\2\2\2"+
		"\u0438\u0433\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b"+
		"\3\2\2\2\u043b\u0444\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u043e\7\b\2\2\u043e"+
		"\u043f\5\u0086D\2\u043f\u0440\7\t\2\2\u0440\u0441\5T+\2\u0441\u0443\3"+
		"\2\2\2\u0442\u043d\3\2\2\2\u0443\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0444"+
		"\u0445\3\2\2\2\u0445\u0448\3\2\2\2\u0446\u0444\3\2\2\2\u0447\u0449\5&"+
		"\24\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u045c\3\2\2\2\u044a"+
		"\u044b\7p\2\2\u044b\u044c\7+\2\2\u044c\u0451\5b\62\2\u044d\u044e\7\b\2"+
		"\2\u044e\u0450\5b\62\2\u044f\u044d\3\2\2\2\u0450\u0453\3\2\2\2\u0451\u044f"+
		"\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0454"+
		"\u044a\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\7e"+
		"\2\2\u0457\u045a\5T+\2\u0458\u0459\t\4\2\2\u0459\u045b\5T+\2\u045a\u0458"+
		"\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045d\3\2\2\2\u045c\u0454\3\2\2\2\u045c"+
		"\u045d\3\2\2\2\u045dI\3\2\2\2\u045e\u045f\7\u0090\2\2\u045fK\3\2\2\2\u0460"+
		"\u0462\5\u0098M\2\u0461\u0463\5N(\2\u0462\u0461\3\2\2\2\u0462\u0463\3"+
		"\2\2\2\u0463\u0467\3\2\2\2\u0464\u0466\5P)\2\u0465\u0464\3\2\2\2\u0466"+
		"\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468M\3\2\2\2"+
		"\u0469\u0467\3\2\2\2\u046a\u046c\5\u008cG\2\u046b\u046a\3\2\2\2\u046c"+
		"\u046d\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0479\3\2"+
		"\2\2\u046f\u0470\7\6\2\2\u0470\u0471\5x=\2\u0471\u0472\7\7\2\2\u0472\u047a"+
		"\3\2\2\2\u0473\u0474\7\6\2\2\u0474\u0475\5x=\2\u0475\u0476\7\b\2\2\u0476"+
		"\u0477\5x=\2\u0477\u0478\7\7\2\2\u0478\u047a\3\2\2\2\u0479\u046f\3\2\2"+
		"\2\u0479\u0473\3\2\2\2\u0479\u047a\3\2\2\2\u047aO\3\2\2\2\u047b\u047c"+
		"\7\64\2\2\u047c\u047e\5\u008cG\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2"+
		"\2\u047e\u04a0\3\2\2\2\u047f\u0480\7t\2\2\u0480\u0482\7b\2\2\u0481\u0483"+
		"\t\7\2\2\u0482\u0481\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\3\2\2\2\u0484"+
		"\u0486\5R*\2\u0485\u0487\7\'\2\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2"+
		"\2\u0487\u04a1\3\2\2\2\u0488\u048a\7i\2\2\u0489\u0488\3\2\2\2\u0489\u048a"+
		"\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\7k\2\2\u048c\u04a1\5R*\2\u048d"+
		"\u048e\7\u008d\2\2\u048e\u04a1\5R*\2\u048f\u0490\7/\2\2\u0490\u0491\7"+
		"\6\2\2\u0491\u0492\5T+\2\u0492\u0493\7\7\2\2\u0493\u04a1\3\2\2\2\u0494"+
		"\u049b\7;\2\2\u0495\u049c\5x=\2\u0496\u049c\5z>\2\u0497\u0498\7\6\2\2"+
		"\u0498\u0499\5T+\2\u0499\u049a\7\7\2\2\u049a\u049c\3\2\2\2\u049b\u0495"+
		"\3\2\2\2\u049b\u0496\3\2\2\2\u049b\u0497\3\2\2\2\u049c\u04a1\3\2\2\2\u049d"+
		"\u049e\7\60\2\2\u049e\u04a1\5\u009cO\2\u049f\u04a1\5V,\2\u04a0\u047f\3"+
		"\2\2\2\u04a0\u0489\3\2\2\2\u04a0\u048d\3\2\2\2\u04a0\u048f\3\2\2\2\u04a0"+
		"\u0494\3\2\2\2\u04a0\u049d\3\2\2\2\u04a0\u049f\3\2\2\2\u04a1Q\3\2\2\2"+
		"\u04a2\u04a3\7n\2\2\u04a3\u04a4\7\63\2\2\u04a4\u04a6\t\b\2\2\u04a5\u04a2"+
		"\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6S\3\2\2\2\u04a7\u04a8\b+\1\2\u04a8\u04f8"+
		"\5z>\2\u04a9\u04f8\7\u009c\2\2\u04aa\u04ab\5\u0092J\2\u04ab\u04ac\7\5"+
		"\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04aa\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04b0\3\2\2\2\u04af\u04b1\5\u0098M\2\u04b0\u04af\3\2\2\2\u04b0\u04b1"+
		"\3\2\2\2\u04b1\u04b6\3\2\2\2\u04b2\u04b3\7\5\2\2\u04b3\u04b5\5\u0098M"+
		"\2\u04b4\u04b2\3\2\2\2\u04b5\u04b8\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b6\u04b7"+
		"\3\2\2\2\u04b7\u04f8\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b9\u04ba\5|?\2\u04ba"+
		"\u04bb\5T+\27\u04bb\u04f8\3\2\2\2\u04bc\u04bd\5\u008eH\2\u04bd\u04ca\7"+
		"\6\2\2\u04be\u04c0\7A\2\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u04c6\5T+\2\u04c2\u04c3\7\b\2\2\u04c3\u04c5\5T+\2"+
		"\u04c4\u04c2\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7"+
		"\3\2\2\2\u04c7\u04cb\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04cb\7\n\2\2\u04ca"+
		"\u04bf\3\2\2\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2"+
		"\2\2\u04cc\u04cd\7\7\2\2\u04cd\u04f8\3\2\2\2\u04ce\u04cf\7\6\2\2\u04cf"+
		"\u04d0\5T+\2\u04d0\u04d1\7\7\2\2\u04d1\u04f8\3\2\2\2\u04d2\u04d3\7.\2"+
		"\2\u04d3\u04d4\7\6\2\2\u04d4\u04d5\5T+\2\u04d5\u04d6\7$\2\2\u04d6\u04d7"+
		"\5N(\2\u04d7\u04d8\7\7\2\2\u04d8\u04f8\3\2\2\2\u04d9\u04db\7i\2\2\u04da"+
		"\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04de\7I"+
		"\2\2\u04dd\u04da\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2\2\2\u04df"+
		"\u04e0\7\6\2\2\u04e0\u04e1\5B\"\2\u04e1\u04e2\7\7\2\2\u04e2\u04f8\3\2"+
		"\2\2\u04e3\u04e5\7-\2\2\u04e4\u04e6\5T+\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6"+
		"\3\2\2\2\u04e6\u04ec\3\2\2\2\u04e7\u04e8\7\u0094\2\2\u04e8\u04e9\5T+\2"+
		"\u04e9\u04ea\7\u0088\2\2\u04ea\u04eb\5T+\2\u04eb\u04ed\3\2\2\2\u04ec\u04e7"+
		"\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u04f2\3\2\2\2\u04f0\u04f1\7D\2\2\u04f1\u04f3\5T+\2\u04f2\u04f0\3\2\2"+
		"\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\7E\2\2\u04f5\u04f8"+
		"\3\2\2\2\u04f6\u04f8\5X-\2\u04f7\u04a7\3\2\2\2\u04f7\u04a9\3\2\2\2\u04f7"+
		"\u04ad\3\2\2\2\u04f7\u04b9\3\2\2\2\u04f7\u04bc\3\2\2\2\u04f7\u04ce\3\2"+
		"\2\2\u04f7\u04d2\3\2\2\2\u04f7\u04dd\3\2\2\2\u04f7\u04e3\3\2\2\2\u04f7"+
		"\u04f6\3\2\2\2\u04f8\u055d\3\2\2\2\u04f9\u04fa\f\26\2\2\u04fa\u04fb\7"+
		"\16\2\2\u04fb\u055c\5T+\27\u04fc\u04fd\f\25\2\2\u04fd\u04fe\t\t\2\2\u04fe"+
		"\u055c\5T+\26\u04ff\u0500\f\24\2\2\u0500\u0501\t\n\2\2\u0501\u055c\5T"+
		"+\25\u0502\u0503\f\23\2\2\u0503\u0504\t\13\2\2\u0504\u055c\5T+\24\u0505"+
		"\u0506\f\22\2\2\u0506\u0507\t\f\2\2\u0507\u055c\5T+\23\u0508\u0515\f\21"+
		"\2\2\u0509\u0516\7\t\2\2\u050a\u0516\7\31\2\2\u050b\u0516\7\32\2\2\u050c"+
		"\u0516\7\33\2\2\u050d\u0516\7_\2\2\u050e\u050f\7_\2\2\u050f\u0516\7i\2"+
		"\2\u0510\u0516\7V\2\2\u0511\u0516\7d\2\2\u0512\u0516\7P\2\2\u0513\u0516"+
		"\7f\2\2\u0514\u0516\7y\2\2\u0515\u0509\3\2\2\2\u0515\u050a\3\2\2\2\u0515"+
		"\u050b\3\2\2\2\u0515\u050c\3\2\2\2\u0515\u050d\3\2\2\2\u0515\u050e\3\2"+
		"\2\2\u0515\u0510\3\2\2\2\u0515\u0511\3\2\2\2\u0515\u0512\3\2\2\2\u0515"+
		"\u0513\3\2\2\2\u0515\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u055c\5T"+
		"+\22\u0518\u0519\f\20\2\2\u0519\u051a\7#\2\2\u051a\u055c\5T+\21\u051b"+
		"\u051c\f\17\2\2\u051c\u051d\7o\2\2\u051d\u055c\5T+\20\u051e\u051f\f\b"+
		"\2\2\u051f\u0521\7_\2\2\u0520\u0522\7i\2\2\u0521\u0520\3\2\2\2\u0521\u0522"+
		"\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u055c\5T+\t\u0524\u0526\f\7\2\2\u0525"+
		"\u0527\7i\2\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2"+
		"\2\2\u0528\u0529\7*\2\2\u0529\u052a\5T+\2\u052a\u052b\7#\2\2\u052b\u052c"+
		"\5T+\b\u052c\u055c\3\2\2\2\u052d\u052e\f\13\2\2\u052e\u052f\7\60\2\2\u052f"+
		"\u055c\5\u009cO\2\u0530\u0532\f\n\2\2\u0531\u0533\7i\2\2\u0532\u0531\3"+
		"\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\t\r\2\2\u0535"+
		"\u0538\5T+\2\u0536\u0537\7F\2\2\u0537\u0539\5T+\2\u0538\u0536\3\2\2\2"+
		"\u0538\u0539\3\2\2\2\u0539\u055c\3\2\2\2\u053a\u053f\f\t\2\2\u053b\u0540"+
		"\7`\2\2\u053c\u0540\7j\2\2\u053d\u053e\7i\2\2\u053e\u0540\7k\2\2\u053f"+
		"\u053b\3\2\2\2\u053f\u053c\3\2\2\2\u053f\u053d\3\2\2\2\u0540\u055c\3\2"+
		"\2\2\u0541\u0543\f\6\2\2\u0542\u0544\7i\2\2\u0543\u0542\3\2\2\2\u0543"+
		"\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0559\7V\2\2\u0546\u0550\7\6"+
		"\2\2\u0547\u0551\5B\"\2\u0548\u054d\5T+\2\u0549\u054a\7\b\2\2\u054a\u054c"+
		"\5T+\2\u054b\u0549\3\2\2\2\u054c\u054f\3\2\2\2\u054d\u054b\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u0551\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u0547\3\2"+
		"\2\2\u0550\u0548\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552"+
		"\u055a\7\7\2\2\u0553\u0554\5\u0090I\2\u0554\u0555\7\5\2\2\u0555\u0557"+
		"\3\2\2\2\u0556\u0553\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558\3\2\2\2\u0558"+
		"\u055a\5\u0092J\2\u0559\u0546\3\2\2\2\u0559\u0556\3\2\2\2\u055a\u055c"+
		"\3\2\2\2\u055b\u04f9\3\2\2\2\u055b\u04fc\3\2\2\2\u055b\u04ff\3\2\2\2\u055b"+
		"\u0502\3\2\2\2\u055b\u0505\3\2\2\2\u055b\u0508\3\2\2\2\u055b\u0518\3\2"+
		"\2\2\u055b\u051b\3\2\2\2\u055b\u051e\3\2\2\2\u055b\u0524\3\2\2\2\u055b"+
		"\u052d\3\2\2\2\u055b\u0530\3\2\2\2\u055b\u053a\3\2\2\2\u055b\u0541\3\2"+
		"\2\2\u055c\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e"+
		"U\3\2\2\2\u055f\u055d\3\2\2\2\u0560\u0561\7x\2\2\u0561\u056d\5\u009eP"+
		"\2\u0562\u0563\7\6\2\2\u0563\u0568\5\u0098M\2\u0564\u0565\7\b\2\2\u0565"+
		"\u0567\5\u0098M\2\u0566\u0564\3\2\2\2\u0567\u056a\3\2\2\2\u0568\u0566"+
		"\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056b\3\2\2\2\u056a\u0568\3\2\2\2\u056b"+
		"\u056c\7\7\2\2\u056c\u056e\3\2\2\2\u056d\u0562\3\2\2\2\u056d\u056e\3\2"+
		"\2\2\u056e\u0581\3\2\2\2\u056f\u0570\7n\2\2\u0570\u0579\t\16\2\2\u0571"+
		"\u0572\7\u0084\2\2\u0572\u057a\7k\2\2\u0573\u0574\7\u0084\2\2\u0574\u057a"+
		"\7;\2\2\u0575\u057a\7,\2\2\u0576\u057a\7~\2\2\u0577\u0578\7h\2\2\u0578"+
		"\u057a\7\35\2\2\u0579\u0571\3\2\2\2\u0579\u0573\3\2\2\2\u0579\u0575\3"+
		"\2\2\2\u0579\u0576\3\2\2\2\u0579\u0577\3\2\2\2\u057a\u057e\3\2\2\2\u057b"+
		"\u057c\7f\2\2\u057c\u057e\5\u008cG\2\u057d\u056f\3\2\2\2\u057d\u057b\3"+
		"\2\2\2\u057e\u0580\3\2\2\2\u057f\u057d\3\2\2\2\u0580\u0583\3\2\2\2\u0581"+
		"\u057f\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u058e\3\2\2\2\u0583\u0581\3\2"+
		"\2\2\u0584\u0586\7i\2\2\u0585\u0584\3\2\2\2\u0585\u0586\3\2\2\2\u0586"+
		"\u0587\3\2\2\2\u0587\u058c\7<\2\2\u0588\u0589\7Y\2\2\u0589\u058d\7=\2"+
		"\2\u058a\u058b\7Y\2\2\u058b\u058d\7U\2\2\u058c\u0588\3\2\2\2\u058c\u058a"+
		"\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058f\3\2\2\2\u058e\u0585\3\2\2\2\u058e"+
		"\u058f\3\2\2\2\u058fW\3\2\2\2\u0590\u0591\7v\2\2\u0591\u0596\7\6\2\2\u0592"+
		"\u0597\7T\2\2\u0593\u0594\t\17\2\2\u0594\u0595\7\b\2\2\u0595\u0597\5~"+
		"@\2\u0596\u0592\3\2\2\2\u0596\u0593\3\2\2\2\u0597\u0598\3\2\2\2\u0598"+
		"\u0599\7\7\2\2\u0599Y\3\2\2\2\u059a\u059d\5\u0098M\2\u059b\u059d\5\u0086"+
		"D\2\u059c\u059a\3\2\2\2\u059c\u059b\3\2\2\2\u059d\u05a0\3\2\2\2\u059e"+
		"\u059f\7\60\2\2\u059f\u05a1\5\u009cO\2\u05a0\u059e\3\2\2\2\u05a0\u05a1"+
		"\3\2\2\2\u05a1\u05a3\3\2\2\2\u05a2\u05a4\t\7\2\2\u05a3\u05a2\3\2\2\2\u05a3"+
		"\u05a4\3\2\2\2\u05a4[\3\2\2\2\u05a5\u05a6\7\64\2\2\u05a6\u05a8\5\u008c"+
		"G\2\u05a7\u05a5\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05d3\3\2\2\2\u05a9"+
		"\u05aa\7t\2\2\u05aa\u05ad\7b\2\2\u05ab\u05ad\7\u008d\2\2\u05ac\u05a9\3"+
		"\2\2\2\u05ac\u05ab\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\7\6\2\2\u05af"+
		"\u05b4\5Z.\2\u05b0\u05b1\7\b\2\2\u05b1\u05b3\5Z.\2\u05b2\u05b0\3\2\2\2"+
		"\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b7"+
		"\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b7\u05b8\7\7\2\2\u05b8\u05b9\5R*\2\u05b9"+
		"\u05d4\3\2\2\2\u05ba\u05bb\7/\2\2\u05bb\u05bc\7\6\2\2\u05bc\u05bd\5T+"+
		"\2\u05bd\u05be\7\7\2\2\u05be\u05d4\3\2\2\2\u05bf\u05c0\7M\2\2\u05c0\u05c1"+
		"\7b\2\2\u05c1\u05c4\7\6\2\2\u05c2\u05c5\5\u0098M\2\u05c3\u05c5\5\u0086"+
		"D\2\u05c4\u05c2\3\2\2\2\u05c4\u05c3\3\2\2\2\u05c5\u05ca\3\2\2\2\u05c6"+
		"\u05c7\7\b\2\2\u05c7\u05c9\5\u0098M\2\u05c8\u05c6\3\2\2\2\u05c9\u05cc"+
		"\3\2\2\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cd\3\2\2\2\u05cc"+
		"\u05ca\3\2\2\2\u05cd\u05ce\7\b\2\2\u05ce\u05cf\5\u0086D\2\u05cf\u05d0"+
		"\3\2\2\2\u05d0\u05d1\7\7\2\2\u05d1\u05d2\5V,\2\u05d2\u05d4\3\2\2\2\u05d3"+
		"\u05ac\3\2\2\2\u05d3\u05ba\3\2\2\2\u05d3\u05bf\3\2\2\2\u05d4]\3\2\2\2"+
		"\u05d5\u05d7\7\u0096\2\2\u05d6\u05d8\7w\2\2\u05d7\u05d6\3\2\2\2\u05d7"+
		"\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05da\5v<\2\u05da\u05db\7$\2"+
		"\2\u05db\u05dc\7\6\2\2\u05dc\u05dd\5B\"\2\u05dd\u05e7\7\7\2\2\u05de\u05df"+
		"\7\b\2\2\u05df\u05e0\5v<\2\u05e0\u05e1\7$\2\2\u05e1\u05e2\7\6\2\2\u05e2"+
		"\u05e3\5B\"\2\u05e3\u05e4\7\7\2\2\u05e4\u05e6\3\2\2\2\u05e5\u05de\3\2"+
		"\2\2\u05e6\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8"+
		"_\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05eb\5\u0090I\2\u05eb\u05ec\7\5\2"+
		"\2\u05ec\u05ee\3\2\2\2\u05ed\u05ea\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef"+
		"\3\2\2\2\u05ef\u05f5\5\u0092J\2\u05f0\u05f1\7X\2\2\u05f1\u05f2\7+\2\2"+
		"\u05f2\u05f6\5\u00a0Q\2\u05f3\u05f4\7i\2\2\u05f4\u05f6\7X\2\2\u05f5\u05f0"+
		"\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6a\3\2\2\2\u05f7"+
		"\u05fa\5T+\2\u05f8\u05f9\7\60\2\2\u05f9\u05fb\5\u009cO\2\u05fa\u05f8\3"+
		"\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fd\3\2\2\2\u05fc\u05fe\t\7\2\2\u05fd"+
		"\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fec\3\2\2\2\u05ff\u0603\5x=\2\u0600"+
		"\u0603\5\u008cG\2\u0601\u0603\7\u009d\2\2\u0602\u05ff\3\2\2\2\u0602\u0600"+
		"\3\2\2\2\u0602\u0601\3\2\2\2\u0603e\3\2\2\2\u0604\u061a\5\u0092J\2\u0605"+
		"\u0608\7\6\2\2\u0606\u0609\5\u0098M\2\u0607\u0609\5\u0086D\2\u0608\u0606"+
		"\3\2\2\2\u0608\u0607\3\2\2\2\u0609\u060e\3\2\2\2\u060a\u060b\7\b\2\2\u060b"+
		"\u060d\5\u0098M\2\u060c\u060a\3\2\2\2\u060d\u0610\3\2\2\2\u060e\u060c"+
		"\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0615\3\2\2\2\u0610\u060e\3\2\2\2\u0611"+
		"\u0612\7\b\2\2\u0612\u0614\5\u0086D\2\u0613\u0611\3\2\2\2\u0614\u0617"+
		"\3\2\2\2\u0615\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618\3\2\2\2\u0617"+
		"\u0615\3\2\2\2\u0618\u0619\7\7\2\2\u0619\u061b\3\2\2\2\u061a\u0605\3\2"+
		"\2\2\u061a\u061b\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d\7$\2\2\u061d"+
		"\u061e\7\6\2\2\u061e\u061f\5B\"\2\u061f\u0620\7\7\2\2\u0620g\3\2\2\2\u0621"+
		"\u0633\7\n\2\2\u0622\u0623\5\u0092J\2\u0623\u0629\7\5\2\2\u0624\u062a"+
		"\7\n\2\2\u0625\u0628\5\u0098M\2\u0626\u0628\5\u0086D\2\u0627\u0625\3\2"+
		"\2\2\u0627\u0626\3\2\2\2\u0628\u062a\3\2\2\2\u0629\u0624\3\2\2\2\u0629"+
		"\u0627\3\2\2\2\u062a\u0633\3\2\2\2\u062b\u0630\5T+\2\u062c\u062e\7$\2"+
		"\2\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0631"+
		"\5\u0082B\2\u0630\u062d\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0633\3\2\2"+
		"\2\u0632\u0621\3\2\2\2\u0632\u0622\3\2\2\2\u0632\u062b\3\2\2\2\u0633i"+
		"\3\2\2\2\u0634\u0639\5\u0092J\2\u0635\u0636\7\5\2\2\u0636\u063a\5\u0098"+
		"M\2\u0637\u0638\7\5\2\2\u0638\u063a\5\u0086D\2\u0639\u0635\3\2\2\2\u0639"+
		"\u0637\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063f\3\2\2\2\u063b\u063d\7$"+
		"\2\2\u063c\u063b\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063e\3\2\2\2\u063e"+
		"\u0640\5\u00acW\2\u063f\u063c\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0646"+
		"\3\2\2\2\u0641\u0642\7X\2\2\u0642\u0643\7+\2\2\u0643\u0647\5\u00a0Q\2"+
		"\u0644\u0645\7i\2\2\u0645\u0647\7X\2\2\u0646\u0641\3\2\2\2\u0646\u0644"+
		"\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0665\3\2\2\2\u0648\u0652\7\6\2\2\u0649"+
		"\u064e\5j\66\2\u064a\u064b\7\b\2\2\u064b\u064d\5j\66\2\u064c\u064a\3\2"+
		"\2\2\u064d\u0650\3\2\2\2\u064e\u064c\3\2\2\2\u064e\u064f\3\2\2\2\u064f"+
		"\u0653\3\2\2\2\u0650\u064e\3\2\2\2\u0651\u0653\5l\67\2\u0652\u0649\3\2"+
		"\2\2\u0652\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0659\7\7\2\2\u0655"+
		"\u0657\7$\2\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658\3\2"+
		"\2\2\u0658\u065a\5\u00acW\2\u0659\u0656\3\2\2\2\u0659\u065a\3\2\2\2\u065a"+
		"\u0665\3\2\2\2\u065b\u065c\7\6\2\2\u065c\u065d\5B\"\2\u065d\u0662\7\7"+
		"\2\2\u065e\u0660\7$\2\2\u065f\u065e\3\2\2\2\u065f\u0660\3\2\2\2\u0660"+
		"\u0661\3\2\2\2\u0661\u0663\5\u00acW\2\u0662\u065f\3\2\2\2\u0662\u0663"+
		"\3\2\2\2\u0663\u0665\3\2\2\2\u0664\u0634\3\2\2\2\u0664\u0648\3\2\2\2\u0664"+
		"\u065b\3\2\2\2\u0665k\3\2\2\2\u0666\u066d\5j\66\2\u0667\u0668\5n8\2\u0668"+
		"\u0669\5j\66\2\u0669\u066a\5p9\2\u066a\u066c\3\2\2\2\u066b\u0667\3\2\2"+
		"\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066em"+
		"\3\2\2\2\u066f\u066d\3\2\2\2\u0670\u067e\7\b\2\2\u0671\u0673\7g\2\2\u0672"+
		"\u0671\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u067a\3\2\2\2\u0674\u0676\7c"+
		"\2\2\u0675\u0677\7q\2\2\u0676\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677"+
		"\u067b\3\2\2\2\u0678\u067b\7Z\2\2\u0679\u067b\7\66\2\2\u067a\u0674\3\2"+
		"\2\2\u067a\u0678\3\2\2\2\u067a\u0679\3\2\2\2\u067a\u067b\3\2\2\2\u067b"+
		"\u067c\3\2\2\2\u067c\u067e\7a\2\2\u067d\u0670\3\2\2\2\u067d\u0672\3\2"+
		"\2\2\u067eo\3\2\2\2\u067f\u0680\7n\2\2\u0680\u0698\5T+\2\u0681\u0682\7"+
		"\u008f\2\2\u0682\u0685\7\6\2\2\u0683\u0686\5\u0086D\2\u0684\u0686\5\u0098"+
		"M\2\u0685\u0683\3\2\2\2\u0685\u0684\3\2\2\2\u0686\u068b\3\2\2\2\u0687"+
		"\u0688\7\b\2\2\u0688\u068a\5\u0098M\2\u0689\u0687\3\2\2\2\u068a\u068d"+
		"\3\2\2\2\u068b\u0689\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u0692\3\2\2\2\u068d"+
		"\u068b\3\2\2\2\u068e\u068f\7\b\2\2\u068f\u0691\5\u0086D\2\u0690\u068e"+
		"\3\2\2\2\u0691\u0694\3\2\2\2\u0692\u0690\3\2\2\2\u0692\u0693\3\2\2\2\u0693"+
		"\u0695\3\2\2\2\u0694\u0692\3\2\2\2\u0695\u0696\7\7\2\2\u0696\u0698\3\2"+
		"\2\2\u0697\u067f\3\2\2\2\u0697\u0681\3\2\2\2\u0697\u0698\3\2\2\2\u0698"+
		"q\3\2\2\2\u0699\u069b\7\u0083\2\2\u069a\u069c\t\6\2\2\u069b\u069a\3\2"+
		"\2\2\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u06a2\5h\65\2\u069e"+
		"\u069f\7\b\2\2\u069f\u06a1\5h\65\2\u06a0\u069e\3\2\2\2\u06a1\u06a4\3\2"+
		"\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06b1\3\2\2\2\u06a4"+
		"\u06a2\3\2\2\2\u06a5\u06af\7N\2\2\u06a6\u06ab\5j\66\2\u06a7\u06a8\7\b"+
		"\2\2\u06a8\u06aa\5j\66\2\u06a9\u06a7\3\2\2\2\u06aa\u06ad\3\2\2\2\u06ab"+
		"\u06a9\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06b0\3\2\2\2\u06ad\u06ab\3\2"+
		"\2\2\u06ae\u06b0\5l\67\2\u06af\u06a6\3\2\2\2\u06af\u06ae\3\2\2\2\u06b0"+
		"\u06b2\3\2\2\2\u06b1\u06a5\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b4\3\2"+
		"\2\2\u06b3\u06b5\5&\24\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5"+
		"\u06c4\3\2\2\2\u06b6\u06b7\7Q\2\2\u06b7\u06b8\7+\2\2\u06b8\u06bd\5T+\2"+
		"\u06b9\u06ba\7\b\2\2\u06ba\u06bc\5T+\2\u06bb\u06b9\3\2\2\2\u06bc\u06bf"+
		"\3\2\2\2\u06bd\u06bb\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c2\3\2\2\2\u06bf"+
		"\u06bd\3\2\2\2\u06c0\u06c1\7R\2\2\u06c1\u06c3\5T+\2\u06c2\u06c0\3\2\2"+
		"\2\u06c2\u06c3\3\2\2\2\u06c3\u06c5\3\2\2\2\u06c4\u06b6\3\2\2\2\u06c4\u06c5"+
		"\3\2\2\2\u06c5\u06e3\3\2\2\2\u06c6\u06c7\7\u0091\2\2\u06c7\u06c8\7\6\2"+
		"\2\u06c8\u06cd\5T+\2\u06c9\u06ca\7\b\2\2\u06ca\u06cc\5T+\2\u06cb\u06c9"+
		"\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd\u06cb\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce"+
		"\u06d0\3\2\2\2\u06cf\u06cd\3\2\2\2\u06d0\u06df\7\7\2\2\u06d1\u06d2\7\b"+
		"\2\2\u06d2\u06d3\7\6\2\2\u06d3\u06d8\5T+\2\u06d4\u06d5\7\b\2\2\u06d5\u06d7"+
		"\5T+\2\u06d6\u06d4\3\2\2\2\u06d7\u06da\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d8"+
		"\u06d9\3\2\2\2\u06d9\u06db\3\2\2\2\u06da\u06d8\3\2\2\2\u06db\u06dc\7\7"+
		"\2\2\u06dc\u06de\3\2\2\2\u06dd\u06d1\3\2\2\2\u06de\u06e1\3\2\2\2\u06df"+
		"\u06dd\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e3\3\2\2\2\u06e1\u06df\3\2"+
		"\2\2\u06e2\u0699\3\2\2\2\u06e2\u06c6\3\2\2\2\u06e3s\3\2\2\2\u06e4\u06ea"+
		"\7\u008c\2\2\u06e5\u06e6\7\u008c\2\2\u06e6\u06ea\7 \2\2\u06e7\u06ea\7"+
		"]\2\2\u06e8\u06ea\7G\2\2\u06e9\u06e4\3\2\2\2\u06e9\u06e5\3\2\2\2\u06e9"+
		"\u06e7\3\2\2\2\u06e9\u06e8\3\2\2\2\u06eau\3\2\2\2\u06eb\u0701\5\u0092"+
		"J\2\u06ec\u06ef\7\6\2\2\u06ed\u06f0\5\u0098M\2\u06ee\u06f0\5\u0086D\2"+
		"\u06ef\u06ed\3\2\2\2\u06ef\u06ee\3\2\2\2\u06f0\u06f5\3\2\2\2\u06f1\u06f2"+
		"\7\b\2\2\u06f2\u06f4\5\u0098M\2\u06f3\u06f1\3\2\2\2\u06f4\u06f7\3\2\2"+
		"\2\u06f5\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06fc\3\2\2\2\u06f7\u06f5"+
		"\3\2\2\2\u06f8\u06f9\7\b\2\2\u06f9\u06fb\5\u0086D\2\u06fa\u06f8\3\2\2"+
		"\2\u06fb\u06fe\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06ff"+
		"\3\2\2\2\u06fe\u06fc\3\2\2\2\u06ff\u0700\7\7\2\2\u0700\u0702\3\2\2\2\u0701"+
		"\u06ec\3\2\2\2\u0701\u0702\3\2\2\2\u0702w\3\2\2\2\u0703\u0705\t\n\2\2"+
		"\u0704\u0703\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0707"+
		"\7\u009b\2\2\u0707y\3\2\2\2\u0708\u0709\t\20\2\2\u0709{\3\2\2\2\u070a"+
		"\u070b\t\21\2\2\u070b}\3\2\2\2\u070c\u070d\7\u009d\2\2\u070d\177\3\2\2"+
		"\2\u070e\u0711\5T+\2\u070f\u0711\5L\'\2\u0710\u070e\3\2\2\2\u0710\u070f"+
		"\3\2\2\2\u0711\u0081\3\2\2\2\u0712\u0713\t\22\2\2\u0713\u0083\3\2\2\2"+
		"\u0714\u0715\t\23\2\2\u0715\u0085\3\2\2\2\u0716\u0717\5\u0088E\2\u0717"+
		"\u0718\7\5\2\2\u0718\u0719\5\u008aF\2\u0719\u0087\3\2\2\2\u071a\u071f"+
		"\5\u009aN\2\u071b\u071c\7\5\2\2\u071c\u071e\5\u009aN\2\u071d\u071b\3\2"+
		"\2\2\u071e\u0721\3\2\2\2\u071f\u071d\3\2\2\2\u071f\u0720\3\2\2\2\u0720"+
		"\u0089\3\2\2\2\u0721\u071f\3\2\2\2\u0722\u0723\5\u00b0Y\2\u0723\u008b"+
		"\3\2\2\2\u0724\u0725\5\u00b0Y\2\u0725\u008d\3\2\2\2\u0726\u0727\5\u00b0"+
		"Y\2\u0727\u008f\3\2\2\2\u0728\u0729\5\u00b0Y\2\u0729\u0091\3\2\2\2\u072a"+
		"\u072b\5\u00b0Y\2\u072b\u0093\3\2\2\2\u072c\u072d\5\u00b0Y\2\u072d\u0095"+
		"\3\2\2\2\u072e\u072f\5\u00b0Y\2\u072f\u0097\3\2\2\2\u0730\u0731\5\u00b0"+
		"Y\2\u0731\u0099\3\2\2\2\u0732\u0733\5\u00b0Y\2\u0733\u009b\3\2\2\2\u0734"+
		"\u0735\5\u00b0Y\2\u0735\u009d\3\2\2\2\u0736\u0737\5\u00b0Y\2\u0737\u009f"+
		"\3\2\2\2\u0738\u0739\5\u00b0Y\2\u0739\u00a1\3\2\2\2\u073a\u073b\5\u00b0"+
		"Y\2\u073b\u00a3\3\2\2\2\u073c\u073d\5\u00b0Y\2\u073d\u00a5\3\2\2\2\u073e"+
		"\u073f\5\u00b0Y\2\u073f\u00a7\3\2\2\2\u0740\u0741\5\u00b0Y\2\u0741\u00a9"+
		"\3\2\2\2\u0742\u0743\5\u00b0Y\2\u0743\u00ab\3\2\2\2\u0744\u0745\5\u00b0"+
		"Y\2\u0745\u00ad\3\2\2\2\u0746\u0747\5\u00b0Y\2\u0747\u00af\3\2\2\2\u0748"+
		"\u0750\7\u009a\2\2\u0749\u0750\5\u0084C\2\u074a\u0750\7\u009d\2\2\u074b"+
		"\u074c\7\6\2\2\u074c\u074d\5\u00b0Y\2\u074d\u074e\7\7\2\2\u074e\u0750"+
		"\3\2\2\2\u074f\u0748\3\2\2\2\u074f\u0749\3\2\2\2\u074f\u074a\3\2\2\2\u074f"+
		"\u074b\3\2\2\2\u0750\u00b1\3\2\2\2\u010d\u00b4\u00b6\u00c1\u00c8\u00cd"+
		"\u00d3\u00d9\u00db\u00fb\u0102\u010a\u010d\u0116\u011a\u0122\u0126\u0128"+
		"\u012d\u012f\u0133\u013a\u013d\u0142\u0146\u014b\u0154\u0157\u015d\u015f"+
		"\u0163\u0169\u016e\u0179\u017e\u0187\u018d\u0194\u019b\u01a1\u01a6\u01ac"+
		"\u01b2\u01b9\u01c0\u01c6\u01ca\u01ce\u01d4\u01d9\u01e0\u01eb\u01ee\u01f0"+
		"\u01f6\u01fc\u0200\u0207\u020d\u0213\u0219\u021e\u022a\u022f\u023a\u023f"+
		"\u0242\u0248\u024b\u0251\u025a\u025d\u0263\u0265\u026c\u0274\u0279\u0281"+
		"\u0286\u028e\u0293\u029b\u02a0\u02a6\u02ad\u02b0\u02b8\u02c2\u02c5\u02cb"+
		"\u02cd\u02d0\u02e3\u02e9\u02ef\u02f4\u02f8\u02fd\u0306\u0311\u0318\u031e"+
		"\u0324\u032d\u0334\u0338\u033a\u033e\u0345\u0347\u034b\u034e\u0355\u035c"+
		"\u035f\u0369\u036c\u0372\u0374\u0378\u037f\u0382\u038a\u0394\u0397\u039d"+
		"\u039f\u03a3\u03aa\u03b3\u03b7\u03b9\u03bc\u03c5\u03ca\u03cc\u03d5\u03e0"+
		"\u03e7\u03ea\u03ed\u03fa\u0400\u040b\u0415\u0419\u041c\u0429\u042f\u043a"+
		"\u0444\u0448\u0451\u0454\u045a\u045c\u0462\u0467\u046d\u0479\u047d\u0482"+
		"\u0486\u0489\u049b\u04a0\u04a5\u04ad\u04b0\u04b6\u04bf\u04c6\u04ca\u04da"+
		"\u04dd\u04e5\u04ee\u04f2\u04f7\u0515\u0521\u0526\u0532\u0538\u053f\u0543"+
		"\u054d\u0550\u0556\u0559\u055b\u055d\u0568\u056d\u0579\u057d\u0581\u0585"+
		"\u058c\u058e\u0596\u059c\u05a0\u05a3\u05a7\u05ac\u05b4\u05c4\u05ca\u05d3"+
		"\u05d7\u05e7\u05ed\u05f5\u05fa\u05fd\u0602\u0608\u060e\u0615\u061a\u0627"+
		"\u0629\u062d\u0630\u0632\u0639\u063c\u063f\u0646\u064e\u0652\u0656\u0659"+
		"\u065f\u0662\u0664\u066d\u0672\u0676\u067a\u067d\u0685\u068b\u0692\u0697"+
		"\u069b\u06a2\u06ab\u06af\u06b1\u06b4\u06bd\u06c2\u06c4\u06cd\u06d8\u06df"+
		"\u06e2\u06e9\u06ef\u06f5\u06fc\u0701\u0704\u0710\u071f\u074f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}