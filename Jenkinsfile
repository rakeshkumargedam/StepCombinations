pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo "Test Message"
                echo "%M2_HOME%"
                bat "SET M2_HOME=D:/tool/apache-maven-3.3.9"
                bat "SET PATH= %PATH%/%M2_HOME%"
                bat "mvn -version"

            }
        }
    }
}
