package business.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name = "Image")
public class Image implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "business.generators.MyGenerator")
	@Column(name = "IMAGE_UUID", length = 40, nullable = false)
	private String imageUUID;

	@Column(name = "ALT_TEXT", nullable = false, length = 250)
	private String altText;

	@Column(name = "CAPTION", nullable = true, length = 500)
	private String caption;

	@Column(name = "EXTERNAL_URL", nullable = true, length = 200)
	private String externalUrl;

	@Column(name = "LANGUAGE_CODE", nullable = false, length = 5)
	private String languageCode;

	@Column(name = "UPLOADED", nullable = false)
	private Date uploaded;

	@Column(name = "LAST_UPDATE", nullable = false)
	private Date lastUpdate;

	@Column(name = "MIME_TYPE", nullable = false, length = 50)
	private String mimeType;

	@Column(name = "ORGN_ID", nullable = false, length = 50)
	private Integer orgnID;

	@Column(name = "DELETED", nullable = false, length = 1)
	@Type (type="true_false")
	private Boolean deleted;

	@Column(name = "SEO_FRIENDLY_URL", nullable = true, length = 200)
	private String seoFriendlylUrl;
	
	@ManyToOne
	@JoinColumn(name = "SIZE_GROUP_ID", nullable = true)
	private SizeGroup sizeGroup; 

	@Column(name = "CREDIT", nullable = false)
	private Integer credit;

	public Image() {
	};
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((imageUUID == null) ? 0 : imageUUID.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		if (imageUUID == null) {
			if (other.imageUUID != null)
				return false;
		} else if (!imageUUID.equals(other.imageUUID))
			return false;
		return true;
	}


	public SizeGroup getSizeGroup() {
		return sizeGroup;
	}

	public void setSizeGroup(SizeGroup sizeGroup) {
		this.sizeGroup = sizeGroup;
	}
	
	public Image(String externalUrl) {
		super();
		this.externalUrl = externalUrl;
	}

	public Integer getOrgnID() {
		return orgnID;
	}

	public void setOrgnID(Integer orgnID) {
		this.orgnID = orgnID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setOriginID(Integer originID) {
		this.orgnID = originID;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getImageUUID() {
		return imageUUID;
	}

	public void setImageUUID(String imageUUID) {
		this.imageUUID = imageUUID;
	}

	public String getAltText() {
		return altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public Date getUploaded() {
		return uploaded;
	}

	public void setUploaded(Date uploaded) {
		this.uploaded = uploaded;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getSeoFriendlylUrl() {
		return seoFriendlylUrl;
	}

	public void setSeoFriendlylUrl(String seoFriendlylUrl) {
		this.seoFriendlylUrl = seoFriendlylUrl;
	}

	public Integer getCredit() {
		return credit;
	}

}
