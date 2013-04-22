package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import business.GroupAssembler;
import business.ImageAssembler;
import business.dto.ImageDto;
import business.pojo.SizeGroup;
import dao.ImageDao;

@Service("imageService")
@Transactional(propagation = Propagation.REQUIRED)



public class ImageServiceImpl implements ImageService {

	@Autowired(required = true)
	private ImageDao imageDao;
	
	@Autowired(required = true)
	private ImageAssembler imageAssembler;	
	
	@Autowired(required = true)
	private GroupAssembler groupAssembler;	
	
	public List<ImageDto> getAll() {
		return imageAssembler.convertToImageDto(imageDao.getAll());
	}

	public ImageDto getById(String id) {
		return imageAssembler.createDTO(imageDao.getById(id));
	}

	public void delete(ImageDto imageDto) {
		imageDao.delete(imageAssembler.createImagePojo(imageDto, null));
	}

	public void deleteAll() {
		for (ImageDto imageDto : getAll()) {
			delete(imageDto);
		}
	}

	public Integer count() {
		return imageDao.count();
	}

	public void saveOrUpdate(ImageDto imageDto) {
		imageDao.saveOrUpdate(imageAssembler.createImagePojo(imageDto,null));
	}
}