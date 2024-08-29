package stepDefenations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import baseComponent.BaseClass;
import commonPages.BackToPlans;
import commonPages.BodyTypeYouWant;
import commonPages.ChooseBodyType;
import commonPages.ChoosePlan;
import commonPages.ChooseYourTargetZones;
import commonPages.ConsiderYourPerfectWeight;
import commonPages.ContinuePage;
import commonPages.DiseaseClass;
import commonPages.GenderSel;
import commonPages.GotIt;
import commonPages.HowActiveAreYou;
import commonPages.HowTallAreYou;
import commonPages.HowYouSpendYourDay;
import commonPages.PickYourDailyHabitsAndLifestylePreferences;
import commonPages.LandingPage;
import commonPages.LastHappyWithYourWeight;
import commonPages.MealPreparationEachDay;
import commonPages.Meat;
import commonPages.OneAndOnlyPlan;
import commonPages.OtherFoodItems;
import commonPages.ShedSomeExtraWeight;
import commonPages.SpecialOccasions;
import commonPages.SummaryOfYourOverallWellness;
import commonPages.Veggies;
import commonPages.WantToAchieve;
import commonPages.WhatIsYourAge;
import commonPages.WhatIsYourCurrentWeight;
import commonPages.Your4WeekKetoDietingPlan;
import commonPages.YourKetoDietPlanIsReady;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsUserRegistration extends BaseClass {
	WebDriver driver;

	LandingPage page;
	GenderSel gender;
	ChooseBodyType type;
	BodyTypeYouWant bodyType;
	WantToAchieve achieve;
	ContinuePage contin;
	ChooseYourTargetZones zone;
	LastHappyWithYourWeight happy;
	MealPreparationEachDay mealPrep;
	Meat meat;
	Veggies veggi;
	OtherFoodItems otherFood;
	HowActiveAreYou active;
	HowYouSpendYourDay day;
	PickYourDailyHabitsAndLifestylePreferences multi;
	ShedSomeExtraWeight extraWeight;
	DiseaseClass disease;
	HowTallAreYou tall;
	WhatIsYourCurrentWeight currentWeight;
	ConsiderYourPerfectWeight perfectWeight;
	WhatIsYourAge age;
	SummaryOfYourOverallWellness wellness;
	SpecialOccasions occassion;
	OneAndOnlyPlan plan;
	Your4WeekKetoDietingPlan dietingPlan;
	YourKetoDietPlanIsReady dietPlan;
	BackToPlans backPlan;
	GotIt gotit;
	ChoosePlan choosePlan;

	@BeforeMethod
	public void driverSetUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		// option.addArguments("--headless");
		driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ketobalanced.com/");
		page = new LandingPage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Given(value = "User goes to Landing page")
	public void Landing_Page() throws InterruptedException {
		gender = page.landingPage();
	}

	@Then(value = "User navigated to gender page and select men")
	public void userMen() {
		type = gender.genderMen();
	}

	@Then(value = "User choose current body type")
	public void userCurrentbodytype() {
		bodyType = type.choosebodyTypeEx();

	}

	@Then(value = "User choose body type he want")
	public void desiredbodytype() {
		achieve = bodyType.bodytypeYouWantFit();
	}

	@Then(value = "User want to achieve")
	public void wantToAchieve() {
		contin = achieve.wantToAchieve();
	}

	@Then(value = "User choose target zone")
	public void targetZone() {
		zone = contin.continuePage();
		happy = zone.yourTargetZone();
	}

	@Then(value = "User choose when he was last happy with his weight")
	public void lastHappyWithWeight() {
		mealPrep = happy.lastHappyWithYourWeight();
	}

	@Then(value = "User choose how much he has time for meal prepartaion")
	public void timeForMealPreparation() {
		meat = mealPrep.mealPreparationEachDay();
	}

	@Then(value = "User navigated to meal preferences and choose meat")
	public void mealPreference() throws InterruptedException {
		veggi = meat.meat();
	}

	@And(value = "User also chooses some veggies")
	public void veggiesPreference() {
		otherFood = veggi.veggies();
	}

	@And(value = "User also prefers some other food items as non veg")
	public void otherFoodItems() {
		active = otherFood.non_veg();
	}

	@Then(value = "User select how active he is as no physical activity")
	public void user_select_how_active_he_is_no_physical() {
		day = active.almostNoPhysicalActivity();
	}

	@And(value = "User select his day at workplace")
	public void user_select_his_day_at_workplace() {
		multi = day.atWorkplace();
	}

	@Then(value = "User select multiple answer")
	public void User_select_multiple_answer() throws InterruptedException {
		multi.qualitySleep();
		multi.quitEatingSweets();
		multi.saltIntakeIsMore();
		multi.softDrinks();
		extraWeight = multi.continueButton();
	}

	@And(value = "User  select  Just Want to See how Keto Diet helps in weight loss.")
	public void User_select_Just_Want_to_See_how_Keto_Diet_helps_in_weight_loss() {
		disease = extraWeight.asPossible();
		tall=disease.noDisease();
	}

	@Then(value = "User enters the height in feet and inch without faker")
	public void user_Enters_the_height() {
		currentWeight = tall.withoutFakerheightFeet();
	}

	@And(value = "User enters the weight in lbs without faker")
	public void user_enters_weight_lbs() {
		perfectWeight = currentWeight.withoutFakerweightLbs();
	}

	@Then(value = "User enters perfect weight he wants in lbs without faker")
	public void user_enters_perfect_weight() {
		age = perfectWeight.withoutFakertarWeightLbs();
	}

	@And(value = "User enters his age without faker")
	public void user_enters_his_weight() {
		wellness = age.withoutFakeryourAge();
	}

	@Then(value = "User sees his overall wellness")
	public void User_sees_his_overall_wellness() {
		occassion = wellness.overallWellness();
	}

	@And(value = "User choose no event")
	public void User_choose_no_event() {
		plan = occassion.No();
	}

	@Then(value = "User goes one and only plan")
	public void User_goes_one_and_only_plan() {
		dietingPlan = plan.oneAndOnlyPlan();
	}

	@And(value = "User goes four week dieting chart")
	public void user_goes_four_week_dieting_chart() {
		dietPlan = dietingPlan.validEmail();
	}

	@Then(value = "User entrs mail")
	public void User_enters_mail_without_fakr() {
		dietPlan = dietingPlan.blankEmail();
	}

	@And(value = "User goes on diet plan page")
	public void User_goes_on_diet_plan_page() {
		backPlan = dietPlan.oneMonthPlan();
	}

	@Then(value = "User goes back to plan")
	public void User_goes_back_to_plan() {
		gotit = backPlan.backToPlan();
	}

	@And(value = "User click on got it")
	public void user_click_on_got_it() {
		choosePlan = gotit.goIt();
	}

	@Then(value = "User click on Choose Plan button")
	public void user_click_on_chhose_plan_button() throws InterruptedException {
		choosePlan.choosePlan();
	}

	@Then(value = "User navigated to gender page and select women")
	public void gender_page_and_select_women() {
		type = gender.genderWomen();
	}

	@Then("User choose current body type as extra")
	public void user_choose_current_body_type_as_extra() {
		bodyType = type.choosebodyTypeVol();
	}

	@Then("User navigated to meal preferences and choose vegetarian")
	public void user_navigated_to_meal_preferences_and_choose_vegetarian() throws InterruptedException {
		veggi = meat.vegetarian();
	}

	@Then("User also prefers some other food items as vegetarian")
	public void user_also_prefers_some_other_food_items_as_vegetarian() throws InterruptedException {
		active = otherFood.veget();
	}

	@Then("User enters the height in cm witoutfaker")
	public void user_enters_the_height_in_cm_witoutfaker() {
		currentWeight = tall.withoutFakerheightCm();
	}

	@Then("User enters the weight in kg without faker")
	public void user_enters_the_weight_in_kg_without_faker() {
		perfectWeight = currentWeight.withoutFakeeweightKG();
	}

	@Then("User enters perfect weight he wants in kg without faker")
	public void user_enters_perfect_weight_he_wants_in_kg_without_faker() {
		age = perfectWeight.withoutFakertarWeightKG();
	}
}
