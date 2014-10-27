// @SOURCE:C:/Users/Yishai/git/btdt/conf/routes
// @HASH:49aa7fa377abf2bc56f959ba66125146c465cbee
// @DATE:Tue Oct 21 17:48:39 IDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:11
// @LINE:8
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {


// @LINE:15
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
class ReverseActivityController {


// @LINE:38
def updateActivity(): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "activity")
}
                        

// @LINE:40
def getActivity(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "activity/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:41
def deleteActivity(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "activity/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:37
def insertActivity(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "activity")
}
                        

// @LINE:39
def getAllActivities(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "activities")
}
                        

}
                          

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseLocationController {


// @LINE:34
def deleteLocation(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "location/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:31
def getLocationsByName(name:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "location/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

// @LINE:29
def updateLocation(): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "location")
}
                        

// @LINE:33
def getLocation(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "location/id/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:35
def generateLocationCode(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "location/updatecode/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:28
def insertLocation(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "location")
}
                        

// @LINE:32
def getLocationByCode(code:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "location/code/" + implicitly[PathBindable[String]].unbind("code", dynamicString(code)))
}
                        

// @LINE:30
def getAllLocations(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "locations")
}
                        

}
                          

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseMemberController {


// @LINE:20
def getAllMembers(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "members")
}
                        

// @LINE:21
def getMemberByEmail(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "member/email/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:23
def deleteMember(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "members/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:19
def updateMember(): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "member")
}
                        

// @LINE:18
def insertMember(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "member")
}
                        

// @LINE:22
def getMemberById(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "member/id/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:24
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "member/login")
}
                        

}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseActivityTypeController {


// @LINE:45
def updateActivityType(): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "activityType")
}
                        

// @LINE:47
def getActivityType(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "activityType/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:44
def insertActivityType(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "activityType")
}
                        

// @LINE:46
def getAllActivityTypes(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "activityTypes")
}
                        

// @LINE:48
def activateActivityType(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "activityType/" + implicitly[PathBindable[Integer]].unbind("id", id) + "/activate")
}
                        

// @LINE:49
def inactivateActivityType(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "activityType/" + implicitly[PathBindable[Integer]].unbind("id", id) + "/inactivate")
}
                        

}
                          

// @LINE:11
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:11
def newPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                        

// @LINE:8
def preflight(path:String): Call = {
   import ReverseRouteContext.empty
   Call("OPTIONS", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("path", path))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:11
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:15
class ReverseAssets {


// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
class ReverseActivityController {


// @LINE:38
def updateActivity : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ActivityController.updateActivity",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "activity"})
      }
   """
)
                        

// @LINE:40
def getActivity : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ActivityController.getActivity",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activity/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:41
def deleteActivity : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ActivityController.deleteActivity",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "activity/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:37
def insertActivity : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ActivityController.insertActivity",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "activity"})
      }
   """
)
                        

// @LINE:39
def getAllActivities : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ActivityController.getAllActivities",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activities"})
      }
   """
)
                        

}
              

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseLocationController {


// @LINE:34
def deleteLocation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LocationController.deleteLocation",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "location/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:31
def getLocationsByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LocationController.getLocationsByName",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "location/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:29
def updateLocation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LocationController.updateLocation",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "location"})
      }
   """
)
                        

// @LINE:33
def getLocation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LocationController.getLocation",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "location/id/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:35
def generateLocationCode : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LocationController.generateLocationCode",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "location/updatecode/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:28
def insertLocation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LocationController.insertLocation",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "location"})
      }
   """
)
                        

// @LINE:32
def getLocationByCode : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LocationController.getLocationByCode",
   """
      function(code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "location/code/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code))})
      }
   """
)
                        

// @LINE:30
def getAllLocations : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.LocationController.getAllLocations",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "locations"})
      }
   """
)
                        

}
              

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseMemberController {


// @LINE:20
def getAllMembers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MemberController.getAllMembers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "members"})
      }
   """
)
                        

// @LINE:21
def getMemberByEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MemberController.getMemberByEmail",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "member/email/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:23
def deleteMember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MemberController.deleteMember",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "members/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:19
def updateMember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MemberController.updateMember",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "member"})
      }
   """
)
                        

// @LINE:18
def insertMember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MemberController.insertMember",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "member"})
      }
   """
)
                        

// @LINE:22
def getMemberById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MemberController.getMemberById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "member/id/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:24
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MemberController.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "member/login"})
      }
   """
)
                        

}
              

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseActivityTypeController {


// @LINE:45
def updateActivityType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ActivityTypeController.updateActivityType",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "activityType"})
      }
   """
)
                        

// @LINE:47
def getActivityType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ActivityTypeController.getActivityType",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activityType/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:44
def insertActivityType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ActivityTypeController.insertActivityType",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "activityType"})
      }
   """
)
                        

// @LINE:46
def getAllActivityTypes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ActivityTypeController.getAllActivityTypes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activityTypes"})
      }
   """
)
                        

// @LINE:48
def activateActivityType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ActivityTypeController.activateActivityType",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activityType/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id) + "/activate"})
      }
   """
)
                        

// @LINE:49
def inactivateActivityType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ActivityTypeController.inactivateActivityType",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activityType/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id) + "/inactivate"})
      }
   """
)
                        

}
              

// @LINE:11
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:11
def newPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        

// @LINE:8
def preflight : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.preflight",
   """
      function(path) {
      return _wA({method:"OPTIONS", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path)})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:11
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {


// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
class ReverseActivityController {


// @LINE:38
def updateActivity(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ActivityController.updateActivity(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityController", "updateActivity", Seq(), "PUT", """""", _prefix + """activity""")
)
                      

// @LINE:40
def getActivity(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ActivityController.getActivity(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityController", "getActivity", Seq(classOf[Integer]), "GET", """""", _prefix + """activity/$id<[^/]+>""")
)
                      

// @LINE:41
def deleteActivity(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ActivityController.deleteActivity(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityController", "deleteActivity", Seq(classOf[Integer]), "DELETE", """""", _prefix + """activity/$id<[^/]+>""")
)
                      

// @LINE:37
def insertActivity(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ActivityController.insertActivity(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityController", "insertActivity", Seq(), "POST", """""", _prefix + """activity""")
)
                      

// @LINE:39
def getAllActivities(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ActivityController.getAllActivities(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityController", "getAllActivities", Seq(), "GET", """""", _prefix + """activities""")
)
                      

}
                          

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseLocationController {


// @LINE:34
def deleteLocation(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LocationController.deleteLocation(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "deleteLocation", Seq(classOf[Integer]), "DELETE", """""", _prefix + """location/$id<[^/]+>""")
)
                      

// @LINE:31
def getLocationsByName(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LocationController.getLocationsByName(name), HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "getLocationsByName", Seq(classOf[String]), "GET", """""", _prefix + """location/name/$name<[^/]+>""")
)
                      

// @LINE:29
def updateLocation(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LocationController.updateLocation(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "updateLocation", Seq(), "PUT", """""", _prefix + """location""")
)
                      

// @LINE:33
def getLocation(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LocationController.getLocation(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "getLocation", Seq(classOf[Integer]), "GET", """""", _prefix + """location/id/$id<[^/]+>""")
)
                      

// @LINE:35
def generateLocationCode(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LocationController.generateLocationCode(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "generateLocationCode", Seq(classOf[Integer]), "GET", """""", _prefix + """location/updatecode/$id<[^/]+>""")
)
                      

// @LINE:28
def insertLocation(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LocationController.insertLocation(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "insertLocation", Seq(), "POST", """""", _prefix + """location""")
)
                      

// @LINE:32
def getLocationByCode(code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LocationController.getLocationByCode(code), HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "getLocationByCode", Seq(classOf[String]), "GET", """""", _prefix + """location/code/$code<[^/]+>""")
)
                      

// @LINE:30
def getAllLocations(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.LocationController.getAllLocations(), HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "getAllLocations", Seq(), "GET", """""", _prefix + """locations""")
)
                      

}
                          

// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseMemberController {


// @LINE:20
def getAllMembers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MemberController.getAllMembers(), HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "getAllMembers", Seq(), "GET", """""", _prefix + """members""")
)
                      

// @LINE:21
def getMemberByEmail(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MemberController.getMemberByEmail(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "getMemberByEmail", Seq(classOf[String]), "GET", """""", _prefix + """member/email/$email<[^/]+>""")
)
                      

// @LINE:23
def deleteMember(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MemberController.deleteMember(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "deleteMember", Seq(classOf[Integer]), "DELETE", """""", _prefix + """members/$id<[^/]+>""")
)
                      

// @LINE:19
def updateMember(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MemberController.updateMember(), HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "updateMember", Seq(), "PUT", """""", _prefix + """member""")
)
                      

// @LINE:18
def insertMember(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MemberController.insertMember(), HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "insertMember", Seq(), "POST", """""", _prefix + """member""")
)
                      

// @LINE:22
def getMemberById(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MemberController.getMemberById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "getMemberById", Seq(classOf[Integer]), "GET", """""", _prefix + """member/id/$id<[^/]+>""")
)
                      

// @LINE:24
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MemberController.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "login", Seq(), "GET", """""", _prefix + """member/login""")
)
                      

}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseActivityTypeController {


// @LINE:45
def updateActivityType(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ActivityTypeController.updateActivityType(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "updateActivityType", Seq(), "PUT", """""", _prefix + """activityType""")
)
                      

// @LINE:47
def getActivityType(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ActivityTypeController.getActivityType(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "getActivityType", Seq(classOf[Integer]), "GET", """""", _prefix + """activityType/$id<[^/]+>""")
)
                      

// @LINE:44
def insertActivityType(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ActivityTypeController.insertActivityType(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "insertActivityType", Seq(), "POST", """""", _prefix + """activityType""")
)
                      

// @LINE:46
def getAllActivityTypes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ActivityTypeController.getAllActivityTypes(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "getAllActivityTypes", Seq(), "GET", """""", _prefix + """activityTypes""")
)
                      

// @LINE:48
def activateActivityType(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ActivityTypeController.activateActivityType(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "activateActivityType", Seq(classOf[Integer]), "GET", """""", _prefix + """activityType/$id<[^/]+>/activate""")
)
                      

// @LINE:49
def inactivateActivityType(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ActivityTypeController.inactivateActivityType(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "inactivateActivityType", Seq(classOf[Integer]), "GET", """""", _prefix + """activityType/$id<[^/]+>/inactivate""")
)
                      

}
                          

// @LINE:11
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:11
def newPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newPage", Seq(), "GET", """""", _prefix + """test""")
)
                      

// @LINE:8
def preflight(path:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.preflight(path), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "preflight", Seq(classOf[String]), "OPTIONS", """""", _prefix + """$path<.+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    