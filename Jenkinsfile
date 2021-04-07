node('windows') {
    stages {
        stage('maven') {
            steps {
                echo "************ Maven Clean Started **********"
                withMaven {
                    bat (mvn clean install)
                }
                echo "************ Maven Clean Completed **********"

            }
        }
		}
		}

