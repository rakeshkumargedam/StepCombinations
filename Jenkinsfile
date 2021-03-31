pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo "Test Message"
                sh "export M2_HOME=/d/tool/apache-maven-3.3.9"
                sh "export PATH=$PATH:$M2_HOME/bin"
                sh "mvn -version"

            }
        }
    }
}
