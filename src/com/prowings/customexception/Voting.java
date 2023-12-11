package com.prowings.customexception;

public class Voting {
	

//		public void doVote(Voter voter)
//		{
//			if((voter.getAge() >= 18)&&(voter.getCountry().equalsIgnoreCase("INDIA")))
//				System.out.println("Eligible for Vote!!");
//			else
//				throw new InvalidAgeException("Voter is under age!!");
//		}

		public void doVote(Voter voter) 
		{
			if(voter.getAge() >= 18)
			{
				if(voter.getCountry().equalsIgnoreCase("INDIA"))
				System.out.println("Eligible for Vote!!");
				else
					throw new InvalidCitizenException("Voter is not from India!!");
			}
			else
				throw new InvalidAgeException("Voter is under age!!");
		}


	

}
