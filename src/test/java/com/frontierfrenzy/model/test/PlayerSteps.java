package com.frontierfrenzy.model.test;

import org.junit.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.frontierfrenzy.model.Account;
import com.frontierfrenzy.model.Player;

public class PlayerSteps {

	private Player player;
	private Account account;

	@Given("a player with email address $email")
	public void aPlayer(String email) {
		player = new Player(email);
	}

	@When("he creates an account")
	public void createNewAccount() {
		account = new Account(player);
	}

	@Then("a new account is created")
	public void checkAccount() {
		// Don't do anything for now
		Assert.fail();
	}

}
