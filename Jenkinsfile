pipeline {
    agent any
    tools {
            maven 'Maven 3.5.4'
            jdk 'jdk8'
        }

    stages {
        stage ('Build') {
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