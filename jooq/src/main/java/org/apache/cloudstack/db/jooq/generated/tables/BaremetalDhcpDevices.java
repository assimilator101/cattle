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
public class BaremetalDhcpDevices extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord> {

	private static final long serialVersionUID = 2109368791;

	/**
	 * The singleton instance of <code>cloud.baremetal_dhcp_devices</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices BAREMETAL_DHCP_DEVICES = new org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord.class;
	}

	/**
	 * The column <code>cloud.baremetal_dhcp_devices.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.baremetal_dhcp_devices.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.baremetal_dhcp_devices.nsp_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord, java.lang.Long> NSP_ID = createField("nsp_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.baremetal_dhcp_devices.pod_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord, java.lang.Long> POD_ID = createField("pod_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.baremetal_dhcp_devices.device_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord, java.lang.String> DEVICE_TYPE = createField("device_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.baremetal_dhcp_devices.physical_network_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord, java.lang.Long> PHYSICAL_NETWORK_ID = createField("physical_network_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.baremetal_dhcp_devices.host_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord, java.lang.Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>cloud.baremetal_dhcp_devices</code> table reference
	 */
	public BaremetalDhcpDevices() {
		super("baremetal_dhcp_devices", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.baremetal_dhcp_devices</code> table reference
	 */
	public BaremetalDhcpDevices(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_BAREMETAL_DHCP_DEVICES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_BAREMETAL_DHCP_DEVICES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_BAREMETAL_DHCP_DEVICES_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_BAREMETAL_DHCP_DEVICES_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_EXTERNAL_DHCP_DEVICES_NSP_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_EXTERNAL_DHCP_DEVICES_PHYSICAL_NETWORK_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_EXTERNAL_DHCP_DEVICES_HOST_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices(alias);
	}
}