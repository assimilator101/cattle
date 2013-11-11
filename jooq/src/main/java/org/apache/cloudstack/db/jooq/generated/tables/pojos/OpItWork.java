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
@javax.persistence.Table(name = "op_it_work", schema = "cloud")
public class OpItWork implements java.io.Serializable {

	private static final long serialVersionUID = 612348822;

	private java.lang.String id;
	private java.lang.Long   mgmtServerId;
	private java.lang.Long   createdAt;
	private java.lang.String thread;
	private java.lang.String type;
	private java.lang.String vmType;
	private java.lang.String step;
	private java.lang.Long   updatedAt;
	private java.lang.Long   instanceId;
	private java.lang.String resourceType;
	private java.lang.Long   resourceId;

	public OpItWork() {}

	public OpItWork(
		java.lang.String id,
		java.lang.Long   mgmtServerId,
		java.lang.Long   createdAt,
		java.lang.String thread,
		java.lang.String type,
		java.lang.String vmType,
		java.lang.String step,
		java.lang.Long   updatedAt,
		java.lang.Long   instanceId,
		java.lang.String resourceType,
		java.lang.Long   resourceId
	) {
		this.id = id;
		this.mgmtServerId = mgmtServerId;
		this.createdAt = createdAt;
		this.thread = thread;
		this.type = type;
		this.vmType = vmType;
		this.step = step;
		this.updatedAt = updatedAt;
		this.instanceId = instanceId;
		this.resourceType = resourceType;
		this.resourceId = resourceId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, length = 40)
	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "mgmt_server_id", precision = 20)
	public java.lang.Long getMgmtServerId() {
		return this.mgmtServerId;
	}

	public void setMgmtServerId(java.lang.Long mgmtServerId) {
		this.mgmtServerId = mgmtServerId;
	}

	@javax.persistence.Column(name = "created_at", nullable = false, precision = 20)
	public java.lang.Long getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(java.lang.Long createdAt) {
		this.createdAt = createdAt;
	}

	@javax.persistence.Column(name = "thread", nullable = false, length = 255)
	public java.lang.String getThread() {
		return this.thread;
	}

	public void setThread(java.lang.String thread) {
		this.thread = thread;
	}

	@javax.persistence.Column(name = "type", nullable = false, length = 32)
	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	@javax.persistence.Column(name = "vm_type", nullable = false, length = 32)
	public java.lang.String getVmType() {
		return this.vmType;
	}

	public void setVmType(java.lang.String vmType) {
		this.vmType = vmType;
	}

	@javax.persistence.Column(name = "step", nullable = false, length = 32)
	public java.lang.String getStep() {
		return this.step;
	}

	public void setStep(java.lang.String step) {
		this.step = step;
	}

	@javax.persistence.Column(name = "updated_at", nullable = false, precision = 20)
	public java.lang.Long getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(java.lang.Long updatedAt) {
		this.updatedAt = updatedAt;
	}

	@javax.persistence.Column(name = "instance_id", nullable = false, precision = 20)
	public java.lang.Long getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(java.lang.Long instanceId) {
		this.instanceId = instanceId;
	}

	@javax.persistence.Column(name = "resource_type", length = 32)
	public java.lang.String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(java.lang.String resourceType) {
		this.resourceType = resourceType;
	}

	@javax.persistence.Column(name = "resource_id", precision = 20)
	public java.lang.Long getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(java.lang.Long resourceId) {
		this.resourceId = resourceId;
	}
}