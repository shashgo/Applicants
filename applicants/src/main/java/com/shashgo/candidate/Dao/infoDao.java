package com.shashgo.candidate.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.shashgo.candidate.Entity.Info;

@Component
public class infoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addInfo(Info info){
		System.out.println("In infoDao" + info);

		Session session=sessionFactory.getCurrentSession();
		session.save(info);
	}
}
