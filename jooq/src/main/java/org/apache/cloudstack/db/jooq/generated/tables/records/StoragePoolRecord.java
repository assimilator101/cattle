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
@javax.persistence.Table(name = "storage_pool", schema = "cloud")
public class StoragePoolRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolRecord> implements org.jooq.Record22<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long> {

	private static final long serialVersionUID = 21465288;

	/**
	 * Setter for <code>cloud.storage_pool.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.storage_pool.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.storage_pool.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", unique = true, length = 255)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.storage_pool.pool_type</code>. 
	 */
	public void setPoolType(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.pool_type</code>. 
	 */
	@javax.persistence.Column(name = "pool_type", nullable = false, length = 32)
	public java.lang.String getPoolType() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.storage_pool.port</code>. 
	 */
	public void setPort(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.port</code>. 
	 */
	@javax.persistence.Column(name = "port", nullable = false, precision = 10)
	public java.lang.Integer getPort() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>cloud.storage_pool.data_center_id</code>. 
	 */
	public void setDataCenterId(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.data_center_id</code>. 
	 */
	@javax.persistence.Column(name = "data_center_id", nullable = false, precision = 20)
	public java.lang.Long getDataCenterId() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>cloud.storage_pool.pod_id</code>. 
	 */
	public void setPodId(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.pod_id</code>. 
	 */
	@javax.persistence.Column(name = "pod_id", precision = 20)
	public java.lang.Long getPodId() {
		return (java.lang.Long) getValue(6);
	}

	/**
	 * Setter for <code>cloud.storage_pool.cluster_id</code>. 
	 */
	public void setClusterId(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.cluster_id</code>. 
	 */
	@javax.persistence.Column(name = "cluster_id", precision = 20)
	public java.lang.Long getClusterId() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>cloud.storage_pool.used_bytes</code>. 
	 */
	public void setUsedBytes(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.used_bytes</code>. 
	 */
	@javax.persistence.Column(name = "used_bytes", precision = 20)
	public java.lang.Long getUsedBytes() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>cloud.storage_pool.capacity_bytes</code>. 
	 */
	public void setCapacityBytes(java.lang.Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.capacity_bytes</code>. 
	 */
	@javax.persistence.Column(name = "capacity_bytes", precision = 20)
	public java.lang.Long getCapacityBytes() {
		return (java.lang.Long) getValue(9);
	}

	/**
	 * Setter for <code>cloud.storage_pool.host_address</code>. 
	 */
	public void setHostAddress(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.host_address</code>. 
	 */
	@javax.persistence.Column(name = "host_address", nullable = false, length = 255)
	public java.lang.String getHostAddress() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>cloud.storage_pool.user_info</code>. 
	 */
	public void setUserInfo(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.user_info</code>. 
	 */
	@javax.persistence.Column(name = "user_info", length = 255)
	public java.lang.String getUserInfo() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>cloud.storage_pool.path</code>. 
	 */
	public void setPath(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.path</code>. 
	 */
	@javax.persistence.Column(name = "path", nullable = false, length = 255)
	public java.lang.String getPath() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>cloud.storage_pool.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(13);
	}

	/**
	 * Setter for <code>cloud.storage_pool.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(14);
	}

	/**
	 * Setter for <code>cloud.storage_pool.update_time</code>. 
	 */
	public void setUpdateTime(java.sql.Timestamp value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.update_time</code>. 
	 */
	@javax.persistence.Column(name = "update_time")
	public java.sql.Timestamp getUpdateTime() {
		return (java.sql.Timestamp) getValue(15);
	}

	/**
	 * Setter for <code>cloud.storage_pool.status</code>. 
	 */
	public void setStatus(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.status</code>. 
	 */
	@javax.persistence.Column(name = "status", length = 32)
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>cloud.storage_pool.storage_provider_name</code>. 
	 */
	public void setStorageProviderName(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.storage_provider_name</code>. 
	 */
	@javax.persistence.Column(name = "storage_provider_name", length = 255)
	public java.lang.String getStorageProviderName() {
		return (java.lang.String) getValue(17);
	}

	/**
	 * Setter for <code>cloud.storage_pool.scope</code>. 
	 */
	public void setScope(java.lang.String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.scope</code>. 
	 */
	@javax.persistence.Column(name = "scope", length = 255)
	public java.lang.String getScope() {
		return (java.lang.String) getValue(18);
	}

	/**
	 * Setter for <code>cloud.storage_pool.hypervisor</code>. 
	 */
	public void setHypervisor(java.lang.String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.hypervisor</code>. 
	 */
	@javax.persistence.Column(name = "hypervisor", length = 32)
	public java.lang.String getHypervisor() {
		return (java.lang.String) getValue(19);
	}

	/**
	 * Setter for <code>cloud.storage_pool.managed</code>. 
	 */
	public void setManaged(java.lang.Boolean value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.managed</code>. 
	 */
	@javax.persistence.Column(name = "managed", nullable = false, precision = 1)
	public java.lang.Boolean getManaged() {
		return (java.lang.Boolean) getValue(20);
	}

	/**
	 * Setter for <code>cloud.storage_pool.capacity_iops</code>. 
	 */
	public void setCapacityIops(java.lang.Long value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>cloud.storage_pool.capacity_iops</code>. 
	 */
	@javax.persistence.Column(name = "capacity_iops", precision = 20)
	public java.lang.Long getCapacityIops() {
		return (java.lang.Long) getValue(21);
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
	// Record22 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row22<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long> fieldsRow() {
		return (org.jooq.Row22) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row22<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long> valuesRow() {
		return (org.jooq.Row22) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.POOL_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.PORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.DATA_CENTER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.POD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.CLUSTER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.USED_BYTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field10() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.CAPACITY_BYTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.HOST_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.USER_INFO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.PATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field14() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field15() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field16() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field17() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field18() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.STORAGE_PROVIDER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field19() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.SCOPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field20() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.HYPERVISOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field21() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.MANAGED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field22() {
		return org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL.CAPACITY_IOPS;
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
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getPoolType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getPort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getDataCenterId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getPodId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getClusterId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getUsedBytes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value10() {
		return getCapacityBytes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getHostAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getUserInfo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getPath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value14() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value15() {
		return getRemoved();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value16() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value17() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value18() {
		return getStorageProviderName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value19() {
		return getScope();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value20() {
		return getHypervisor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value21() {
		return getManaged();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value22() {
		return getCapacityIops();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StoragePoolRecord
	 */
	public StoragePoolRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL);
	}

	/**
	 * Create a detached, initialised StoragePoolRecord
	 */
	public StoragePoolRecord(java.lang.Long id, java.lang.String name, java.lang.String uuid, java.lang.String poolType, java.lang.Integer port, java.lang.Long dataCenterId, java.lang.Long podId, java.lang.Long clusterId, java.lang.Long usedBytes, java.lang.Long capacityBytes, java.lang.String hostAddress, java.lang.String userInfo, java.lang.String path, java.sql.Timestamp created, java.sql.Timestamp removed, java.sql.Timestamp updateTime, java.lang.String status, java.lang.String storageProviderName, java.lang.String scope, java.lang.String hypervisor, java.lang.Boolean managed, java.lang.Long capacityIops) {
		super(org.apache.cloudstack.db.jooq.generated.tables.StoragePool.STORAGE_POOL);

		setValue(0, id);
		setValue(1, name);
		setValue(2, uuid);
		setValue(3, poolType);
		setValue(4, port);
		setValue(5, dataCenterId);
		setValue(6, podId);
		setValue(7, clusterId);
		setValue(8, usedBytes);
		setValue(9, capacityBytes);
		setValue(10, hostAddress);
		setValue(11, userInfo);
		setValue(12, path);
		setValue(13, created);
		setValue(14, removed);
		setValue(15, updateTime);
		setValue(16, status);
		setValue(17, storageProviderName);
		setValue(18, scope);
		setValue(19, hypervisor);
		setValue(20, managed);
		setValue(21, capacityIops);
	}
}