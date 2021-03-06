/**
 * This class is generated by jOOQ
 */
package com.cbt.ws.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Testscript extends org.jooq.impl.TableImpl<com.cbt.ws.jooq.tables.records.TestscriptRecord> {

	private static final long serialVersionUID = 2049611034;

	/**
	 * The singleton instance of <code>cbt.testscript</code>
	 */
	public static final com.cbt.ws.jooq.tables.Testscript TESTSCRIPT = new com.cbt.ws.jooq.tables.Testscript();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.cbt.ws.jooq.tables.records.TestscriptRecord> getRecordType() {
		return com.cbt.ws.jooq.tables.records.TestscriptRecord.class;
	}

	/**
	 * The column <code>cbt.testscript.id</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestscriptRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cbt.testscript.name</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestscriptRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cbt.testscript.path</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestscriptRecord, java.lang.String> PATH = createField("path", org.jooq.impl.SQLDataType.CHAR.length(255), this);

	/**
	 * The column <code>cbt.testscript.file_name</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestscriptRecord, java.lang.String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.CHAR.length(255), this);

	/**
	 * The column <code>cbt.testscript.user_id</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestscriptRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cbt.testscript.classes</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestscriptRecord, java.lang.String> CLASSES = createField("classes", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>cbt.testscript.updated</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestscriptRecord, java.sql.Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>cbt.testscript</code> table reference
	 */
	public Testscript() {
		super("testscript", com.cbt.ws.jooq.Cbt.CBT);
	}

	/**
	 * Create an aliased <code>cbt.testscript</code> table reference
	 */
	public Testscript(java.lang.String alias) {
		super(alias, com.cbt.ws.jooq.Cbt.CBT, com.cbt.ws.jooq.tables.Testscript.TESTSCRIPT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.cbt.ws.jooq.tables.records.TestscriptRecord, java.lang.Long> getIdentity() {
		return com.cbt.ws.jooq.Keys.IDENTITY_TESTSCRIPT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.cbt.ws.jooq.tables.records.TestscriptRecord> getPrimaryKey() {
		return com.cbt.ws.jooq.Keys.KEY_TESTSCRIPT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.cbt.ws.jooq.tables.records.TestscriptRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.cbt.ws.jooq.tables.records.TestscriptRecord>>asList(com.cbt.ws.jooq.Keys.KEY_TESTSCRIPT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.cbt.ws.jooq.tables.Testscript as(java.lang.String alias) {
		return new com.cbt.ws.jooq.tables.Testscript(alias);
	}
}
