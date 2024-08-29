package userRegistrationTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import baseComponent.BaseClassForSubDomains;
import commonPages.BackToPlans;
import commonPages.BodyTypeYouWant;
import commonPages.ChooseBodyType;
import commonPages.ChoosePlan;
import commonPages.ChooseYourTargetZones;
import commonPages.ConsiderYourPerfectWeight;
import commonPages.ContinuePage;
import commonPages.CountrySelectionPage;
import commonPages.DiseaseClass;
import commonPages.EventDateSelection;
import commonPages.GenderSel;
import commonPages.GotIt;
import commonPages.HowActiveAreYou;
import commonPages.HowTallAreYou;
import commonPages.HowYouSpendYourDay;
import commonPages.LastHappyWithYourWeight;
import commonPages.MealPreparationEachDay;
import commonPages.Meat;
import commonPages.OneAndOnlyPlan;
import commonPages.OtherFoodItems;
import commonPages.PickYourDailyHabitsAndLifestylePreferences;
import commonPages.ShedSomeExtraWeight;
import commonPages.SpecialOccasions;
import commonPages.SummaryOfYourOverallWellness;
import commonPages.Veggies;
import commonPages.WantToAchieve;
import commonPages.WhatIsYourAge;
import commonPages.WhatIsYourCurrentWeight;
import commonPages.Your4WeekKetoDietingPlan;
import commonPages.YourKetoDietPlanIsReady;

public class SubDomainsTest extends BaseClassForSubDomains{
	CountrySelectionPage countryPage;
	GenderSel gender;
	ChooseBodyType type;
	BodyTypeYouWant desiredBody;
	WantToAchieve achieve;
	ContinuePage conti;
	ChooseYourTargetZones zone;
	LastHappyWithYourWeight happy;
	MealPreparationEachDay mealpreparation;
	Meat meat;
	Veggies veggies;
	OtherFoodItems foodItems;
	HowActiveAreYou activeAre;
	HowYouSpendYourDay yourDay;
	PickYourDailyHabitsAndLifestylePreferences answers;
	ShedSomeExtraWeight extraWeight;
	DiseaseClass disease;
	HowTallAreYou tall;
	WhatIsYourCurrentWeight currentWt;
	ConsiderYourPerfectWeight targetWeight;
	WhatIsYourAge age;
	SummaryOfYourOverallWellness wellness;
	SpecialOccasions occasions;
	EventDateSelection date;
	OneAndOnlyPlan plan;
	Your4WeekKetoDietingPlan week;
	YourKetoDietPlanIsReady planReady;
	BackToPlans backPlans;
	GotIt gotit;
	ChoosePlan chooseplan;
	
	@Test(groups="country")
	public void usa() throws InterruptedException {
		countryPage=loginpage.getStarted();
		gender=countryPage.usa();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantBulk();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.meat();
		foodItems = veggies.veggies();
		activeAre = foodItems.non_veg();
		yourDay = activeAre.almostNoPhysicalActivity();
		answers = yourDay.atWorkplace();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.quitEatingSweets();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.vacation();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
		
	}
	@Test(groups="country")
	public void ca() throws InterruptedException {
		countryPage=loginpage.getStarted();
		gender=countryPage.ca();
		type= gender.genderWomen();
		desiredBody = type.choosebodyTypeVol();
		achieve = desiredBody.bodytypeYouWantCut();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegetarian();
		foodItems = veggies.veggies();
		activeAre = foodItems.veget();
		yourDay = activeAre.iOftenGoForWalk();
		answers = yourDay.iSpendPrettyMuchTimeOnFoot();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.wedding();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
	}
	@Test(groups="country")
	public void uk() throws InterruptedException {
		countryPage=loginpage.getStarted();
		gender=countryPage.uk();
		type=gender.genderWomen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantBulk();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.meat();
		foodItems = veggies.veggies();
		activeAre = foodItems.non_veg();
		yourDay = activeAre.almostNoPhysicalActivity();
		answers = yourDay.atWorkplace();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.quitEatingSweets();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.disease();
		currentWt = tall.heightCm();
		targetWeight = currentWt.weightLbs();
		age = targetWeight.tarWeightLbs();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.Other();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
		
	}
	@Test(groups="country")
	public void aus() throws InterruptedException {
		countryPage=loginpage.getStarted();
		gender=countryPage.uk();
		type = gender.genderMen();
		desiredBody = type.choosebodyTypeAv();
		achieve = desiredBody.bodytypeYouWantCut();
		conti = achieve.wantToAchieve();
		zone = conti.continuePage();
		happy = zone.yourTargetZone();
		mealpreparation = happy.lastHappyWithYourWeight();
		meat = mealpreparation.mealPreparationEachDay();
		veggies = meat.vegetarian();
		foodItems = veggies.veggies();
		activeAre = foodItems.veget();
		yourDay = activeAre.iOftenGoForWalk();
		answers = yourDay.iSpendPrettyMuchTimeOnFoot();
		answers.qualitySleep();
		answers.atNight();
		answers.saltIntakeIsMore();
		answers.softDrinks();
		extraWeight = answers.continueButton();
		disease = extraWeight.justWant();
		tall=disease.noDisease();
		currentWt = tall.heightFeet();
		targetWeight = currentWt.weightKG();
		age = targetWeight.tarWeightKG();
		wellness = age.yourAge();
		occasions = wellness.overallWellness();
		date = occasions.Other();
		plan = date.skipThisQuestion();
		week = plan.oneAndOnlyPlan();
		week = plan.oneAndOnlyPlan();
		planReady = week.validEmail();
		backPlans = planReady.oneMonthPlan();
		gotit = backPlans.backToPlan();
		chooseplan = gotit.goIt();
		chooseplan.choosePlan();
		
	}
		
	

}
