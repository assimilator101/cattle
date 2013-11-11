/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Conditions extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord> {

	private static final long serialVersionUID = -2023995229;

	/**
	 * The singleton instance of <code>cloud.conditions</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.Conditions CONDITIONS = new org.apache.cloudstack.db.jooq.generated.tables.Conditions();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord.class;
	}

	/**
	 * The column <code>cloud.conditions.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.conditions.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.conditions.counter_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, java.lang.Long> COUNTER_ID = createField("counter_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.conditions.threshold</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, java.lang.Long> THRESHOLD = createField("threshold", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.conditions.relational_operator</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, java.lang.String> RELATIONAL_OPERATOR = createField("relational_operator", org.jooq.impl.SQLDataType.VARCHAR.length(2), this);

	/**
	 * The column <code>cloud.conditions.domain_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, java.lang.Long> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.conditions.account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.conditions.removed</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.conditions.created</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * Create a <code>cloud.conditions</code> table reference
	 */
	public Conditions() {
		super("conditions", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.conditions</code> table reference
	 */
	public Conditions(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_CONDITIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_CONDITIONS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_CONDITIONS_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_CONDITIONS_UC_CONDITIONS__UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_CONDITIONS__COUNTER_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_CONDITIONS__DOMAIN_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_CONDITIONS__ACCOUNT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.Conditions as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.Conditions(alias);
	}
}