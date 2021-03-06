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
public class Testconfig extends org.jooq.impl.TableImpl<com.cbt.ws.jooq.tables.records.TestconfigRecord> {

	private static final long serialVersionUID = -1511270689;

	/**
	 * The singleton instance of <code>cbt.testconfig</code>
	 */
	public static final com.cbt.ws.jooq.tables.Testconfig TESTCONFIG = new com.cbt.ws.jooq.tables.Testconfig();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.cbt.ws.jooq.tables.records.TestconfigRecord> getRecordType() {
		return com.cbt.ws.jooq.tables.records.TestconfigRecord.class;
	}

	/**
	 * The column <code>cbt.testconfig.test_config_id</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestconfigRecord, java.lang.Long> TEST_CONFIG_ID = createField("test_config_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cbt.testconfig.test_config_name</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestconfigRecord, java.lang.String> TEST_CONFIG_NAME = createField("test_config_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cbt.testconfig.user_id</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestconfigRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cbt.testconfig.test_script_id</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestconfigRecord, java.lang.Long> TEST_SCRIPT_ID = createField("test_script_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cbt.testconfig.test_target_id</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestconfigRecord, java.lang.Long> TEST_TARGET_ID = createField("test_target_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cbt.testconfig.test_profile_id</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestconfigRecord, java.lang.Long> TEST_PROFILE_ID = createField("test_profile_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cbt.testconfig.metadata</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestconfigRecord, java.lang.String> METADATA = createField("metadata", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this);

	/**
	 * The column <code>cbt.testconfig.updated</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.TestconfigRecord, java.sql.Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>cbt.testconfig</code> table reference
	 */
	public Testconfig() {
		super("testconfig", com.cbt.ws.jooq.Cbt.CBT);
	}

	/**
	 * Create an aliased <code>cbt.testconfig</code> table reference
	 */
	public Testconfig(java.lang.String alias) {
		super(alias, com.cbt.ws.jooq.Cbt.CBT, com.cbt.ws.jooq.tables.Testconfig.TESTCONFIG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.cbt.ws.jooq.tables.records.TestconfigRecord, java.lang.Long> getIdentity() {
		return com.cbt.ws.jooq.Keys.IDENTITY_TESTCONFIG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.cbt.ws.jooq.tables.records.TestconfigRecord> getPrimaryKey() {
		return com.cbt.ws.jooq.Keys.KEY_TESTCONFIG_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.cbt.ws.jooq.tables.records.TestconfigRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.cbt.ws.jooq.tables.records.TestconfigRecord>>asList(com.cbt.ws.jooq.Keys.KEY_TESTCONFIG_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.cbt.ws.jooq.tables.Testconfig as(java.lang.String alias) {
		return new com.cbt.ws.jooq.tables.Testconfig(alias);
	}
}
