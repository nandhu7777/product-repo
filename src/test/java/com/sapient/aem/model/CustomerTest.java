package com.sapient.aem.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

		private Customer customer=null;
		@BeforeEach
		void setUp() throws Exception {
			customer= new Customer(1,"smith",LocalDate.parse("1990-10-12"),"Hyderabad","smith@gmail.com",7687125490L);
		}

		@AfterEach
		void tearDown() throws Exception {
			customer=null;
		}
		@Test
		void testSetCustomerId() {
		customer.setCustomerid(1);
		assertEquals(1,customer.getCustomerid());
		}

		@Test
		void testInvalidSetCustomerId() {
			customer.setCustomerid(1);
		assertNotEquals(10,customer.getCustomerid());
		}
		@Test
		void testGetCustomerId() {
			assertEquals(1,customer.getCustomerid(),"testing customerId");
		}
		@Test
		void testInvalidGetCustomerId() {
			assertNotEquals(10,customer.getCustomerid(),"testing customerId");
		}
		@Test
		void testSetName() {
			customer.setCustomername("smith");
		assertEquals("smith",customer.getCustomername());
		}
		@Test
		void testInvalidSetName() {
			customer.setCustomername("neha");
		assertNotEquals("smith",customer.getCustomername());
		}
		@Test
		void testGetName() {
			assertEquals("smith",customer.getCustomername(),"testing name");
		}
		@Test
		void testInvalidGetName() {
			assertNotEquals("neha",customer.getCustomername(),"testing name");
		}
		@Test
		void testSetBirthdate() {
			customer.setBirthdate(LocalDate.parse("1990-10-12"));
		assertEquals(LocalDate.parse("1990-10-12"),customer.getBirthdate());
		}
		@Test
		void testInvalidSetBirthdate() {
			customer.setBirthdate(LocalDate.parse("1997-08-11"));
		assertNotEquals(LocalDate.parse("1990-10-12"),customer.getBirthdate());
		}
		@Test
		void testGetBirthdate() {
			assertEquals(LocalDate.parse("1990-10-12"),customer.getBirthdate(),"testing birthdate");
		}
		@Test
		void testInvalidGetBirthdate() {
			assertNotEquals(LocalDate.parse("1997-08-11"),customer.getBirthdate(),"testing birthdate");
		}
		@Test
		void testSetAddress() {
			customer.setAddress("Hyderabad");
		assertEquals("Hyderabad",customer.getAddress());
		}
		@Test
		void testInvalidSetAddress() {
			customer.setAddress("Chenni");
		assertNotEquals("Hyderabad",customer.getAddress());
		}
		@Test
		void testGetAddress() {
			assertEquals("Hyderabad",customer.getAddress(),"testing address");
		}
		@Test
		void testInvalidGetAddress() {
			assertNotEquals("chenni",customer.getAddress(),"testing address");
		}
		@Test
		void testSetEmail() {
			customer.setEmail("smith@gmail.com");
		assertEquals("smith@gmail.com",customer.getEmail());
		}
		@Test
		void testInvalidSetEmail() {
			customer.setEmail("megha@gmail.com");
		assertNotEquals("smith@gmail.com",customer.getEmail());
		}
		@Test
		void testGetEmail() {
			assertEquals("smith@gmail.com",customer.getEmail(),"testing email");
		}
		@Test
		void testInvalidGetEmail() {
			assertNotEquals("megha@pgmail.com",customer.getEmail(),"testing email");
		}
		@Test
		void testSetMobile() {
			customer.setMobile(7687125490L);
		assertEquals(7687125490L,customer.getMobile());
		}
		@Test
		void testInvalidSetMobile() {
			customer.setMobile(7687125490L);
		assertNotEquals(972456342L,customer.getMobile());
		}
		@Test
		void testGetMobile() {
			assertEquals(7687125490L,customer.getMobile(),"testing mobile");
		}
		@Test
		void testInvalidGetMobile() {
			assertNotEquals(972456342L,customer.getMobile(),"testing mobile");
		}
		
		
	}