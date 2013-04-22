package business.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "SIZE_GROUPS")
public class SizeGroup implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id()
	@Column(name = "SIZE_GROUP_ID",nullable = false,unique = true,length = 10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sizeGroupID;
	
	@Column(precision = 6, scale = 4, name = "RATIO",nullable = false)
	private Float ratio;
	
	@Column(name = "RATIO_WIDTH",nullable = false)
	private Integer ratioWidth;
	//private 
	
	@Column(name = "RATIO_HEITH",nullable = false)
	private Integer ratioHeith;
	
	@Column(name = "ORGN_ID",nullable = false)
	private Integer orgnID;

	@OneToMany(cascade = CascadeType.PERSIST,fetch=FetchType.EAGER,mappedBy = "sizeGroup")//)
	
	private Collection<Image> images = new ArrayList<Image>();

	
	public Collection<Image> getImages() {
		return images;
	}

	public void setImages(Collection<Image> images) {
		this.images = images;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setSizeGroupID(Integer sizeGroupID) {
		this.sizeGroupID = sizeGroupID;
	}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ratio == null) ? 0 : ratio.hashCode());
		result = prime * result + ((orgnID == null) ? 0 : orgnID.hashCode());
		result = prime * result
				+ ((ratioHeith == null) ? 0 : ratioHeith.hashCode());
		result = prime * result
				+ ((ratioWidth == null) ? 0 : ratioWidth.hashCode());
		result = prime * result
				+ ((sizeGroupID == null) ? 0 : sizeGroupID.hashCode());
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
		SizeGroup other = (SizeGroup) obj;
		if (ratio == null) {
			if (other.ratio != null)
				return false;
		} else if (!ratio.equals(other.ratio))
			return false;
		if (orgnID == null) {
			if (other.orgnID != null)
				return false;
		} else if (!orgnID.equals(other.orgnID))
			return false;
		if (ratioHeith == null) {
			if (other.ratioHeith != null)
				return false;
		} else if (!ratioHeith.equals(other.ratioHeith))
			return false;
		if (ratioWidth == null) {
			if (other.ratioWidth != null)
				return false;
		} else if (!ratioWidth.equals(other.ratioWidth))
			return false;
		if (sizeGroupID == null) {
			if (other.sizeGroupID != null)
				return false;
		} else if (!sizeGroupID.equals(other.sizeGroupID))
			return false;
		return true;
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
	
	
	//@Column(name = “REQUEST_DATE�?, nullable = false, columnDefinition = “date default sysdate″)
	
}
