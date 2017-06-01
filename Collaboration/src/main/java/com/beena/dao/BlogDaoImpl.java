package com.beena.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beena.model.Blog;

@Repository("blogDao")
public class BlogDaoImpl implements BlogDao 
{
@Autowired
SessionFactory sessionFactory;

public void setSessionFactory(SessionFactory sessionFactory) {
   this.sessionFactory = sessionFactory;
}

public void addBlog(Blog blog) {
blog.setBstatus("New");
Session session=sessionFactory.openSession();
Transaction tx = session.beginTransaction();
session.saveOrUpdate(blog);
tx.commit();
}

public void updateBlog(Blog blog) {
Session session=sessionFactory.getCurrentSession();
session.saveOrUpdate(blog);
}

public void deleteBlog(Blog blog) {
Session session=sessionFactory.getCurrentSession();
session.delete(blog);
}

public Blog getBlogId(long blogId) {
Session session=sessionFactory.getCurrentSession();
Blog blog=(Blog)session.createQuery("from Blog where bid="+blogId).getSingleResult();
return blog;


}

@SuppressWarnings("unchecked")
public List<Blog> listBlogs() {
Session session=sessionFactory.getCurrentSession();
List<Blog> blogs=session.createQuery("from Blog").getResultList();
return blogs;

}

@SuppressWarnings("unchecked")
public List<Blog> listNewBlogs() {
Session session=sessionFactory.getCurrentSession();
List<Blog> blogs=session.createQuery("from Blog where bstatus='New'").getResultList();
return blogs;
}

}