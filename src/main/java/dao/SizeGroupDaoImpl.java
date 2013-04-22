
package dao;




import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import business.pojo.SizeGroup;
 
@Repository("sizeGroupDao")
public class SizeGroupDaoImpl implements SizeGroupDao {
 
    @Autowired(required=true)
    private SessionFactory sessionFactory;
 
    @SuppressWarnings("unchecked")
    public List<SizeGroup> getAll() {
        return getSession().createCriteria(SizeGroup.class).list();
    }
 
    public SizeGroup getById(String uuid) {
        return (SizeGroup) getSession().get(SizeGroup.class, uuid);
    }
 
	public SizeGroup getById(int id) {
		 return (SizeGroup) getSession().get(SizeGroup.class, id);
	}

	public void saveOrUpdate(SizeGroup sizeGroup) {
		getSession().saveOrUpdate(sizeGroup);
		
	}

	public void delete(SizeGroup sizeGroup) {
		getSession().delete(sizeGroup);
		
	}
	
	private Session getSession(){
        return sessionFactory.getCurrentSession();
    }
	
	
}