package binbin.hyunbin;

import binbin.hyunbin.model.Info;
import binbin.hyunbin.service.InfoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HyunbinApplicationTests {

	@Autowired
	InfoService infoService;

	@Test
	void contextLoads() {
	}

//	@Test
//	void nameTest(){
//		Info info = infoDao.selectInfo();
//		System.out.println(info);
//	}

	@Test
	@DisplayName("조회")
	void test() {
		Info name = infoService.getName(1);
		System.out.println("name = " + name.toString());
	}
}
