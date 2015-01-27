app.factory(
	'locationsService',['Restangular',
		function(Restangular){
			var promise;
			var locationList;
			var queried = false;
			return {
				getLocations : function(){
					if(!queried || !promise){
						promise = Restangular.all("locations").getList().then(function(data){
							queried = true;
							locationList = data;
							return locationList;
						});
					}
					else{
						console.log("initialised")
					}
					return promise;
				}
				};
			}])
	.factory('firebaseService', ['$firebase',
		function($firebase){
			var fbURL = "https://resplendent-fire-842.firebaseio.com";
			var connection;
			var firebaseArray;
			var sync;
			return {
				add: function (tableName, data){
					connection = new Firebase(fbURL+"/"+tableName);
					sync = $firebase(connection);
					sync.$push(data).then(function(response) {
						console.log("Data save to " + tableName);
					});
				},
				getList: function(tableName){
					connection = new Firebase(fbURL+"/"+tableName);
					sync = $firebase(connection);
					firebaseArray =  sync.$asArray();
					listToReturn = firebaseArray;
					return listToReturn;
				},
				getByKey: function(tableName, key){
					sync = $firebase(new Firebase(fbURL+"/"+tableName));
					var locationTable = sync.$asArray();
					return locationTable.$getRecord(key);
				},
				update: function(tableName, data){
					console.log("asassa");
					connection = new Firebase(fbURL+"/"+tableName);//+"/"+data.$id);
					sync = $firebase(connection);
					var list = sync.$asArray();
					return list.$loaded().then(
						function(){
							console.log(data.name);
							list.$save(data);
							console.log(list);
						}
					);

				}
			}
		}]);
	