/**
 *	Warehouse Bin Management System 
 */

var warehouseApp = angular.module("warehouseApp", ["ngRoute"]);


warehouseApp.config(function($routeProvider){
	$routeProvider
	.when("/", {
		templateUrl : "/warehouseBinSensorDataService/pages/home.html",
		controller : "homeController"
	})
	.when("/inquiry", {
		templateUrl : "/warehouseBinSensorDataService/pages/inquiry.html",
		controller : "inquiryController"
	})
	.when("/webservice", {
		templateUrl : "/warehouseBinSensorDataService/pages/webservices.html",
		controller : "webservicesController"
	})
	.when("/configuration", {
		templateUrl : "/warehouseBinSensorDataService/pages/configuration.html",
		controller : "configurationController"
	})
});

warehouseApp.controller("homeController", function($scope){
	
});

warehouseApp.controller("inquiryController", function($scope){
	
});

warehouseApp.controller("webservicesController", function($scope){
	
});

warehouseApp.controller("configurationController", function($scope){
	
});

/*
$(document).ready(function(){
	$("#binDiv").show();
	$("#inquiryDiv").hide();
	$("#webservicesDiv").hide();
	$("#configurationDiv").hide();
	

	$('a.appHome').click(function(){
		
		$(this).parent().addClass("active");
		$('a.appInquiry').parent().removeClass("active");
		$('a.appWebservices').parent().removeClass("active");
		$('a.appConfiguration').parent().removeClass("active");
		
		$("#binDiv").show();
		$("#inquiryDiv").hide();
		$("#webservicesDiv").hide();
		$("#configurationDiv").hide();
	});

	$('a.appInquiry').click(function(){
		
		$(this).parent().addClass("active");
		$('a.appHome').parent().removeClass("active");
		$('a.appWebservices').parent().removeClass("active");
		$('a.appConfiguration').parent().removeClass("active");
		
		$("#binDiv").hide();
		$("#inquiryDiv").show();
		$("#webservicesDiv").hide();
		$("#configurationDiv").hide();
	});

	$('a.appWebservices').click(function(){
		
		$(this).parent().addClass("active");
		$('a.appHome').parent().removeClass("active");
		$('a.appInquiry').parent().removeClass("active");
		$('a.appConfiguration').parent().removeClass("active");
		
		$("#binDiv").hide();
		$("#inquiryDiv").hide();
		$("#webservicesDiv").show();
		$("#configurationDiv").hide();
	});
	
	$('a.appConfiguration').click(function(){
		
		$(this).parent().addClass("active");
		$('a.appHome').parent().removeClass("active");
		$('a.appInquiry').parent().removeClass("active");
		$('a.appWebservices').parent().removeClass("active");
		
		$("#binDiv").hide();
		$("#inquiryDiv").hide();
		$("#webservicesDiv").hide();
		$("#configurationDiv").show();
	});

});*/