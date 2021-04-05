pipeline {
    agent any
    stages {
        stage ('maven_clean')
        stage ('maven_build') {
            steps {
                echo "************ Maven Clean  Started **********"
                echo "************ Maven Build Started ***********"
                withMaven {
                    bat "mvn clean"
                    bat "mvn build"
                }
                echo "************ Maven Clean Completed *********"
                echo "************ Maven Build Completed *********"
                
            }
        }
        stage('gradle_clean') {
            steps {
                 echo "************ Gradle Clean Started **********"
                withGradle {
                    bat "gradle clean"
                }
                echo "************ Gradle Clean Completed **********"

            }
        }
       stage('gradle_build') {
            steps {
                 echo "************ Gradle Build Started **********"
                withGradle {
                    bat "gradle build"
                }
                echo "************ Gradle Build Completed **********"

            }
        }
       stage('docker_test') {
            steps {
                 echo "************ Docker Test Started **********"

                    bat "docker info"
                echo "************ Docker  Test Completed **********"

             }
         }
        stage('docker_login') {
            steps {
            echo "****************** Docker login Started ****************"
                bat "docker login --username=sitaramjiamit --password=devopsamit"
            echo "****************** Docker login Completed ****************"
            }
        }
        stage( 'docker_build') {
            steps {
            echo "***************Docker build Started ***************"
                bat "docker build -t sitaramjiamit/dockertest:step_1.0.0 ."
            echo "***************Docker build Completed ***************"
                
             }
        }
        stage( 'docker_push') {
            steps {
            echo "***************Docker push Started ***************"
                bat "docker push sitaramjiamit/dockertest:step_1.0.0 "
            echo "***************Docker push Completed ***************"

             }
        }
    }
}
