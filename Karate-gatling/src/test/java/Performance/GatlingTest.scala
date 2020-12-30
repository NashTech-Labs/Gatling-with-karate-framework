package Performance

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation


class GatlingTest extends Simulation{

  val getTest = scenario("get the test feature file").exec(karateFeature("classpath:Performance/sample.feature"))

  setUp(getTest.inject(atOnceUsers(users = 1)))

}