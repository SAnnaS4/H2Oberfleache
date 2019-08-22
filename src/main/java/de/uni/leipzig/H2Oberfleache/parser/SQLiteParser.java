package de.uni.leipzig.H2Oberfleache.parser;
// Generated from C:/Users/Anna/Desktop/test/H2Oberfleache/src/main/antlr4\SQLite.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
		K_ENVELOPE=165, IDENTIFIER=166, NUMERIC_LITERAL=167, BIND_PARAMETER=168, 
		STRING_LITERAL=169, BLOB_LITERAL=170, SINGLE_LINE_COMMENT=171, MULTILINE_COMMENT=172, 
		SPACES=173, UNEXPECTED_CHAR=174;
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
		RULE_table_or_subquery = 58, RULE_join_clause = 59, RULE_join_operator = 60, 
		RULE_join_constraint = 61, RULE_group_by = 62, RULE_select_core = 63, 
		RULE_compound_operator = 64, RULE_cte_table_name = 65, RULE_signed_number = 66, 
		RULE_literal_value = 67, RULE_unary_operator = 68, RULE_error_message = 69, 
		RULE_module_argument = 70, RULE_column_alias = 71, RULE_keyword = 72, 
		RULE_nf2_point_Notation = 73, RULE_name_of_subtable = 74, RULE_subtable_column_name = 75, 
		RULE_name = 76, RULE_function_name = 77, RULE_aggregate = 78, RULE_database_name = 79, 
		RULE_table_name = 80, RULE_table_or_index_name = 81, RULE_new_table_name = 82, 
		RULE_column_name = 83, RULE_subtable_name = 84, RULE_collation_name = 85, 
		RULE_foreign_table = 86, RULE_index_name = 87, RULE_trigger_name = 88, 
		RULE_view_name = 89, RULE_module_name = 90, RULE_pragma_name = 91, RULE_savepoint_name = 92, 
		RULE_table_alias = 93, RULE_transaction_name = 94, RULE_any_name = 95;
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
			"pragma_value", "common_table_expression", "result_column", "table_or_subquery", 
			"join_clause", "join_operator", "join_constraint", "group_by", "select_core", 
			"compound_operator", "cte_table_name", "signed_number", "literal_value", 
			"unary_operator", "error_message", "module_argument", "column_alias", 
			"keyword", "nf2_point_Notation", "name_of_subtable", "subtable_column_name", 
			"name", "function_name", "aggregate", "database_name", "table_name", 
			"table_or_index_name", "new_table_name", "column_name", "subtable_name", 
			"collation_name", "foreign_table", "index_name", "trigger_name", "view_name", 
			"module_name", "pragma_name", "savepoint_name", "table_alias", "transaction_name", 
			"any_name"
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
			"K_SELECTIVITY", "K_RANK", "K_MEDIAN", "K_MODE", "K_ENVELOPE", "IDENTIFIER", 
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
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_DROP - 65)) | (1L << (K_END - 65)) | (1L << (K_EXPLAIN - 65)) | (1L << (K_INSERT - 65)) | (1L << (K_PRAGMA - 65)) | (1L << (K_REINDEX - 65)) | (1L << (K_RELEASE - 65)) | (1L << (K_REPLACE - 65)) | (1L << (K_ROLLBACK - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (K_SAVEPOINT - 129)) | (1L << (K_SELECT - 129)) | (1L << (K_UPDATE - 129)) | (1L << (K_VACUUM - 129)) | (1L << (K_VALUES - 129)) | (1L << (K_WITH - 129)) | (1L << (UNEXPECTED_CHAR - 129)))) != 0)) {
				{
				setState(194);
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
					setState(192);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(193);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
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
			setState(201);
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
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(204);
				match(SCOL);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			sql_stmt();
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(211);
						match(SCOL);
						}
						}
						setState(214); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(216);
					sql_stmt();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					match(SCOL);
					}
					} 
				}
				setState(227);
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
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(228);
				match(K_EXPLAIN);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(229);
					match(K_QUERY);
					setState(230);
					match(K_PLAN);
					}
				}

				}
			}

			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(235);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(236);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(237);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(238);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(239);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(240);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(241);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(242);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(243);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(244);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(245);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(246);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(247);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(248);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(249);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(250);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(251);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(252);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(253);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(254);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(255);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(256);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(257);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(258);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(259);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(260);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(261);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(262);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(263);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(264);
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
			setState(267);
			match(K_ALTER);
			setState(268);
			match(K_TABLE);
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(269);
				database_name();
				setState(270);
				match(DOT);
				}
				break;
			}
			setState(274);
			table_name();
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(275);
				match(K_RENAME);
				setState(276);
				match(K_TO);
				setState(277);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(278);
				match(K_ADD);
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(279);
					match(K_COLUMN);
					}
					break;
				}
				setState(282);
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
			setState(285);
			match(K_ANALYZE);
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(286);
				database_name();
				}
				break;
			case 2:
				{
				setState(287);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(288);
				database_name();
				setState(289);
				match(DOT);
				setState(290);
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
			setState(294);
			match(K_ATTACH);
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(295);
				match(K_DATABASE);
				}
				break;
			}
			setState(298);
			expr(0);
			setState(299);
			match(K_AS);
			setState(300);
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
			setState(302);
			match(K_BEGIN);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (K_DEFERRED - 60)) | (1L << (K_EXCLUSIVE - 60)) | (1L << (K_IMMEDIATE - 60)))) != 0)) {
				{
				setState(303);
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

			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(306);
				match(K_TRANSACTION);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(307);
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
			setState(312);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(313);
				match(K_TRANSACTION);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(314);
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
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(319);
				match(K_WITH);
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(320);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(323);
				common_table_expression();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(324);
					match(COMMA);
					setState(325);
					common_table_expression();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(333);
			select_core();
			setState(343); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(340);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(334);
					match(K_UNION);
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(335);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(338);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(339);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(342);
				select_core();
				}
				}
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(347);
				match(K_ORDER);
				setState(348);
				match(K_BY);
				setState(349);
				ordering_term();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(350);
					match(COMMA);
					setState(351);
					ordering_term();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(359);
				match(K_LIMIT);
				setState(360);
				expr(0);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(361);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(362);
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
			setState(367);
			match(K_CREATE);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(368);
				match(K_UNIQUE);
				}
			}

			setState(371);
			match(K_INDEX);
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(372);
				match(K_IF);
				setState(373);
				match(K_NOT);
				setState(374);
				match(K_EXISTS);
				}
				break;
			}
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(377);
				database_name();
				setState(378);
				match(DOT);
				}
				break;
			}
			setState(382);
			index_name();
			setState(383);
			match(K_ON);
			setState(384);
			table_name();
			setState(385);
			match(OPEN_PAR);
			setState(386);
			indexed_column();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(387);
				match(COMMA);
				setState(388);
				indexed_column();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(CLOSE_PAR);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(395);
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
			setState(398);
			subtable_name();
			setState(399);
			match(K_SET);
			setState(400);
			match(OPEN_PAR);
			setState(401);
			match(K_ROW);
			setState(402);
			match(OPEN_PAR);
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(403);
				column_def();
				}
				break;
			case 2:
				{
				setState(404);
				set_row_create();
				}
				break;
			}
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(407);
					match(COMMA);
					setState(408);
					column_def();
					}
					break;
				case 2:
					{
					setState(409);
					match(COMMA);
					setState(410);
					set_row_create();
					}
					break;
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			match(CLOSE_PAR);
			setState(417);
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
			setState(419);
			match(K_CREATE);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(420);
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

			setState(423);
			match(K_TABLE);
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(424);
				match(K_IF);
				setState(425);
				match(K_NOT);
				setState(426);
				match(K_EXISTS);
				}
				break;
			}
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(429);
				database_name();
				setState(430);
				match(DOT);
				}
				break;
			}
			setState(434);
			table_name();
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(435);
				match(OPEN_PAR);
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(436);
					column_def();
					}
					break;
				case 2:
					{
					setState(437);
					set_row_create();
					}
					break;
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(440);
						match(COMMA);
						setState(443);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
						case 1:
							{
							setState(441);
							column_def();
							}
							break;
						case 2:
							{
							setState(442);
							set_row_create();
							}
							break;
						}
						}
						} 
					}
					setState(449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(450);
					match(COMMA);
					setState(451);
					table_constraint();
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(457);
				match(CLOSE_PAR);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(458);
					match(K_WITHOUT);
					setState(459);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(462);
				match(K_AS);
				setState(463);
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
			setState(466);
			match(K_CREATE);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(467);
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

			setState(470);
			match(K_TRIGGER);
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(471);
				match(K_IF);
				setState(472);
				match(K_NOT);
				setState(473);
				match(K_EXISTS);
				}
				break;
			}
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(476);
				database_name();
				setState(477);
				match(DOT);
				}
				break;
			}
			setState(481);
			trigger_name();
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(482);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(483);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(484);
				match(K_INSTEAD);
				setState(485);
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
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(488);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(489);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(490);
				match(K_UPDATE);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(491);
					match(K_OF);
					setState(492);
					column_name();
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(493);
						match(COMMA);
						setState(494);
						column_name();
						}
						}
						setState(499);
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
			setState(504);
			match(K_ON);
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(505);
				database_name();
				setState(506);
				match(DOT);
				}
				break;
			}
			setState(510);
			table_name();
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(511);
				match(K_FOR);
				setState(512);
				match(K_EACH);
				setState(513);
				match(K_ROW);
				}
			}

			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(516);
				match(K_WHEN);
				setState(517);
				expr(0);
				}
			}

			setState(520);
			match(K_BEGIN);
			setState(529); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(521);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(522);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(523);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(524);
					select_stmt();
					}
					break;
				}
				setState(527);
				match(SCOL);
				}
				}
				setState(531); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (K_INSERT - 90)) | (1L << (K_REPLACE - 90)) | (1L << (K_SELECT - 90)) | (1L << (K_UPDATE - 90)) | (1L << (K_VALUES - 90)) | (1L << (K_WITH - 90)))) != 0) );
			setState(533);
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
			setState(535);
			match(K_CREATE);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(536);
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

			setState(539);
			match(K_VIEW);
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(540);
				match(K_IF);
				setState(541);
				match(K_NOT);
				setState(542);
				match(K_EXISTS);
				}
				break;
			}
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(545);
				database_name();
				setState(546);
				match(DOT);
				}
				break;
			}
			setState(550);
			view_name();
			setState(551);
			match(K_AS);
			setState(552);
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
			setState(554);
			match(K_CREATE);
			setState(555);
			match(K_VIRTUAL);
			setState(556);
			match(K_TABLE);
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(557);
				match(K_IF);
				setState(558);
				match(K_NOT);
				setState(559);
				match(K_EXISTS);
				}
				break;
			}
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(562);
				database_name();
				setState(563);
				match(DOT);
				}
				break;
			}
			setState(567);
			table_name();
			setState(568);
			match(K_USING);
			setState(569);
			module_name();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(570);
				match(OPEN_PAR);
				setState(571);
				module_argument();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(572);
					match(COMMA);
					setState(573);
					module_argument();
					}
					}
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(579);
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
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(583);
				with_clause();
				}
			}

			setState(586);
			match(K_DELETE);
			setState(587);
			match(K_FROM);
			setState(588);
			qualified_table_name();
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(589);
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
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(592);
				with_clause();
				}
			}

			setState(595);
			match(K_DELETE);
			setState(596);
			match(K_FROM);
			setState(597);
			qualified_table_name();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(598);
				where_expr();
				}
			}

			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(601);
					match(K_ORDER);
					setState(602);
					match(K_BY);
					setState(603);
					ordering_term();
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(604);
						match(COMMA);
						setState(605);
						ordering_term();
						}
						}
						setState(610);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(613);
				match(K_LIMIT);
				setState(614);
				expr(0);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(615);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(616);
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
			setState(621);
			match(K_WHERE);
			setState(622);
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
			setState(624);
			match(K_DETACH);
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(625);
				match(K_DATABASE);
				}
				break;
			}
			setState(628);
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
			setState(630);
			match(K_DROP);
			setState(631);
			match(K_INDEX);
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(632);
				match(K_IF);
				setState(633);
				match(K_EXISTS);
				}
				break;
			}
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(636);
				database_name();
				setState(637);
				match(DOT);
				}
				break;
			}
			setState(641);
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
			setState(643);
			match(K_DROP);
			setState(644);
			match(K_TABLE);
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(645);
				match(K_IF);
				setState(646);
				match(K_EXISTS);
				}
				break;
			}
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(649);
				database_name();
				setState(650);
				match(DOT);
				}
				break;
			}
			setState(654);
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
			setState(656);
			match(K_DROP);
			setState(657);
			match(K_TRIGGER);
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(658);
				match(K_IF);
				setState(659);
				match(K_EXISTS);
				}
				break;
			}
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(662);
				database_name();
				setState(663);
				match(DOT);
				}
				break;
			}
			setState(667);
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
			setState(669);
			match(K_DROP);
			setState(670);
			match(K_VIEW);
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(671);
				match(K_IF);
				setState(672);
				match(K_EXISTS);
				}
				break;
			}
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(675);
				database_name();
				setState(676);
				match(DOT);
				}
				break;
			}
			setState(680);
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
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(682);
				match(K_WITH);
				setState(684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(683);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(686);
				common_table_expression();
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(687);
					match(COMMA);
					setState(688);
					common_table_expression();
					}
					}
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(696);
			select_core();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(697);
				compound_operator();
				setState(698);
				select_core();
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(705);
				match(K_ORDER);
				setState(706);
				match(K_BY);
				setState(707);
				ordering_term();
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(708);
					match(COMMA);
					setState(709);
					ordering_term();
					}
					}
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(717);
				match(K_LIMIT);
				setState(718);
				expr(0);
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(719);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(720);
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
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(725);
				with_clause();
				}
			}

			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(728);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(729);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(730);
				match(K_INSERT);
				setState(731);
				match(K_OR);
				setState(732);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(733);
				match(K_INSERT);
				setState(734);
				match(K_OR);
				setState(735);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(736);
				match(K_INSERT);
				setState(737);
				match(K_OR);
				setState(738);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(739);
				match(K_INSERT);
				setState(740);
				match(K_OR);
				setState(741);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(742);
				match(K_INSERT);
				setState(743);
				match(K_OR);
				setState(744);
				match(K_IGNORE);
				}
				break;
			}
			setState(747);
			match(K_INTO);
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(748);
				database_name();
				setState(749);
				match(DOT);
				}
				break;
			}
			setState(753);
			table_insert();
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(754);
				match(K_VALUES);
				setState(755);
				match(OPEN_PAR);
				setState(756);
				value_insert();
				setState(757);
				match(CLOSE_PAR);
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(758);
					match(COMMA);
					setState(759);
					match(OPEN_PAR);
					setState(760);
					value_insert();
					setState(761);
					match(CLOSE_PAR);
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(768);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(769);
				match(K_DEFAULT);
				setState(770);
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
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(773);
				row_expr();
				}
				break;
			case 2:
				{
				setState(774);
				set_expr();
				}
				break;
			case 3:
				{
				setState(775);
				expr(0);
				}
				break;
			}
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(778);
				match(COMMA);
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(779);
					row_expr();
					}
					break;
				case 2:
					{
					setState(780);
					set_expr();
					}
					break;
				case 3:
					{
					setState(781);
					expr(0);
					}
					break;
				}
				}
				}
				setState(788);
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
			setState(789);
			match(K_ROW);
			setState(790);
			match(OPEN_PAR);
			setState(791);
			value_insert();
			setState(792);
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
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				match(K_SET);
				setState(795);
				match(OPEN_PAR);
				setState(796);
				value_insert();
				setState(797);
				match(CLOSE_PAR);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				match(T__0);
				setState(800);
				value_insert();
				setState(801);
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
			setState(805);
			table_name();
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(806);
				match(OPEN_PAR);
				setState(809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(807);
					column_name();
					}
					break;
				case 2:
					{
					setState(808);
					table_insert();
					}
					break;
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(811);
					match(COMMA);
					setState(814);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						setState(812);
						column_name();
						}
						break;
					case 2:
						{
						setState(813);
						table_insert();
						}
						break;
					}
					}
					}
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(821);
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
			setState(825);
			match(K_PRAGMA);
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(826);
				database_name();
				setState(827);
				match(DOT);
				}
				break;
			}
			setState(831);
			pragma_name();
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(832);
				match(ASSIGN);
				setState(833);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(834);
				match(OPEN_PAR);
				setState(835);
				pragma_value();
				setState(836);
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
			setState(840);
			match(K_REINDEX);
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(841);
				collation_name();
				}
				break;
			case 2:
				{
				setState(845);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(842);
					database_name();
					setState(843);
					match(DOT);
					}
					break;
				}
				setState(849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(847);
					table_name();
					}
					break;
				case 2:
					{
					setState(848);
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
			setState(853);
			match(K_RELEASE);
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(854);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(857);
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
			setState(859);
			match(K_ROLLBACK);
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(860);
				match(K_TRANSACTION);
				setState(862);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(861);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(866);
				match(K_TO);
				setState(868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(867);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(870);
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
			setState(873);
			match(K_SAVEPOINT);
			setState(874);
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
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(876);
				match(K_WITH);
				setState(878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(877);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(880);
				common_table_expression();
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(881);
					match(COMMA);
					setState(882);
					common_table_expression();
					}
					}
					setState(887);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(890);
			select_core();
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(891);
				match(K_ORDER);
				setState(892);
				match(K_BY);
				setState(893);
				ordering_term();
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(894);
					match(COMMA);
					setState(895);
					ordering_term();
					}
					}
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(903);
				match(K_LIMIT);
				setState(904);
				expr(0);
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(905);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(906);
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
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(911);
				match(K_WITH);
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(912);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(915);
				common_table_expression();
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(916);
					match(COMMA);
					setState(917);
					common_table_expression();
					}
					}
					setState(922);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(925);
			select_or_values();
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(926);
				compound_operator();
				setState(927);
				select_or_values();
				}
				}
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(934);
				match(K_ORDER);
				setState(935);
				match(K_BY);
				setState(936);
				ordering_term();
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(937);
					match(COMMA);
					setState(938);
					ordering_term();
					}
					}
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(946);
				match(K_LIMIT);
				setState(947);
				expr(0);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(948);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(949);
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
			setState(1014);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				match(K_SELECT);
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(955);
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
				setState(958);
				result_column();
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(959);
					match(COMMA);
					setState(960);
					result_column();
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(966);
					match(K_FROM);
					setState(976);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
					case 1:
						{
						setState(967);
						table_or_subquery();
						setState(972);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(968);
							match(COMMA);
							setState(969);
							table_or_subquery();
							}
							}
							setState(974);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(975);
						join_clause();
						}
						break;
					}
					}
				}

				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(980);
					where_expr();
					}
				}

				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(983);
					group_by();
					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				match(K_VALUES);
				setState(987);
				match(OPEN_PAR);
				setState(988);
				expr(0);
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(989);
					match(COMMA);
					setState(990);
					expr(0);
					}
					}
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(996);
				match(CLOSE_PAR);
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(997);
					match(COMMA);
					setState(998);
					match(OPEN_PAR);
					setState(999);
					expr(0);
					setState(1004);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1000);
						match(COMMA);
						setState(1001);
						expr(0);
						}
						}
						setState(1006);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1007);
					match(CLOSE_PAR);
					}
					}
					setState(1013);
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
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1016);
				with_clause();
				}
			}

			setState(1019);
			match(K_UPDATE);
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1020);
				match(K_OR);
				setState(1021);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1022);
				match(K_OR);
				setState(1023);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1024);
				match(K_OR);
				setState(1025);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1026);
				match(K_OR);
				setState(1027);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1028);
				match(K_OR);
				setState(1029);
				match(K_IGNORE);
				}
				break;
			}
			setState(1032);
			qualified_table_name();
			setState(1033);
			match(K_SET);
			setState(1034);
			set_stmt();
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1035);
				match(COMMA);
				setState(1036);
				set_stmt();
				}
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1042);
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
			setState(1048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1045);
				column_name();
				}
				break;
			case 2:
				{
				setState(1046);
				nf2_point_Notation();
				}
				break;
			case 3:
				{
				setState(1047);
				set_row_update();
				}
				break;
			}
			setState(1050);
			match(ASSIGN);
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1051);
				row_expr();
				}
				break;
			case 2:
				{
				setState(1052);
				set_expr();
				}
				break;
			case 3:
				{
				setState(1053);
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
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1058);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1056);
					nf2_point_Notation();
					}
					break;
				case 2:
					{
					setState(1057);
					column_name();
					}
					break;
				}
				setState(1060);
				match(DOT);
				}
				break;
			}
			setState(1064);
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
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1066);
				with_clause();
				}
			}

			setState(1069);
			match(K_UPDATE);
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1070);
				match(K_OR);
				setState(1071);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1072);
				match(K_OR);
				setState(1073);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1074);
				match(K_OR);
				setState(1075);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1076);
				match(K_OR);
				setState(1077);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1078);
				match(K_OR);
				setState(1079);
				match(K_IGNORE);
				}
				break;
			}
			setState(1082);
			qualified_table_name();
			setState(1083);
			match(K_SET);
			setState(1084);
			set_stmt();
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1085);
				match(COMMA);
				setState(1086);
				set_stmt();
				}
				}
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1092);
				where_expr();
				}
			}

			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1095);
					match(K_ORDER);
					setState(1096);
					match(K_BY);
					setState(1097);
					ordering_term();
					setState(1102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1098);
						match(COMMA);
						setState(1099);
						ordering_term();
						}
						}
						setState(1104);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1107);
				match(K_LIMIT);
				setState(1108);
				expr(0);
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1109);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1110);
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
			setState(1115);
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
			setState(1117);
			column_name();
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1118);
				type_name();
				}
				break;
			}
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_NOT - 104)) | (1L << (K_NULL - 104)) | (1L << (K_PRIMARY - 104)) | (1L << (K_REFERENCES - 104)) | (1L << (K_UNIQUE - 104)))) != 0)) {
				{
				{
				setState(1121);
				column_constraint();
				}
				}
				setState(1126);
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
			setState(1128); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1127);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1130); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1132);
				match(OPEN_PAR);
				setState(1133);
				signed_number();
				setState(1134);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1136);
				match(OPEN_PAR);
				setState(1137);
				signed_number();
				setState(1138);
				match(COMMA);
				setState(1139);
				signed_number();
				setState(1140);
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
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1144);
				match(K_CONSTRAINT);
				setState(1145);
				name();
				}
			}

			setState(1181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1148);
				match(K_PRIMARY);
				setState(1149);
				match(K_KEY);
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1150);
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

				setState(1153);
				conflict_clause();
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1154);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1157);
					match(K_NOT);
					}
				}

				setState(1160);
				match(K_NULL);
				setState(1161);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1162);
				match(K_UNIQUE);
				setState(1163);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1164);
				match(K_CHECK);
				setState(1165);
				match(OPEN_PAR);
				setState(1166);
				expr(0);
				setState(1167);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1169);
				match(K_DEFAULT);
				setState(1176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1170);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1171);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1172);
					match(OPEN_PAR);
					setState(1173);
					expr(0);
					setState(1174);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1178);
				match(K_COLLATE);
				setState(1179);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1180);
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
			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1183);
				match(K_ON);
				setState(1184);
				match(K_CONFLICT);
				setState(1185);
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
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1189);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1190);
				signed_number();
				}
				break;
			case 3:
				{
				setState(1191);
				match(BIND_PARAMETER);
				}
				break;
			case 4:
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
				setState(1208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1207);
					match(DOT);
					}
					break;
				}
				setState(1211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1210);
					match(STAR);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1213);
				unary_operator();
				setState(1214);
				expr(22);
				}
				break;
			case 6:
				{
				setState(1216);
				aggregate();
				setState(1217);
				match(OPEN_PAR);
				setState(1230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						setState(1218);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1221);
					expr(0);
					setState(1226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1222);
						match(COMMA);
						setState(1223);
						expr(0);
						}
						}
						setState(1228);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1229);
					match(STAR);
					}
					break;
				}
				setState(1232);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1234);
				function_name();
				setState(1235);
				match(OPEN_PAR);
				setState(1248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						setState(1236);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1239);
					expr(0);
					setState(1244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1240);
						match(COMMA);
						setState(1241);
						expr(0);
						}
						}
						setState(1246);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1247);
					match(STAR);
					}
					break;
				}
				setState(1250);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1252);
				match(OPEN_PAR);
				setState(1253);
				expr(0);
				setState(1254);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1256);
				match(K_CAST);
				setState(1257);
				match(OPEN_PAR);
				setState(1258);
				expr(0);
				setState(1259);
				match(K_AS);
				setState(1260);
				type_name();
				setState(1261);
				match(CLOSE_PAR);
				}
				break;
			case 10:
				{
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1263);
						match(K_NOT);
						}
					}

					setState(1266);
					match(K_EXISTS);
					}
				}

				setState(1269);
				match(OPEN_PAR);
				setState(1270);
				select_stmt();
				setState(1271);
				match(CLOSE_PAR);
				}
				break;
			case 11:
				{
				setState(1273);
				match(K_CASE);
				setState(1275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1274);
					expr(0);
					}
					break;
				}
				setState(1282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1277);
					match(K_WHEN);
					setState(1278);
					expr(0);
					setState(1279);
					match(K_THEN);
					setState(1280);
					expr(0);
					}
					}
					setState(1284); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1286);
					match(K_ELSE);
					setState(1287);
					expr(0);
					}
				}

				setState(1290);
				match(K_END);
				}
				break;
			case 12:
				{
				setState(1292);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1393);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1295);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1296);
						match(PIPE2);
						setState(1297);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1298);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1299);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1300);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1301);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1302);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1303);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1304);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1305);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1306);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1307);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1308);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1309);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1310);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1323);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
						case 1:
							{
							setState(1311);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1312);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1313);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1314);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1315);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1316);
							match(K_IS);
							setState(1317);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1318);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1319);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1320);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1321);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1322);
							match(K_REGEXP);
							}
							break;
						}
						setState(1325);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1326);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1327);
						match(K_AND);
						setState(1328);
						expr(16);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1329);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1330);
						match(K_OR);
						setState(1331);
						expr(15);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1332);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1333);
						match(K_IS);
						setState(1335);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
						case 1:
							{
							setState(1334);
							match(K_NOT);
							}
							break;
						}
						setState(1337);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1338);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1340);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1339);
							match(K_NOT);
							}
						}

						setState(1342);
						match(K_BETWEEN);
						setState(1343);
						expr(0);
						setState(1344);
						match(K_AND);
						setState(1345);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1347);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1348);
						match(K_COLLATE);
						setState(1349);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1350);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1352);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1351);
							match(K_NOT);
							}
						}

						setState(1354);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_GLOB - 79)) | (1L << (K_LIKE - 79)) | (1L << (K_MATCH - 79)) | (1L << (K_REGEXP - 79)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1355);
						expr(0);
						setState(1358);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
						case 1:
							{
							setState(1356);
							match(K_ESCAPE);
							setState(1357);
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
						setState(1360);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1365);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1361);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1362);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1363);
							match(K_NOT);
							setState(1364);
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
						setState(1367);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1369);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1368);
							match(K_NOT);
							}
						}

						setState(1371);
						match(K_IN);
						setState(1391);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
						case 1:
							{
							setState(1372);
							match(OPEN_PAR);
							setState(1382);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
							case 1:
								{
								setState(1373);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1374);
								expr(0);
								setState(1379);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1375);
									match(COMMA);
									setState(1376);
									expr(0);
									}
									}
									setState(1381);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1384);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1388);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
							case 1:
								{
								setState(1385);
								database_name();
								setState(1386);
								match(DOT);
								}
								break;
							}
							setState(1390);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
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
			setState(1398);
			match(K_REFERENCES);
			setState(1399);
			foreign_table();
			setState(1411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1400);
				match(OPEN_PAR);
				setState(1401);
				column_name();
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1402);
					match(COMMA);
					setState(1403);
					column_name();
					}
					}
					setState(1408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1409);
				match(CLOSE_PAR);
				}
			}

			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1427);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1413);
					match(K_ON);
					setState(1414);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1423);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						setState(1415);
						match(K_SET);
						setState(1416);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1417);
						match(K_SET);
						setState(1418);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1419);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1420);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1421);
						match(K_NO);
						setState(1422);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1425);
					match(K_MATCH);
					setState(1426);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1434);
					match(K_NOT);
					}
				}

				setState(1437);
				match(K_DEFERRABLE);
				setState(1442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1438);
					match(K_INITIALLY);
					setState(1439);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1440);
					match(K_INITIALLY);
					setState(1441);
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
			setState(1446);
			match(K_RAISE);
			setState(1447);
			match(OPEN_PAR);
			setState(1452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1448);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1449);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1450);
				match(COMMA);
				setState(1451);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1454);
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
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1456);
				column_name();
				}
				break;
			case 2:
				{
				setState(1457);
				nf2_point_Notation();
				}
				break;
			}
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1460);
				match(K_COLLATE);
				setState(1461);
				collation_name();
				}
			}

			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1464);
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
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1467);
				match(K_CONSTRAINT);
				setState(1468);
				name();
				}
			}

			setState(1513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1471);
					match(K_PRIMARY);
					setState(1472);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1473);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1476);
				match(OPEN_PAR);
				setState(1477);
				indexed_column();
				setState(1482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1478);
					match(COMMA);
					setState(1479);
					indexed_column();
					}
					}
					setState(1484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1485);
				match(CLOSE_PAR);
				setState(1486);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1488);
				match(K_CHECK);
				setState(1489);
				match(OPEN_PAR);
				setState(1490);
				expr(0);
				setState(1491);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1493);
				match(K_FOREIGN);
				setState(1494);
				match(K_KEY);
				setState(1495);
				match(OPEN_PAR);
				setState(1498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1496);
					column_name();
					}
					break;
				case 2:
					{
					setState(1497);
					nf2_point_Notation();
					}
					break;
				}
				setState(1504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1500);
						match(COMMA);
						setState(1501);
						column_name();
						}
						} 
					}
					setState(1506);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				}
				{
				setState(1507);
				match(COMMA);
				setState(1508);
				nf2_point_Notation();
				}
				setState(1510);
				match(CLOSE_PAR);
				setState(1511);
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
			setState(1515);
			match(K_WITH);
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1516);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1519);
			cte_table_name();
			setState(1520);
			match(K_AS);
			setState(1521);
			match(OPEN_PAR);
			setState(1522);
			select_stmt();
			setState(1523);
			match(CLOSE_PAR);
			setState(1533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1524);
				match(COMMA);
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
				}
				}
				setState(1535);
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
			setState(1536);
			table_name();
			setState(1541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1537);
				match(DOT);
				setState(1538);
				subtable_name();
				}
				}
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1544);
				match(K_INDEXED);
				setState(1545);
				match(K_BY);
				setState(1546);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1547);
				match(K_NOT);
				setState(1548);
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
			setState(1551);
			expr(0);
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1552);
				match(K_COLLATE);
				setState(1553);
				collation_name();
				}
			}

			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1556);
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
			setState(1562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1559);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1560);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1561);
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
			setState(1564);
			table_name();
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1565);
				match(OPEN_PAR);
				setState(1568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1566);
					column_name();
					}
					break;
				case 2:
					{
					setState(1567);
					nf2_point_Notation();
					}
					break;
				}
				setState(1574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1570);
						match(COMMA);
						setState(1571);
						column_name();
						}
						} 
					}
					setState(1576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				}
				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1577);
					match(COMMA);
					setState(1578);
					nf2_point_Notation();
					}
					}
					setState(1583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1584);
				match(CLOSE_PAR);
				}
			}

			setState(1588);
			match(K_AS);
			setState(1589);
			match(OPEN_PAR);
			setState(1590);
			select_stmt();
			setState(1591);
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
			setState(1601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1594);
				expr(0);
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1596);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1595);
						match(K_AS);
						}
					}

					setState(1598);
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
		enterRule(_localctx, 116, RULE_table_or_subquery);
		int _la;
		try {
			setState(1651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1603);
				table_name();
				setState(1608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1604);
					match(DOT);
					setState(1605);
					column_name();
					}
					break;
				case 2:
					{
					setState(1606);
					match(DOT);
					setState(1607);
					nf2_point_Notation();
					}
					break;
				}
				setState(1614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1611);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
					case 1:
						{
						setState(1610);
						match(K_AS);
						}
						break;
					}
					setState(1613);
					table_alias();
					}
					break;
				}
				setState(1621);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1616);
					match(K_INDEXED);
					setState(1617);
					match(K_BY);
					setState(1618);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1619);
					match(K_NOT);
					setState(1620);
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
				setState(1623);
				match(OPEN_PAR);
				setState(1633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1624);
					table_or_subquery();
					setState(1629);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1625);
						match(COMMA);
						setState(1626);
						table_or_subquery();
						}
						}
						setState(1631);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1632);
					join_clause();
					}
					break;
				}
				setState(1635);
				match(CLOSE_PAR);
				setState(1640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1637);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
					case 1:
						{
						setState(1636);
						match(K_AS);
						}
						break;
					}
					setState(1639);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1642);
				match(OPEN_PAR);
				setState(1643);
				select_stmt();
				setState(1644);
				match(CLOSE_PAR);
				setState(1649);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1646);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
					case 1:
						{
						setState(1645);
						match(K_AS);
						}
						break;
					}
					setState(1648);
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
		enterRule(_localctx, 118, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			table_or_subquery();
			setState(1660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INNER - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_NATURAL - 89)))) != 0)) {
				{
				{
				setState(1654);
				join_operator();
				setState(1655);
				table_or_subquery();
				setState(1656);
				join_constraint();
				}
				}
				setState(1662);
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
		enterRule(_localctx, 120, RULE_join_operator);
		int _la;
		try {
			setState(1676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
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
				setState(1665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1664);
					match(K_NATURAL);
					}
				}

				setState(1673);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1667);
					match(K_LEFT);
					setState(1669);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1668);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1671);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1672);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1675);
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
		enterRule(_localctx, 122, RULE_join_constraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1678);
				match(K_ON);
				setState(1679);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1680);
				match(K_USING);
				setState(1681);
				match(OPEN_PAR);
				setState(1684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1682);
					nf2_point_Notation();
					}
					break;
				case 2:
					{
					setState(1683);
					column_name();
					}
					break;
				}
				setState(1690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1686);
						match(COMMA);
						setState(1687);
						column_name();
						}
						} 
					}
					setState(1692);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
				}
				setState(1697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1693);
					match(COMMA);
					setState(1694);
					nf2_point_Notation();
					}
					}
					setState(1699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1700);
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
		enterRule(_localctx, 124, RULE_group_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			match(K_GROUP);
			setState(1705);
			match(K_BY);
			setState(1706);
			expr(0);
			setState(1711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1707);
				match(COMMA);
				setState(1708);
				expr(0);
				}
				}
				setState(1713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_HAVING) {
				{
				setState(1714);
				match(K_HAVING);
				setState(1715);
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
		enterRule(_localctx, 126, RULE_select_core);
		int _la;
		try {
			setState(1778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1718);
				match(K_SELECT);
				setState(1720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1719);
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
				setState(1722);
				result_column();
				setState(1727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1723);
					match(COMMA);
					setState(1724);
					result_column();
					}
					}
					setState(1729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1730);
					match(K_FROM);
					setState(1740);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
					case 1:
						{
						setState(1731);
						table_or_subquery();
						setState(1736);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1732);
							match(COMMA);
							setState(1733);
							table_or_subquery();
							}
							}
							setState(1738);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1739);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1744);
					where_expr();
					}
				}

				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1747);
					group_by();
					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1750);
				match(K_VALUES);
				setState(1751);
				match(OPEN_PAR);
				setState(1752);
				expr(0);
				setState(1757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1753);
					match(COMMA);
					setState(1754);
					expr(0);
					}
					}
					setState(1759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1760);
				match(CLOSE_PAR);
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1761);
					match(COMMA);
					setState(1762);
					match(OPEN_PAR);
					setState(1763);
					expr(0);
					setState(1768);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1764);
						match(COMMA);
						setState(1765);
						expr(0);
						}
						}
						setState(1770);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1771);
					match(CLOSE_PAR);
					}
					}
					setState(1777);
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
		enterRule(_localctx, 128, RULE_compound_operator);
		try {
			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1780);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1781);
				match(K_UNION);
				setState(1782);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1783);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1784);
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
		enterRule(_localctx, 130, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			table_name();
			setState(1803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1788);
				match(OPEN_PAR);
				setState(1791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(1789);
					column_name();
					}
					break;
				case 2:
					{
					setState(1790);
					nf2_point_Notation();
					}
					break;
				}
				setState(1798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << COMMA) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(1796);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						setState(1793);
						match(COMMA);
						setState(1794);
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
						setState(1795);
						nf2_point_Notation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1800);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1801);
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
		enterRule(_localctx, 132, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1805);
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

			setState(1808);
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
		enterRule(_localctx, 134, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (K_CURRENT_DATE - 54)) | (1L << (K_CURRENT_TIME - 54)) | (1L << (K_CURRENT_TIMESTAMP - 54)) | (1L << (K_NULL - 54)))) != 0) || ((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (NUMERIC_LITERAL - 167)) | (1L << (STRING_LITERAL - 167)) | (1L << (BLOB_LITERAL - 167)))) != 0)) ) {
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
		enterRule(_localctx, 136, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
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
		enterRule(_localctx, 138, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
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
		enterRule(_localctx, 140, RULE_module_argument);
		try {
			setState(1818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1816);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1817);
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
		enterRule(_localctx, 142, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
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
		enterRule(_localctx, 144, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
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
		enterRule(_localctx, 146, RULE_nf2_point_Notation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			name_of_subtable();
			setState(1825);
			match(DOT);
			setState(1826);
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
		enterRule(_localctx, 148, RULE_name_of_subtable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			subtable_name();
			setState(1833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1829);
					match(DOT);
					setState(1830);
					subtable_name();
					}
					} 
				}
				setState(1835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
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
		enterRule(_localctx, 150, RULE_subtable_column_name);
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
		enterRule(_localctx, 152, RULE_name);
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
		enterRule(_localctx, 154, RULE_function_name);
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
		enterRule(_localctx, 156, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			_la = _input.LA(1);
			if ( !(((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (K_AVG - 153)) | (1L << (K_EVERY - 153)) | (1L << (K_ANY - 153)) | (1L << (K_COUNT - 153)) | (1L << (K_LISTAGG - 153)) | (1L << (K_MAX - 153)) | (1L << (K_MIN - 153)) | (1L << (K_SUM - 153)) | (1L << (K_SELECTIVITY - 153)) | (1L << (K_RANK - 153)) | (1L << (K_MEDIAN - 153)) | (1L << (K_MODE - 153)) | (1L << (K_ENVELOPE - 153)))) != 0)) ) {
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
		enterRule(_localctx, 158, RULE_database_name);
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
		enterRule(_localctx, 160, RULE_table_name);
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
		enterRule(_localctx, 162, RULE_table_or_index_name);
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
		enterRule(_localctx, 164, RULE_new_table_name);
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
		enterRule(_localctx, 166, RULE_column_name);
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
		enterRule(_localctx, 168, RULE_subtable_name);
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
		enterRule(_localctx, 170, RULE_collation_name);
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
		enterRule(_localctx, 172, RULE_foreign_table);
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
		enterRule(_localctx, 174, RULE_index_name);
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
		enterRule(_localctx, 176, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
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
		enterRule(_localctx, 178, RULE_view_name);
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
		enterRule(_localctx, 180, RULE_module_name);
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
		enterRule(_localctx, 182, RULE_pragma_name);
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
		enterRule(_localctx, 184, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
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
		enterRule(_localctx, 186, RULE_table_alias);
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
		enterRule(_localctx, 188, RULE_transaction_name);
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
		enterRule(_localctx, 190, RULE_any_name);
		try {
			setState(1883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1876);
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
				setState(1877);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1878);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1879);
				match(OPEN_PAR);
				setState(1880);
				any_name();
				setState(1881);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b0\u0760\4\2\t"+
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
		"`\t`\4a\ta\3\2\3\2\7\2\u00c5\n\2\f\2\16\2\u00c8\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\7\4\u00d0\n\4\f\4\16\4\u00d3\13\4\3\4\3\4\6\4\u00d7\n\4\r\4\16"+
		"\4\u00d8\3\4\7\4\u00dc\n\4\f\4\16\4\u00df\13\4\3\4\7\4\u00e2\n\4\f\4\16"+
		"\4\u00e5\13\4\3\5\3\5\3\5\5\5\u00ea\n\5\5\5\u00ec\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u010c\n\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0113\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u011b\n\6\3\6\5\6\u011e\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0127\n\7\3\b\3\b\5\b\u012b\n\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\5\t\u0133\n\t\3\t\3\t\5\t\u0137\n\t\5\t\u0139\n\t\3\n"+
		"\3\n\3\n\5\n\u013e\n\n\5\n\u0140\n\n\3\13\3\13\5\13\u0144\n\13\3\13\3"+
		"\13\3\13\7\13\u0149\n\13\f\13\16\13\u014c\13\13\5\13\u014e\n\13\3\13\3"+
		"\13\3\13\5\13\u0153\n\13\3\13\3\13\5\13\u0157\n\13\3\13\6\13\u015a\n\13"+
		"\r\13\16\13\u015b\3\13\3\13\3\13\3\13\3\13\7\13\u0163\n\13\f\13\16\13"+
		"\u0166\13\13\5\13\u0168\n\13\3\13\3\13\3\13\3\13\5\13\u016e\n\13\5\13"+
		"\u0170\n\13\3\f\3\f\5\f\u0174\n\f\3\f\3\f\3\f\3\f\5\f\u017a\n\f\3\f\3"+
		"\f\3\f\5\f\u017f\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0188\n\f\f\f\16"+
		"\f\u018b\13\f\3\f\3\f\5\f\u018f\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0198"+
		"\n\r\3\r\3\r\3\r\3\r\7\r\u019e\n\r\f\r\16\r\u01a1\13\r\3\r\3\r\3\r\3\16"+
		"\3\16\5\16\u01a8\n\16\3\16\3\16\3\16\3\16\5\16\u01ae\n\16\3\16\3\16\3"+
		"\16\5\16\u01b3\n\16\3\16\3\16\3\16\3\16\5\16\u01b9\n\16\3\16\3\16\3\16"+
		"\5\16\u01be\n\16\7\16\u01c0\n\16\f\16\16\16\u01c3\13\16\3\16\3\16\7\16"+
		"\u01c7\n\16\f\16\16\16\u01ca\13\16\3\16\3\16\3\16\5\16\u01cf\n\16\3\16"+
		"\3\16\5\16\u01d3\n\16\3\17\3\17\5\17\u01d7\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u01dd\n\17\3\17\3\17\3\17\5\17\u01e2\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u01e9\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01f2\n\17\f"+
		"\17\16\17\u01f5\13\17\5\17\u01f7\n\17\5\17\u01f9\n\17\3\17\3\17\3\17\3"+
		"\17\5\17\u01ff\n\17\3\17\3\17\3\17\3\17\5\17\u0205\n\17\3\17\3\17\5\17"+
		"\u0209\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u0210\n\17\3\17\3\17\6\17\u0214"+
		"\n\17\r\17\16\17\u0215\3\17\3\17\3\20\3\20\5\20\u021c\n\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0222\n\20\3\20\3\20\3\20\5\20\u0227\n\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0233\n\21\3\21\3\21\3\21\5\21"+
		"\u0238\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0241\n\21\f\21\16"+
		"\21\u0244\13\21\3\21\3\21\5\21\u0248\n\21\3\22\5\22\u024b\n\22\3\22\3"+
		"\22\3\22\3\22\5\22\u0251\n\22\3\23\5\23\u0254\n\23\3\23\3\23\3\23\3\23"+
		"\5\23\u025a\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u0261\n\23\f\23\16\23\u0264"+
		"\13\23\5\23\u0266\n\23\3\23\3\23\3\23\3\23\5\23\u026c\n\23\5\23\u026e"+
		"\n\23\3\24\3\24\3\24\3\25\3\25\5\25\u0275\n\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\5\26\u027d\n\26\3\26\3\26\3\26\5\26\u0282\n\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\5\27\u028a\n\27\3\27\3\27\3\27\5\27\u028f\n\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\5\30\u0297\n\30\3\30\3\30\3\30\5\30\u029c\n\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\5\31\u02a4\n\31\3\31\3\31\3\31\5\31\u02a9"+
		"\n\31\3\31\3\31\3\32\3\32\5\32\u02af\n\32\3\32\3\32\3\32\7\32\u02b4\n"+
		"\32\f\32\16\32\u02b7\13\32\5\32\u02b9\n\32\3\32\3\32\3\32\3\32\7\32\u02bf"+
		"\n\32\f\32\16\32\u02c2\13\32\3\32\3\32\3\32\3\32\3\32\7\32\u02c9\n\32"+
		"\f\32\16\32\u02cc\13\32\5\32\u02ce\n\32\3\32\3\32\3\32\3\32\5\32\u02d4"+
		"\n\32\5\32\u02d6\n\32\3\33\5\33\u02d9\n\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02ec"+
		"\n\33\3\33\3\33\3\33\3\33\5\33\u02f2\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u02fe\n\33\f\33\16\33\u0301\13\33\3\33\3\33"+
		"\3\33\5\33\u0306\n\33\3\34\3\34\3\34\5\34\u030b\n\34\3\34\3\34\3\34\3"+
		"\34\5\34\u0311\n\34\7\34\u0313\n\34\f\34\16\34\u0316\13\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0326"+
		"\n\36\3\37\3\37\3\37\3\37\5\37\u032c\n\37\3\37\3\37\3\37\5\37\u0331\n"+
		"\37\7\37\u0333\n\37\f\37\16\37\u0336\13\37\3\37\3\37\5\37\u033a\n\37\3"+
		" \3 \3 \3 \5 \u0340\n \3 \3 \3 \3 \3 \3 \3 \5 \u0349\n \3!\3!\3!\3!\3"+
		"!\5!\u0350\n!\3!\3!\5!\u0354\n!\5!\u0356\n!\3\"\3\"\5\"\u035a\n\"\3\""+
		"\3\"\3#\3#\3#\5#\u0361\n#\5#\u0363\n#\3#\3#\5#\u0367\n#\3#\5#\u036a\n"+
		"#\3$\3$\3$\3%\3%\5%\u0371\n%\3%\3%\3%\7%\u0376\n%\f%\16%\u0379\13%\5%"+
		"\u037b\n%\3%\3%\3%\3%\3%\3%\7%\u0383\n%\f%\16%\u0386\13%\5%\u0388\n%\3"+
		"%\3%\3%\3%\5%\u038e\n%\5%\u0390\n%\3&\3&\5&\u0394\n&\3&\3&\3&\7&\u0399"+
		"\n&\f&\16&\u039c\13&\5&\u039e\n&\3&\3&\3&\3&\7&\u03a4\n&\f&\16&\u03a7"+
		"\13&\3&\3&\3&\3&\3&\7&\u03ae\n&\f&\16&\u03b1\13&\5&\u03b3\n&\3&\3&\3&"+
		"\3&\5&\u03b9\n&\5&\u03bb\n&\3\'\3\'\5\'\u03bf\n\'\3\'\3\'\3\'\7\'\u03c4"+
		"\n\'\f\'\16\'\u03c7\13\'\3\'\3\'\3\'\3\'\7\'\u03cd\n\'\f\'\16\'\u03d0"+
		"\13\'\3\'\5\'\u03d3\n\'\5\'\u03d5\n\'\3\'\5\'\u03d8\n\'\3\'\5\'\u03db"+
		"\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u03e2\n\'\f\'\16\'\u03e5\13\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\7\'\u03ed\n\'\f\'\16\'\u03f0\13\'\3\'\3\'\7\'\u03f4\n\'\f"+
		"\'\16\'\u03f7\13\'\5\'\u03f9\n\'\3(\5(\u03fc\n(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u0409\n(\3(\3(\3(\3(\3(\7(\u0410\n(\f(\16(\u0413\13(\3("+
		"\5(\u0416\n(\3)\3)\3)\5)\u041b\n)\3)\3)\3)\3)\5)\u0421\n)\3*\3*\5*\u0425"+
		"\n*\3*\3*\5*\u0429\n*\3*\3*\3+\5+\u042e\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\5+\u043b\n+\3+\3+\3+\3+\3+\7+\u0442\n+\f+\16+\u0445\13+\3+\5+\u0448"+
		"\n+\3+\3+\3+\3+\3+\7+\u044f\n+\f+\16+\u0452\13+\5+\u0454\n+\3+\3+\3+\3"+
		"+\5+\u045a\n+\5+\u045c\n+\3,\3,\3-\3-\5-\u0462\n-\3-\7-\u0465\n-\f-\16"+
		"-\u0468\13-\3.\6.\u046b\n.\r.\16.\u046c\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\5.\u0479\n.\3/\3/\5/\u047d\n/\3/\3/\3/\5/\u0482\n/\3/\3/\5/\u0486\n/"+
		"\3/\5/\u0489\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u049b"+
		"\n/\3/\3/\3/\5/\u04a0\n/\3\60\3\60\3\60\5\60\u04a5\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u04ae\n\61\3\61\5\61\u04b1\n\61\3\61\3\61\7"+
		"\61\u04b5\n\61\f\61\16\61\u04b8\13\61\3\61\5\61\u04bb\n\61\3\61\5\61\u04be"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u04c6\n\61\3\61\3\61\3\61\7\61"+
		"\u04cb\n\61\f\61\16\61\u04ce\13\61\3\61\5\61\u04d1\n\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u04d8\n\61\3\61\3\61\3\61\7\61\u04dd\n\61\f\61\16\61\u04e0"+
		"\13\61\3\61\5\61\u04e3\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\5\61\u04f3\n\61\3\61\5\61\u04f6\n\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u04fe\n\61\3\61\3\61\3\61\3\61\3\61\6\61"+
		"\u0505\n\61\r\61\16\61\u0506\3\61\3\61\5\61\u050b\n\61\3\61\3\61\3\61"+
		"\5\61\u0510\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u052e\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u053a\n\61\3\61\3\61\3\61\5\61\u053f\n\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u054b\n\61\3\61\3\61\3\61"+
		"\3\61\5\61\u0551\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u0558\n\61\3\61\3"+
		"\61\5\61\u055c\n\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0564\n\61\f\61"+
		"\16\61\u0567\13\61\5\61\u0569\n\61\3\61\3\61\3\61\3\61\5\61\u056f\n\61"+
		"\3\61\5\61\u0572\n\61\7\61\u0574\n\61\f\61\16\61\u0577\13\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\7\62\u057f\n\62\f\62\16\62\u0582\13\62\3\62\3\62"+
		"\5\62\u0586\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u0592\n\62\3\62\3\62\5\62\u0596\n\62\7\62\u0598\n\62\f\62\16\62\u059b"+
		"\13\62\3\62\5\62\u059e\n\62\3\62\3\62\3\62\3\62\3\62\5\62\u05a5\n\62\5"+
		"\62\u05a7\n\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u05af\n\63\3\63\3\63"+
		"\3\64\3\64\5\64\u05b5\n\64\3\64\3\64\5\64\u05b9\n\64\3\64\5\64\u05bc\n"+
		"\64\3\65\3\65\5\65\u05c0\n\65\3\65\3\65\3\65\5\65\u05c5\n\65\3\65\3\65"+
		"\3\65\3\65\7\65\u05cb\n\65\f\65\16\65\u05ce\13\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u05dd\n\65\3\65\3\65"+
		"\7\65\u05e1\n\65\f\65\16\65\u05e4\13\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u05ec\n\65\3\66\3\66\5\66\u05f0\n\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u05fe\n\66\f\66\16\66\u0601\13"+
		"\66\3\67\3\67\3\67\7\67\u0606\n\67\f\67\16\67\u0609\13\67\3\67\3\67\3"+
		"\67\3\67\3\67\5\67\u0610\n\67\38\38\38\58\u0615\n8\38\58\u0618\n8\39\3"+
		"9\39\59\u061d\n9\3:\3:\3:\3:\5:\u0623\n:\3:\3:\7:\u0627\n:\f:\16:\u062a"+
		"\13:\3:\3:\7:\u062e\n:\f:\16:\u0631\13:\3:\3:\5:\u0635\n:\3:\3:\3:\3:"+
		"\3:\3;\3;\3;\5;\u063f\n;\3;\5;\u0642\n;\5;\u0644\n;\3<\3<\3<\3<\3<\5<"+
		"\u064b\n<\3<\5<\u064e\n<\3<\5<\u0651\n<\3<\3<\3<\3<\3<\5<\u0658\n<\3<"+
		"\3<\3<\3<\7<\u065e\n<\f<\16<\u0661\13<\3<\5<\u0664\n<\3<\3<\5<\u0668\n"+
		"<\3<\5<\u066b\n<\3<\3<\3<\3<\5<\u0671\n<\3<\5<\u0674\n<\5<\u0676\n<\3"+
		"=\3=\3=\3=\3=\7=\u067d\n=\f=\16=\u0680\13=\3>\3>\5>\u0684\n>\3>\3>\5>"+
		"\u0688\n>\3>\3>\5>\u068c\n>\3>\5>\u068f\n>\3?\3?\3?\3?\3?\3?\5?\u0697"+
		"\n?\3?\3?\7?\u069b\n?\f?\16?\u069e\13?\3?\3?\7?\u06a2\n?\f?\16?\u06a5"+
		"\13?\3?\3?\5?\u06a9\n?\3@\3@\3@\3@\3@\7@\u06b0\n@\f@\16@\u06b3\13@\3@"+
		"\3@\5@\u06b7\n@\3A\3A\5A\u06bb\nA\3A\3A\3A\7A\u06c0\nA\fA\16A\u06c3\13"+
		"A\3A\3A\3A\3A\7A\u06c9\nA\fA\16A\u06cc\13A\3A\5A\u06cf\nA\5A\u06d1\nA"+
		"\3A\5A\u06d4\nA\3A\5A\u06d7\nA\3A\3A\3A\3A\3A\7A\u06de\nA\fA\16A\u06e1"+
		"\13A\3A\3A\3A\3A\3A\3A\7A\u06e9\nA\fA\16A\u06ec\13A\3A\3A\7A\u06f0\nA"+
		"\fA\16A\u06f3\13A\5A\u06f5\nA\3B\3B\3B\3B\3B\5B\u06fc\nB\3C\3C\3C\3C\5"+
		"C\u0702\nC\3C\3C\3C\7C\u0707\nC\fC\16C\u070a\13C\3C\3C\5C\u070e\nC\3D"+
		"\5D\u0711\nD\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\5H\u071d\nH\3I\3I\3J\3J\3K"+
		"\3K\3K\3K\3L\3L\3L\7L\u072a\nL\fL\16L\u072d\13L\3M\3M\3N\3N\3O\3O\3P\3"+
		"P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3"+
		"\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3a\3a\3a\3a\3a\5a\u075e\na\3a\2\3"+
		"`b\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\2\25\5\2>>IIVV\4\2\63\63FF\4\2\t\tnn\3\2\u0087\u0088\4\2"+
		"!!BB\4\2&&@@\7\2\35\35LLUU~~\u0081\u0081\4\2\13\13\20\21\3\2\f\r\3\2\22"+
		"\25\3\2\26\31\6\2QQeeggzz\4\2??\u008f\u008f\5\2\35\35LL\u0081\u0081\6"+
		"\28:ll\u00a9\u00a9\u00ab\u00ac\4\2\f\16jj\4\2\u00a8\u00a8\u00ab\u00ab"+
		"\3\2\35\u0098\3\2\u009b\u00a7\2\u0880\2\u00c6\3\2\2\2\4\u00cb\3\2\2\2"+
		"\6\u00d1\3\2\2\2\b\u00eb\3\2\2\2\n\u010d\3\2\2\2\f\u011f\3\2\2\2\16\u0128"+
		"\3\2\2\2\20\u0130\3\2\2\2\22\u013a\3\2\2\2\24\u014d\3\2\2\2\26\u0171\3"+
		"\2\2\2\30\u0190\3\2\2\2\32\u01a5\3\2\2\2\34\u01d4\3\2\2\2\36\u0219\3\2"+
		"\2\2 \u022c\3\2\2\2\"\u024a\3\2\2\2$\u0253\3\2\2\2&\u026f\3\2\2\2(\u0272"+
		"\3\2\2\2*\u0278\3\2\2\2,\u0285\3\2\2\2.\u0292\3\2\2\2\60\u029f\3\2\2\2"+
		"\62\u02b8\3\2\2\2\64\u02d8\3\2\2\2\66\u030a\3\2\2\28\u0317\3\2\2\2:\u0325"+
		"\3\2\2\2<\u0327\3\2\2\2>\u033b\3\2\2\2@\u034a\3\2\2\2B\u0357\3\2\2\2D"+
		"\u035d\3\2\2\2F\u036b\3\2\2\2H\u037a\3\2\2\2J\u039d\3\2\2\2L\u03f8\3\2"+
		"\2\2N\u03fb\3\2\2\2P\u041a\3\2\2\2R\u0428\3\2\2\2T\u042d\3\2\2\2V\u045d"+
		"\3\2\2\2X\u045f\3\2\2\2Z\u046a\3\2\2\2\\\u047c\3\2\2\2^\u04a4\3\2\2\2"+
		"`\u050f\3\2\2\2b\u0578\3\2\2\2d\u05a8\3\2\2\2f\u05b4\3\2\2\2h\u05bf\3"+
		"\2\2\2j\u05ed\3\2\2\2l\u0602\3\2\2\2n\u0611\3\2\2\2p\u061c\3\2\2\2r\u061e"+
		"\3\2\2\2t\u0643\3\2\2\2v\u0675\3\2\2\2x\u0677\3\2\2\2z\u068e\3\2\2\2|"+
		"\u06a8\3\2\2\2~\u06aa\3\2\2\2\u0080\u06f4\3\2\2\2\u0082\u06fb\3\2\2\2"+
		"\u0084\u06fd\3\2\2\2\u0086\u0710\3\2\2\2\u0088\u0714\3\2\2\2\u008a\u0716"+
		"\3\2\2\2\u008c\u0718\3\2\2\2\u008e\u071c\3\2\2\2\u0090\u071e\3\2\2\2\u0092"+
		"\u0720\3\2\2\2\u0094\u0722\3\2\2\2\u0096\u0726\3\2\2\2\u0098\u072e\3\2"+
		"\2\2\u009a\u0730\3\2\2\2\u009c\u0732\3\2\2\2\u009e\u0734\3\2\2\2\u00a0"+
		"\u0736\3\2\2\2\u00a2\u0738\3\2\2\2\u00a4\u073a\3\2\2\2\u00a6\u073c\3\2"+
		"\2\2\u00a8\u073e\3\2\2\2\u00aa\u0740\3\2\2\2\u00ac\u0742\3\2\2\2\u00ae"+
		"\u0744\3\2\2\2\u00b0\u0746\3\2\2\2\u00b2\u0748\3\2\2\2\u00b4\u074a\3\2"+
		"\2\2\u00b6\u074c\3\2\2\2\u00b8\u074e\3\2\2\2\u00ba\u0750\3\2\2\2\u00bc"+
		"\u0752\3\2\2\2\u00be\u0754\3\2\2\2\u00c0\u075d\3\2\2\2\u00c2\u00c5\5\6"+
		"\4\2\u00c3\u00c5\5\4\3\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\2\2\3\u00ca\3\3\2\2\2\u00cb\u00cc"+
		"\7\u00b0\2\2\u00cc\u00cd\b\3\1\2\u00cd\5\3\2\2\2\u00ce\u00d0\7\5\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00dd\5\b\5\2\u00d5"+
		"\u00d7\7\5\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\5\b\5\2\u00db"+
		"\u00d6\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e3\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\7\5\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\7K\2\2\u00e7\u00e8"+
		"\7v\2\2\u00e8\u00ea\7s\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u010b\3\2"+
		"\2\2\u00ed\u010c\5\n\6\2\u00ee\u010c\5\f\7\2\u00ef\u010c\5\16\b\2\u00f0"+
		"\u010c\5\20\t\2\u00f1\u010c\5\22\n\2\u00f2\u010c\5\24\13\2\u00f3\u010c"+
		"\5\26\f\2\u00f4\u010c\5\32\16\2\u00f5\u010c\5\34\17\2\u00f6\u010c\5\36"+
		"\20\2\u00f7\u010c\5 \21\2\u00f8\u010c\5\"\22\2\u00f9\u010c\5$\23\2\u00fa"+
		"\u010c\5(\25\2\u00fb\u010c\5*\26\2\u00fc\u010c\5,\27\2\u00fd\u010c\5."+
		"\30\2\u00fe\u010c\5\60\31\2\u00ff\u010c\5\62\32\2\u0100\u010c\5\64\33"+
		"\2\u0101\u010c\5> \2\u0102\u010c\5@!\2\u0103\u010c\5B\"\2\u0104\u010c"+
		"\5D#\2\u0105\u010c\5F$\2\u0106\u010c\5H%\2\u0107\u010c\5J&\2\u0108\u010c"+
		"\5N(\2\u0109\u010c\5T+\2\u010a\u010c\5V,\2\u010b\u00ed\3\2\2\2\u010b\u00ee"+
		"\3\2\2\2\u010b\u00ef\3\2\2\2\u010b\u00f0\3\2\2\2\u010b\u00f1\3\2\2\2\u010b"+
		"\u00f2\3\2\2\2\u010b\u00f3\3\2\2\2\u010b\u00f4\3\2\2\2\u010b\u00f5\3\2"+
		"\2\2\u010b\u00f6\3\2\2\2\u010b\u00f7\3\2\2\2\u010b\u00f8\3\2\2\2\u010b"+
		"\u00f9\3\2\2\2\u010b\u00fa\3\2\2\2\u010b\u00fb\3\2\2\2\u010b\u00fc\3\2"+
		"\2\2\u010b\u00fd\3\2\2\2\u010b\u00fe\3\2\2\2\u010b\u00ff\3\2\2\2\u010b"+
		"\u0100\3\2\2\2\u010b\u0101\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0103\3\2"+
		"\2\2\u010b\u0104\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b"+
		"\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2"+
		"\2\2\u010c\t\3\2\2\2\u010d\u010e\7\"\2\2\u010e\u0112\7\u0086\2\2\u010f"+
		"\u0110\5\u00a0Q\2\u0110\u0111\7\6\2\2\u0111\u0113\3\2\2\2\u0112\u010f"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u011d\5\u00a2R"+
		"\2\u0115\u0116\7}\2\2\u0116\u0117\7\u008a\2\2\u0117\u011e\5\u00a6T\2\u0118"+
		"\u011a\7\37\2\2\u0119\u011b\7\62\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\5X-\2\u011d\u0115\3\2\2\2\u011d"+
		"\u0118\3\2\2\2\u011e\13\3\2\2\2\u011f\u0126\7#\2\2\u0120\u0127\5\u00a0"+
		"Q\2\u0121\u0127\5\u00a4S\2\u0122\u0123\5\u00a0Q\2\u0123\u0124\7\6\2\2"+
		"\u0124\u0125\5\u00a4S\2\u0125\u0127\3\2\2\2\u0126\u0120\3\2\2\2\u0126"+
		"\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0127\3\2\2\2\u0127\r\3\2\2\2"+
		"\u0128\u012a\7\'\2\2\u0129\u012b\7;\2\2\u012a\u0129\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5`\61\2\u012d\u012e\7%\2\2\u012e"+
		"\u012f\5\u00a0Q\2\u012f\17\3\2\2\2\u0130\u0132\7*\2\2\u0131\u0133\t\2"+
		"\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0138\3\2\2\2\u0134"+
		"\u0136\7\u008b\2\2\u0135\u0137\5\u00be`\2\u0136\u0135\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0134\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\21\3\2\2\2\u013a\u013f\t\3\2\2\u013b\u013d\7\u008b\2\2\u013c\u013e\5"+
		"\u00be`\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2"+
		"\u013f\u013b\3\2\2\2\u013f\u0140\3\2\2\2\u0140\23\3\2\2\2\u0141\u0143"+
		"\7\u0097\2\2\u0142\u0144\7x\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2"+
		"\2\u0144\u0145\3\2\2\2\u0145\u014a\5r:\2\u0146\u0147\7\t\2\2\u0147\u0149"+
		"\5r:\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0141\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0159\5\u0080A\2\u0150"+
		"\u0152\7\u008d\2\2\u0151\u0153\7!\2\2\u0152\u0151\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0157\3\2\2\2\u0154\u0157\7^\2\2\u0155\u0157\7H\2\2\u0156"+
		"\u0150\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015a\5\u0080A\2\u0159\u0156\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0167\3\2\2\2\u015d\u015e\7q"+
		"\2\2\u015e\u015f\7,\2\2\u015f\u0164\5n8\2\u0160\u0161\7\t\2\2\u0161\u0163"+
		"\5n8\2\u0162\u0160\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u015d\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u016f\3\2\2\2\u0169\u016a\7f\2\2\u016a"+
		"\u016d\5`\61\2\u016b\u016c\t\4\2\2\u016c\u016e\5`\61\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0169\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\25\3\2\2\2\u0171\u0173\7\66\2\2\u0172\u0174\7\u008e"+
		"\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0179\7X\2\2\u0176\u0177\7T\2\2\u0177\u0178\7j\2\2\u0178\u017a\7J\2\2"+
		"\u0179\u0176\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017e\3\2\2\2\u017b\u017c"+
		"\5\u00a0Q\2\u017c\u017d\7\6\2\2\u017d\u017f\3\2\2\2\u017e\u017b\3\2\2"+
		"\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\5\u00b0Y\2\u0181"+
		"\u0182\7o\2\2\u0182\u0183\5\u00a2R\2\u0183\u0184\7\7\2\2\u0184\u0189\5"+
		"f\64\2\u0185\u0186\7\t\2\2\u0186\u0188\5f\64\2\u0187\u0185\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u018e\7\b\2\2\u018d\u018f\5&\24\2\u018e"+
		"\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\27\3\2\2\2\u0190\u0191\5\u00aa"+
		"V\2\u0191\u0192\7\u0085\2\2\u0192\u0193\7\7\2\2\u0193\u0194\7\u0082\2"+
		"\2\u0194\u0197\7\7\2\2\u0195\u0198\5X-\2\u0196\u0198\5\30\r\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u019f\3\2\2\2\u0199\u019a\7\t\2\2\u019a"+
		"\u019e\5X-\2\u019b\u019c\7\t\2\2\u019c\u019e\5\30\r\2\u019d\u0199\3\2"+
		"\2\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7\b"+
		"\2\2\u01a3\u01a4\7\b\2\2\u01a4\31\3\2\2\2\u01a5\u01a7\7\66\2\2\u01a6\u01a8"+
		"\t\5\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ad\7\u0086\2\2\u01aa\u01ab\7T\2\2\u01ab\u01ac\7j\2\2\u01ac\u01ae\7"+
		"J\2\2\u01ad\u01aa\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b2\3\2\2\2\u01af"+
		"\u01b0\5\u00a0Q\2\u01b0\u01b1\7\6\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01af"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01d2\5\u00a2R"+
		"\2\u01b5\u01b8\7\7\2\2\u01b6\u01b9\5X-\2\u01b7\u01b9\5\30\r\2\u01b8\u01b6"+
		"\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01c1\3\2\2\2\u01ba\u01bd\7\t\2\2\u01bb"+
		"\u01be\5X-\2\u01bc\u01be\5\30\r\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2"+
		"\2\2\u01be\u01c0\3\2\2\2\u01bf\u01ba\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c8\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c4\u01c5\7\t\2\2\u01c5\u01c7\5h\65\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\7\b\2\2\u01cc\u01cd\7\u0098\2\2\u01cd"+
		"\u01cf\7\u00a8\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d3"+
		"\3\2\2\2\u01d0\u01d1\7%\2\2\u01d1\u01d3\5J&\2\u01d2\u01b5\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\33\3\2\2\2\u01d4\u01d6\7\66\2\2\u01d5\u01d7\t\5\2"+
		"\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc"+
		"\7\u008c\2\2\u01d9\u01da\7T\2\2\u01da\u01db\7j\2\2\u01db\u01dd\7J\2\2"+
		"\u01dc\u01d9\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e1\3\2\2\2\u01de\u01df"+
		"\5\u00a0Q\2\u01df\u01e0\7\6\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01de\3\2\2"+
		"\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e8\5\u00b2Z\2\u01e4"+
		"\u01e9\7)\2\2\u01e5\u01e9\7 \2\2\u01e6\u01e7\7]\2\2\u01e7\u01e9\7m\2\2"+
		"\u01e8\u01e4\3\2\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9\u01f8\3\2\2\2\u01ea\u01f9\7?\2\2\u01eb\u01f9\7\\\2\2\u01ec"+
		"\u01f6\7\u008f\2\2\u01ed\u01ee\7m\2\2\u01ee\u01f3\5\u00a8U\2\u01ef\u01f0"+
		"\7\t\2\2\u01f0\u01f2\5\u00a8U\2\u01f1\u01ef\3\2\2\2\u01f2\u01f5\3\2\2"+
		"\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f6\u01ed\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8"+
		"\u01ea\3\2\2\2\u01f8\u01eb\3\2\2\2\u01f8\u01ec\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fe\7o\2\2\u01fb\u01fc\5\u00a0Q\2\u01fc\u01fd\7\6\2\2\u01fd"+
		"\u01ff\3\2\2\2\u01fe\u01fb\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0204\5\u00a2R\2\u0201\u0202\7M\2\2\u0202\u0203\7D\2\2\u0203"+
		"\u0205\7\u0082\2\2\u0204\u0201\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0208"+
		"\3\2\2\2\u0206\u0207\7\u0095\2\2\u0207\u0209\5`\61\2\u0208\u0206\3\2\2"+
		"\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0213\7*\2\2\u020b\u0210"+
		"\5N(\2\u020c\u0210\5\64\33\2\u020d\u0210\5\"\22\2\u020e\u0210\5J&\2\u020f"+
		"\u020b\3\2\2\2\u020f\u020c\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7\5\2\2\u0212\u0214\3\2\2\2\u0213"+
		"\u020f\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217\u0218\7F\2\2\u0218\35\3\2\2\2\u0219\u021b"+
		"\7\66\2\2\u021a\u021c\t\5\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2"+
		"\u021c\u021d\3\2\2\2\u021d\u0221\7\u0093\2\2\u021e\u021f\7T\2\2\u021f"+
		"\u0220\7j\2\2\u0220\u0222\7J\2\2\u0221\u021e\3\2\2\2\u0221\u0222\3\2\2"+
		"\2\u0222\u0226\3\2\2\2\u0223\u0224\5\u00a0Q\2\u0224\u0225\7\6\2\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0223\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\u0229\5\u00b4[\2\u0229\u022a\7%\2\2\u022a\u022b\5J&\2\u022b"+
		"\37\3\2\2\2\u022c\u022d\7\66\2\2\u022d\u022e\7\u0094\2\2\u022e\u0232\7"+
		"\u0086\2\2\u022f\u0230\7T\2\2\u0230\u0231\7j\2\2\u0231\u0233\7J\2\2\u0232"+
		"\u022f\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0237\3\2\2\2\u0234\u0235\5\u00a0"+
		"Q\2\u0235\u0236\7\6\2\2\u0236\u0238\3\2\2\2\u0237\u0234\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\5\u00a2R\2\u023a\u023b"+
		"\7\u0090\2\2\u023b\u0247\5\u00b6\\\2\u023c\u023d\7\7\2\2\u023d\u0242\5"+
		"\u008eH\2\u023e\u023f\7\t\2\2\u023f\u0241\5\u008eH\2\u0240\u023e\3\2\2"+
		"\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245"+
		"\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\7\b\2\2\u0246\u0248\3\2\2\2\u0247"+
		"\u023c\3\2\2\2\u0247\u0248\3\2\2\2\u0248!\3\2\2\2\u0249\u024b\5j\66\2"+
		"\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d"+
		"\7?\2\2\u024d\u024e\7O\2\2\u024e\u0250\5l\67\2\u024f\u0251\5&\24\2\u0250"+
		"\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251#\3\2\2\2\u0252\u0254\5j\66\2"+
		"\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256"+
		"\7?\2\2\u0256\u0257\7O\2\2\u0257\u0259\5l\67\2\u0258\u025a\5&\24\2\u0259"+
		"\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u026d\3\2\2\2\u025b\u025c\7q"+
		"\2\2\u025c\u025d\7,\2\2\u025d\u0262\5n8\2\u025e\u025f\7\t\2\2\u025f\u0261"+
		"\5n8\2\u0260\u025e\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u025b\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\7f\2\2\u0268"+
		"\u026b\5`\61\2\u0269\u026a\t\4\2\2\u026a\u026c\5`\61\2\u026b\u0269\3\2"+
		"\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u0265\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e%\3\2\2\2\u026f\u0270\7\u0096\2\2\u0270\u0271\5`\61"+
		"\2\u0271\'\3\2\2\2\u0272\u0274\7A\2\2\u0273\u0275\7;\2\2\u0274\u0273\3"+
		"\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\5\u00a0Q\2"+
		"\u0277)\3\2\2\2\u0278\u0279\7C\2\2\u0279\u027c\7X\2\2\u027a\u027b\7T\2"+
		"\2\u027b\u027d\7J\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0281"+
		"\3\2\2\2\u027e\u027f\5\u00a0Q\2\u027f\u0280\7\6\2\2\u0280\u0282\3\2\2"+
		"\2\u0281\u027e\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284"+
		"\5\u00b0Y\2\u0284+\3\2\2\2\u0285\u0286\7C\2\2\u0286\u0289\7\u0086\2\2"+
		"\u0287\u0288\7T\2\2\u0288\u028a\7J\2\2\u0289\u0287\3\2\2\2\u0289\u028a"+
		"\3\2\2\2\u028a\u028e\3\2\2\2\u028b\u028c\5\u00a0Q\2\u028c\u028d\7\6\2"+
		"\2\u028d\u028f\3\2\2\2\u028e\u028b\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290"+
		"\3\2\2\2\u0290\u0291\5\u00a2R\2\u0291-\3\2\2\2\u0292\u0293\7C\2\2\u0293"+
		"\u0296\7\u008c\2\2\u0294\u0295\7T\2\2\u0295\u0297\7J\2\2\u0296\u0294\3"+
		"\2\2\2\u0296\u0297\3\2\2\2\u0297\u029b\3\2\2\2\u0298\u0299\5\u00a0Q\2"+
		"\u0299\u029a\7\6\2\2\u029a\u029c\3\2\2\2\u029b\u0298\3\2\2\2\u029b\u029c"+
		"\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\5\u00b2Z\2\u029e/\3\2\2\2\u029f"+
		"\u02a0\7C\2\2\u02a0\u02a3\7\u0093\2\2\u02a1\u02a2\7T\2\2\u02a2\u02a4\7"+
		"J\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a8\3\2\2\2\u02a5"+
		"\u02a6\5\u00a0Q\2\u02a6\u02a7\7\6\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a5"+
		"\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\5\u00b4["+
		"\2\u02ab\61\3\2\2\2\u02ac\u02ae\7\u0097\2\2\u02ad\u02af\7x\2\2\u02ae\u02ad"+
		"\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b5\5r:\2\u02b1"+
		"\u02b2\7\t\2\2\u02b2\u02b4\5r:\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7\3\2\2"+
		"\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5"+
		"\3\2\2\2\u02b8\u02ac\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u02c0\5\u0080A\2\u02bb\u02bc\5\u0082B\2\u02bc\u02bd\5\u0080A\2\u02bd"+
		"\u02bf\3\2\2\2\u02be\u02bb\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2"+
		"\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02cd\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3"+
		"\u02c4\7q\2\2\u02c4\u02c5\7,\2\2\u02c5\u02ca\5n8\2\u02c6\u02c7\7\t\2\2"+
		"\u02c7\u02c9\5n8\2\u02c8\u02c6\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8"+
		"\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd"+
		"\u02c3\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d5\3\2\2\2\u02cf\u02d0\7f"+
		"\2\2\u02d0\u02d3\5`\61\2\u02d1\u02d2\t\4\2\2\u02d2\u02d4\5`\61\2\u02d3"+
		"\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02cf\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6\63\3\2\2\2\u02d7\u02d9\5j\66\2\u02d8\u02d7"+
		"\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02eb\3\2\2\2\u02da\u02ec\7\\\2\2\u02db"+
		"\u02ec\7~\2\2\u02dc\u02dd\7\\\2\2\u02dd\u02de\7p\2\2\u02de\u02ec\7~\2"+
		"\2\u02df\u02e0\7\\\2\2\u02e0\u02e1\7p\2\2\u02e1\u02ec\7\u0081\2\2\u02e2"+
		"\u02e3\7\\\2\2\u02e3\u02e4\7p\2\2\u02e4\u02ec\7\35\2\2\u02e5\u02e6\7\\"+
		"\2\2\u02e6\u02e7\7p\2\2\u02e7\u02ec\7L\2\2\u02e8\u02e9\7\\\2\2\u02e9\u02ea"+
		"\7p\2\2\u02ea\u02ec\7U\2\2\u02eb\u02da\3\2\2\2\u02eb\u02db\3\2\2\2\u02eb"+
		"\u02dc\3\2\2\2\u02eb\u02df\3\2\2\2\u02eb\u02e2\3\2\2\2\u02eb\u02e5\3\2"+
		"\2\2\u02eb\u02e8\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02f1\7_\2\2\u02ee"+
		"\u02ef\5\u00a0Q\2\u02ef\u02f0\7\6\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ee"+
		"\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u0305\5<\37\2\u02f4"+
		"\u02f5\7\u0092\2\2\u02f5\u02f6\7\7\2\2\u02f6\u02f7\5\66\34\2\u02f7\u02ff"+
		"\7\b\2\2\u02f8\u02f9\7\t\2\2\u02f9\u02fa\7\7\2\2\u02fa\u02fb\5\66\34\2"+
		"\u02fb\u02fc\7\b\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02f8\3\2\2\2\u02fe\u0301"+
		"\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0306\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0302\u0306\5J&\2\u0303\u0304\7<\2\2\u0304\u0306\7\u0092"+
		"\2\2\u0305\u02f4\3\2\2\2\u0305\u0302\3\2\2\2\u0305\u0303\3\2\2\2\u0306"+
		"\65\3\2\2\2\u0307\u030b\58\35\2\u0308\u030b\5:\36\2\u0309\u030b\5`\61"+
		"\2\u030a\u0307\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u0309\3\2\2\2\u030b\u0314"+
		"\3\2\2\2\u030c\u0310\7\t\2\2\u030d\u0311\58\35\2\u030e\u0311\5:\36\2\u030f"+
		"\u0311\5`\61\2\u0310\u030d\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u030f\3\2"+
		"\2\2\u0311\u0313\3\2\2\2\u0312\u030c\3\2\2\2\u0313\u0316\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\67\3\2\2\2\u0316\u0314\3\2\2"+
		"\2\u0317\u0318\7\u0082\2\2\u0318\u0319\7\7\2\2\u0319\u031a\5\66\34\2\u031a"+
		"\u031b\7\b\2\2\u031b9\3\2\2\2\u031c\u031d\7\u0085\2\2\u031d\u031e\7\7"+
		"\2\2\u031e\u031f\5\66\34\2\u031f\u0320\7\b\2\2\u0320\u0326\3\2\2\2\u0321"+
		"\u0322\7\3\2\2\u0322\u0323\5\66\34\2\u0323\u0324\7\4\2\2\u0324\u0326\3"+
		"\2\2\2\u0325\u031c\3\2\2\2\u0325\u0321\3\2\2\2\u0326;\3\2\2\2\u0327\u0339"+
		"\5\u00a2R\2\u0328\u032b\7\7\2\2\u0329\u032c\5\u00a8U\2\u032a\u032c\5<"+
		"\37\2\u032b\u0329\3\2\2\2\u032b\u032a\3\2\2\2\u032c\u0334\3\2\2\2\u032d"+
		"\u0330\7\t\2\2\u032e\u0331\5\u00a8U\2\u032f\u0331\5<\37\2\u0330\u032e"+
		"\3\2\2\2\u0330\u032f\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u032d\3\2\2\2\u0333"+
		"\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2"+
		"\2\2\u0336\u0334\3\2\2\2\u0337\u0338\7\b\2\2\u0338\u033a\3\2\2\2\u0339"+
		"\u0328\3\2\2\2\u0339\u033a\3\2\2\2\u033a=\3\2\2\2\u033b\u033f\7t\2\2\u033c"+
		"\u033d\5\u00a0Q\2\u033d\u033e\7\6\2\2\u033e\u0340\3\2\2\2\u033f\u033c"+
		"\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0348\5\u00b8]"+
		"\2\u0342\u0343\7\n\2\2\u0343\u0349\5p9\2\u0344\u0345\7\7\2\2\u0345\u0346"+
		"\5p9\2\u0346\u0347\7\b\2\2\u0347\u0349\3\2\2\2\u0348\u0342\3\2\2\2\u0348"+
		"\u0344\3\2\2\2\u0348\u0349\3\2\2\2\u0349?\3\2\2\2\u034a\u0355\7{\2\2\u034b"+
		"\u0356\5\u00acW\2\u034c\u034d\5\u00a0Q\2\u034d\u034e\7\6\2\2\u034e\u0350"+
		"\3\2\2\2\u034f\u034c\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0353\3\2\2\2\u0351"+
		"\u0354\5\u00a2R\2\u0352\u0354\5\u00b0Y\2\u0353\u0351\3\2\2\2\u0353\u0352"+
		"\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u034b\3\2\2\2\u0355\u034f\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356A\3\2\2\2\u0357\u0359\7|\2\2\u0358\u035a\7\u0083\2"+
		"\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c"+
		"\5\u00ba^\2\u035cC\3\2\2\2\u035d\u0362\7\u0081\2\2\u035e\u0360\7\u008b"+
		"\2\2\u035f\u0361\5\u00be`\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u0363\3\2\2\2\u0362\u035e\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0369\3\2"+
		"\2\2\u0364\u0366\7\u008a\2\2\u0365\u0367\7\u0083\2\2\u0366\u0365\3\2\2"+
		"\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a\5\u00ba^\2\u0369"+
		"\u0364\3\2\2\2\u0369\u036a\3\2\2\2\u036aE\3\2\2\2\u036b\u036c\7\u0083"+
		"\2\2\u036c\u036d\5\u00ba^\2\u036dG\3\2\2\2\u036e\u0370\7\u0097\2\2\u036f"+
		"\u0371\7x\2\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2"+
		"\2\2\u0372\u0377\5r:\2\u0373\u0374\7\t\2\2\u0374\u0376\5r:\2\u0375\u0373"+
		"\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u036e\3\2\2\2\u037a\u037b\3\2"+
		"\2\2\u037b\u037c\3\2\2\2\u037c\u0387\5\u0080A\2\u037d\u037e\7q\2\2\u037e"+
		"\u037f\7,\2\2\u037f\u0384\5n8\2\u0380\u0381\7\t\2\2\u0381\u0383\5n8\2"+
		"\u0382\u0380\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385"+
		"\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u037d\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388\u038f\3\2\2\2\u0389\u038a\7f\2\2\u038a\u038d\5`\61"+
		"\2\u038b\u038c\t\4\2\2\u038c\u038e\5`\61\2\u038d\u038b\3\2\2\2\u038d\u038e"+
		"\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u0389\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"I\3\2\2\2\u0391\u0393\7\u0097\2\2\u0392\u0394\7x\2\2\u0393\u0392\3\2\2"+
		"\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u039a\5r:\2\u0396\u0397"+
		"\7\t\2\2\u0397\u0399\5r:\2\u0398\u0396\3\2\2\2\u0399\u039c\3\2\2\2\u039a"+
		"\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a\3\2"+
		"\2\2\u039d\u0391\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u03a5\5L\'\2\u03a0\u03a1\5\u0082B\2\u03a1\u03a2\5L\'\2\u03a2\u03a4\3"+
		"\2\2\2\u03a3\u03a0\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5"+
		"\u03a6\3\2\2\2\u03a6\u03b2\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03a9\7q"+
		"\2\2\u03a9\u03aa\7,\2\2\u03aa\u03af\5n8\2\u03ab\u03ac\7\t\2\2\u03ac\u03ae"+
		"\5n8\2\u03ad\u03ab\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03a8\3\2"+
		"\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03ba\3\2\2\2\u03b4\u03b5\7f\2\2\u03b5"+
		"\u03b8\5`\61\2\u03b6\u03b7\t\4\2\2\u03b7\u03b9\5`\61\2\u03b8\u03b6\3\2"+
		"\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b4\3\2\2\2\u03ba"+
		"\u03bb\3\2\2\2\u03bbK\3\2\2\2\u03bc\u03be\7\u0084\2\2\u03bd\u03bf\t\6"+
		"\2\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0"+
		"\u03c5\5t;\2\u03c1\u03c2\7\t\2\2\u03c2\u03c4\5t;\2\u03c3\u03c1\3\2\2\2"+
		"\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03d4"+
		"\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03d2\7O\2\2\u03c9\u03ce\5v<\2\u03ca"+
		"\u03cb\7\t\2\2\u03cb\u03cd\5v<\2\u03cc\u03ca\3\2\2\2\u03cd\u03d0\3\2\2"+
		"\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d3\3\2\2\2\u03d0\u03ce"+
		"\3\2\2\2\u03d1\u03d3\5x=\2\u03d2\u03c9\3\2\2\2\u03d2\u03d1\3\2\2\2\u03d3"+
		"\u03d5\3\2\2\2\u03d4\u03c8\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2"+
		"\2\2\u03d6\u03d8\5&\24\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03da\3\2\2\2\u03d9\u03db\5~@\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2"+
		"\2\u03db\u03f9\3\2\2\2\u03dc\u03dd\7\u0092\2\2\u03dd\u03de\7\7\2\2\u03de"+
		"\u03e3\5`\61\2\u03df\u03e0\7\t\2\2\u03e0\u03e2\5`\61\2\u03e1\u03df\3\2"+
		"\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u03e6\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03f5\7\b\2\2\u03e7\u03e8\7\t"+
		"\2\2\u03e8\u03e9\7\7\2\2\u03e9\u03ee\5`\61\2\u03ea\u03eb\7\t\2\2\u03eb"+
		"\u03ed\5`\61\2\u03ec\u03ea\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2"+
		"\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1"+
		"\u03f2\7\b\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03e7\3\2\2\2\u03f4\u03f7\3\2"+
		"\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7"+
		"\u03f5\3\2\2\2\u03f8\u03bc\3\2\2\2\u03f8\u03dc\3\2\2\2\u03f9M\3\2\2\2"+
		"\u03fa\u03fc\5j\66\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd"+
		"\3\2\2\2\u03fd\u0408\7\u008f\2\2\u03fe\u03ff\7p\2\2\u03ff\u0409\7\u0081"+
		"\2\2\u0400\u0401\7p\2\2\u0401\u0409\7\35\2\2\u0402\u0403\7p\2\2\u0403"+
		"\u0409\7~\2\2\u0404\u0405\7p\2\2\u0405\u0409\7L\2\2\u0406\u0407\7p\2\2"+
		"\u0407\u0409\7U\2\2\u0408\u03fe\3\2\2\2\u0408\u0400\3\2\2\2\u0408\u0402"+
		"\3\2\2\2\u0408\u0404\3\2\2\2\u0408\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u040b\5l\67\2\u040b\u040c\7\u0085\2\2\u040c\u0411"+
		"\5P)\2\u040d\u040e\7\t\2\2\u040e\u0410\5P)\2\u040f\u040d\3\2\2\2\u0410"+
		"\u0413\3\2\2\2\u0411\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0415\3\2"+
		"\2\2\u0413\u0411\3\2\2\2\u0414\u0416\5&\24\2\u0415\u0414\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416O\3\2\2\2\u0417\u041b\5\u00a8U\2\u0418\u041b\5\u0094"+
		"K\2\u0419\u041b\5R*\2\u041a\u0417\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u0419"+
		"\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u0420\7\n\2\2\u041d\u0421\58\35\2\u041e"+
		"\u0421\5:\36\2\u041f\u0421\5`\61\2\u0420\u041d\3\2\2\2\u0420\u041e\3\2"+
		"\2\2\u0420\u041f\3\2\2\2\u0421Q\3\2\2\2\u0422\u0425\5\u0094K\2\u0423\u0425"+
		"\5\u00a8U\2\u0424\u0422\3\2\2\2\u0424\u0423\3\2\2\2\u0425\u0426\3\2\2"+
		"\2\u0426\u0427\7\6\2\2\u0427\u0429\3\2\2\2\u0428\u0424\3\2\2\2\u0428\u0429"+
		"\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\5<\37\2\u042bS\3\2\2\2\u042c"+
		"\u042e\5j\66\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2"+
		"\2\2\u042f\u043a\7\u008f\2\2\u0430\u0431\7p\2\2\u0431\u043b\7\u0081\2"+
		"\2\u0432\u0433\7p\2\2\u0433\u043b\7\35\2\2\u0434\u0435\7p\2\2\u0435\u043b"+
		"\7~\2\2\u0436\u0437\7p\2\2\u0437\u043b\7L\2\2\u0438\u0439\7p\2\2\u0439"+
		"\u043b\7U\2\2\u043a\u0430\3\2\2\2\u043a\u0432\3\2\2\2\u043a\u0434\3\2"+
		"\2\2\u043a\u0436\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u043c\3\2\2\2\u043c\u043d\5l\67\2\u043d\u043e\7\u0085\2\2\u043e\u0443"+
		"\5P)\2\u043f\u0440\7\t\2\2\u0440\u0442\5P)\2\u0441\u043f\3\2\2\2\u0442"+
		"\u0445\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0447\3\2"+
		"\2\2\u0445\u0443\3\2\2\2\u0446\u0448\5&\24\2\u0447\u0446\3\2\2\2\u0447"+
		"\u0448\3\2\2\2\u0448\u045b\3\2\2\2\u0449\u044a\7q\2\2\u044a\u044b\7,\2"+
		"\2\u044b\u0450\5n8\2\u044c\u044d\7\t\2\2\u044d\u044f\5n8\2\u044e\u044c"+
		"\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451"+
		"\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0449\3\2\2\2\u0453\u0454\3\2"+
		"\2\2\u0454\u0455\3\2\2\2\u0455\u0456\7f\2\2\u0456\u0459\5`\61\2\u0457"+
		"\u0458\t\4\2\2\u0458\u045a\5`\61\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2"+
		"\2\2\u045a\u045c\3\2\2\2\u045b\u0453\3\2\2\2\u045b\u045c\3\2\2\2\u045c"+
		"U\3\2\2\2\u045d\u045e\7\u0091\2\2\u045eW\3\2\2\2\u045f\u0461\5\u00a8U"+
		"\2\u0460\u0462\5Z.\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0466"+
		"\3\2\2\2\u0463\u0465\5\\/\2\u0464\u0463\3\2\2\2\u0465\u0468\3\2\2\2\u0466"+
		"\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467Y\3\2\2\2\u0468\u0466\3\2\2\2"+
		"\u0469\u046b\5\u009aN\2\u046a\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c"+
		"\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u0478\3\2\2\2\u046e\u046f\7\7"+
		"\2\2\u046f\u0470\5\u0086D\2\u0470\u0471\7\b\2\2\u0471\u0479\3\2\2\2\u0472"+
		"\u0473\7\7\2\2\u0473\u0474\5\u0086D\2\u0474\u0475\7\t\2\2\u0475\u0476"+
		"\5\u0086D\2\u0476\u0477\7\b\2\2\u0477\u0479\3\2\2\2\u0478\u046e\3\2\2"+
		"\2\u0478\u0472\3\2\2\2\u0478\u0479\3\2\2\2\u0479[\3\2\2\2\u047a\u047b"+
		"\7\65\2\2\u047b\u047d\5\u009aN\2\u047c\u047a\3\2\2\2\u047c\u047d\3\2\2"+
		"\2\u047d\u049f\3\2\2\2\u047e\u047f\7u\2\2\u047f\u0481\7c\2\2\u0480\u0482"+
		"\t\7\2\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\3\2\2\2\u0483"+
		"\u0485\5^\60\2\u0484\u0486\7(\2\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2"+
		"\2\2\u0486\u04a0\3\2\2\2\u0487\u0489\7j\2\2\u0488\u0487\3\2\2\2\u0488"+
		"\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\7l\2\2\u048b\u04a0\5^\60"+
		"\2\u048c\u048d\7\u008e\2\2\u048d\u04a0\5^\60\2\u048e\u048f\7\60\2\2\u048f"+
		"\u0490\7\7\2\2\u0490\u0491\5`\61\2\u0491\u0492\7\b\2\2\u0492\u04a0\3\2"+
		"\2\2\u0493\u049a\7<\2\2\u0494\u049b\5\u0086D\2\u0495\u049b\5\u0088E\2"+
		"\u0496\u0497\7\7\2\2\u0497\u0498\5`\61\2\u0498\u0499\7\b\2\2\u0499\u049b"+
		"\3\2\2\2\u049a\u0494\3\2\2\2\u049a\u0495\3\2\2\2\u049a\u0496\3\2\2\2\u049b"+
		"\u04a0\3\2\2\2\u049c\u049d\7\61\2\2\u049d\u04a0\5\u00acW\2\u049e\u04a0"+
		"\5b\62\2\u049f\u047e\3\2\2\2\u049f\u0488\3\2\2\2\u049f\u048c\3\2\2\2\u049f"+
		"\u048e\3\2\2\2\u049f\u0493\3\2\2\2\u049f\u049c\3\2\2\2\u049f\u049e\3\2"+
		"\2\2\u04a0]\3\2\2\2\u04a1\u04a2\7o\2\2\u04a2\u04a3\7\64\2\2\u04a3\u04a5"+
		"\t\b\2\2\u04a4\u04a1\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5_\3\2\2\2\u04a6"+
		"\u04a7\b\61\1\2\u04a7\u0510\5\u0088E\2\u04a8\u0510\5\u0086D\2\u04a9\u0510"+
		"\7\u00aa\2\2\u04aa\u04ab\5\u00a2R\2\u04ab\u04ac\7\6\2\2\u04ac\u04ae\3"+
		"\2\2\2\u04ad\u04aa\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af"+
		"\u04b1\5\u00a8U\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b6"+
		"\3\2\2\2\u04b2\u04b3\7\6\2\2\u04b3\u04b5\5\u00a8U\2\u04b4\u04b2\3\2\2"+
		"\2\u04b5\u04b8\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04ba"+
		"\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b9\u04bb\7\6\2\2\u04ba\u04b9\3\2\2\2\u04ba"+
		"\u04bb\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc\u04be\7\13\2\2\u04bd\u04bc\3"+
		"\2\2\2\u04bd\u04be\3\2\2\2\u04be\u0510\3\2\2\2\u04bf\u04c0\5\u008aF\2"+
		"\u04c0\u04c1\5`\61\30\u04c1\u0510\3\2\2\2\u04c2\u04c3\5\u009eP\2\u04c3"+
		"\u04d0\7\7\2\2\u04c4\u04c6\7B\2\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6\3\2"+
		"\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04cc\5`\61\2\u04c8\u04c9\7\t\2\2\u04c9"+
		"\u04cb\5`\61\2\u04ca\u04c8\3\2\2\2\u04cb\u04ce\3\2\2\2\u04cc\u04ca\3\2"+
		"\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04d1\3\2\2\2\u04ce\u04cc\3\2\2\2\u04cf"+
		"\u04d1\7\13\2\2\u04d0\u04c5\3\2\2\2\u04d0\u04cf\3\2\2\2\u04d0\u04d1\3"+
		"\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\7\b\2\2\u04d3\u0510\3\2\2\2\u04d4"+
		"\u04d5\5\u009cO\2\u04d5\u04e2\7\7\2\2\u04d6\u04d8\7B\2\2\u04d7\u04d6\3"+
		"\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04de\5`\61\2\u04da"+
		"\u04db\7\t\2\2\u04db\u04dd\5`\61\2\u04dc\u04da\3\2\2\2\u04dd\u04e0\3\2"+
		"\2\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e3\3\2\2\2\u04e0"+
		"\u04de\3\2\2\2\u04e1\u04e3\7\13\2\2\u04e2\u04d7\3\2\2\2\u04e2\u04e1\3"+
		"\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\7\b\2\2\u04e5"+
		"\u0510\3\2\2\2\u04e6\u04e7\7\7\2\2\u04e7\u04e8\5`\61\2\u04e8\u04e9\7\b"+
		"\2\2\u04e9\u0510\3\2\2\2\u04ea\u04eb\7/\2\2\u04eb\u04ec\7\7\2\2\u04ec"+
		"\u04ed\5`\61\2\u04ed\u04ee\7%\2\2\u04ee\u04ef\5Z.\2\u04ef\u04f0\7\b\2"+
		"\2\u04f0\u0510\3\2\2\2\u04f1\u04f3\7j\2\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3"+
		"\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f6\7J\2\2\u04f5\u04f2\3\2\2\2\u04f5"+
		"\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\7\7\2\2\u04f8\u04f9\5J"+
		"&\2\u04f9\u04fa\7\b\2\2\u04fa\u0510\3\2\2\2\u04fb\u04fd\7.\2\2\u04fc\u04fe"+
		"\5`\61\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0504\3\2\2\2\u04ff"+
		"\u0500\7\u0095\2\2\u0500\u0501\5`\61\2\u0501\u0502\7\u0089\2\2\u0502\u0503"+
		"\5`\61\2\u0503\u0505\3\2\2\2\u0504\u04ff\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u050a\3\2\2\2\u0508\u0509\7E"+
		"\2\2\u0509\u050b\5`\61\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b"+
		"\u050c\3\2\2\2\u050c\u050d\7F\2\2\u050d\u0510\3\2\2\2\u050e\u0510\5d\63"+
		"\2\u050f\u04a6\3\2\2\2\u050f\u04a8\3\2\2\2\u050f\u04a9\3\2\2\2\u050f\u04ad"+
		"\3\2\2\2\u050f\u04bf\3\2\2\2\u050f\u04c2\3\2\2\2\u050f\u04d4\3\2\2\2\u050f"+
		"\u04e6\3\2\2\2\u050f\u04ea\3\2\2\2\u050f\u04f5\3\2\2\2\u050f\u04fb\3\2"+
		"\2\2\u050f\u050e\3\2\2\2\u0510\u0575\3\2\2\2\u0511\u0512\f\27\2\2\u0512"+
		"\u0513\7\17\2\2\u0513\u0574\5`\61\30\u0514\u0515\f\26\2\2\u0515\u0516"+
		"\t\t\2\2\u0516\u0574\5`\61\27\u0517\u0518\f\25\2\2\u0518\u0519\t\n\2\2"+
		"\u0519\u0574\5`\61\26\u051a\u051b\f\24\2\2\u051b\u051c\t\13\2\2\u051c"+
		"\u0574\5`\61\25\u051d\u051e\f\23\2\2\u051e\u051f\t\f\2\2\u051f\u0574\5"+
		"`\61\24\u0520\u052d\f\22\2\2\u0521\u052e\7\n\2\2\u0522\u052e\7\32\2\2"+
		"\u0523\u052e\7\33\2\2\u0524\u052e\7\34\2\2\u0525\u052e\7`\2\2\u0526\u0527"+
		"\7`\2\2\u0527\u052e\7j\2\2\u0528\u052e\7W\2\2\u0529\u052e\7e\2\2\u052a"+
		"\u052e\7Q\2\2\u052b\u052e\7g\2\2\u052c\u052e\7z\2\2\u052d\u0521\3\2\2"+
		"\2\u052d\u0522\3\2\2\2\u052d\u0523\3\2\2\2\u052d\u0524\3\2\2\2\u052d\u0525"+
		"\3\2\2\2\u052d\u0526\3\2\2\2\u052d\u0528\3\2\2\2\u052d\u0529\3\2\2\2\u052d"+
		"\u052a\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052c\3\2\2\2\u052e\u052f\3\2"+
		"\2\2\u052f\u0574\5`\61\23\u0530\u0531\f\21\2\2\u0531\u0532\7$\2\2\u0532"+
		"\u0574\5`\61\22\u0533\u0534\f\20\2\2\u0534\u0535\7p\2\2\u0535\u0574\5"+
		"`\61\21\u0536\u0537\f\b\2\2\u0537\u0539\7`\2\2\u0538\u053a\7j\2\2\u0539"+
		"\u0538\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u0574\5`"+
		"\61\t\u053c\u053e\f\7\2\2\u053d\u053f\7j\2\2\u053e\u053d\3\2\2\2\u053e"+
		"\u053f\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\7+\2\2\u0541\u0542\5`\61"+
		"\2\u0542\u0543\7$\2\2\u0543\u0544\5`\61\b\u0544\u0574\3\2\2\2\u0545\u0546"+
		"\f\13\2\2\u0546\u0547\7\61\2\2\u0547\u0574\5\u00acW\2\u0548\u054a\f\n"+
		"\2\2\u0549\u054b\7j\2\2\u054a\u0549\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
		"\u054c\3\2\2\2\u054c\u054d\t\r\2\2\u054d\u0550\5`\61\2\u054e\u054f\7G"+
		"\2\2\u054f\u0551\5`\61\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551"+
		"\u0574\3\2\2\2\u0552\u0557\f\t\2\2\u0553\u0558\7a\2\2\u0554\u0558\7k\2"+
		"\2\u0555\u0556\7j\2\2\u0556\u0558\7l\2\2\u0557\u0553\3\2\2\2\u0557\u0554"+
		"\3\2\2\2\u0557\u0555\3\2\2\2\u0558\u0574\3\2\2\2\u0559\u055b\f\6\2\2\u055a"+
		"\u055c\7j\2\2\u055b\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2"+
		"\2\2\u055d\u0571\7W\2\2\u055e\u0568\7\7\2\2\u055f\u0569\5J&\2\u0560\u0565"+
		"\5`\61\2\u0561\u0562\7\t\2\2\u0562\u0564\5`\61\2\u0563\u0561\3\2\2\2\u0564"+
		"\u0567\3\2\2\2\u0565\u0563\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0569\3\2"+
		"\2\2\u0567\u0565\3\2\2\2\u0568\u055f\3\2\2\2\u0568\u0560\3\2\2\2\u0568"+
		"\u0569\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u0572\7\b\2\2\u056b\u056c\5\u00a0"+
		"Q\2\u056c\u056d\7\6\2\2\u056d\u056f\3\2\2\2\u056e\u056b\3\2\2\2\u056e"+
		"\u056f\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0572\5\u00a2R\2\u0571\u055e"+
		"\3\2\2\2\u0571\u056e\3\2\2\2\u0572\u0574\3\2\2\2\u0573\u0511\3\2\2\2\u0573"+
		"\u0514\3\2\2\2\u0573\u0517\3\2\2\2\u0573\u051a\3\2\2\2\u0573\u051d\3\2"+
		"\2\2\u0573\u0520\3\2\2\2\u0573\u0530\3\2\2\2\u0573\u0533\3\2\2\2\u0573"+
		"\u0536\3\2\2\2\u0573\u053c\3\2\2\2\u0573\u0545\3\2\2\2\u0573\u0548\3\2"+
		"\2\2\u0573\u0552\3\2\2\2\u0573\u0559\3\2\2\2\u0574\u0577\3\2\2\2\u0575"+
		"\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576a\3\2\2\2\u0577\u0575\3\2\2\2"+
		"\u0578\u0579\7y\2\2\u0579\u0585\5\u00aeX\2\u057a\u057b\7\7\2\2\u057b\u0580"+
		"\5\u00a8U\2\u057c\u057d\7\t\2\2\u057d\u057f\5\u00a8U\2\u057e\u057c\3\2"+
		"\2\2\u057f\u0582\3\2\2\2\u0580\u057e\3\2\2\2\u0580\u0581\3\2\2\2\u0581"+
		"\u0583\3\2\2\2\u0582\u0580\3\2\2\2\u0583\u0584\7\b\2\2\u0584\u0586\3\2"+
		"\2\2\u0585\u057a\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0599\3\2\2\2\u0587"+
		"\u0588\7o\2\2\u0588\u0591\t\16\2\2\u0589\u058a\7\u0085\2\2\u058a\u0592"+
		"\7l\2\2\u058b\u058c\7\u0085\2\2\u058c\u0592\7<\2\2\u058d\u0592\7-\2\2"+
		"\u058e\u0592\7\177\2\2\u058f\u0590\7i\2\2\u0590\u0592\7\36\2\2\u0591\u0589"+
		"\3\2\2\2\u0591\u058b\3\2\2\2\u0591\u058d\3\2\2\2\u0591\u058e\3\2\2\2\u0591"+
		"\u058f\3\2\2\2\u0592\u0596\3\2\2\2\u0593\u0594\7g\2\2\u0594\u0596\5\u009a"+
		"N\2\u0595\u0587\3\2\2\2\u0595\u0593\3\2\2\2\u0596\u0598\3\2\2\2\u0597"+
		"\u0595\3\2\2\2\u0598\u059b\3\2\2\2\u0599\u0597\3\2\2\2\u0599\u059a\3\2"+
		"\2\2\u059a\u05a6\3\2\2\2\u059b\u0599\3\2\2\2\u059c\u059e\7j\2\2\u059d"+
		"\u059c\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a4\7="+
		"\2\2\u05a0\u05a1\7Z\2\2\u05a1\u05a5\7>\2\2\u05a2\u05a3\7Z\2\2\u05a3\u05a5"+
		"\7V\2\2\u05a4\u05a0\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5"+
		"\u05a7\3\2\2\2\u05a6\u059d\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7c\3\2\2\2"+
		"\u05a8\u05a9\7w\2\2\u05a9\u05ae\7\7\2\2\u05aa\u05af\7U\2\2\u05ab\u05ac"+
		"\t\17\2\2\u05ac\u05ad\7\t\2\2\u05ad\u05af\5\u008cG\2\u05ae\u05aa\3\2\2"+
		"\2\u05ae\u05ab\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\7\b\2\2\u05b1e"+
		"\3\2\2\2\u05b2\u05b5\5\u00a8U\2\u05b3\u05b5\5\u0094K\2\u05b4\u05b2\3\2"+
		"\2\2\u05b4\u05b3\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b7\7\61\2\2\u05b7"+
		"\u05b9\5\u00acW\2\u05b8\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05bb"+
		"\3\2\2\2\u05ba\u05bc\t\7\2\2\u05bb\u05ba\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc"+
		"g\3\2\2\2\u05bd\u05be\7\65\2\2\u05be\u05c0\5\u009aN\2\u05bf\u05bd\3\2"+
		"\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05eb\3\2\2\2\u05c1\u05c2\7u\2\2\u05c2"+
		"\u05c5\7c\2\2\u05c3\u05c5\7\u008e\2\2\u05c4\u05c1\3\2\2\2\u05c4\u05c3"+
		"\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\7\7\2\2\u05c7\u05cc\5f\64\2\u05c8"+
		"\u05c9\7\t\2\2\u05c9\u05cb\5f\64\2\u05ca\u05c8\3\2\2\2\u05cb\u05ce\3\2"+
		"\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05cf\3\2\2\2\u05ce"+
		"\u05cc\3\2\2\2\u05cf\u05d0\7\b\2\2\u05d0\u05d1\5^\60\2\u05d1\u05ec\3\2"+
		"\2\2\u05d2\u05d3\7\60\2\2\u05d3\u05d4\7\7\2\2\u05d4\u05d5\5`\61\2\u05d5"+
		"\u05d6\7\b\2\2\u05d6\u05ec\3\2\2\2\u05d7\u05d8\7N\2\2\u05d8\u05d9\7c\2"+
		"\2\u05d9\u05dc\7\7\2\2\u05da\u05dd\5\u00a8U\2\u05db\u05dd\5\u0094K\2\u05dc"+
		"\u05da\3\2\2\2\u05dc\u05db\3\2\2\2\u05dd\u05e2\3\2\2\2\u05de\u05df\7\t"+
		"\2\2\u05df\u05e1\5\u00a8U\2\u05e0\u05de\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2"+
		"\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e5\3\2\2\2\u05e4\u05e2\3\2"+
		"\2\2\u05e5\u05e6\7\t\2\2\u05e6\u05e7\5\u0094K\2\u05e7\u05e8\3\2\2\2\u05e8"+
		"\u05e9\7\b\2\2\u05e9\u05ea\5b\62\2\u05ea\u05ec\3\2\2\2\u05eb\u05c4\3\2"+
		"\2\2\u05eb\u05d2\3\2\2\2\u05eb\u05d7\3\2\2\2\u05eci\3\2\2\2\u05ed\u05ef"+
		"\7\u0097\2\2\u05ee\u05f0\7x\2\2\u05ef\u05ee\3\2\2\2\u05ef\u05f0\3\2\2"+
		"\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2\5\u0084C\2\u05f2\u05f3\7%\2\2\u05f3"+
		"\u05f4\7\7\2\2\u05f4\u05f5\5J&\2\u05f5\u05ff\7\b\2\2\u05f6\u05f7\7\t\2"+
		"\2\u05f7\u05f8\5\u0084C\2\u05f8\u05f9\7%\2\2\u05f9\u05fa\7\7\2\2\u05fa"+
		"\u05fb\5J&\2\u05fb\u05fc\7\b\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05f6\3\2\2"+
		"\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600k"+
		"\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u0607\5\u00a2R\2\u0603\u0604\7\6\2"+
		"\2\u0604\u0606\5\u00aaV\2\u0605\u0603\3\2\2\2\u0606\u0609\3\2\2\2\u0607"+
		"\u0605\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060f\3\2\2\2\u0609\u0607\3\2"+
		"\2\2\u060a\u060b\7Y\2\2\u060b\u060c\7,\2\2\u060c\u0610\5\u00b0Y\2\u060d"+
		"\u060e\7j\2\2\u060e\u0610\7Y\2\2\u060f\u060a\3\2\2\2\u060f\u060d\3\2\2"+
		"\2\u060f\u0610\3\2\2\2\u0610m\3\2\2\2\u0611\u0614\5`\61\2\u0612\u0613"+
		"\7\61\2\2\u0613\u0615\5\u00acW\2\u0614\u0612\3\2\2\2\u0614\u0615\3\2\2"+
		"\2\u0615\u0617\3\2\2\2\u0616\u0618\t\7\2\2\u0617\u0616\3\2\2\2\u0617\u0618"+
		"\3\2\2\2\u0618o\3\2\2\2\u0619\u061d\5\u0086D\2\u061a\u061d\5\u009aN\2"+
		"\u061b\u061d\7\u00ab\2\2\u061c\u0619\3\2\2\2\u061c\u061a\3\2\2\2\u061c"+
		"\u061b\3\2\2\2\u061dq\3\2\2\2\u061e\u0634\5\u00a2R\2\u061f\u0622\7\7\2"+
		"\2\u0620\u0623\5\u00a8U\2\u0621\u0623\5\u0094K\2\u0622\u0620\3\2\2\2\u0622"+
		"\u0621\3\2\2\2\u0623\u0628\3\2\2\2\u0624\u0625\7\t\2\2\u0625\u0627\5\u00a8"+
		"U\2\u0626\u0624\3\2\2\2\u0627\u062a\3\2\2\2\u0628\u0626\3\2\2\2\u0628"+
		"\u0629\3\2\2\2\u0629\u062f\3\2\2\2\u062a\u0628\3\2\2\2\u062b\u062c\7\t"+
		"\2\2\u062c\u062e\5\u0094K\2\u062d\u062b\3\2\2\2\u062e\u0631\3\2\2\2\u062f"+
		"\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\3\2\2\2\u0631\u062f\3\2"+
		"\2\2\u0632\u0633\7\b\2\2\u0633\u0635\3\2\2\2\u0634\u061f\3\2\2\2\u0634"+
		"\u0635\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0637\7%\2\2\u0637\u0638\7\7"+
		"\2\2\u0638\u0639\5J&\2\u0639\u063a\7\b\2\2\u063as\3\2\2\2\u063b\u0644"+
		"\7\13\2\2\u063c\u0641\5`\61\2\u063d\u063f\7%\2\2\u063e\u063d\3\2\2\2\u063e"+
		"\u063f\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0642\5\u0090I\2\u0641\u063e"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u063b\3\2\2\2\u0643"+
		"\u063c\3\2\2\2\u0644u\3\2\2\2\u0645\u064a\5\u00a2R\2\u0646\u0647\7\6\2"+
		"\2\u0647\u064b\5\u00a8U\2\u0648\u0649\7\6\2\2\u0649\u064b\5\u0094K\2\u064a"+
		"\u0646\3\2\2\2\u064a\u0648\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u0650\3\2"+
		"\2\2\u064c\u064e\7%\2\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e"+
		"\u064f\3\2\2\2\u064f\u0651\5\u00bc_\2\u0650\u064d\3\2\2\2\u0650\u0651"+
		"\3\2\2\2\u0651\u0657\3\2\2\2\u0652\u0653\7Y\2\2\u0653\u0654\7,\2\2\u0654"+
		"\u0658\5\u00b0Y\2\u0655\u0656\7j\2\2\u0656\u0658\7Y\2\2\u0657\u0652\3"+
		"\2\2\2\u0657\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u0676\3\2\2\2\u0659"+
		"\u0663\7\7\2\2\u065a\u065f\5v<\2\u065b\u065c\7\t\2\2\u065c\u065e\5v<\2"+
		"\u065d\u065b\3\2\2\2\u065e\u0661\3\2\2\2\u065f\u065d\3\2\2\2\u065f\u0660"+
		"\3\2\2\2\u0660\u0664\3\2\2\2\u0661\u065f\3\2\2\2\u0662\u0664\5x=\2\u0663"+
		"\u065a\3\2\2\2\u0663\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u066a\7\b"+
		"\2\2\u0666\u0668\7%\2\2\u0667\u0666\3\2\2\2\u0667\u0668\3\2\2\2\u0668"+
		"\u0669\3\2\2\2\u0669\u066b\5\u00bc_\2\u066a\u0667\3\2\2\2\u066a\u066b"+
		"\3\2\2\2\u066b\u0676\3\2\2\2\u066c\u066d\7\7\2\2\u066d\u066e\5J&\2\u066e"+
		"\u0673\7\b\2\2\u066f\u0671\7%\2\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2"+
		"\2\2\u0671\u0672\3\2\2\2\u0672\u0674\5\u00bc_\2\u0673\u0670\3\2\2\2\u0673"+
		"\u0674\3\2\2\2\u0674\u0676\3\2\2\2\u0675\u0645\3\2\2\2\u0675\u0659\3\2"+
		"\2\2\u0675\u066c\3\2\2\2\u0676w\3\2\2\2\u0677\u067e\5v<\2\u0678\u0679"+
		"\5z>\2\u0679\u067a\5v<\2\u067a\u067b\5|?\2\u067b\u067d\3\2\2\2\u067c\u0678"+
		"\3\2\2\2\u067d\u0680\3\2\2\2\u067e\u067c\3\2\2\2\u067e\u067f\3\2\2\2\u067f"+
		"y\3\2\2\2\u0680\u067e\3\2\2\2\u0681\u068f\7\t\2\2\u0682\u0684\7h\2\2\u0683"+
		"\u0682\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u068b\3\2\2\2\u0685\u0687\7d"+
		"\2\2\u0686\u0688\7r\2\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688"+
		"\u068c\3\2\2\2\u0689\u068c\7[\2\2\u068a\u068c\7\67\2\2\u068b\u0685\3\2"+
		"\2\2\u068b\u0689\3\2\2\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2\u068c"+
		"\u068d\3\2\2\2\u068d\u068f\7b\2\2\u068e\u0681\3\2\2\2\u068e\u0683\3\2"+
		"\2\2\u068f{\3\2\2\2\u0690\u0691\7o\2\2\u0691\u06a9\5`\61\2\u0692\u0693"+
		"\7\u0090\2\2\u0693\u0696\7\7\2\2\u0694\u0697\5\u0094K\2\u0695\u0697\5"+
		"\u00a8U\2\u0696\u0694\3\2\2\2\u0696\u0695\3\2\2\2\u0697\u069c\3\2\2\2"+
		"\u0698\u0699\7\t\2\2\u0699\u069b\5\u00a8U\2\u069a\u0698\3\2\2\2\u069b"+
		"\u069e\3\2\2\2\u069c\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u06a3\3\2"+
		"\2\2\u069e\u069c\3\2\2\2\u069f\u06a0\7\t\2\2\u06a0\u06a2\5\u0094K\2\u06a1"+
		"\u069f\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a3\u06a4\3\2"+
		"\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6\u06a7\7\b\2\2\u06a7"+
		"\u06a9\3\2\2\2\u06a8\u0690\3\2\2\2\u06a8\u0692\3\2\2\2\u06a8\u06a9\3\2"+
		"\2\2\u06a9}\3\2\2\2\u06aa\u06ab\7R\2\2\u06ab\u06ac\7,\2\2\u06ac\u06b1"+
		"\5`\61\2\u06ad\u06ae\7\t\2\2\u06ae\u06b0\5`\61\2\u06af\u06ad\3\2\2\2\u06b0"+
		"\u06b3\3\2\2\2\u06b1\u06af\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b6\3\2"+
		"\2\2\u06b3\u06b1\3\2\2\2\u06b4\u06b5\7S\2\2\u06b5\u06b7\5`\61\2\u06b6"+
		"\u06b4\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\177\3\2\2\2\u06b8\u06ba\7\u0084"+
		"\2\2\u06b9\u06bb\t\6\2\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb"+
		"\u06bc\3\2\2\2\u06bc\u06c1\5t;\2\u06bd\u06be\7\t\2\2\u06be\u06c0\5t;\2"+
		"\u06bf\u06bd\3\2\2\2\u06c0\u06c3\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c1\u06c2"+
		"\3\2\2\2\u06c2\u06d0\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c4\u06ce\7O\2\2\u06c5"+
		"\u06ca\5v<\2\u06c6\u06c7\7\t\2\2\u06c7\u06c9\5v<\2\u06c8\u06c6\3\2\2\2"+
		"\u06c9\u06cc\3\2\2\2\u06ca\u06c8\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cf"+
		"\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cd\u06cf\5x=\2\u06ce\u06c5\3\2\2\2\u06ce"+
		"\u06cd\3\2\2\2\u06cf\u06d1\3\2\2\2\u06d0\u06c4\3\2\2\2\u06d0\u06d1\3\2"+
		"\2\2\u06d1\u06d3\3\2\2\2\u06d2\u06d4\5&\24\2\u06d3\u06d2\3\2\2\2\u06d3"+
		"\u06d4\3\2\2\2\u06d4\u06d6\3\2\2\2\u06d5\u06d7\5~@\2\u06d6\u06d5\3\2\2"+
		"\2\u06d6\u06d7\3\2\2\2\u06d7\u06f5\3\2\2\2\u06d8\u06d9\7\u0092\2\2\u06d9"+
		"\u06da\7\7\2\2\u06da\u06df\5`\61\2\u06db\u06dc\7\t\2\2\u06dc\u06de\5`"+
		"\61\2\u06dd\u06db\3\2\2\2\u06de\u06e1\3\2\2\2\u06df\u06dd\3\2\2\2\u06df"+
		"\u06e0\3\2\2\2\u06e0\u06e2\3\2\2\2\u06e1\u06df\3\2\2\2\u06e2\u06f1\7\b"+
		"\2\2\u06e3\u06e4\7\t\2\2\u06e4\u06e5\7\7\2\2\u06e5\u06ea\5`\61\2\u06e6"+
		"\u06e7\7\t\2\2\u06e7\u06e9\5`\61\2\u06e8\u06e6\3\2\2\2\u06e9\u06ec\3\2"+
		"\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\3\2\2\2\u06ec"+
		"\u06ea\3\2\2\2\u06ed\u06ee\7\b\2\2\u06ee\u06f0\3\2\2\2\u06ef\u06e3\3\2"+
		"\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2"+
		"\u06f5\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f4\u06b8\3\2\2\2\u06f4\u06d8\3\2"+
		"\2\2\u06f5\u0081\3\2\2\2\u06f6\u06fc\7\u008d\2\2\u06f7\u06f8\7\u008d\2"+
		"\2\u06f8\u06fc\7!\2\2\u06f9\u06fc\7^\2\2\u06fa\u06fc\7H\2\2\u06fb\u06f6"+
		"\3\2\2\2\u06fb\u06f7\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fb\u06fa\3\2\2\2\u06fc"+
		"\u0083\3\2\2\2\u06fd\u070d\5\u00a2R\2\u06fe\u0701\7\7\2\2\u06ff\u0702"+
		"\5\u00a8U\2\u0700\u0702\5\u0094K\2\u0701\u06ff\3\2\2\2\u0701\u0700\3\2"+
		"\2\2\u0702\u0708\3\2\2\2\u0703\u0704\7\t\2\2\u0704\u0707\5\u00a8U\2\u0705"+
		"\u0707\5\u0094K\2\u0706\u0703\3\2\2\2\u0706\u0705\3\2\2\2\u0707\u070a"+
		"\3\2\2\2\u0708\u0706\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070b\3\2\2\2\u070a"+
		"\u0708\3\2\2\2\u070b\u070c\7\b\2\2\u070c\u070e\3\2\2\2\u070d\u06fe\3\2"+
		"\2\2\u070d\u070e\3\2\2\2\u070e\u0085\3\2\2\2\u070f\u0711\t\n\2\2\u0710"+
		"\u070f\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0713\7\u00a9"+
		"\2\2\u0713\u0087\3\2\2\2\u0714\u0715\t\20\2\2\u0715\u0089\3\2\2\2\u0716"+
		"\u0717\t\21\2\2\u0717\u008b\3\2\2\2\u0718\u0719\7\u00ab\2\2\u0719\u008d"+
		"\3\2\2\2\u071a\u071d\5`\61\2\u071b\u071d\5X-\2\u071c\u071a\3\2\2\2\u071c"+
		"\u071b\3\2\2\2\u071d\u008f\3\2\2\2\u071e\u071f\t\22\2\2\u071f\u0091\3"+
		"\2\2\2\u0720\u0721\t\23\2\2\u0721\u0093\3\2\2\2\u0722\u0723\5\u0096L\2"+
		"\u0723\u0724\7\6\2\2\u0724\u0725\5\u0098M\2\u0725\u0095\3\2\2\2\u0726"+
		"\u072b\5\u00aaV\2\u0727\u0728\7\6\2\2\u0728\u072a\5\u00aaV\2\u0729\u0727"+
		"\3\2\2\2\u072a\u072d\3\2\2\2\u072b\u0729\3\2\2\2\u072b\u072c\3\2\2\2\u072c"+
		"\u0097\3\2\2\2\u072d\u072b\3\2\2\2\u072e\u072f\5\u00c0a\2\u072f\u0099"+
		"\3\2\2\2\u0730\u0731\5\u00c0a\2\u0731\u009b\3\2\2\2\u0732\u0733\5\u00c0"+
		"a\2\u0733\u009d\3\2\2\2\u0734\u0735\t\24\2\2\u0735\u009f\3\2\2\2\u0736"+
		"\u0737\5\u00c0a\2\u0737\u00a1\3\2\2\2\u0738\u0739\5\u00c0a\2\u0739\u00a3"+
		"\3\2\2\2\u073a\u073b\5\u00c0a\2\u073b\u00a5\3\2\2\2\u073c\u073d\5\u00c0"+
		"a\2\u073d\u00a7\3\2\2\2\u073e\u073f\5\u00c0a\2\u073f\u00a9\3\2\2\2\u0740"+
		"\u0741\5\u00c0a\2\u0741\u00ab\3\2\2\2\u0742\u0743\5\u00c0a\2\u0743\u00ad"+
		"\3\2\2\2\u0744\u0745\5\u00c0a\2\u0745\u00af\3\2\2\2\u0746\u0747\5\u00c0"+
		"a\2\u0747\u00b1\3\2\2\2\u0748\u0749\5\u00c0a\2\u0749\u00b3\3\2\2\2\u074a"+
		"\u074b\5\u00c0a\2\u074b\u00b5\3\2\2\2\u074c\u074d\5\u00c0a\2\u074d\u00b7"+
		"\3\2\2\2\u074e\u074f\5\u00c0a\2\u074f\u00b9\3\2\2\2\u0750\u0751\5\u00c0"+
		"a\2\u0751\u00bb\3\2\2\2\u0752\u0753\5\u00c0a\2\u0753\u00bd\3\2\2\2\u0754"+
		"\u0755\5\u00c0a\2\u0755\u00bf\3\2\2\2\u0756\u075e\7\u00a8\2\2\u0757\u075e"+
		"\5\u0092J\2\u0758\u075e\7\u00ab\2\2\u0759\u075a\7\7\2\2\u075a\u075b\5"+
		"\u00c0a\2\u075b\u075c\7\b\2\2\u075c\u075e\3\2\2\2\u075d\u0756\3\2\2\2"+
		"\u075d\u0757\3\2\2\2\u075d\u0758\3\2\2\2\u075d\u0759\3\2\2\2\u075e\u00c1"+
		"\3\2\2\2\u0110\u00c4\u00c6\u00d1\u00d8\u00dd\u00e3\u00e9\u00eb\u010b\u0112"+
		"\u011a\u011d\u0126\u012a\u0132\u0136\u0138\u013d\u013f\u0143\u014a\u014d"+
		"\u0152\u0156\u015b\u0164\u0167\u016d\u016f\u0173\u0179\u017e\u0189\u018e"+
		"\u0197\u019d\u019f\u01a7\u01ad\u01b2\u01b8\u01bd\u01c1\u01c8\u01ce\u01d2"+
		"\u01d6\u01dc\u01e1\u01e8\u01f3\u01f6\u01f8\u01fe\u0204\u0208\u020f\u0215"+
		"\u021b\u0221\u0226\u0232\u0237\u0242\u0247\u024a\u0250\u0253\u0259\u0262"+
		"\u0265\u026b\u026d\u0274\u027c\u0281\u0289\u028e\u0296\u029b\u02a3\u02a8"+
		"\u02ae\u02b5\u02b8\u02c0\u02ca\u02cd\u02d3\u02d5\u02d8\u02eb\u02f1\u02ff"+
		"\u0305\u030a\u0310\u0314\u0325\u032b\u0330\u0334\u0339\u033f\u0348\u034f"+
		"\u0353\u0355\u0359\u0360\u0362\u0366\u0369\u0370\u0377\u037a\u0384\u0387"+
		"\u038d\u038f\u0393\u039a\u039d\u03a5\u03af\u03b2\u03b8\u03ba\u03be\u03c5"+
		"\u03ce\u03d2\u03d4\u03d7\u03da\u03e3\u03ee\u03f5\u03f8\u03fb\u0408\u0411"+
		"\u0415\u041a\u0420\u0424\u0428\u042d\u043a\u0443\u0447\u0450\u0453\u0459"+
		"\u045b\u0461\u0466\u046c\u0478\u047c\u0481\u0485\u0488\u049a\u049f\u04a4"+
		"\u04ad\u04b0\u04b6\u04ba\u04bd\u04c5\u04cc\u04d0\u04d7\u04de\u04e2\u04f2"+
		"\u04f5\u04fd\u0506\u050a\u050f\u052d\u0539\u053e\u054a\u0550\u0557\u055b"+
		"\u0565\u0568\u056e\u0571\u0573\u0575\u0580\u0585\u0591\u0595\u0599\u059d"+
		"\u05a4\u05a6\u05ae\u05b4\u05b8\u05bb\u05bf\u05c4\u05cc\u05dc\u05e2\u05eb"+
		"\u05ef\u05ff\u0607\u060f\u0614\u0617\u061c\u0622\u0628\u062f\u0634\u063e"+
		"\u0641\u0643\u064a\u064d\u0650\u0657\u065f\u0663\u0667\u066a\u0670\u0673"+
		"\u0675\u067e\u0683\u0687\u068b\u068e\u0696\u069c\u06a3\u06a8\u06b1\u06b6"+
		"\u06ba\u06c1\u06ca\u06ce\u06d0\u06d3\u06d6\u06df\u06ea\u06f1\u06f4\u06fb"+
		"\u0701\u0706\u0708\u070d\u0710\u071c\u072b\u075d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}