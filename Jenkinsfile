pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo "Test Message"
                withMaven {
                    bat "mvn clean"
                }

            }
        }
    }
}
