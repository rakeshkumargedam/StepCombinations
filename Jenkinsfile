pipeline {
    agent any
    stages {
        stage('maven_clean') {
            steps {
                echo "************ Maven Clean Started **********"
                withMaven {
                    bat "mvn clean"
                }
                echo "************ Maven Clean Completed **********"

            }
        }
        stage('maven_build') {
            steps {
                 echo "************ Maven Build Started **********"
                withMaven {
                    bat "mvn clean"
                }
                echo "************ Maven Build Completed **********"

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
            }
        }
        stage( 'docker_build') {
            steps {
            scho "***************Docker build Started ***************"
                bat "docker build "
                
       }
}
