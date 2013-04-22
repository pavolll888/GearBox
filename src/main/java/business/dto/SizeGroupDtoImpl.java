package business.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class SizeGroupDtoImpl implements SizeGroupDto, Serializable{

	private static final long serialVersionUID = 1379041260700849676L;
	
	private Integer sizeGroupID;
	
	private Float ratio;
	
	private Integer ratioWidth;
	
	private Integer ratioHeith;
	
	private Integer orgnID;

	private Collection<ImageDto> images = new ArrayList<ImageDto>();

	
	public Collection<ImageDto> getImages() {
		return images;
	}

	public void setImages(Collection<ImageDto> images) {
		this.images = images;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setSizeGroupID(Integer sizeGroupID) {
		this.sizeGroupID = sizeGroupID;
	}
	
	public Integer getSizeGroupID() {
		return sizeGroupID;
	}

	public void setSizeGroupID(int sizeGroupID) {
		this.sizeGroupID = sizeGroupID;
	}

	public Float getRatio() {
		return ratio;
	}

	public void setRatio(Float ratio) {
		this.ratio = ratio;
	}

	public Integer getRatioWidth() {
		return ratioWidth;
	}

	public void setRatioWidth(Integer ratioWidth) {
		this.ratioWidth = ratioWidth;
	}

	public int getRatioHeith() {
		return ratioHeith;
	}

	public void setRatioHeith(Integer ratioHeith) {
		this.ratioHeith = ratioHeith;
	}

	public Integer getOrgnID() {
		return orgnID;
	}

	public void setOrgnID(Integer orgnID) {
		this.orgnID = orgnID;
	}
}
