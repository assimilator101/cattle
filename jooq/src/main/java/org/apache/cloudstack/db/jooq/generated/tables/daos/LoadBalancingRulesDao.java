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
public class LoadBalancingRulesDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.LoadBalancingRulesRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules, java.lang.Long> {

	/**
	 * Create a new LoadBalancingRulesDao without any configuration
	 */
	public LoadBalancingRulesDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES, org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules.class);
	}

	/**
	 * Create a new LoadBalancingRulesDao with an attached configuration
	 */
	public LoadBalancingRulesDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES, org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES.ID, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES.NAME, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules> fetchByDescription(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>default_port_start IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules> fetchByDefaultPortStart(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES.DEFAULT_PORT_START, values);
	}

	/**
	 * Fetch records that have <code>default_port_end IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules> fetchByDefaultPortEnd(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES.DEFAULT_PORT_END, values);
	}

	/**
	 * Fetch records that have <code>algorithm IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules> fetchByAlgorithm(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES.ALGORITHM, values);
	}

	/**
	 * Fetch records that have <code>source_ip_address IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules> fetchBySourceIpAddress(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES.SOURCE_IP_ADDRESS, values);
	}

	/**
	 * Fetch records that have <code>source_ip_address_network_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules> fetchBySourceIpAddressNetworkId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES.SOURCE_IP_ADDRESS_NETWORK_ID, values);
	}

	/**
	 * Fetch records that have <code>scheme IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.LoadBalancingRules> fetchByScheme(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.LoadBalancingRules.LOAD_BALANCING_RULES.SCHEME, values);
	}
}