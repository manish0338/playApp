var app = angular.module("LoginApp",[]);

app.controller("loginController",function($scope,$http){
	console.log("in ctrl");

	$scope.login = function(){
		var userdata = {
			username:$scope.username,
			password:$scope.password
		};
		console.log(userdata);
		$http.post("/login",userdata);
	};
});
