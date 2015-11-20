/**
 *	Warehouse Bin Management System 
 */


var warehouseApp = angular.module("warehouseApp", ["ngRoute"]);


warehouseApp.config(function($routeProvider){
	$routeProvider
	.when("/", {
		templateUrl : "pages/home.html",
		controller : "homeController"
	})
	.when("/inquiry", {
		templateUrl : "pages/inquiry.html",
		controller : "inquiryController"
	})
	.when("/webservices", {
		templateUrl : "pages/webservices.html",
		controller : "webservicesController"
	})
	.when("/configuration", {
		templateUrl : "pages/configuration.html",
		controller : "configurationController"
	})
	.otherwise({
		redirectTo : "/"
	});
});

warehouseApp.controller("homeController", function($scope){
	
	$scope.locations = [{pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"},
	                    {pickLocation : "A0001", partNumber : "HX0001", pickType : "A", zone : "A", weight : "100.23", fillPercent : "75"}];
});

warehouseApp.controller("inquiryController", function($scope){
	
});

warehouseApp.controller("webservicesController", function($scope){
	
});

warehouseApp.controller("configurationController", function($scope){
	
});

$(document).ready(function(){
	$("a[href='#/home']").click(function(){
		$("a[href='#/home']").parent().addClass("active");
		$("a[href='#/webservices']").parent().removeClass("active");
		$("a[href='#/inquiry']").parent().removeClass("active");
		$("a[href='#/configuration']").parent().removeClass("active");
	});
	
	$("a[href='#/inquiry']").click(function(){
		$("a[href='#/home']").parent().removeClass("active");
		$("a[href='#/webservices']").parent().removeClass("active");
		$("a[href='#/inquiry']").parent().addClass("active");
		$("a[href='#/configuration']").parent().removeClass("active");
	});
	
	$("a[href='#/webservices']").click(function(){
		$("a[href='#/home']").parent().removeClass("active");
		$("a[href='#/webservices']").parent().addClass("active");
		$("a[href='#/inquiry']").parent().removeClass("active");
		$("a[href='#/configuration']").parent().removeClass("active");
	});
	
	$("a[href='#/configuration']").click(function(){
		$("a[href='#/home']").parent().removeClass("active");
		$("a[href='#/webservices']").parent().removeClass("active");
		$("a[href='#/inquiry']").parent().removeClass("active");
		$("a[href='#/configuration']").parent().addClass("active");
	});
});
