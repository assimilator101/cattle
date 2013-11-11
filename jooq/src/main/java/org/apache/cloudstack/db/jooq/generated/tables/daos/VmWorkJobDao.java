/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VmWorkJobDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VmWorkJobRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.VmWorkJob, java.lang.Long> {

	/**
	 * Create a new VmWorkJobDao without any configuration
	 */
	public VmWorkJobDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.VmWorkJob.VM_WORK_JOB, org.apache.cloudstack.db.jooq.generated.tables.pojos.VmWorkJob.class);
	}

	/**
	 * Create a new VmWorkJobDao with an attached configuration
	 */
	public VmWorkJobDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.VmWorkJob.VM_WORK_JOB, org.apache.cloudstack.db.jooq.generated.tables.pojos.VmWorkJob.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.VmWorkJob object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmWorkJob> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmWorkJob.VM_WORK_JOB.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.VmWorkJob fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.VmWorkJob.VM_WORK_JOB.ID, value);
	}

	/**
	 * Fetch records that have <code>step IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmWorkJob> fetchByStep(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmWorkJob.VM_WORK_JOB.STEP, values);
	}

	/**
	 * Fetch records that have <code>vm_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmWorkJob> fetchByVmType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmWorkJob.VM_WORK_JOB.VM_TYPE, values);
	}

	/**
	 * Fetch records that have <code>vm_instance_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmWorkJob> fetchByVmInstanceId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmWorkJob.VM_WORK_JOB.VM_INSTANCE_ID, values);
	}
}