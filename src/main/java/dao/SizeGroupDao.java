package dao;

import java.util.List;

import business.pojo.SizeGroup;


public interface SizeGroupDao {

    List<SizeGroup> getAll();
    SizeGroup getById(int id);
    void saveOrUpdate(SizeGroup sizeGroup);
    void delete(SizeGroup sizeGroup);
    }
 