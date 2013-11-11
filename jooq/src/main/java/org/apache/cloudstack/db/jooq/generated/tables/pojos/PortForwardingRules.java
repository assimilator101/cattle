/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "port_forwarding_rules", schema = "cloud")
public class PortForwardingRules implements java.io.Serializable {

	private static final long serialVersionUID = 1592827482;

	private java.lang.Long    id;
	private java.lang.Long    instanceId;
	private java.lang.String  destIpAddress;
	private java.lang.Integer destPortStart;
	private java.lang.Integer destPortEnd;

	public PortForwardingRules() {}

	public PortForwardingRules(
		java.lang.Long    id,
		java.lang.Long    instanceId,
		java.lang.String  destIpAddress,
		java.lang.Integer destPortStart,
		java.lang.Integer destPortEnd
	) {
		this.id = id;
		this.instanceId = instanceId;
		this.destIpAddress = destIpAddress;
		this.destPortStart = destPortStart;
		this.destPortEnd = destPortEnd;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "instance_id", nullable = false, precision = 20)
	public java.lang.Long getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(java.lang.Long instanceId) {
		this.instanceId = instanceId;
	}

	@javax.persistence.Column(name = "dest_ip_address", nullable = false, length = 40)
	public java.lang.String getDestIpAddress() {
		return this.destIpAddress;
	}

	public void setDestIpAddress(java.lang.String destIpAddress) {
		this.destIpAddress = destIpAddress;
	}

	@javax.persistence.Column(name = "dest_port_start", nullable = false, precision = 10)
	public java.lang.Integer getDestPortStart() {
		return this.destPortStart;
	}

	public void setDestPortStart(java.lang.Integer destPortStart) {
		this.destPortStart = destPortStart;
	}

	@javax.persistence.Column(name = "dest_port_end", nullable = false, precision = 10)
	public java.lang.Integer getDestPortEnd() {
		return this.destPortEnd;
	}

	public void setDestPortEnd(java.lang.Integer destPortEnd) {
		this.destPortEnd = destPortEnd;
	}
}