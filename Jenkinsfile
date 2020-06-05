pipeline {
    agent any
        stage ('Test') {
            steps {
                sh 'mvn clean Test'
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
