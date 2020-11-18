package com.carwash.washservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.carwash.washservice.controllers.WasherController;
import com.carwash.washservice.models.BookingInfo;
import com.carwash.washservice.models.Washerlogin;
import com.carwash.washservice.repo.BookingInfoRepo;
import com.carwash.washservice.repo.WasherRepo;
import com.carwash.washservice.services.BookingInfoService;
import com.carwash.washservice.services.WasherService;


@RunWith(SpringRunner.class)
@SpringBootTest
class WashServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private WasherService serve;
	
	@Autowired
	 private BookingInfoService serv;

	@MockBean
	private WasherRepo repo;
	
	@MockBean
	private BookingInfoRepo repoo;

	@Test
	public void getallinfoTest() {
		when(repoo.findAll()).thenReturn(Stream
				.of(new BookingInfo("1", "moni123@gmail.com", "arun", "Car sanit","23-12-2020",567,"pending"
						), new BookingInfo("2", "vikram123@gmail.com", "suman", "Car sanit","23-12-2020",567,"pending")).collect(Collectors.toList()));
		assertEquals(2, serv.allinfo().size());
	}

	
	@Test
	public void savebookinginfoTest() {
		BookingInfo user = new BookingInfo("7", "viki123@gmail.com", "suman", "Car sanit","23-12-2020",567,"pending");
		when(repoo.save(user)).thenReturn(user);
		assertEquals(user, serv.addinfo(user));
	}

	@Test
	public void getWasherTest() {
		when(repo.findAll()).thenReturn(Stream
				.of(new Washerlogin( "1","moni","arjun123@gmail.com","anil"
						), new Washerlogin("2","vani123@gmail.com","vani","arjun")).collect(Collectors.toList()));
		assertEquals(2, serve.getwasher().size());
	}

	
	@Test
	public void saveWasherTest() {
		WasherController login=new WasherController();
		Washerlogin user = new Washerlogin(
				"1","moni","nisha123@gmail.com","nisha");
		boolean res=serve.addwasher(user);
		assertEquals(true, res);
	}
	
	
	
}
