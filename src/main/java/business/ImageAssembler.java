package business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import business.dto.ImageDto;
import business.dto.ImageDtoImpl;
import business.pojo.Image;
import business.pojo.SizeGroup;

@Service("ImageAssembler")
public class ImageAssembler {

	@Autowired(required = true)
	private GroupAssembler groupAssembler;

	public ImageDto createDTO(Image image) {
		ImageDto imageDto = new ImageDtoImpl();
		imageDto.setImageUUID(image.getImageUUID());
		imageDto.setAltText(image.getAltText());
		imageDto.setCaption(image.getCaption());
		imageDto.setCredit(image.getCredit());
		imageDto.setDeleted(image.getDeleted());
		imageDto.setExternalUrl(image.getExternalUrl());
		imageDto.setLanguageCode(image.getLanguageCode());
		imageDto.setLastUpdate(image.getLastUpdate());
		imageDto.setMimeType(image.getMimeType());
		imageDto.setOrgnID(image.getOrgnID());
		imageDto.setSeoFriendlylUrl(image.getSeoFriendlylUrl());
		imageDto.setSizeGroupDto(groupAssembler.createDTO(image.getSizeGroup()));
		imageDto.setUploaded(image.getUploaded());
		return imageDto;
	}

	public Image createImagePojo(ImageDto imageDto, SizeGroup sizeGroup) {//size group
		Image image = new Image();
		//image.setImageUUID(image.getImageUUID());
		image.setAltText(imageDto.getAltText());
		image.setCaption(imageDto.getCaption());
		image.setCredit(imageDto.getCredit());
		image.setDeleted(imageDto.getDeleted());
		image.setExternalUrl(imageDto.getExternalUrl());
		image.setLanguageCode(imageDto.getLanguageCode());
		image.setLastUpdate(imageDto.getLastUpdate());
		image.setMimeType(imageDto.getMimeType());
		image.setSeoFriendlylUrl(imageDto.getSeoFriendlylUrl());
		if (sizeGroup != null) {//
			image.setSizeGroup(sizeGroup);//
		}//
		image.setUploaded(imageDto.getUploaded());
		image.setOrgnID(imageDto.getOrgnID());
		return image;
	}

	public List<ImageDto> convertToImageDto(Collection<Image> images) {
		List<ImageDto> imagesListDto = new ArrayList<ImageDto>();

		for (Image image : images) {
			imagesListDto.add(createDTO(image));
		}

		return imagesListDto;
	}

	public List<Image> convertToImages(Collection<ImageDto> imagesDto,
			SizeGroup sizeGroup) {
		List<Image> result = new ArrayList<Image>();

		for (ImageDto imageDto : imagesDto) {
			result.add(createImagePojo(imageDto, sizeGroup));//sizeGroup
		}
		return result;
	}

}
