pipeline {
    agent any
    stages {
        stage ('Compile Stage') {
            steps{
                echo 'cleaning..'
                withGradle() {
                    sh './gradlew clean'
                }
            }
        }

        stage ('Test Stage') {
             steps{
                echo 'testing..'
                withGradle() {
                sh './gradlew test'
                }
             }
        }

        stage ('Deploy Stage') {
             steps{
                echo 'build...'
                sh './gradlew build'
             }
        }
    }
}