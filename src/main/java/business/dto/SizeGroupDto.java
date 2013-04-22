package business.dto;

import java.util.Collection;

public interface SizeGroupDto {

	public Collection<ImageDto> getImages();
	public void setImages(Collection<ImageDto> images);
	public void setSizeGroupID(Integer sizeGroupID);
	public Integer getSizeGroupID();
	public void setSizeGroupID(int sizeGroupID);
	public Float getRatio();
	public void setRatio(Float ratio);
	public Integer getRatioWidth();
	public void setRatioWidth(Integer ratioWidth);
	public int getRatioHeith();
	public void setRatioHeith(Integer ratioHeith);
	public Integer getOrgnID();
	public void setOrgnID(Integer orgnID);
}
