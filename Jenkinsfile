pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo "Test Message"
                echo "%M2_HOME%"
                bat "mvn -version"

            }
        }
    }
}
