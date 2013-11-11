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
@javax.persistence.Table(name = "vm_snapshots", schema = "cloud")
public class VmSnapshotsRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VmSnapshotsRecord> implements org.jooq.Record16<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = 1018091388;

	/**
	 * Setter for <code>cloud.vm_snapshots.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 40)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.name</code>. 
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.display_name</code>. 
	 */
	public void setDisplayName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.display_name</code>. 
	 */
	@javax.persistence.Column(name = "display_name", length = 255)
	public java.lang.String getDisplayName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.description</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 255)
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.vm_id</code>. 
	 */
	public void setVmId(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.vm_id</code>. 
	 */
	@javax.persistence.Column(name = "vm_id", nullable = false, precision = 20)
	public java.lang.Long getVmId() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.account_id</code>. 
	 */
	public void setAccountId(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(6);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.domain_id</code>. 
	 */
	public void setDomainId(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.domain_id</code>. 
	 */
	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.vm_snapshot_type</code>. 
	 */
	public void setVmSnapshotType(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.vm_snapshot_type</code>. 
	 */
	@javax.persistence.Column(name = "vm_snapshot_type", length = 32)
	public java.lang.String getVmSnapshotType() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 32)
	public java.lang.String getState() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.parent</code>. 
	 */
	public void setParent(java.lang.Long value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.parent</code>. 
	 */
	@javax.persistence.Column(name = "parent", precision = 20)
	public java.lang.Long getParent() {
		return (java.lang.Long) getValue(10);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.current</code>. 
	 */
	public void setCurrent(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.current</code>. 
	 */
	@javax.persistence.Column(name = "current", precision = 10)
	public java.lang.Integer getCurrent() {
		return (java.lang.Integer) getValue(11);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.update_count</code>. 
	 */
	public void setUpdateCount(java.lang.Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.update_count</code>. 
	 */
	@javax.persistence.Column(name = "update_count", nullable = false, precision = 20)
	public java.lang.Long getUpdateCount() {
		return (java.lang.Long) getValue(12);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.updated</code>. 
	 */
	public void setUpdated(java.sql.Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.updated</code>. 
	 */
	@javax.persistence.Column(name = "updated")
	public java.sql.Timestamp getUpdated() {
		return (java.sql.Timestamp) getValue(13);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(14);
	}

	/**
	 * Setter for <code>cloud.vm_snapshots.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>cloud.vm_snapshots.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(15);
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
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.DISPLAY_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.VM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.VM_SNAPSHOT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field11() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.PARENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.CURRENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field13() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.UPDATE_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field14() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field15() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field16() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS.REMOVED;
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
	public java.lang.String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDisplayName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getVmId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getDomainId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getVmSnapshotType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value11() {
		return getParent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getCurrent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value13() {
		return getUpdateCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value14() {
		return getUpdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value15() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value16() {
		return getRemoved();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VmSnapshotsRecord
	 */
	public VmSnapshotsRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS);
	}

	/**
	 * Create a detached, initialised VmSnapshotsRecord
	 */
	public VmSnapshotsRecord(java.lang.Long id, java.lang.String uuid, java.lang.String name, java.lang.String displayName, java.lang.String description, java.lang.Long vmId, java.lang.Long accountId, java.lang.Long domainId, java.lang.String vmSnapshotType, java.lang.String state, java.lang.Long parent, java.lang.Integer current, java.lang.Long updateCount, java.sql.Timestamp updated, java.sql.Timestamp created, java.sql.Timestamp removed) {
		super(org.apache.cloudstack.db.jooq.generated.tables.VmSnapshots.VM_SNAPSHOTS);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, name);
		setValue(3, displayName);
		setValue(4, description);
		setValue(5, vmId);
		setValue(6, accountId);
		setValue(7, domainId);
		setValue(8, vmSnapshotType);
		setValue(9, state);
		setValue(10, parent);
		setValue(11, current);
		setValue(12, updateCount);
		setValue(13, updated);
		setValue(14, created);
		setValue(15, removed);
	}
}