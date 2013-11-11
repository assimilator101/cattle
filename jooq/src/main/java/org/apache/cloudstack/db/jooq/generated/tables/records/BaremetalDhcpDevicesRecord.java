/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "baremetal_dhcp_devices", schema = "cloud")
public class BaremetalDhcpDevicesRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord> implements org.jooq.Record7<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = 1911434035;

	/**
	 * Setter for <code>cloud.baremetal_dhcp_devices.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.baremetal_dhcp_devices.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.baremetal_dhcp_devices.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.baremetal_dhcp_devices.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.baremetal_dhcp_devices.nsp_id</code>. 
	 */
	public void setNspId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.baremetal_dhcp_devices.nsp_id</code>. 
	 */
	@javax.persistence.Column(name = "nsp_id", precision = 20)
	public java.lang.Long getNspId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cloud.baremetal_dhcp_devices.pod_id</code>. 
	 */
	public void setPodId(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.baremetal_dhcp_devices.pod_id</code>. 
	 */
	@javax.persistence.Column(name = "pod_id", precision = 20)
	public java.lang.Long getPodId() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>cloud.baremetal_dhcp_devices.device_type</code>. 
	 */
	public void setDeviceType(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.baremetal_dhcp_devices.device_type</code>. 
	 */
	@javax.persistence.Column(name = "device_type", length = 255)
	public java.lang.String getDeviceType() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cloud.baremetal_dhcp_devices.physical_network_id</code>. 
	 */
	public void setPhysicalNetworkId(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.baremetal_dhcp_devices.physical_network_id</code>. 
	 */
	@javax.persistence.Column(name = "physical_network_id", precision = 20)
	public java.lang.Long getPhysicalNetworkId() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>cloud.baremetal_dhcp_devices.host_id</code>. 
	 */
	public void setHostId(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.baremetal_dhcp_devices.host_id</code>. 
	 */
	@javax.persistence.Column(name = "host_id", precision = 20)
	public java.lang.Long getHostId() {
		return (java.lang.Long) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.NSP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.POD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.DEVICE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.PHYSICAL_NETWORK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.HOST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getNspId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getPodId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getDeviceType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getPhysicalNetworkId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getHostId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BaremetalDhcpDevicesRecord
	 */
	public BaremetalDhcpDevicesRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES);
	}

	/**
	 * Create a detached, initialised BaremetalDhcpDevicesRecord
	 */
	public BaremetalDhcpDevicesRecord(java.lang.Long id, java.lang.String uuid, java.lang.Long nspId, java.lang.Long podId, java.lang.String deviceType, java.lang.Long physicalNetworkId, java.lang.Long hostId) {
		super(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, nspId);
		setValue(3, podId);
		setValue(4, deviceType);
		setValue(5, physicalNetworkId);
		setValue(6, hostId);
	}
}