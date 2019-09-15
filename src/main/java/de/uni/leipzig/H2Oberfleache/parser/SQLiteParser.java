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
		T__0=1, T__1=2, SCOL=3, DOT=4, OPEN_PAR=5, CLOSE_PAR=6, COMMA=7, ASSIGN=8, 
		STAR=9, PLUS=10, MINUS=11, TILDE=12, PIPE2=13, DIV=14, MOD=15, LT2=16, 
		GT2=17, AMP=18, PIPE=19, LT=20, LT_EQ=21, GT=22, GT_EQ=23, EQ=24, NOT_EQ1=25, 
		NOT_EQ2=26, K_ABORT=27, K_ACTION=28, K_ADD=29, K_AFTER=30, K_ALL=31, K_ALTER=32, 
		K_ANALYZE=33, K_AND=34, K_AS=35, K_ASC=36, K_ATTACH=37, K_AUTOINCREMENT=38, 
		K_BEFORE=39, K_BEGIN=40, K_BETWEEN=41, K_BY=42, K_CASCADE=43, K_CASE=44, 
		K_CAST=45, K_CHECK=46, K_COLLATE=47, K_COLUMN=48, K_COMMIT=49, K_CONFLICT=50, 
		K_CONSTRAINT=51, K_CREATE=52, K_CROSS=53, K_CURRENT_DATE=54, K_CURRENT_TIME=55, 
		K_CURRENT_TIMESTAMP=56, K_DATABASE=57, K_DEFAULT=58, K_DEFERRABLE=59, 
		K_DEFERRED=60, K_DELETE=61, K_DESC=62, K_DETACH=63, K_DISTINCT=64, K_DROP=65, 
		K_EACH=66, K_ELSE=67, K_END=68, K_ESCAPE=69, K_EXCEPT=70, K_EXCLUSIVE=71, 
		K_EXISTS=72, K_EXPLAIN=73, K_FAIL=74, K_FOR=75, K_FOREIGN=76, K_FROM=77, 
		K_FULL=78, K_GLOB=79, K_GROUP=80, K_HAVING=81, K_IF=82, K_IGNORE=83, K_IMMEDIATE=84, 
		K_IN=85, K_INDEX=86, K_INDEXED=87, K_INITIALLY=88, K_INNER=89, K_INSERT=90, 
		K_INSTEAD=91, K_INTERSECT=92, K_INTO=93, K_IS=94, K_ISNULL=95, K_JOIN=96, 
		K_KEY=97, K_LEFT=98, K_LIKE=99, K_LIMIT=100, K_MATCH=101, K_NATURAL=102, 
		K_NO=103, K_NOT=104, K_NOTNULL=105, K_NULL=106, K_OF=107, K_OFFSET=108, 
		K_ON=109, K_OR=110, K_ORDER=111, K_OUTER=112, K_PLAN=113, K_PRAGMA=114, 
		K_PRIMARY=115, K_QUERY=116, K_RAISE=117, K_RECURSIVE=118, K_REFERENCES=119, 
		K_REGEXP=120, K_REINDEX=121, K_RELEASE=122, K_RENAME=123, K_REPLACE=124, 
		K_RESTRICT=125, K_RIGHT=126, K_ROLLBACK=127, K_ROW=128, K_SAVEPOINT=129, 
		K_SELECT=130, K_SET=131, K_TABLE=132, K_TEMP=133, K_TEMPORARY=134, K_THEN=135, 
		K_TO=136, K_TRANSACTION=137, K_TRIGGER=138, K_UNION=139, K_UNIQUE=140, 
		K_UPDATE=141, K_USING=142, K_VACUUM=143, K_VALUES=144, K_VIEW=145, K_VIRTUAL=146, 
		K_WHEN=147, K_WHERE=148, K_WITH=149, K_WITHOUT=150, K_NEST=151, K_UNNEST=152, 
		K_AVG=153, K_EVERY=154, K_ANY=155, K_COUNT=156, K_LISTAGG=157, K_MAX=158, 
		K_MIN=159, K_SUM=160, K_SELECTIVITY=161, K_RANK=162, K_MEDIAN=163, K_MODE=164, 
		K_ENVELOPE=165, K_CARDINALITY=166, IDENTIFIER=167, NUMERIC_LITERAL=168, 
		BIND_PARAMETER=169, STRING_LITERAL=170, BLOB_LITERAL=171, SINGLE_LINE_COMMENT=172, 
		MULTILINE_COMMENT=173, SPACES=174, UNEXPECTED_CHAR=175;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5, RULE_attach_stmt = 6, 
		RULE_begin_stmt = 7, RULE_commit_stmt = 8, RULE_compound_select_stmt = 9, 
		RULE_create_index_stmt = 10, RULE_set_row_create = 11, RULE_create_table_stmt = 12, 
		RULE_create_trigger_stmt = 13, RULE_create_view_stmt = 14, RULE_create_virtual_table_stmt = 15, 
		RULE_delete_stmt = 16, RULE_delete_stmt_limited = 17, RULE_where_expr = 18, 
		RULE_detach_stmt = 19, RULE_drop_index_stmt = 20, RULE_drop_table_stmt = 21, 
		RULE_drop_trigger_stmt = 22, RULE_drop_view_stmt = 23, RULE_factored_select_stmt = 24, 
		RULE_insert_stmt = 25, RULE_value_insert = 26, RULE_row_expr = 27, RULE_set_expr = 28, 
		RULE_table_insert = 29, RULE_pragma_stmt = 30, RULE_reindex_stmt = 31, 
		RULE_release_stmt = 32, RULE_rollback_stmt = 33, RULE_savepoint_stmt = 34, 
		RULE_simple_select_stmt = 35, RULE_select_stmt = 36, RULE_select_or_values = 37, 
		RULE_update_stmt = 38, RULE_set_stmt = 39, RULE_set_row_update = 40, RULE_update_stmt_limited = 41, 
		RULE_vacuum_stmt = 42, RULE_column_def = 43, RULE_type_name = 44, RULE_column_constraint = 45, 
		RULE_conflict_clause = 46, RULE_expr = 47, RULE_foreign_key_clause = 48, 
		RULE_raise_function = 49, RULE_indexed_column = 50, RULE_table_constraint = 51, 
		RULE_with_clause = 52, RULE_qualified_table_name = 53, RULE_ordering_term = 54, 
		RULE_pragma_value = 55, RULE_common_table_expression = 56, RULE_result_column = 57, 
		RULE_un_nest_stmt = 58, RULE_table_or_subquery = 59, RULE_join_clause = 60, 
		RULE_join_operator = 61, RULE_join_constraint = 62, RULE_group_by = 63, 
		RULE_select_core = 64, RULE_compound_operator = 65, RULE_cte_table_name = 66, 
		RULE_signed_number = 67, RULE_literal_value = 68, RULE_unary_operator = 69, 
		RULE_error_message = 70, RULE_module_argument = 71, RULE_column_alias = 72, 
		RULE_keyword = 73, RULE_nf2_point_Notation = 74, RULE_name_of_subtable = 75, 
		RULE_subtable_column_name = 76, RULE_name = 77, RULE_function_name = 78, 
		RULE_aggregate = 79, RULE_database_name = 80, RULE_table_name = 81, RULE_table_or_index_name = 82, 
		RULE_new_table_name = 83, RULE_column_name = 84, RULE_subtable_name = 85, 
		RULE_collation_name = 86, RULE_foreign_table = 87, RULE_index_name = 88, 
		RULE_trigger_name = 89, RULE_view_name = 90, RULE_module_name = 91, RULE_pragma_name = 92, 
		RULE_savepoint_name = 93, RULE_table_alias = 94, RULE_transaction_name = 95, 
		RULE_any_name = 96;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
			"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
			"set_row_create", "create_table_stmt", "create_trigger_stmt", "create_view_stmt", 
			"create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", "where_expr", 
			"detach_stmt", "drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", 
			"drop_view_stmt", "factored_select_stmt", "insert_stmt", "value_insert", 
			"row_expr", "set_expr", "table_insert", "pragma_stmt", "reindex_stmt", 
			"release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
			"select_stmt", "select_or_values", "update_stmt", "set_stmt", "set_row_update", 
			"update_stmt_limited", "vacuum_stmt", "column_def", "type_name", "column_constraint", 
			"conflict_clause", "expr", "foreign_key_clause", "raise_function", "indexed_column", 
			"table_constraint", "with_clause", "qualified_table_name", "ordering_term", 
			"pragma_value", "common_table_expression", "result_column", "un_nest_stmt", 
			"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
			"group_by", "select_core", "compound_operator", "cte_table_name", "signed_number", 
			"literal_value", "unary_operator", "error_message", "module_argument", 
			"column_alias", "keyword", "nf2_point_Notation", "name_of_subtable", 
			"subtable_column_name", "name", "function_name", "aggregate", "database_name", 
			"table_name", "table_or_index_name", "new_table_name", "column_name", 
			"subtable_name", "collation_name", "foreign_table", "index_name", "trigger_name", 
			"view_name", "module_name", "pragma_name", "savepoint_name", "table_alias", 
			"transaction_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", 
			"'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", 
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
			"K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "K_NEST", "K_UNNEST", "K_AVG", 
			"K_EVERY", "K_ANY", "K_COUNT", "K_LISTAGG", "K_MAX", "K_MIN", "K_SUM", 
			"K_SELECTIVITY", "K_RANK", "K_MEDIAN", "K_MODE", "K_ENVELOPE", "K_CARDINALITY", 
			"IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR"
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
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_DROP - 65)) | (1L << (K_END - 65)) | (1L << (K_EXPLAIN - 65)) | (1L << (K_INSERT - 65)) | (1L << (K_PRAGMA - 65)) | (1L << (K_REINDEX - 65)) | (1L << (K_RELEASE - 65)) | (1L << (K_REPLACE - 65)) | (1L << (K_ROLLBACK - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (K_SAVEPOINT - 129)) | (1L << (K_SELECT - 129)) | (1L << (K_UPDATE - 129)) | (1L << (K_VACUUM - 129)) | (1L << (K_VALUES - 129)) | (1L << (K_WITH - 129)) | (1L << (UNEXPECTED_CHAR - 129)))) != 0)) {
				{
				setState(196);
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
					setState(194);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(195);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
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
			setState(203);
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
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(206);
				match(SCOL);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			sql_stmt();
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(213);
						match(SCOL);
						}
						}
						setState(216); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(218);
					sql_stmt();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					match(SCOL);
					}
					} 
				}
				setState(229);
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
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(230);
				match(K_EXPLAIN);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(231);
					match(K_QUERY);
					setState(232);
					match(K_PLAN);
					}
				}

				}
			}

			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(237);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(238);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(239);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(240);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(241);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(242);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(243);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(244);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(245);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(246);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(247);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(248);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(249);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(250);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(251);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(252);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(253);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(254);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(255);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(256);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(257);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(258);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(259);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(260);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(261);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(262);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(263);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(264);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(265);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(266);
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
			setState(269);
			match(K_ALTER);
			setState(270);
			match(K_TABLE);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(271);
				database_name();
				setState(272);
				match(DOT);
				}
				break;
			}
			setState(276);
			table_name();
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(277);
				match(K_RENAME);
				setState(278);
				match(K_TO);
				setState(279);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(280);
				match(K_ADD);
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(281);
					match(K_COLUMN);
					}
					break;
				}
				setState(284);
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
			setState(287);
			match(K_ANALYZE);
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(288);
				database_name();
				}
				break;
			case 2:
				{
				setState(289);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(290);
				database_name();
				setState(291);
				match(DOT);
				setState(292);
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
			setState(296);
			match(K_ATTACH);
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(297);
				match(K_DATABASE);
				}
				break;
			}
			setState(300);
			expr(0);
			setState(301);
			match(K_AS);
			setState(302);
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
			setState(304);
			match(K_BEGIN);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (K_DEFERRED - 60)) | (1L << (K_EXCLUSIVE - 60)) | (1L << (K_IMMEDIATE - 60)))) != 0)) {
				{
				setState(305);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (K_DEFERRED - 60)) | (1L << (K_EXCLUSIVE - 60)) | (1L << (K_IMMEDIATE - 60)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(308);
				match(K_TRANSACTION);
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(309);
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
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(315);
				match(K_TRANSACTION);
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(316);
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
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(321);
				match(K_WITH);
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(322);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(325);
				common_table_expression();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(326);
					match(COMMA);
					setState(327);
					common_table_expression();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(335);
			select_core();
			setState(345); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(342);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(336);
					match(K_UNION);
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(337);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(340);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(341);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(344);
				select_core();
				}
				}
				setState(347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(349);
				match(K_ORDER);
				setState(350);
				match(K_BY);
				setState(351);
				ordering_term();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(352);
					match(COMMA);
					setState(353);
					ordering_term();
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(361);
				match(K_LIMIT);
				setState(362);
				expr(0);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(363);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(364);
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
			setState(369);
			match(K_CREATE);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(370);
				match(K_UNIQUE);
				}
			}

			setState(373);
			match(K_INDEX);
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(374);
				match(K_IF);
				setState(375);
				match(K_NOT);
				setState(376);
				match(K_EXISTS);
				}
				break;
			}
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(379);
				database_name();
				setState(380);
				match(DOT);
				}
				break;
			}
			setState(384);
			index_name();
			setState(385);
			match(K_ON);
			setState(386);
			table_name();
			setState(387);
			match(OPEN_PAR);
			setState(388);
			indexed_column();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(389);
				match(COMMA);
				setState(390);
				indexed_column();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(CLOSE_PAR);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(397);
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
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			subtable_name();
			setState(401);
			match(K_SET);
			setState(402);
			match(OPEN_PAR);
			setState(403);
			match(K_ROW);
			setState(404);
			match(OPEN_PAR);
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(405);
				column_def();
				}
				break;
			case 2:
				{
				setState(406);
				set_row_create();
				}
				break;
			}
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(409);
					match(COMMA);
					setState(410);
					column_def();
					}
					break;
				case 2:
					{
					setState(411);
					match(COMMA);
					setState(412);
					set_row_create();
					}
					break;
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(CLOSE_PAR);
			setState(419);
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
			setState(421);
			match(K_CREATE);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(422);
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

			setState(425);
			match(K_TABLE);
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(426);
				match(K_IF);
				setState(427);
				match(K_NOT);
				setState(428);
				match(K_EXISTS);
				}
				break;
			}
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(431);
				database_name();
				setState(432);
				match(DOT);
				}
				break;
			}
			setState(436);
			table_name();
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(437);
				match(OPEN_PAR);
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(438);
					column_def();
					}
					break;
				case 2:
					{
					setState(439);
					set_row_create();
					}
					break;
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(442);
						match(COMMA);
						setState(445);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
						case 1:
							{
							setState(443);
							column_def();
							}
							break;
						case 2:
							{
							setState(444);
							set_row_create();
							}
							break;
						}
						}
						} 
					}
					setState(451);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(452);
					match(COMMA);
					setState(453);
					table_constraint();
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(459);
				match(CLOSE_PAR);
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(460);
					match(K_WITHOUT);
					setState(461);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(464);
				match(K_AS);
				setState(465);
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
			setState(468);
			match(K_CREATE);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(469);
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

			setState(472);
			match(K_TRIGGER);
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(473);
				match(K_IF);
				setState(474);
				match(K_NOT);
				setState(475);
				match(K_EXISTS);
				}
				break;
			}
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(478);
				database_name();
				setState(479);
				match(DOT);
				}
				break;
			}
			setState(483);
			trigger_name();
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(484);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(485);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(486);
				match(K_INSTEAD);
				setState(487);
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
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(490);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(491);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(492);
				match(K_UPDATE);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(493);
					match(K_OF);
					setState(494);
					column_name();
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(495);
						match(COMMA);
						setState(496);
						column_name();
						}
						}
						setState(501);
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
			setState(506);
			match(K_ON);
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(507);
				database_name();
				setState(508);
				match(DOT);
				}
				break;
			}
			setState(512);
			table_name();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(513);
				match(K_FOR);
				setState(514);
				match(K_EACH);
				setState(515);
				match(K_ROW);
				}
			}

			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(518);
				match(K_WHEN);
				setState(519);
				expr(0);
				}
			}

			setState(522);
			match(K_BEGIN);
			setState(531); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(523);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(524);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(525);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(526);
					select_stmt();
					}
					break;
				}
				setState(529);
				match(SCOL);
				}
				}
				setState(533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (K_INSERT - 90)) | (1L << (K_REPLACE - 90)) | (1L << (K_SELECT - 90)) | (1L << (K_UPDATE - 90)) | (1L << (K_VALUES - 90)) | (1L << (K_WITH - 90)))) != 0) );
			setState(535);
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
			setState(537);
			match(K_CREATE);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(538);
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

			setState(541);
			match(K_VIEW);
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(542);
				match(K_IF);
				setState(543);
				match(K_NOT);
				setState(544);
				match(K_EXISTS);
				}
				break;
			}
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(547);
				database_name();
				setState(548);
				match(DOT);
				}
				break;
			}
			setState(552);
			view_name();
			setState(553);
			match(K_AS);
			setState(554);
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
			setState(556);
			match(K_CREATE);
			setState(557);
			match(K_VIRTUAL);
			setState(558);
			match(K_TABLE);
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(559);
				match(K_IF);
				setState(560);
				match(K_NOT);
				setState(561);
				match(K_EXISTS);
				}
				break;
			}
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(564);
				database_name();
				setState(565);
				match(DOT);
				}
				break;
			}
			setState(569);
			table_name();
			setState(570);
			match(K_USING);
			setState(571);
			module_name();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(572);
				match(OPEN_PAR);
				setState(573);
				module_argument();
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(574);
					match(COMMA);
					setState(575);
					module_argument();
					}
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(581);
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
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(585);
				with_clause();
				}
			}

			setState(588);
			match(K_DELETE);
			setState(589);
			match(K_FROM);
			setState(590);
			qualified_table_name();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(591);
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
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(594);
				with_clause();
				}
			}

			setState(597);
			match(K_DELETE);
			setState(598);
			match(K_FROM);
			setState(599);
			qualified_table_name();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(600);
				where_expr();
				}
			}

			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(603);
					match(K_ORDER);
					setState(604);
					match(K_BY);
					setState(605);
					ordering_term();
					setState(610);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(606);
						match(COMMA);
						setState(607);
						ordering_term();
						}
						}
						setState(612);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(615);
				match(K_LIMIT);
				setState(616);
				expr(0);
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(617);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(618);
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
			setState(623);
			match(K_WHERE);
			setState(624);
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
			setState(626);
			match(K_DETACH);
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(627);
				match(K_DATABASE);
				}
				break;
			}
			setState(630);
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
			setState(632);
			match(K_DROP);
			setState(633);
			match(K_INDEX);
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(634);
				match(K_IF);
				setState(635);
				match(K_EXISTS);
				}
				break;
			}
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(638);
				database_name();
				setState(639);
				match(DOT);
				}
				break;
			}
			setState(643);
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
			setState(645);
			match(K_DROP);
			setState(646);
			match(K_TABLE);
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(647);
				match(K_IF);
				setState(648);
				match(K_EXISTS);
				}
				break;
			}
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(651);
				database_name();
				setState(652);
				match(DOT);
				}
				break;
			}
			setState(656);
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
			setState(658);
			match(K_DROP);
			setState(659);
			match(K_TRIGGER);
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(660);
				match(K_IF);
				setState(661);
				match(K_EXISTS);
				}
				break;
			}
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(664);
				database_name();
				setState(665);
				match(DOT);
				}
				break;
			}
			setState(669);
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
			setState(671);
			match(K_DROP);
			setState(672);
			match(K_VIEW);
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(673);
				match(K_IF);
				setState(674);
				match(K_EXISTS);
				}
				break;
			}
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(677);
				database_name();
				setState(678);
				match(DOT);
				}
				break;
			}
			setState(682);
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
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(684);
				match(K_WITH);
				setState(686);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(685);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(688);
				common_table_expression();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(689);
					match(COMMA);
					setState(690);
					common_table_expression();
					}
					}
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(698);
			select_core();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(699);
				compound_operator();
				setState(700);
				select_core();
				}
				}
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(707);
				match(K_ORDER);
				setState(708);
				match(K_BY);
				setState(709);
				ordering_term();
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(710);
					match(COMMA);
					setState(711);
					ordering_term();
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(719);
				match(K_LIMIT);
				setState(720);
				expr(0);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(721);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(722);
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
		public Table_insertContext table_insert() {
			return getRuleContext(Table_insertContext.class,0);
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
		public List<Value_insertContext> value_insert() {
			return getRuleContexts(Value_insertContext.class);
		}
		public Value_insertContext value_insert(int i) {
			return getRuleContext(Value_insertContext.class,i);
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
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(727);
				with_clause();
				}
			}

			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(730);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(731);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(732);
				match(K_INSERT);
				setState(733);
				match(K_OR);
				setState(734);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(735);
				match(K_INSERT);
				setState(736);
				match(K_OR);
				setState(737);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(738);
				match(K_INSERT);
				setState(739);
				match(K_OR);
				setState(740);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(741);
				match(K_INSERT);
				setState(742);
				match(K_OR);
				setState(743);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(744);
				match(K_INSERT);
				setState(745);
				match(K_OR);
				setState(746);
				match(K_IGNORE);
				}
				break;
			}
			setState(749);
			match(K_INTO);
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(750);
				database_name();
				setState(751);
				match(DOT);
				}
				break;
			}
			setState(755);
			table_insert();
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(756);
				match(K_VALUES);
				setState(757);
				match(OPEN_PAR);
				setState(758);
				value_insert();
				setState(759);
				match(CLOSE_PAR);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(760);
					match(COMMA);
					setState(761);
					match(OPEN_PAR);
					setState(762);
					value_insert();
					setState(763);
					match(CLOSE_PAR);
					}
					}
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(770);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(771);
				match(K_DEFAULT);
				setState(772);
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

	public static class Value_insertContext extends ParserRuleContext {
		public List<Row_exprContext> row_expr() {
			return getRuleContexts(Row_exprContext.class);
		}
		public Row_exprContext row_expr(int i) {
			return getRuleContext(Row_exprContext.class,i);
		}
		public List<Set_exprContext> set_expr() {
			return getRuleContexts(Set_exprContext.class);
		}
		public Set_exprContext set_expr(int i) {
			return getRuleContext(Set_exprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Value_insertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterValue_insert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitValue_insert(this);
		}
	}

	public final Value_insertContext value_insert() throws RecognitionException {
		Value_insertContext _localctx = new Value_insertContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_value_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(775);
				row_expr();
				}
				break;
			case 2:
				{
				setState(776);
				set_expr();
				}
				break;
			case 3:
				{
				setState(777);
				expr(0);
				}
				break;
			}
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(780);
				match(COMMA);
				setState(784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(781);
					row_expr();
					}
					break;
				case 2:
					{
					setState(782);
					set_expr();
					}
					break;
				case 3:
					{
					setState(783);
					expr(0);
					}
					break;
				}
				}
				}
				setState(790);
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

	public static class Row_exprContext extends ParserRuleContext {
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Value_insertContext value_insert() {
			return getRuleContext(Value_insertContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Row_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRow_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRow_expr(this);
		}
	}

	public final Row_exprContext row_expr() throws RecognitionException {
		Row_exprContext _localctx = new Row_exprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_row_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(K_ROW);
			setState(792);
			match(OPEN_PAR);
			setState(793);
			value_insert();
			setState(794);
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

	public static class Set_exprContext extends ParserRuleContext {
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Value_insertContext value_insert() {
			return getRuleContext(Value_insertContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Set_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSet_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSet_expr(this);
		}
	}

	public final Set_exprContext set_expr() throws RecognitionException {
		Set_exprContext _localctx = new Set_exprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_set_expr);
		try {
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				match(K_SET);
				setState(797);
				match(OPEN_PAR);
				setState(798);
				value_insert();
				setState(799);
				match(CLOSE_PAR);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				match(T__0);
				setState(802);
				value_insert();
				setState(803);
				match(T__1);
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

	public static class Table_insertContext extends ParserRuleContext {
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
		public List<Table_insertContext> table_insert() {
			return getRuleContexts(Table_insertContext.class);
		}
		public Table_insertContext table_insert(int i) {
			return getRuleContext(Table_insertContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Table_insertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_insert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_insert(this);
		}
	}

	public final Table_insertContext table_insert() throws RecognitionException {
		Table_insertContext _localctx = new Table_insertContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_table_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			table_name();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(808);
				match(OPEN_PAR);
				setState(811);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(809);
					column_name();
					}
					break;
				case 2:
					{
					setState(810);
					table_insert();
					}
					break;
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(813);
					match(COMMA);
					setState(816);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						setState(814);
						column_name();
						}
						break;
					case 2:
						{
						setState(815);
						table_insert();
						}
						break;
					}
					}
					}
					setState(822);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(823);
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
		enterRule(_localctx, 60, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(K_PRAGMA);
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(828);
				database_name();
				setState(829);
				match(DOT);
				}
				break;
			}
			setState(833);
			pragma_name();
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(834);
				match(ASSIGN);
				setState(835);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(836);
				match(OPEN_PAR);
				setState(837);
				pragma_value();
				setState(838);
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
		enterRule(_localctx, 62, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(K_REINDEX);
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(843);
				collation_name();
				}
				break;
			case 2:
				{
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(844);
					database_name();
					setState(845);
					match(DOT);
					}
					break;
				}
				setState(851);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(849);
					table_name();
					}
					break;
				case 2:
					{
					setState(850);
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
		enterRule(_localctx, 64, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(K_RELEASE);
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(856);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(859);
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
		enterRule(_localctx, 66, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(K_ROLLBACK);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(862);
				match(K_TRANSACTION);
				setState(864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(863);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(868);
				match(K_TO);
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(869);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(872);
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
		enterRule(_localctx, 68, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(K_SAVEPOINT);
			setState(876);
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
		enterRule(_localctx, 70, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(878);
				match(K_WITH);
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(879);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(882);
				common_table_expression();
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(883);
					match(COMMA);
					setState(884);
					common_table_expression();
					}
					}
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(892);
			select_core();
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(893);
				match(K_ORDER);
				setState(894);
				match(K_BY);
				setState(895);
				ordering_term();
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(896);
					match(COMMA);
					setState(897);
					ordering_term();
					}
					}
					setState(902);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(905);
				match(K_LIMIT);
				setState(906);
				expr(0);
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(907);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(908);
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
		enterRule(_localctx, 72, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(913);
				match(K_WITH);
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(914);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(917);
				common_table_expression();
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(918);
					match(COMMA);
					setState(919);
					common_table_expression();
					}
					}
					setState(924);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(927);
			select_or_values();
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(928);
				compound_operator();
				setState(929);
				select_or_values();
				}
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(936);
				match(K_ORDER);
				setState(937);
				match(K_BY);
				setState(938);
				ordering_term();
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(939);
					match(COMMA);
					setState(940);
					ordering_term();
					}
					}
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(948);
				match(K_LIMIT);
				setState(949);
				expr(0);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(950);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(951);
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
		public List<Where_exprContext> where_expr() {
			return getRuleContexts(Where_exprContext.class);
		}
		public Where_exprContext where_expr(int i) {
			return getRuleContext(Where_exprContext.class,i);
		}
		public Group_byContext group_by() {
			return getRuleContext(Group_byContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
		}
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
		enterRule(_localctx, 74, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(1020);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				match(K_SELECT);
				setState(958);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(957);
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
				{
				setState(960);
				result_column();
				}
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(961);
					match(COMMA);
					setState(962);
					result_column();
					}
					}
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(968);
					match(K_FROM);
					setState(979);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						setState(969);
						table_or_subquery();
						}
						break;
					case 2:
						{
						setState(970);
						join_clause();
						setState(976);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(974);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case COMMA:
									{
									setState(971);
									match(COMMA);
									setState(972);
									table_or_subquery();
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
									setState(973);
									join_clause();
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								} 
							}
							setState(978);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
						}
						}
						break;
					}
					}
				}

				setState(984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(983);
					where_expr();
					}
					break;
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(986);
					where_expr();
					}
				}

				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(989);
					group_by();
					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				match(K_VALUES);
				setState(993);
				match(OPEN_PAR);
				setState(994);
				expr(0);
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(995);
					match(COMMA);
					setState(996);
					expr(0);
					}
					}
					setState(1001);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1002);
				match(CLOSE_PAR);
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1003);
					match(COMMA);
					setState(1004);
					match(OPEN_PAR);
					setState(1005);
					expr(0);
					setState(1010);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1006);
						match(COMMA);
						setState(1007);
						expr(0);
						}
						}
						setState(1012);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1013);
					match(CLOSE_PAR);
					}
					}
					setState(1019);
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
		public List<Set_stmtContext> set_stmt() {
			return getRuleContexts(Set_stmtContext.class);
		}
		public Set_stmtContext set_stmt(int i) {
			return getRuleContext(Set_stmtContext.class,i);
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
		enterRule(_localctx, 76, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1022);
				with_clause();
				}
			}

			setState(1025);
			match(K_UPDATE);
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1026);
				match(K_OR);
				setState(1027);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1028);
				match(K_OR);
				setState(1029);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1030);
				match(K_OR);
				setState(1031);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1032);
				match(K_OR);
				setState(1033);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1034);
				match(K_OR);
				setState(1035);
				match(K_IGNORE);
				}
				break;
			}
			setState(1038);
			qualified_table_name();
			setState(1039);
			match(K_SET);
			setState(1040);
			set_stmt();
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1041);
				match(COMMA);
				setState(1042);
				set_stmt();
				}
				}
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1048);
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

	public static class Set_stmtContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Nf2_point_NotationContext nf2_point_Notation() {
			return getRuleContext(Nf2_point_NotationContext.class,0);
		}
		public Set_row_updateContext set_row_update() {
			return getRuleContext(Set_row_updateContext.class,0);
		}
		public Row_exprContext row_expr() {
			return getRuleContext(Row_exprContext.class,0);
		}
		public Set_exprContext set_expr() {
			return getRuleContext(Set_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Set_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSet_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSet_stmt(this);
		}
	}

	public final Set_stmtContext set_stmt() throws RecognitionException {
		Set_stmtContext _localctx = new Set_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_set_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1051);
				column_name();
				}
				break;
			case 2:
				{
				setState(1052);
				nf2_point_Notation();
				}
				break;
			case 3:
				{
				setState(1053);
				set_row_update();
				}
				break;
			}
			setState(1056);
			match(ASSIGN);
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1057);
				row_expr();
				}
				break;
			case 2:
				{
				setState(1058);
				set_expr();
				}
				break;
			case 3:
				{
				setState(1059);
				expr(0);
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

	public static class Set_row_updateContext extends ParserRuleContext {
		public Table_insertContext table_insert() {
			return getRuleContext(Table_insertContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Nf2_point_NotationContext nf2_point_Notation() {
			return getRuleContext(Nf2_point_NotationContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Set_row_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_row_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSet_row_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSet_row_update(this);
		}
	}

	public final Set_row_updateContext set_row_update() throws RecognitionException {
		Set_row_updateContext _localctx = new Set_row_updateContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_set_row_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1064);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1062);
					nf2_point_Notation();
					}
					break;
				case 2:
					{
					setState(1063);
					column_name();
					}
					break;
				}
				setState(1066);
				match(DOT);
				}
				break;
			}
			setState(1070);
			table_insert();
			}
		}
		catch (RecognitionException re) {
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
		public List<Set_stmtContext> set_stmt() {
			return getRuleContexts(Set_stmtContext.class);
		}
		public Set_stmtContext set_stmt(int i) {
			return getRuleContext(Set_stmtContext.class,i);
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
		enterRule(_localctx, 82, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1072);
				with_clause();
				}
			}

			setState(1075);
			match(K_UPDATE);
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1076);
				match(K_OR);
				setState(1077);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1078);
				match(K_OR);
				setState(1079);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1080);
				match(K_OR);
				setState(1081);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1082);
				match(K_OR);
				setState(1083);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1084);
				match(K_OR);
				setState(1085);
				match(K_IGNORE);
				}
				break;
			}
			setState(1088);
			qualified_table_name();
			setState(1089);
			match(K_SET);
			setState(1090);
			set_stmt();
			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1091);
				match(COMMA);
				setState(1092);
				set_stmt();
				}
				}
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1098);
				where_expr();
				}
			}

			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1101);
					match(K_ORDER);
					setState(1102);
					match(K_BY);
					setState(1103);
					ordering_term();
					setState(1108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1104);
						match(COMMA);
						setState(1105);
						ordering_term();
						}
						}
						setState(1110);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1113);
				match(K_LIMIT);
				setState(1114);
				expr(0);
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1115);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1116);
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
		enterRule(_localctx, 84, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
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
		enterRule(_localctx, 86, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			column_name();
			setState(1125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1124);
				type_name();
				}
				break;
			}
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_NOT - 104)) | (1L << (K_NULL - 104)) | (1L << (K_PRIMARY - 104)) | (1L << (K_REFERENCES - 104)) | (1L << (K_UNIQUE - 104)))) != 0)) {
				{
				{
				setState(1127);
				column_constraint();
				}
				}
				setState(1132);
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
		enterRule(_localctx, 88, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1134); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1133);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1136); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1138);
				match(OPEN_PAR);
				setState(1139);
				signed_number();
				setState(1140);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1142);
				match(OPEN_PAR);
				setState(1143);
				signed_number();
				setState(1144);
				match(COMMA);
				setState(1145);
				signed_number();
				setState(1146);
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
		enterRule(_localctx, 90, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1150);
				match(K_CONSTRAINT);
				setState(1151);
				name();
				}
			}

			setState(1187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1154);
				match(K_PRIMARY);
				setState(1155);
				match(K_KEY);
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1156);
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

				setState(1159);
				conflict_clause();
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1160);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1163);
					match(K_NOT);
					}
				}

				setState(1166);
				match(K_NULL);
				setState(1167);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1168);
				match(K_UNIQUE);
				setState(1169);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1170);
				match(K_CHECK);
				setState(1171);
				match(OPEN_PAR);
				setState(1172);
				expr(0);
				setState(1173);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1175);
				match(K_DEFAULT);
				setState(1182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1176);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1177);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1178);
					match(OPEN_PAR);
					setState(1179);
					expr(0);
					setState(1180);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1184);
				match(K_COLLATE);
				setState(1185);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1186);
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
		enterRule(_localctx, 92, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1189);
				match(K_ON);
				setState(1190);
				match(K_CONFLICT);
				setState(1191);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_FAIL - 74)) | (1L << (K_IGNORE - 74)) | (1L << (K_REPLACE - 74)) | (1L << (K_ROLLBACK - 74)))) != 0)) ) {
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
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
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
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1195);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1196);
				signed_number();
				}
				break;
			case 3:
				{
				setState(1197);
				match(BIND_PARAMETER);
				}
				break;
			case 4:
				{
				setState(1201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1198);
					table_name();
					setState(1199);
					match(DOT);
					}
					break;
				}
				setState(1204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1203);
					column_name();
					}
					break;
				}
				setState(1210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1206);
						match(DOT);
						setState(1207);
						column_name();
						}
						} 
					}
					setState(1212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				setState(1214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1213);
					match(DOT);
					}
					break;
				}
				setState(1217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1216);
					match(STAR);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1219);
				unary_operator();
				setState(1220);
				expr(22);
				}
				break;
			case 6:
				{
				setState(1222);
				aggregate();
				setState(1223);
				match(OPEN_PAR);
				setState(1236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						setState(1224);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1227);
					expr(0);
					setState(1232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1228);
						match(COMMA);
						setState(1229);
						expr(0);
						}
						}
						setState(1234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1235);
					match(STAR);
					}
					break;
				}
				setState(1238);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1240);
				function_name();
				setState(1241);
				match(OPEN_PAR);
				setState(1254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						setState(1242);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1245);
					expr(0);
					setState(1250);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1246);
						match(COMMA);
						setState(1247);
						expr(0);
						}
						}
						setState(1252);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1253);
					match(STAR);
					}
					break;
				}
				setState(1256);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1258);
				match(OPEN_PAR);
				setState(1259);
				expr(0);
				setState(1260);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1262);
				match(K_CAST);
				setState(1263);
				match(OPEN_PAR);
				setState(1264);
				expr(0);
				setState(1265);
				match(K_AS);
				setState(1266);
				type_name();
				setState(1267);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1270);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1269);
						match(K_NOT);
						}
					}

					setState(1272);
					match(K_EXISTS);
					}
				}

				setState(1275);
				match(OPEN_PAR);
				setState(1276);
				select_stmt();
				setState(1277);
				match(CLOSE_PAR);
				}
				break;
			case 11:
				{
				setState(1279);
				match(K_CASE);
				setState(1281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1280);
					expr(0);
					}
					break;
				}
				setState(1288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1283);
					match(K_WHEN);
					setState(1284);
					expr(0);
					setState(1285);
					match(K_THEN);
					setState(1286);
					expr(0);
					}
					}
					setState(1290); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1292);
					match(K_ELSE);
					setState(1293);
					expr(0);
					}
				}

				setState(1296);
				match(K_END);
				}
				break;
			case 12:
				{
				setState(1298);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1301);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1302);
						match(PIPE2);
						setState(1303);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1304);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1305);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1306);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1307);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1308);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1309);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1310);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1311);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1312);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1313);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1314);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1315);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1316);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1329);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
						case 1:
							{
							setState(1317);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1318);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1319);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1320);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1321);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1322);
							match(K_IS);
							setState(1323);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1324);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1325);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1326);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1327);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1328);
							match(K_REGEXP);
							}
							break;
						}
						setState(1331);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1332);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1333);
						match(K_AND);
						setState(1334);
						expr(16);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1335);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1336);
						match(K_OR);
						setState(1337);
						expr(15);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1338);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1339);
						match(K_IS);
						setState(1341);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
						case 1:
							{
							setState(1340);
							match(K_NOT);
							}
							break;
						}
						setState(1343);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1344);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1346);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1345);
							match(K_NOT);
							}
						}

						setState(1348);
						match(K_BETWEEN);
						setState(1349);
						expr(0);
						setState(1350);
						match(K_AND);
						setState(1351);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1353);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1354);
						match(K_COLLATE);
						setState(1355);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1356);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1358);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1357);
							match(K_NOT);
							}
						}

						setState(1360);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_GLOB - 79)) | (1L << (K_LIKE - 79)) | (1L << (K_MATCH - 79)) | (1L << (K_REGEXP - 79)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1361);
						expr(0);
						setState(1364);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
						case 1:
							{
							setState(1362);
							match(K_ESCAPE);
							setState(1363);
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
						setState(1366);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1371);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1367);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1368);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1369);
							match(K_NOT);
							setState(1370);
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
						setState(1373);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1375);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1374);
							match(K_NOT);
							}
						}

						setState(1377);
						match(K_IN);
						setState(1397);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
						case 1:
							{
							setState(1378);
							match(OPEN_PAR);
							setState(1388);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
							case 1:
								{
								setState(1379);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1380);
								expr(0);
								setState(1385);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1381);
									match(COMMA);
									setState(1382);
									expr(0);
									}
									}
									setState(1387);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1390);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1394);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
							case 1:
								{
								setState(1391);
								database_name();
								setState(1392);
								match(DOT);
								}
								break;
							}
							setState(1396);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
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
		enterRule(_localctx, 96, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			match(K_REFERENCES);
			setState(1405);
			foreign_table();
			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1406);
				match(OPEN_PAR);
				setState(1407);
				column_name();
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1408);
					match(COMMA);
					setState(1409);
					column_name();
					}
					}
					setState(1414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1415);
				match(CLOSE_PAR);
				}
			}

			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1433);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1419);
					match(K_ON);
					setState(1420);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1429);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						setState(1421);
						match(K_SET);
						setState(1422);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1423);
						match(K_SET);
						setState(1424);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1425);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1426);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1427);
						match(K_NO);
						setState(1428);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1431);
					match(K_MATCH);
					setState(1432);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1440);
					match(K_NOT);
					}
				}

				setState(1443);
				match(K_DEFERRABLE);
				setState(1448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1444);
					match(K_INITIALLY);
					setState(1445);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1446);
					match(K_INITIALLY);
					setState(1447);
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
		enterRule(_localctx, 98, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(K_RAISE);
			setState(1453);
			match(OPEN_PAR);
			setState(1458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1454);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1455);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1456);
				match(COMMA);
				setState(1457);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1460);
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
		public Nf2_point_NotationContext nf2_point_Notation() {
			return getRuleContext(Nf2_point_NotationContext.class,0);
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
		enterRule(_localctx, 100, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1462);
				column_name();
				}
				break;
			case 2:
				{
				setState(1463);
				nf2_point_Notation();
				}
				break;
			}
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1466);
				match(K_COLLATE);
				setState(1467);
				collation_name();
				}
			}

			setState(1471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1470);
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
		public List<Nf2_point_NotationContext> nf2_point_Notation() {
			return getRuleContexts(Nf2_point_NotationContext.class);
		}
		public Nf2_point_NotationContext nf2_point_Notation(int i) {
			return getRuleContext(Nf2_point_NotationContext.class,i);
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
		enterRule(_localctx, 102, RULE_table_constraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1473);
				match(K_CONSTRAINT);
				setState(1474);
				name();
				}
			}

			setState(1519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1480);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1477);
					match(K_PRIMARY);
					setState(1478);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1479);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1482);
				match(OPEN_PAR);
				setState(1483);
				indexed_column();
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1484);
					match(COMMA);
					setState(1485);
					indexed_column();
					}
					}
					setState(1490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1491);
				match(CLOSE_PAR);
				setState(1492);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1494);
				match(K_CHECK);
				setState(1495);
				match(OPEN_PAR);
				setState(1496);
				expr(0);
				setState(1497);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1499);
				match(K_FOREIGN);
				setState(1500);
				match(K_KEY);
				setState(1501);
				match(OPEN_PAR);
				setState(1504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1502);
					column_name();
					}
					break;
				case 2:
					{
					setState(1503);
					nf2_point_Notation();
					}
					break;
				}
				setState(1510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1506);
						match(COMMA);
						setState(1507);
						column_name();
						}
						} 
					}
					setState(1512);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				}
				{
				setState(1513);
				match(COMMA);
				setState(1514);
				nf2_point_Notation();
				}
				setState(1516);
				match(CLOSE_PAR);
				setState(1517);
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
		enterRule(_localctx, 104, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			match(K_WITH);
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1522);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1525);
			cte_table_name();
			setState(1526);
			match(K_AS);
			setState(1527);
			match(OPEN_PAR);
			setState(1528);
			select_stmt();
			setState(1529);
			match(CLOSE_PAR);
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1530);
				match(COMMA);
				setState(1531);
				cte_table_name();
				setState(1532);
				match(K_AS);
				setState(1533);
				match(OPEN_PAR);
				setState(1534);
				select_stmt();
				setState(1535);
				match(CLOSE_PAR);
				}
				}
				setState(1541);
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
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public List<Subtable_nameContext> subtable_name() {
			return getRuleContexts(Subtable_nameContext.class);
		}
		public Subtable_nameContext subtable_name(int i) {
			return getRuleContext(Subtable_nameContext.class,i);
		}
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
		enterRule(_localctx, 106, RULE_qualified_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			table_name();
			setState(1547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1543);
				match(DOT);
				setState(1544);
				subtable_name();
				}
				}
				setState(1549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1550);
				match(K_INDEXED);
				setState(1551);
				match(K_BY);
				setState(1552);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1553);
				match(K_NOT);
				setState(1554);
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
		enterRule(_localctx, 108, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			expr(0);
			setState(1560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1558);
				match(K_COLLATE);
				setState(1559);
				collation_name();
				}
			}

			setState(1563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1562);
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
		enterRule(_localctx, 110, RULE_pragma_value);
		try {
			setState(1568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1565);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1567);
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
		public List<Nf2_point_NotationContext> nf2_point_Notation() {
			return getRuleContexts(Nf2_point_NotationContext.class);
		}
		public Nf2_point_NotationContext nf2_point_Notation(int i) {
			return getRuleContext(Nf2_point_NotationContext.class,i);
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
		enterRule(_localctx, 112, RULE_common_table_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			table_name();
			setState(1592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1571);
				match(OPEN_PAR);
				setState(1574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1572);
					column_name();
					}
					break;
				case 2:
					{
					setState(1573);
					nf2_point_Notation();
					}
					break;
				}
				setState(1580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1576);
						match(COMMA);
						setState(1577);
						column_name();
						}
						} 
					}
					setState(1582);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
				}
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1583);
					match(COMMA);
					setState(1584);
					nf2_point_Notation();
					}
					}
					setState(1589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1590);
				match(CLOSE_PAR);
				}
			}

			setState(1594);
			match(K_AS);
			setState(1595);
			match(OPEN_PAR);
			setState(1596);
			select_stmt();
			setState(1597);
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
		public Un_nest_stmtContext un_nest_stmt() {
			return getRuleContext(Un_nest_stmtContext.class,0);
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
		enterRule(_localctx, 114, RULE_result_column);
		int _la;
		try {
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1599);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1600);
					un_nest_stmt();
					}
					break;
				case 2:
					{
					setState(1601);
					expr(0);
					}
					break;
				}
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1605);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1604);
						match(K_AS);
						}
					}

					setState(1607);
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

	public static class Un_nest_stmtContext extends ParserRuleContext {
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEST() { return getToken(SQLiteParser.K_NEST, 0); }
		public TerminalNode K_UNNEST() { return getToken(SQLiteParser.K_UNNEST, 0); }
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Un_nest_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_un_nest_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUn_nest_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUn_nest_stmt(this);
		}
	}

	public final Un_nest_stmtContext un_nest_stmt() throws RecognitionException {
		Un_nest_stmtContext _localctx = new Un_nest_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_un_nest_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			_la = _input.LA(1);
			if ( !(_la==K_NEST || _la==K_UNNEST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1613);
			table_name();
			setState(1616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1614);
				match(DOT);
				setState(1615);
				table_name();
				}
			}

			setState(1618);
			match(K_ON);
			setState(1619);
			match(OPEN_PAR);
			setState(1620);
			result_column();
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1621);
				match(COMMA);
				setState(1622);
				result_column();
				}
				}
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1628);
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Nf2_point_NotationContext nf2_point_Notation() {
			return getRuleContext(Nf2_point_NotationContext.class,0);
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
		enterRule(_localctx, 118, RULE_table_or_subquery);
		int _la;
		try {
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1630);
				table_name();
				setState(1635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1631);
					match(DOT);
					setState(1632);
					column_name();
					}
					break;
				case 2:
					{
					setState(1633);
					match(DOT);
					setState(1634);
					nf2_point_Notation();
					}
					break;
				}
				setState(1641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1638);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
					case 1:
						{
						setState(1637);
						match(K_AS);
						}
						break;
					}
					setState(1640);
					table_alias();
					}
					break;
				}
				setState(1648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1643);
					match(K_INDEXED);
					setState(1644);
					match(K_BY);
					setState(1645);
					index_name();
					}
					break;
				case 2:
					{
					setState(1646);
					match(K_NOT);
					setState(1647);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1650);
				match(OPEN_PAR);
				setState(1660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1651);
					table_or_subquery();
					setState(1656);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1652);
						match(COMMA);
						setState(1653);
						table_or_subquery();
						}
						}
						setState(1658);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1659);
					join_clause();
					}
					break;
				}
				setState(1662);
				match(CLOSE_PAR);
				setState(1667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1664);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
					case 1:
						{
						setState(1663);
						match(K_AS);
						}
						break;
					}
					setState(1666);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1669);
				match(OPEN_PAR);
				setState(1670);
				select_stmt();
				setState(1671);
				match(CLOSE_PAR);
				setState(1676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1673);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
					case 1:
						{
						setState(1672);
						match(K_AS);
						}
						break;
					}
					setState(1675);
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
		enterRule(_localctx, 120, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			table_or_subquery();
			setState(1688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1681);
					join_operator();
					setState(1682);
					table_or_subquery();
					setState(1684);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
					case 1:
						{
						setState(1683);
						join_constraint();
						}
						break;
					}
					}
					} 
				}
				setState(1690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
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
		enterRule(_localctx, 122, RULE_join_operator);
		int _la;
		try {
			setState(1704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1691);
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
				setState(1693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1692);
					match(K_NATURAL);
					}
				}

				setState(1701);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1695);
					match(K_LEFT);
					setState(1697);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1696);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1699);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1700);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1703);
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
		public List<Nf2_point_NotationContext> nf2_point_Notation() {
			return getRuleContexts(Nf2_point_NotationContext.class);
		}
		public Nf2_point_NotationContext nf2_point_Notation(int i) {
			return getRuleContext(Nf2_point_NotationContext.class,i);
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
		enterRule(_localctx, 124, RULE_join_constraint);
		int _la;
		try {
			int _alt;
			setState(1730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1706);
				match(K_ON);
				setState(1707);
				expr(0);
				}
				break;
			case K_USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1708);
				match(K_USING);
				setState(1709);
				match(OPEN_PAR);
				setState(1712);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1710);
					nf2_point_Notation();
					}
					break;
				case 2:
					{
					setState(1711);
					column_name();
					}
					break;
				}
				setState(1718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1714);
						match(COMMA);
						setState(1715);
						column_name();
						}
						} 
					}
					setState(1720);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
				}
				setState(1725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1721);
					match(COMMA);
					setState(1722);
					nf2_point_Notation();
					}
					}
					setState(1727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1728);
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

	public static class Group_byContext extends ParserRuleContext {
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public Group_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterGroup_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitGroup_by(this);
		}
	}

	public final Group_byContext group_by() throws RecognitionException {
		Group_byContext _localctx = new Group_byContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_group_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			match(K_GROUP);
			setState(1733);
			match(K_BY);
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
			setState(1744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_HAVING) {
				{
				setState(1742);
				match(K_HAVING);
				setState(1743);
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
		public Group_byContext group_by() {
			return getRuleContext(Group_byContext.class,0);
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
		enterRule(_localctx, 128, RULE_select_core);
		int _la;
		try {
			setState(1806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1746);
				match(K_SELECT);
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(1747);
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
				setState(1750);
				result_column();
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1751);
					match(COMMA);
					setState(1752);
					result_column();
					}
					}
					setState(1757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1758);
					match(K_FROM);
					setState(1768);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
					case 1:
						{
						setState(1759);
						table_or_subquery();
						setState(1764);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1760);
							match(COMMA);
							setState(1761);
							table_or_subquery();
							}
							}
							setState(1766);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1767);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1772);
					where_expr();
					}
				}

				setState(1776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1775);
					group_by();
					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1778);
				match(K_VALUES);
				setState(1779);
				match(OPEN_PAR);
				setState(1780);
				expr(0);
				setState(1785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1781);
					match(COMMA);
					setState(1782);
					expr(0);
					}
					}
					setState(1787);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1788);
				match(CLOSE_PAR);
				setState(1803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1789);
					match(COMMA);
					setState(1790);
					match(OPEN_PAR);
					setState(1791);
					expr(0);
					setState(1796);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1792);
						match(COMMA);
						setState(1793);
						expr(0);
						}
						}
						setState(1798);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1799);
					match(CLOSE_PAR);
					}
					}
					setState(1805);
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
		enterRule(_localctx, 130, RULE_compound_operator);
		try {
			setState(1813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1808);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1809);
				match(K_UNION);
				setState(1810);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1811);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1812);
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
		public List<Nf2_point_NotationContext> nf2_point_Notation() {
			return getRuleContexts(Nf2_point_NotationContext.class);
		}
		public Nf2_point_NotationContext nf2_point_Notation(int i) {
			return getRuleContext(Nf2_point_NotationContext.class,i);
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
		enterRule(_localctx, 132, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			table_name();
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1816);
				match(OPEN_PAR);
				setState(1819);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(1817);
					column_name();
					}
					break;
				case 2:
					{
					setState(1818);
					nf2_point_Notation();
					}
					break;
				}
				setState(1826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << COMMA) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(1824);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						setState(1821);
						match(COMMA);
						setState(1822);
						column_name();
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
						setState(1823);
						nf2_point_Notation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1828);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1829);
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
		enterRule(_localctx, 134, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1833);
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

			setState(1836);
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
		enterRule(_localctx, 136, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (K_CURRENT_DATE - 54)) | (1L << (K_CURRENT_TIME - 54)) | (1L << (K_CURRENT_TIMESTAMP - 54)) | (1L << (K_NULL - 54)))) != 0) || ((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & ((1L << (NUMERIC_LITERAL - 168)) | (1L << (STRING_LITERAL - 168)) | (1L << (BLOB_LITERAL - 168)))) != 0)) ) {
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
		enterRule(_localctx, 138, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
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
		enterRule(_localctx, 140, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
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
		enterRule(_localctx, 142, RULE_module_argument);
		try {
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1844);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1845);
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
		enterRule(_localctx, 144, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
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
		enterRule(_localctx, 146, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (K_ABORT - 27)) | (1L << (K_ACTION - 27)) | (1L << (K_ADD - 27)) | (1L << (K_AFTER - 27)) | (1L << (K_ALL - 27)) | (1L << (K_ALTER - 27)) | (1L << (K_ANALYZE - 27)) | (1L << (K_AND - 27)) | (1L << (K_AS - 27)) | (1L << (K_ASC - 27)) | (1L << (K_ATTACH - 27)) | (1L << (K_AUTOINCREMENT - 27)) | (1L << (K_BEFORE - 27)) | (1L << (K_BEGIN - 27)) | (1L << (K_BETWEEN - 27)) | (1L << (K_BY - 27)) | (1L << (K_CASCADE - 27)) | (1L << (K_CASE - 27)) | (1L << (K_CAST - 27)) | (1L << (K_CHECK - 27)) | (1L << (K_COLLATE - 27)) | (1L << (K_COLUMN - 27)) | (1L << (K_COMMIT - 27)) | (1L << (K_CONFLICT - 27)) | (1L << (K_CONSTRAINT - 27)) | (1L << (K_CREATE - 27)) | (1L << (K_CROSS - 27)) | (1L << (K_CURRENT_DATE - 27)) | (1L << (K_CURRENT_TIME - 27)) | (1L << (K_CURRENT_TIMESTAMP - 27)) | (1L << (K_DATABASE - 27)) | (1L << (K_DEFAULT - 27)) | (1L << (K_DEFERRABLE - 27)) | (1L << (K_DEFERRED - 27)) | (1L << (K_DELETE - 27)) | (1L << (K_DESC - 27)) | (1L << (K_DETACH - 27)) | (1L << (K_DISTINCT - 27)) | (1L << (K_DROP - 27)) | (1L << (K_EACH - 27)) | (1L << (K_ELSE - 27)) | (1L << (K_END - 27)) | (1L << (K_ESCAPE - 27)) | (1L << (K_EXCEPT - 27)) | (1L << (K_EXCLUSIVE - 27)) | (1L << (K_EXISTS - 27)) | (1L << (K_EXPLAIN - 27)) | (1L << (K_FAIL - 27)) | (1L << (K_FOR - 27)) | (1L << (K_FOREIGN - 27)) | (1L << (K_FROM - 27)) | (1L << (K_FULL - 27)) | (1L << (K_GLOB - 27)) | (1L << (K_GROUP - 27)) | (1L << (K_HAVING - 27)) | (1L << (K_IF - 27)) | (1L << (K_IGNORE - 27)) | (1L << (K_IMMEDIATE - 27)) | (1L << (K_IN - 27)) | (1L << (K_INDEX - 27)) | (1L << (K_INDEXED - 27)) | (1L << (K_INITIALLY - 27)) | (1L << (K_INNER - 27)) | (1L << (K_INSERT - 27)))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_INSTEAD - 91)) | (1L << (K_INTERSECT - 91)) | (1L << (K_INTO - 91)) | (1L << (K_IS - 91)) | (1L << (K_ISNULL - 91)) | (1L << (K_JOIN - 91)) | (1L << (K_KEY - 91)) | (1L << (K_LEFT - 91)) | (1L << (K_LIKE - 91)) | (1L << (K_LIMIT - 91)) | (1L << (K_MATCH - 91)) | (1L << (K_NATURAL - 91)) | (1L << (K_NO - 91)) | (1L << (K_NOT - 91)) | (1L << (K_NOTNULL - 91)) | (1L << (K_NULL - 91)) | (1L << (K_OF - 91)) | (1L << (K_OFFSET - 91)) | (1L << (K_ON - 91)) | (1L << (K_OR - 91)) | (1L << (K_ORDER - 91)) | (1L << (K_OUTER - 91)) | (1L << (K_PLAN - 91)) | (1L << (K_PRAGMA - 91)) | (1L << (K_PRIMARY - 91)) | (1L << (K_QUERY - 91)) | (1L << (K_RAISE - 91)) | (1L << (K_RECURSIVE - 91)) | (1L << (K_REFERENCES - 91)) | (1L << (K_REGEXP - 91)) | (1L << (K_REINDEX - 91)) | (1L << (K_RELEASE - 91)) | (1L << (K_RENAME - 91)) | (1L << (K_REPLACE - 91)) | (1L << (K_RESTRICT - 91)) | (1L << (K_RIGHT - 91)) | (1L << (K_ROLLBACK - 91)) | (1L << (K_ROW - 91)) | (1L << (K_SAVEPOINT - 91)) | (1L << (K_SELECT - 91)) | (1L << (K_SET - 91)) | (1L << (K_TABLE - 91)) | (1L << (K_TEMP - 91)) | (1L << (K_TEMPORARY - 91)) | (1L << (K_THEN - 91)) | (1L << (K_TO - 91)) | (1L << (K_TRANSACTION - 91)) | (1L << (K_TRIGGER - 91)) | (1L << (K_UNION - 91)) | (1L << (K_UNIQUE - 91)) | (1L << (K_UPDATE - 91)) | (1L << (K_USING - 91)) | (1L << (K_VACUUM - 91)) | (1L << (K_VALUES - 91)) | (1L << (K_VIEW - 91)) | (1L << (K_VIRTUAL - 91)) | (1L << (K_WHEN - 91)) | (1L << (K_WHERE - 91)) | (1L << (K_WITH - 91)) | (1L << (K_WITHOUT - 91)))) != 0)) ) {
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

	public static class Nf2_point_NotationContext extends ParserRuleContext {
		public Name_of_subtableContext name_of_subtable() {
			return getRuleContext(Name_of_subtableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Subtable_column_nameContext subtable_column_name() {
			return getRuleContext(Subtable_column_nameContext.class,0);
		}
		public Nf2_point_NotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nf2_point_Notation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterNf2_point_Notation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitNf2_point_Notation(this);
		}
	}

	public final Nf2_point_NotationContext nf2_point_Notation() throws RecognitionException {
		Nf2_point_NotationContext _localctx = new Nf2_point_NotationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_nf2_point_Notation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			name_of_subtable();
			setState(1853);
			match(DOT);
			setState(1854);
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
		enterRule(_localctx, 150, RULE_name_of_subtable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			subtable_name();
			setState(1861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1857);
					match(DOT);
					setState(1858);
					subtable_name();
					}
					} 
				}
				setState(1863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
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
		enterRule(_localctx, 152, RULE_subtable_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
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
		enterRule(_localctx, 154, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
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
		enterRule(_localctx, 156, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
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

	public static class AggregateContext extends ParserRuleContext {
		public TerminalNode K_AVG() { return getToken(SQLiteParser.K_AVG, 0); }
		public TerminalNode K_EVERY() { return getToken(SQLiteParser.K_EVERY, 0); }
		public TerminalNode K_ANY() { return getToken(SQLiteParser.K_ANY, 0); }
		public TerminalNode K_COUNT() { return getToken(SQLiteParser.K_COUNT, 0); }
		public TerminalNode K_LISTAGG() { return getToken(SQLiteParser.K_LISTAGG, 0); }
		public TerminalNode K_MAX() { return getToken(SQLiteParser.K_MAX, 0); }
		public TerminalNode K_MIN() { return getToken(SQLiteParser.K_MIN, 0); }
		public TerminalNode K_SUM() { return getToken(SQLiteParser.K_SUM, 0); }
		public TerminalNode K_SELECTIVITY() { return getToken(SQLiteParser.K_SELECTIVITY, 0); }
		public TerminalNode K_RANK() { return getToken(SQLiteParser.K_RANK, 0); }
		public TerminalNode K_MEDIAN() { return getToken(SQLiteParser.K_MEDIAN, 0); }
		public TerminalNode K_MODE() { return getToken(SQLiteParser.K_MODE, 0); }
		public TerminalNode K_ENVELOPE() { return getToken(SQLiteParser.K_ENVELOPE, 0); }
		public TerminalNode K_CARDINALITY() { return getToken(SQLiteParser.K_CARDINALITY, 0); }
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAggregate(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			_la = _input.LA(1);
			if ( !(((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (K_AVG - 153)) | (1L << (K_EVERY - 153)) | (1L << (K_ANY - 153)) | (1L << (K_COUNT - 153)) | (1L << (K_LISTAGG - 153)) | (1L << (K_MAX - 153)) | (1L << (K_MIN - 153)) | (1L << (K_SUM - 153)) | (1L << (K_SELECTIVITY - 153)) | (1L << (K_RANK - 153)) | (1L << (K_MEDIAN - 153)) | (1L << (K_MODE - 153)) | (1L << (K_ENVELOPE - 153)) | (1L << (K_CARDINALITY - 153)))) != 0)) ) {
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
		enterRule(_localctx, 160, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
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
		enterRule(_localctx, 162, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1874);
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
		enterRule(_localctx, 164, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
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
		enterRule(_localctx, 166, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
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
		enterRule(_localctx, 168, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
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
		enterRule(_localctx, 170, RULE_subtable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1882);
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
		enterRule(_localctx, 172, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
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
		enterRule(_localctx, 174, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
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
		enterRule(_localctx, 176, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
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
		enterRule(_localctx, 178, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
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
		enterRule(_localctx, 180, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
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
		enterRule(_localctx, 182, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
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
		enterRule(_localctx, 184, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
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
		enterRule(_localctx, 186, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
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
		enterRule(_localctx, 188, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
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
		enterRule(_localctx, 190, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
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
		enterRule(_localctx, 192, RULE_any_name);
		try {
			setState(1911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1904);
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
				setState(1905);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1906);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1907);
				match(OPEN_PAR);
				setState(1908);
				any_name();
				setState(1909);
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
		case 47:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b1\u077c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\3\2\7\2\u00c7\n\2\f\2\16\2\u00ca\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\7\4\u00d2\n\4\f\4\16\4\u00d5\13\4\3\4\3\4\6\4\u00d9\n\4\r"+
		"\4\16\4\u00da\3\4\7\4\u00de\n\4\f\4\16\4\u00e1\13\4\3\4\7\4\u00e4\n\4"+
		"\f\4\16\4\u00e7\13\4\3\5\3\5\3\5\5\5\u00ec\n\5\5\5\u00ee\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u010e\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0115\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u011d\n\6\3\6\5\6\u0120"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0129\n\7\3\b\3\b\5\b\u012d\n\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\5\t\u0135\n\t\3\t\3\t\5\t\u0139\n\t\5\t\u013b\n"+
		"\t\3\n\3\n\3\n\5\n\u0140\n\n\5\n\u0142\n\n\3\13\3\13\5\13\u0146\n\13\3"+
		"\13\3\13\3\13\7\13\u014b\n\13\f\13\16\13\u014e\13\13\5\13\u0150\n\13\3"+
		"\13\3\13\3\13\5\13\u0155\n\13\3\13\3\13\5\13\u0159\n\13\3\13\6\13\u015c"+
		"\n\13\r\13\16\13\u015d\3\13\3\13\3\13\3\13\3\13\7\13\u0165\n\13\f\13\16"+
		"\13\u0168\13\13\5\13\u016a\n\13\3\13\3\13\3\13\3\13\5\13\u0170\n\13\5"+
		"\13\u0172\n\13\3\f\3\f\5\f\u0176\n\f\3\f\3\f\3\f\3\f\5\f\u017c\n\f\3\f"+
		"\3\f\3\f\5\f\u0181\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u018a\n\f\f\f\16"+
		"\f\u018d\13\f\3\f\3\f\5\f\u0191\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u019a"+
		"\n\r\3\r\3\r\3\r\3\r\7\r\u01a0\n\r\f\r\16\r\u01a3\13\r\3\r\3\r\3\r\3\16"+
		"\3\16\5\16\u01aa\n\16\3\16\3\16\3\16\3\16\5\16\u01b0\n\16\3\16\3\16\3"+
		"\16\5\16\u01b5\n\16\3\16\3\16\3\16\3\16\5\16\u01bb\n\16\3\16\3\16\3\16"+
		"\5\16\u01c0\n\16\7\16\u01c2\n\16\f\16\16\16\u01c5\13\16\3\16\3\16\7\16"+
		"\u01c9\n\16\f\16\16\16\u01cc\13\16\3\16\3\16\3\16\5\16\u01d1\n\16\3\16"+
		"\3\16\5\16\u01d5\n\16\3\17\3\17\5\17\u01d9\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u01df\n\17\3\17\3\17\3\17\5\17\u01e4\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u01eb\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01f4\n\17\f"+
		"\17\16\17\u01f7\13\17\5\17\u01f9\n\17\5\17\u01fb\n\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0201\n\17\3\17\3\17\3\17\3\17\5\17\u0207\n\17\3\17\3\17\5\17"+
		"\u020b\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u0212\n\17\3\17\3\17\6\17\u0216"+
		"\n\17\r\17\16\17\u0217\3\17\3\17\3\20\3\20\5\20\u021e\n\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0224\n\20\3\20\3\20\3\20\5\20\u0229\n\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0235\n\21\3\21\3\21\3\21\5\21"+
		"\u023a\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0243\n\21\f\21\16"+
		"\21\u0246\13\21\3\21\3\21\5\21\u024a\n\21\3\22\5\22\u024d\n\22\3\22\3"+
		"\22\3\22\3\22\5\22\u0253\n\22\3\23\5\23\u0256\n\23\3\23\3\23\3\23\3\23"+
		"\5\23\u025c\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u0263\n\23\f\23\16\23\u0266"+
		"\13\23\5\23\u0268\n\23\3\23\3\23\3\23\3\23\5\23\u026e\n\23\5\23\u0270"+
		"\n\23\3\24\3\24\3\24\3\25\3\25\5\25\u0277\n\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\5\26\u027f\n\26\3\26\3\26\3\26\5\26\u0284\n\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\5\27\u028c\n\27\3\27\3\27\3\27\5\27\u0291\n\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\5\30\u0299\n\30\3\30\3\30\3\30\5\30\u029e\n\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\5\31\u02a6\n\31\3\31\3\31\3\31\5\31\u02ab"+
		"\n\31\3\31\3\31\3\32\3\32\5\32\u02b1\n\32\3\32\3\32\3\32\7\32\u02b6\n"+
		"\32\f\32\16\32\u02b9\13\32\5\32\u02bb\n\32\3\32\3\32\3\32\3\32\7\32\u02c1"+
		"\n\32\f\32\16\32\u02c4\13\32\3\32\3\32\3\32\3\32\3\32\7\32\u02cb\n\32"+
		"\f\32\16\32\u02ce\13\32\5\32\u02d0\n\32\3\32\3\32\3\32\3\32\5\32\u02d6"+
		"\n\32\5\32\u02d8\n\32\3\33\5\33\u02db\n\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02ee"+
		"\n\33\3\33\3\33\3\33\3\33\5\33\u02f4\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u0300\n\33\f\33\16\33\u0303\13\33\3\33\3\33"+
		"\3\33\5\33\u0308\n\33\3\34\3\34\3\34\5\34\u030d\n\34\3\34\3\34\3\34\3"+
		"\34\5\34\u0313\n\34\7\34\u0315\n\34\f\34\16\34\u0318\13\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0328"+
		"\n\36\3\37\3\37\3\37\3\37\5\37\u032e\n\37\3\37\3\37\3\37\5\37\u0333\n"+
		"\37\7\37\u0335\n\37\f\37\16\37\u0338\13\37\3\37\3\37\5\37\u033c\n\37\3"+
		" \3 \3 \3 \5 \u0342\n \3 \3 \3 \3 \3 \3 \3 \5 \u034b\n \3!\3!\3!\3!\3"+
		"!\5!\u0352\n!\3!\3!\5!\u0356\n!\5!\u0358\n!\3\"\3\"\5\"\u035c\n\"\3\""+
		"\3\"\3#\3#\3#\5#\u0363\n#\5#\u0365\n#\3#\3#\5#\u0369\n#\3#\5#\u036c\n"+
		"#\3$\3$\3$\3%\3%\5%\u0373\n%\3%\3%\3%\7%\u0378\n%\f%\16%\u037b\13%\5%"+
		"\u037d\n%\3%\3%\3%\3%\3%\3%\7%\u0385\n%\f%\16%\u0388\13%\5%\u038a\n%\3"+
		"%\3%\3%\3%\5%\u0390\n%\5%\u0392\n%\3&\3&\5&\u0396\n&\3&\3&\3&\7&\u039b"+
		"\n&\f&\16&\u039e\13&\5&\u03a0\n&\3&\3&\3&\3&\7&\u03a6\n&\f&\16&\u03a9"+
		"\13&\3&\3&\3&\3&\3&\7&\u03b0\n&\f&\16&\u03b3\13&\5&\u03b5\n&\3&\3&\3&"+
		"\3&\5&\u03bb\n&\5&\u03bd\n&\3\'\3\'\5\'\u03c1\n\'\3\'\3\'\3\'\7\'\u03c6"+
		"\n\'\f\'\16\'\u03c9\13\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u03d1\n\'\f\'\16"+
		"\'\u03d4\13\'\5\'\u03d6\n\'\5\'\u03d8\n\'\3\'\5\'\u03db\n\'\3\'\5\'\u03de"+
		"\n\'\3\'\5\'\u03e1\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u03e8\n\'\f\'\16\'\u03eb"+
		"\13\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u03f3\n\'\f\'\16\'\u03f6\13\'\3\'\3"+
		"\'\7\'\u03fa\n\'\f\'\16\'\u03fd\13\'\5\'\u03ff\n\'\3(\5(\u0402\n(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u040f\n(\3(\3(\3(\3(\3(\7(\u0416\n(\f"+
		"(\16(\u0419\13(\3(\5(\u041c\n(\3)\3)\3)\5)\u0421\n)\3)\3)\3)\3)\5)\u0427"+
		"\n)\3*\3*\5*\u042b\n*\3*\3*\5*\u042f\n*\3*\3*\3+\5+\u0434\n+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0441\n+\3+\3+\3+\3+\3+\7+\u0448\n+\f+\16"+
		"+\u044b\13+\3+\5+\u044e\n+\3+\3+\3+\3+\3+\7+\u0455\n+\f+\16+\u0458\13"+
		"+\5+\u045a\n+\3+\3+\3+\3+\5+\u0460\n+\5+\u0462\n+\3,\3,\3-\3-\5-\u0468"+
		"\n-\3-\7-\u046b\n-\f-\16-\u046e\13-\3.\6.\u0471\n.\r.\16.\u0472\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\5.\u047f\n.\3/\3/\5/\u0483\n/\3/\3/\3/\5/\u0488"+
		"\n/\3/\3/\5/\u048c\n/\3/\5/\u048f\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\5/\u04a1\n/\3/\3/\3/\5/\u04a6\n/\3\60\3\60\3\60\5\60\u04ab"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u04b4\n\61\3\61\5\61\u04b7"+
		"\n\61\3\61\3\61\7\61\u04bb\n\61\f\61\16\61\u04be\13\61\3\61\5\61\u04c1"+
		"\n\61\3\61\5\61\u04c4\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u04cc\n"+
		"\61\3\61\3\61\3\61\7\61\u04d1\n\61\f\61\16\61\u04d4\13\61\3\61\5\61\u04d7"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u04de\n\61\3\61\3\61\3\61\7\61\u04e3"+
		"\n\61\f\61\16\61\u04e6\13\61\3\61\5\61\u04e9\n\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u04f9\n\61\3\61"+
		"\5\61\u04fc\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0504\n\61\3\61\3"+
		"\61\3\61\3\61\3\61\6\61\u050b\n\61\r\61\16\61\u050c\3\61\3\61\5\61\u0511"+
		"\n\61\3\61\3\61\3\61\5\61\u0516\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0534\n\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0540\n\61\3\61\3\61\3\61\5\61\u0545"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0551\n\61"+
		"\3\61\3\61\3\61\3\61\5\61\u0557\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u055e"+
		"\n\61\3\61\3\61\5\61\u0562\n\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u056a"+
		"\n\61\f\61\16\61\u056d\13\61\5\61\u056f\n\61\3\61\3\61\3\61\3\61\5\61"+
		"\u0575\n\61\3\61\5\61\u0578\n\61\7\61\u057a\n\61\f\61\16\61\u057d\13\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0585\n\62\f\62\16\62\u0588\13\62"+
		"\3\62\3\62\5\62\u058c\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0598\n\62\3\62\3\62\5\62\u059c\n\62\7\62\u059e\n\62\f\62\16"+
		"\62\u05a1\13\62\3\62\5\62\u05a4\n\62\3\62\3\62\3\62\3\62\3\62\5\62\u05ab"+
		"\n\62\5\62\u05ad\n\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u05b5\n\63\3"+
		"\63\3\63\3\64\3\64\5\64\u05bb\n\64\3\64\3\64\5\64\u05bf\n\64\3\64\5\64"+
		"\u05c2\n\64\3\65\3\65\5\65\u05c6\n\65\3\65\3\65\3\65\5\65\u05cb\n\65\3"+
		"\65\3\65\3\65\3\65\7\65\u05d1\n\65\f\65\16\65\u05d4\13\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u05e3\n\65"+
		"\3\65\3\65\7\65\u05e7\n\65\f\65\16\65\u05ea\13\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u05f2\n\65\3\66\3\66\5\66\u05f6\n\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0604\n\66\f\66\16\66"+
		"\u0607\13\66\3\67\3\67\3\67\7\67\u060c\n\67\f\67\16\67\u060f\13\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u0616\n\67\38\38\38\58\u061b\n8\38\58\u061e"+
		"\n8\39\39\39\59\u0623\n9\3:\3:\3:\3:\5:\u0629\n:\3:\3:\7:\u062d\n:\f:"+
		"\16:\u0630\13:\3:\3:\7:\u0634\n:\f:\16:\u0637\13:\3:\3:\5:\u063b\n:\3"+
		":\3:\3:\3:\3:\3;\3;\3;\5;\u0645\n;\3;\5;\u0648\n;\3;\5;\u064b\n;\5;\u064d"+
		"\n;\3<\3<\3<\3<\5<\u0653\n<\3<\3<\3<\3<\3<\7<\u065a\n<\f<\16<\u065d\13"+
		"<\3<\3<\3=\3=\3=\3=\3=\5=\u0666\n=\3=\5=\u0669\n=\3=\5=\u066c\n=\3=\3"+
		"=\3=\3=\3=\5=\u0673\n=\3=\3=\3=\3=\7=\u0679\n=\f=\16=\u067c\13=\3=\5="+
		"\u067f\n=\3=\3=\5=\u0683\n=\3=\5=\u0686\n=\3=\3=\3=\3=\5=\u068c\n=\3="+
		"\5=\u068f\n=\5=\u0691\n=\3>\3>\3>\3>\5>\u0697\n>\7>\u0699\n>\f>\16>\u069c"+
		"\13>\3?\3?\5?\u06a0\n?\3?\3?\5?\u06a4\n?\3?\3?\5?\u06a8\n?\3?\5?\u06ab"+
		"\n?\3@\3@\3@\3@\3@\3@\5@\u06b3\n@\3@\3@\7@\u06b7\n@\f@\16@\u06ba\13@\3"+
		"@\3@\7@\u06be\n@\f@\16@\u06c1\13@\3@\3@\5@\u06c5\n@\3A\3A\3A\3A\3A\7A"+
		"\u06cc\nA\fA\16A\u06cf\13A\3A\3A\5A\u06d3\nA\3B\3B\5B\u06d7\nB\3B\3B\3"+
		"B\7B\u06dc\nB\fB\16B\u06df\13B\3B\3B\3B\3B\7B\u06e5\nB\fB\16B\u06e8\13"+
		"B\3B\5B\u06eb\nB\5B\u06ed\nB\3B\5B\u06f0\nB\3B\5B\u06f3\nB\3B\3B\3B\3"+
		"B\3B\7B\u06fa\nB\fB\16B\u06fd\13B\3B\3B\3B\3B\3B\3B\7B\u0705\nB\fB\16"+
		"B\u0708\13B\3B\3B\7B\u070c\nB\fB\16B\u070f\13B\5B\u0711\nB\3C\3C\3C\3"+
		"C\3C\5C\u0718\nC\3D\3D\3D\3D\5D\u071e\nD\3D\3D\3D\7D\u0723\nD\fD\16D\u0726"+
		"\13D\3D\3D\5D\u072a\nD\3E\5E\u072d\nE\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\5"+
		"I\u0739\nI\3J\3J\3K\3K\3L\3L\3L\3L\3M\3M\3M\7M\u0746\nM\fM\16M\u0749\13"+
		"M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3"+
		"Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3b\3b\3b"+
		"\3b\3b\5b\u077a\nb\3b\2\3`c\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\2\26\5\2>>IIVV\4\2\63\63FF"+
		"\4\2\t\tnn\3\2\u0087\u0088\4\2!!BB\4\2&&@@\7\2\35\35LLUU~~\u0081\u0081"+
		"\4\2\13\13\20\21\3\2\f\r\3\2\22\25\3\2\26\31\6\2QQeeggzz\4\2??\u008f\u008f"+
		"\5\2\35\35LL\u0081\u0081\3\2\u0099\u009a\6\28:ll\u00aa\u00aa\u00ac\u00ad"+
		"\4\2\f\16jj\4\2\u00a9\u00a9\u00ac\u00ac\3\2\35\u0098\3\2\u009b\u00a8\2"+
		"\u08a0\2\u00c8\3\2\2\2\4\u00cd\3\2\2\2\6\u00d3\3\2\2\2\b\u00ed\3\2\2\2"+
		"\n\u010f\3\2\2\2\f\u0121\3\2\2\2\16\u012a\3\2\2\2\20\u0132\3\2\2\2\22"+
		"\u013c\3\2\2\2\24\u014f\3\2\2\2\26\u0173\3\2\2\2\30\u0192\3\2\2\2\32\u01a7"+
		"\3\2\2\2\34\u01d6\3\2\2\2\36\u021b\3\2\2\2 \u022e\3\2\2\2\"\u024c\3\2"+
		"\2\2$\u0255\3\2\2\2&\u0271\3\2\2\2(\u0274\3\2\2\2*\u027a\3\2\2\2,\u0287"+
		"\3\2\2\2.\u0294\3\2\2\2\60\u02a1\3\2\2\2\62\u02ba\3\2\2\2\64\u02da\3\2"+
		"\2\2\66\u030c\3\2\2\28\u0319\3\2\2\2:\u0327\3\2\2\2<\u0329\3\2\2\2>\u033d"+
		"\3\2\2\2@\u034c\3\2\2\2B\u0359\3\2\2\2D\u035f\3\2\2\2F\u036d\3\2\2\2H"+
		"\u037c\3\2\2\2J\u039f\3\2\2\2L\u03fe\3\2\2\2N\u0401\3\2\2\2P\u0420\3\2"+
		"\2\2R\u042e\3\2\2\2T\u0433\3\2\2\2V\u0463\3\2\2\2X\u0465\3\2\2\2Z\u0470"+
		"\3\2\2\2\\\u0482\3\2\2\2^\u04aa\3\2\2\2`\u0515\3\2\2\2b\u057e\3\2\2\2"+
		"d\u05ae\3\2\2\2f\u05ba\3\2\2\2h\u05c5\3\2\2\2j\u05f3\3\2\2\2l\u0608\3"+
		"\2\2\2n\u0617\3\2\2\2p\u0622\3\2\2\2r\u0624\3\2\2\2t\u064c\3\2\2\2v\u064e"+
		"\3\2\2\2x\u0690\3\2\2\2z\u0692\3\2\2\2|\u06aa\3\2\2\2~\u06c4\3\2\2\2\u0080"+
		"\u06c6\3\2\2\2\u0082\u0710\3\2\2\2\u0084\u0717\3\2\2\2\u0086\u0719\3\2"+
		"\2\2\u0088\u072c\3\2\2\2\u008a\u0730\3\2\2\2\u008c\u0732\3\2\2\2\u008e"+
		"\u0734\3\2\2\2\u0090\u0738\3\2\2\2\u0092\u073a\3\2\2\2\u0094\u073c\3\2"+
		"\2\2\u0096\u073e\3\2\2\2\u0098\u0742\3\2\2\2\u009a\u074a\3\2\2\2\u009c"+
		"\u074c\3\2\2\2\u009e\u074e\3\2\2\2\u00a0\u0750\3\2\2\2\u00a2\u0752\3\2"+
		"\2\2\u00a4\u0754\3\2\2\2\u00a6\u0756\3\2\2\2\u00a8\u0758\3\2\2\2\u00aa"+
		"\u075a\3\2\2\2\u00ac\u075c\3\2\2\2\u00ae\u075e\3\2\2\2\u00b0\u0760\3\2"+
		"\2\2\u00b2\u0762\3\2\2\2\u00b4\u0764\3\2\2\2\u00b6\u0766\3\2\2\2\u00b8"+
		"\u0768\3\2\2\2\u00ba\u076a\3\2\2\2\u00bc\u076c\3\2\2\2\u00be\u076e\3\2"+
		"\2\2\u00c0\u0770\3\2\2\2\u00c2\u0779\3\2\2\2\u00c4\u00c7\5\6\4\2\u00c5"+
		"\u00c7\5\4\3\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cc\7\2\2\3\u00cc\3\3\2\2\2\u00cd\u00ce\7\u00b1"+
		"\2\2\u00ce\u00cf\b\3\1\2\u00cf\5\3\2\2\2\u00d0\u00d2\7\5\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00df\5\b\5\2\u00d7\u00d9\7\5"+
		"\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\5\b\5\2\u00dd\u00d8\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e5\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\7\5\2\2\u00e3\u00e2\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\7K\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00ec\7s\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u010d\3\2\2\2\u00ef"+
		"\u010e\5\n\6\2\u00f0\u010e\5\f\7\2\u00f1\u010e\5\16\b\2\u00f2\u010e\5"+
		"\20\t\2\u00f3\u010e\5\22\n\2\u00f4\u010e\5\24\13\2\u00f5\u010e\5\26\f"+
		"\2\u00f6\u010e\5\32\16\2\u00f7\u010e\5\34\17\2\u00f8\u010e\5\36\20\2\u00f9"+
		"\u010e\5 \21\2\u00fa\u010e\5\"\22\2\u00fb\u010e\5$\23\2\u00fc\u010e\5"+
		"(\25\2\u00fd\u010e\5*\26\2\u00fe\u010e\5,\27\2\u00ff\u010e\5.\30\2\u0100"+
		"\u010e\5\60\31\2\u0101\u010e\5\62\32\2\u0102\u010e\5\64\33\2\u0103\u010e"+
		"\5> \2\u0104\u010e\5@!\2\u0105\u010e\5B\"\2\u0106\u010e\5D#\2\u0107\u010e"+
		"\5F$\2\u0108\u010e\5H%\2\u0109\u010e\5J&\2\u010a\u010e\5N(\2\u010b\u010e"+
		"\5T+\2\u010c\u010e\5V,\2\u010d\u00ef\3\2\2\2\u010d\u00f0\3\2\2\2\u010d"+
		"\u00f1\3\2\2\2\u010d\u00f2\3\2\2\2\u010d\u00f3\3\2\2\2\u010d\u00f4\3\2"+
		"\2\2\u010d\u00f5\3\2\2\2\u010d\u00f6\3\2\2\2\u010d\u00f7\3\2\2\2\u010d"+
		"\u00f8\3\2\2\2\u010d\u00f9\3\2\2\2\u010d\u00fa\3\2\2\2\u010d\u00fb\3\2"+
		"\2\2\u010d\u00fc\3\2\2\2\u010d\u00fd\3\2\2\2\u010d\u00fe\3\2\2\2\u010d"+
		"\u00ff\3\2\2\2\u010d\u0100\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u0102\3\2"+
		"\2\2\u010d\u0103\3\2\2\2\u010d\u0104\3\2\2\2\u010d\u0105\3\2\2\2\u010d"+
		"\u0106\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2"+
		"\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"\t\3\2\2\2\u010f\u0110\7\"\2\2\u0110\u0114\7\u0086\2\2\u0111\u0112\5\u00a2"+
		"R\2\u0112\u0113\7\6\2\2\u0113\u0115\3\2\2\2\u0114\u0111\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011f\5\u00a4S\2\u0117\u0118"+
		"\7}\2\2\u0118\u0119\7\u008a\2\2\u0119\u0120\5\u00a8U\2\u011a\u011c\7\37"+
		"\2\2\u011b\u011d\7\62\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\5X-\2\u011f\u0117\3\2\2\2\u011f\u011a\3\2\2"+
		"\2\u0120\13\3\2\2\2\u0121\u0128\7#\2\2\u0122\u0129\5\u00a2R\2\u0123\u0129"+
		"\5\u00a6T\2\u0124\u0125\5\u00a2R\2\u0125\u0126\7\6\2\2\u0126\u0127\5\u00a6"+
		"T\2\u0127\u0129\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0123\3\2\2\2\u0128"+
		"\u0124\3\2\2\2\u0128\u0129\3\2\2\2\u0129\r\3\2\2\2\u012a\u012c\7\'\2\2"+
		"\u012b\u012d\7;\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u012f\5`\61\2\u012f\u0130\7%\2\2\u0130\u0131\5\u00a2R\2"+
		"\u0131\17\3\2\2\2\u0132\u0134\7*\2\2\u0133\u0135\t\2\2\2\u0134\u0133\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\u013a\3\2\2\2\u0136\u0138\7\u008b\2\2"+
		"\u0137\u0139\5\u00c0a\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u013b\3\2\2\2\u013b\21\3\2\2"+
		"\2\u013c\u0141\t\3\2\2\u013d\u013f\7\u008b\2\2\u013e\u0140\5\u00c0a\2"+
		"\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013d"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\23\3\2\2\2\u0143\u0145\7\u0097\2\2"+
		"\u0144\u0146\7x\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u014c\5r:\2\u0148\u0149\7\t\2\2\u0149\u014b\5r:\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0143\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u015b\5\u0082B\2\u0152\u0154"+
		"\7\u008d\2\2\u0153\u0155\7!\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2"+
		"\2\u0155\u0159\3\2\2\2\u0156\u0159\7^\2\2\u0157\u0159\7H\2\2\u0158\u0152"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\5\u0082B\2\u015b\u0158\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0169\3\2\2\2\u015f\u0160\7q\2\2\u0160"+
		"\u0161\7,\2\2\u0161\u0166\5n8\2\u0162\u0163\7\t\2\2\u0163\u0165\5n8\2"+
		"\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u015f\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u0171\3\2\2\2\u016b\u016c\7f\2\2\u016c\u016f\5`\61"+
		"\2\u016d\u016e\t\4\2\2\u016e\u0170\5`\61\2\u016f\u016d\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016b\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\25\3\2\2\2\u0173\u0175\7\66\2\2\u0174\u0176\7\u008e\2\2\u0175\u0174\3"+
		"\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017b\7X\2\2\u0178"+
		"\u0179\7T\2\2\u0179\u017a\7j\2\2\u017a\u017c\7J\2\2\u017b\u0178\3\2\2"+
		"\2\u017b\u017c\3\2\2\2\u017c\u0180\3\2\2\2\u017d\u017e\5\u00a2R\2\u017e"+
		"\u017f\7\6\2\2\u017f\u0181\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0183\5\u00b2Z\2\u0183\u0184\7o\2\2\u0184"+
		"\u0185\5\u00a4S\2\u0185\u0186\7\7\2\2\u0186\u018b\5f\64\2\u0187\u0188"+
		"\7\t\2\2\u0188\u018a\5f\64\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018e\u0190\7\b\2\2\u018f\u0191\5&\24\2\u0190\u018f\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\27\3\2\2\2\u0192\u0193\5\u00acW\2\u0193\u0194\7\u0085"+
		"\2\2\u0194\u0195\7\7\2\2\u0195\u0196\7\u0082\2\2\u0196\u0199\7\7\2\2\u0197"+
		"\u019a\5X-\2\u0198\u019a\5\30\r\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2"+
		"\2\2\u019a\u01a1\3\2\2\2\u019b\u019c\7\t\2\2\u019c\u01a0\5X-\2\u019d\u019e"+
		"\7\t\2\2\u019e\u01a0\5\30\r\2\u019f\u019b\3\2\2\2\u019f\u019d\3\2\2\2"+
		"\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4"+
		"\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7\b\2\2\u01a5\u01a6\7\b\2\2\u01a6"+
		"\31\3\2\2\2\u01a7\u01a9\7\66\2\2\u01a8\u01aa\t\5\2\2\u01a9\u01a8\3\2\2"+
		"\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01af\7\u0086\2\2\u01ac"+
		"\u01ad\7T\2\2\u01ad\u01ae\7j\2\2\u01ae\u01b0\7J\2\2\u01af\u01ac\3\2\2"+
		"\2\u01af\u01b0\3\2\2\2\u01b0\u01b4\3\2\2\2\u01b1\u01b2\5\u00a2R\2\u01b2"+
		"\u01b3\7\6\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01d4\5\u00a4S\2\u01b7\u01ba\7\7\2\2\u01b8"+
		"\u01bb\5X-\2\u01b9\u01bb\5\30\r\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2"+
		"\2\2\u01bb\u01c3\3\2\2\2\u01bc\u01bf\7\t\2\2\u01bd\u01c0\5X-\2\u01be\u01c0"+
		"\5\30\r\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c2\3\2\2\2"+
		"\u01c1\u01bc\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\u01ca\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\7\t\2\2\u01c7"+
		"\u01c9\5h\65\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2"+
		"\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01d0\7\b\2\2\u01ce\u01cf\7\u0098\2\2\u01cf\u01d1\7\u00a9\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d5\3\2\2\2\u01d2\u01d3\7%\2\2\u01d3"+
		"\u01d5\5J&\2\u01d4\u01b7\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\33\3\2\2\2"+
		"\u01d6\u01d8\7\66\2\2\u01d7\u01d9\t\5\2\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01de\7\u008c\2\2\u01db\u01dc\7T\2"+
		"\2\u01dc\u01dd\7j\2\2\u01dd\u01df\7J\2\2\u01de\u01db\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u01e3\3\2\2\2\u01e0\u01e1\5\u00a2R\2\u01e1\u01e2\7\6\2"+
		"\2\u01e2\u01e4\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01ea\5\u00b4[\2\u01e6\u01eb\7)\2\2\u01e7\u01eb\7 \2\2"+
		"\u01e8\u01e9\7]\2\2\u01e9\u01eb\7m\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7"+
		"\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01fa\3\2\2\2\u01ec"+
		"\u01fb\7?\2\2\u01ed\u01fb\7\\\2\2\u01ee\u01f8\7\u008f\2\2\u01ef\u01f0"+
		"\7m\2\2\u01f0\u01f5\5\u00aaV\2\u01f1\u01f2\7\t\2\2\u01f2\u01f4\5\u00aa"+
		"V\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01ef\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01ec\3\2\2\2\u01fa"+
		"\u01ed\3\2\2\2\u01fa\u01ee\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0200\7o"+
		"\2\2\u01fd\u01fe\5\u00a2R\2\u01fe\u01ff\7\6\2\2\u01ff\u0201\3\2\2\2\u0200"+
		"\u01fd\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0206\5\u00a4"+
		"S\2\u0203\u0204\7M\2\2\u0204\u0205\7D\2\2\u0205\u0207\7\u0082\2\2\u0206"+
		"\u0203\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0209\7\u0095"+
		"\2\2\u0209\u020b\5`\61\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u0215\7*\2\2\u020d\u0212\5N(\2\u020e\u0212\5\64\33"+
		"\2\u020f\u0212\5\"\22\2\u0210\u0212\5J&\2\u0211\u020d\3\2\2\2\u0211\u020e"+
		"\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0214\7\5\2\2\u0214\u0216\3\2\2\2\u0215\u0211\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021a\7F\2\2\u021a\35\3\2\2\2\u021b\u021d\7\66\2\2\u021c\u021e\t\5\2"+
		"\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0223"+
		"\7\u0093\2\2\u0220\u0221\7T\2\2\u0221\u0222\7j\2\2\u0222\u0224\7J\2\2"+
		"\u0223\u0220\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0228\3\2\2\2\u0225\u0226"+
		"\5\u00a2R\2\u0226\u0227\7\6\2\2\u0227\u0229\3\2\2\2\u0228\u0225\3\2\2"+
		"\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\5\u00b6\\\2\u022b"+
		"\u022c\7%\2\2\u022c\u022d\5J&\2\u022d\37\3\2\2\2\u022e\u022f\7\66\2\2"+
		"\u022f\u0230\7\u0094\2\2\u0230\u0234\7\u0086\2\2\u0231\u0232\7T\2\2\u0232"+
		"\u0233\7j\2\2\u0233\u0235\7J\2\2\u0234\u0231\3\2\2\2\u0234\u0235\3\2\2"+
		"\2\u0235\u0239\3\2\2\2\u0236\u0237\5\u00a2R\2\u0237\u0238\7\6\2\2\u0238"+
		"\u023a\3\2\2\2\u0239\u0236\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b\u023c\5\u00a4S\2\u023c\u023d\7\u0090\2\2\u023d\u0249\5\u00b8"+
		"]\2\u023e\u023f\7\7\2\2\u023f\u0244\5\u0090I\2\u0240\u0241\7\t\2\2\u0241"+
		"\u0243\5\u0090I\2\u0242\u0240\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0244\3\2\2\2\u0247"+
		"\u0248\7\b\2\2\u0248\u024a\3\2\2\2\u0249\u023e\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a!\3\2\2\2\u024b\u024d\5j\66\2\u024c\u024b\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7?\2\2\u024f\u0250\7O\2\2\u0250"+
		"\u0252\5l\67\2\u0251\u0253\5&\24\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253#\3\2\2\2\u0254\u0256\5j\66\2\u0255\u0254\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\7?\2\2\u0258\u0259\7O\2\2\u0259"+
		"\u025b\5l\67\2\u025a\u025c\5&\24\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c\u026f\3\2\2\2\u025d\u025e\7q\2\2\u025e\u025f\7,\2\2\u025f\u0264"+
		"\5n8\2\u0260\u0261\7\t\2\2\u0261\u0263\5n8\2\u0262\u0260\3\2\2\2\u0263"+
		"\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0268\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0267\u025d\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026a\7f\2\2\u026a\u026d\5`\61\2\u026b\u026c\t\4"+
		"\2\2\u026c\u026e\5`\61\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u0270\3\2\2\2\u026f\u0267\3\2\2\2\u026f\u0270\3\2\2\2\u0270%\3\2\2\2"+
		"\u0271\u0272\7\u0096\2\2\u0272\u0273\5`\61\2\u0273\'\3\2\2\2\u0274\u0276"+
		"\7A\2\2\u0275\u0277\7;\2\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u0279\5\u00a2R\2\u0279)\3\2\2\2\u027a\u027b\7C\2"+
		"\2\u027b\u027e\7X\2\2\u027c\u027d\7T\2\2\u027d\u027f\7J\2\2\u027e\u027c"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0283\3\2\2\2\u0280\u0281\5\u00a2R"+
		"\2\u0281\u0282\7\6\2\2\u0282\u0284\3\2\2\2\u0283\u0280\3\2\2\2\u0283\u0284"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\5\u00b2Z\2\u0286+\3\2\2\2\u0287"+
		"\u0288\7C\2\2\u0288\u028b\7\u0086\2\2\u0289\u028a\7T\2\2\u028a\u028c\7"+
		"J\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u0290\3\2\2\2\u028d"+
		"\u028e\5\u00a2R\2\u028e\u028f\7\6\2\2\u028f\u0291\3\2\2\2\u0290\u028d"+
		"\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\5\u00a4S"+
		"\2\u0293-\3\2\2\2\u0294\u0295\7C\2\2\u0295\u0298\7\u008c\2\2\u0296\u0297"+
		"\7T\2\2\u0297\u0299\7J\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029d\3\2\2\2\u029a\u029b\5\u00a2R\2\u029b\u029c\7\6\2\2\u029c\u029e"+
		"\3\2\2\2\u029d\u029a\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a0\5\u00b4[\2\u02a0/\3\2\2\2\u02a1\u02a2\7C\2\2\u02a2\u02a5\7\u0093"+
		"\2\2\u02a3\u02a4\7T\2\2\u02a4\u02a6\7J\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u02aa\3\2\2\2\u02a7\u02a8\5\u00a2R\2\u02a8\u02a9\7\6\2"+
		"\2\u02a9\u02ab\3\2\2\2\u02aa\u02a7\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac"+
		"\3\2\2\2\u02ac\u02ad\5\u00b6\\\2\u02ad\61\3\2\2\2\u02ae\u02b0\7\u0097"+
		"\2\2\u02af\u02b1\7x\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b7\5r:\2\u02b3\u02b4\7\t\2\2\u02b4\u02b6\5r:\2"+
		"\u02b5\u02b3\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8"+
		"\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02ae\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02c2\5\u0082B\2\u02bd\u02be"+
		"\5\u0084C\2\u02be\u02bf\5\u0082B\2\u02bf\u02c1\3\2\2\2\u02c0\u02bd\3\2"+
		"\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\u02cf\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c6\7q\2\2\u02c6\u02c7\7,\2"+
		"\2\u02c7\u02cc\5n8\2\u02c8\u02c9\7\t\2\2\u02c9\u02cb\5n8\2\u02ca\u02c8"+
		"\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02c5\3\2\2\2\u02cf\u02d0\3\2"+
		"\2\2\u02d0\u02d7\3\2\2\2\u02d1\u02d2\7f\2\2\u02d2\u02d5\5`\61\2\u02d3"+
		"\u02d4\t\4\2\2\u02d4\u02d6\5`\61\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2"+
		"\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d1\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\63\3\2\2\2\u02d9\u02db\5j\66\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2"+
		"\2\u02db\u02ed\3\2\2\2\u02dc\u02ee\7\\\2\2\u02dd\u02ee\7~\2\2\u02de\u02df"+
		"\7\\\2\2\u02df\u02e0\7p\2\2\u02e0\u02ee\7~\2\2\u02e1\u02e2\7\\\2\2\u02e2"+
		"\u02e3\7p\2\2\u02e3\u02ee\7\u0081\2\2\u02e4\u02e5\7\\\2\2\u02e5\u02e6"+
		"\7p\2\2\u02e6\u02ee\7\35\2\2\u02e7\u02e8\7\\\2\2\u02e8\u02e9\7p\2\2\u02e9"+
		"\u02ee\7L\2\2\u02ea\u02eb\7\\\2\2\u02eb\u02ec\7p\2\2\u02ec\u02ee\7U\2"+
		"\2\u02ed\u02dc\3\2\2\2\u02ed\u02dd\3\2\2\2\u02ed\u02de\3\2\2\2\u02ed\u02e1"+
		"\3\2\2\2\u02ed\u02e4\3\2\2\2\u02ed\u02e7\3\2\2\2\u02ed\u02ea\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f3\7_\2\2\u02f0\u02f1\5\u00a2R\2\u02f1\u02f2\7"+
		"\6\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02f0\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u0307\5<\37\2\u02f6\u02f7\7\u0092\2\2\u02f7\u02f8"+
		"\7\7\2\2\u02f8\u02f9\5\66\34\2\u02f9\u0301\7\b\2\2\u02fa\u02fb\7\t\2\2"+
		"\u02fb\u02fc\7\7\2\2\u02fc\u02fd\5\66\34\2\u02fd\u02fe\7\b\2\2\u02fe\u0300"+
		"\3\2\2\2\u02ff\u02fa\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u0308\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0308\5J"+
		"&\2\u0305\u0306\7<\2\2\u0306\u0308\7\u0092\2\2\u0307\u02f6\3\2\2\2\u0307"+
		"\u0304\3\2\2\2\u0307\u0305\3\2\2\2\u0308\65\3\2\2\2\u0309\u030d\58\35"+
		"\2\u030a\u030d\5:\36\2\u030b\u030d\5`\61\2\u030c\u0309\3\2\2\2\u030c\u030a"+
		"\3\2\2\2\u030c\u030b\3\2\2\2\u030d\u0316\3\2\2\2\u030e\u0312\7\t\2\2\u030f"+
		"\u0313\58\35\2\u0310\u0313\5:\36\2\u0311\u0313\5`\61\2\u0312\u030f\3\2"+
		"\2\2\u0312\u0310\3\2\2\2\u0312\u0311\3\2\2\2\u0313\u0315\3\2\2\2\u0314"+
		"\u030e\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2"+
		"\2\2\u0317\67\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031a\7\u0082\2\2\u031a"+
		"\u031b\7\7\2\2\u031b\u031c\5\66\34\2\u031c\u031d\7\b\2\2\u031d9\3\2\2"+
		"\2\u031e\u031f\7\u0085\2\2\u031f\u0320\7\7\2\2\u0320\u0321\5\66\34\2\u0321"+
		"\u0322\7\b\2\2\u0322\u0328\3\2\2\2\u0323\u0324\7\3\2\2\u0324\u0325\5\66"+
		"\34\2\u0325\u0326\7\4\2\2\u0326\u0328\3\2\2\2\u0327\u031e\3\2\2\2\u0327"+
		"\u0323\3\2\2\2\u0328;\3\2\2\2\u0329\u033b\5\u00a4S\2\u032a\u032d\7\7\2"+
		"\2\u032b\u032e\5\u00aaV\2\u032c\u032e\5<\37\2\u032d\u032b\3\2\2\2\u032d"+
		"\u032c\3\2\2\2\u032e\u0336\3\2\2\2\u032f\u0332\7\t\2\2\u0330\u0333\5\u00aa"+
		"V\2\u0331\u0333\5<\37\2\u0332\u0330\3\2\2\2\u0332\u0331\3\2\2\2\u0333"+
		"\u0335\3\2\2\2\u0334\u032f\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2"+
		"\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339"+
		"\u033a\7\b\2\2\u033a\u033c\3\2\2\2\u033b\u032a\3\2\2\2\u033b\u033c\3\2"+
		"\2\2\u033c=\3\2\2\2\u033d\u0341\7t\2\2\u033e\u033f\5\u00a2R\2\u033f\u0340"+
		"\7\6\2\2\u0340\u0342\3\2\2\2\u0341\u033e\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0343\3\2\2\2\u0343\u034a\5\u00ba^\2\u0344\u0345\7\n\2\2\u0345\u034b"+
		"\5p9\2\u0346\u0347\7\7\2\2\u0347\u0348\5p9\2\u0348\u0349\7\b\2\2\u0349"+
		"\u034b\3\2\2\2\u034a\u0344\3\2\2\2\u034a\u0346\3\2\2\2\u034a\u034b\3\2"+
		"\2\2\u034b?\3\2\2\2\u034c\u0357\7{\2\2\u034d\u0358\5\u00aeX\2\u034e\u034f"+
		"\5\u00a2R\2\u034f\u0350\7\6\2\2\u0350\u0352\3\2\2\2\u0351\u034e\3\2\2"+
		"\2\u0351\u0352\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0356\5\u00a4S\2\u0354"+
		"\u0356\5\u00b2Z\2\u0355\u0353\3\2\2\2\u0355\u0354\3\2\2\2\u0356\u0358"+
		"\3\2\2\2\u0357\u034d\3\2\2\2\u0357\u0351\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"A\3\2\2\2\u0359\u035b\7|\2\2\u035a\u035c\7\u0083\2\2\u035b\u035a\3\2\2"+
		"\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\5\u00bc_\2\u035e"+
		"C\3\2\2\2\u035f\u0364\7\u0081\2\2\u0360\u0362\7\u008b\2\2\u0361\u0363"+
		"\5\u00c0a\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2"+
		"\2\u0364\u0360\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u036b\3\2\2\2\u0366\u0368"+
		"\7\u008a\2\2\u0367\u0369\7\u0083\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3"+
		"\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\5\u00bc_\2\u036b\u0366\3\2\2\2"+
		"\u036b\u036c\3\2\2\2\u036cE\3\2\2\2\u036d\u036e\7\u0083\2\2\u036e\u036f"+
		"\5\u00bc_\2\u036fG\3\2\2\2\u0370\u0372\7\u0097\2\2\u0371\u0373\7x\2\2"+
		"\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0379"+
		"\5r:\2\u0375\u0376\7\t\2\2\u0376\u0378\5r:\2\u0377\u0375\3\2\2\2\u0378"+
		"\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037d\3\2"+
		"\2\2\u037b\u0379\3\2\2\2\u037c\u0370\3\2\2\2\u037c\u037d\3\2\2\2\u037d"+
		"\u037e\3\2\2\2\u037e\u0389\5\u0082B\2\u037f\u0380\7q\2\2\u0380\u0381\7"+
		",\2\2\u0381\u0386\5n8\2\u0382\u0383\7\t\2\2\u0383\u0385\5n8\2\u0384\u0382"+
		"\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387"+
		"\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u037f\3\2\2\2\u0389\u038a\3\2"+
		"\2\2\u038a\u0391\3\2\2\2\u038b\u038c\7f\2\2\u038c\u038f\5`\61\2\u038d"+
		"\u038e\t\4\2\2\u038e\u0390\5`\61\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2"+
		"\2\2\u0390\u0392\3\2\2\2\u0391\u038b\3\2\2\2\u0391\u0392\3\2\2\2\u0392"+
		"I\3\2\2\2\u0393\u0395\7\u0097\2\2\u0394\u0396\7x\2\2\u0395\u0394\3\2\2"+
		"\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u039c\5r:\2\u0398\u0399"+
		"\7\t\2\2\u0399\u039b\5r:\2\u039a\u0398\3\2\2\2\u039b\u039e\3\2\2\2\u039c"+
		"\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c\3\2"+
		"\2\2\u039f\u0393\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u03a7\5L\'\2\u03a2\u03a3\5\u0084C\2\u03a3\u03a4\5L\'\2\u03a4\u03a6\3"+
		"\2\2\2\u03a5\u03a2\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03b4\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ab\7q"+
		"\2\2\u03ab\u03ac\7,\2\2\u03ac\u03b1\5n8\2\u03ad\u03ae\7\t\2\2\u03ae\u03b0"+
		"\5n8\2\u03af\u03ad\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03aa\3\2"+
		"\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03bc\3\2\2\2\u03b6\u03b7\7f\2\2\u03b7"+
		"\u03ba\5`\61\2\u03b8\u03b9\t\4\2\2\u03b9\u03bb\5`\61\2\u03ba\u03b8\3\2"+
		"\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03b6\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bdK\3\2\2\2\u03be\u03c0\7\u0084\2\2\u03bf\u03c1\t\6"+
		"\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2"+
		"\u03c7\5t;\2\u03c3\u03c4\7\t\2\2\u03c4\u03c6\5t;\2\u03c5\u03c3\3\2\2\2"+
		"\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03d7"+
		"\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03d5\7O\2\2\u03cb\u03d6\5x=\2\u03cc"+
		"\u03d2\5z>\2\u03cd\u03ce\7\t\2\2\u03ce\u03d1\5x=\2\u03cf\u03d1\5z>\2\u03d0"+
		"\u03cd\3\2\2\2\u03d0\u03cf\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2"+
		"\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5"+
		"\u03cb\3\2\2\2\u03d5\u03cc\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03ca\3\2"+
		"\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9\u03db\5&\24\2\u03da"+
		"\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03de\5&"+
		"\24\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\3\2\2\2\u03df"+
		"\u03e1\5\u0080A\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03ff"+
		"\3\2\2\2\u03e2\u03e3\7\u0092\2\2\u03e3\u03e4\7\7\2\2\u03e4\u03e9\5`\61"+
		"\2\u03e5\u03e6\7\t\2\2\u03e6\u03e8\5`\61\2\u03e7\u03e5\3\2\2\2\u03e8\u03eb"+
		"\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb"+
		"\u03e9\3\2\2\2\u03ec\u03fb\7\b\2\2\u03ed\u03ee\7\t\2\2\u03ee\u03ef\7\7"+
		"\2\2\u03ef\u03f4\5`\61\2\u03f0\u03f1\7\t\2\2\u03f1\u03f3\5`\61\2\u03f2"+
		"\u03f0\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2"+
		"\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u03f8\7\b\2\2\u03f8"+
		"\u03fa\3\2\2\2\u03f9\u03ed\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2"+
		"\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe"+
		"\u03be\3\2\2\2\u03fe\u03e2\3\2\2\2\u03ffM\3\2\2\2\u0400\u0402\5j\66\2"+
		"\u0401\u0400\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u040e"+
		"\7\u008f\2\2\u0404\u0405\7p\2\2\u0405\u040f\7\u0081\2\2\u0406\u0407\7"+
		"p\2\2\u0407\u040f\7\35\2\2\u0408\u0409\7p\2\2\u0409\u040f\7~\2\2\u040a"+
		"\u040b\7p\2\2\u040b\u040f\7L\2\2\u040c\u040d\7p\2\2\u040d\u040f\7U\2\2"+
		"\u040e\u0404\3\2\2\2\u040e\u0406\3\2\2\2\u040e\u0408\3\2\2\2\u040e\u040a"+
		"\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\3\2\2\2\u0410"+
		"\u0411\5l\67\2\u0411\u0412\7\u0085\2\2\u0412\u0417\5P)\2\u0413\u0414\7"+
		"\t\2\2\u0414\u0416\5P)\2\u0415\u0413\3\2\2\2\u0416\u0419\3\2\2\2\u0417"+
		"\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2"+
		"\2\2\u041a\u041c\5&\24\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"O\3\2\2\2\u041d\u0421\5\u00aaV\2\u041e\u0421\5\u0096L\2\u041f\u0421\5"+
		"R*\2\u0420\u041d\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u041f\3\2\2\2\u0421"+
		"\u0422\3\2\2\2\u0422\u0426\7\n\2\2\u0423\u0427\58\35\2\u0424\u0427\5:"+
		"\36\2\u0425\u0427\5`\61\2\u0426\u0423\3\2\2\2\u0426\u0424\3\2\2\2\u0426"+
		"\u0425\3\2\2\2\u0427Q\3\2\2\2\u0428\u042b\5\u0096L\2\u0429\u042b\5\u00aa"+
		"V\2\u042a\u0428\3\2\2\2\u042a\u0429\3\2\2\2\u042b\u042c\3\2\2\2\u042c"+
		"\u042d\7\6\2\2\u042d\u042f\3\2\2\2\u042e\u042a\3\2\2\2\u042e\u042f\3\2"+
		"\2\2\u042f\u0430\3\2\2\2\u0430\u0431\5<\37\2\u0431S\3\2\2\2\u0432\u0434"+
		"\5j\66\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0440\7\u008f\2\2\u0436\u0437\7p\2\2\u0437\u0441\7\u0081\2\2\u0438\u0439"+
		"\7p\2\2\u0439\u0441\7\35\2\2\u043a\u043b\7p\2\2\u043b\u0441\7~\2\2\u043c"+
		"\u043d\7p\2\2\u043d\u0441\7L\2\2\u043e\u043f\7p\2\2\u043f\u0441\7U\2\2"+
		"\u0440\u0436\3\2\2\2\u0440\u0438\3\2\2\2\u0440\u043a\3\2\2\2\u0440\u043c"+
		"\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442"+
		"\u0443\5l\67\2\u0443\u0444\7\u0085\2\2\u0444\u0449\5P)\2\u0445\u0446\7"+
		"\t\2\2\u0446\u0448\5P)\2\u0447\u0445\3\2\2\2\u0448\u044b\3\2\2\2\u0449"+
		"\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044d\3\2\2\2\u044b\u0449\3\2"+
		"\2\2\u044c\u044e\5&\24\2\u044d\u044c\3\2\2\2\u044d\u044e\3\2\2\2\u044e"+
		"\u0461\3\2\2\2\u044f\u0450\7q\2\2\u0450\u0451\7,\2\2\u0451\u0456\5n8\2"+
		"\u0452\u0453\7\t\2\2\u0453\u0455\5n8\2\u0454\u0452\3\2\2\2\u0455\u0458"+
		"\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u045a\3\2\2\2\u0458"+
		"\u0456\3\2\2\2\u0459\u044f\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\3\2"+
		"\2\2\u045b\u045c\7f\2\2\u045c\u045f\5`\61\2\u045d\u045e\t\4\2\2\u045e"+
		"\u0460\5`\61\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0462\3\2"+
		"\2\2\u0461\u0459\3\2\2\2\u0461\u0462\3\2\2\2\u0462U\3\2\2\2\u0463\u0464"+
		"\7\u0091\2\2\u0464W\3\2\2\2\u0465\u0467\5\u00aaV\2\u0466\u0468\5Z.\2\u0467"+
		"\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u046c\3\2\2\2\u0469\u046b\5\\"+
		"/\2\u046a\u0469\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046a\3\2\2\2\u046c"+
		"\u046d\3\2\2\2\u046dY\3\2\2\2\u046e\u046c\3\2\2\2\u046f\u0471\5\u009c"+
		"O\2\u0470\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0470\3\2\2\2\u0472"+
		"\u0473\3\2\2\2\u0473\u047e\3\2\2\2\u0474\u0475\7\7\2\2\u0475\u0476\5\u0088"+
		"E\2\u0476\u0477\7\b\2\2\u0477\u047f\3\2\2\2\u0478\u0479\7\7\2\2\u0479"+
		"\u047a\5\u0088E\2\u047a\u047b\7\t\2\2\u047b\u047c\5\u0088E\2\u047c\u047d"+
		"\7\b\2\2\u047d\u047f\3\2\2\2\u047e\u0474\3\2\2\2\u047e\u0478\3\2\2\2\u047e"+
		"\u047f\3\2\2\2\u047f[\3\2\2\2\u0480\u0481\7\65\2\2\u0481\u0483\5\u009c"+
		"O\2\u0482\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u04a5\3\2\2\2\u0484"+
		"\u0485\7u\2\2\u0485\u0487\7c\2\2\u0486\u0488\t\7\2\2\u0487\u0486\3\2\2"+
		"\2\u0487\u0488\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\5^\60\2\u048a\u048c"+
		"\7(\2\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u04a6\3\2\2\2\u048d"+
		"\u048f\7j\2\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2"+
		"\2\2\u0490\u0491\7l\2\2\u0491\u04a6\5^\60\2\u0492\u0493\7\u008e\2\2\u0493"+
		"\u04a6\5^\60\2\u0494\u0495\7\60\2\2\u0495\u0496\7\7\2\2\u0496\u0497\5"+
		"`\61\2\u0497\u0498\7\b\2\2\u0498\u04a6\3\2\2\2\u0499\u04a0\7<\2\2\u049a"+
		"\u04a1\5\u0088E\2\u049b\u04a1\5\u008aF\2\u049c\u049d\7\7\2\2\u049d\u049e"+
		"\5`\61\2\u049e\u049f\7\b\2\2\u049f\u04a1\3\2\2\2\u04a0\u049a\3\2\2\2\u04a0"+
		"\u049b\3\2\2\2\u04a0\u049c\3\2\2\2\u04a1\u04a6\3\2\2\2\u04a2\u04a3\7\61"+
		"\2\2\u04a3\u04a6\5\u00aeX\2\u04a4\u04a6\5b\62\2\u04a5\u0484\3\2\2\2\u04a5"+
		"\u048e\3\2\2\2\u04a5\u0492\3\2\2\2\u04a5\u0494\3\2\2\2\u04a5\u0499\3\2"+
		"\2\2\u04a5\u04a2\3\2\2\2\u04a5\u04a4\3\2\2\2\u04a6]\3\2\2\2\u04a7\u04a8"+
		"\7o\2\2\u04a8\u04a9\7\64\2\2\u04a9\u04ab\t\b\2\2\u04aa\u04a7\3\2\2\2\u04aa"+
		"\u04ab\3\2\2\2\u04ab_\3\2\2\2\u04ac\u04ad\b\61\1\2\u04ad\u0516\5\u008a"+
		"F\2\u04ae\u0516\5\u0088E\2\u04af\u0516\7\u00ab\2\2\u04b0\u04b1\5\u00a4"+
		"S\2\u04b1\u04b2\7\6\2\2\u04b2\u04b4\3\2\2\2\u04b3\u04b0\3\2\2\2\u04b3"+
		"\u04b4\3\2\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04b7\5\u00aaV\2\u04b6\u04b5"+
		"\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04bc\3\2\2\2\u04b8\u04b9\7\6\2\2\u04b9"+
		"\u04bb\5\u00aaV\2\u04ba\u04b8\3\2\2\2\u04bb\u04be\3\2\2\2\u04bc\u04ba"+
		"\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2\2\2\u04bf"+
		"\u04c1\7\6\2\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c3\3\2"+
		"\2\2\u04c2\u04c4\7\13\2\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4"+
		"\u0516\3\2\2\2\u04c5\u04c6\5\u008cG\2\u04c6\u04c7\5`\61\30\u04c7\u0516"+
		"\3\2\2\2\u04c8\u04c9\5\u00a0Q\2\u04c9\u04d6\7\7\2\2\u04ca\u04cc\7B\2\2"+
		"\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04d2"+
		"\5`\61\2\u04ce\u04cf\7\t\2\2\u04cf\u04d1\5`\61\2\u04d0\u04ce\3\2\2\2\u04d1"+
		"\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d7\3\2"+
		"\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04d7\7\13\2\2\u04d6\u04cb\3\2\2\2\u04d6"+
		"\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\7\b"+
		"\2\2\u04d9\u0516\3\2\2\2\u04da\u04db\5\u009eP\2\u04db\u04e8\7\7\2\2\u04dc"+
		"\u04de\7B\2\2\u04dd\u04dc\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2"+
		"\2\2\u04df\u04e4\5`\61\2\u04e0\u04e1\7\t\2\2\u04e1\u04e3\5`\61\2\u04e2"+
		"\u04e0\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2"+
		"\2\2\u04e5\u04e9\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04e9\7\13\2\2\u04e8"+
		"\u04dd\3\2\2\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\3\2"+
		"\2\2\u04ea\u04eb\7\b\2\2\u04eb\u0516\3\2\2\2\u04ec\u04ed\7\7\2\2\u04ed"+
		"\u04ee\5`\61\2\u04ee\u04ef\7\b\2\2\u04ef\u0516\3\2\2\2\u04f0\u04f1\7/"+
		"\2\2\u04f1\u04f2\7\7\2\2\u04f2\u04f3\5`\61\2\u04f3\u04f4\7%\2\2\u04f4"+
		"\u04f5\5Z.\2\u04f5\u04f6\7\b\2\2\u04f6\u0516\3\2\2\2\u04f7\u04f9\7j\2"+
		"\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fc"+
		"\7J\2\2\u04fb\u04f8\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd"+
		"\u04fe\7\7\2\2\u04fe\u04ff\5J&\2\u04ff\u0500\7\b\2\2\u0500\u0516\3\2\2"+
		"\2\u0501\u0503\7.\2\2\u0502\u0504\5`\61\2\u0503\u0502\3\2\2\2\u0503\u0504"+
		"\3\2\2\2\u0504\u050a\3\2\2\2\u0505\u0506\7\u0095\2\2\u0506\u0507\5`\61"+
		"\2\u0507\u0508\7\u0089\2\2\u0508\u0509\5`\61\2\u0509\u050b\3\2\2\2\u050a"+
		"\u0505\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2"+
		"\2\2\u050d\u0510\3\2\2\2\u050e\u050f\7E\2\2\u050f\u0511\5`\61\2\u0510"+
		"\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\7F"+
		"\2\2\u0513\u0516\3\2\2\2\u0514\u0516\5d\63\2\u0515\u04ac\3\2\2\2\u0515"+
		"\u04ae\3\2\2\2\u0515\u04af\3\2\2\2\u0515\u04b3\3\2\2\2\u0515\u04c5\3\2"+
		"\2\2\u0515\u04c8\3\2\2\2\u0515\u04da\3\2\2\2\u0515\u04ec\3\2\2\2\u0515"+
		"\u04f0\3\2\2\2\u0515\u04fb\3\2\2\2\u0515\u0501\3\2\2\2\u0515\u0514\3\2"+
		"\2\2\u0516\u057b\3\2\2\2\u0517\u0518\f\27\2\2\u0518\u0519\7\17\2\2\u0519"+
		"\u057a\5`\61\30\u051a\u051b\f\26\2\2\u051b\u051c\t\t\2\2\u051c\u057a\5"+
		"`\61\27\u051d\u051e\f\25\2\2\u051e\u051f\t\n\2\2\u051f\u057a\5`\61\26"+
		"\u0520\u0521\f\24\2\2\u0521\u0522\t\13\2\2\u0522\u057a\5`\61\25\u0523"+
		"\u0524\f\23\2\2\u0524\u0525\t\f\2\2\u0525\u057a\5`\61\24\u0526\u0533\f"+
		"\22\2\2\u0527\u0534\7\n\2\2\u0528\u0534\7\32\2\2\u0529\u0534\7\33\2\2"+
		"\u052a\u0534\7\34\2\2\u052b\u0534\7`\2\2\u052c\u052d\7`\2\2\u052d\u0534"+
		"\7j\2\2\u052e\u0534\7W\2\2\u052f\u0534\7e\2\2\u0530\u0534\7Q\2\2\u0531"+
		"\u0534\7g\2\2\u0532\u0534\7z\2\2\u0533\u0527\3\2\2\2\u0533\u0528\3\2\2"+
		"\2\u0533\u0529\3\2\2\2\u0533\u052a\3\2\2\2\u0533\u052b\3\2\2\2\u0533\u052c"+
		"\3\2\2\2\u0533\u052e\3\2\2\2\u0533\u052f\3\2\2\2\u0533\u0530\3\2\2\2\u0533"+
		"\u0531\3\2\2\2\u0533\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u057a\5`"+
		"\61\23\u0536\u0537\f\21\2\2\u0537\u0538\7$\2\2\u0538\u057a\5`\61\22\u0539"+
		"\u053a\f\20\2\2\u053a\u053b\7p\2\2\u053b\u057a\5`\61\21\u053c\u053d\f"+
		"\b\2\2\u053d\u053f\7`\2\2\u053e\u0540\7j\2\2\u053f\u053e\3\2\2\2\u053f"+
		"\u0540\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u057a\5`\61\t\u0542\u0544\f\7"+
		"\2\2\u0543\u0545\7j\2\2\u0544\u0543\3\2\2\2\u0544\u0545\3\2\2\2\u0545"+
		"\u0546\3\2\2\2\u0546\u0547\7+\2\2\u0547\u0548\5`\61\2\u0548\u0549\7$\2"+
		"\2\u0549\u054a\5`\61\b\u054a\u057a\3\2\2\2\u054b\u054c\f\13\2\2\u054c"+
		"\u054d\7\61\2\2\u054d\u057a\5\u00aeX\2\u054e\u0550\f\n\2\2\u054f\u0551"+
		"\7j\2\2\u0550\u054f\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552"+
		"\u0553\t\r\2\2\u0553\u0556\5`\61\2\u0554\u0555\7G\2\2\u0555\u0557\5`\61"+
		"\2\u0556\u0554\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u057a\3\2\2\2\u0558\u055d"+
		"\f\t\2\2\u0559\u055e\7a\2\2\u055a\u055e\7k\2\2\u055b\u055c\7j\2\2\u055c"+
		"\u055e\7l\2\2\u055d\u0559\3\2\2\2\u055d\u055a\3\2\2\2\u055d\u055b\3\2"+
		"\2\2\u055e\u057a\3\2\2\2\u055f\u0561\f\6\2\2\u0560\u0562\7j\2\2\u0561"+
		"\u0560\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0577\7W"+
		"\2\2\u0564\u056e\7\7\2\2\u0565\u056f\5J&\2\u0566\u056b\5`\61\2\u0567\u0568"+
		"\7\t\2\2\u0568\u056a\5`\61\2\u0569\u0567\3\2\2\2\u056a\u056d\3\2\2\2\u056b"+
		"\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056f\3\2\2\2\u056d\u056b\3\2"+
		"\2\2\u056e\u0565\3\2\2\2\u056e\u0566\3\2\2\2\u056e\u056f\3\2\2\2\u056f"+
		"\u0570\3\2\2\2\u0570\u0578\7\b\2\2\u0571\u0572\5\u00a2R\2\u0572\u0573"+
		"\7\6\2\2\u0573\u0575\3\2\2\2\u0574\u0571\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0576\3\2\2\2\u0576\u0578\5\u00a4S\2\u0577\u0564\3\2\2\2\u0577\u0574"+
		"\3\2\2\2\u0578\u057a\3\2\2\2\u0579\u0517\3\2\2\2\u0579\u051a\3\2\2\2\u0579"+
		"\u051d\3\2\2\2\u0579\u0520\3\2\2\2\u0579\u0523\3\2\2\2\u0579\u0526\3\2"+
		"\2\2\u0579\u0536\3\2\2\2\u0579\u0539\3\2\2\2\u0579\u053c\3\2\2\2\u0579"+
		"\u0542\3\2\2\2\u0579\u054b\3\2\2\2\u0579\u054e\3\2\2\2\u0579\u0558\3\2"+
		"\2\2\u0579\u055f\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579\3\2\2\2\u057b"+
		"\u057c\3\2\2\2\u057ca\3\2\2\2\u057d\u057b\3\2\2\2\u057e\u057f\7y\2\2\u057f"+
		"\u058b\5\u00b0Y\2\u0580\u0581\7\7\2\2\u0581\u0586\5\u00aaV\2\u0582\u0583"+
		"\7\t\2\2\u0583\u0585\5\u00aaV\2\u0584\u0582\3\2\2\2\u0585\u0588\3\2\2"+
		"\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0589\3\2\2\2\u0588\u0586"+
		"\3\2\2\2\u0589\u058a\7\b\2\2\u058a\u058c\3\2\2\2\u058b\u0580\3\2\2\2\u058b"+
		"\u058c\3\2\2\2\u058c\u059f\3\2\2\2\u058d\u058e\7o\2\2\u058e\u0597\t\16"+
		"\2\2\u058f\u0590\7\u0085\2\2\u0590\u0598\7l\2\2\u0591\u0592\7\u0085\2"+
		"\2\u0592\u0598\7<\2\2\u0593\u0598\7-\2\2\u0594\u0598\7\177\2\2\u0595\u0596"+
		"\7i\2\2\u0596\u0598\7\36\2\2\u0597\u058f\3\2\2\2\u0597\u0591\3\2\2\2\u0597"+
		"\u0593\3\2\2\2\u0597\u0594\3\2\2\2\u0597\u0595\3\2\2\2\u0598\u059c\3\2"+
		"\2\2\u0599\u059a\7g\2\2\u059a\u059c\5\u009cO\2\u059b\u058d\3\2\2\2\u059b"+
		"\u0599\3\2\2\2\u059c\u059e\3\2\2\2\u059d\u059b\3\2\2\2\u059e\u05a1\3\2"+
		"\2\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05ac\3\2\2\2\u05a1"+
		"\u059f\3\2\2\2\u05a2\u05a4\7j\2\2\u05a3\u05a2\3\2\2\2\u05a3\u05a4\3\2"+
		"\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05aa\7=\2\2\u05a6\u05a7\7Z\2\2\u05a7\u05ab"+
		"\7>\2\2\u05a8\u05a9\7Z\2\2\u05a9\u05ab\7V\2\2\u05aa\u05a6\3\2\2\2\u05aa"+
		"\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad\3\2\2\2\u05ac\u05a3\3\2"+
		"\2\2\u05ac\u05ad\3\2\2\2\u05adc\3\2\2\2\u05ae\u05af\7w\2\2\u05af\u05b4"+
		"\7\7\2\2\u05b0\u05b5\7U\2\2\u05b1\u05b2\t\17\2\2\u05b2\u05b3\7\t\2\2\u05b3"+
		"\u05b5\5\u008eH\2\u05b4\u05b0\3\2\2\2\u05b4\u05b1\3\2\2\2\u05b5\u05b6"+
		"\3\2\2\2\u05b6\u05b7\7\b\2\2\u05b7e\3\2\2\2\u05b8\u05bb\5\u00aaV\2\u05b9"+
		"\u05bb\5\u0096L\2\u05ba\u05b8\3\2\2\2\u05ba\u05b9\3\2\2\2\u05bb\u05be"+
		"\3\2\2\2\u05bc\u05bd\7\61\2\2\u05bd\u05bf\5\u00aeX\2\u05be\u05bc\3\2\2"+
		"\2\u05be\u05bf\3\2\2\2\u05bf\u05c1\3\2\2\2\u05c0\u05c2\t\7\2\2\u05c1\u05c0"+
		"\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2g\3\2\2\2\u05c3\u05c4\7\65\2\2\u05c4"+
		"\u05c6\5\u009cO\2\u05c5\u05c3\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05f1"+
		"\3\2\2\2\u05c7\u05c8\7u\2\2\u05c8\u05cb\7c\2\2\u05c9\u05cb\7\u008e\2\2"+
		"\u05ca\u05c7\3\2\2\2\u05ca\u05c9\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd"+
		"\7\7\2\2\u05cd\u05d2\5f\64\2\u05ce\u05cf\7\t\2\2\u05cf\u05d1\5f\64\2\u05d0"+
		"\u05ce\3\2\2\2\u05d1\u05d4\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d2\u05d3\3\2"+
		"\2\2\u05d3\u05d5\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d5\u05d6\7\b\2\2\u05d6"+
		"\u05d7\5^\60\2\u05d7\u05f2\3\2\2\2\u05d8\u05d9\7\60\2\2\u05d9\u05da\7"+
		"\7\2\2\u05da\u05db\5`\61\2\u05db\u05dc\7\b\2\2\u05dc\u05f2\3\2\2\2\u05dd"+
		"\u05de\7N\2\2\u05de\u05df\7c\2\2\u05df\u05e2\7\7\2\2\u05e0\u05e3\5\u00aa"+
		"V\2\u05e1\u05e3\5\u0096L\2\u05e2\u05e0\3\2\2\2\u05e2\u05e1\3\2\2\2\u05e3"+
		"\u05e8\3\2\2\2\u05e4\u05e5\7\t\2\2\u05e5\u05e7\5\u00aaV\2\u05e6\u05e4"+
		"\3\2\2\2\u05e7\u05ea\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9"+
		"\u05eb\3\2\2\2\u05ea\u05e8\3\2\2\2\u05eb\u05ec\7\t\2\2\u05ec\u05ed\5\u0096"+
		"L\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\7\b\2\2\u05ef\u05f0\5b\62\2\u05f0"+
		"\u05f2\3\2\2\2\u05f1\u05ca\3\2\2\2\u05f1\u05d8\3\2\2\2\u05f1\u05dd\3\2"+
		"\2\2\u05f2i\3\2\2\2\u05f3\u05f5\7\u0097\2\2\u05f4\u05f6\7x\2\2\u05f5\u05f4"+
		"\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\5\u0086D"+
		"\2\u05f8\u05f9\7%\2\2\u05f9\u05fa\7\7\2\2\u05fa\u05fb\5J&\2\u05fb\u0605"+
		"\7\b\2\2\u05fc\u05fd\7\t\2\2\u05fd\u05fe\5\u0086D\2\u05fe\u05ff\7%\2\2"+
		"\u05ff\u0600\7\7\2\2\u0600\u0601\5J&\2\u0601\u0602\7\b\2\2\u0602\u0604"+
		"\3\2\2\2\u0603\u05fc\3\2\2\2\u0604\u0607\3\2\2\2\u0605\u0603\3\2\2\2\u0605"+
		"\u0606\3\2\2\2\u0606k\3\2\2\2\u0607\u0605\3\2\2\2\u0608\u060d\5\u00a4"+
		"S\2\u0609\u060a\7\6\2\2\u060a\u060c\5\u00acW\2\u060b\u0609\3\2\2\2\u060c"+
		"\u060f\3\2\2\2\u060d\u060b\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0615\3\2"+
		"\2\2\u060f\u060d\3\2\2\2\u0610\u0611\7Y\2\2\u0611\u0612\7,\2\2\u0612\u0616"+
		"\5\u00b2Z\2\u0613\u0614\7j\2\2\u0614\u0616\7Y\2\2\u0615\u0610\3\2\2\2"+
		"\u0615\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616m\3\2\2\2\u0617\u061a\5"+
		"`\61\2\u0618\u0619\7\61\2\2\u0619\u061b\5\u00aeX\2\u061a\u0618\3\2\2\2"+
		"\u061a\u061b\3\2\2\2\u061b\u061d\3\2\2\2\u061c\u061e\t\7\2\2\u061d\u061c"+
		"\3\2\2\2\u061d\u061e\3\2\2\2\u061eo\3\2\2\2\u061f\u0623\5\u0088E\2\u0620"+
		"\u0623\5\u009cO\2\u0621\u0623\7\u00ac\2\2\u0622\u061f\3\2\2\2\u0622\u0620"+
		"\3\2\2\2\u0622\u0621\3\2\2\2\u0623q\3\2\2\2\u0624\u063a\5\u00a4S\2\u0625"+
		"\u0628\7\7\2\2\u0626\u0629\5\u00aaV\2\u0627\u0629\5\u0096L\2\u0628\u0626"+
		"\3\2\2\2\u0628\u0627\3\2\2\2\u0629\u062e\3\2\2\2\u062a\u062b\7\t\2\2\u062b"+
		"\u062d\5\u00aaV\2\u062c\u062a\3\2\2\2\u062d\u0630\3\2\2\2\u062e\u062c"+
		"\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0635\3\2\2\2\u0630\u062e\3\2\2\2\u0631"+
		"\u0632\7\t\2\2\u0632\u0634\5\u0096L\2\u0633\u0631\3\2\2\2\u0634\u0637"+
		"\3\2\2\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0638\3\2\2\2\u0637"+
		"\u0635\3\2\2\2\u0638\u0639\7\b\2\2\u0639\u063b\3\2\2\2\u063a\u0625\3\2"+
		"\2\2\u063a\u063b\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063d\7%\2\2\u063d"+
		"\u063e\7\7\2\2\u063e\u063f\5J&\2\u063f\u0640\7\b\2\2\u0640s\3\2\2\2\u0641"+
		"\u064d\7\13\2\2\u0642\u0645\5v<\2\u0643\u0645\5`\61\2\u0644\u0642\3\2"+
		"\2\2\u0644\u0643\3\2\2\2\u0645\u064a\3\2\2\2\u0646\u0648\7%\2\2\u0647"+
		"\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064b\5\u0092"+
		"J\2\u064a\u0647\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064d\3\2\2\2\u064c"+
		"\u0641\3\2\2\2\u064c\u0644\3\2\2\2\u064du\3\2\2\2\u064e\u064f\t\20\2\2"+
		"\u064f\u0652\5\u00a4S\2\u0650\u0651\7\6\2\2\u0651\u0653\5\u00a4S\2\u0652"+
		"\u0650\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\7o"+
		"\2\2\u0655\u0656\7\7\2\2\u0656\u065b\5t;\2\u0657\u0658\7\t\2\2\u0658\u065a"+
		"\5t;\2\u0659\u0657\3\2\2\2\u065a\u065d\3\2\2\2\u065b\u0659\3\2\2\2\u065b"+
		"\u065c\3\2\2\2\u065c\u065e\3\2\2\2\u065d\u065b\3\2\2\2\u065e\u065f\7\b"+
		"\2\2\u065fw\3\2\2\2\u0660\u0665\5\u00a4S\2\u0661\u0662\7\6\2\2\u0662\u0666"+
		"\5\u00aaV\2\u0663\u0664\7\6\2\2\u0664\u0666\5\u0096L\2\u0665\u0661\3\2"+
		"\2\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u066b\3\2\2\2\u0667"+
		"\u0669\7%\2\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\3\2"+
		"\2\2\u066a\u066c\5\u00be`\2\u066b\u0668\3\2\2\2\u066b\u066c\3\2\2\2\u066c"+
		"\u0672\3\2\2\2\u066d\u066e\7Y\2\2\u066e\u066f\7,\2\2\u066f\u0673\5\u00b2"+
		"Z\2\u0670\u0671\7j\2\2\u0671\u0673\7Y\2\2\u0672\u066d\3\2\2\2\u0672\u0670"+
		"\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0691\3\2\2\2\u0674\u067e\7\7\2\2\u0675"+
		"\u067a\5x=\2\u0676\u0677\7\t\2\2\u0677\u0679\5x=\2\u0678\u0676\3\2\2\2"+
		"\u0679\u067c\3\2\2\2\u067a\u0678\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067f"+
		"\3\2\2\2\u067c\u067a\3\2\2\2\u067d\u067f\5z>\2\u067e\u0675\3\2\2\2\u067e"+
		"\u067d\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0685\7\b\2\2\u0681\u0683\7%"+
		"\2\2\u0682\u0681\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\3\2\2\2\u0684"+
		"\u0686\5\u00be`\2\u0685\u0682\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0691"+
		"\3\2\2\2\u0687\u0688\7\7\2\2\u0688\u0689\5J&\2\u0689\u068e\7\b\2\2\u068a"+
		"\u068c\7%\2\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068d\3\2"+
		"\2\2\u068d\u068f\5\u00be`\2\u068e\u068b\3\2\2\2\u068e\u068f\3\2\2\2\u068f"+
		"\u0691\3\2\2\2\u0690\u0660\3\2\2\2\u0690\u0674\3\2\2\2\u0690\u0687\3\2"+
		"\2\2\u0691y\3\2\2\2\u0692\u069a\5x=\2\u0693\u0694\5|?\2\u0694\u0696\5"+
		"x=\2\u0695\u0697\5~@\2\u0696\u0695\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0699"+
		"\3\2\2\2\u0698\u0693\3\2\2\2\u0699\u069c\3\2\2\2\u069a\u0698\3\2\2\2\u069a"+
		"\u069b\3\2\2\2\u069b{\3\2\2\2\u069c\u069a\3\2\2\2\u069d\u06ab\7\t\2\2"+
		"\u069e\u06a0\7h\2\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a7"+
		"\3\2\2\2\u06a1\u06a3\7d\2\2\u06a2\u06a4\7r\2\2\u06a3\u06a2\3\2\2\2\u06a3"+
		"\u06a4\3\2\2\2\u06a4\u06a8\3\2\2\2\u06a5\u06a8\7[\2\2\u06a6\u06a8\7\67"+
		"\2\2\u06a7\u06a1\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a6\3\2\2\2\u06a7"+
		"\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\7b\2\2\u06aa\u069d\3\2"+
		"\2\2\u06aa\u069f\3\2\2\2\u06ab}\3\2\2\2\u06ac\u06ad\7o\2\2\u06ad\u06c5"+
		"\5`\61\2\u06ae\u06af\7\u0090\2\2\u06af\u06b2\7\7\2\2\u06b0\u06b3\5\u0096"+
		"L\2\u06b1\u06b3\5\u00aaV\2\u06b2\u06b0\3\2\2\2\u06b2\u06b1\3\2\2\2\u06b3"+
		"\u06b8\3\2\2\2\u06b4\u06b5\7\t\2\2\u06b5\u06b7\5\u00aaV\2\u06b6\u06b4"+
		"\3\2\2\2\u06b7\u06ba\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9"+
		"\u06bf\3\2\2\2\u06ba\u06b8\3\2\2\2\u06bb\u06bc\7\t\2\2\u06bc\u06be\5\u0096"+
		"L\2\u06bd\u06bb\3\2\2\2\u06be\u06c1\3\2\2\2\u06bf\u06bd\3\2\2\2\u06bf"+
		"\u06c0\3\2\2\2\u06c0\u06c2\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c2\u06c3\7\b"+
		"\2\2\u06c3\u06c5\3\2\2\2\u06c4\u06ac\3\2\2\2\u06c4\u06ae\3\2\2\2\u06c5"+
		"\177\3\2\2\2\u06c6\u06c7\7R\2\2\u06c7\u06c8\7,\2\2\u06c8\u06cd\5`\61\2"+
		"\u06c9\u06ca\7\t\2\2\u06ca\u06cc\5`\61\2\u06cb\u06c9\3\2\2\2\u06cc\u06cf"+
		"\3\2\2\2\u06cd\u06cb\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d2\3\2\2\2\u06cf"+
		"\u06cd\3\2\2\2\u06d0\u06d1\7S\2\2\u06d1\u06d3\5`\61\2\u06d2\u06d0\3\2"+
		"\2\2\u06d2\u06d3\3\2\2\2\u06d3\u0081\3\2\2\2\u06d4\u06d6\7\u0084\2\2\u06d5"+
		"\u06d7\t\6\2\2\u06d6\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d8\3\2"+
		"\2\2\u06d8\u06dd\5t;\2\u06d9\u06da\7\t\2\2\u06da\u06dc\5t;\2\u06db\u06d9"+
		"\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd\u06de\3\2\2\2\u06de"+
		"\u06ec\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0\u06ea\7O\2\2\u06e1\u06e6\5x="+
		"\2\u06e2\u06e3\7\t\2\2\u06e3\u06e5\5x=\2\u06e4\u06e2\3\2\2\2\u06e5\u06e8"+
		"\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06eb\3\2\2\2\u06e8"+
		"\u06e6\3\2\2\2\u06e9\u06eb\5z>\2\u06ea\u06e1\3\2\2\2\u06ea\u06e9\3\2\2"+
		"\2\u06eb\u06ed\3\2\2\2\u06ec\u06e0\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ef"+
		"\3\2\2\2\u06ee\u06f0\5&\24\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0"+
		"\u06f2\3\2\2\2\u06f1\u06f3\5\u0080A\2\u06f2\u06f1\3\2\2\2\u06f2\u06f3"+
		"\3\2\2\2\u06f3\u0711\3\2\2\2\u06f4\u06f5\7\u0092\2\2\u06f5\u06f6\7\7\2"+
		"\2\u06f6\u06fb\5`\61\2\u06f7\u06f8\7\t\2\2\u06f8\u06fa\5`\61\2\u06f9\u06f7"+
		"\3\2\2\2\u06fa\u06fd\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc"+
		"\u06fe\3\2\2\2\u06fd\u06fb\3\2\2\2\u06fe\u070d\7\b\2\2\u06ff\u0700\7\t"+
		"\2\2\u0700\u0701\7\7\2\2\u0701\u0706\5`\61\2\u0702\u0703\7\t\2\2\u0703"+
		"\u0705\5`\61\2\u0704\u0702\3\2\2\2\u0705\u0708\3\2\2\2\u0706\u0704\3\2"+
		"\2\2\u0706\u0707\3\2\2\2\u0707\u0709\3\2\2\2\u0708\u0706\3\2\2\2\u0709"+
		"\u070a\7\b\2\2\u070a\u070c\3\2\2\2\u070b\u06ff\3\2\2\2\u070c\u070f\3\2"+
		"\2\2\u070d\u070b\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u0711\3\2\2\2\u070f"+
		"\u070d\3\2\2\2\u0710\u06d4\3\2\2\2\u0710\u06f4\3\2\2\2\u0711\u0083\3\2"+
		"\2\2\u0712\u0718\7\u008d\2\2\u0713\u0714\7\u008d\2\2\u0714\u0718\7!\2"+
		"\2\u0715\u0718\7^\2\2\u0716\u0718\7H\2\2\u0717\u0712\3\2\2\2\u0717\u0713"+
		"\3\2\2\2\u0717\u0715\3\2\2\2\u0717\u0716\3\2\2\2\u0718\u0085\3\2\2\2\u0719"+
		"\u0729\5\u00a4S\2\u071a\u071d\7\7\2\2\u071b\u071e\5\u00aaV\2\u071c\u071e"+
		"\5\u0096L\2\u071d\u071b\3\2\2\2\u071d\u071c\3\2\2\2\u071e\u0724\3\2\2"+
		"\2\u071f\u0720\7\t\2\2\u0720\u0723\5\u00aaV\2\u0721\u0723\5\u0096L\2\u0722"+
		"\u071f\3\2\2\2\u0722\u0721\3\2\2\2\u0723\u0726\3\2\2\2\u0724\u0722\3\2"+
		"\2\2\u0724\u0725\3\2\2\2\u0725\u0727\3\2\2\2\u0726\u0724\3\2\2\2\u0727"+
		"\u0728\7\b\2\2\u0728\u072a\3\2\2\2\u0729\u071a\3\2\2\2\u0729\u072a\3\2"+
		"\2\2\u072a\u0087\3\2\2\2\u072b\u072d\t\n\2\2\u072c\u072b\3\2\2\2\u072c"+
		"\u072d\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u072f\7\u00aa\2\2\u072f\u0089"+
		"\3\2\2\2\u0730\u0731\t\21\2\2\u0731\u008b\3\2\2\2\u0732\u0733\t\22\2\2"+
		"\u0733\u008d\3\2\2\2\u0734\u0735\7\u00ac\2\2\u0735\u008f\3\2\2\2\u0736"+
		"\u0739\5`\61\2\u0737\u0739\5X-\2\u0738\u0736\3\2\2\2\u0738\u0737\3\2\2"+
		"\2\u0739\u0091\3\2\2\2\u073a\u073b\t\23\2\2\u073b\u0093\3\2\2\2\u073c"+
		"\u073d\t\24\2\2\u073d\u0095\3\2\2\2\u073e\u073f\5\u0098M\2\u073f\u0740"+
		"\7\6\2\2\u0740\u0741\5\u009aN\2\u0741\u0097\3\2\2\2\u0742\u0747\5\u00ac"+
		"W\2\u0743\u0744\7\6\2\2\u0744\u0746\5\u00acW\2\u0745\u0743\3\2\2\2\u0746"+
		"\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u0099\3\2"+
		"\2\2\u0749\u0747\3\2\2\2\u074a\u074b\5\u00c2b\2\u074b\u009b\3\2\2\2\u074c"+
		"\u074d\5\u00c2b\2\u074d\u009d\3\2\2\2\u074e\u074f\5\u00c2b\2\u074f\u009f"+
		"\3\2\2\2\u0750\u0751\t\25\2\2\u0751\u00a1\3\2\2\2\u0752\u0753\5\u00c2"+
		"b\2\u0753\u00a3\3\2\2\2\u0754\u0755\5\u00c2b\2\u0755\u00a5\3\2\2\2\u0756"+
		"\u0757\5\u00c2b\2\u0757\u00a7\3\2\2\2\u0758\u0759\5\u00c2b\2\u0759\u00a9"+
		"\3\2\2\2\u075a\u075b\5\u00c2b\2\u075b\u00ab\3\2\2\2\u075c\u075d\5\u00c2"+
		"b\2\u075d\u00ad\3\2\2\2\u075e\u075f\5\u00c2b\2\u075f\u00af\3\2\2\2\u0760"+
		"\u0761\5\u00c2b\2\u0761\u00b1\3\2\2\2\u0762\u0763\5\u00c2b\2\u0763\u00b3"+
		"\3\2\2\2\u0764\u0765\5\u00c2b\2\u0765\u00b5\3\2\2\2\u0766\u0767\5\u00c2"+
		"b\2\u0767\u00b7\3\2\2\2\u0768\u0769\5\u00c2b\2\u0769\u00b9\3\2\2\2\u076a"+
		"\u076b\5\u00c2b\2\u076b\u00bb\3\2\2\2\u076c\u076d\5\u00c2b\2\u076d\u00bd"+
		"\3\2\2\2\u076e\u076f\5\u00c2b\2\u076f\u00bf\3\2\2\2\u0770\u0771\5\u00c2"+
		"b\2\u0771\u00c1\3\2\2\2\u0772\u077a\7\u00a9\2\2\u0773\u077a\5\u0094K\2"+
		"\u0774\u077a\7\u00ac\2\2\u0775\u0776\7\7\2\2\u0776\u0777\5\u00c2b\2\u0777"+
		"\u0778\7\b\2\2\u0778\u077a\3\2\2\2\u0779\u0772\3\2\2\2\u0779\u0773\3\2"+
		"\2\2\u0779\u0774\3\2\2\2\u0779\u0775\3\2\2\2\u077a\u00c3\3\2\2\2\u0116"+
		"\u00c6\u00c8\u00d3\u00da\u00df\u00e5\u00eb\u00ed\u010d\u0114\u011c\u011f"+
		"\u0128\u012c\u0134\u0138\u013a\u013f\u0141\u0145\u014c\u014f\u0154\u0158"+
		"\u015d\u0166\u0169\u016f\u0171\u0175\u017b\u0180\u018b\u0190\u0199\u019f"+
		"\u01a1\u01a9\u01af\u01b4\u01ba\u01bf\u01c3\u01ca\u01d0\u01d4\u01d8\u01de"+
		"\u01e3\u01ea\u01f5\u01f8\u01fa\u0200\u0206\u020a\u0211\u0217\u021d\u0223"+
		"\u0228\u0234\u0239\u0244\u0249\u024c\u0252\u0255\u025b\u0264\u0267\u026d"+
		"\u026f\u0276\u027e\u0283\u028b\u0290\u0298\u029d\u02a5\u02aa\u02b0\u02b7"+
		"\u02ba\u02c2\u02cc\u02cf\u02d5\u02d7\u02da\u02ed\u02f3\u0301\u0307\u030c"+
		"\u0312\u0316\u0327\u032d\u0332\u0336\u033b\u0341\u034a\u0351\u0355\u0357"+
		"\u035b\u0362\u0364\u0368\u036b\u0372\u0379\u037c\u0386\u0389\u038f\u0391"+
		"\u0395\u039c\u039f\u03a7\u03b1\u03b4\u03ba\u03bc\u03c0\u03c7\u03d0\u03d2"+
		"\u03d5\u03d7\u03da\u03dd\u03e0\u03e9\u03f4\u03fb\u03fe\u0401\u040e\u0417"+
		"\u041b\u0420\u0426\u042a\u042e\u0433\u0440\u0449\u044d\u0456\u0459\u045f"+
		"\u0461\u0467\u046c\u0472\u047e\u0482\u0487\u048b\u048e\u04a0\u04a5\u04aa"+
		"\u04b3\u04b6\u04bc\u04c0\u04c3\u04cb\u04d2\u04d6\u04dd\u04e4\u04e8\u04f8"+
		"\u04fb\u0503\u050c\u0510\u0515\u0533\u053f\u0544\u0550\u0556\u055d\u0561"+
		"\u056b\u056e\u0574\u0577\u0579\u057b\u0586\u058b\u0597\u059b\u059f\u05a3"+
		"\u05aa\u05ac\u05b4\u05ba\u05be\u05c1\u05c5\u05ca\u05d2\u05e2\u05e8\u05f1"+
		"\u05f5\u0605\u060d\u0615\u061a\u061d\u0622\u0628\u062e\u0635\u063a\u0644"+
		"\u0647\u064a\u064c\u0652\u065b\u0665\u0668\u066b\u0672\u067a\u067e\u0682"+
		"\u0685\u068b\u068e\u0690\u0696\u069a\u069f\u06a3\u06a7\u06aa\u06b2\u06b8"+
		"\u06bf\u06c4\u06cd\u06d2\u06d6\u06dd\u06e6\u06ea\u06ec\u06ef\u06f2\u06fb"+
		"\u0706\u070d\u0710\u0717\u071d\u0722\u0724\u0729\u072c\u0738\u0747\u0779";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}