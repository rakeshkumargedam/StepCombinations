pipeline {
    agent any
    stages {
        stage('clean') {
            steps {
                echo "Test Message"
                withMaven {
                    bat "mvn clean"
                }

            }
        }
        stage('build') {
              steps { 
                  withmaven {
                      bat "mvn install"
                  }
              }
              }
    }
}
