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
@javax.persistence.Table(name = "cluster_vsm_map", schema = "cloud")
public class ClusterVsmMapRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterVsmMapRecord> implements org.jooq.Record2<java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = -606589717;

	/**
	 * Setter for <code>cloud.cluster_vsm_map.cluster_id</code>. 
	 */
	public void setClusterId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.cluster_vsm_map.cluster_id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "cluster_id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getClusterId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.cluster_vsm_map.vsm_id</code>. 
	 */
	public void setVsmId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.cluster_vsm_map.vsm_id</code>. 
	 */
	@javax.persistence.Column(name = "vsm_id", nullable = false, precision = 20)
	public java.lang.Long getVsmId() {
		return (java.lang.Long) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.ClusterVsmMap.CLUSTER_VSM_MAP.CLUSTER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.ClusterVsmMap.CLUSTER_VSM_MAP.VSM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getClusterId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getVsmId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ClusterVsmMapRecord
	 */
	public ClusterVsmMapRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.ClusterVsmMap.CLUSTER_VSM_MAP);
	}

	/**
	 * Create a detached, initialised ClusterVsmMapRecord
	 */
	public ClusterVsmMapRecord(java.lang.Long clusterId, java.lang.Long vsmId) {
		super(org.apache.cloudstack.db.jooq.generated.tables.ClusterVsmMap.CLUSTER_VSM_MAP);

		setValue(0, clusterId);
		setValue(1, vsmId);
	}
}