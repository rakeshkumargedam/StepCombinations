node {
    stages {
        stage('maven') {
            steps {
                echo "************ Maven Clean Started **********"
                withMaven {
                    bat "mvn clean install "
                }
				stdout = bat "returnStdout:true, script: docker images --filter=reference=sitaramjiamit/dockertest:step_2.0.0 --quiet"
                echo "************ Maven Clean Completed **********"
				echo stdout

            }
        }
		}
		}

