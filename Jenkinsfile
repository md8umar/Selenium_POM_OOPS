pipeline {
    agent any
    tools {
            maven 'LocalMaven'
            jdk 'localJDK'
        }

    stages {
        stage ('Test') {
            steps {
                sh 'mvn clean test'
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
                            results: [[path: 'target/allure-results']]
                    ])
            }
            }
        }
    }
}