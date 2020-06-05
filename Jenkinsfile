pipeline {
    agent any
    tools {
            maven 'LocalMaven'
        }

    stages {
        stage ('Test') {
            steps {
                sh 'mvn clean install -DskipTests=true'
            }
        }
        stage('reports') {
            steps {
            script {
                    allure([
                            includeProperties: false,
                            jdk: '',
                            properties: [],
                            reportBuildPolicy: 'ALWAYS',
                            results: [[path: '/allure-results']]
                    ])
            }
            }
        }
    }
}