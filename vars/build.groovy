def call(String mavenGoal){
  
  if ("${mavenGoal}" == "Clean")
     {
       sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/TrustBankBuildTool/bin/mvn clean"
     }
  else if ("${mavenGoal}" == "Compile")
     {
       sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/TrustBankBuildTool/bin/mvn clean compile"
     }
  else if ("${mavenGoal}" == "Test")
     {
       sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/TrustBankBuildTool/bin/mvn clean test"
     }
   else if ("${mavenGoal}" == "Package")
      {
        sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/TrustBankBuildTool/bin/mvn clean package"
     }
}
