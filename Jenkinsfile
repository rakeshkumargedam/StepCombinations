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
					bat "docker build -t sitaramjiamit/dockertest:step_2.0.0 ."
				echo "***************Docker build Completed ***************"
				echo "***************Docker push Started ***************"
					bat "docker push sitaramjiamit/dockertest:step_2.0.0 "
				echo "***************Docker push Completed ***************"
				echo "*************** Docker logs Started ****************"
				script {
				  currentImage = bat "docker images --filter=reference=sitaramjiamit/dockertest:step_2.0.0 --quiet"
				  }
				  echo currentImage
				  echo %currentImage%
                echo "**************** Docker logs Completed  ***************"
						
             }

		}
    }
}
