package dao;




import dao.ImageDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import business.pojo.Image;
import business.pojo.SizeGroup;

 
import java.io.Serializable;
import java.util.List;
 
@Repository("imageDao")
@Transactional(propagation = Propagation.REQUIRED)
public class ImageDaoImpl implements ImageDao {
 
    @Autowired(required=true)
    private SessionFactory sessionFactory;
 
    @SuppressWarnings("unchecked")
    public List<Image> getAll() {
        return getSession().createCriteria(Image.class).list();
    }
 
    public Image getById(String uuid) {
        return (Image) getSession().get(Image.class, uuid);
    }
 
    public void saveOrUpdate(Image image) {
    	getSession().saveOrUpdate(image);
    }
    
    @Transactional(readOnly = false)
    public void delete(Image image) {
        getSession().delete(image);
    }
 
    public Integer count() {
        return (Integer) getSession().createCriteria(Image.class)
                .setProjection(Projections.rowCount())
                .uniqueResult();
    }
 
    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

}