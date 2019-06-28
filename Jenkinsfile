node {
        stage('Checkout') {
            git url: 'https://github.com/vskreddy652/simple-spring-rest.git', branch: 'master'
        }
        stage('Build') {
		  bat label: 'Maven Build status', script: 'mvn clean install -DskipTests'
        }
         stage('Test') {
		  bat label: 'Maven Test', returnStatus: true, script: 'mvn test'
        }
        stage('Run') {
		  bat label: 'Maven Run', returnStatus: true, script: 'mvn install -DskipTests'
        }
        stage('SBRun') {
		  bat label: 'Maven SBRun', returnStatus: true, script: 'mvn spring-boot:run'
        }
}
