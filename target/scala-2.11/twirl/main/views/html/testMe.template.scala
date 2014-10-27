
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object testMe extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/hello.js")),format.raw/*10.63*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*13.10*/Html(content)),format.raw/*13.23*/("""
    """),format.raw/*14.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:String): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Sep 30 18:31:36 IDT 2014
                  SOURCE: C:/Users/Yishai/git/btdt/app/views/testMe.scala.html
                  HASH: f38bd2b0b7079336285b8c662f00569c471bc04d
                  MATRIX: 731->1|851->33|879->35|956->86|981->91|1069->153|1083->159|1137->193|1224->254|1238->260|1290->292|1342->317|1357->323|1412->357|1506->424|1540->437|1572->442
                  LINES: 26->1|29->1|31->3|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|42->14
                  -- GENERATED --
              */
          