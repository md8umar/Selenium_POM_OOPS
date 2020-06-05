pipeline{
    agent any
    stages {
        stage ('Compile'){
                sh 'mvn clean compile'

        }
        stage ('Test'){
                sh 'mvn test'
            }
    }
}