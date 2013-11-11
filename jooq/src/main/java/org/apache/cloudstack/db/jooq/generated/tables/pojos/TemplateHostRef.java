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
@javax.persistence.Table(name = "template_host_ref", schema = "cloud")
public class TemplateHostRef implements java.io.Serializable {

	private static final long serialVersionUID = -161198409;

	private java.lang.Long     id;
	private java.lang.Long     hostId;
	private java.lang.Long     templateId;
	private java.sql.Timestamp created;
	private java.sql.Timestamp lastUpdated;
	private java.lang.String   jobId;
	private java.lang.Integer  downloadPct;
	private java.lang.Long     size;
	private java.lang.Long     physicalSize;
	private java.lang.String   downloadState;
	private java.lang.String   errorStr;
	private java.lang.String   localPath;
	private java.lang.String   installPath;
	private java.lang.String   url;
	private java.lang.Boolean  destroyed;
	private java.lang.Boolean  isCopy;

	public TemplateHostRef() {}

	public TemplateHostRef(
		java.lang.Long     id,
		java.lang.Long     hostId,
		java.lang.Long     templateId,
		java.sql.Timestamp created,
		java.sql.Timestamp lastUpdated,
		java.lang.String   jobId,
		java.lang.Integer  downloadPct,
		java.lang.Long     size,
		java.lang.Long     physicalSize,
		java.lang.String   downloadState,
		java.lang.String   errorStr,
		java.lang.String   localPath,
		java.lang.String   installPath,
		java.lang.String   url,
		java.lang.Boolean  destroyed,
		java.lang.Boolean  isCopy
	) {
		this.id = id;
		this.hostId = hostId;
		this.templateId = templateId;
		this.created = created;
		this.lastUpdated = lastUpdated;
		this.jobId = jobId;
		this.downloadPct = downloadPct;
		this.size = size;
		this.physicalSize = physicalSize;
		this.downloadState = downloadState;
		this.errorStr = errorStr;
		this.localPath = localPath;
		this.installPath = installPath;
		this.url = url;
		this.destroyed = destroyed;
		this.isCopy = isCopy;
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

	@javax.persistence.Column(name = "template_id", nullable = false, precision = 20)
	public java.lang.Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(java.lang.Long templateId) {
		this.templateId = templateId;
	}

	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	@javax.persistence.Column(name = "last_updated")
	public java.sql.Timestamp getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(java.sql.Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@javax.persistence.Column(name = "job_id", length = 255)
	public java.lang.String getJobId() {
		return this.jobId;
	}

	public void setJobId(java.lang.String jobId) {
		this.jobId = jobId;
	}

	@javax.persistence.Column(name = "download_pct", precision = 10)
	public java.lang.Integer getDownloadPct() {
		return this.downloadPct;
	}

	public void setDownloadPct(java.lang.Integer downloadPct) {
		this.downloadPct = downloadPct;
	}

	@javax.persistence.Column(name = "size", precision = 20)
	public java.lang.Long getSize() {
		return this.size;
	}

	public void setSize(java.lang.Long size) {
		this.size = size;
	}

	@javax.persistence.Column(name = "physical_size", precision = 20)
	public java.lang.Long getPhysicalSize() {
		return this.physicalSize;
	}

	public void setPhysicalSize(java.lang.Long physicalSize) {
		this.physicalSize = physicalSize;
	}

	@javax.persistence.Column(name = "download_state", length = 255)
	public java.lang.String getDownloadState() {
		return this.downloadState;
	}

	public void setDownloadState(java.lang.String downloadState) {
		this.downloadState = downloadState;
	}

	@javax.persistence.Column(name = "error_str", length = 255)
	public java.lang.String getErrorStr() {
		return this.errorStr;
	}

	public void setErrorStr(java.lang.String errorStr) {
		this.errorStr = errorStr;
	}

	@javax.persistence.Column(name = "local_path", length = 255)
	public java.lang.String getLocalPath() {
		return this.localPath;
	}

	public void setLocalPath(java.lang.String localPath) {
		this.localPath = localPath;
	}

	@javax.persistence.Column(name = "install_path", length = 255)
	public java.lang.String getInstallPath() {
		return this.installPath;
	}

	public void setInstallPath(java.lang.String installPath) {
		this.installPath = installPath;
	}

	@javax.persistence.Column(name = "url", length = 255)
	public java.lang.String getUrl() {
		return this.url;
	}

	public void setUrl(java.lang.String url) {
		this.url = url;
	}

	@javax.persistence.Column(name = "destroyed", precision = 1)
	public java.lang.Boolean getDestroyed() {
		return this.destroyed;
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		this.destroyed = destroyed;
	}

	@javax.persistence.Column(name = "is_copy", nullable = false, precision = 1)
	public java.lang.Boolean getIsCopy() {
		return this.isCopy;
	}

	public void setIsCopy(java.lang.Boolean isCopy) {
		this.isCopy = isCopy;
	}
}