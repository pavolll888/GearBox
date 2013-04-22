package business.dto;

import java.util.Date;

public interface ImageDto {

	public SizeGroupDto getSizeGroupDto();
	public void setSizeGroupDto(SizeGroupDto sizeGroup);
	public Integer getOrgnID();
	public void setOrgnID(Integer orgnID);
	public Integer getOriginID();
	public void setOriginID(Integer originID);
	public Integer getCredit();
	public void setCredit(Integer credit);
	public String getImageUUID();
	public void setImageUUID(String uUID);
	public String getAltText();
	public void setAltText(String altText);
	public String getCaption();
	public void setCaption(String caption);
	public String getExternalUrl();
	public void setExternalUrl(String externalUrl);
	public String getLanguageCode();
	public void setLanguageCode(String languageCode);
	public Date getUploaded();
	public void setUploaded(Date uploaded);
	public Date getLastUpdate();
	public void setLastUpdate(Date lastUpdate);
	public String getMimeType();
	public void setMimeType(String mimeType);
	public Boolean getDeleted();
	public void setDeleted(Boolean deleted);
	public String getSeoFriendlylUrl();
	public void setSeoFriendlylUrl(String seoFriendlylUrl);
	
}
