import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import good.dao.GoodDAO;
import good.dao.GoodMapper;
import good.domain.Good;

//스프링 테스트 클래스를 생성하기 위한 어노테이션
@RunWith(SpringJUnit4ClassRunner.class)
//스프링 설정 파일이나 클래스를 실행하도록 해주는 어노테이션 
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class SampleTesting {
	@Autowired
	private GoodMapper goodDao;
	
	@Test
	public void daoTest() {
		/*
		System.out.println(goodDao.codeSearch(1));
		System.out.println(goodDao.codeSearch(7));
		*/
		
		/*
		Good good = new Good();
		good.setCode(7);
		good.setName("배");
		good.setManufacture("전남 나주");
		good.setPrice(7000);
		*/
		
		int r = goodDao.deleteGood(7);
		//삽입 및 삭제 갱신은 반드시 결과만 확인하지 말고
		//데이터베이스도 확인
		System.out.println(r);
		
		
	}
	
	
}
