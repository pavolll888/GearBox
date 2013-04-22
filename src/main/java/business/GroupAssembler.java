package business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import business.dto.ImageDto;
import business.dto.SizeGroupDto;
import business.dto.SizeGroupDtoImpl;
import business.pojo.Image;
import business.pojo.SizeGroup;

	@Service("GroupAssembler")
	public class GroupAssembler {
		
		
	@Autowired(required = true)
	private ImageAssembler imageAssembler;	
			
	public SizeGroupDto createDTO(SizeGroup sizeGroup){
		SizeGroupDto sizeGroupDto = new SizeGroupDtoImpl();
		sizeGroupDto.setSizeGroupID(sizeGroup.getSizeGroupID());
		sizeGroupDto.setRatio(sizeGroup.getRatio());
		sizeGroupDto.setRatioWidth(sizeGroup.getRatioWidth());
		sizeGroupDto.setRatioHeith(sizeGroup.getRatioHeith());
		sizeGroupDto.setOrgnID(sizeGroup.getOrgnID());
		return sizeGroupDto;
	}
	
	public SizeGroup createSizeGroupPojo(SizeGroupDto sizeGroupDto){
		if(sizeGroupDto==null){
			return null;
		}
		SizeGroup sizeGroup = new SizeGroup();
		sizeGroup.setOrgnID(sizeGroupDto.getOrgnID());
		sizeGroup.setRatio(sizeGroupDto.getRatio());
		sizeGroup.setRatioHeith(sizeGroupDto.getRatioHeith());
		sizeGroup.setRatioWidth(sizeGroupDto.getRatioWidth());
		sizeGroup.setImages(imageAssembler.convertToImages(sizeGroupDto.getImages(),sizeGroup));
		return sizeGroup;
	}
}
