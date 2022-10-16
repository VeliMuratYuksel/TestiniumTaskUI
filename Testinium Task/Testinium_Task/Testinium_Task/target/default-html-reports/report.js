$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/task.feature");
formatter.feature({
  "name": "Testinium Task",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Task Steps",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "www.beymen.com sitesi açılır",
  "keyword": "Given "
});
formatter.match({
  "location": "com.beymen.step_definitions.SearchStepDef.www_beymen_com_sitesi_açılır()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ana sayfanın açıldığı kontrol edilir",
  "keyword": "And "
});
formatter.match({
  "location": "com.beymen.step_definitions.SearchStepDef.ana_sayfanın_açıldığı_kontrol_edilir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Arama kutucuğuna \u0027şort\u0027 kelimesi girilir",
  "keyword": "When "
});
formatter.match({
  "location": "com.beymen.step_definitions.SearchStepDef.arama_kutucuğuna_kelimesi_girilir(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Arama kutucuğuna girilen sort kelimesi silinir",
  "keyword": "And "
});
formatter.match({
  "location": "com.beymen.step_definitions.SearchStepDef.arama_kutucuğuna_girilen_sort_kelimesi_silinir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Arama kutucuğuna bu kez \u0027gömlek\u0027 kelimesi girilir",
  "keyword": "When "
});
formatter.match({
  "location": "com.beymen.step_definitions.SearchStepDef.arama_kutucuğuna_ikinci_kelimesi_girilir(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Klavye üzerinden enter tuşuna basılır",
  "keyword": "And "
});
formatter.match({
  "location": "com.beymen.step_definitions.SearchStepDef.klavye_üzerinden_enter_tuşuna_basılır()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir",
  "keyword": "And "
});
formatter.match({
  "location": "com.beymen.step_definitions.SearchStepDef.sonuca_göre_sergilenen_ürünlerden_rastgele_bir_ürün_seçilir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seçilen ürün sepete eklenir",
  "keyword": "And "
});
formatter.match({
  "location": "com.beymen.step_definitions.SearchStepDef.seçilen_ürün_sepete_eklenir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adet arttırılarak ürün adedinin 2 olduğu doğrulanır",
  "keyword": "Then "
});
formatter.match({
  "location": "com.beymen.step_definitions.SearchStepDef.adet_arttırılarak_ürün_adedinin_olduğu_doğrulanır(java.lang.String)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Could not invoke step [Adet arttırılarak ürün adedinin {int} olduğu doğrulanır] defined at \u0027com.beymen.step_definitions.SearchStepDef.adet_arttırılarak_ürün_adedinin_olduğu_doğrulanır(java.lang.String)\u0027.\nIt appears there was a problem with the step definition.\nThe converted arguments types were (java.lang.Integer)\n\nThe details are in the stacktrace below.\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.couldNotInvokeStep(PickleStepDefinitionMatch.java:81)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:65)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\nCaused by: io.cucumber.core.backend.CucumberBackendException: Failed to invoke public void com.beymen.step_definitions.SearchStepDef.adet_arttırılarak_ürün_adedinin_olduğu_doğrulanır(java.lang.String)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:29)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\t... 32 more\r\nCaused by: java.lang.IllegalArgumentException: argument type mismatch\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\t... 34 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Ürün sepetten silinerek sepetin boş olduğu kontrol edilir",
  "keyword": "Then "
});
formatter.match({
  "location": "com.beymen.step_definitions.SearchStepDef.ürün_sepetten_silinerek_sepetin_boş_olduğu_kontrol_edilir()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});