package com.sales.app.shared.appbasicsetup.usermanagement;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.athena.shared.pluggable.entity.AuditPropertiesEntity;

@Entity
@Table(name = "art_app_notification_template")
public class ArtAppNotificationTemplate extends AuditPropertiesEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUIDGenerator")
	@Size(min = 3, max = 64)
	@Column(name = "template_id")
	private String templateId;

	@Column(name = "template_name")
	private String templateName;

	@Column(name = "template")
	private String template;

	@Column(name = "notification_type")
	private Integer notificationType;

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Object getPrimaryKey() {
		return this.templateId;
	}

	public Integer getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(Integer notificationType) {
		this.notificationType = notificationType;
	}

}
