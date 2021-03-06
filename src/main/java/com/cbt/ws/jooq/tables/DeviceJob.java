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
public class DeviceJob extends org.jooq.impl.TableImpl<com.cbt.ws.jooq.tables.records.DeviceJobRecord> {

	private static final long serialVersionUID = 1014573917;

	/**
	 * The singleton instance of <code>cbt.device_job</code>
	 */
	public static final com.cbt.ws.jooq.tables.DeviceJob DEVICE_JOB = new com.cbt.ws.jooq.tables.DeviceJob();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.cbt.ws.jooq.tables.records.DeviceJobRecord> getRecordType() {
		return com.cbt.ws.jooq.tables.records.DeviceJobRecord.class;
	}

	/**
	 * The column <code>cbt.device_job.id</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.DeviceJobRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cbt.device_job.device_id</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.DeviceJobRecord, java.lang.Long> DEVICE_ID = createField("device_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cbt.device_job.test_run_id</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.DeviceJobRecord, java.lang.Long> TEST_RUN_ID = createField("test_run_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cbt.device_job.created</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.DeviceJobRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cbt.device_job.updated</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.DeviceJobRecord, java.sql.Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cbt.device_job.status</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.DeviceJobRecord, com.cbt.ws.jooq.enums.DeviceJobStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.cbt.ws.jooq.enums.DeviceJobStatus.class), this);

	/**
	 * The column <code>cbt.device_job.meta</code>. 
	 */
	public final org.jooq.TableField<com.cbt.ws.jooq.tables.records.DeviceJobRecord, java.lang.String> META = createField("meta", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * Create a <code>cbt.device_job</code> table reference
	 */
	public DeviceJob() {
		super("device_job", com.cbt.ws.jooq.Cbt.CBT);
	}

	/**
	 * Create an aliased <code>cbt.device_job</code> table reference
	 */
	public DeviceJob(java.lang.String alias) {
		super(alias, com.cbt.ws.jooq.Cbt.CBT, com.cbt.ws.jooq.tables.DeviceJob.DEVICE_JOB);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.cbt.ws.jooq.tables.records.DeviceJobRecord, java.lang.Long> getIdentity() {
		return com.cbt.ws.jooq.Keys.IDENTITY_DEVICE_JOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.cbt.ws.jooq.tables.records.DeviceJobRecord> getPrimaryKey() {
		return com.cbt.ws.jooq.Keys.KEY_DEVICE_JOB_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.cbt.ws.jooq.tables.records.DeviceJobRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.cbt.ws.jooq.tables.records.DeviceJobRecord>>asList(com.cbt.ws.jooq.Keys.KEY_DEVICE_JOB_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.cbt.ws.jooq.tables.DeviceJob as(java.lang.String alias) {
		return new com.cbt.ws.jooq.tables.DeviceJob(alias);
	}
}
