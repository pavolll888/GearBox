package service.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.SizeGroupDao;
import dao.SizeGroupDaoImpl;

import service.GroupService;
import service.ImageService;
import service.ImageServiceImpl;
import business.dto.ImageDto;
import business.dto.ImageDtoImpl;
import business.dto.SizeGroupDto;
import business.dto.SizeGroupDtoImpl;

public class Main {

	static SessionFactory sessionFactory;

	public static void main(String[] args) {
	
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        ImageService imageService = (ImageService) ctx.getBean("imageService");
        GroupService groupService = (GroupService) ctx.getBean("groupService");
        //SizeGroupDao sizeGroupDao = (SizeGroupDao) ctx.getBean("sizeGroupDao");
       // SizeGroupDao sizeGroupDao =new SizeGroupDaoImpl();
        SizeGroupDto sizeGroupDto =new SizeGroupDtoImpl();
        ImageDto imageDto2 = new ImageDtoImpl();
        ImageDto imageDto1 = new ImageDtoImpl();
        ImageDto imageDto3 = new ImageDtoImpl();
        
        imageDto2.setAltText("altText");
        imageDto2.setCaption("caption");
        imageDto2.setCredit(23);
        imageDto2.setDeleted(false);
        imageDto2.setExternalUrl("url");
        imageDto2.setLanguageCode("url");
        imageDto2.setLastUpdate(new Date());
        imageDto2.setUploaded(new Date());
        imageDto2.setUploaded(new Date());
        imageDto2.setMimeType("gere");
        imageDto2.setOriginID(2);
        imageDto2.setSizeGroupDto(sizeGroupDto);
        
        imageDto1.setAltText("altText");
        imageDto1.setCaption("caption");
        imageDto1.setCredit(23);
        imageDto1.setDeleted(false);
        imageDto1.setExternalUrl("url");
        imageDto1.setLanguageCode("url");
        imageDto1.setLastUpdate(new Date());
        imageDto1.setUploaded(new Date());
        imageDto1.setMimeType("gere");
        imageDto1.setOriginID(2);
        imageDto1.setSizeGroupDto(sizeGroupDto);
        
        
        imageDto3.setAltText("altText");
        imageDto3.setCaption("caption");
        imageDto3.setCredit(23);
        imageDto3.setDeleted(false);
        imageDto3.setExternalUrl("url");
        imageDto3.setLanguageCode("url");
        imageDto3.setLastUpdate(new Date());
        imageDto3.setUploaded(new Date());
        imageDto3.setMimeType("gere");
        imageDto3.setOriginID(2);
        imageDto3.setSizeGroupDto(sizeGroupDto);
        
        
       
        sizeGroupDto.setOrgnID(4);
        sizeGroupDto.setRatio(1.5387f);
        sizeGroupDto.setRatioHeith(2);
        sizeGroupDto.setRatioWidth(22);
     
        sizeGroupDto.getImages().add(imageDto1);
        sizeGroupDto.getImages().add(imageDto2);
       
        groupService.saveOrUpdate(sizeGroupDto);
        
        imageService.saveOrUpdate(imageDto3);
        System.out.println(groupService.getById(1).toString());
       
        //System.out.println(imageService.getById(1).toString());
        
        //System.out.println(imageService.getById("c9582d78-97af-4576-bbbb-c856273b5749"));
        
        //List<ImageDto> someList = imageService.getAll();
        
        System.out.println(imageDto3.getImageUUID());
        
        //System.out.println(imageService.getById(imageDto3.getImageUUID()));
        
        System.out.println(imageDto3.toString());
        
        imageService.delete(imageDto3);
        
        List<ImageDto> imagesList = new ArrayList<ImageDto>();
        imagesList = imageService.getAll();
        System.out.println(imagesList.get(1).getImageUUID());
        
        
        //service.getById(1);
        
        //System.out.println();
        //service.delete(imageDto2);
        //System.out.println(imageDto2.getClass());
	}

}

