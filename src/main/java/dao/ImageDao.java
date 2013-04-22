package dao;

import java.util.List;

import business.pojo.Image;
import business.pojo.SizeGroup;



public interface ImageDao {
    List<Image> getAll();
    Image getById(String id);
    void saveOrUpdate(Image image);
    void delete(Image image);
    Integer count();
}