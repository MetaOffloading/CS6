package com.sam.webtasks.client;

public class SessionInfo_IOtask1Demo {
	/*******************************************************/
	/* edit the settings below to configure the experiment */
	/*******************************************************/
		
	//are we just testing locally? set this to true if so and it won't try to log data to the database
	public static boolean localTesting=true;
	
	//what is the name for this experiment?
	public static String experimentCode="testExp";
	
	//which version of the experiment is this?
	public static int experimentVersion=1;
	
	//who is eligible to take part?
	//Names.ANYONE = anybody
	//Names.NEVERACCESSED = anyone who has not yet started the experiment
	//Names.NEVERCOMPLETED = anyone who has not yet completed the experiment,
	//i.e. you can start again as long as you didn't get to the very end	
	public static int eligibility=Names.ELIGIBILITY_NEVERCOMPLETED;
	
	//what factors do we need to counterbalance?
	//set up the names as follows:
	//counterbalanceFactors = {"factor1", "factor2", "factor3"}; 
	//set up the number of possible levels for each factor as follows
	//counterbalanceLevels = {2, 3, 2};
	//if you want to specify the level of any of those factors, set it with specifiedLevels. otherwise set to -1
	//e.g. specifiedLevels = {-1, 2, -1}; would randomise factors 1 and 3, and set the second factor to level 2
	//NB levels range from 0 to (maximum - 1)
	public static String[] counterbalanceFactors = {"phase1reminders"};
	public static int[] counterbalanceLevels = {3};
	public static int[] specifiedLevels = {-1};
	
	/*************************************************/
    /* no need to edit the settings below this point */
	/*************************************************/
	
	//participant info variables
	public static int gender;
	public static int age;
	public static String participantID;
	public static String sessionKey="";      //use this to store a random session key
	public static String rewardCode="";      //reward code to be revealed at end, in order to participant to claim paymen
}