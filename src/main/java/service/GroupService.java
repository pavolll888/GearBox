package service;

import java.util.List;

import business.dto.SizeGroupDto;

public interface GroupService {

    void saveOrUpdate(SizeGroupDto sizeGroup);
    
    public List <SizeGroupDto> getAllSizeGroupsDto();
   
	public SizeGroupDto getById(Integer id); 

	public void deleteAll(); 

	public Integer count();

  
}
	
	

