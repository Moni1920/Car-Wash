package com.carwash.userservice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.carwash.userservice.controllers.LoginController;
import com.carwash.userservice.models.Cardetails;
import com.carwash.userservice.models.Rating;
import com.carwash.userservice.models.User;
import com.carwash.userservice.repository.CardetailsRepo;
import com.carwash.userservice.repository.Ratingrepo;
import com.carwash.userservice.repository.UserRepo;
import com.carwash.userservice.services.CardetailService;
import com.carwash.userservice.services.RatingService;
import com.carwash.userservice.services.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private CardetailService serve;
	
	@Autowired
	 private UserService serv;

	@MockBean
	private CardetailsRepo repo;
	
	@MockBean
	private UserRepo repoo;
	

	@Autowired
	private Ratingrepo  rc;
	
	@Autowired
	 private RatingService rs;
	

	
	@Test
	public void getCardetailsTest() {
		when(repo.findAll()).thenReturn(Stream
				.of(new Cardetails("1", "moni123@gmail.com", 766543223, "Honda","Mangalore","Water Wash","2020-09-13",
						"09:30","clean water wash"), new Cardetails("2", "monica123@gmail.com", 766543223, "swift","bangalore","Water Wash","2020-09-13",
								"09:50","clean water  wax wash")).collect(Collectors.toList()));
		assertEquals(2, serve.getdetails().size());
	}

	
	@Test
	public void saveCardetailsTest() {
		Cardetails user = new Cardetails("9", "anhu123@gmail.com", 766543223, "Honda","Mangalore","Water Wash","2020-09-13",
				"09:30","clean water wash");
		when(repo.save(user)).thenReturn(user);
		assertEquals(user, serve.adddetails(user));
	}

	@Test
	public void getUsersTest() {
		when(repoo.findAll()).thenReturn(Stream
				.of(new User( "1","moni123@gmail.com","moni","nisha"
						), new User("2","vani123@gmail.com","vani","arjun")).collect(Collectors.toList()));
		assertEquals(2, serv.getusers().size());
	}

	
	@Test
	public void saveUserTest() {
		LoginController login=new LoginController();
		User user = new User(
				"1","moni123@gmail.com","moni","nisha");
		boolean res=serv.adduser(user);
		assertEquals(true, res);
	}
	
	
	@Test
	public void getRatingTest() {
		when(rc.findAll()).thenReturn(Stream
				.of(new Rating("1", 3,"Excellent"), new Rating("2", 4,"good")).collect(Collectors.toList()));
		assertEquals(2, rs.allrate().size());
	}

	
	@Test
	public void saveRatingTest() {
		Rating user = new Rating("9", 4,"good work");
		when(rc.save(user)).thenReturn(user);
		assertEquals(user, rs.addrate(user));
	}
	
	
//	@Test
//	public void saveUseTest() {
//		LoginController login=new LoginController();
//		User user = new User(
//				null,null,null,null);
//		boolean res=serv.adduser(user);
//		assertEquals(true, res);
//	}
	
}
