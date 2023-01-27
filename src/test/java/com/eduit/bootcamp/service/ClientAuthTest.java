package com.eduit.bootcamp.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class ClientAuthTest {

	private ClientAuth clientAuth;
	private ClientService clientService;
	
	
	@Before
	public void setUp() {
		clientService = mock(ClientService.class);
		clientAuth = new ClientAuth(clientService, "");
	}
	
	@After
	public void tearDown() {
		clientService = null;
	}
	
	@Test
	public void test_authenticate_validOK() {
		String name = "A";
		when(clientService.getClients(name)).thenReturn("A");
		boolean isAuth = clientAuth.authenticate(name);
		assertThat(isAuth, is(true));
	}

	@Test
	public void test_authenticate_invalidOK() {
		String name = "A";
		when(clientService.getClients(name)).thenReturn(null);
		boolean isAuth = clientAuth.authenticate(name);
		assertThat(isAuth, is(false));
	}
	
}
