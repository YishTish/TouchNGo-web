// @SOURCE:C:/Users/Yishai/git/btdt/conf/routes
// @HASH:49aa7fa377abf2bc56f959ba66125146c465cbee
// @DATE:Tue Oct 21 17:48:39 IDT 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_Application_preflight1_route = Route("OPTIONS", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("path", """.+""",false))))
private[this] lazy val controllers_Application_preflight1_invoker = createInvoker(
controllers.Application.preflight(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "preflight", Seq(classOf[String]),"OPTIONS", """""", Routes.prefix + """$path<.+>"""))
        

// @LINE:11
private[this] lazy val controllers_Application_newPage2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test"))))
private[this] lazy val controllers_Application_newPage2_invoker = createInvoker(
controllers.Application.newPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "newPage", Nil,"GET", """""", Routes.prefix + """test"""))
        

// @LINE:15
private[this] lazy val controllers_Assets_at3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:18
private[this] lazy val controllers_MemberController_insertMember4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("member"))))
private[this] lazy val controllers_MemberController_insertMember4_invoker = createInvoker(
controllers.MemberController.insertMember(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "insertMember", Nil,"POST", """""", Routes.prefix + """member"""))
        

// @LINE:19
private[this] lazy val controllers_MemberController_updateMember5_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("member"))))
private[this] lazy val controllers_MemberController_updateMember5_invoker = createInvoker(
controllers.MemberController.updateMember(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "updateMember", Nil,"PUT", """""", Routes.prefix + """member"""))
        

// @LINE:20
private[this] lazy val controllers_MemberController_getAllMembers6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("members"))))
private[this] lazy val controllers_MemberController_getAllMembers6_invoker = createInvoker(
controllers.MemberController.getAllMembers(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "getAllMembers", Nil,"GET", """""", Routes.prefix + """members"""))
        

// @LINE:21
private[this] lazy val controllers_MemberController_getMemberByEmail7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("member/email/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_MemberController_getMemberByEmail7_invoker = createInvoker(
controllers.MemberController.getMemberByEmail(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "getMemberByEmail", Seq(classOf[String]),"GET", """""", Routes.prefix + """member/email/$email<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_MemberController_getMemberById8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("member/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_MemberController_getMemberById8_invoker = createInvoker(
controllers.MemberController.getMemberById(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "getMemberById", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """member/id/$id<[^/]+>"""))
        

// @LINE:23
private[this] lazy val controllers_MemberController_deleteMember9_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("members/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_MemberController_deleteMember9_invoker = createInvoker(
controllers.MemberController.deleteMember(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "deleteMember", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """members/$id<[^/]+>"""))
        

// @LINE:24
private[this] lazy val controllers_MemberController_login10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("member/login"))))
private[this] lazy val controllers_MemberController_login10_invoker = createInvoker(
controllers.MemberController.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MemberController", "login", Nil,"GET", """""", Routes.prefix + """member/login"""))
        

// @LINE:28
private[this] lazy val controllers_LocationController_insertLocation11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("location"))))
private[this] lazy val controllers_LocationController_insertLocation11_invoker = createInvoker(
controllers.LocationController.insertLocation(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "insertLocation", Nil,"POST", """""", Routes.prefix + """location"""))
        

// @LINE:29
private[this] lazy val controllers_LocationController_updateLocation12_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("location"))))
private[this] lazy val controllers_LocationController_updateLocation12_invoker = createInvoker(
controllers.LocationController.updateLocation(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "updateLocation", Nil,"PUT", """""", Routes.prefix + """location"""))
        

// @LINE:30
private[this] lazy val controllers_LocationController_getAllLocations13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("locations"))))
private[this] lazy val controllers_LocationController_getAllLocations13_invoker = createInvoker(
controllers.LocationController.getAllLocations(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "getAllLocations", Nil,"GET", """""", Routes.prefix + """locations"""))
        

// @LINE:31
private[this] lazy val controllers_LocationController_getLocationsByName14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("location/name/"),DynamicPart("name", """[^/]+""",true))))
private[this] lazy val controllers_LocationController_getLocationsByName14_invoker = createInvoker(
controllers.LocationController.getLocationsByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "getLocationsByName", Seq(classOf[String]),"GET", """""", Routes.prefix + """location/name/$name<[^/]+>"""))
        

// @LINE:32
private[this] lazy val controllers_LocationController_getLocationByCode15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("location/code/"),DynamicPart("code", """[^/]+""",true))))
private[this] lazy val controllers_LocationController_getLocationByCode15_invoker = createInvoker(
controllers.LocationController.getLocationByCode(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "getLocationByCode", Seq(classOf[String]),"GET", """""", Routes.prefix + """location/code/$code<[^/]+>"""))
        

// @LINE:33
private[this] lazy val controllers_LocationController_getLocation16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("location/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_LocationController_getLocation16_invoker = createInvoker(
controllers.LocationController.getLocation(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "getLocation", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """location/id/$id<[^/]+>"""))
        

// @LINE:34
private[this] lazy val controllers_LocationController_deleteLocation17_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("location/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_LocationController_deleteLocation17_invoker = createInvoker(
controllers.LocationController.deleteLocation(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "deleteLocation", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """location/$id<[^/]+>"""))
        

// @LINE:35
private[this] lazy val controllers_LocationController_generateLocationCode18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("location/updatecode/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_LocationController_generateLocationCode18_invoker = createInvoker(
controllers.LocationController.generateLocationCode(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.LocationController", "generateLocationCode", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """location/updatecode/$id<[^/]+>"""))
        

// @LINE:37
private[this] lazy val controllers_ActivityController_insertActivity19_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activity"))))
private[this] lazy val controllers_ActivityController_insertActivity19_invoker = createInvoker(
controllers.ActivityController.insertActivity(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityController", "insertActivity", Nil,"POST", """""", Routes.prefix + """activity"""))
        

// @LINE:38
private[this] lazy val controllers_ActivityController_updateActivity20_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activity"))))
private[this] lazy val controllers_ActivityController_updateActivity20_invoker = createInvoker(
controllers.ActivityController.updateActivity(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityController", "updateActivity", Nil,"PUT", """""", Routes.prefix + """activity"""))
        

// @LINE:39
private[this] lazy val controllers_ActivityController_getAllActivities21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activities"))))
private[this] lazy val controllers_ActivityController_getAllActivities21_invoker = createInvoker(
controllers.ActivityController.getAllActivities(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityController", "getAllActivities", Nil,"GET", """""", Routes.prefix + """activities"""))
        

// @LINE:40
private[this] lazy val controllers_ActivityController_getActivity22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activity/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ActivityController_getActivity22_invoker = createInvoker(
controllers.ActivityController.getActivity(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityController", "getActivity", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """activity/$id<[^/]+>"""))
        

// @LINE:41
private[this] lazy val controllers_ActivityController_deleteActivity23_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activity/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ActivityController_deleteActivity23_invoker = createInvoker(
controllers.ActivityController.deleteActivity(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityController", "deleteActivity", Seq(classOf[Integer]),"DELETE", """""", Routes.prefix + """activity/$id<[^/]+>"""))
        

// @LINE:44
private[this] lazy val controllers_ActivityTypeController_insertActivityType24_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activityType"))))
private[this] lazy val controllers_ActivityTypeController_insertActivityType24_invoker = createInvoker(
controllers.ActivityTypeController.insertActivityType(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "insertActivityType", Nil,"POST", """""", Routes.prefix + """activityType"""))
        

// @LINE:45
private[this] lazy val controllers_ActivityTypeController_updateActivityType25_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activityType"))))
private[this] lazy val controllers_ActivityTypeController_updateActivityType25_invoker = createInvoker(
controllers.ActivityTypeController.updateActivityType(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "updateActivityType", Nil,"PUT", """""", Routes.prefix + """activityType"""))
        

// @LINE:46
private[this] lazy val controllers_ActivityTypeController_getAllActivityTypes26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activityTypes"))))
private[this] lazy val controllers_ActivityTypeController_getAllActivityTypes26_invoker = createInvoker(
controllers.ActivityTypeController.getAllActivityTypes(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "getAllActivityTypes", Nil,"GET", """""", Routes.prefix + """activityTypes"""))
        

// @LINE:47
private[this] lazy val controllers_ActivityTypeController_getActivityType27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activityType/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ActivityTypeController_getActivityType27_invoker = createInvoker(
controllers.ActivityTypeController.getActivityType(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "getActivityType", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """activityType/$id<[^/]+>"""))
        

// @LINE:48
private[this] lazy val controllers_ActivityTypeController_activateActivityType28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activityType/"),DynamicPart("id", """[^/]+""",true),StaticPart("/activate"))))
private[this] lazy val controllers_ActivityTypeController_activateActivityType28_invoker = createInvoker(
controllers.ActivityTypeController.activateActivityType(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "activateActivityType", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """activityType/$id<[^/]+>/activate"""))
        

// @LINE:49
private[this] lazy val controllers_ActivityTypeController_inactivateActivityType29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("activityType/"),DynamicPart("id", """[^/]+""",true),StaticPart("/inactivate"))))
private[this] lazy val controllers_ActivityTypeController_inactivateActivityType29_invoker = createInvoker(
controllers.ActivityTypeController.inactivateActivityType(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ActivityTypeController", "inactivateActivityType", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """activityType/$id<[^/]+>/inactivate"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""OPTIONS""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$path<.+>""","""controllers.Application.preflight(path:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test""","""controllers.Application.newPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """member""","""controllers.MemberController.insertMember()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """member""","""controllers.MemberController.updateMember()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """members""","""controllers.MemberController.getAllMembers()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """member/email/$email<[^/]+>""","""controllers.MemberController.getMemberByEmail(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """member/id/$id<[^/]+>""","""controllers.MemberController.getMemberById(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """members/$id<[^/]+>""","""controllers.MemberController.deleteMember(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """member/login""","""controllers.MemberController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """location""","""controllers.LocationController.insertLocation()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """location""","""controllers.LocationController.updateLocation()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """locations""","""controllers.LocationController.getAllLocations()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """location/name/$name<[^/]+>""","""controllers.LocationController.getLocationsByName(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """location/code/$code<[^/]+>""","""controllers.LocationController.getLocationByCode(code:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """location/id/$id<[^/]+>""","""controllers.LocationController.getLocation(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """location/$id<[^/]+>""","""controllers.LocationController.deleteLocation(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """location/updatecode/$id<[^/]+>""","""controllers.LocationController.generateLocationCode(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activity""","""controllers.ActivityController.insertActivity()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activity""","""controllers.ActivityController.updateActivity()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activities""","""controllers.ActivityController.getAllActivities()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activity/$id<[^/]+>""","""controllers.ActivityController.getActivity(id:Integer)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activity/$id<[^/]+>""","""controllers.ActivityController.deleteActivity(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activityType""","""controllers.ActivityTypeController.insertActivityType()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activityType""","""controllers.ActivityTypeController.updateActivityType()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activityTypes""","""controllers.ActivityTypeController.getAllActivityTypes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activityType/$id<[^/]+>""","""controllers.ActivityTypeController.getActivityType(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activityType/$id<[^/]+>/activate""","""controllers.ActivityTypeController.activateActivityType(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """activityType/$id<[^/]+>/inactivate""","""controllers.ActivityTypeController.inactivateActivityType(id:Integer)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:8
case controllers_Application_preflight1_route(params) => {
   call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_preflight1_invoker.call(controllers.Application.preflight(path))
   }
}
        

// @LINE:11
case controllers_Application_newPage2_route(params) => {
   call { 
        controllers_Application_newPage2_invoker.call(controllers.Application.newPage())
   }
}
        

// @LINE:15
case controllers_Assets_at3_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:18
case controllers_MemberController_insertMember4_route(params) => {
   call { 
        controllers_MemberController_insertMember4_invoker.call(controllers.MemberController.insertMember())
   }
}
        

// @LINE:19
case controllers_MemberController_updateMember5_route(params) => {
   call { 
        controllers_MemberController_updateMember5_invoker.call(controllers.MemberController.updateMember())
   }
}
        

// @LINE:20
case controllers_MemberController_getAllMembers6_route(params) => {
   call { 
        controllers_MemberController_getAllMembers6_invoker.call(controllers.MemberController.getAllMembers())
   }
}
        

// @LINE:21
case controllers_MemberController_getMemberByEmail7_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_MemberController_getMemberByEmail7_invoker.call(controllers.MemberController.getMemberByEmail(email))
   }
}
        

// @LINE:22
case controllers_MemberController_getMemberById8_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MemberController_getMemberById8_invoker.call(controllers.MemberController.getMemberById(id))
   }
}
        

// @LINE:23
case controllers_MemberController_deleteMember9_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_MemberController_deleteMember9_invoker.call(controllers.MemberController.deleteMember(id))
   }
}
        

// @LINE:24
case controllers_MemberController_login10_route(params) => {
   call { 
        controllers_MemberController_login10_invoker.call(controllers.MemberController.login())
   }
}
        

// @LINE:28
case controllers_LocationController_insertLocation11_route(params) => {
   call { 
        controllers_LocationController_insertLocation11_invoker.call(controllers.LocationController.insertLocation())
   }
}
        

// @LINE:29
case controllers_LocationController_updateLocation12_route(params) => {
   call { 
        controllers_LocationController_updateLocation12_invoker.call(controllers.LocationController.updateLocation())
   }
}
        

// @LINE:30
case controllers_LocationController_getAllLocations13_route(params) => {
   call { 
        controllers_LocationController_getAllLocations13_invoker.call(controllers.LocationController.getAllLocations())
   }
}
        

// @LINE:31
case controllers_LocationController_getLocationsByName14_route(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LocationController_getLocationsByName14_invoker.call(controllers.LocationController.getLocationsByName(name))
   }
}
        

// @LINE:32
case controllers_LocationController_getLocationByCode15_route(params) => {
   call(params.fromPath[String]("code", None)) { (code) =>
        controllers_LocationController_getLocationByCode15_invoker.call(controllers.LocationController.getLocationByCode(code))
   }
}
        

// @LINE:33
case controllers_LocationController_getLocation16_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_LocationController_getLocation16_invoker.call(controllers.LocationController.getLocation(id))
   }
}
        

// @LINE:34
case controllers_LocationController_deleteLocation17_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_LocationController_deleteLocation17_invoker.call(controllers.LocationController.deleteLocation(id))
   }
}
        

// @LINE:35
case controllers_LocationController_generateLocationCode18_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_LocationController_generateLocationCode18_invoker.call(controllers.LocationController.generateLocationCode(id))
   }
}
        

// @LINE:37
case controllers_ActivityController_insertActivity19_route(params) => {
   call { 
        controllers_ActivityController_insertActivity19_invoker.call(controllers.ActivityController.insertActivity())
   }
}
        

// @LINE:38
case controllers_ActivityController_updateActivity20_route(params) => {
   call { 
        controllers_ActivityController_updateActivity20_invoker.call(controllers.ActivityController.updateActivity())
   }
}
        

// @LINE:39
case controllers_ActivityController_getAllActivities21_route(params) => {
   call { 
        controllers_ActivityController_getAllActivities21_invoker.call(controllers.ActivityController.getAllActivities())
   }
}
        

// @LINE:40
case controllers_ActivityController_getActivity22_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ActivityController_getActivity22_invoker.call(controllers.ActivityController.getActivity(id))
   }
}
        

// @LINE:41
case controllers_ActivityController_deleteActivity23_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ActivityController_deleteActivity23_invoker.call(controllers.ActivityController.deleteActivity(id))
   }
}
        

// @LINE:44
case controllers_ActivityTypeController_insertActivityType24_route(params) => {
   call { 
        controllers_ActivityTypeController_insertActivityType24_invoker.call(controllers.ActivityTypeController.insertActivityType())
   }
}
        

// @LINE:45
case controllers_ActivityTypeController_updateActivityType25_route(params) => {
   call { 
        controllers_ActivityTypeController_updateActivityType25_invoker.call(controllers.ActivityTypeController.updateActivityType())
   }
}
        

// @LINE:46
case controllers_ActivityTypeController_getAllActivityTypes26_route(params) => {
   call { 
        controllers_ActivityTypeController_getAllActivityTypes26_invoker.call(controllers.ActivityTypeController.getAllActivityTypes())
   }
}
        

// @LINE:47
case controllers_ActivityTypeController_getActivityType27_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ActivityTypeController_getActivityType27_invoker.call(controllers.ActivityTypeController.getActivityType(id))
   }
}
        

// @LINE:48
case controllers_ActivityTypeController_activateActivityType28_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ActivityTypeController_activateActivityType28_invoker.call(controllers.ActivityTypeController.activateActivityType(id))
   }
}
        

// @LINE:49
case controllers_ActivityTypeController_inactivateActivityType29_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ActivityTypeController_inactivateActivityType29_invoker.call(controllers.ActivityTypeController.inactivateActivityType(id))
   }
}
        
}

}
     