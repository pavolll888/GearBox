package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import business.GroupAssembler;
import business.dto.ImageDto;
import business.dto.SizeGroupDto;
import dao.SizeGroupDao;


@Service("groupService")
@Transactional(propagation = Propagation.REQUIRED)
public class GroupServiceImpl  implements GroupService{
	
	@Autowired(required = true)
	private SizeGroupDao sizeGroupDao;
	
	@Autowired(required = true)
	private GroupAssembler groupAssembler;	

	public void saveOrUpdate(SizeGroupDto sizeGroupDto) {
		sizeGroupDao.saveOrUpdate(groupAssembler.createSizeGroupPojo(sizeGroupDto));
	}


	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public Integer count() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<SizeGroupDto> getAllSizeGroupsDto() {
		// TODO Auto-generated method stub
		return null;
	}


	public SizeGroupDto getById(Integer id) {
		return groupAssembler.createDTO(sizeGroupDao.getById(id));
	}

	


	
	
	
}
