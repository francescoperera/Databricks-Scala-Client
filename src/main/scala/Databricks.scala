import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer

import scala.concurrent.ExecutionContext

object Databricks {

  implicit val system = ActorSystem("dbs-client")
  implicit val materializer = ActorMaterializer()
  implicit val executionContext: ExecutionContext = system.dispatcher

  this = Http(system)

  //def endopoint 1 = http.single request ( uri + endpoint +request type + auth stuff)

}


