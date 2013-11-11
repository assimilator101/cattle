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
@javax.persistence.Table(name = "router_network_ref", schema = "cloud", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"router_id", "network_id"})
})
public class RouterNetworkRef implements java.io.Serializable {

	private static final long serialVersionUID = -1319493645;

	private java.lang.Long   id;
	private java.lang.Long   routerId;
	private java.lang.Long   networkId;
	private java.lang.String guestType;

	public RouterNetworkRef() {}

	public RouterNetworkRef(
		java.lang.Long   id,
		java.lang.Long   routerId,
		java.lang.Long   networkId,
		java.lang.String guestType
	) {
		this.id = id;
		this.routerId = routerId;
		this.networkId = networkId;
		this.guestType = guestType;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "router_id", nullable = false, precision = 20)
	public java.lang.Long getRouterId() {
		return this.routerId;
	}

	public void setRouterId(java.lang.Long routerId) {
		this.routerId = routerId;
	}

	@javax.persistence.Column(name = "network_id", nullable = false, precision = 20)
	public java.lang.Long getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(java.lang.Long networkId) {
		this.networkId = networkId;
	}

	@javax.persistence.Column(name = "guest_type", length = 32)
	public java.lang.String getGuestType() {
		return this.guestType;
	}

	public void setGuestType(java.lang.String guestType) {
		this.guestType = guestType;
	}
}