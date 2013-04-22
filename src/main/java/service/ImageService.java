package service;

import java.util.List;

import business.dto.ImageDto;


public interface ImageService {


	public List<ImageDto> getAll(); 

	public ImageDto getById(String id); 

	public void delete(ImageDto imageDto); 

	public void deleteAll(); 

	public Integer count();

	public void saveOrUpdate(ImageDto imageDto) ;

}
