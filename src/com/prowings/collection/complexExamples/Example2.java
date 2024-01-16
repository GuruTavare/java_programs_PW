package com.prowings.collection.complexExamples;

import java.util.*;

public class Example2 {

	public static void main(String[] args) {

		Map<String, HashSet<Long>> contactDetails = new HashMap<>();

		HashSet<Long> ramsPhoneNumbers = new HashSet<>();
		ramsPhoneNumbers.add(111122224444l);
		ramsPhoneNumbers.add(555566668888l);
		ramsPhoneNumbers.add(999977773333l);

		HashSet<Long> shamsPhoneNumbers = new HashSet<>();
		shamsPhoneNumbers.add(12121212l);
		shamsPhoneNumbers.add(23232323l);
		shamsPhoneNumbers.add(45454545l);

		contactDetails.put("Ram", ramsPhoneNumbers);
		contactDetails.put("Sham", shamsPhoneNumbers);

		Long mobileNum = 23232323l;
		searchContactNameByMobile(mobileNum, contactDetails);

	}

	public static void searchContactNameByMobile(Long mobileNum, Map<String, HashSet<Long>> contactDetails) {

		Iterator<Map.Entry<String, HashSet<Long>>> itr = contactDetails.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, HashSet<Long>> s = itr.next();
			// System.out.println(s.getKey()+" "+s.getValue());
			for (Long h : s.getValue()) {
				// System.out.println(h);
				if (h.equals(mobileNum))
					System.out.println("Mobile number is: " + mobileNum + " And number belongs to: " + s.getKey());
			}
		}

	}

}
