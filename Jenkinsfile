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
        
