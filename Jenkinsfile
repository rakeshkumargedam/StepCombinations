pipeline {
    agent any
    stages {
        stage('maven') {
            steps {
                echo "************ Maven Clean Started **********"
                withMaven {
                    bat "mvn clean install "
                }
                echo "************ Maven Clean Completed **********"

            }
        }
        stage('gradle') {
            steps {
                 echo "************ Gradle Clean Started **********"
                withGradle {
                    bat "gradle clean build"
                }
                echo "************ Gradle Clean Completed **********"

            }
        }
       stage('docker_test') {
            steps {
                 echo "************ Docker Test Started **********"

                    bat "docker info"
                echo "************ Docker  Test Completed **********"
				
				echo "****************** Docker login Started ****************"
					bat "docker login --username=sitaramjiamit --password=devopsamit"
				echo "****************** Docker login Completed ****************"
				echo "***************Docker build Started ***************"
					bat "docker build -t sitaramjiamit/dockertest:step_1.0.0 ."
				echo "***************Docker build Completed ***************"
				echo "***************Docker push Started ***************"
					bat "docker push sitaramjiamit/dockertest:step_1.0.0 "
				echo "***************Docker push Completed ***************"
				echo "*************** Docker logs Started ****************"
				     bat "docker logs 79e10d57c1d8 "
                echo "**************** Docker logs Started ***************"
				echo "*************** Docker Run Started ****************"
				     bat "docker Run -d 79e10d57c1d8 "
                echo "**************** Docker Run Started ***************"
				
					
             }

		}
    }
}
