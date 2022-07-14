package com.vp.schoolmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
	@RequestMapping("/")
	public List<Integer> hello() {
		List<Integer> cars = new ArrayList<>();
		Integer nexa = 1;
		cars.add(2);
		cars.add(3);
		cars.add(nexa);
		List<Integer> latestCars = cars.stream().filter(r -> r.equals(nexa)).collect(Collectors.toList());

		return latestCars;

	}
}
