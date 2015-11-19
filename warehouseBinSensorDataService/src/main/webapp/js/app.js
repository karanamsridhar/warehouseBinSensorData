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
	.when("/webservices", {
		templateUrl : "/warehouseBinSensorDataService/pages/webservices.html",
		controller : "webservicesController"
	})
	.when("/configuration", {
		templateUrl : "/warehouseBinSensorDataService/pages/configuration.html",
		controller : "configurationController"
	})
	.otherwise({
		redirectTo : "/"
	});
});

warehouseApp.controller("homeController", function($scope){
	
	$scope.homeTabClicked
	
	$scope.locations = [{pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"}];
});

warehouseApp.controller("inquiryController", function($scope){
	
});

warehouseApp.controller("webservicesController", function($scope){
	
});

warehouseApp.controller("configurationController", function($scope){
	
});
