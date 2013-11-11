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
@javax.persistence.Table(name = "host_tags", schema = "cloud")
public class HostTags implements java.io.Serializable {

	private static final long serialVersionUID = -37271526;

	private java.lang.Long   id;
	private java.lang.Long   hostId;
	private java.lang.String tag;

	public HostTags() {}

	public HostTags(
		java.lang.Long   id,
		java.lang.Long   hostId,
		java.lang.String tag
	) {
		this.id = id;
		this.hostId = hostId;
		this.tag = tag;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "host_id", nullable = false, precision = 20)
	public java.lang.Long getHostId() {
		return this.hostId;
	}

	public void setHostId(java.lang.Long hostId) {
		this.hostId = hostId;
	}

	@javax.persistence.Column(name = "tag", nullable = false, length = 255)
	public java.lang.String getTag() {
		return this.tag;
	}

	public void setTag(java.lang.String tag) {
		this.tag = tag;
	}
}