package com.sparklink.awselasticbeanstalk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/rest-api-aws-elastic-beanstalk")
@RequestMapping(value = {"${rest.request.mapping.rest-api-aws-elastic-beanstalk}"})
public class AWSElasticBeanstalkController {

	//@GetMapping("/getAWSEmployeeServicesEBDeployments")
	@GetMapping("${rest.get.mapping.getAWSElasticBeanstalkDeployments}")
	public String getAWSElasticBeanstalkDeployments() {
		return "AWS - Elastic Beanstalk Example !!!";
	}

}
