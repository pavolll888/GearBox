package business.dto;

import java.io.Serializable;
import java.util.Date;

public class ImageDtoImpl implements ImageDto,Serializable{

	private static final long serialVersionUID = -3752290897239905274L;

	private String imageUUID;

	private String altText;

	private String caption;

	private String externalUrl;

	private String languageCode;

	private Date uploaded;

	private Date lastUpdate;

	private String mimeType;

	private Integer orgnID;

	private Boolean deleted;

	private String seoFriendlylUrl;
	
	private SizeGroupDto sizeGroupDto; 

	private Integer credit;

	public ImageDtoImpl() {
		super();
	}
	

	public SizeGroupDto getSizeGroupDto() {
		return sizeGroupDto;
	}

	public void setSizeGroupDto(SizeGroupDto sizeGroupDto) {
		this.sizeGroupDto = sizeGroupDto;
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

	public Integer getOriginID() {
		return orgnID;
	}


	
}
