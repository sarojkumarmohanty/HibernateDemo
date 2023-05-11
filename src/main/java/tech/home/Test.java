package tech.home;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import tech.home.entity.DeptDemo;
import tech.home.entity.EmpDemo;
import tech.home.entity.Passport;

public class Test {

	public static void main(String[] args) {
		//select * from emp_demo;
		final String seQuery="SELECT employeeId,lastName FROM EmpDemo WHERE departmentId=?1 and salary > ?2";
		
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(EmpDemo.class).
							addAnnotatedClass(Passport.class).
							addAnnotatedClass(DeptDemo.class);		
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();		
		Session ses=sessionFactory.openSession();
		
		
//		EmpDemo e=ses.get(EmpDemo.class, 100);
//		System.out.println(e);
		
		DeptDemo d=ses.get(DeptDemo.class, 80);
		System.out.println(d);
		d.getEmpDemo().forEach(s->System.out.println(s));
		
//		EmpDemo e=ses.get(EmpDemo.class, 103);
//		Passport p=new Passport();
//		p.setPassportNo(1003);
//		p.setIssueDate(new Date());
//		p.setExpiryDate(new Date());
//		e.setPassport(p);
//		
//		Transaction tx = ses.beginTransaction();
//		ses.update(e);
//		tx.commit();
//		
//		
//		
//		
//		
//		
		
//		
//		Query<Object[]> query=ses.createQuery(seQuery);
//		query.setParameter(1, 40);
//		query.setParameter(2, 5000.00);
//		
////		List<EmpDemo> empList=query.list();
//		List<Object[]> empList=query.list();
//		for(Object[] x:empList)
//			System.out.println(x[0]+"  "+x[1]);
		
		
	}

}
