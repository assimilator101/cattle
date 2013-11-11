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
public class VmTemplateDetailsDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VmTemplateDetailsRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.VmTemplateDetails, java.lang.Long> {

	/**
	 * Create a new VmTemplateDetailsDao without any configuration
	 */
	public VmTemplateDetailsDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.VmTemplateDetails.VM_TEMPLATE_DETAILS, org.apache.cloudstack.db.jooq.generated.tables.pojos.VmTemplateDetails.class);
	}

	/**
	 * Create a new VmTemplateDetailsDao with an attached configuration
	 */
	public VmTemplateDetailsDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.VmTemplateDetails.VM_TEMPLATE_DETAILS, org.apache.cloudstack.db.jooq.generated.tables.pojos.VmTemplateDetails.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.VmTemplateDetails object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmTemplateDetails> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmTemplateDetails.VM_TEMPLATE_DETAILS.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.VmTemplateDetails fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.VmTemplateDetails.VM_TEMPLATE_DETAILS.ID, value);
	}

	/**
	 * Fetch records that have <code>template_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmTemplateDetails> fetchByTemplateId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmTemplateDetails.VM_TEMPLATE_DETAILS.TEMPLATE_ID, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmTemplateDetails> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmTemplateDetails.VM_TEMPLATE_DETAILS.NAME, values);
	}

	/**
	 * Fetch records that have <code>value IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmTemplateDetails> fetchByValue(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmTemplateDetails.VM_TEMPLATE_DETAILS.VALUE, values);
	}

	/**
	 * Fetch records that have <code>display IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VmTemplateDetails> fetchByDisplay(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VmTemplateDetails.VM_TEMPLATE_DETAILS.DISPLAY, values);
	}
}