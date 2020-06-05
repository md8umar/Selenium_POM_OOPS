pipeline{
    agent any
    stages {
        stage ('Compile'){
            withMaven(maven:'LocalMaven'){
                sh 'mvn clean compile'
            }
        }
        stage ('Test'){
            withMaven(maven:'LocalMaven'){
                sh 'mvn test'
                }
            }
    }
}