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
			var fbService = this;
			return {
				add: function (tableName, data){
					connection = new Firebase(fbURL+"/"+tableName);
					sync = $firebase(connection);
					return sync.$push(data);
				},
				getList: function(tableName){
					connection = new Firebase(fbURL+"/"+tableName);
					sync = $firebase(connection);
					firebaseArray =  sync.$asArray();
					listToReturn = firebaseArray;
					return listToReturn;
				},
				getByKey: function(tableName, key, callback){
					sync = $firebase(new Firebase(fbURL+"/"+tableName+"/"+key));
					var record = sync.$asObject();
					record.$loaded().then(function(){
						callback(record);
					})
					//return syncArray.$getRecord(key);
				},
				update: function(tableName, data){
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

				},
				setDb: function(dbUrl){
					fbURL = dbUrl;
					return fbService;
				}
			}
		}]);
	