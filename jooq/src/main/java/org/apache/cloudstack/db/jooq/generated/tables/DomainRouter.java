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
public class DomainRouter extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord> {

	private static final long serialVersionUID = 2100699038;

	/**
	 * The singleton instance of <code>cloud.domain_router</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.DomainRouter DOMAIN_ROUTER = new org.apache.cloudstack.db.jooq.generated.tables.DomainRouter();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord.class;
	}

	/**
	 * The column <code>cloud.domain_router.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.domain_router.element_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.Long> ELEMENT_ID = createField("element_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.domain_router.public_mac_address</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.String> PUBLIC_MAC_ADDRESS = createField("public_mac_address", org.jooq.impl.SQLDataType.VARCHAR.length(17), this);

	/**
	 * The column <code>cloud.domain_router.public_ip_address</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.String> PUBLIC_IP_ADDRESS = createField("public_ip_address", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.domain_router.public_netmask</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.String> PUBLIC_NETMASK = createField("public_netmask", org.jooq.impl.SQLDataType.VARCHAR.length(15), this);

	/**
	 * The column <code>cloud.domain_router.guest_netmask</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.String> GUEST_NETMASK = createField("guest_netmask", org.jooq.impl.SQLDataType.VARCHAR.length(15), this);

	/**
	 * The column <code>cloud.domain_router.guest_ip_address</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.String> GUEST_IP_ADDRESS = createField("guest_ip_address", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.domain_router.is_redundant_router</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.Integer> IS_REDUNDANT_ROUTER = createField("is_redundant_router", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.domain_router.priority</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.Integer> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>cloud.domain_router.is_priority_bumpup</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.Integer> IS_PRIORITY_BUMPUP = createField("is_priority_bumpup", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.domain_router.redundant_state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.String> REDUNDANT_STATE = createField("redundant_state", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this);

	/**
	 * The column <code>cloud.domain_router.stop_pending</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.Integer> STOP_PENDING = createField("stop_pending", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.domain_router.role</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this);

	/**
	 * The column <code>cloud.domain_router.template_version</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.String> TEMPLATE_VERSION = createField("template_version", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>cloud.domain_router.scripts_version</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.String> SCRIPTS_VERSION = createField("scripts_version", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>cloud.domain_router.vpc_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, java.lang.Long> VPC_ID = createField("vpc_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>cloud.domain_router</code> table reference
	 */
	public DomainRouter() {
		super("domain_router", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.domain_router</code> table reference
	 */
	public DomainRouter(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.DomainRouter.DOMAIN_ROUTER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_DOMAIN_ROUTER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_DOMAIN_ROUTER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.DomainRouterRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_DOMAIN_ROUTER__ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_DOMAIN_ROUTER__ELEMENT_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_DOMAIN_ROUTER__VPC_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.DomainRouter as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.DomainRouter(alias);
	}
}