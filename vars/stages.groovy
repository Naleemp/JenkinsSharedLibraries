def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/TrustBankBuildTool/bin/mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/TrustBankBuildTool/bin/mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/TrustBankBuildTool/bin/mvn clean deploy"
     }
}
