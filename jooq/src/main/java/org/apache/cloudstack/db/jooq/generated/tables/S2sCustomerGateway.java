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
public class S2sCustomerGateway extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord> {

	private static final long serialVersionUID = -241631583;

	/**
	 * The singleton instance of <code>cloud.s2s_customer_gateway</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway S2S_CUSTOMER_GATEWAY = new org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord.class;
	}

	/**
	 * The column <code>cloud.s2s_customer_gateway.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.gateway_ip</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.String> GATEWAY_IP = createField("gateway_ip", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.guest_cidr_list</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.String> GUEST_CIDR_LIST = createField("guest_cidr_list", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.ipsec_psk</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.String> IPSEC_PSK = createField("ipsec_psk", org.jooq.impl.SQLDataType.VARCHAR.length(256), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.ike_policy</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.String> IKE_POLICY = createField("ike_policy", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.esp_policy</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.String> ESP_POLICY = createField("esp_policy", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.ike_lifetime</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.Integer> IKE_LIFETIME = createField("ike_lifetime", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.esp_lifetime</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.Integer> ESP_LIFETIME = createField("esp_lifetime", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.dpd</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.Integer> DPD = createField("dpd", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.domain_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.Long> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.s2s_customer_gateway.removed</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>cloud.s2s_customer_gateway</code> table reference
	 */
	public S2sCustomerGateway() {
		super("s2s_customer_gateway", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.s2s_customer_gateway</code> table reference
	 */
	public S2sCustomerGateway(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_S2S_CUSTOMER_GATEWAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_S2S_CUSTOMER_GATEWAY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_S2S_CUSTOMER_GATEWAY_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_S2S_CUSTOMER_GATEWAY_UC_S2S_CUSTOMER_GATEWAY__UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_S2S_CUSTOMER_GATEWAY__DOMAIN_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_S2S_CUSTOMER_GATEWAY__ACCOUNT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway(alias);
	}
}